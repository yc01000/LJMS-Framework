package com.lj.sso.ssocore.security;

import java.io.IOException;
import java.util.Properties;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import com.lj.sso.ssocore.common.util.BinderUtils;

/**
 * 
 * <pre>
 * <B>lj.sso.support</B>
 *     |_ SsoAuthenticationEntryPoint.java
 * </pre>
 * 
 *  @author  : WCJUNG
 *  @date    : 2019. 3. 18. 오전 10:00:24 
 *  @version : 1.0
 *  @desc    : 인증되지 않은 접근인 경우 로그인 페이지로 전환
 */
public class SsoAuthenticationEntryPoint implements AuthenticationEntryPoint {
	private final static Logger	LOGGER	= LoggerFactory.getLogger(SsoAuthenticationEntryPoint.class);

	@Value("#{OAuthProperties}")
	private Properties	oauthProperties;
	
//	@Value("#{localProperty}")
//	protected Properties properties;
	
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		
		LOGGER.debug("request url is : {}", request.getRequestURI());
		
		if(!request.getRequestURI().contains("login/callback")) {
			String userAuthorizationUri = "https://ssostg.jinair.com/oauth/authorize";//(String)oauthProperties.get("oauth.client.userAuthorizationUri");
			String redirectUri = "https://local-crewpnr.jinair.com/sso/callback";//(String)properties.get("oauth.client.redirectUri");
			String clientId = "local-crewpnr";// (String)properties.get("oauth.client.id");
			String scope = "ReadProfile,ReadAll,WriteProfile";//(String)properties.get("oauth.client.scope");
			String oauthUri = String.format("%s?response_type=code&client_id=%s&redirect_uri=%s&state=%s", 
					userAuthorizationUri, clientId, redirectUri, scope);
			
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Login Uri = [{}]", BinderUtils.chompString(oauthUri));
			}
	
			SsoRedirection.redirectConfirmLogin(request, response, oauthUri);
		}
	}
}
