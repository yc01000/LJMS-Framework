package com.lj.core.integration.soap.ibs.api.booking;

import jakarta.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.lj.core.integration.soap.ibs.IbsSoapConnector;
import com.lj.core.integration.soap.ibs.IbsSoapProperty;
import com.lj.core.integration.soap.ibs.NotInitiatedException;
import com.lj.core.integration.soap.ibs.SoapFaultException;
import com.lj.core.integration.soap.ibs.domain.booking.ErrorType;
import com.lj.core.integration.soap.ibs.domain.booking.RetrievePassengerManifestRQ;
import com.lj.core.integration.soap.ibs.domain.booking.RetrievePassengerManifestRS;

@Component("RetrievePassengerManifest")
public class RetrievePassengerManifest extends IbsSoapConnector<RetrievePassengerManifestRQ, RetrievePassengerManifestRS, IbsSoapProperty>{
	
	@Value("#{IbsBookingProperties['booking.flight.endpoint']}")
	private String endpoint;
	
	@Value("#{IbsBookingProperties['booking.flight.retrievePassengerManifest']}")
	private String action;
	
	@Resource(name="webServiceTemplate.booking")
	private WebServiceTemplate webServiceTemplate;

	public RetrievePassengerManifestRS request(RetrievePassengerManifestRQ req, IbsSoapProperty property){
		initiate(endpoint, action);
		RetrievePassengerManifestRS response = null;
		try{
			super.setWebServiceTemplate(webServiceTemplate);
			response = super.request(req, property);
		}catch(SoapFaultException sfe){			
			response = new RetrievePassengerManifestRS();
			ErrorType errorType = new ErrorType();
			String[] errorBundle = sfe.getErrorType();			
			
			if( errorBundle != null && errorBundle.length >=2 ){
				errorType.setErrorCode(errorBundle[0]);
				errorType.setErrorValue(errorBundle[1]);
				response.setErrorType(errorType);
			}
		}catch(NotInitiatedException nie){
			response = new RetrievePassengerManifestRS();
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
