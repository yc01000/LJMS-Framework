package com.lj.crewpnr.service;

import com.lj.crewpnr.mapper.pssdb.CommonMapper;
import com.lj.crewpnr.vo.CityAirportInfoVO;
import jakarta.annotation.PostConstruct;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CommonService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CommonService.class);
    @Autowired
    private CommonMapper commonMapper;
    private List<CityAirportInfoVO>			apoList;
    private Map<String, CityAirportInfoVO> apoMap;
    private List<CityAirportInfoVO>			depList;

    public CommonService() {

    }

    @PostConstruct
    public void postConstruct() {
        // 서버 로드 시 최초 1회 수행
        init();
    }

    public void init() {
        this.setCityAirportMap();
    }

    public CityAirportInfoVO getCityAirportInfo(String apoCd) {
        this.setCityAirportMap();

        if (StringUtils.isEmpty(apoCd)) {
            return null;
        }

        if (null != this.apoMap) {
            return this.apoMap.get(apoCd);
        }

        return null;
    }

    public void setCityAirportMap() {
        try {
            apoList	= getCityAirportListForInit();
        } catch (IllegalAccessException | InvocationTargetException e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("[CommonService.setCityAirportMap] {}", e.getMessage());
            }
        }

        if (null == apoList) {
            this.apoMap	= null;
            return;
        }

        Map<String, CityAirportInfoVO>	apoMap	= new HashMap<String, CityAirportInfoVO>();

        for (CityAirportInfoVO apoInfo : apoList) {
            apoMap.put(apoInfo.getApoCd(), apoInfo);
        }

        this.apoMap	= apoMap;
    }

    public List<CityAirportInfoVO> getCityAirportListForInit() throws IllegalAccessException, InvocationTargetException{
        List<CityAirportInfoVO>	orgCityAirportList	= getCityAirportListForCityAirport();

        if (CollectionUtils.isEmpty(orgCityAirportList)) {
            return null;
        }

        List<CityAirportInfoVO>	resultList	= new ArrayList<CityAirportInfoVO>();

        String	prevApoCd	= "";

        CityAirportInfoVO	tmpCityAirportInfo	= null;
        Map<String, String>	apoNmMap			= null;

        for (CityAirportInfoVO apoInfo : orgCityAirportList) {
            String	apoCd	= apoInfo.getApoCd();

            if (prevApoCd.equals(apoCd)) {
                if (StringUtils.isNotEmpty(apoInfo.getLangCd())
                        && StringUtils.isNotEmpty(apoInfo.getApoNm())) {
                    if (null == apoNmMap) {
                        apoNmMap	= new HashMap<String, String>();
                    }

                    apoNmMap.put(apoInfo.getLangCd(), apoInfo.getApoNm());
                }
            } else {
                if (null != tmpCityAirportInfo) {
                    tmpCityAirportInfo.setApoNmMap(apoNmMap);

                    resultList.add(tmpCityAirportInfo);
                }

                tmpCityAirportInfo	= new CityAirportInfoVO();
                apoNmMap		= new HashMap<String, String>();

                BeanUtils.copyProperties(tmpCityAirportInfo, apoInfo);

                if (StringUtils.isNotEmpty(apoInfo.getLangCd())
                        && StringUtils.isNotEmpty(apoInfo.getApoNm())) {
                    apoNmMap.put(apoInfo.getLangCd(), apoInfo.getApoNm());
                }
            }

            prevApoCd	= apoInfo.getApoCd();
        }

        if (null != tmpCityAirportInfo) {
            tmpCityAirportInfo.setApoNmMap(apoNmMap);

            resultList.add(tmpCityAirportInfo);
        }

        return resultList;
    }
    public List<CityAirportInfoVO> getCityAirportListForCityAirport() {
        return commonMapper.selectCityAirportListForCityAirport();
    }
}
