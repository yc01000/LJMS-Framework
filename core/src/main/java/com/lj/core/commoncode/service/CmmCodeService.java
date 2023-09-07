package com.lj.core.commoncode.service;

import com.lj.core.commoncode.mapper.CmmCodeMapper;
import com.lj.core.commoncode.vo.CityAirportInfoVO;
import com.lj.core.commoncode.vo.CodeInfoVO;
import com.lj.core.commoncode.vo.CountryInfoVO;
import com.lj.core.commoncode.vo.DepartureAndArrivalAirportInfoVO;
import com.lj.core.commoncode.vo.HolidayVO;
import com.lj.core.commoncode.vo.MessageInfoVO;
import com.lj.core.commoncode.vo.RegionInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ CmmCodeServiceImpl.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @date    : 2017. 6. 7. 오후 8:52:29 
 *  @version : 1.0
 *  @desc    : 코드 관리 Service 구현체
 */
@Service("CmmCodeService")
public class CmmCodeService {

	@Autowired
	private CmmCodeMapper cmmCodeMapper;

	public List<CodeInfoVO> getCodeListForCodeHandler() {
		return cmmCodeMapper.selectCodeListForCodeHandler();
	}

	public List<CodeInfoVO> getCodeListForCodeHandler(String ctgrCd) {
		return cmmCodeMapper.selectCodeListForCodeHandler(ctgrCd);
	}

	public List<RegionInfoVO> getRegionListForRegionHandler() {
		return cmmCodeMapper.selectRegionListForRegionHandler();
	}

	public List<CountryInfoVO> getCountryListForCountryHandler() {
		return cmmCodeMapper.selectCountryListForCountryHandler();
	}

	public List<CountryInfoVO> getCountryLanguageListForCountryHandler() {
		return cmmCodeMapper.selectCountryLanguageListForCountryHandler();
	}

	public List<CityAirportInfoVO> getCityAirportListForCityAirportHandler() {
		return cmmCodeMapper.selectCityAirportListForCityAirportHandler();
	}

	public List<CityAirportInfoVO> getCityAirportListByDeparture() {
		return cmmCodeMapper.selectCityAirportListByDeparture();
	}

	public List<MessageInfoVO> getMessageListForMessageHandler() {
		return cmmCodeMapper.selectMessageListForMessageHandler();
	}

	public List<DepartureAndArrivalAirportInfoVO> getDepartureAirportList() {
		return cmmCodeMapper.selectDepartureAirportList();
	}

	public List<DepartureAndArrivalAirportInfoVO> getArrivalAirportList() {
		return cmmCodeMapper.selectArrivalAirportList();
	}

	public List<HolidayVO> getHolidaytForCodeHandler() {
		return cmmCodeMapper.selectHolidaytForCodeHandler();
	}
}
