package com.lj.crewpnr.controller;

import com.lj.core.integration.soap.ibs.api.booking.GetAirAvailability;
import com.lj.crewpnr.service.CrewBookingService;
import com.lj.crewpnr.vo.CrewPNRExcelVO;
import com.lj.crewpnr.vo.ResultMapVO;
import jakarta.annotation.Resource;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class CrewPNRController {
    @Autowired
    private CrewBookingService crewBookingService;
    @Resource(name="GetAirAvailability")
    private GetAirAvailability airAvailability;

    @RequestMapping("/crew/createBookings")
    public String createBookings(@RequestParam("file") MultipartFile file) throws Exception {



        ResultMapVO availabilityResult = crewBookingService.createBookings(file);
        return availabilityResult.get("result", String.class);
    }
}
