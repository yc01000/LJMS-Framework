package com.lj.sample.service;

import com.google.gson.Gson;
import com.lj.core.integration.soap.ibs.IbsSoapProperty;
import com.lj.core.integration.soap.ibs.api.booking.RetrieveBooking;
import com.lj.core.integration.soap.ibs.domain.booking.BookingChannelType;
import com.lj.core.integration.soap.ibs.domain.booking.RetrieveBookingRQ;
import com.lj.core.integration.soap.ibs.domain.booking.RetrieveBookingRS;
import com.lj.core.mail.service.MailService;
import com.lj.core.mail.vo.MailInfoVO;
import com.lj.core.util.LoggerUtils;
import com.lj.core.util.WebUtils;
import com.lj.sample.mapper.intdb.INTDBSampleMapper;
import com.lj.sample.mapper.pssdb.PSSDBSampleMapper;
import com.lj.sample.model.ResultMapVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleService.class);

    @Autowired
    private RetrieveBooking retrieveBooking;

    @Autowired
    private PSSDBSampleMapper pssdbSampleMapper;

    @Autowired
    private INTDBSampleMapper intdbSampleMapper;

    @Autowired
    private MailService mailService;

    public String retrieveBooking(String pnrNo) {
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

    public String selectFromPSSDB(String id) {
        return WebUtils.toJson(pssdbSampleMapper.select(id));
    }

    public String selectFromINTDB(String staffNum) {
        return WebUtils.toJson(intdbSampleMapper.select(staffNum));
    }

    public String sendMail(String email) {
        MailInfoVO mail = new MailInfoVO();
        mail.setMailContentsType(MailInfoVO.MailContentType.URL);
        mail.setTaskId(74);
        mail.setReceiverEmail(email);
        mail.setReceiverName(email);
        mail.setMailTitle("[JINAIR] 정보주체 이외로 부터 수집한 개인정보의 수집 출처 안내");
        mail.setMailContents("https://stgwww.jinair.com/mail/authcode?q=AQICAHjUTEIVn2DkoovB9aHnGU%2BcDTaEKrmcE98cBwl6kRwymgGZ19tnz3Wwf3PYO8P0OU3mAAAAaDBmBgkqhkiG9w0BBwagWTBXAgEAMFIGCSqGSIb3DQEHATAeBglghkgBZQMEAS4wEQQMDf2MooC8e6JDtctzAgEQgCVGJak9iYQVqAGC9kfQoJmaywGUG%2BD3ZjWMaBdMZsZkWZVAG7kK");
        mail.setReceiverId("laevus");
        mailService.send(mail);
        return WebUtils.toJson(ResultMapVO.simpleResult("result", "SUCCESS"));
    }
}
