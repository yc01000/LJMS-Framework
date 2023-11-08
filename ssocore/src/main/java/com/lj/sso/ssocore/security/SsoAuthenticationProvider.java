package com.lj.sso.ssocore.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import com.lj.sso.ssocore.util.BinderUtils;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ SsoAuthenticationProvider.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @since   : 2017. 9. 7. 오전 9:19:21 
 *  @version : 1.0
 *  @desc    : 사용자 인증 처리
 */
public class SsoAuthenticationProvider implements AuthenticationProvider {
	private final static Logger	LOGGER	= LoggerFactory.getLogger(SsoAuthenticationProvider.class);

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		LOGGER.info("Authentication is [{}]", BinderUtils.chompString(authentication));
		return authentication;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}
}
