package com.lj.core.integration.soap.interceptor;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.http.Header;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.transport.http.HttpComponentsConnection;

public class HttpLoggingUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(HttpLoggingUtils.class);
	
	private static final String _UNDEFIND = "UNDEFINED";
	public static String getClientSessionId(HttpComponentsConnection connection){
		if( connection == null ){
			return null;
		}		
        for(Header header : connection.getHttpPost().getAllHeaders()) {        	
       		if( "CLIENT_SESSION_ID".compareTo(header.getName()) == 0 ){
       			return header.getValue();
       		}
        }		
		return _UNDEFIND;		
	}
		
	
	public static String logMessage(String id, HttpComponentsConnection connection, MessageContext messageContext){
		
		String result = "";
		if( id == null ){//|| connection == null || messaeContext == null ){
			result = String.format("Error HttpLoggingUtils.logMessage[id:%s]", id);
			return result;				
		}		
			
		if( connection == null ){
			result = String.format("Error HttpLoggingUtils.logMessage[HttpComponentsConnection:%d]", connection);
			return result;
		}
			
		if( messageContext == null ){
			result = String.format("Error HttpLoggingUtils.logMessage[MessageContext:%d]", messageContext);			
			return result;		
		}
			
		String client_session_id = getClientSessionId(connection);
		
		WebServiceMessage msg = null;
		if( "RQ_SOAP".equals(id) ){
			msg = messageContext.getRequest();
		}else if( "RS_SOAP".equals(id) ){
			msg = messageContext.getResponse();
		}else{
			result = String.format("UNSUPPORT ID[%s]", id);			
			return result;
		}
			
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		
				
		try {				
			msg.writeTo(byteArrayOutputStream);
			
			String message = byteArrayOutputStream.toString().replace("\\", "\\\\")
															   .replace("\"", "\\\"")
															   .replace("\r", "\\r")
															   .replace("\n", "\\n");
			
			result = String.format("{\"CSID\":\"%s\", \"%s\":\"%s\"}", client_session_id, id, message);
			return result;			
			
		} catch (IOException e) {
			result = "Exception on messagestream";
			return result;
			
		} finally {
			try {
				byteArrayOutputStream.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	public static String logMessage(String id, String clientSessionId, MessageContext messageContext){
		String result = "";
		if( id == null ){//|| connection == null || messaeContext == null ){
			result = String.format("Error HttpLoggingUtils.logMessage[id:%s]", id);
			return result;				
		}		
			
		if( clientSessionId == null ){
			result = String.format("Error HttpLoggingUtils.logMessage[clientSessionId:%d]", clientSessionId);
			return result;
		}
			
		if( messageContext == null ){
			result = String.format("Error HttpLoggingUtils.logMessage[MessageContext:%d]", messageContext);			
			return result;		
		}
			
		WebServiceMessage msg = null;
		if( "RQ_SOAP".equals(id) ){
			msg = messageContext.getRequest();
		}else if( "RS_SOAP".equals(id) ){
			msg = messageContext.getResponse();
		}else{
			result = String.format("UNSUPPORT ID[%s]", id);			
			return result;
		}
			
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		
		
		
		try {				
			msg.writeTo(byteArrayOutputStream);
			String message = byteArrayOutputStream.toString().replace("\\", "\\\\")
															   .replace("\"", "\\\"")
															   .replace("\r", "\\r")
															   .replace("\n", "\\n");
			
			result = String.format("{\"CSID\":\"%s\", \"%s\":\"%s\"}", clientSessionId, id, message);
			return result;			
			
		} catch (IOException e) {
			result = "Exception on messagestream";
			return result;
			
		} finally {
			try {
				byteArrayOutputStream.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}