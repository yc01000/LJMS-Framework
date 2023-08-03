package com.lj.sso.ssocore.configuration;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

/**
 * 
 * <pre>
 * <B>lj.sso.support</B>
 *     |_ ConfigurationLOCAL.java
 * </pre>
 * 
 *  @author  : WCJUNG
 *  @date    : 2019. 3. 20. 오전 8:48:10 
 *  @version : 1.0
 *  @desc    : OAuth 2.0 Configuration
 */
@Configuration
@MatcherProfile("local")
public class ConfigurationLOCAL {
	/**
	 * 
	 * WCJUNG (2019. 3. 20. 오전 8:50:36)
	 * desc   :  OAuth Property
	 * @param  
	 * @return PropertiesFactoryBean
	 */
	@Bean(name="OAuthProperties")
	public PropertiesFactoryBean oAuthConfig() {
		
		PropertiesFactoryBean	bean	= new PropertiesFactoryBean();

		bean.setLocations(new ClassPathResource("property/local/oauth-properties.xml"));
		
		return bean;
	}
	
	@Bean(name="SSOAwsProperties")
	public PropertiesFactoryBean awsConfig() {
		PropertiesFactoryBean	bean	= new PropertiesFactoryBean();

		bean.setLocations(new ClassPathResource("property/local/aws-sso-properties.xml"));

		return bean;
	}
}
