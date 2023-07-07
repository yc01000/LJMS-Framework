package com.lj.core.integration.soap.ibs.api.configuration;

import com.lj.core.integration.soap.interceptor.LogClientSoapInterceptor;
import jakarta.annotation.Resource;
import org.apache.http.HttpHost;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

import java.util.Properties;


@Configuration
public class MarshallerConfiguration {

	@Resource(name="IbsBookingProperties")
	private Properties ibsProperties;

	@Resource
	private Environment	environment;

	@Bean(name="soapMessageFactory")
	public SaajSoapMessageFactory messageFactory(){
		SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
		messageFactory.setSoapVersion(SoapVersion.SOAP_11);
		return messageFactory;
	}

	@Bean(name="httpComponentsMessageSender")
	public HttpComponentsMessageSender httpComponentsMessageSender(){

		PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();
		connectionManager.setMaxTotal(1000);
		connectionManager.setDefaultMaxPerRoute(400);

		String ibsEndPoint  = ibsProperties.getProperty("ibs.soap.endpoint");
		int	   nIbsPort  	= Integer.parseInt(ibsProperties.getProperty("ibs.soap.port"));

		HttpHost ibsEnd = new HttpHost(ibsEndPoint, nIbsPort);
		connectionManager.setMaxPerRoute(new HttpRoute(ibsEnd), 100);

		String[] profiles	= this.environment.getActiveProfiles();

		int nSocketTime = 30000;   //기본 30초
		if (null != profiles) {
			for (String profile : profiles) {
				if(profile.contains("agt")) {   // b2t,backOffice 에서만  60초
					nSocketTime = 60000;
					break;
				}
				else if(profile.contains("sales")) {
					if(!profile.contains("prd")) {
						nSocketTime = 60000;
					}
				}
				else if(profile.contains("hom")) {
					if(!profile.contains("prd")) {
						nSocketTime = 120000;
					}
				} else if(profile.contains("web")) {
					nSocketTime = 60000;
					if(!profile.contains("prd")) {
						nSocketTime = 120000;
					}
				} else if(profile.equals("local") || profile.contains("stg-extapi")) {
					if(!profile.contains("prd")) {
						nSocketTime = 120000;
					}
				}
			}
		}

		RequestConfig.Builder requestConfigBuilder = RequestConfig.copy(RequestConfig.DEFAULT).setSocketTimeout(nSocketTime)
				.setConnectTimeout(10000).setConnectionRequestTimeout(10000).setCookieSpec(CookieSpecs.IGNORE_COOKIES);

		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();

		SocketConfig socketConfig = SocketConfig.custom().setSoTimeout(10000).build();
		httpClientBuilder.setDefaultSocketConfig(socketConfig);

		httpClientBuilder.addInterceptorFirst(new HttpComponentsMessageSender.RemoveSoapHeadersInterceptor());
		CloseableHttpClient client = httpClientBuilder.setConnectionManager(connectionManager).setDefaultRequestConfig(requestConfigBuilder.build()).build();

		return new HttpComponentsMessageSender(client);

	}

	@Bean(name = "jaxb2marshaller.booking")
	public Jaxb2Marshaller jaxb2marshaller_b() {
		Jaxb2Marshaller jaxb2marshaller = new Jaxb2Marshaller();
		jaxb2marshaller.setContextPaths("com.lj.core.integration.soap.ibs.domain.booking");
		return jaxb2marshaller;
	}

	@Bean(name = "jaxb2marshaller.checkin")
	public Jaxb2Marshaller jaxb2marshaller_c() {
		Jaxb2Marshaller jaxb2marshaller = new Jaxb2Marshaller();
		jaxb2marshaller.setContextPaths("com.lj.core.integration.soap.ibs.domain.checkin");
		return jaxb2marshaller;
	}

	@Bean(name = "jaxb2marshaller.inventory")
	public Jaxb2Marshaller jaxb2marshaller_d() {
		Jaxb2Marshaller jaxb2marshaller = new Jaxb2Marshaller();
		jaxb2marshaller.setContextPaths("com.lj.core.integration.soap.ibs.domain.inventory");
		return jaxb2marshaller;
	}
}
