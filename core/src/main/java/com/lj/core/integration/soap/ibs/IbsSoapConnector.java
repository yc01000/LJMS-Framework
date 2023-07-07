package com.lj.core.integration.soap.ibs;

import javax.lang.model.element.Element;
import jakarta.xml.bind.JAXBElement;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;

import org.apache.http.client.methods.HttpPost;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.client.SoapFaultClientException;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpComponentsConnection;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.lj.core.integration.IntegrationConnector;
//import com.lj.support.integration.soap.ibs.domain.booking.simpletypes.ErrorType;


/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ IbsSoapConnector.java
 * </pre>
 * 
 *  @author  : sryu
 *  @date    : 2017. 8. 4. 오후 4:33:31 
 *  @version : 1.0
 *  @desc    : IBS 접속을 위한 SOAP Connector
 */
public class IbsSoapConnector<E1, E2, E3> /*extends WebServiceGatewaySupport*/ implements IntegrationConnector<E1, E2, IbsSoapProperty> {

	//@Resource(name="webServiceTemplate")
	private WebServiceTemplate webServiceTemplate;
		
	private String _endPoint;
	private String _action;

	private String _logKey = null;
	private String _logInterupt = null;
	
	protected final String _def = "";

	@Value("#{IntegrationProperties['INT.ERR.SOAPFAULT']}")
	public String SOAPFAULTCODE;
	
	@Value("#{IntegrationProperties['INT.ERR.EXCEPTION']}")
	public String EXCEPTIONCODE;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(IbsSoapConnector.class); 
	
	@Override
	public E2 request(E1 req, IbsSoapProperty property) throws NotInitiatedException, SoapFaultException {
		try{
			if( property == null ){
				throw new RuntimeException("IbsSoapProperty is null!");
			}
			
			if( webServiceTemplate == null ){
				throw new RuntimeException("Object is null!");
			}			
				
			if( (_endPoint == null || _endPoint.isEmpty()) || (_action == null || _action.isEmpty()) ){
				throw new RuntimeException("EndPoint or Action is not defined!");
			}
			
			if( _logKey != null && _logKey.isEmpty() == false )	{
				MDC.put(_logKey, _logInterupt);
			}
						
			@SuppressWarnings("unchecked")			
			Object responseObj = webServiceTemplate.marshalSendAndReceive(_endPoint, req,
				new WebServiceMessageCallback(){
					public void doWithMessage(WebServiceMessage message){
						SoapMessage soapMessage = (SoapMessage) message;
						soapMessage.setSoapAction(_action);
						TransportContext context = TransportContextHolder.getTransportContext();
						HttpComponentsConnection connection = (HttpComponentsConnection) context.getConnection();
						HttpPost postMethod = connection.getHttpPost();
						postMethod.addHeader("username", property.getUsername());
						postMethod.addHeader("password", property.getPassword());
						postMethod.setHeader("Accept-Encoding", property.getAccept_endcoding());
						postMethod.setHeader("CLIENT_SESSION_ID", property.getClientSessionId());
					}
				}
			);	
			
			
			if( _logKey != null && _logKey.isEmpty() == false )	{
				MDC.remove(_logKey);
			}
			
			if( responseObj instanceof JAXBElement ){
				JAXBElement<E2> response = (JAXBElement<E2>) responseObj;				
				return response.getValue();
			}else{				
				E2 response = (E2) responseObj;				
				return response;
			}			
			
			//return response;//.getValue();
			//return response.getValue();
		} catch(SoapFaultClientException sfe) {
			
			String faultMsg = sfe.getFaultStringOrReason();//((Node) getDetail(sfe)).getTextContent();					
			String faultCode = sfe.getFaultCode().toString();
				
			if(LOGGER.isDebugEnabled()){
				LOGGER.debug("fault code:" + faultCode);
				LOGGER.debug("fault message:" + faultMsg);	
			}			
		
			SoapFaultException sfex = new SoapFaultException(faultMsg, sfe);
			
			String[] errorBundle = {SOAPFAULTCODE, "[" + faultCode + "]" + faultMsg};

			sfex.setErrorType(errorBundle);
			
		    throw sfex;			
			
		} catch(IllegalArgumentException ex) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("[list exception = {}]", ex.getMessage());
			}
			
			NotInitiatedException nie = new NotInitiatedException(ex.getMessage(), ex);
			
			String[] errorBundle = {EXCEPTIONCODE, ex.getMessage()};
			/*ErrorType errorType = new ErrorType();
			errorType.setErrorCode(EXCEPTIONCODE);
			errorType.setErrorValue(ex.getMessage());*/
			
			nie.setErrorType(errorBundle);
			
			throw nie;
		} catch(Exception e){
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("[list exception = {}]", e.getMessage());
			}			
			NotInitiatedException nie = new NotInitiatedException(e.getMessage(), e);			
			String[] errorBundle = {EXCEPTIONCODE, e.getMessage()};
			nie.setErrorType(errorBundle);			
			throw nie;
		}
		finally {
			if( LOGGER.isDebugEnabled() ){
				LOGGER.debug("nothing to do in final");	
			}		
		}
	}
	
	public void initiate(String endPoint, String action)/*, Jaxb2Marshaller jaxb2marshaller)*/{
		_endPoint = endPoint;
		_action = action;
		
		if( LOGGER.isInfoEnabled() ) {
			LOGGER.info(">>>>>IBS connector set [endPoint:" + endPoint + "]  [action:" + action + "]");
		}
	}
	
	public void setLogInterupt(String key, String value){
		_logKey = key;
		_logInterupt = value;		
	}
	
	protected Element getDetail(SoapFaultClientException e) throws TransformerException {
	    TransformerFactory transformerFactory = TransformerFactory.newInstance();
	    transformerFactory.setFeature("http://xml.org/sax/features/external-general-entities", false);
	    transformerFactory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
	    Transformer transformer = transformerFactory.newTransformer();
	    DOMResult result = new DOMResult();
	    transformer.transform(e.getSoapFault().getSource(), result);
	    NodeList nl = ((Document)result.getNode()).getElementsByTagName("detail");
	    return (Element)nl.item(0);
	}

/*	public WebServiceTemplate getWebServiceTemplate() {
		return webServiceTemplate;
	}*/

	public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate) {
		if( LOGGER.isDebugEnabled() ) {
			LOGGER.debug("=== set WebserviceTemplate : " +  webServiceTemplate.toString());	
		}		
		this.webServiceTemplate = webServiceTemplate;
	}

	
}
