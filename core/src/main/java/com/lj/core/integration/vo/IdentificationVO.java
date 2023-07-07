package com.lj.core.integration.vo;

import java.io.Serializable;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ IdentificationVO.java
 * </pre>
 * 
 *  @author  : sryu
 *  @date    : 2017. 8. 4. 오후 4:38:02 
 *  @version : 1.0
 *  @desc    : Soap Providing 의 Certification 을 위한 기초 정보를 담고 있는 Value Object
 */
public class IdentificationVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7580559708829616097L;
	private String SYS_NAME = null;
	private String CHANNEL_ID = null;
	private String OFFICE_ID = null;
	private String CREDENTIAL = null;
	
	public String getSYS_NAME() {
		return SYS_NAME;
	}
	public void setSYS_NAME(String sYS_NAME) {
		SYS_NAME = sYS_NAME;
	}
	public String getCHANNEL_ID() {
		return CHANNEL_ID;
	}
	public void setCHANNEL_ID(String cHANNEL_ID) {
		CHANNEL_ID = cHANNEL_ID;
	}
	public String getOFFICE_ID() {
		return OFFICE_ID;
	}
	public void setOFFICE_ID(String oFFICE_ID) {
		OFFICE_ID = oFFICE_ID;
	}
	public String getCREDENTIAL() {
		return CREDENTIAL;
	}
	public void setCREDENTIAL(String cREDENTIAL) {
		CREDENTIAL = cREDENTIAL;
	}	
	
}
