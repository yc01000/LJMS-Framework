package com.lj.crewpnr.mapper.pssdb;

import com.lj.core.commoncode.vo.CityAirportInfoVO;

import java.util.List;

@Deprecated
public interface CommonMapper {
    List<CityAirportInfoVO> selectCityAirportListForCityAirportHandler();
}
