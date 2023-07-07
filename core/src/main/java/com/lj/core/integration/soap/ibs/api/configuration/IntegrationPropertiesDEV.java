package com.lj.core.integration.soap.ibs.api.configuration;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.lj.core.configurations.MatcherProfile;

@Configuration
//@ComponentScan
//@Import(IntegrationSubConfiguration.class)
@MatcherProfile("dev")
public class IntegrationPropertiesDEV {
		
	/**
	 * about IBS properties
	 */
	@Bean(name ="IbsBookingProperties") 
	public PropertiesFactoryBean ibsConfig(){
		PropertiesFactoryBean bean = new PropertiesFactoryBean();
		bean.setLocations(
				new ClassPathResource("property/dev/ibs-property/general-properties.xml"),
				new ClassPathResource("property/dev/ibs-property/booking-properties.xml"), 
				new ClassPathResource("property/dev/ibs-property/checkin-properties.xml"),
				new ClassPathResource("property/dev/ibs-property/inventory-properties.xml")
			);
		return bean;		
	}	
}
