package com.lj.sso.ssocore.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtils {

	public static void d(Logger logger, String msg) {
		if(logger == null) {
			return;
		} else if(!logger.isDebugEnabled()) {
			return;
		} else if(StringUtils.isBlank(msg)) {
			return;
		}

		logger.debug(BinderUtils.chompString(msg));
	}

	public static void d(Logger logger, String format, Object arg) {
		if(logger == null) {
			return;
		} else if(!logger.isDebugEnabled()) {
			return;
		} else if(StringUtils.isBlank(format)) {
			return;
		}

		logger.debug(BinderUtils.chompString(format), BinderUtils.chompString(arg));
	}

	public static void d(Logger logger, String format, Object... arguments) {
		if(logger == null) {
			return;
		} else if(!logger.isDebugEnabled()) {
			return;
		} else if(StringUtils.isBlank(format)) {
			return;
		} else if(arguments == null) {
			logger.debug(format);
			return;
		}

		String[] chompedArguments = new String[arguments.length];
		for(int i = 0; i < arguments.length; i++) {
			chompedArguments[i] = BinderUtils.chompString(arguments[i]);
		}

		logger.debug(BinderUtils.chompString(format), (Object[]) chompedArguments);
	}

	public static void i(Logger logger, String msg) {
		if(logger == null) {
			return;
		} else if(!logger.isInfoEnabled()) {
			return;
		} else if(StringUtils.isBlank(msg)) {
			return;
		}

		logger.info(BinderUtils.chompString(msg));
	}

	public static void i(Logger logger, String format, Object arg) {
		if(logger == null) {
			return;
		} else if(!logger.isInfoEnabled()) {
			return;
		} else if(StringUtils.isBlank(format)) {
			return;
		}

		logger.info(BinderUtils.chompString(format), BinderUtils.chompString(arg));
	}

	public static void i(Logger logger, String format, Object... arguments) {
		if(logger == null) {
			return;
		} else if(!logger.isInfoEnabled()) {
			return;
		} else if(StringUtils.isBlank(format)) {
			return;
		} else if(arguments == null) {
			logger.info(format);
			return;
		}

		String[] chompedArguments = new String[arguments.length];
		for(int i = 0; i < arguments.length; i++) {
			chompedArguments[i] = BinderUtils.chompString(arguments[i]);
		}

		logger.info(BinderUtils.chompString(format), (Object[]) chompedArguments);
	}

	public static void e(Class<?> clazz, String msg) {
		e(LoggerFactory.getLogger(clazz), msg);
	}

	public static void e(Logger logger, String msg) {
		if(logger == null) {
			return;
		} else if(!logger.isErrorEnabled()) {
			return;
		} else if(StringUtils.isBlank(msg)) {
			return;
		}

		logger.error(BinderUtils.chompString(msg));
	}

	public static void e(Class<?> clazz, String format, Object arg) {
		e(LoggerFactory.getLogger(clazz), format, arg);
	}

	public static void e(Logger logger, String format, Object arg) {
		if(logger == null) {
			return;
		} else if(!logger.isErrorEnabled()) {
			return;
		} else if(StringUtils.isBlank(format)) {
			return;
		}

		logger.error(BinderUtils.chompString(format), BinderUtils.chompString(arg));
	}

	public static void e(Class<?> clazz, String format, Object... arguments) {
		e(LoggerFactory.getLogger(clazz), format, arguments);
	}

	public static void e(Logger logger, String format, Object... arguments) {
		if(logger == null) {
			return;
		} else if(!logger.isErrorEnabled()) {
			return;
		} else if(StringUtils.isBlank(format)) {
			return;
		} else if(arguments == null) {
			logger.error(format);
			return;
		}

		String[] chompedArguments = new String[arguments.length];
		for(int i = 0; i < arguments.length; i++) {
			chompedArguments[i] = BinderUtils.chompString(arguments[i]);
		}

		logger.error(BinderUtils.chompString(format), (Object[]) chompedArguments);
	}
}
