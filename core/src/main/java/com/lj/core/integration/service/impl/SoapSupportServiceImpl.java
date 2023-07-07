package com.lj.core.integration.service.impl;

import javax.xml.namespace.QName;
import jakarta.xml.soap.SOAPElement;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.soap.SOAPHeader;
import jakarta.xml.soap.SOAPMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.w3c.dom.DOMException;

import com.lj.core.integration.service.SoapSupportService;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ SoapSupportServiceImpl.java
 * </pre>
 * 
 *  @author  : sryu
 *  @date    : 2017. 8. 4. 오후 4:30:05 
 *  @version : 1.0
 *  @desc    : Soap 서비스를 프로바이딩 하고 컨슘하는 과정에 필요한 유틸성 함수들의 모음
 */
@Service("SoapSupportService")
public class SoapSupportServiceImpl implements SoapSupportService {
	private static final Logger	LOGGER	= LoggerFactory.getLogger(SoapSupportServiceImpl.class);

	@Override
	public void makeSoapHeader(MessageContext messageContext, String[] headers) {

		SaajSoapMessage soapResponse = (SaajSoapMessage) messageContext.getResponse();
		SOAPMessage soapMessage = soapResponse.getSaajMessage();	
		try{
			SOAPHeader soapHeader = soapMessage.getSOAPHeader();			
			SOAPElement root = soapHeader.addChildElement(new QName("http://www.lj.com/LJResponseHeader", "status", "ljr"));
			
			if( headers == null || headers.length < 3 ){
				throw new RuntimeException("not proper header header data[null or wrong size]");
			}
			
			root.addChildElement("RequestId").setTextContent(headers[0]);
			root.addChildElement("ResultCode").setTextContent(headers[1]);
			root.addChildElement("ResultString").setTextContent(headers[2]);
			
		}catch(DOMException | SOAPException ex){
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("[list exception = {}]", ex.getMessage());
			}
		}
	}
}
