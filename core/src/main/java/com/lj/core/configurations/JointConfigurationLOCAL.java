package com.lj.core.configurations;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;


/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ JointConfiguration.java
 * </pre>
 * 
 *  @author  : sryu
 *  @date    : 2017. 8. 4. 오후 4:39:51 
 *  @version : 1.0
 *  @desc    : com.lj.support 라이브러리 로드시 자동으로 설정되어야 할 context 를 기술하는 Annotaion configuration class
 */
@Configuration
@MatcherProfile("local")
public class JointConfigurationLOCAL {
	/**
	 * about Shared properties
	 */
	@Bean(name="IntegrationProperties")
	public PropertiesFactoryBean integrationConfig() {
		PropertiesFactoryBean	bean	= new PropertiesFactoryBean();
		bean.setLocations(new ClassPathResource("property/local/integration-properties.xml"));
		return bean;
	}
}
