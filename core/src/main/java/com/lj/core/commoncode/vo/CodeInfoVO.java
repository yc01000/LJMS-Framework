package com.lj.core.commoncode.vo;

import com.lj.core.common.util.CodeConstants.YNCode;

import java.io.Serializable;
import java.util.Map;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ CodeInfoVO.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @date    : 2017. 6. 13. 오후 8:32:46 
 *  @version : 1.0
 *  @desc    : 다국어를 지정한 특정 코드 정보 전체를 저장하는 vo 클래스
 */
public class CodeInfoVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5874529012211644817L;

	/**
	 * 구분 코드 (마스터 코드)
	 */
	private String	ctgrCd;

	/**
	 * 구분 코드 이름 (한국어만 지원)
	 */
	private String	ctgrCdNm;

	/**
	 * 구분 코드 사용 여부 (Y/N)
	 */
	private String	ctgrUseYn	= YNCode.YES;

	/**
	 * 언어 코드
	 */
	private String	langCd;

	/**
	 * 상세 코드
	 */
	private String	dtlCd;

	/**
	 * 상세 코드 이름
	 */
	private String	dtlCdNm;

	/**
	 * 코드 설명
	 */
	private String	cdXpln;

	/**
	 * ERP 표준 코드
	 */
	private String	erpStrdCd;

	/**
	 * 부가정보1
	 */
	private String	addInfo1;

	/**
	 * 부가정보2
	 */
	private String	addInfo2;

	/**
	 * 부가정보3
	 */
	private String	addInfo3;

	/**
	 * 표시 순서
	 */
	private int		stSeq;

	/**
	 * 상세 코드 사용 여부 (Y/N)
	 */
	private String	dtlUseYn	= YNCode.YES;

	/**
	 * 상세 코드 이름 맵 Map<langCd, dtlCdNm>
	 */
	private Map<String, String>	dtlCdNmMap;

	public String getCtgrCd() {
		return ctgrCd;
	}

	public void setCtgrCd(String ctgrCd) {
		this.ctgrCd = ctgrCd;
	}

	public String getCtgrCdNm() {
		return ctgrCdNm;
	}

	public void setCtgrCdNm(String ctgrCdNm) {
		this.ctgrCdNm = ctgrCdNm;
	}

	public String getCtgrUseYn() {
		return ctgrUseYn;
	}

	public boolean isCtgrUseable() {
		return YNCode.YES.equals(ctgrUseYn);
	}

	public void setCtgrUseYn(String ctgrUseYn) {
		this.ctgrUseYn = ctgrUseYn;
	}

	public void setCtgrUseable(boolean ctgrUseYn) {
		this.ctgrUseYn = ctgrUseYn ? YNCode.YES : YNCode.NO;
	}

	public String getDtlCd() {
		return dtlCd;
	}

	public void setDtlCd(String dtlCd) {
		this.dtlCd = dtlCd;
	}

	public String getLangCd() {
		return langCd;
	}

	public void setLangCd(String langCd) {
		this.langCd = langCd;
	}

	/**
	 * jhbang (2017. 8. 17. 오전 11:45:34)<br/>
	 * desc   :  사용 금지 (myBatis를 위해 존재)
	 * @param  
	 * @return String
	 */
	public String getDtlCdNm() {
		return dtlCdNm;
	}

	/**
	 * jhbang (2017. 8. 17. 오전 11:46:01)<br/>
	 * desc   :  사용 금지 (myBatis를 위해 존재)
	 * @param  dtlCdNm
	 * @return void
	 */
	public void setDtlCdNm(String dtlCdNm) {
		this.dtlCdNm = dtlCdNm;
	}

	public String getCdXpln() {
		return cdXpln;
	}

	public void setCdXpln(String cdXpln) {
		this.cdXpln = cdXpln;
	}

	public String getErpStrdCd() {
		return erpStrdCd;
	}

	public void setErpStrdCd(String erpStrdCd) {
		this.erpStrdCd = erpStrdCd;
	}

	public String getAddInfo1() {
		return addInfo1;
	}

	public void setAddInfo1(String addInfo1) {
		this.addInfo1 = addInfo1;
	}

	public String getAddInfo2() {
		return addInfo2;
	}

	public void setAddInfo2(String addInfo2) {
		this.addInfo2 = addInfo2;
	}

	public String getAddInfo3() {
		return addInfo3;
	}

	public void setAddInfo3(String addInfo3) {
		this.addInfo3 = addInfo3;
	}

	public int getStSeq() {
		return stSeq;
	}

	public void setStSeq(int stSeq) {
		this.stSeq = stSeq;
	}

	public String getDtlUseYn() {
		return dtlUseYn;
	}

	public boolean isDtlUseable() {
		return YNCode.YES.equals(dtlUseYn);
	}

	public void setDtlUseYn(String dtlUseYn) {
		this.dtlUseYn = dtlUseYn;
	}

	public void setDtlUseable(boolean dtlUseYn) {
		this.dtlUseYn = dtlUseYn ? YNCode.YES : YNCode.NO;
	}

	public Map<String, String> getDtlCdNmMap() {
		return dtlCdNmMap;
	}

	public void setDtlCdNmMap(Map<String, String> dtlCdNmMap) {
		this.dtlCdNmMap = dtlCdNmMap;
	}
}
