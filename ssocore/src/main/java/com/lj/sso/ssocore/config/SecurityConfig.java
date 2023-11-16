package com.lj.sso.ssocore.config;

import com.google.gson.Gson;
import com.lj.sso.ssocore.filter.DummyUserFilter;
import com.lj.sso.ssocore.filter.SsoLoginCallbackFilter;
import com.lj.sso.ssocore.util.BinderUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class SecurityConfig {

    @Value("${sso.using-dummy-login}")
    private boolean usingDummyLogin;

    @Value("${sso.ignoring-urls}")
    private List<String> ssoIgnoringUrls;

    @Bean
    public SsoLoginCallbackFilter ssoLoginCallbackFilter() {
        return new SsoLoginCallbackFilter();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        if(CollectionUtils.isEmpty(ssoIgnoringUrls)) {
            return web -> {};
        }

        var matchers = ssoIgnoringUrls.stream()
                .map(AntPathRequestMatcher::new)
                .toList()
                .toArray(new AntPathRequestMatcher[0]);
        return web -> web.ignoring().requestMatchers(matchers);
    }

//    @Bean
//    public UrlBasedCorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration configuration = new CorsConfiguration();
//        configuration.setAllowedOrigins(Arrays.asList("http://localhost:5173"));
//        configuration.setAllowedMethods(Arrays.asList("OPTIONS", "GET", "POST"));
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration);
//        return source;
//    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, SsoLoginCallbackFilter ssoLoginCallbackFilter) throws Exception {
        http
                .headers(headers -> headers.frameOptions(f -> f.disable()))
                .csrf(c -> c.disable())
//                .cors(Customizer.withDefaults())
                .authorizeHttpRequests(c -> c.anyRequest().hasRole("USER"))
                .addFilterBefore(ssoLoginCallbackFilter, WebAsyncManagerIntegrationFilter.class)
                .authenticationProvider(authenticationProvider())
                .httpBasic(c -> c.authenticationEntryPoint(authenticationEntryPoint()))
                .logout(logout -> logout.logoutUrl("/logout").invalidateHttpSession(true));
        if(usingDummyLogin) {
            http.addFilterBefore(new DummyUserFilter(), SsoLoginCallbackFilter.class);
        }

        return http.build();
    }

    public AuthenticationProvider authenticationProvider() {
        return new AuthenticationProvider() {

            private final static Logger LOGGER = LoggerFactory.getLogger(AuthenticationProvider.class);

            @Override
            public Authentication authenticate(Authentication authentication) throws AuthenticationException {
                LOGGER.info("Authentication is [{}]", BinderUtils.chompString(authentication));
                return authentication;
            }

            @Override
            public boolean supports(Class<?> authentication) {
                return false;
            }
        };
    }

    public AuthenticationEntryPoint authenticationEntryPoint() {
        return new AuthenticationEntryPoint() {

            private final static Logger	LOGGER = LoggerFactory.getLogger(AuthenticationEntryPoint.class);

            @Value("${sso.oauth.endpoint.authorize}")
            private String authorizeUri;

            @Value("${sso.oauth.client-id}")
            private String clientId;

            @Value("${sso.oauth.redirect-uri}")
            private String redirectUri;

            @Value("${sso.oauth.scope}")
            private String scope;

            @Value("${sso.policies.redirection.target-urls}")
            private List<String> redirectionTargetUrls;

            @Value("${sso.policies.default-return-uri}")
            private String defaultReturnUri;

            @Override
            public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException {
                LOGGER.info("request url is: {}", request.getRequestURI());

                if(redirectionTargetUrls.contains(request.getRequestURI())) {
                    String state = Base64.getEncoder().encodeToString(request.getRequestURI().getBytes(StandardCharsets.UTF_8));
                    String uri = String.format("%s?response_type=code&client_id=%s&redirect_uri=%s&&state=%s", authorizeUri, clientId, redirectUri, state);
                    new DefaultRedirectStrategy().sendRedirect(request, response, uri);
                    return;
                }

                String continueUrl = request.getHeader("referer");
                if(StringUtils.isBlank(continueUrl)) {
                    continueUrl = defaultReturnUri;
                }

                String state = Base64.getEncoder().encodeToString(continueUrl.getBytes(StandardCharsets.UTF_8));
                String uri = String.format("%s?response_type=code&client_id=%s&redirect_uri=%s&&state=%s", authorizeUri, clientId, redirectUri, state);
                LOGGER.info("move to sso: {}", uri);

                Map<String, Object> results = new HashMap<>();
                results.put("error", "not signed in");
                results.put("error_description", "redirect to 'redirect_uri' to sign");
                results.put("redirect_uri", uri);
                response.getOutputStream().write(new Gson().toJson(results).getBytes(StandardCharsets.UTF_8));
                response.setStatus(HttpServletResponse.SC_OK);
                response.addHeader("Content-Type", "application/json;charset=UTF-8");
            }
        };
    }
}
