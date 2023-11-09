package com.lj.sso.ssocore.filter;

import com.lj.sso.ssocore.model.SsoAuthenticationToken;
import com.lj.sso.ssocore.model.UserInfoVO;
import com.lj.sso.ssocore.util.SsoConstants;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Date;

public class DummyUserFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        boolean developer = StringUtils.equals(request.getHeader("referer"), "http://localhost:5173/");
        if(!developer) {
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
}
