package com.lj.core.integration.soap.ibs.api.checkin;

import com.lj.core.integration.soap.ibs.IbsSoapConnector;
import com.lj.core.integration.soap.ibs.IbsSoapProperty;
import com.lj.core.integration.soap.ibs.NotInitiatedException;
import com.lj.core.integration.soap.ibs.SoapFaultException;
import com.lj.core.integration.soap.ibs.domain.checkin.CHKUpdateBagStatusAfterPrintRQ;
import com.lj.core.integration.soap.ibs.domain.checkin.CHKUpdateBagStatusAfterPrintRS;
import com.lj.core.integration.soap.ibs.domain.checkin.ErrorType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import jakarta.annotation.Resource;

@Component("UpdateBagStatusAfterPrint")
public class UpdateBagStatusAfterPrint extends IbsSoapConnector<CHKUpdateBagStatusAfterPrintRQ, CHKUpdateBagStatusAfterPrintRS, IbsSoapProperty>{
	
	@Value("#{IbsBookingProperties['checkin.checkin.endpoint']}")
	private String endpoint;
	
	@Value("#{IbsBookingProperties['checkin.checkin.updateBagStatusAfterPrint']}")
	private String action;
		
	@Resource(name="webServiceTemplate.checkin")
	private WebServiceTemplate webServiceTemplate;


	public CHKUpdateBagStatusAfterPrintRS request(CHKUpdateBagStatusAfterPrintRQ req, IbsSoapProperty property){
		initiate(endpoint, action);
		CHKUpdateBagStatusAfterPrintRS response = null;
		try{
			super.setWebServiceTemplate(webServiceTemplate);
			response = super.request(req, property);
		}catch(SoapFaultException sfe){			
			response = new CHKUpdateBagStatusAfterPrintRS();
			ErrorType errorType = new ErrorType();
			String[] errorBundle = sfe.getErrorType();			
			
			if( errorBundle != null && errorBundle.length >=2 ){
				errorType.setErrorCode(errorBundle[0]);
				errorType.setErrorValue(errorBundle[1]);
				response.setErrorType(errorType);
			}
		}catch(NotInitiatedException nie){
			response = new CHKUpdateBagStatusAfterPrintRS();
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
