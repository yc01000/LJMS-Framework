package com.lj.core.integration.soap.ibs;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ NotInitiatedException.java
 * </pre>
 * 
 *  @author  : sryu
 *  @date    : 2017. 8. 4. 오후 4:34:24 
 *  @version : 1.0
 *  @desc    : IBS 웹서비스 사용중 발생할 수 있는 익셉션을 처리하기 위한 래핑 클래스
 */
public class NotInitiatedException extends RuntimeException{

	
	//private ErrorType errorType = null;
	private String[] errorType = {};
	
	public NotInitiatedException(String message, Exception exception) {
		super(message, exception);
	}

	public String[] getErrorType() {
		return errorType;
	}

	public void setErrorType(String[] errorType) {
		this.errorType = errorType;
	}

/*	public ErrorType getErrorType() {
		return errorType;
	}

	public void setErrorType(ErrorType errorType) {
		this.errorType = errorType;
	}*/

	
	
}
