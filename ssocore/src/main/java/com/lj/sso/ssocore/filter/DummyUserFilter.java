package com.lj.sso.ssocore.filter;

import com.google.gson.Gson;
import com.lj.sso.ssocore.model.SsoAuthenticationToken;
import com.lj.sso.ssocore.model.UserInfoVO;
import com.lj.sso.ssocore.util.LoggerUtils;
import com.lj.sso.ssocore.util.SsoConstants;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Date;

public class DummyUserFilter extends OncePerRequestFilter {

    private final static Logger LOGGER = LoggerFactory.getLogger(DummyUserFilter.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        LoggerUtils.d(LOGGER, "+|{}", request.getAttribute("rid"));

        if(SecurityContextHolder.getContext().getAuthentication() != null) {
            LoggerUtils.d(LOGGER, "-|{}|{}", request.getAttribute("rid"), "이미 인가됨");
            filterChain.doFilter(request, response);
            return;
        }

        boolean developer = StringUtils.startsWith(request.getHeader("user-agent"), "PostmanRuntime") || StringUtils.contains(";http://localhost:5173;https://dssstg.jinair.com;https://local-crewpnr.jinair.com;", request.getHeader("origin"));
        if(!developer) {
            LoggerUtils.d(LOGGER, "-|{}|{}", request.getAttribute("rid"), "개발자가 아님");
            filterChain.doFilter(request, response);
            return;
        }

        UserInfoVO dummyUser = new UserInfoVO();
        dummyUser.setId("DUMMYUSER01");
        dummyUser.setUserName("김더미");
        dummyUser.setSabun("11112222");
        dummyUser.setDepartment("150020");
        dummyUser.setEmail("laevus@jinair.com");
        dummyUser.setEmployee(true);
        dummyUser.setEmployeeYN("Y");
        dummyUser.setLoginTm(new Date());
        dummyUser.setLoginIp("127.0.0.1");
        dummyUser.setLoginChnlCd("SVC");

        SecurityContextHolder.getContext().setAuthentication(new SsoAuthenticationToken(dummyUser.getAuthorities(), dummyUser));
        request.getSession().setAttribute(SsoConstants.SPRING_SECURITY_CONTEXT, SecurityContextHolder.getContext());

        LoggerUtils.d(LOGGER, "-|{}|{}|{}", request.getAttribute("rid"), "더미 계정으로 인가됨", new Gson().toJson(dummyUser));

        filterChain.doFilter(request, response);
    }
}
