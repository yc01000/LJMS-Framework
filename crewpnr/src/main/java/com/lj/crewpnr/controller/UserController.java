package com.lj.crewpnr.controller;

import com.lj.crewpnr.vo.ResultMapVO;
import com.lj.sso.ssocore.util.PrincipalUtils;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
public class UserController {

    @Value("${server.scheme}://${server.name}")
    String serverEndpoint;

    @RequestMapping(value="/user/userinfo", method=RequestMethod.GET)
    @ResponseBody
    public String userinfo() {
        return ResultMapVO.toJson(ResultMapVO.simpleResult("result", PrincipalUtils.user()));
    }

    @RequestMapping("/user/signout")
    public String isDomestic() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        request.getSession().invalidate();
//        return "redirect:" + serverEndpoint + "/index.html";
        return "redirect:https://ssostg.jinair.com/logout";
    }
}
