package com.lj.sso.ssocore.model;

import org.springframework.security.core.GrantedAuthority;

/**
 * <pre>
 * <B>support</B>
 *     |_ SsoGrantedAuthority.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @since   : 2018. 1. 24. 오후 7:10:53 
 *  @version : 1.0
 *  @desc    : 권한 정보
 */
public class SsoGrantedAuthority implements GrantedAuthority {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2348968326577701850L;

	/**
	 * 권한 문자열
	 */
	private String	authority;

	@Override
	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority	= authority;
	}
}
