package com.lj.sso.ssocore.service;

import org.springframework.http.HttpMethod;

import com.lj.sso.ssocore.security.vo.UserTokenVO;

public interface SsoOAuthService {

	public String requestAccessToken(String code);
	
	public String requestAccessToken(String code, String requestUri);
	
	public UserTokenVO requestRefreshToken(UserTokenVO userToken);
	
	public String requestUserInfo(UserTokenVO userToken);
	
	public String requestOAuthService(String uri, HttpMethod httpMethod, String userAgent, String credentials, String param);
}
