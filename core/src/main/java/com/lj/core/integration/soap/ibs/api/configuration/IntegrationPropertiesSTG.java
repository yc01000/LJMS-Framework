package com.lj.core.integration.soap.ibs.api.configuration;


import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.lj.core.configurations.MatcherProfile;

@Configuration
//@ComponentScan
//@Import(IntegrationSubConfiguration.class)
@MatcherProfile("stg")
public class IntegrationPropertiesSTG {
		
	/**
	 * about IBS properties
	 */
	@Bean(name ="IbsBookingProperties") 
	public PropertiesFactoryBean ibsConfig(){
		PropertiesFactoryBean bean = new PropertiesFactoryBean();
		bean.setLocations(
				new ClassPathResource("property/stg/ibs-property/general-properties.xml"),
				new ClassPathResource("property/stg/ibs-property/booking-properties.xml"), 
				new ClassPathResource("property/stg/ibs-property/checkin-properties.xml"),
				new ClassPathResource("property/stg/ibs-property/inventory-properties.xml")
			);
		return bean;		
	}	
}
