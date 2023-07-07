package com.lj.core.integration.soap.ibs.api.booking;

import jakarta.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.lj.core.integration.soap.ibs.IbsSoapConnector;
import com.lj.core.integration.soap.ibs.IbsSoapProperty;
import com.lj.core.integration.soap.ibs.NotInitiatedException;
import com.lj.core.integration.soap.ibs.SoapFaultException;
import com.lj.core.integration.soap.ibs.domain.booking.ConfirmPriceRQ;
import com.lj.core.integration.soap.ibs.domain.booking.ConfirmPriceRS;
import com.lj.core.integration.soap.ibs.domain.booking.ErrorType;

@Component("ConfirmPrice")
public class ConfirmPrice extends IbsSoapConnector<ConfirmPriceRQ, ConfirmPriceRS, IbsSoapProperty>{
	
	@Value("#{IbsBookingProperties['booking.price.endpoint']}")
	private String endpoint;
	
	@Value("#{IbsBookingProperties['booking.price.confirmPrice']}")
	private String action;
	
	@Resource(name="webServiceTemplate.booking")
	private WebServiceTemplate webServiceTemplate;
	
	public ConfirmPriceRS request(ConfirmPriceRQ req, IbsSoapProperty property){
			
		initiate(endpoint, action);
		ConfirmPriceRS response = null;
		try{
			super.setWebServiceTemplate(webServiceTemplate);
			response = super.request(req, property);			
		}catch(SoapFaultException sfe){			
			response = new ConfirmPriceRS();
			ErrorType errorType = new ErrorType();
			String[] errorBundle = sfe.getErrorType();			
			
			if( errorBundle != null && errorBundle.length >=2 ){
				errorType.setErrorCode(errorBundle[0]);
				errorType.setErrorValue(errorBundle[1]);
				response.setErrorType(errorType);
			}
		}catch(NotInitiatedException nie){
			response = new ConfirmPriceRS();
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
