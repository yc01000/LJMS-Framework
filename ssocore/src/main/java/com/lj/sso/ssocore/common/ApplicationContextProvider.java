package com.lj.sso.ssocore.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * <pre>
 * <B>support</B>
 *     |_ ApplicationContextProvider.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @since   : 2018. 1. 25. 오후 2:54:58 
 *  @version : 1.0
 *  @desc    : Application Context Provider
 */
public class ApplicationContextProvider implements ApplicationContextAware {
	private static ApplicationContext	ctx	= null;

	@SuppressWarnings("static-access")
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ctx	= applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return ctx;
	}
}
