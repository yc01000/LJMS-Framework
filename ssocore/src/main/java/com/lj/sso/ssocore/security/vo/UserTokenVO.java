package com.lj.sso.ssocore.security.vo;

import java.io.Serializable;

/**
 * 
 * <pre>
 * <B>ssoPortal</B>
 *     |_ UserTokenVO.java
 * </pre>
 * 
 *  @author  : WCJUNG
 *  @date    : 2019. 3. 6. 오전 10:54:36 
 *  @version : 1.0
 *  @desc    :
 */
public class UserTokenVO implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4392485429021757274L;
	
	private String access_token;
	private String token_type;
	private String refresh_token;
	private String expires_in;
	private String scope;
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public String getRefresh_token() {
		return refresh_token;
	}
	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	
}
