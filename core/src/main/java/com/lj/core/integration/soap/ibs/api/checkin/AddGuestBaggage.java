package com.lj.core.integration.soap.ibs.api.checkin;

import com.lj.core.integration.soap.ibs.IbsSoapConnector;
import com.lj.core.integration.soap.ibs.IbsSoapProperty;
import com.lj.core.integration.soap.ibs.NotInitiatedException;
import com.lj.core.integration.soap.ibs.SoapFaultException;
import com.lj.core.integration.soap.ibs.domain.checkin.CHKAddGuestBaggageRQ;
import com.lj.core.integration.soap.ibs.domain.checkin.CHKAddGuestBaggageRS;
import com.lj.core.integration.soap.ibs.domain.checkin.ErrorType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import jakarta.annotation.Resource;

@Component("AddGuestBaggage")
public class AddGuestBaggage extends IbsSoapConnector<CHKAddGuestBaggageRQ, CHKAddGuestBaggageRS, IbsSoapProperty>{
	
	@Value("#{IbsBookingProperties['checkin.checkin.endpoint']}")
	private String endpoint;
	
	@Value("#{IbsBookingProperties['checkin.checkin.addGuestBaggage']}")
	private String action;
		
	@Resource(name="webServiceTemplate.checkin")
	private WebServiceTemplate webServiceTemplate;


	public CHKAddGuestBaggageRS request(CHKAddGuestBaggageRQ req, IbsSoapProperty property){
		initiate(endpoint, action);
		CHKAddGuestBaggageRS response = null;
		try{
			super.setWebServiceTemplate(webServiceTemplate);
			response = super.request(req, property);
		}catch(SoapFaultException sfe){			
			response = new CHKAddGuestBaggageRS();
			ErrorType errorType = new ErrorType();
			String[] errorBundle = sfe.getErrorType();			
			
			if( errorBundle != null && errorBundle.length >=2 ){
				errorType.setErrorCode(errorBundle[0]);
				errorType.setErrorValue(errorBundle[1]);
				response.setErrorType(errorType);
			}
		}catch(NotInitiatedException nie){
			response = new CHKAddGuestBaggageRS();
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
