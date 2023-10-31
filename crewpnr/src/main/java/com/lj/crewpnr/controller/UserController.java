package com.lj.crewpnr.controller;

import com.lj.core.util.WebUtils;
import com.lj.sso.ssocore.util.PrincipalUtils;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
public class UserController {

    @RequestMapping("/user/userinfo")
    @ResponseBody
    public String userinfo() {
        return WebUtils.toJson(PrincipalUtils.user());
    }

    @RequestMapping("/user/signout")
    public String isDomestic() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        request.getSession().invalidate();
        return "redirect:/index.html";
    }
}
