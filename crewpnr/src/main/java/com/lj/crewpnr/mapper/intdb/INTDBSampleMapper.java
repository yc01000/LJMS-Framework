package com.lj.crewpnr.mapper.intdb;

import com.lj.crewpnr.vo.sample.ARMSLogCrew;

public interface INTDBSampleMapper {

    ARMSLogCrew select(String staffNum);
}
