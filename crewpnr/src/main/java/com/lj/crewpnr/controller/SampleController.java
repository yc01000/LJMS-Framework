package com.lj.crewpnr.controller;

import com.lj.core.commoncode.handler.CityAirportHandler;
import com.lj.core.commoncode.handler.CodeHandler;
import com.lj.core.commoncode.handler.CountryHandler;
import com.lj.core.commoncode.handler.RegionHandler;
import com.lj.core.util.WebUtils;
import com.lj.crewpnr.common.IBSDomainUtils;
import com.lj.crewpnr.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;

@Controller
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @Autowired
    private CodeHandler codeHandler;

    @Autowired
    private RegionHandler regionHandler;

    @Autowired
    private CountryHandler countryHandler;

    @Autowired
    private CityAirportHandler cityAirportHandler;

    @Value("${server.scheme}://${server.name}")
    String serverEndpoint;

    // http://localhost:8080/sample/ibs?pnrNo=X2E9W7
    @RequestMapping(value="/sample/ibs", method=RequestMethod.GET)
    @ResponseBody
    public String test(String pnrNo) throws SQLException {
        return sampleService.retrieveBooking(pnrNo);
    }

    // http://localhost:8080/sample/pssdb?id=LAEVUS124
    @RequestMapping(value="/sample/pssdb", method=RequestMethod.GET)
    @ResponseBody
    public String testPSSDB(String id) throws SQLException {
        return sampleService.selectFromPSSDB(id);
    }

    // http://localhost:8080/sample/intdb?staffNum=LAEVUS124
    @RequestMapping(value="/sample/intdb", method=RequestMethod.GET)
    @ResponseBody
    public String sampleINTDB(String staffNum) throws SQLException {
        return sampleService.selectFromINTDB(staffNum);
    }

    @RequestMapping(value="/sample/email", method=RequestMethod.GET)
    @ResponseBody
    public String sampleEmail(String email) {
        return sampleService.sendMail(email);
    }

    // http://localhost:8080/sample/commoncode/codes/AGT001/01
    @RequestMapping(value="/sample/commoncode/codes/{categoryCode}/{detailCode}", method=RequestMethod.GET)
    @ResponseBody
    public String code(@PathVariable String categoryCode, @PathVariable String detailCode) {
        return WebUtils.toJson(codeHandler.getCodeInfo(categoryCode, detailCode));
    }

    // http://localhost:8080/sample/commoncode/regions/NEA
    @RequestMapping(value="/sample/commoncode/regions/{regionCode}", method=RequestMethod.GET)
    @ResponseBody
    public String region(@PathVariable String regionCode) {
        return WebUtils.toJson(regionHandler.getRegionInfo(regionCode));
    }

    // http://localhost:8080/sample/commoncode/countries/TWN
    @RequestMapping(value="/sample/commoncode/countries/{countryCode}", method=RequestMethod.GET)
    @ResponseBody
    public String country(@PathVariable String countryCode) {
        return WebUtils.toJson(countryHandler.getCountryInfo(countryCode));
    }

    // http://localhost:8080/sample/commoncode/airports/ICN
    @RequestMapping(value="/sample/commoncode/airports/{airportCode}", method=RequestMethod.GET)
    @ResponseBody
    public String airport(@PathVariable String airportCode) {
        return WebUtils.toJson(cityAirportHandler.getCityAirportInfo(airportCode));
    }

    // http://localhost:8080/sample/utils/isDomestic/ICN
    @RequestMapping(value="/sample/utils/isDomestic/{airportCode}", method=RequestMethod.GET)
    @ResponseBody
    public String isDomestic(@PathVariable String airportCode) {
        return "" + IBSDomainUtils.isDomestic(airportCode);
    }
}
