package com.lj.sso.ssocore.service.impl;

import com.google.gson.Gson;
import com.lj.sso.ssocore.security.vo.UserTokenVO;
import com.lj.sso.ssocore.service.SsoOAuthService;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Properties;

/**
 * 
 * <pre>
 * <B>lj.sso.support</B>
 *     |_ SsoOAuthServiceImpl.java
 * </pre>
 * 
 *  @author  : WCJUNG
 *  @date    : 2019. 5. 3. 오후 2:31:30 
 *  @version : 1.0
 *  @desc    : OAuth 2.0 인증 처리 공통 서비스
 */
@Service("SsoOAuthService")
public class SsoOAuthServiceImpl implements SsoOAuthService {
	private static final Logger	LOGGER	= LoggerFactory.getLogger(SsoOAuthServiceImpl.class);
	
	@Value("#{OAuthProperties}")
	private Properties	oauthProperties;
	
//	@Value("#{localProperty}")
//	protected Properties properties;

	/**
	 * 
	 * WCJUNG (2019. 3. 6. 오전 11:15:52)
	 * desc   :  
	 * @param  
	 * @return String
	 */
	@Override
	public String requestAccessToken(String code) {
		String redirectUri = "https://local-crewpnr.jinair.com/sso/callback";// (String)properties.get("oauth.client.redirectUri");
		String clientId = "local-crewpnr";//(String)properties.get("oauth.client.id");
		String tokenUri = (String)oauthProperties.get("oauth.client.token");
		
		String credentials = clientId + ":" + clientId;
		String encodedCredentials = new String(Base64.encodeBase64(credentials.getBytes()));
		String param = "?code=" + code + "&grant_type=authorization_code&redirect_uri=" + redirectUri;
		String httpResponse = requestOAuthService(tokenUri, HttpMethod.POST, "application/x-www-form-urlencoded", encodedCredentials, param);
		LOGGER.debug("Access Token Response - {}", httpResponse);
		
		return httpResponse;
	}
	
	@Override
	public String requestAccessToken(String code, String requestUri) {
		String redirectUri = "https://local-crewpnr.jinair.com/sso/callback";// (String)properties.get("oauth.client.redirectUri");
		String encodedCredentials = "";//S(String)properties.get("oauth.client.credentail");

		String tokenUri = (String)oauthProperties.get("oauth.client.token");
		String param = "?code=" + code + "&grant_type=authorization_code&redirect_uri=" + redirectUri;
		String httpResponse = requestOAuthService(tokenUri, HttpMethod.POST, "application/x-www-form-urlencoded", encodedCredentials, param);
		LOGGER.debug("Access Token Response - {}", httpResponse);
		
		return httpResponse;
	}
	

	/**
	 * 
	 * WCJUNG (2019. 4. 1. 오전 11:15:52)
	 * desc   :  만료된 토큰인 경우 refresh token으로 요청합니다.
	 * @param  
	 * @return String
	 */
	@Override
	public UserTokenVO requestRefreshToken(UserTokenVO userToken) {
		// refresh token
		String clientId = "!";//(String)properties.get("oauth.client.id");
		String tokenUri = "2";//(String)oauthProperties.get("oauth.client.token");
		
		String credentials = clientId + ":" + clientId;
		String encodedCredentials = new String(Base64.encodeBase64(credentials.getBytes()));
		String scope = "ReadProfile,ReadAll,WriteProfile";//(String)properties.get("oauth.client.scope");
		String param = "grant_type=refresh_token&scope=" + scope + "&refresh_token=" + userToken.getRefresh_token();
		String httpResponse = requestOAuthService(tokenUri, HttpMethod.POST, "application/x-www-form-urlencoded", encodedCredentials, param);
		
		UserTokenVO newUserToken = new UserTokenVO();
		try {
//			newUserToken = JsonUtil.getObjectFromJsonString(httpResponse, UserTokenVO.class);
			newUserToken = new Gson().fromJson(httpResponse, UserTokenVO.class);
		} catch (Exception e) {
			LOGGER.error(ExceptionUtils.getStackTrace(e));
			return null;
		}
		
		return newUserToken;
	}
	
	/**
	 * 
	 * WCJUNG (2019. 3. 6. 오전 11:22:46)
	 * desc   :  
	 * @param  
	 * @return String
	 */
	@Override
	public String requestUserInfo(UserTokenVO userToken) {
		String userInfoUri = (String)oauthProperties.get("oauth.resource.userInfoUri");
		String param = "?access_token=" + userToken.getAccess_token();
		
		String httpResponse = requestOAuthService(userInfoUri, HttpMethod.GET, null, null, param);
		LOGGER.debug("User Information Response - {}", httpResponse);
				
		return httpResponse;
	}
	
	
	
	/**
	 * HTTP Request
	 * WCJUNG (2019. 3. 6. 오전 11:15:39)
	 * desc   :  
	 * @param  
	 * @return String
	 */
	@Override
	public String requestOAuthService(String uri, HttpMethod httpMethod, String userAgent, String credentials, String param) {
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		if(StringUtils.isNotBlank(userAgent)) {
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			headers.add("User-Agent", userAgent);
		}
		if(StringUtils.isNotBlank(credentials)) {
			headers.add("Authorization", "Basic " + credentials);
		}

		HttpEntity<String> request = new HttpEntity<String>(headers);
		String requestUrl = uri + param;

		LOGGER.debug("requestOAuthService : request url is {}", requestUrl);
		ResponseEntity<String> response = restTemplate.exchange(requestUrl, httpMethod, request, String.class);

		String httpResponse = (null == response) ? "" : response.getBody();

		return httpResponse;
	}
}
