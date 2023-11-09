package com.lj.crewpnr.controller;

import com.google.gson.Gson;
import com.lj.crewpnr.vo.CreateBookingsResultVO;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;

@RestController
public class MailController {

    @Value("${server.scheme}://${server.name}")
    String serverEndpoint;

    @RequestMapping(value="/mail/createBookingsResult", produces="text/html;charset=utf-8")
    @ResponseBody
    public String createBookingsResult(String q) {
        String contents = "";
        try {
            CreateBookingsResultVO result = new Gson().fromJson(new String(Base64.decodeBase64(q.getBytes(StandardCharsets.UTF_8))), CreateBookingsResultVO.class);
            contents = """
            <ol>
                <li>처리 시간: %s ~ %s</li>
                <li>
                    처리 건수:
                    <br>- 전체: %d건
                    <br>- 성공: %d건
                    <br>- 실패: %d건
                </li>
                <li>결과 확인: %s</li>
            </ol>
            """.formatted(
                    result.getDateStart(),
                    result.getDateEnd(),
                    result.getAllCount(),
                    result.getSuccessCount(),
                    result.getFailureCount(),
                    serverEndpoint + "/reservations");
        } catch(Exception e) {
            contents = "Server error occured.";
        }
        return "<html><body>" + contents + "</body></html>";
    }
}
