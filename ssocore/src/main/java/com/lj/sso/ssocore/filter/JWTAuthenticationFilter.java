package com.lj.sso.ssocore.filter;

import com.lj.sso.ssocore.util.LoggerUtils;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class JWTAuthenticationFilter extends OncePerRequestFilter {

    private final static Logger LOGGER = LoggerFactory.getLogger(JWTAuthenticationFilter.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        LoggerUtils.d(LOGGER, "+|{}", request.getAttribute("rid"));

        if(SecurityContextHolder.getContext().getAuthentication() != null) {
            LoggerUtils.d(LOGGER, "-|{}|{}", request.getAttribute("rid"), "이미 인가됨");
            filterChain.doFilter(request, response);
            return;
        }

        // TODO Authorization Header 또는 쿠키로부터 JWT를 읽어 들여 인가 처리

        LoggerUtils.d(LOGGER, "-|{}|{}", request.getAttribute("rid"), "JWT로 인가 실패 (JWT 없음)");
        filterChain.doFilter(request, response);
    }
}
