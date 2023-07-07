package com.lj.core.integration.soap.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpComponentsConnection;

//import com.lj.core.common.util.BinderUtils;

public class LogClientSoapInterceptor implements ClientInterceptor {

	private static final Logger LOGGER = LoggerFactory.getLogger(LogClientSoapInterceptor.class);
	
	@Override
	public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
		HttpComponentsConnection connection = (HttpComponentsConnection) TransportContextHolder.getTransportContext().getConnection();	 
		String logMsg = HttpLoggingUtils.logMessage("RQ_SOAP", connection, messageContext);

		// retrieveCalendarFares API 관련 로그는 제외 : jhbang@crewmate.co.kr
		if (!logMsg.contains("CalendarRetrieveFares")) {
//			if( LOGGER.isInfoEnabled() ){
//				LOGGER.info(BinderUtils.chompString(logMsg));
//			}
		}

		return true;
	}

	@Override
	public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
		return true;
	}

	@Override
	public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
		return true;
	}

	@Override
	public void afterCompletion(MessageContext messageContext, Exception ex) throws WebServiceClientException {
		HttpComponentsConnection connection = (HttpComponentsConnection) TransportContextHolder.getTransportContext().getConnection();
		String logMsg = HttpLoggingUtils.logMessage("RS_SOAP", connection, messageContext);

		// retrieveCalendarFares API 관련 로그는 제외 : jhbang@crewmate.co.kr
		if (!logMsg.contains("CalendarRetrieveFares")) {
//			if( LOGGER.isInfoEnabled() ){
//				LOGGER.info(BinderUtils.chompString(logMsg));
//			}
		}
	}
}
