package com.lj.crewpnr.service;

import com.google.gson.Gson;
import com.lj.core.integration.soap.ibs.IbsSoapProperty;
import com.lj.core.integration.soap.ibs.api.booking.RetrieveBooking;
import com.lj.core.integration.soap.ibs.domain.booking.BookingChannelType;
import com.lj.core.integration.soap.ibs.domain.booking.RetrieveBookingRQ;
import com.lj.core.integration.soap.ibs.domain.booking.RetrieveBookingRS;
import com.lj.core.util.LoggerUtils;
import com.lj.core.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BookingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookingService.class);

    @Autowired
    private RetrieveBooking retrieveBooking;

    public String retrieve(String pnrNo) {
        LoggerUtils.d(LOGGER, "+|/sample/ibs|{}", pnrNo);

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

        LoggerUtils.d(LOGGER, "-|/sample/ibs|{}", new Gson().toJson(retrieveBookingRS.getErrorType()));

        return WebUtils.toJson(retrieveBookingRS);
    }
}
