package com.lj.core.integration.soap.ibs;

import org.springframework.ws.soap.client.SoapFaultClientException;


/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ SoapFaultException.java
 * </pre>
 * 
 *  @author  : sryu
 *  @date    : 2017. 8. 4. 오후 4:34:57 
 *  @version : 1.0
 *  @desc    : IBS Saop 의 수신중 FAULT 메세지를 처리하기 위한 익셉션 클래스
 */
public class SoapFaultException extends RuntimeException{

	private String[] errorTypes = {};
	
	//private ErrorType errorType = null;
	
	public SoapFaultException(String message, SoapFaultClientException exception) {
		super(message, exception);
	}

	/*public ErrorType getErrorType() {
		return errorType;
	}

	public void setErrorType(ErrorType errorType) {
		this.errorType = errorType;
	}*/

	public String[] getErrorType() {
		return errorTypes;
	}

	public void setErrorType(String[] errorTypes) {
		this.errorTypes = errorTypes;
	}

	

	
}
