package com.lj.sso.ssocore.controller;

import com.google.gson.Gson;
import com.lj.sso.ssocore.util.PrincipalUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping(value="/user/userinfo", method=RequestMethod.GET)
    @ResponseBody
    public String userinfo() {
        Map<String, Object> results = new HashMap<>();
        results.put("result", PrincipalUtils.user());
        return new Gson().toJson(results);
    }
}
