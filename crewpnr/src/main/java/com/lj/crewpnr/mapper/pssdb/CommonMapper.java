package com.lj.crewpnr.mapper.pssdb;

import com.lj.crewpnr.common.vo.CityAirportInfoVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface CommonMapper {
    List<CityAirportInfoVO> selectCityAirportListForCityAirportHandler();
}
