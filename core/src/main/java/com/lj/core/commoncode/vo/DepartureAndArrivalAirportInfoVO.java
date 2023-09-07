package com.lj.core.commoncode.vo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * <B>support</B>
 *     |_ DepartureAndArrivalAirportInfoVO.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @since   : 2018. 3. 12. 오후 2:14:12 
 *  @version : 1.0
 *  @desc    : 출도착 공항 정보 저장용 vo 클래스
 */
public class DepartureAndArrivalAirportInfoVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -241893833872737251L;

	/**
	 * 출발 공항 일련번호
	 */
	private int		depApoSeq;

	/**
	 * 지역 코드
	 */
	private String	rgnCd;

	/**
	 * 국가 코드
	 */
	private String	ctrCd;

	/**
	 * 도시/공항 코드
	 */
	private String	apoCd;

	/**
	 * 언어 코드
	 */
	private String	langCd;

	/**
	 * 도시/공항 명
	 */
	private String	apoNm;

	/**
	 * 사용 여부
	 */
	private String	useYn;

	/**
	 * 정렬 순서
	 */
	private int		stSeq;

	/**
	 * 도시/공항명 맵 Map<langCd, apoNm>
	 */
	private Map<String, String>	apoNmMap;

	public int getDepApoSeq() {
		return depApoSeq;
	}

	public void setDepApoSeq(int depApoSeq) {
		this.depApoSeq = depApoSeq;
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

	public String getApoCd() {
		return apoCd;
	}

	public void setApoCd(String apoCd) {
		this.apoCd = apoCd;
	}

	public String getLangCd() {
		return langCd;
	}

	public void setLangCd(String langCd) {
		this.langCd = langCd;
	}

	public String getApoNm() {
		return apoNm;
	}

	public void setApoNm(String apoNm) {
		this.apoNm = apoNm;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public int getStSeq() {
		return stSeq;
	}

	public void setStSeq(int stSeq) {
		this.stSeq = stSeq;
	}

	public Map<String, String> getApoNmMap() {
		return apoNmMap;
	}

	public void setApoNmMap(Map<String, String> apoNmMap) {
		this.apoNmMap = apoNmMap;
	}

	public void addApoNmMap(String langCd, String apoNm) {
		if (null == this.apoNmMap) {
			this.apoNmMap	= new HashMap<String, String>();
		}

		this.addApoNmMap(langCd, apoNm);
	}
}
