package com.lj.crewpnr.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @Value("${server.scheme}://${server.name}")
    String serverEndpoint;

    @RequestMapping(value={"/", "/reservations", "/failhistories"})
    public String index(HttpServletRequest request) {
        String query = !StringUtils.equals(request.getRequestURI(), "/") ? "?page=" + request.getRequestURI() : "";
        return "redirect:" + serverEndpoint + "/index.html" + query;
    }
}
