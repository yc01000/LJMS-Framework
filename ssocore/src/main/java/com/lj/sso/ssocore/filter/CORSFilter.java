package com.lj.sso.ssocore.filter;

import com.lj.sso.ssocore.util.LoggerUtils;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.UUID;

public class CORSFilter extends OncePerRequestFilter {

    private final static Logger LOGGER = LoggerFactory.getLogger(CORSFilter.class);

    private final String DOMAINS_COOKIE_SHARING = ";http://localhost:5173;https://local-crewpnr.jinair.com;";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        request.setAttribute("rid", UUID.randomUUID().toString());

        LoggerUtils.d(LOGGER, "+|{}|{}", request.getAttribute("rid"), request.getRequestURI());

        String credentials = StringUtils.contains(DOMAINS_COOKIE_SHARING, request.getHeader("origin")) ? "true" : "false";
        String origin = StringUtils.equals(credentials, "true") ? request.getHeader("origin") : "*";

        response.addHeader("Access-Control-Allow-Credentials", credentials);
        response.addHeader("Access-Control-Allow-Headers", "content-type");
        response.addHeader("Access-Control-Allow-Methods", request.getMethod());
        response.addHeader("Access-Control-Allow-Origin", origin);

        LoggerUtils.d(LOGGER, "-|{}|{}|{}", request.getAttribute("rid"), "CORS 설정됨", "origin: " + request.getHeader("origin"));

        filterChain.doFilter(request, response);
    }
}
