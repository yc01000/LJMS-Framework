package com.lj.sso.ssocore.security;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;

import java.io.IOException;

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

	private final static RedirectStrategy REDIRECT_STRATEGY = new DefaultRedirectStrategy();

	@Value(("${sso.oauth.endpoint.authorize}"))
	private String authorizeUri;

	@Value(("${sso.oauth.client-id}"))
	private String clientId;

	@Value(("${sso.oauth.redirect-uri}"))
	private String redirectUri;

	@Value(("${sso.oauth.scope}"))
	private String scope;

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException {
		LOGGER.info("request url is: {}", request.getRequestURI());
		String uri = String.format("%s?response_type=code&client_id=%s&redirect_uri=%s&state=%s", authorizeUri, clientId, redirectUri, scope);
		LOGGER.info("move to sso: {}", uri);
		REDIRECT_STRATEGY.sendRedirect(request, response, uri);
	}
}
