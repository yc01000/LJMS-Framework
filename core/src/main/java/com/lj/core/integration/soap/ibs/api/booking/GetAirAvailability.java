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
import com.lj.core.integration.soap.ibs.domain.booking.AirAvailabilityRQ;
import com.lj.core.integration.soap.ibs.domain.booking.AirAvailabilityRS;
import com.lj.core.integration.soap.ibs.domain.booking.ErrorType;


@Component("GetAirAvailability")
public class GetAirAvailability extends IbsSoapConnector<AirAvailabilityRQ, AirAvailabilityRS, IbsSoapProperty>{
	
	private static final Logger logger = LoggerFactory.getLogger(GetAirAvailability.class);
	
	@Value("#{IbsBookingProperties['booking.availability.endpoint']}")	
	private String endpoint;
	
	@Value("#{IbsBookingProperties['booking.availability.getAirAvailability']}")
	private String action;
	
//	@Resource(name="jaxb2marshaller.booking.availability")
//	Jaxb2Marshaller jaxb2marshaller;

	@Resource(name="webServiceTemplate.booking")
	private WebServiceTemplate webServiceTemplate;

	public AirAvailabilityRS request(AirAvailabilityRQ req, IbsSoapProperty property){
		initiate(endpoint, action);
//		webServiceTemplate.setMarshaller(jaxb2marshaller);
//		webServiceTemplate.setUnmarshaller(jaxb2marshaller);
		
		AirAvailabilityRS response = null;
		try{
			super.setWebServiceTemplate(webServiceTemplate);
			response = super.request(req, property);
		}catch(SoapFaultException sfe){			
			response = new AirAvailabilityRS();
			ErrorType errorType = new ErrorType();
			String[] errorBundle = sfe.getErrorType();			
			
			if( errorBundle != null && errorBundle.length >=2 ){
				errorType.setErrorCode(errorBundle[0]);
				errorType.setErrorValue(errorBundle[1]);
				response.setErrorType(errorType);
			}
		}catch(NotInitiatedException nie){
			response = new AirAvailabilityRS();
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
