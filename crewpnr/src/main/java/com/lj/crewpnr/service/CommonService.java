package com.lj.crewpnr.service;

import com.lj.crewpnr.mapper.pssdb.CommonMapper;
import com.lj.crewpnr.common.vo.CityAirportInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonService {
    @Autowired
    private CommonMapper commonMapper;

    public List<CityAirportInfoVO> getCityAirportListForCityAirportHandler() {
        return commonMapper.selectCityAirportListForCityAirportHandler();
    }
}
