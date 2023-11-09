package com.lj.core.commoncode.vo;

import com.lj.core.util.CodeConstants.YNCode;

import java.io.Serializable;
import java.util.Map;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ CityAirportInfoVO.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @date    : 2017. 8. 10. 오전 11:51:16 
 *  @version : 1.0
 *  @desc    : 도시/공항 정보 전체를 저장하는 vo 클래스
 */
public class CityAirportInfoVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6439023664851176046L;

	/**
	 * 도시/공항 코드
	 */
	private String	apoCd;

	/**
	 * 지역 코드
	 */
	private String	rgnCd;

	/**
	 * 국가 코드
	 */
	private String	ctrCd;

	/**
	 * 직항 여부 (Y/N)
	 */
	private String	drctFltYn	= YNCode.NO;

	/**
	 * 다구간 여부 (Y/N)
	 */
	private String	mltCtyYn	= YNCode.NO;

	/**
	 * 사용 여부 (Y/N)
	 */
	private String	useYn		= YNCode.YES;

	/**
	 * 언어 코드
	 */
	private String	langCd;

	/**
	 * 도시/공항 명
	 */
	private String	apoNm;

	/**
	 * 도시/공항명 맵 Map<langCd, apoNm>
	 */
	private Map<String, String>	apoNmMap;

	public String getApoCd() {
		return apoCd;
	}

	public void setApoCd(String apoCd) {
		this.apoCd = apoCd;
	}

	public String getRgnCd() {
		return rgnCd;
	}

	public void setRgnCd(String rgnCd) {
		this.rgnCd = rgnCd;
	}

	public String getCtrCd() {
		return ctrCd;
	}

	public void setCtrCd(String ctrCd) {
		this.ctrCd = ctrCd;
	}

	public String getDrctFltYn() {
		return drctFltYn;
	}

	public void setDrctFltYn(String drctFltYn) {
		this.drctFltYn = drctFltYn;
	}

	public String getMltCtyYn() {
		return mltCtyYn;
	}

	public void setMltCtyYn(String mltCtyYn) {
		this.mltCtyYn = mltCtyYn;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public String getLangCd() {
		return langCd;
	}

	public void setLangCd(String langCd) {
		this.langCd = langCd;
	}

	/**
	 * jhbang (2017. 8. 17. 오전 11:47:19)<br/>
	 * desc   :  사용 금지 (myBatis를 위해 존재)
	 * @param  
	 * @return String
	 */
	public String getApoNm() {
		return apoNm;
	}

	/**
	 * jhbang (2017. 8. 17. 오전 11:47:24)<br/>
	 * desc   :  사용 금지 (myBatis를 위해 존재)
	 * @param  apoNm
	 * @return void
	 */
	public void setApoNm(String apoNm) {
		this.apoNm = apoNm;
	}

	public Map<String, String> getApoNmMap() {
		return apoNmMap;
	}

	public void setApoNmMap(Map<String, String> apoNmMap) {
		this.apoNmMap = apoNmMap;
	}
}
