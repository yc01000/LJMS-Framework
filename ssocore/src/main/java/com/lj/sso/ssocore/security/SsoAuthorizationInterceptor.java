package com.lj.sso.ssocore.security;

import com.lj.sso.ssocore.common.util.BinderUtils;
import com.lj.sso.ssocore.common.util.SsoConstants;
import com.lj.sso.ssocore.security.vo.UserInfoVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.servlet.handler.WebRequestHandlerInterceptorAdapter;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ SsoAuthorizationInterceptor.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @since   : 2017. 10. 11. 오후 7:54:03 
 *  @version : 1.0
 *  @desc    : 페이지별 접근 권한 체크 인터셉터
 */
public class SsoAuthorizationInterceptor extends WebRequestHandlerInterceptorAdapter {
	private final static Logger	LOGGER	= LoggerFactory.getLogger(SsoAuthorizationInterceptor.class);

	public SsoAuthorizationInterceptor(WebRequestInterceptor requestInterceptor) {
		super(requestInterceptor);
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		UserInfoVO	userInfoVO	= getLoginUserInfo(request);
		String			requestUri	= (null == request) ? "" : BinderUtils.chompString(request.getRequestURI());
		String			queryStr	= (null == request) ? "" : BinderUtils.chompString(request.getQueryString());
		
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("[SsoAuthorizationInterceptor Start ] ====================");
			LOGGER.debug("[RequestURI] = [{}]", requestUri);
			LOGGER.debug("[QueryString] = [{}]", queryStr);
		}

		if (null == userInfoVO) {
			LOGGER.debug("User Information is null and redirect ModelAndViewDefiningException");
			throw new ModelAndViewDefiningException(new ModelAndView("redirect:/"));
		} 

		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("[SsoAuthorizationInterceptor Finish] ====================");
		}

		super.postHandle(request, response, handler, modelAndView);
	}

	/**
	 * jhbang (2017. 10. 11. 오후 8:13:09)<br/>
	 * desc   :  로그인한 사용자 정보 조회
	 * 
	 * @param request
	 * @return
	 */
	private UserInfoVO getLoginUserInfo(HttpServletRequest request) {
		return (UserInfoVO)request.getSession().getAttribute(SsoConstants.OAUTH_USER_SESSION);
	}
}
