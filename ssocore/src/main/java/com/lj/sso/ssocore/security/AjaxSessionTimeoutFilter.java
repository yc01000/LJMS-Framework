package com.lj.sso.ssocore.security;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.AuthenticationException;

import com.lj.sso.ssocore.common.util.BinderUtils;

public class AjaxSessionTimeoutFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest	req	= (HttpServletRequest)request;
		HttpServletResponse	res	= (HttpServletResponse)response;

		if (isAjaxRequest(req)) {
			try {
				chain.doFilter(req, res);
			} catch (AccessDeniedException e) {
				res.sendError(HttpServletResponse.SC_FORBIDDEN);
			} catch (AuthenticationException e) {
				res.sendError(HttpServletResponse.SC_UNAUTHORIZED);
			}
		} else {
			chain.doFilter(req, res);
		}
	}

	@Override
	public void destroy() {
		
	}

	/**
	 * jhbang (2018. 3. 16. 오전 8:43:06)<br/>
	 * desc   :  AJAX 호출인지 확인
	 * 
	 * @param req
	 * @return
	 */
	private boolean isAjaxRequest(HttpServletRequest req) {
		String	requestWith	= (null == req) ? "" : BinderUtils.chompString(req.getHeader("x-requested-with"));

		return "XMLHttpRequest".equalsIgnoreCase(requestWith);
	}
}
