package com.lj.sso.ssocore.security;

import java.io.IOException;
import java.net.URLEncoder;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;

import com.lj.sso.ssocore.common.util.BinderUtils;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ SsoRedirection.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @since   : 2017. 9. 7. 오전 9:20:17 
 *  @version : 1.0
 *  @desc    : 로그인 화면으로 리다이렉트
 */
public class SsoRedirection {
	private final static Logger	LOGGER	= LoggerFactory.getLogger(SsoRedirection.class);

	private final static RedirectStrategy	REDIRECT_STRATEGY	= new DefaultRedirectStrategy();

	/**
	 * jhbang (2017. 9. 7. 오전 9:24:57)<br/>
	 * desc   :  로그인 화면으로 리다이렉트
	 * 
	 * @param request
	 * @param response
	 * @param loginUri
	 * @throws IOException
	 */
	public static void redirectConfirmLogin(HttpServletRequest request, HttpServletResponse response, String loginUri) throws IOException {
		redirectConfirmLogin(request, response, loginUri, getCurrentUrl(request));
	}

	/**
	 * jhbang (2018. 1. 30. 오후 7:25:12)<br/>
	 * desc   :  로그인 화면으로 리다이렉트
	 * 
	 * @param request
	 * @param response
	 * @param loginUri
	 * @param returnUrl
	 * @throws IOException
	 */
	public static void redirectConfirmLogin(HttpServletRequest request, HttpServletResponse response, String loginUri, String returnUrl) throws IOException {
		if (StringUtils.isNotEmpty(returnUrl)) {
			returnUrl	= URLEncoder.encode(returnUrl, "UTF-8");
		} else {
			returnUrl	= "";
		}

		String	uri	= "";
//		if (StringUtils.isEmpty(returnUrl)) {
			uri	= String.format("%s", loginUri);
//		} else {
//			uri	= String.format("%s/?returnUrl=%s", loginUri, returnUrl);
//		}

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Redirecting to [{}]", BinderUtils.chompString(uri));
		}

		REDIRECT_STRATEGY.sendRedirect(request, response, uri);
	}

	/**
	 * jhbang (2017. 9. 7. 오전 9:24:12)<br/>
	 * desc   :  요청 URL에 대한 Full URL 조회
	 * 
	 * @param request
	 * @return
	 */
	public static String getCurrentUrl(HttpServletRequest request) {
		if (null == request) {
			return null;
		}

		String	scheme	= BinderUtils.chompString(request.getScheme());
		String	host	= BinderUtils.chompString(request.getServerName());
		int		port	= request.getServerPort();
		String	uri		= BinderUtils.chompString(request.getRequestURI());
		String	query	= BinderUtils.chompString(request.getQueryString());

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Server Info : scheme = [{}], host = [{}], port = [{}], uri = [{}], query = [{}]", scheme, host, port, uri, query);
		}

		String	callbackUrl	= String.format("%s://%s", scheme, host);

		if (80 != port) {
			callbackUrl	+= ":" + port;
		}

		if (StringUtils.isNotEmpty(uri)) {
			callbackUrl	+= uri;
		}

		if (StringUtils.isNotEmpty(query)) {
			callbackUrl	+= "?" + query;
		}

		return callbackUrl;
	}
}
