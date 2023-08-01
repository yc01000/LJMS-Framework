package com.lj.crewpnr.controller;

import com.lj.core.integration.soap.ibs.IbsSoapProperty;
import com.lj.core.integration.soap.ibs.api.booking.RetrieveBooking;
import com.lj.core.integration.soap.ibs.domain.booking.BookingChannelType;
import com.lj.core.integration.soap.ibs.domain.booking.RetrieveBookingRQ;
import com.lj.core.integration.soap.ibs.domain.booking.RetrieveBookingRS;
import com.lj.core.util.WebUtils;
import com.lj.crewpnr.mapper.emsdb.EMSDBSampleMapper;
import com.lj.crewpnr.mapper.pssdb.PSSDBSampleMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
public class SampleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    private RetrieveBooking retrieveBooking;

    @Autowired
    private PSSDBSampleMapper pssdbSampleMapper;

    @Autowired
    private EMSDBSampleMapper emsdbSampleMapper;

    @RequestMapping("/sample/ibs")
    public String test(String pnrNo) throws SQLException {
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

    @RequestMapping("/sample/pssdb")
    public String testPSSDB(String id) throws SQLException {
        return WebUtils.toJson(pssdbSampleMapper.select(id));
    }

    @RequestMapping("/sample/emsdb")
    public String testEMSDB(String id) throws SQLException {
        return WebUtils.toJson(emsdbSampleMapper.select(id));
    }
}
