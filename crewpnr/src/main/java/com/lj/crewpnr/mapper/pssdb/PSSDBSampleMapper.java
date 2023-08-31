package com.lj.crewpnr.mapper.pssdb;

import com.lj.crewpnr.model.TBIndvMbr;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

public interface PSSDBSampleMapper {

    TBIndvMbr select(String id);
}
