package com.lj.core.commoncode.vo;

import java.io.Serializable;
import java.util.List;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ RegionGrouplAirportVO.java
 * </pre>
 * 
 *  @author  : 박성한
 *  @since   : 2017. 12. 5. 오후 5:35:42 
 *  @version : 1.0
 *  @desc    : 공항 정보를 화면에 출력하는 VO
 */
public class RegionGrouplAirportVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4177438162039030712L;

	/**
	 * 지역
	 */
	private	String regionName;
	
	/**
	 * 지역코드
	 */
	private	String regionCode;

	/**
	 * 국가에 속하는 공항코드 정보
	 */
	private List<RegionAirportInfoVO> airportList;
	
	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}	

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public List<RegionAirportInfoVO> getAirportList() {
		return airportList;
	}

	public void setAirportList(List<RegionAirportInfoVO> airportList) {
		this.airportList = airportList;
	}
}
