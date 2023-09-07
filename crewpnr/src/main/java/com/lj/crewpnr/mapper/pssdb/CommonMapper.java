package com.lj.crewpnr.mapper.pssdb;

import com.lj.crewpnr.vo.CityAirportInfoVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface CommonMapper {
    List<CityAirportInfoVO> selectCityAirportListForCityAirport();
}
