package com.lj.core.commoncode.mapper;

import com.lj.core.commoncode.vo.CityAirportInfoVO;
import com.lj.core.commoncode.vo.CodeInfoVO;
import com.lj.core.commoncode.vo.CountryInfoVO;
import com.lj.core.commoncode.vo.DepartureAndArrivalAirportInfoVO;
import com.lj.core.commoncode.vo.HolidayVO;
import com.lj.core.commoncode.vo.MessageInfoVO;
import com.lj.core.commoncode.vo.RegionInfoVO;

import java.util.List;

// 공통 코드 Mapper
public interface CmmCodeMapper {

	// 코드 정보 전체 목록 조회
	List<CodeInfoVO> selectCodeListForCodeHandler();

	// 지역 정보 전체 목록 조회
	List<RegionInfoVO> selectRegionListForRegionHandler();

	// 특정 마스터 코드 정보 전체 목록 조회
	List<CodeInfoVO> selectCodeListForCodeHandler(String ctgrCd);

	// 국가 정보 전체 목록 조회
	List<CountryInfoVO> selectCountryListForCountryHandler();

	// 국가별 사용 언어 정보 전체 목록 조회
	List<CountryInfoVO> selectCountryLanguageListForCountryHandler();

	// 도시/공항 정보 전체 목록 조회
	List<CityAirportInfoVO> selectCityAirportListForCityAirportHandler();

	// 출발지 기준 도시/공항 정보 전체 목록 조회
	List<CityAirportInfoVO> selectCityAirportListByDeparture();

	// 공통 메시지 정보 전체 목록 조회
	List<MessageInfoVO> selectMessageListForMessageHandler();

	// 여정 선택 화면에서 사용하는 출발 공항코드를 조회합니다.
	List<DepartureAndArrivalAirportInfoVO> selectDepartureAirportList();

	// 여정 선택 화면에서 사용하는 도착 공항코드를 조회합니다.
	List<DepartureAndArrivalAirportInfoVO> selectArrivalAirportList();
	
	// 휴일 정보 조회
	List<HolidayVO> selectHolidaytForCodeHandler();
}
