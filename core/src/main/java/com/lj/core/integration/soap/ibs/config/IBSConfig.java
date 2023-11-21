package com.lj.core.integration.soap.ibs.config;

import com.lj.core.integration.soap.interceptor.LogClientSoapInterceptor;
import com.lj.core.util.ProfileUtils;
import org.apache.commons.lang3.StringUtils;
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
import org.springframework.beans.factory.annotation.Value;
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

import java.util.Properties;

@Configuration
public class IBSConfig {

	@Autowired
	private Environment environment;

	@Value("${ibs.api.socket-timeout:30000}")
	private int socketTimeout;

	@Value("${ibs.api.connect-timeout:10000}")
	private int connectTimeout;

	@Value("${ibs.api.connection-request-timeout:10000}")
	private int connectionRequestTimeout;

	@Bean(name="IntegrationProperties")
	public PropertiesFactoryBean integrationProperties() {
		String path = null;
		String activeProfile = ProfileUtils.activeProfile(environment);
		if(StringUtils.containsIgnoreCase(activeProfile, "prd")) {
			path = "prd";
		} else if(StringUtils.containsIgnoreCase(activeProfile, "stg")) {
			path = "stg";
		} else if(StringUtils.containsIgnoreCase(activeProfile, "dev")) {
			path = "dev";
		} else if(StringUtils.containsIgnoreCase(activeProfile, "local")) {
			path = "local";
		}
		if(StringUtils.isBlank(path)) {
			throw new RuntimeException("profile is null");
		}

		PropertiesFactoryBean bean = new PropertiesFactoryBean();
		bean.setLocations(new ClassPathResource("property/" + path + "/integration-properties.xml"));
		return bean;
	}

	@Bean(name="IbsBookingProperties")
	public PropertiesFactoryBean ibsBookingProperties() {
		String path = null;
		String activeProfile = ProfileUtils.activeProfile(environment);
		if(StringUtils.containsIgnoreCase(activeProfile, "prd")) {
			path = "prd";
		} else if(StringUtils.containsIgnoreCase(activeProfile, "stg")) {
			path = "stg";
		} else if(StringUtils.containsIgnoreCase(activeProfile, "dev")) {
			path = "dev";
		} else if(StringUtils.containsIgnoreCase(activeProfile, "local")) {
			path = "local";
		}
		if(StringUtils.isBlank(path)) {
			throw new RuntimeException("profile is null");
		}

		PropertiesFactoryBean bean = new PropertiesFactoryBean();
		bean.setLocations(
				new ClassPathResource("property/" + path + "/ibs-property/general-properties.xml"),
				new ClassPathResource("property/" + path + "/ibs-property/booking-properties.xml"),
				new ClassPathResource("property/" + path + "/ibs-property/checkin-properties.xml"),
				new ClassPathResource("property/" + path + "/ibs-property/inventory-properties.xml")
			);
		return bean;		
	}

	@Bean(name="httpComponentsMessageSender")
	public HttpComponentsMessageSender httpComponentsMessageSender(@Qualifier(value="IbsBookingProperties") Properties ibsProperties) {
		PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();
		connectionManager.setMaxTotal(1000);
		connectionManager.setDefaultMaxPerRoute(400);

		String ibsEndPoint  = ibsProperties.getProperty("ibs.soap.endpoint");
		int	   nIbsPort  	= Integer.parseInt(ibsProperties.getProperty("ibs.soap.port"));

		HttpHost ibsEnd = new HttpHost(ibsEndPoint, nIbsPort);
		connectionManager.setMaxPerRoute(new HttpRoute(ibsEnd), 100);

		RequestConfig.Builder requestConfigBuilder = RequestConfig.copy(RequestConfig.DEFAULT)
				.setSocketTimeout(socketTimeout)
				.setConnectTimeout(connectTimeout)
				.setConnectionRequestTimeout(connectionRequestTimeout)
				.setCookieSpec(CookieSpecs.IGNORE_COOKIES);

		CloseableHttpClient client = HttpClientBuilder.create()
				.setDefaultSocketConfig(SocketConfig.custom().setSoTimeout(10000).build())
				.addInterceptorFirst(new HttpComponentsMessageSender.RemoveSoapHeadersInterceptor())
				.setConnectionManager(connectionManager)
				.setDefaultRequestConfig(requestConfigBuilder.build())
				.build();

		return new HttpComponentsMessageSender(client);
	}

	@Bean(name="soapMessageFactory")
	public SaajSoapMessageFactory messageFactory() {
		SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
		messageFactory.setSoapVersion(SoapVersion.SOAP_11);
		return messageFactory;
	}

	// IBS Booking domain
	@Bean(name="webServiceTemplate.booking")
	public WebServiceTemplate webServiceTemplate_0(SaajSoapMessageFactory messageFactory, HttpComponentsMessageSender httpComponentMessageSender) {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPaths("com.lj.core.integration.soap.ibs.domain.booking");

		WebServiceTemplate webServiceTemplate = new WebServiceTemplate(messageFactory);
		webServiceTemplate.setMessageSender(httpComponentMessageSender);
		webServiceTemplate.setMarshaller(marshaller);
		webServiceTemplate.setUnmarshaller(marshaller);

		//register the LogClientSoapInterceptor
		ClientInterceptor[] interceptors = new ClientInterceptor[]{new LogClientSoapInterceptor()};
		webServiceTemplate.setInterceptors(interceptors);

		return webServiceTemplate;
	}

	// IBS Checkin domain
	@Bean(name="webServiceTemplate.checkin")
	public WebServiceTemplate webServiceTemplate_2(SaajSoapMessageFactory messageFactory, HttpComponentsMessageSender httpComponentMessageSender) {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPaths("com.lj.core.integration.soap.ibs.domain.checkin");

		WebServiceTemplate webServiceTemplate = new WebServiceTemplate(messageFactory);
		webServiceTemplate.setMessageSender(httpComponentMessageSender);
		webServiceTemplate.setMarshaller(marshaller);
		webServiceTemplate.setUnmarshaller(marshaller);

		//register the LogClientSoapInterceptor
		ClientInterceptor[] interceptors = new ClientInterceptor[]{new LogClientSoapInterceptor()};
		webServiceTemplate.setInterceptors(interceptors);

		return webServiceTemplate;
	}

	@Bean(name="webServiceTemplate.inventory")
	public WebServiceTemplate webServiceTemplate_3(SaajSoapMessageFactory messageFactory, HttpComponentsMessageSender httpComponentMessageSender) {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPaths("com.lj.core.integration.soap.ibs.domain.inventory");

		WebServiceTemplate webServiceTemplate = new WebServiceTemplate(messageFactory);
		webServiceTemplate.setMessageSender(httpComponentMessageSender);
		webServiceTemplate.setMarshaller(marshaller);
		webServiceTemplate.setUnmarshaller(marshaller);

		//register the LogClientSoapInterceptor
		ClientInterceptor[] interceptors = new ClientInterceptor[]{new LogClientSoapInterceptor()};
		webServiceTemplate.setInterceptors(interceptors);

		return webServiceTemplate;
	}
}
