package com.lj.core.integration.service;

import org.springframework.ws.context.MessageContext;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ SoapSupportService.java
 * </pre>
 * 
 *  @author  : sryu
 *  @date    : 2017. 8. 4. 오후 4:31:17 
 *  @version : 1.0
 *  @desc    : Soap 서비스를 프로바이딩 하고 컨슘하는 과정에 필요한 유틸성 함수들의 모음
 */
public interface SoapSupportService {

	/**
	 * sryu (2017. 8. 4. 오후 3:23:25)
	 * desc   :  soap header message creation
	 * @param  messageContext context메세지, resultCode resultcod 값, resultMessage result 메세지
	 * @return void
	 */
	public void makeSoapHeader(MessageContext messageContext, String[] headers);
}
