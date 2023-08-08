package com.lj.crewpnr.controller;

import com.lj.core.mail.service.MailService;
import com.lj.core.mail.vo.MailInfoVO;
import com.lj.core.util.WebUtils;
import com.lj.crewpnr.mapper.pssdb.PSSDBSampleMapper;
import com.lj.crewpnr.service.BookingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
public class SampleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    private BookingService bookingService;

    @Autowired
    private MailService mailService;

    @Autowired
    private PSSDBSampleMapper pssdbSampleMapper;

    @RequestMapping("/")
    @ResponseBody
    public String index() throws SQLException {
        return "Hello crewpnr";
    }

    @RequestMapping("/sample/ibs")
    public String test(String pnrNo) throws SQLException {
        return bookingService.retrieve(pnrNo);
    }

    @RequestMapping("/sample/pssdb")
    public String testPSSDB(String id) throws SQLException {
        return WebUtils.toJson(pssdbSampleMapper.select(id));
    }

    @RequestMapping("/sample/email")
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

    // 파일 업로드 샘플


}
