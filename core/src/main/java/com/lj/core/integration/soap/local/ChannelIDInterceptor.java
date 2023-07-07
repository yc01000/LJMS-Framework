package com.lj.core.integration.soap.local;

import java.util.Iterator;

import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapHeaderElement;
/*import jakarta.xml.soap.SOAPHeaderElement; */
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

//@Component("ljCertificationInterceptor")//--> 사용하는 application 에서 선언해서 사용해야 함.

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ ChannelIDInterceptor.java
 * </pre>
 * 
 *  @author  : sryu
 *  @date    : 2018. 1. 29. 오후 7:11:33 
 *  @version : 1.0
 *  @desc    : Soap Server application 이 ChannelID 에 대한 Mandatory 체크가 필요 할 때 사용
 */
public class ChannelIDInterceptor implements EndpointInterceptor {

	private static final Logger LOGGER = LoggerFactory.getLogger(ChannelIDInterceptor.class);

	/*@Resource(name = "CertificationService")
	private CertificationService certificationService;
*/
/*	@Value("#{IntegrationProperties['SOAP.SUCESS.RESPONSE']}")
	public String __SOAPSUCEED;*/
	

	@Override
	public boolean handleRequest(MessageContext messageContext, Object endpoint) throws Exception {
		
		SaajSoapMessage soapRequest = (SaajSoapMessage) messageContext.getRequest();
		SoapHeader requestHeader = soapRequest.getSoapHeader();

		Iterator<SoapHeaderElement> itr = requestHeader.examineAllHeaderElements();
		Node node = null;
		Source source = null;
		DOMSource bodyDomSource = null;
		Node bodyNode = null;
		NodeList nodelist = null;
		String nodeName = "", nodeValue = "", channelId = "";
		while (itr.hasNext()) {
			SoapHeaderElement ele = itr.next();

			source = ele.getSource();
			bodyDomSource = (DOMSource) source;
			bodyNode = bodyDomSource.getNode();
			nodelist = bodyNode.getChildNodes();

			for (int i = 0; i < nodelist.getLength(); i++) {
				node = nodelist.item(i);
				nodeName = node.getNodeName();
				nodeValue = node.getTextContent();
				
				if (nodeName.compareToIgnoreCase("ChannelId") == 0) {
					if( LOGGER.isDebugEnabled() ){
						LOGGER.debug("ws node [" + nodeName + "] has [" + nodeValue + "]");	
					}
					channelId = node.getTextContent();
				} else {
					// skip undefined soap header element
				}
			}
		}

		if ( channelId.isEmpty() ) {
			//return false;
			if( LOGGER.isInfoEnabled() ){
				LOGGER.info("ChannelID Missing");
			}			
			throw new Exception("SoapHeader ChannelID Verification Failed");
			
		} else {
			
			return true;			
		}
	}

	@Override
	public boolean handleResponse(MessageContext messageContext, Object endpoint) throws Exception {
		return true;
	}

	@Override
	public boolean handleFault(MessageContext messageContext, Object endpoint) throws Exception {
		return true;
	}

	@Override
	public void afterCompletion(MessageContext messageContext, Object endpoint, Exception ex) throws Exception {
		
	}

	
	
}
