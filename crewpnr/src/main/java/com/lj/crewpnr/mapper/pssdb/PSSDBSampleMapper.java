package com.lj.crewpnr.mapper.pssdb;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

public interface PSSDBSampleMapper {

    Map<String, Object> select(String id);
}
