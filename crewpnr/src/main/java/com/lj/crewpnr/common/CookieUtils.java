package com.lj.crewpnr.common;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;


import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ CookieUtils.java
 * </pre>
 *
 *  @author  : jhbang
 *  @date    : 2017. 8. 7. 오후 2:22:52
 *  @version : 1.0
 *  @desc    : 쿠키 관련 유틸리티
 */
public class CookieUtils {

	private static final String RESPONSE_HEADER_SET_COOKIE = "Set-Cookie";

	private static final String COOKIE_ATTR_MAX_AGE = "Max-Age";

	private static final String COOKIE_ATTR_PATH = "Path";

	private static final String COOKIE_ATTR_SECURE = "Secure";

	private static final String COOKIE_ATTR_SAME_SITE = "SameSite";

	/**
	 * jhbang (2017. 11. 1. 오후 8:01:50)<br/>
	 * desc   :  쿠키 조회
	 *
	 * @param request
	 * @param name
	 * @return
	 */
	public static String getCookie(HttpServletRequest request, String name) {
		String		value	= null;
		Cookie[]	cookies	= request.getCookies();

		if (StringUtils.isEmpty(name)) {
			return null;
		}

		if (null != cookies) {
			for (Cookie cookie : cookies) {
				if (null == cookie) {
					continue;
				}

				if (name.equals(cookie.getName())) {
					value	= cookie.getValue();
				}
			}
		}

		return value;
	}

	public static String get(HttpServletRequest request, String name) {
		return get(request, name, null);
	}

	public static String get(HttpServletRequest request, String name, String defaultValue) {
		if(request == null) {
			return defaultValue;
		}

		Cookie[] cookies = request.getCookies();
		if(cookies == null) {
			return defaultValue;
		}

		if(StringUtils.isBlank(name)) {
			return defaultValue;
		}

		for(Cookie cookie: cookies) {
			if(null == cookie) {
				continue;
			}

			if(StringUtils.equals(cookie.getName(), name)) {
				return cookie.getValue();
			}
		}

		return defaultValue;
	}

	public static void set(HttpServletResponse response, String name, String value) {
		set(response, name, value, null);
	}

	public static void set(HttpServletResponse response, String name, String value, Double maxAge) {
		List<String> attrs = new ArrayList<>();
		attrs.add(name + "=" + value);
		if(maxAge != null) {
			attrs.add(COOKIE_ATTR_MAX_AGE + "=" + (maxAge * 24 * 60 * 60));
		}
		attrs.add(COOKIE_ATTR_PATH + "=/");
		attrs.add(COOKIE_ATTR_SECURE);
		attrs.add(COOKIE_ATTR_SAME_SITE + "=None");

		response.addHeader(RESPONSE_HEADER_SET_COOKIE, StringUtils.join(attrs, ";"));
	}

	public static void remove(HttpServletResponse response, String name) {
		set(response, name, null, 0d);
	}
}
