package com.lj.crewpnr.controller;

import com.lj.core.util.WebUtils;
import com.lj.sso.ssocore.util.PrincipalUtils;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
public class UserController {

    @Value("${server.scheme}://${server.name}")
    String serverEndpoint;

    @RequestMapping("/user/userinfo")
    @ResponseBody
    public String userinfo() {
//        return "{\"userName\": \"No SSO Mode\"}";
        return WebUtils.toJson(PrincipalUtils.user());
    }

    @RequestMapping("/user/signout")
    public String isDomestic() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        request.getSession().invalidate();
        return "redirect:" + serverEndpoint + "/index.html";
    }
}
