package com.lj.sso.ssocore.model;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * <pre>
 * <B>support</B>
 *     |_ SsoAuthenticationToken.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @since   : 2018. 1. 24. 오후 7:14:54 
 *  @version : 1.0
 *  @desc    : 
 */
public class SsoAuthenticationToken extends AbstractAuthenticationToken {

	private UserInfoVO userInfo;

	public SsoAuthenticationToken(Collection<? extends GrantedAuthority> authorities, UserInfoVO userInfo) {
		super(authorities);

		this.userInfo = userInfo;
		setAuthenticated(true);
	}

	@Override
	public Object getCredentials() {
		if (null == this.userInfo) {
			return null;
		} else {
			return this.userInfo.getPw();
		}
	}

	@Override
	public Object getPrincipal() {
		return this.userInfo;
	}
}
