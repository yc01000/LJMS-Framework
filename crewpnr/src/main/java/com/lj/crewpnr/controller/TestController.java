package com.lj.crewpnr.controller;

import com.lj.core.integration.soap.ibs.IbsSoapProperty;
import com.lj.core.integration.soap.ibs.api.booking.RetrieveBooking;
import com.lj.core.integration.soap.ibs.domain.booking.BookingChannelType;
import com.lj.core.integration.soap.ibs.domain.booking.RetrieveBookingRQ;
import com.lj.core.integration.soap.ibs.domain.booking.RetrieveBookingRS;
import com.lj.core.util.WebUtils;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Resource(name="RetrieveBooking")
    private RetrieveBooking retrieveBooking;

    @RequestMapping("/test")
    public String test(String pnrNo) {
        BookingChannelType channel = new BookingChannelType();
        channel.setChannelType("API");
        channel.setChannel("CWI");
        channel.setLocale("ko_KR");

        IbsSoapProperty property = new IbsSoapProperty("TEST");
        property.setUsername("jinair");
        property.setPassword("jinatiflyapi");

        RetrieveBookingRQ retrieveBookingRQ = new RetrieveBookingRQ();
        retrieveBookingRQ.setAirlineCode("LJ");
        retrieveBookingRQ.setBookingChannel(channel);
        retrieveBookingRQ.setPnrNumber(pnrNo);
        RetrieveBookingRS retrieveBookingRS = retrieveBooking.request(retrieveBookingRQ, property);
        return WebUtils.toJson(retrieveBookingRS);
    }
}
