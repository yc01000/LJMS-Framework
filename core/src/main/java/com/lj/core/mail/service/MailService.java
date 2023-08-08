package com.lj.core.mail.service;

import com.lj.core.mail.mapper.EMSDBSampleMapper;
import com.lj.core.mail.vo.MailInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private EMSDBSampleMapper emsdbSampleMapper;

    public long send(MailInfoVO mail) {
        return emsdbSampleMapper.insert(mail);
    }
}
