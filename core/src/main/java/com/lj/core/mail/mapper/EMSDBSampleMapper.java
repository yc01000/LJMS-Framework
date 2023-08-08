package com.lj.core.mail.mapper;

import com.lj.core.mail.vo.MailInfoVO;

import java.util.Map;

public interface EMSDBSampleMapper {

    Map<String, Object> select(String id);

    int insert(MailInfoVO entity);
}
