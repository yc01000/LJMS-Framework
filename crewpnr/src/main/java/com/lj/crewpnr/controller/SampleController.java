package com.lj.crewpnr.controller;

import com.lj.core.commoncode.handler.CityAirportHandler;
import com.lj.core.commoncode.handler.CodeHandler;
import com.lj.core.commoncode.handler.CountryHandler;
import com.lj.core.commoncode.handler.RegionHandler;
import com.lj.core.mail.service.MailService;
import com.lj.core.mail.vo.MailInfoVO;
import com.lj.core.util.WebUtils;
import com.lj.crewpnr.mapper.pssdb.PSSDBSampleMapper;
import com.lj.crewpnr.service.BookingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.security.Principal;
import java.sql.SQLException;

@Controller
public class SampleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    private BookingService bookingService;

    @Autowired
    private MailService mailService;

    @Autowired
    private PSSDBSampleMapper pssdbSampleMapper;

    @Autowired
    private CodeHandler codeHandler;

    @Autowired
    private RegionHandler regionHandler;

    @Autowired
    private CountryHandler countryHandler;

    @Autowired
    private CityAirportHandler cityAirportHandler;

    @RequestMapping("/")
    public String index() throws SQLException {
        return "redirect:/index.html";
    }

    // http://localhost:8080/sample/ibs?pnrNo=X2E9W7
    @RequestMapping("/sample/ibs")
    @ResponseBody
    public String test(String pnrNo) throws SQLException {
        return bookingService.retrieve(pnrNo);
    }

    // http://localhost:8080/sample/pssdb?id=LAEVUS124
    @RequestMapping("/sample/pssdb")
    @ResponseBody
    public String testPSSDB(String id) throws SQLException {
        return WebUtils.toJson(pssdbSampleMapper.select(id));
    }

    @RequestMapping("/sample/email")
    @ResponseBody
    @ResponseStatus(value= HttpStatus.NO_CONTENT)
    public void sampleEmail(String email) {
        MailInfoVO mail = new MailInfoVO();
        mail.setMailContentsType(MailInfoVO.MailContentType.URL);
        mail.setTaskId(941);
        mail.setReceiverEmail(email);
        mail.setReceiverName(email);
        mail.setReceiverId("1");
        mail.setMailTitle("[JINAIR] 정보주체 이외로 부터 수집한 개인정보의 수집 출처 안내");
        mail.setMailContents("https://stgwww.jinair.com/HOM/templates/milk_partners_join.html");
        mailService.send(mail);
    }

    // http://localhost:8080/sample/commoncode/codes/AGT001/01
    @RequestMapping("/sample/commoncode/codes/{categoryCode}/{detailCode}")
    @ResponseBody
    public String code(@PathVariable String categoryCode, @PathVariable String detailCode) {
        return WebUtils.toJson(codeHandler.getCodeInfo(categoryCode, detailCode));
    }

    // http://localhost:8080/sample/commoncode/regions/NEA
    @RequestMapping("/sample/commoncode/regions/{regionCode}")
    @ResponseBody
    public String region(@PathVariable String regionCode) {
        return WebUtils.toJson(regionHandler.getRegionInfo(regionCode));
    }

    // http://localhost:8080/sample/commoncode/countries/TWN
    @RequestMapping("/sample/commoncode/countries/{countryCode}")
    @ResponseBody
    public String country(@PathVariable String countryCode) {
        return WebUtils.toJson(countryHandler.getCountryInfo(countryCode));
    }

    // http://localhost:8080/sample/commoncode/airports/ICN
    @RequestMapping("/sample/commoncode/airports/{airportCode}")
    @ResponseBody
    public String airport(@PathVariable String airportCode) {
        return WebUtils.toJson(cityAirportHandler.getCityAirportInfo(airportCode));
    }

    // http://localhost:8080/sample/principal
    @RequestMapping("/sample/principal")
    @ResponseBody
    public String principal(Principal principal) {
        return WebUtils.toJson(principal);
    }
}
