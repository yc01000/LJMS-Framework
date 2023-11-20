package com.lj.crewpnr.controller;

import com.lj.crewpnr.vo.ResultMapVO;
import com.lj.sso.ssocore.util.PrincipalUtils;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Hidden
public class UserController {

    @RequestMapping(value="/user/userinfo", method=RequestMethod.GET)
    @ResponseBody
    public String userinfo() {
        return ResultMapVO.toJson(ResultMapVO.simpleResult("result", PrincipalUtils.user()));
    }
}
