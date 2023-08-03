package com.lj.sso.ssocore.security.vo;

import java.io.Serializable;

/**
 * 
 * <pre>
 * <B>lj.sso.support</B>
 *     |_ TBSSOClientVO.java
 * </pre>
 * 
 *  @author  : WCJUNG
 *  @date    : 2019. 5. 3. 오후 1:43:27 
 *  @version : 1.0
 *  @desc    : SSO Client VO
 */
public class TBSSOClientVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7558434729646304547L;
	
	private String callbackId;
	
	private String callbackUri;
	
	private String callbackCredential;
	
	private String defaultUri;
	
	public String getCallbackId() {
		return callbackId;
	}

	public void setCallbackId(String callbackId) {
		this.callbackId = callbackId;
	}

	public String getCallbackUri() {
		return callbackUri;
	}

	public void setCallbackUri(String callbackUri) {
		this.callbackUri = callbackUri;
	}

	public String getCallbackCredential() {
		return callbackCredential;
	}

	public void setCallbackCredential(String callbackCredential) {
		this.callbackCredential = callbackCredential;
	}

	public String getDefaultUri() {
		return defaultUri;
	}

	public void setDefaultUri(String defaultUri) {
		this.defaultUri = defaultUri;
	}
}
