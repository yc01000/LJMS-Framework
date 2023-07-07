package com.lj.core.integration.soap.interceptor;

import java.util.Iterator;

import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpComponentsConnection;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LogServerEndpointInterceptor implements EndpointInterceptor {

	private static final Logger LOGGER = LoggerFactory.getLogger(LogServerEndpointInterceptor.class);
	
	@Override
	public boolean handleRequest(MessageContext messageContext, Object endpoint) throws Exception {

		if( messageContext == null )
		{
			return true;
		}
		String clientSessionId = mineClientSessionId(messageContext);
		String logMsg = HttpLoggingUtils.logMessage("RQ_SOAP", clientSessionId, messageContext);
		if( LOGGER.isInfoEnabled() ){
			LOGGER.info(logMsg);
		}
		return true;
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
		if( messageContext != null )
		{
			String clientSessionId = mineClientSessionId(messageContext);
			String logMsg = HttpLoggingUtils.logMessage("RS_SOAP", clientSessionId, messageContext);
			if( LOGGER.isInfoEnabled() ){
				LOGGER.info(logMsg);
			}
		}
	}
	
	public String mineClientSessionId(MessageContext messageContext){
		
		SaajSoapMessage soapRequest = (SaajSoapMessage) messageContext.getRequest();
		SoapHeader requestHeader = soapRequest.getSoapHeader();

		Iterator<SoapHeaderElement> itr = requestHeader.examineAllHeaderElements();
		Node node = null;
		Source source = null;
		DOMSource bodyDomSource = null;
		Node bodyNode = null;
		NodeList nodelist = null;
		String requestId = "", nodeName = "", nodeValue = "";
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
				
				if (nodeName.compareTo("RequestId") == 0) {
					if( LOGGER.isDebugEnabled() ){
						LOGGER.debug("ws node [" + nodeName + "] has [" + nodeValue + "]");	
					}
					requestId = node.getTextContent(); // nodeValue;				 
				}
			}
		}
		return requestId;
	}
}
