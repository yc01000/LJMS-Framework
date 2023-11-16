package com.lj.sso.ssocore.service;

import com.google.gson.Gson;
import com.lj.sso.ssocore.model.UserToken;
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

// for oauth client
@Service
public class OAuthClientService {

	private static final Logger LOGGER	= LoggerFactory.getLogger(OAuthClientService.class);

	@Value("${sso.oauth.endpoint.token}")
	private String tokenUri;

	@Value("${sso.oauth.endpoint.userinfo}")
	private String userinfoUri;

	@Value("${sso.oauth.client-id}")
	private String clientId;

	@Value("${sso.oauth.client-secret}")
	private String clientSecret;

	@Value("${sso.oauth.scope}")
	private String scope;

	@Value("${sso.oauth.redirect-uri}")
	private String redirectUri;

	/**
	 *
	 * WCJUNG (2019. 3. 6. 오전 11:15:52)
	 * desc   :
	 * @param
	 * @return String
	 */
	public String requestAccessToken(String code) {
		String credentials = clientId + ":" + clientSecret;
		String encodedCredentials = new String(Base64.encodeBase64(credentials.getBytes()));

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
	public UserToken requestRefreshToken(UserToken userToken) {
		String credentials = clientId + ":" + clientSecret;
		String encodedCredentials = new String(Base64.encodeBase64(credentials.getBytes()));

		String param = "grant_type=refresh_token&scope=" + scope + "&refresh_token=" + userToken.getRefresh_token();
		String httpResponse = requestOAuthService(tokenUri, HttpMethod.POST, "application/x-www-form-urlencoded", encodedCredentials, param);

		UserToken newUserToken = new UserToken();
		try {
			newUserToken = new Gson().fromJson(httpResponse, UserToken.class);
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
	public String requestUserInfo(UserToken userToken) {
		String param = "?access_token=" + userToken.getAccess_token();

		String httpResponse = requestOAuthService(userinfoUri, HttpMethod.GET, null, null, param);
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

        return response.getBody();
	}
}
