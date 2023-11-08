package com.lj.sso.ssocore.model;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import com.lj.sso.ssocore.security.vo.UserInfoVO;

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
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3436609935960645677L;

	private static final Logger	LOGGER	= LoggerFactory.getLogger(SsoAuthenticationToken.class);
	
	private UserInfoVO	userInfo;

	public SsoAuthenticationToken(Collection<? extends GrantedAuthority> authorities, UserInfoVO userInfo) {
		super(authorities);

		this.userInfo	= userInfo;
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
		if (null == this.userInfo) {
			return null;
		} else {
			return this.userInfo;
		}
	}
}
