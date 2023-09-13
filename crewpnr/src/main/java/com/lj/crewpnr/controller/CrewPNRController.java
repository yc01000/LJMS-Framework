package com.lj.crewpnr.controller;

import com.lj.core.integration.soap.ibs.api.booking.GetAirAvailability;
import com.lj.core.util.WebUtils;
import com.lj.crewpnr.mapper.pssdb.CrewBookingMapper;
import com.lj.crewpnr.service.CrewBookingService;
import com.lj.crewpnr.vo.*;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class CrewPNRController {
    @Autowired
    private CrewBookingService crewBookingService;
    @Autowired
    private CrewBookingMapper crewBookingMapper;
    @Resource(name="GetAirAvailability")
    private GetAirAvailability airAvailability;

    @RequestMapping("/crew/createBookings")
    public String createBookings(@RequestParam("file") MultipartFile file) throws Exception {
        ResultMapVO resultMapVO = crewBookingService.createBookings(file);
        return WebUtils.toJson(resultMapVO);
    }

    @RequestMapping("/crew/getReservationSummary")
    public String getReservationSummary(ReservationSummaryCriteriaVO criteriaVO) throws Exception {
        criteriaVO.setDepStartDate("2023-09-05");
        criteriaVO.setDepEndDate("2023-09-27");
        criteriaVO.setStnfrCode("GMP");
        criteriaVO.setStntoCode("CJU");
        ResultMapVO reservationSummaryList = crewBookingService.getReservationSummary(criteriaVO);
        return WebUtils.toJson(reservationSummaryList);
    }

    @RequestMapping("/crew/getCreateBookingFailLog")
    public String getCreatePNRHistory(CrewPNRLogCriteriaVO criteriaVO) throws Exception {

        criteriaVO.setStnfrCode("GMP");
        criteriaVO.setStntoCode("CJU");
        criteriaVO.setBrdStrtDt("20230904");
        criteriaVO.setBrdEndDt("20230904");
        criteriaVO.setFareClass("U1");
        criteriaVO.setPaxCount(5);

        return WebUtils.toJson(crewBookingMapper.getCreateBookingFailLog(criteriaVO));
    }
}
