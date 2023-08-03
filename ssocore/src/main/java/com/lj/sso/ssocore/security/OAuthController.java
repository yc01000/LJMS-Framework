package com.lj.sso.ssocore.security;

import java.io.IOException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.security.core.context.SecurityContextHolder;

import com.lj.sso.ssocore.common.util.SsoConstants;
import com.lj.sso.ssocore.security.vo.UserInfoVO;
import com.lj.sso.ssocore.security.vo.UserTokenVO;

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
public class OAuthController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OAuthController.class);
	
//	@Value("#{localProperty['oauth.client.logout']}")
	private String logoutUri = "https://ssostg.jinair.com/logout";
	
	@RequestMapping("/login/logoutProc")
	@ResponseBody
	public String logoutProc(HttpServletRequest request, HttpServletResponse response) {
		UserInfoVO	userInfo = null;
		UserTokenVO accessToken = null;
		HttpSession	session	= request.getSession();
		if (null != session) {
			userInfo = (UserInfoVO)session.getAttribute(SsoConstants.OAUTH_USER_SESSION);
			accessToken = (UserTokenVO)session.getAttribute(SsoConstants.USER_ACCESS_TOKEN);
			
			session.removeAttribute(SsoConstants.OAUTH_USER_SESSION);
			session.removeAttribute(SsoConstants.USER_ACCESS_TOKEN);
		}
		
//		if(null == userInfo) {
//			LOGGER.debug("User auth information is null...");
//			return "User auth information is null";
//		}
//		
//		if(null == accessToken) {
//			LOGGER.debug("User access token is null...");
//			return "User access token is null";
//		}
		/*
		String revokeTokenUri = oAuthUri + "/oauth/users/" + userInfo.getId() + "/tokens/" + accessToken.getAccess_token();
		
		LOGGER.debug("called logout page... {}", revokeTokenUri);
		
		this.requestHttpRestApi(response, HttpMethod.DELETE, revokeTokenUri, null, null);
		*/

//		this.requestHttpRestApi(response, HttpMethod.GET, logoutUri, null, null);
		SecurityContextHolder.clearContext();

		try {
			LOGGER.debug("called logout page... {}", logoutUri);
			response.sendRedirect(logoutUri);
		} catch (IOException e) {
			LOGGER.error("logoutProc process error : {}", e.getMessage());
		}
		
		
		return "logout";
	}
}