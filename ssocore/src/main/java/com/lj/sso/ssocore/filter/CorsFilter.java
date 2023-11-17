package com.lj.sso.ssocore.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class CorsFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        final String DOMAINS_COOKIE_SHARING = ";http://localhost:5173;";

        String credentials = StringUtils.contains(DOMAINS_COOKIE_SHARING, request.getHeader("origin")) ? "true" : "false";
        String origin = StringUtils.equals(credentials, "true") ? request.getHeader("origin") : "*";
        response.addHeader("Access-Control-Allow-Credentials", credentials);
        response.addHeader("Access-Control-Allow-Headers", "content-type");
        response.addHeader("Access-Control-Allow-Methods", request.getMethod());
        response.addHeader("Access-Control-Allow-Origin", origin);
        filterChain.doFilter(request, response);
    }
}
