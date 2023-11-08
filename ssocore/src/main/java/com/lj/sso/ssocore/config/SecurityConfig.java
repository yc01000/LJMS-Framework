package com.lj.sso.ssocore.config;

import com.lj.sso.ssocore.model.SsoAuthenticationToken;
import com.lj.sso.ssocore.security.SsoAuthenticationEntryPoint;
import com.lj.sso.ssocore.security.SsoAuthenticationProvider;
import com.lj.sso.ssocore.security.SsoLoginCallbackFilter;
import com.lj.sso.ssocore.security.vo.UserInfoVO;
import com.lj.sso.ssocore.util.SsoConstants;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Date;

@Configuration
public class SecurityConfig {

    @Bean
    public SsoLoginCallbackFilter ssoLoginCallbackFilter() {
        return new SsoLoginCallbackFilter();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, SsoLoginCallbackFilter ssoLoginCallbackFilter) throws Exception {
        http
                .headers(headers -> headers.frameOptions(f -> f.disable()))
                .csrf(c -> c.disable())
                .authorizeHttpRequests(c -> c.anyRequest().hasRole("USER"))
                .addFilterBefore(ssoLoginCallbackFilter, WebAsyncManagerIntegrationFilter.class)
                .addFilterBefore(new OncePerRequestFilter() {
                    @Override
                    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
                        UserInfoVO dummyUser = new UserInfoVO();
                        dummyUser.setId("DUMMYUSER01");
                        dummyUser.setUserName("김더미");
                        dummyUser.setSabun("11112222");
                        dummyUser.setDepartment("150020");
                        dummyUser.setEmail("laevus@jinair.com");
                        dummyUser.setEmployee(true);
                        dummyUser.setEmployeeYN("Y");

                        AbstractAuthenticationToken authentication = new SsoAuthenticationToken(dummyUser.getAuthorities(), dummyUser);
                        authentication.setAuthenticated(true);

                        UserInfoVO principal = (UserInfoVO) authentication.getPrincipal();
                        principal.setLoginTm(new Date());
                        principal.setLoginIp("127.0.0.1");
                        principal.setLoginChnlCd("SVC");

                        SecurityContext context = SecurityContextHolder.getContext();
                        context.setAuthentication(authentication);

                        HttpSession session = request.getSession();
                        session.setAttribute(SsoConstants.SPRING_SECURITY_CONTEXT, context);

                        filterChain.doFilter(request, response);
                    }
                }, SsoLoginCallbackFilter.class)
                .authenticationProvider(new SsoAuthenticationProvider())
                .httpBasic(c -> c.authenticationEntryPoint(new SsoAuthenticationEntryPoint()))
                .logout(logout -> logout.logoutUrl("/logout").invalidateHttpSession(true));

        return http.build();
    }
}
