package com.lj.core.integration.soap.ibs.api.checkin;

import jakarta.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.lj.core.integration.soap.ibs.IbsSoapConnector;
import com.lj.core.integration.soap.ibs.IbsSoapProperty;
import com.lj.core.integration.soap.ibs.NotInitiatedException;
import com.lj.core.integration.soap.ibs.SoapFaultException;
import com.lj.core.integration.soap.ibs.domain.checkin.CHKSearchGuestRQ;
import com.lj.core.integration.soap.ibs.domain.checkin.CHKSearchGuestRS;
import com.lj.core.integration.soap.ibs.domain.checkin.ErrorType;

@Component("SearchGuest")
public class SearchGuest extends IbsSoapConnector<CHKSearchGuestRQ, CHKSearchGuestRS, IbsSoapProperty>{
	
	@Value("#{IbsBookingProperties['checkin.checkin.endpoint']}")
	private String endpoint;
	
	@Value("#{IbsBookingProperties['checkin.checkin.searchGuest']}")
	private String action;
		
	@Resource(name="webServiceTemplate.checkin")
	private WebServiceTemplate webServiceTemplate;

	public CHKSearchGuestRS request(CHKSearchGuestRQ req, IbsSoapProperty property){
		initiate(endpoint, action);
		CHKSearchGuestRS response = null;
		try{
			super.setWebServiceTemplate(webServiceTemplate);
			response = super.request(req, property);
		}catch(SoapFaultException sfe){			
			response = new CHKSearchGuestRS();
			ErrorType errorType = new ErrorType();
			String[] errorBundle = sfe.getErrorType();			
			
			if( errorBundle != null && errorBundle.length >=2 ){
				errorType.setErrorCode(errorBundle[0]);
				errorType.setErrorValue(errorBundle[1]);
				response.setErrorType(errorType);
			}
		}catch(NotInitiatedException nie){
			response = new CHKSearchGuestRS();
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
