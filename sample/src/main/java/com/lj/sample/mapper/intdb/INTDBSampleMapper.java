package com.lj.sample.mapper.intdb;

import com.lj.sample.model.sample.ARMSLogCrew;

public interface INTDBSampleMapper {

    ARMSLogCrew select(String staffNum);
}
