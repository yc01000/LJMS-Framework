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
import com.lj.core.integration.soap.ibs.domain.booking.PriceItineraryRQ;
import com.lj.core.integration.soap.ibs.domain.booking.PriceItineraryRS;

@Component("PriceItinerary")
public class PriceItinerary extends IbsSoapConnector<PriceItineraryRQ, PriceItineraryRS, IbsSoapProperty>{
	
	@Value("#{IbsBookingProperties['booking.price.endpoint']}")
	private String endpoint;
	
	@Value("#{IbsBookingProperties['booking.price.priceItinerary']}")
	private String action;
	
	@Resource(name="webServiceTemplate.booking")
	private WebServiceTemplate webServiceTemplate;

	public PriceItineraryRS request(PriceItineraryRQ req, IbsSoapProperty property){
		initiate(endpoint, action);
		PriceItineraryRS response = null;
		try{
			super.setWebServiceTemplate(webServiceTemplate);
			response = super.request(req, property);
		}catch(SoapFaultException sfe){			
			response = new PriceItineraryRS();
			ErrorType errorType = new ErrorType();
			String[] errorBundle = sfe.getErrorType();			
			
			if( errorBundle != null && errorBundle.length >=2 ){
				errorType.setErrorCode(errorBundle[0]);
				errorType.setErrorValue(errorBundle[1]);
				response.setErrorType(errorType);
			}
		}catch(NotInitiatedException nie){
			response = new PriceItineraryRS();
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
