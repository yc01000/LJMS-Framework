package com.lj.sso.ssocore.util;

import com.lj.sso.ssocore.model.SsoAuthenticationToken;
import com.lj.sso.ssocore.security.vo.UserInfoVO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.security.Principal;

public class PrincipalUtils {

    // 현재 로그인한 유저 정보 취득
    public static UserInfoVO user() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Principal principal = request.getUserPrincipal();
        if(principal == null) {
            return null;
        }

        return (UserInfoVO) ((SsoAuthenticationToken) principal).getPrincipal();
    }
}
