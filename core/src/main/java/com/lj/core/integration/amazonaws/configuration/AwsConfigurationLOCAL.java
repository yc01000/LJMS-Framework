package com.lj.core.integration.amazonaws.configuration;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.lj.core.configurations.MatcherProfile;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ AwsConfiguration.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @since   : 2017. 10. 23. 오전 8:32:03 
 *  @version : 1.0
 *  @desc    : Amazon AWS Configuration
 */
@Configuration
@MatcherProfile("local")
public class AwsConfigurationLOCAL {
	/**
	 * jhbang (2017. 10. 23. 오후 1:53:32)<br/>
	 * desc   :  Amazon AWS 프로퍼티 설정
	 * 
	 * @return
	 */
	@Bean(name="AwsProperties")
	public PropertiesFactoryBean awsConfig() {
		PropertiesFactoryBean	bean	= new PropertiesFactoryBean();

		bean.setLocations(new ClassPathResource("property/local/aws-properties.xml"));

		return bean;
	}
	
	/**
	 * syou (2018. 01. 11. 오후 15:40:00)<br/>
	 * desc   :  Amazon KMS 프로퍼티 설정
	 * 
	 * @return PropertiesFactoryBean
	 */
	@Bean(name="KmsProperties")
	public PropertiesFactoryBean kmsConfig() {
		PropertiesFactoryBean	bean	= new PropertiesFactoryBean();

		bean.setLocations(new ClassPathResource("property/local/kms-properties.xml"));

		return bean;
	}
}
