package com.lj.sso.ssocore.configuration;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

/**
 * 
 * <pre>
 * <B>lj.sso.support</B>
 *     |_ ConfigurationPRD.java
 * </pre>
 * 
 *  @author  : WCJUNG
 *  @date    : 2019. 3. 20. 오전 8:49:13 
 *  @version : 1.0
 *  @desc    : OAuth Configuration
 */
@Configuration
@MatcherProfile("prd")
public class ConfigurationPRD {
	/**
	 * jhbang (2017. 10. 23. 오후 1:53:32)<br/>
	 * desc   :  OAuth Property
	 * 
	 * @return
	 */
	@Bean(name="OAuthProperties")
	public PropertiesFactoryBean oAuthConfig() {
		PropertiesFactoryBean	bean	= new PropertiesFactoryBean();

		bean.setLocations(new ClassPathResource("property/prd/oauth-properties.xml"));

		return bean;
	}
	
	@Bean(name="SSOAwsProperties")
	public PropertiesFactoryBean awsConfig() {
		PropertiesFactoryBean	bean	= new PropertiesFactoryBean();

		bean.setLocations(new ClassPathResource("property/prd/aws-sso-properties.xml"));

		return bean;
	}
}
