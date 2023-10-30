package com.lj.crewpnr.controller;

import com.google.gson.Gson;
import com.lj.crewpnr.vo.CreateBookingsResultVO;
import org.apache.commons.codec.binary.Base64;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;

@RestController
public class MailController {

    @RequestMapping(value="/mail/createBookingsResult", produces="text/html;charset=utf-8")
    @ResponseBody
    public String createBookingsResults(String q) {
        String contents = "";
        try {
            // String decrypted = KmsMasterKeyService.decrypt(q); 암호화 할 필요 있을 경우에만
            CreateBookingsResultVO result = new Gson().fromJson(new String(Base64.decodeBase64(q.getBytes(StandardCharsets.UTF_8))), CreateBookingsResultVO.class);
            final String FORMAT = "<ul><li>전체 요청 수: %d</li><li>예약 성공 수: %d</li><li>예약 실패 수: %d</li></ul>";
            contents = String.format(FORMAT, result.getAllCount(), result.getSuccessCount(), result.getFailureCount());
        } catch(Exception e) {
            contents = "Server error occured.";
        }
        return "<html><body>" + contents + "</body></html>";
    }
}
