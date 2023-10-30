package com.lj.crewpnr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @Value("${server.scheme}://${server.name}")
    String serverEndpoint;

    @RequestMapping(value={"/", "/reservations", "/failhistories"})
    public String index() {
        return "redirect:" + serverEndpoint + "/index.html";
    }
}
