package com.lj.crewpnr.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 
 * <pre>
 * <B>ssoPortal</B>
 *     |_ OAuthController.java
 * </pre>
 * 
 *  @author  : WCJUNG
 *  @date    : 2019. 3. 13. 오전 11:30:51 
 *  @version : 1.0
 *  @desc    :
 */
@Controller
//@EnableResourceServer 
public class SSOController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SSOController.class);
	
	private static final class HttpMethod {
		private final static String POST = "POST";
		private final static String GET = "GET";
	}

	private String tokenUri = "https://ssostg.jinair.com/oauth/token";

	private String userInfoUri = "https://ssostg.jinair.com/oauth/userinfo";

	private String scope = "ReadProfile,ReadAll,WriteProfile";

	/**
	 * 
	 * WCJUNG (2019. 3. 13. 오전 11:31:18)
	 * desc   :  OAuth callback
	 * @param  
	 * @return void
	 */
	@RequestMapping("/sso/callback")
	@ResponseBody
	public void oauthCallback(HttpServletResponse response, Model model, String code, String state, String error) {
		LOGGER.info("code : {}, error : {}, state : {}", code, error, state);

		if (model == null) {
			throw new RuntimeException("model is null");
		}
		model.addAttribute("code", code);
		model.addAttribute("error", error);
		model.addAttribute("state", state);
		
		String apiUrl = tokenUri + "?code=" + code
				+ "&grant_type=authorization_code"
//				+ "&redirect_uri=http://local-portal.jinair.com/login/getAccessToken"
				+ "&state=" + state;
	
		// According OAuth documentation we need to send the client id and secret key in the header for authentication
		String credentials = "local-crewpnr" + ":" + "local-crewpnr";
		String encodedCredentials = new String(Base64.encodeBase64(credentials.getBytes()));

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("Authorization", "Basic " + encodedCredentials);

		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> responseEntity = restTemplate.exchange(apiUrl, org.springframework.http.HttpMethod.POST, request, String.class);
		
		this.requestHttpRestApi(response, HttpMethod.GET, apiUrl, null, "Basic " + encodedCredentials);
	}

	/**
	 * 
	 * WCJUNG (2019. 3. 13. 오전 11:33:57)
	 * desc   :  사용자 정보를 확인합니다.
	 * @param  
	 * @return void
	 */
	@RequestMapping(value = "/login/getUserInfo", method = RequestMethod.POST)
	@ResponseBody
	public void getUserInfo(HttpServletResponse response, String acsTkn) {
		if (response == null || StringUtils.isEmpty(acsTkn)) {
			throw new RuntimeException("all parameters must be 'not null'");
		}
		
		this.requestHttpRestApi(response, HttpMethod.GET, userInfoUri, null, "Bearer " + acsTkn);
	}
	
	public String requestHttpRestApiReponseText(String method, String apiUrl, String param, String authorization) {
		String resultString = "";	
		
		HttpURLConnection conn = null;
		DataOutputStream wr = null;
		BufferedReader br = null;
		InputStream es = null;
		InputStream is = null;
		try {
			if (StringUtils.isEmpty(apiUrl) || StringUtils.isEmpty(method)) {
				throw new RuntimeException("necessary parameters is null");
			}
			URL url = new URL(apiUrl);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod(method);
			conn.setRequestProperty("User-Agent", "application/x-www-form-urlencoded");
			conn.setUseCaches(false);
			conn.setDoInput(true);
			
			if (StringUtils.isNotEmpty(authorization)) {
				conn.setDoOutput(true);
				conn.setRequestProperty("Authorization", authorization);
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug("authorization : " + authorization);
				}
			}
			
			if(StringUtils.isNotEmpty(param)) {
				conn.setDoOutput(true);
				conn.setRequestProperty("Content-Length", Integer.toString(param.getBytes().length));
				
				wr = new DataOutputStream (conn.getOutputStream());
				wr.writeBytes(param);
				wr.close();
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug("param : " + param);
				}
			} else {
				conn.setDoOutput(true);
				conn.setRequestProperty("Content-Length", "0");
			}
			
			for (Map.Entry<String, List<String>> header : conn.getHeaderFields().entrySet()) {
				for (String value : header.getValue()) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug(header.getKey() + " : " + value);
					}
				}
			}
				
			StringBuilder sb = new StringBuilder(1024);
			es = conn.getErrorStream();
			
			if (es != null) {
				br = new BufferedReader(new InputStreamReader(es));
				int i;
				char c;
				while (true) {
					i = br.read();
					if (-1 == i) {
						break;
					}
					c = (char)i;
					if(c != '\r' && c != '\n'){
						sb.append(c);
					}
				}
				resultString = sb.toString();
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug(resultString);
				}
				br.close();
				es.close();
			} else {
				is = conn.getInputStream();
				br = new BufferedReader(new InputStreamReader(is));
				int i;
				char c;
				while (true) {
					i = br.read();
					if (-1 == i) {
						break;
					}
					c = (char)i;
					if(c != '\r' && c != '\n'){
						sb.append(c);
					}
				}
				resultString = sb.toString();
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug(resultString);
				}
				br.close();
				is.close();
			}
		} catch (UnsupportedEncodingException e) {
			if (LOGGER.isErrorEnabled()) {
				LOGGER.error(e.getMessage());
			}
			
			throw new RuntimeException("UnsupportedEncodingException exception : " + e.getMessage());
		} catch (IOException e) {
			if (LOGGER.isErrorEnabled()) {
				LOGGER.error(e.getMessage());
			}
			
			throw new RuntimeException("IOException exception : " + e.getMessage());
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
			IOUtils.closeQuietly(es);
			IOUtils.closeQuietly(is);
			IOUtils.closeQuietly(wr);
			IOUtils.closeQuietly(br);
		}
		
		LOGGER.info("HTTP Response is {}", resultString);
		
		return resultString;
	}
	
	/**
	 * 
	 * carpricorn611 (2017. 11. 29. 오후 7:30:42)<br>
	 * desc   :  HTTP/REST API 호출시 사용<br>
	 * @param  
	 * @return void
	 */
	public void requestHttpRestApi(HttpServletResponse response, String method, String apiUrl, String param, String authorization) {
		if (response == null || StringUtils.isEmpty(apiUrl) || StringUtils.isEmpty(method)) {
			throw new RuntimeException("necessary parameters is null");
		}
		
		String resultString = requestHttpRestApiReponseText(method, apiUrl, param, authorization);
		try {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("application/json;charset=utf-8");
			response.getWriter().write(resultString);
		} catch (IOException e) {
			if (LOGGER.isErrorEnabled()) {
				LOGGER.error(e.getMessage());
			}
			
			throw new RuntimeException("IOException exception : " + e.getMessage());
		}
	}	
	
}
