package com.lj.core.integration.soap.ibs.api.booking;

import jakarta.annotation.Resource;
import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.lj.core.integration.soap.ibs.IbsSoapConnector;
import com.lj.core.integration.soap.ibs.IbsSoapProperty;
import com.lj.core.integration.soap.ibs.NotInitiatedException;
import com.lj.core.integration.soap.ibs.SoapFaultException;
import com.lj.core.integration.soap.ibs.domain.booking.CreateBookingRQ;
import com.lj.core.integration.soap.ibs.domain.booking.CreateBookingRS;
import com.lj.core.integration.soap.ibs.domain.booking.ErrorType;

@Component("SaveCreateBooking")
public class SaveCreateBooking extends IbsSoapConnector<JAXBElement<CreateBookingRQ>/*CreateBookingRQ*/, CreateBookingRS, IbsSoapProperty>{
	
	@Value("#{IbsBookingProperties['booking.reservations.endpoint']}")
	private String endpoint;
	
	@Value("#{IbsBookingProperties['booking.reservations.saveCreateBooking']}")
	private String action;
	
	@Resource(name="webServiceTemplate.booking")
	private WebServiceTemplate webServiceTemplate;

	public CreateBookingRS request(CreateBookingRQ req, IbsSoapProperty property){
		initiate(endpoint, action);
		CreateBookingRS response = null;
		try{
			/**
			 * xmlrootElement 가 생성 되지 않는 Type 에 대한 처리 
			 */
			QName qName = new QName("http://www.ibsplc.com/iRes/simpleTypes/", "CreateBookingRQ");
			JAXBElement<CreateBookingRQ> request = new JAXBElement<CreateBookingRQ>(qName, CreateBookingRQ.class, req);
			
			super.setWebServiceTemplate(webServiceTemplate);
			response = super.request(request, property);
			//response = super.request(req, property);
		}catch(SoapFaultException sfe){			
			response = new CreateBookingRS();
			ErrorType errorType = new ErrorType();
			String[] errorBundle = sfe.getErrorType();			
			
			if( errorBundle != null && errorBundle.length >=2 ){
				errorType.setErrorCode(errorBundle[0]);
				errorType.setErrorValue(errorBundle[1]);
				response.setErrorType(errorType);
			}
		}catch(NotInitiatedException nie){
			response = new CreateBookingRS();
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
