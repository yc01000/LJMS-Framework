package com.lj.core.commoncode.vo;

import java.io.Serializable;
import java.util.Map;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ RegionInfoVO.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @date    : 2017. 8. 10. 오전 11:50:48 
 *  @version : 1.0
 *  @desc    : 지역 정보 전체를 저장하는 vo 클래스
 */
public class RegionInfoVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2093459923294317263L;

	/**
	 * 지역 코드
	 */
	private String	rgnCd;

	/**
	 * 운항 여부 (Y/N)
	 */
	private String	oprtYn		= YNCode.NO;

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
	 * 지역 명
	 */
	private String	rgnNm;

	/**
	 * 지역명 맵 Map<langCd, rgnNm>
	 */
	private Map<String, String>	rgnNmMap;

	public String getRgnCd() {
		return rgnCd;
	}

	public void setRgnCd(String rgnCd) {
		this.rgnCd = rgnCd;
	}

	public String getOprtYn() {
		return oprtYn;
	}

	public void setOprtYn(String oprtYn) {
		this.oprtYn = oprtYn;
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
	 * jhbang (2017. 8. 17. 오전 11:47:36)<br/>
	 * desc   :  사용 금지 (myBatis를 위해 존재)
	 * @param  
	 * @return String
	 */
	public String getRgnNm() {
		return rgnNm;
	}

	/**
	 * jhbang (2017. 8. 17. 오전 11:47:43)<br/>
	 * desc   :  사용 금지 (myBatis를 위해 존재)
	 * @param  rgnNm
	 * @return void
	 */
	public void setRgnNm(String rgnNm) {
		this.rgnNm = rgnNm;
	}

	public Map<String, String> getRgnNmMap() {
		return rgnNmMap;
	}

	public void setRgnNmMap(Map<String, String> rgnNmMap) {
		this.rgnNmMap = rgnNmMap;
	}
}
