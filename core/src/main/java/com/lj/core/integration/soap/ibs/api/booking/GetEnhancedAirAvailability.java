package com.lj.core.integration.soap.ibs.api.booking;

import jakarta.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.lj.core.integration.soap.ibs.IbsSoapConnector;
import com.lj.core.integration.soap.ibs.IbsSoapProperty;
import com.lj.core.integration.soap.ibs.NotInitiatedException;
import com.lj.core.integration.soap.ibs.SoapFaultException;
import com.lj.core.integration.soap.ibs.domain.booking.EnhancedAirAvailabilityRQ;
import com.lj.core.integration.soap.ibs.domain.booking.EnhancedAirAvailabilityRS;
import com.lj.core.integration.soap.ibs.domain.booking.ErrorType;

@Component("GetEnhancedAirAvailability")
public class GetEnhancedAirAvailability extends IbsSoapConnector<EnhancedAirAvailabilityRQ, EnhancedAirAvailabilityRS, IbsSoapProperty>{
	
	@Value("#{IbsBookingProperties['booking.availability.endpoint']}")
	private String endpoint;
	
	@Value("#{IbsBookingProperties['booking.availability.getEnhancedAirAvailability']}")
	private String action;
	
	@Resource(name="webServiceTemplate.booking")
	private WebServiceTemplate webServiceTemplate;


	public EnhancedAirAvailabilityRS request(EnhancedAirAvailabilityRQ req, IbsSoapProperty property){
		initiate(endpoint, action);
		EnhancedAirAvailabilityRS response = null;
		try{
			super.setWebServiceTemplate(webServiceTemplate);
			response = super.request(req, property);
		}catch(SoapFaultException sfe){			
			response = new EnhancedAirAvailabilityRS();
			ErrorType errorType = new ErrorType();
			String[] errorBundle = sfe.getErrorType();			
			
			if( errorBundle != null && errorBundle.length >=2 ){
				errorType.setErrorCode(errorBundle[0]);
				errorType.setErrorValue(errorBundle[1]);
				response.setErrorType(errorType);
			}
		}catch(NotInitiatedException nie){
			response = new EnhancedAirAvailabilityRS();
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
