package com.lj.core.integration.soap.ibs.api.booking;

import jakarta.annotation.Resource;
import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.lj.core.integration.soap.ibs.IbsSoapConnector;
import com.lj.core.integration.soap.ibs.IbsSoapProperty;
import com.lj.core.integration.soap.ibs.NotInitiatedException;
import com.lj.core.integration.soap.ibs.SoapFaultException;
import com.lj.core.integration.soap.ibs.domain.booking.ErrorType;
import com.lj.core.integration.soap.ibs.domain.booking.PreProcessPaymentRQ;
import com.lj.core.integration.soap.ibs.domain.booking.PreProcessPaymentRS;

//2017/09/25 사용하지 않는 웹서비스  정리 - by sunnymean
//@Component("PreProcessPayment")
public class PreProcessPayment extends IbsSoapConnector<JAXBElement<PreProcessPaymentRQ>, PreProcessPaymentRS, IbsSoapProperty>{
	
	@Value("#{IbsBookingProperties['booking.payment.endpoint']}")
	private String endpoint;
	
	@Value("#{IbsBookingProperties['booking.payment.preProcessPayment']}")
	private String action;
	
	@Resource(name="webServiceTemplate.booking")
	private WebServiceTemplate webServiceTemplate;

	public PreProcessPaymentRS request(PreProcessPaymentRQ req, IbsSoapProperty property){
		initiate(endpoint, action);
		PreProcessPaymentRS response = null;
		try{
			/**
			 * xmlrootElement 가 생성 되지 않는 Type 에 대한 처리 
			 */
			QName qName = new QName("http://www.ibsplc.com/iRes/simpleTypes/", "PreProcessPaymentRQ");
			JAXBElement<PreProcessPaymentRQ> request = new JAXBElement<PreProcessPaymentRQ>(qName, PreProcessPaymentRQ.class, req);
			
			super.setWebServiceTemplate(webServiceTemplate);
			response = super.request(request, property);
//			response = super.request(req, property);
		}catch(SoapFaultException sfe){			
			response = new PreProcessPaymentRS();
			ErrorType errorType = new ErrorType();
			String[] errorBundle = sfe.getErrorType();			
			
			if( errorBundle != null && errorBundle.length >=2 ){
				errorType.setErrorCode(errorBundle[0]);
				errorType.setErrorValue(errorBundle[1]);
				response.setErrorType(errorType);
			}
		}catch(NotInitiatedException nie){
			response = new PreProcessPaymentRS();
			ErrorType errorType = new ErrorType();
			String[] errorBundle = nie.getErrorType();
			
			if( errorBundle != null && errorBundle.length >=2 ){
				errorType.setErrorCode(errorBundle[0]);
				errorType.setErrorValue(errorBundle[1]);
				response.setErrorType(errorType);
			}				
		}
		return response;
	}
	
}
