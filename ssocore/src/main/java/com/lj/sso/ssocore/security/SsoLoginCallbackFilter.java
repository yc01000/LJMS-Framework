package com.lj.sso.ssocore.security;

import com.google.gson.Gson;
import com.lj.sso.ssocore.common.util.BinderUtils;
import com.lj.sso.ssocore.common.util.SsoConstants;
import com.lj.sso.ssocore.security.vo.UserInfoVO;
import com.lj.sso.ssocore.security.vo.UserTokenVO;
import com.lj.sso.ssocore.service.SsoOAuthService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 
 * <pre>
 * <B>ssoPortal</B>
 *     |_ SsoLoginCallbackFilter.java
 * </pre>
 * 
 *  @author  : WCJUNG
 *  @date    : 2019. 3. 13. 오전 11:36:18 
 *  @version : 1.0
 *  @desc    : 페이지 접근시마다 인증 여부를 확인
 */
public class SsoLoginCallbackFilter extends OncePerRequestFilter {

	private final static Logger LOGGER = LoggerFactory.getLogger(SsoLoginCallbackFilter.class);

	@Autowired
	private SsoOAuthService ssoOAuthService;

	@Value("${sso.default-return-uri}")
	private String defaultReturnUri;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		String uuid = UUID.randomUUID().toString();

		// SSO로부터 redirect된 path가 아니면 리턴
		final String REDIRECT_PATH = "/sso/callback";
		if(!StringUtils.contains(request.getRequestURI(), REDIRECT_PATH)) {
			//LOGGER.info("-|{}|/sso/callback이 아님", uuid);
			filterChain.doFilter(request, response);
			return;
		}

		String remoteIp = getRemoteAddr(request);
		String query = BinderUtils.chompString(request.getQueryString());
		LOGGER.info("+|{}|remote ip: {}, query: {}", uuid, remoteIp, query);

		// /sso/callback으로 접근했지만, 이미 principal이 있을 경우 리턴
		HttpSession session = request.getSession(false);
		if(session != null) {
			SecurityContext context = (SecurityContext) session.getAttribute(SsoConstants.SPRING_SECURITY_CONTEXT);
			if(context != null) {
				Authentication authentication = context.getAuthentication();
				if(authentication != null) {
					LOGGER.info("-|{}|이미 정상 사용자로 인증되고, 해당 시스템 내 세션에 사용자 정보가 존재하는 경우는 Bypass (정상 사용자 처리)", uuid);
					filterChain.doFilter(request, response);
					return;
				}
			}
		}

		String code = BinderUtils.chompString(request.getParameter("code"));
		if(StringUtils.isBlank(code)) {
			LOGGER.error("-|{}|empty authorization code", uuid);
			filterChain.doFilter(request, response);
			return;
		}

		String tokenResponse = ssoOAuthService.requestAccessToken(code);
		LOGGER.info("{}|token: {}", uuid, tokenResponse);
		if(StringUtils.isBlank(tokenResponse)) {
			LOGGER.error("-|{}|empty access token", uuid);
			filterChain.doFilter(request, response);
			return;
		}

		UserTokenVO token = new Gson().fromJson(tokenResponse, UserTokenVO.class);
		if(token == null) {
			LOGGER.error("-|{}|액세스 토큰 없음으로 인한 실패", uuid);
			filterChain.doFilter(request, response);
			return;
		}

		// access token이 있는 경우 사용자 정보 확인
		String userinfoResponse = ssoOAuthService.requestUserInfo(token);
		LOGGER.info("{}|userinfo: {}", uuid, userinfoResponse);
		if(StringUtils.isBlank(userinfoResponse)) {
			LOGGER.error("-|{}|empty userinfo", uuid);
			filterChain.doFilter(request, response);
			return;
		} else if(StringUtils.containsIgnoreCase(userinfoResponse, "error")) {
			Map<String, String> errorResponse = new Gson().fromJson(userinfoResponse, HashMap.class);
			String error = errorResponse.get("error");
			String errorDescription = errorResponse.get("error_description");
			if(StringUtils.equalsIgnoreCase(error, "invalid_token")) {
				if(StringUtils.equalsIgnoreCase(errorDescription, "Access token expired")) {
					token = ssoOAuthService.requestRefreshToken(token);
					if(token == null) {
						LOGGER.error("-|{}|리프레시 토큰을 통한 갱신 실패", uuid);
						filterChain.doFilter(request, response);
						return;
					}
				} else {
					LOGGER.error("-|{}|토큰 만료됨", uuid);
					filterChain.doFilter(request, response);
					return;
				}
			}
			LOGGER.error("-|{}|empty userinfo", uuid);
			filterChain.doFilter(request, response);
			return;
		}

		// authentication 취득
		AbstractAuthenticationToken authentication = authUserByToken(request, userinfoResponse);
		if(authentication == null || authentication.getPrincipal() == null) {
			LOGGER.error("-|{}|authUser is null", uuid);
			filterChain.doFilter(request, response);
			return;
		}

		SecurityContext context = SecurityContextHolder.getContext();
		context.setAuthentication(authentication);

		// 세션이 없으면, 새 세션 생성
		if(session == null) {
			session	= request.getSession(true);
		}
		session.setAttribute(SsoConstants.USER_ACCESS_TOKEN, token);
		session.setAttribute(SsoConstants.SPRING_SECURITY_CONTEXT, context);
		session.setAttribute(SsoConstants.OAUTH_USER_SESSION, authentication.getPrincipal());

		String returnUrl = BinderUtils.chompString(request.getParameter("returnUrl"));
		if(StringUtils.isBlank(returnUrl)) {
			returnUrl = defaultReturnUri;
			LOGGER.info("{}|return url is replaced with default return url: {}", uuid, returnUrl);
		}

		LOGGER.info("-|{}|sign in complete, returning to : {}", uuid, returnUrl);

		new DefaultRedirectStrategy().sendRedirect(request, response, returnUrl);
	}

	private AbstractAuthenticationToken authUserByToken(HttpServletRequest request, String userToken) {
		if (StringUtils.isEmpty(userToken)) {
			return null;
		}

		try {
			UserInfoVO userInfo = new Gson().fromJson(userToken, UserInfoVO.class);

			AbstractAuthenticationToken authUser	= new SsoAuthenticationToken(userInfo.getAuthorities(), userInfo);
			authUser.setAuthenticated(true);

			UserInfoVO principal = (UserInfoVO) authUser.getPrincipal();
			principal.setLoginTm(new Date());
			principal.setLoginIp(getRemoteAddr(request));
			principal.setLoginChnlCd("PCW");

			return authUser;
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		} 

		return null;
	}

	private String getRemoteAddr(HttpServletRequest request) {
		String remoteAddr = request.getHeader("X-FORWARDED-FOR");
		if(StringUtils.isEmpty(remoteAddr)) {
			remoteAddr = request.getRemoteAddr();
		} else if(remoteAddr.contains(",")) {
			remoteAddr = remoteAddr.substring(0, remoteAddr.indexOf(","));
		}
		return remoteAddr;
	}
}
