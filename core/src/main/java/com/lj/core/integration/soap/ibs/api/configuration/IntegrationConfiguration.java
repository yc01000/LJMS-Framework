package com.lj.core.integration.soap.ibs.api.configuration;

import java.util.Properties;

import jakarta.annotation.Resource;

import org.apache.http.HttpHost;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

import com.lj.core.integration.soap.interceptor.LogClientSoapInterceptor;


@Configuration
public class IntegrationConfiguration {








//	@Resource(name="soapMessageFactory")
//	SaajSoapMessageFactory soapMessageFactory;

//	@Resource(name="httpComponentsMessageSender")
//	HttpComponentsMessageSender httpComponentMessageSender;

	@Bean(name="webServiceTemplate.booking")
	public WebServiceTemplate webServiceTemplate_0(SaajSoapMessageFactory soapMessageFactory, HttpComponentsMessageSender httpComponentMessageSender, @Qualifier("jaxb2marshaller.booking") Jaxb2Marshaller jaxb2marshaller_booking) {
		WebServiceTemplate webServiceTemplate = new WebServiceTemplate(soapMessageFactory);
		webServiceTemplate.setMessageSender(httpComponentMessageSender);
		webServiceTemplate.setMarshaller(jaxb2marshaller_booking);
		webServiceTemplate.setUnmarshaller(jaxb2marshaller_booking);

		//register the LogClientSoapInterceptor
		ClientInterceptor[] interceptors = new ClientInterceptor[]{new LogClientSoapInterceptor()};
		webServiceTemplate.setInterceptors(interceptors);

		return webServiceTemplate;
	}

	@Bean(name="webServiceTemplate.checkin")
	public WebServiceTemplate webServiceTemplate_2(SaajSoapMessageFactory soapMessageFactory, HttpComponentsMessageSender httpComponentMessageSender, @Qualifier("jaxb2marshaller.checkin") Jaxb2Marshaller jaxb2marshaller_checkin) {
		WebServiceTemplate webServiceTemplate = new WebServiceTemplate(soapMessageFactory);
		webServiceTemplate.setMessageSender(httpComponentMessageSender);
		webServiceTemplate.setMarshaller(jaxb2marshaller_checkin);
		webServiceTemplate.setUnmarshaller(jaxb2marshaller_checkin);

		//register the LogClientSoapInterceptor
		ClientInterceptor[] interceptors = new ClientInterceptor[]{new LogClientSoapInterceptor()};
		webServiceTemplate.setInterceptors(interceptors);

		return webServiceTemplate;
	}

	@Bean(name="webServiceTemplate.inventory")
	public WebServiceTemplate webServiceTemplate_3(SaajSoapMessageFactory soapMessageFactory, HttpComponentsMessageSender httpComponentMessageSender, @Qualifier("jaxb2marshaller.inventory") Jaxb2Marshaller jaxb2marshaller_inventory) {
		WebServiceTemplate webServiceTemplate = new WebServiceTemplate(soapMessageFactory);
		webServiceTemplate.setMessageSender(httpComponentMessageSender);
		webServiceTemplate.setMarshaller(jaxb2marshaller_inventory);
		webServiceTemplate.setUnmarshaller(jaxb2marshaller_inventory);

		//register the LogClientSoapInterceptor
		ClientInterceptor[] interceptors = new ClientInterceptor[]{new LogClientSoapInterceptor()};
		webServiceTemplate.setInterceptors(interceptors);

		return webServiceTemplate;
	}
}
