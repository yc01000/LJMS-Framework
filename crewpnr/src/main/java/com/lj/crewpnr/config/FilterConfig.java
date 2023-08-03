package com.lj.crewpnr.config;

import com.lj.sso.ssocore.security.SsoLoginCallbackFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<SsoLoginCallbackFilter> secondFilter() {
        FilterRegistrationBean<SsoLoginCallbackFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new SsoLoginCallbackFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1);
        registrationBean.setName("second-filter");
        return registrationBean;
    }
}
