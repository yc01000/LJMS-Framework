package com.lj.core.integration.soap.ibs.api.booking;

import jakarta.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.lj.core.integration.soap.ibs.IbsSoapConnector;
import com.lj.core.integration.soap.ibs.IbsSoapProperty;
import com.lj.core.integration.soap.ibs.NotInitiatedException;
import com.lj.core.integration.soap.ibs.SoapFaultException;
import com.lj.core.integration.soap.ibs.domain.booking.CreateCustomerProfileRQ;
import com.lj.core.integration.soap.ibs.domain.booking.CreateCustomerProfileRS;
import com.lj.core.integration.soap.ibs.domain.booking.ErrorType;

@Component("CreateCustomerProfile")
public class CreateCustomerProfile extends IbsSoapConnector<CreateCustomerProfileRQ, CreateCustomerProfileRS, IbsSoapProperty>{
	
	@Value("#{IbsBookingProperties['booking.customerProfile.endpoint']}")
	private String endpoint;
	
	@Value("#{IbsBookingProperties['booking.customerProfile.createCustomerProfile']}")
	private String action;
	
	@Resource(name="webServiceTemplate.booking")
	private WebServiceTemplate webServiceTemplate;
	
	public CreateCustomerProfileRS request(CreateCustomerProfileRQ req, IbsSoapProperty property){
		initiate(endpoint, action);
		CreateCustomerProfileRS response = null;
		try{
			super.setWebServiceTemplate(webServiceTemplate);
			response = super.request(req, property);
		}catch(SoapFaultException sfe){			
			response = new CreateCustomerProfileRS();
			ErrorType errorType = new ErrorType();
			String[] errorBundle = sfe.getErrorType();			
			
			if( errorBundle != null && errorBundle.length >=2 ){
				errorType.setErrorCode(errorBundle[0]);
				errorType.setErrorValue(errorBundle[1]);
				response.setErrorType(errorType);
			}
		}catch(NotInitiatedException nie){
			response = new CreateCustomerProfileRS();
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
