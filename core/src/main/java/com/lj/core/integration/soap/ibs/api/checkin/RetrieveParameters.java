package com.lj.core.integration.soap.ibs.api.checkin;

import jakarta.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.lj.core.integration.soap.ibs.IbsSoapConnector;
import com.lj.core.integration.soap.ibs.IbsSoapProperty;
import com.lj.core.integration.soap.ibs.NotInitiatedException;
import com.lj.core.integration.soap.ibs.SoapFaultException;
import com.lj.core.integration.soap.ibs.domain.checkin.CHKRetrieveParametersRQ;
import com.lj.core.integration.soap.ibs.domain.checkin.CHKRetrieveParametersRS;
import com.lj.core.integration.soap.ibs.domain.checkin.ErrorType;

@Component("RetrieveParameters")
public class RetrieveParameters extends IbsSoapConnector<CHKRetrieveParametersRQ, CHKRetrieveParametersRS, IbsSoapProperty>{
	
	@Value("#{IbsBookingProperties['checkin.checkinUtility.endpoint']}")
	private String endpoint;

	@Value("#{IbsBookingProperties['checkin.checkinUtility.retrieveParameters']}")
	private String action;
		
	@Resource(name="webServiceTemplate.checkin")
	private WebServiceTemplate webServiceTemplate;

	public CHKRetrieveParametersRS request(CHKRetrieveParametersRQ req, IbsSoapProperty property){		
		initiate(endpoint, action);
		CHKRetrieveParametersRS response = null;
		try{		
			super.setWebServiceTemplate(webServiceTemplate);	
			response = super.request(req, property);
		}catch(SoapFaultException sfe){			
			response = new CHKRetrieveParametersRS();
			ErrorType errorType = new ErrorType();
			String[] errorBundle = sfe.getErrorType();			
			
			if( errorBundle != null && errorBundle.length >=2 ){
				errorType.setErrorCode(errorBundle[0]);
				errorType.setErrorValue(errorBundle[1]);
				response.setErrorType(errorType);
			}
		}catch(NotInitiatedException nie){
			response = new CHKRetrieveParametersRS();
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
