package com.lj.sso.ssocore.filter;

import com.google.gson.Gson;
import com.lj.sso.ssocore.model.SsoAuthenticationToken;
import com.lj.sso.ssocore.model.UserInfoVO;
import com.lj.sso.ssocore.util.LoggerUtils;
import com.lj.sso.ssocore.util.PEMUtils;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.crypto.RSADecrypter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.security.interfaces.RSAPrivateKey;
import java.util.Arrays;

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
        try {
            String token = Arrays.stream(request.getCookies())
                    .filter(t -> StringUtils.equals(t.getName(), "testcookie"))
                    .findFirst()
                    .orElse(null)
                    .getValue();

            JWEObject jwe = JWEObject.parse(token);
            jwe.decrypt(new RSADecrypter((RSAPrivateKey) PEMUtils.privateKey("certification/jwt/prikey.pem")));

            UserInfoVO userInfo = new Gson().fromJson(jwe.getPayload().toString(), UserInfoVO.class);

            LoggerUtils.d(LOGGER, "{}|{}", request.getAttribute("rid"), jwe.getPayload());

            AbstractAuthenticationToken authentication = new SsoAuthenticationToken(userInfo.getAuthorities(), userInfo);
            SecurityContext context = SecurityContextHolder.getContext();
            context.setAuthentication(authentication);
        } catch (Exception e) {
            LoggerUtils.d(LOGGER, "-|{}|{}", request.getAttribute("rid"), "JWT로 인가 실패 (JWT 없음)");
            filterChain.doFilter(request, response);
            return;
        }

        filterChain.doFilter(request, response);
    }
}
