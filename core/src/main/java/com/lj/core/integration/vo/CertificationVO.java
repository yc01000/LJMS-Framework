package com.lj.core.integration.vo;

import java.io.Serializable;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ CertificationVO.java
 * </pre>
 * 
 *  @author  : sryu
 *  @date    : 2017. 8. 4. 오후 4:36:44 
 *  @version : 1.0
 *  @desc    : SOAP Client 의 Certification 조회를 위한 value object
 */
public class CertificationVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4012949907457845274L;

	private String SEQ = null;
	private String SYS_NAME = null;
	private String HASH = null;
	
	public String getSEQ() {
		return SEQ;
	}
	public void setSEQ(String sEQ) {
		SEQ = sEQ;
	}
	public String getSYS_NAME() {
		return SYS_NAME;
	}
	public void setSYS_NAME(String sYS_NAME) {
		SYS_NAME = sYS_NAME;
	}
	public String getHASH() {
		return HASH;
	}
	public void setHASH(String hASH) {
		HASH = hASH;
	}
	
}
