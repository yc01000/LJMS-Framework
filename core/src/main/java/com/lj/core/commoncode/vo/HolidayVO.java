package com.lj.core.commoncode.vo;

import java.io.Serializable;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ Holiday.java
 * </pre>
 * 
 *  @author  : ypark
 *  @date    : 2019. 4. 8
 *  @version : 1.0
 *  @desc    : 공휴일 정보 전체를 저장하는 vo 클래스
 */
public class HolidayVO implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -8973883814223205887L;
	private String	country;
	private String	ymd;
	private String	ymd_name;
	private String	color;

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getYmd() {
		return ymd;
	}
	public void setYmd(String ymd) {
		this.ymd = ymd;
	}
	public String getYmd_name() {
		return ymd_name;
	}
	public void setYmd_name(String ymd_name) {
		this.ymd_name = ymd_name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
