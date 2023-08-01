package com.lj.crewpnr.mapper.emsdb;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

public interface EMSDBSampleMapper {

    Map<String, Object> select(String id);
}
