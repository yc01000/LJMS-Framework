package com.lj.sso.ssocore.configuration;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

/**
 * 
 * <pre>
 * <B>lj.sso.support</B>
 *     |_ ConfigurationDEV.java
 * </pre>
 * 
 *  @author  : WCJUNG
 *  @date    : 2019. 3. 20. 오전 8:48:52 
 *  @version : 1.0
 *  @desc    : OAuth Configuration
 */
@Configuration
@MatcherProfile("dev")
public class ConfigurationDEV {
	/**
	 * 
	 * WCJUNG (2019. 3. 20. 오전 8:50:54)
	 * desc   :  OAuth Property
	 * @param  
	 * @return PropertiesFactoryBean
	 */
	@Bean(name="OAuthProperties")
	public PropertiesFactoryBean oAuthConfig() {
		PropertiesFactoryBean	bean	= new PropertiesFactoryBean();

		bean.setLocations(new ClassPathResource("property/dev/oauth-properties.xml"));

		return bean;
	}
	
	@Bean(name="SSOAwsProperties")
	public PropertiesFactoryBean awsConfig() {
		PropertiesFactoryBean	bean	= new PropertiesFactoryBean();

		bean.setLocations(new ClassPathResource("property/dev/aws-sso-properties.xml"));

		return bean;
	}
}
