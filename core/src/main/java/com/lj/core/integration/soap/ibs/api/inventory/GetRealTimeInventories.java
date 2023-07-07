package com.lj.core.integration.soap.ibs.api.inventory;

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
import com.lj.core.integration.soap.ibs.domain.inventory.ErrorType;
import com.lj.core.integration.soap.ibs.domain.inventory.RealTimeInventoryRQ;
import com.lj.core.integration.soap.ibs.domain.inventory.RealTimeInventoryRS;

@Component("GetRealTimeInventories")
public class GetRealTimeInventories  extends IbsSoapConnector<RealTimeInventoryRQ, RealTimeInventoryRS, IbsSoapProperty> {
	
	private static final Logger logger = LoggerFactory.getLogger(GetRealTimeInventories.class);
	
	@Value("#{IbsBookingProperties['inventory.realTimeInventory.endpoint']}")	
	private String endpoint;
	
	@Value("#{IbsBookingProperties['inventory.realTimeInventory.getRealTimeInventories']}")
	private String action;
	
	@Resource(name="webServiceTemplate.inventory")
	private WebServiceTemplate webServiceTemplate;
	
	
	public RealTimeInventoryRS request(RealTimeInventoryRQ req, IbsSoapProperty property){
		
		// 20201216 STG 테스트용 임의 PRD 설정 (나중에 바꿔) 
		//this.endpoint = "http://10.196.21.203:7010/iRes_Inventory_WS/services/RealTimeInventoryPort";
		
		initiate(endpoint, action);
		
		RealTimeInventoryRS response = null;
		
		try {
			super.setWebServiceTemplate(webServiceTemplate);
			
			// 20201216 STG 테스트용 임의 PRD 설정 (나중에 바꿔) 
			//property.setUsername("jinairprd");
			//property.setPassword("jinatiflyprodapi");
			
			response = super.request(req, property);
		} catch (SoapFaultException sfe) {
			response = new RealTimeInventoryRS();
			ErrorType errorType = new ErrorType();
			String[] errorBundle = sfe.getErrorType();
			
			if( errorBundle != null && errorBundle.length >=2 ){
				errorType.setErrorCode(errorBundle[0]);
				errorType.setErrorValue(errorBundle[1]);
				response.setErrorType(errorType);
			}
			
		}catch(NotInitiatedException nie){
			response = new RealTimeInventoryRS();
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
