package com.lj.sso.ssocore.security.vo;

import java.io.Serializable;

/**
 * 
 * <pre>
 * <B>lj.sso.support</B>
 *     |_ ErrorResponseVO.java
 * </pre>
 * 
 *  @author  : WCJUNG
 *  @date    : 2019. 3. 29. 오후 3:11:29 
 *  @version : 1.0
 *  @desc    :
 */
public class ErrorResponseVO implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1813257253810286729L;

	private String error;
	
	private String error_description;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getError_description() {
		return error_description;
	}

	public void setError_description(String error_description) {
		this.error_description = error_description;
	}
}
