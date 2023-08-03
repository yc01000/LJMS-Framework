package com.lj.sso.ssocore.security;

import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.Gson;
import jakarta.annotation.Resource;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.filter.OncePerRequestFilter;

import com.lj.sso.ssocore.common.util.BinderUtils;
import com.lj.sso.ssocore.common.util.SsoConstants;
import com.lj.sso.ssocore.common.util.SsoConstants.AccessChannelCode;
import com.lj.sso.ssocore.security.vo.ErrorResponseVO;
import com.lj.sso.ssocore.security.vo.UserInfoVO;
import com.lj.sso.ssocore.security.vo.UserTokenVO;
import com.lj.sso.ssocore.service.SsoOAuthService;

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
	private final static Logger	LOGGER	= LoggerFactory.getLogger(SsoLoginCallbackFilter.class);

	private final static RedirectStrategy	REDIRECT_STRATEGY	= new DefaultRedirectStrategy();

	@Resource
	private ConfigurableWebApplicationContext	appContext;

	@Resource(name="SsoOAuthService")
	private SsoOAuthService ssoOAuthService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) 
		throws ServletException, IOException {
		
		HttpSession		session	= request.getSession(false);
		String	redirectUri = (null == request) ? "" : BinderUtils.chompString(request.getParameter("redirect_uri"));
		String	requestUri	= (null == request) ? "" : BinderUtils.chompString(request.getRequestURI());
		String	referer		= (null != request) ? StringUtils.defaultIfEmpty(request.getHeader("REFERER"), "") : "";
		LOGGER.info("redirectUri is {}, requestUri is {}, referer is {}", redirectUri, requestUri, referer);
		
		SecurityContext	context	= null;
		Authentication	auth	= null;
		
		if (null != session) {
			context	= (SecurityContext)session.getAttribute(SsoConstants.SPRING_SECURITY_CONTEXT);
		}
		
		UserTokenVO accessTokenVO = null;

		if(StringUtils.isNotEmpty(requestUri) && requestUri.contains("sso/callback")) {
			String	queryStr	= (null == request) ? "" : BinderUtils.chompString(StringUtils.defaultIfEmpty(request.getQueryString(), ""));
			String	code	= (null == request) ? "" : BinderUtils.chompString(request.getParameter("code"));
			String	state	= (null == request) ? "" : BinderUtils.chompString(request.getParameter("state"));
			String	returnUrl	= (null == request) ? "" : BinderUtils.chompString(request.getParameter("returnUrl"));
			if(StringUtils.isEmpty(returnUrl)) returnUrl = "/";
			
			LOGGER.debug("Called doFilterInternal : returnUrl - {}, queryStr - {}, code - {}, state - {}, redirectUri - {}", returnUrl, queryStr, code, state, redirectUri);
			
			// oauth callback 처리
			// 이미 정상 사용자로 인증되고, 해당 시스템 내 세션에 사용자 정보가 존재하는 경우는 Bypass (정상 사용자 처리)
			if (null != context) {
				auth	= context.getAuthentication();
	
				if (null != auth) {
					LOGGER.debug("이미 정상 사용자로 인증되고, 해당 시스템 내 세션에 사용자 정보가 존재하는 경우는 Bypass (정상 사용자 처리)");
					filterChain.doFilter(request, response);
					return;
				}
			}
					
			if(StringUtils.isNotEmpty(code) && StringUtils.isNotEmpty(state)) {
				
				String tokenResponse = requestUri.endsWith("/callback") ? ssoOAuthService.requestAccessToken(code) : ssoOAuthService.requestAccessToken(code, requestUri);
				
				if(StringUtils.isEmpty(tokenResponse)) {
					LOGGER.info("Access token 생성 실패", code, state);
				} else {
					// 정상 처리
					if (null == context) {
						context	= SecurityContextHolder.getContext();
					}
	
//					accessTokenVO = JsonUtil.getObjectFromJsonString(tokenResponse, UserTokenVO.class);
					accessTokenVO = new Gson().fromJson(tokenResponse, UserTokenVO.class);
				}
			}
			
			// access token이 있는 경우 사용자 정보 확인
			if(null != accessTokenVO && StringUtils.isNotBlank(accessTokenVO.getAccess_token())) {
				String userToken = ssoOAuthService.requestUserInfo(accessTokenVO);
	
				// 리소스 서버(사용자 정보) 요청시 오류가 있는 경우
				if(userToken.toLowerCase().contains("error")) {
					ErrorResponseVO errorResponse = new ErrorResponseVO();
//					errorResponse = JsonUtil.getObjectFromJsonString(userToken, ErrorResponseVO.class);
					errorResponse = new Gson().fromJson(userToken, ErrorResponseVO.class);
					
					if(errorResponse.getError().equals("invalid_token")) {
						if(errorResponse.getError_description().contains("Access token expired")) {
							// request refresh token
							accessTokenVO = ssoOAuthService.requestRefreshToken(accessTokenVO);
						} else {
							// token is expired
							LOGGER.error("Token is expired...");
							filterChain.doFilter(request, response);
							return;
						}
					} 
	
					// token 검증
					if(null == accessTokenVO || StringUtils.isEmpty(accessTokenVO.getAccess_token())) {
						filterChain.doFilter(request, response);
						return;
					}
				}
							
				// 정상처리
				if (null == session) {
					session	= request.getSession(true);
				}
				
				session.setAttribute(SsoConstants.USER_ACCESS_TOKEN, accessTokenVO);
		
				LOGGER.debug("User Token is {}", userToken);
				AbstractAuthenticationToken	authUser	= authUserByToken(userToken);
	
				if(null == authUser) {
					LOGGER.debug("AbstractAuthenticationToken is null...");
				} else {
					context.setAuthentication(authUser);
				}
	
				session.setAttribute(SsoConstants.SPRING_SECURITY_CONTEXT, context);
	
				UserInfoVO	userInfo	= (UserInfoVO)authUser.getPrincipal();
	
				if (null != userInfo) {
					queryStr	= queryStr.replace(SsoConstants.USER_ACCESS_TOKEN + "=" + userToken, "");
	
					if (StringUtils.isNotEmpty(queryStr)) {
						queryStr	= "?" + queryStr;
	
						if (queryStr.endsWith("&")) {
							queryStr	= queryStr.substring(0, queryStr.length() - 1);
						}
	
						Pattern	pattern	= Pattern.compile(";jsessionid=[0-9A-Za-z](.*)"); 
						Matcher	matcher	= pattern.matcher(queryStr);
	
						queryStr	= matcher.replaceAll("");
					}
	
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("returnUrl = [{}]", BinderUtils.chompString(returnUrl));
					}
	
	//					userInfo.setLastAccessTime(new Date());
					userInfo.setLoginTm(new Date()); 
					userInfo.setLoginIp(getRemoteAddr(request));
					userInfo.setLoginChnlCd(getAccessChannelCode(request,session));
					
					session.setAttribute(SsoConstants.OAUTH_USER_SESSION, userInfo);
	
					// 기존 메인 로그인 이후 화면으로 이동시 사용
					if(requestUri.endsWith("/callback")) {
						REDIRECT_STRATEGY.sendRedirect(request, response, returnUrl);
						return;
					}
				}
			}
		} 
		
		filterChain.doFilter(request, response);
	}
	
	
	
	private AbstractAuthenticationToken authUserByToken(String userToken) {
		if (StringUtils.isEmpty(userToken)) {
			return null;
		}

		UserInfoVO userInfo = null;
		AbstractAuthenticationToken	authUser = null;
		
		try {
//			userInfo = JsonUtil.getObjectFromJsonString(userToken, UserInfoVO.class);
			userInfo = new Gson().fromJson(userToken, UserInfoVO.class);
			
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("AbstractAuthenticationToken - LoginUserInfo = [{}]", BinderUtils.chompString(userInfo));
			}
			
			authUser	= new SsoAuthenticationToken(setAuthorities(userInfo), userInfo);
			
			authUser.setAuthenticated(true);
		} catch (Exception e) {
			LOGGER.debug(e.getMessage());
		} 
		
		return authUser;
	}

	private Collection<GrantedAuthority> setAuthorities(UserInfoVO userInfo) {
		Collection<GrantedAuthority>	authorities	= userInfo.getAuthorities();

		return authorities;
	}
	
	public boolean isMobileOS(HttpServletRequest request) {
		//모바일 체크
		String	ua			= request.getHeader("User-Agent").toLowerCase(Locale.ENGLISH);
		boolean	isMobileOS	= false;

		if (ua.matches(".*(android|avantgo|blackberry|blazer|compal|elaine|fennec|hiptop|iemobile|ip(hone|od|ad)|iris|kindle|lge |maemo|midp|mmp|opera m(ob|in)i|palm( os)?|phone|p(ixi|re)\\/|plucker|pocket|psp|symbian|treo|up\\.(browser|link)|vodafone|wap|windows (ce|phone)|xda|xiino).*")
				|| ua.substring(0,4).matches("1207|6310|6590|3gso|4thp|50[1-6]i|770s|802s|a wa|abac|ac(er|oo|s\\-)|ai(ko|rn)|al(av|ca|co)|amoi|an(ex|ny|yw)|aptu|ar(ch|go)|as(te|us)|attw|au(di|\\-m|r |s )|avan|be(ck|ll|nq)|bi(lb|rd)|bl(ac|az)|br(e|v)w|bumb|bw\\-(n|u)|c55\\/|capi|ccwa|cdm\\-|cell|chtm|cldc|cmd\\-|co(mp|nd)|craw|da(it|ll|ng)|dbte|dc\\-s|devi|dica|dmob|do(c|p)o|ds(12|\\-d)|el(49|ai)|em(l2|ul)|er(ic|k0)|esl8|ez([4-7]0|os|wa|ze)|fetc|fly(\\-|_)|g1 u|g560|gene|gf\\-5|g\\-mo|go(\\.w|od)|gr(ad|un)|haie|hcit|hd\\-(m|p|t)|hei\\-|hi(pt|ta)|hp( i|ip)|hs\\-c|ht(c(\\-| |_|a|g|p|s|t)|tp)|hu(aw|tc)|i\\-(20|go|ma)|i230|iac( |\\-|\\/)|ibro|idea|ig01|ikom|im1k|inno|ipaq|iris|ja(t|v)a|jbro|jemu|jigs|kddi|keji|kgt( |\\/)|klon|kpt |kwc\\-|kyo(c|k)|le(no|xi)|lg( g|\\/(k|l|u)|50|54|e\\-|e\\/|\\-[a-w])|libw|lynx|m1\\-w|m3ga|m50\\/|ma(te|ui|xo)|mc(01|21|ca)|m\\-cr|me(di|rc|ri)|mi(o8|oa|ts)|mmef|mo(01|02|bi|de|do|t(\\-| |o|v)|zz)|mt(50|p1|v )|mwbp|mywa|n10[0-2]|n20[2-3]|n30(0|2)|n50(0|2|5)|n7(0(0|1)|10)|ne((c|m)\\-|on|tf|wf|wg|wt)|nok(6|i)|nzph|o2im|op(ti|wv)|oran|owg1|p800|pan(a|d|t)|pdxg|pg(13|\\-([1-8]|c))|phil|pire|pl(ay|uc)|pn\\-2|po(ck|rt|se)|prox|psio|pt\\-g|qa\\-a|qc(07|12|21|32|60|\\-[2-7]|i\\-)|qtek|r380|r600|raks|rim9|ro(ve|zo)|s55\\/|sa(ge|ma|mm|ms|ny|va)|sc(01|h\\-|oo|p\\-)|sdk\\/|se(c(\\-|0|1)|47|mc|nd|ri)|sgh\\-|shar|sie(\\-|m)|sk\\-0|sl(45|id)|sm(al|ar|b3|it|t5)|so(ft|ny)|sp(01|h\\-|v\\-|v )|sy(01|mb)|t2(18|50)|t6(00|10|18)|ta(gt|lk)|tcl\\-|tdg\\-|tel(i|m)|tim\\-|t\\-mo|to(pl|sh)|ts(70|m\\-|m3|m5)|tx\\-9|up(\\.b|g1|si)|utst|v400|v750|veri|vi(rg|te)|vk(40|5[0-3]|\\-v)|vm40|voda|vulc|vx(52|53|60|61|70|80|81|83|85|98)|w3c(\\-| )|webc|whit|wi(g |nc|nw)|wmlb|wonu|x700|xda(\\-|2|g)|yas\\-|your|zeto|zte\\-")) {
			isMobileOS	= true; 

			if (ua.indexOf("v901") > -1 || ua.indexOf("v500") > -1 || ua.indexOf("v525") > -1 || ua.indexOf("lg-v700n") > -1 || ua.indexOf("lg-v607l") > -1) { 
				isMobileOS	= false;	
			}
		}

		return isMobileOS;
	}
	
	public String getAccessChannelCode(HttpServletRequest request,HttpSession session) {
		if (isMobileOS(request)) {
			String	chnlCd	= StringUtils.defaultIfEmpty((String)session.getAttribute(SsoConstants.ACCESS_CHANNEL_SESSION), AccessChannelCode.MOBILE_WEB);

			if (AccessChannelCode.MOBILE_APP.equals(chnlCd)) {
				return AccessChannelCode.MOBILE_APP;
			} else {
				return AccessChannelCode.MOBILE_WEB;
			}
		} else {
			return AccessChannelCode.PC_WEB;
		}
	}
	
	public String getRemoteAddr(HttpServletRequest request) {
		String	remoteAddr	= request.getHeader("X-FORWARDED-FOR");

		if (StringUtils.isEmpty(remoteAddr)) {
			remoteAddr	= request.getRemoteAddr();
		} else if (remoteAddr.contains(",")) {
			remoteAddr	= remoteAddr.substring(0, remoteAddr.indexOf(","));
		}

		return remoteAddr;
	}

}
