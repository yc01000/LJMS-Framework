package com.lj.sso.ssocore.filter;

import com.google.gson.Gson;
import com.lj.sso.ssocore.model.SsoAuthenticationToken;
import com.lj.sso.ssocore.model.UserInfoVO;
import com.lj.sso.ssocore.service.OAuthClientService;
import com.lj.sso.ssocore.util.BinderUtils;
import com.lj.sso.ssocore.util.PEMUtils;
import com.lj.sso.ssocore.util.SsoConstants;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.RSAEncrypter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
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
import java.nio.charset.StandardCharsets;
import java.security.interfaces.RSAPublicKey;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
public class SSOAuthenticationFilter extends OncePerRequestFilter {

	private final static Logger LOGGER = LoggerFactory.getLogger(SSOAuthenticationFilter.class);

	@Autowired
	private OAuthClientService oauthClientService;

	@Value("${server.scheme}://${server.name}")
	String serverEndpoint;

	@Value("${sso.redirect-path}")
	String redirectPath;

	@Value("${sso.policies.default-return-uri}")
	private String defaultReturnUri;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		LOGGER.info("+|{}", request.getAttribute("rid"));

		// SSO로부터 redirect된 path가 아니면 리턴
		if(!StringUtils.startsWithIgnoreCase(request.getRequestURI(), redirectPath)) {
			LOGGER.info("-|{}|/sso/callback이 아님", request.getAttribute("rid"));
			filterChain.doFilter(request, response);
			return;
		}

		String remoteIp = getRemoteAddr(request);
		String query = BinderUtils.chompString(request.getQueryString());
		LOGGER.info("+|{}|/sso/callback|ip: {}, query: {}", request.getAttribute("rid"), remoteIp, query);

		String returnUrl = BinderUtils.chompString(request.getParameter("returnUrl"));
		if(StringUtils.isBlank(returnUrl)) {
			if(StringUtils.isNotBlank(request.getParameter("state"))) {
				returnUrl = new String(Base64.getDecoder().decode(request.getParameter("state")));
			}
		}
		if(StringUtils.isBlank(returnUrl)) {
			returnUrl = defaultReturnUri;
		}
		if(StringUtils.startsWithIgnoreCase(returnUrl, "/")) {
			returnUrl = serverEndpoint + returnUrl;
		}
		LOGGER.info("{}|return url is replaced with return url: {}", request.getAttribute("rid"), returnUrl);

		// /sso/callback으로 접근했지만, 이미 principal이 있을 경우 리턴
		HttpSession session = request.getSession(false);
		if(session != null) {
			SecurityContext context = (SecurityContext) session.getAttribute(SsoConstants.SPRING_SECURITY_CONTEXT);
			if(context != null) {
				Authentication authentication = context.getAuthentication();
				if(authentication != null) {
					LOGGER.info("-|{}|이미 정상 사용자로 인증되고, 해당 시스템 내 세션에 사용자 정보가 존재하는 경우는 Bypass (정상 사용자 처리)", request.getAttribute("rid"));
					new DefaultRedirectStrategy().sendRedirect(request, response, returnUrl);
					return;
				}
			}
		}

		String code = BinderUtils.chompString(request.getParameter("code"));
		if(StringUtils.isBlank(code)) {
			LOGGER.error("-|{}|empty authorization code", request.getAttribute("rid"));
			filterChain.doFilter(request, response);
			return;
		}

		// access token
		String tokenResponse = oauthClientService.requestAccessToken(code);
		LOGGER.info("{}|token: {}", request.getAttribute("rid"), tokenResponse);
		if(StringUtils.isBlank(tokenResponse)) {
			LOGGER.error("-|{}|empty access token", request.getAttribute("rid"));
			filterChain.doFilter(request, response);
			return;
		}

		String accessToken = null;
		try {
			accessToken = (String) new Gson().fromJson(tokenResponse, HashMap.class).get("access_token");
		} catch(Exception e) {
			LOGGER.error("-|{}|토큰 파싱 중 실패|{}", request.getAttribute("rid"), ExceptionUtils.getStackTrace(e));
			filterChain.doFilter(request, response);
			return;
		}
		if(StringUtils.isBlank(accessToken)) {
			LOGGER.error("-|{}|액세스 토큰 없음으로 인한 실패", request.getAttribute("rid"));
			filterChain.doFilter(request, response);
			return;
		}

		// userinfo
		String userinfoResponse = oauthClientService.requestUserInfo(accessToken);
		LOGGER.info("{}|userinfo: {}", request.getAttribute("rid"), userinfoResponse);
		if(StringUtils.isBlank(userinfoResponse)) {
			LOGGER.error("-|{}|empty userinfo", request.getAttribute("rid"));
			filterChain.doFilter(request, response);
			return;
		} else if(StringUtils.containsIgnoreCase(userinfoResponse, "error")) {
			Map<String, String> errorResponse = new Gson().fromJson(userinfoResponse, HashMap.class);
			String error = errorResponse.get("error");
			String errorDescription = errorResponse.get("error_description");
			LOGGER.error("-|{}|사용자 정보 조회 실패: {} {}", request.getAttribute("rid"), error, errorDescription);
			filterChain.doFilter(request, response);
			return;
		}

		// security context
		AbstractAuthenticationToken authentication = null;
		try {
			UserInfoVO userInfo = new Gson().fromJson(userinfoResponse, UserInfoVO.class);
			userInfo.setLoginTm(new Date());
			userInfo.setLoginIp(getRemoteAddr(request));
			userInfo.setLoginChnlCd("PCW");
			authentication = new SsoAuthenticationToken(userInfo.getAuthorities(), userInfo);
		} catch (Exception e) {
			LOGGER.error("-|{}|사용자 정보 파싱 중 실패|{}", request.getAttribute("rid"), ExceptionUtils.getStackTrace(e));
			filterChain.doFilter(request, response);
			return;
		}

		SecurityContext context = SecurityContextHolder.getContext();
		context.setAuthentication(authentication);

		// 세션이 없으면, 새 세션 생성
		if(session == null) {
			session	= request.getSession(true);
		}
		session.setAttribute(SsoConstants.SPRING_SECURITY_CONTEXT, context);

		LOGGER.info("-|{}|sign in complete, returning to : {}", request.getAttribute("rid"), returnUrl);

		try {
			JWEHeader jweHeader = new JWEHeader.Builder(JWEAlgorithm.RSA_OAEP_256, EncryptionMethod.A128GCM).build();
			JWEObject jwe = new JWEObject(jweHeader, new Payload(new Gson().toJson(authentication.getPrincipal())));
			jwe.encrypt(new RSAEncrypter((RSAPublicKey) PEMUtils.publicKey("certification/jwt/pubkey.pem")));
			String jweSerialized = jwe.serialize();

			Cookie cookie = new Cookie("testcookie", jweSerialized);
			cookie.setPath("/");
			response.addCookie(cookie);
		} catch(JOSEException e) {
			LOGGER.error("JWE encrypting failed: " + e.getMessage());
		}

		new DefaultRedirectStrategy().sendRedirect(request, response, returnUrl);
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
