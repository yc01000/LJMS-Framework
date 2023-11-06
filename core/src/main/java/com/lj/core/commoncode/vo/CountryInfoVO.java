package com.lj.core.commoncode.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ CountryInfoVO.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @date    : 2017. 8. 8. 오후 8:33:34 
 *  @version : 1.0
 *  @desc    : 국가 정보를 전체를 저장하는 vo 클래스
 */
public class CountryInfoVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1992350341916246445L;

	/**
	 * IATA 국가 코드
	 */
	private String	ctrCd;

	/**
	 * 지역 코드
	 */
	private String	rgnCd;

	/**
	 * ISO 2자리 국가 코드
	 */
	private String	ctrCd2Ltr;

	/**
	 * IBS POP 코드
	 */
	private String	ibsPopCd;

	/**
	 * 통화 코드
	 */
	private String	crncCd;

	/**
	 * 전화번호용 국가 번호
	 */
	private String	ctrNo;

	/**
	 * GMT 시간
	 */
	private String	gmtVlu;

	/**
	 * 운항 여부 (Y/N)
	 */
	private String	oprtYn	= YNCode.YES;

	/**
	 * 사용 여부 (Y/N)
	 */
	private String	useYn	= YNCode.YES;

	/**
	 * 언어 코드
	 */
	private String	langCd;

	/**
	 * 국가 이름
	 */
	private String	ctrNm;

	/**
	 * 국가명 맵 Map<langCd, ctrNm>
	 */
	private Map<String, String>	ctrNmMap;

	/**
	 * 국가 사용 언어 맵 Map<langCd, codeList>
	 */
	private Map<String, List<CodeInfoVO>>	langNmMap;

	public String getCtrCd() {
		return ctrCd;
	}

	public void setCtrCd(String ctrCd) {
		this.ctrCd = ctrCd;
	}

	public String getRgnCd() {
		return rgnCd;
	}

	public void setRgnCd(String rgnCd) {
		this.rgnCd = rgnCd;
	}

	public String getCtrCd2Ltr() {
		return ctrCd2Ltr;
	}

	public void setCtrCd2Ltr(String ctrCd2Ltr) {
		this.ctrCd2Ltr = ctrCd2Ltr;
	}

	public String getIbsPopCd() {
		return ibsPopCd;
	}

	public void setIbsPopCd(String ibsPopCd) {
		this.ibsPopCd = ibsPopCd;
	}

	public String getCrncCd() {
		return crncCd;
	}

	public void setCrncCd(String crncCd) {
		this.crncCd = crncCd;
	}

	public String getCtrNo() {
		return ctrNo;
	}

	public void setCtrNo(String ctrNo) {
		this.ctrNo = ctrNo;
	}

	public String getGmtVlu() {
		return gmtVlu;
	}

	public void setGmtVlu(String gmtVlu) {
		this.gmtVlu = gmtVlu;
	}

	public String getOprtYn() {
		return oprtYn;
	}

	public void setOprtYn(String oprtYn) {
		this.oprtYn = oprtYn;
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
	 * jhbang (2017. 8. 17. 오전 11:46:42)<br/>
	 * desc   :  사용 금지 (myBatis를 위해 존재)
	 * @param  
	 * @return String
	 */
	public String getCtrNm() {
		return ctrNm;
	}

	/**
	 * jhbang (2017. 8. 17. 오전 11:46:55)<br/>
	 * desc   :  사용 금지 (myBatis를 위해 존재)
	 * @param  ctrNm
	 * @return void
	 */
	public void setCtrNm(String ctrNm) {
		this.ctrNm = ctrNm;
	}

	public Map<String, String> getCtrNmMap() {
		return ctrNmMap;
	}

	public void setCtrNmMap(Map<String, String> ctrNmMap) {
		this.ctrNmMap = ctrNmMap;
	}

	public Map<String, List<CodeInfoVO>> getLangNmMap() {
		return langNmMap;
	}

	public void setLangNmMap(Map<String, List<CodeInfoVO>> langNmMap) {
		this.langNmMap = langNmMap;
	}
}
