package com.lj.core.commoncode.vo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ RegionAirportInfoVO.java
 * </pre>
 *  공항 정보
 *  @author  : ssong
 *  @date    : 2017. 8. 31. 오후 7:01:14
 *  @version : 1.0
 *
 */
public class RegionAirportInfoVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4654550260173557162L;

	/**
	 * 공항코드 세자리 (ex, ICN, NRT)
	 */
	private String iataCityAirportCode;

	/**
	 * 공항이름
	 */
	private String cityAirportName;

	/**
	 * 출발지 공항정보의 경우 SEQ
	 */
	private String departureSeq;
	
	/**
	 * 국가코드
	 */
	private	String countryCode;

	/**
	 * 도착지 공항코드의 경우 가질수 있는 출발지 공항 SEQ
	 */
	private ArrayList<String> parentDepSeqList;

	/**
	 * 정렬 순서
	 */
	private int orderSeq;

	public String getIataCityAirportCode() {
		return iataCityAirportCode;
	}

	public void setIataCityAirportCode(String iataCityAirportCode) {
		this.iataCityAirportCode = iataCityAirportCode;
	}

	public String getCityAirportName() {
		return cityAirportName;
	}

	public void setCityAirportName(String cityAirportName) {
		this.cityAirportName = cityAirportName;
	}

	public String getDepartureSeq() {
		return departureSeq;
	}

	public void setDepartureSeq(String departureSeq) {
		this.departureSeq = departureSeq;
	}

	public ArrayList<String> getParentDepSeqList() {
		if (null == parentDepSeqList) {
			parentDepSeqList	= new ArrayList<String>();
		}
		return parentDepSeqList;
	}

	public void setParentDepSeqList(ArrayList<String> parentDepSeqList) {
		this.parentDepSeqList = parentDepSeqList;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public int getOrderSeq() {
		return orderSeq;
	}

	public void setOrderSeq(int orderSeq) {
		this.orderSeq = orderSeq;
	}
}
