package com.lj.sso.ssocore.security.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

import com.lj.sso.ssocore.common.util.SsoConstants.YNCode;

/**
 * 
 * <pre>
 * <B>ssoAuth</B>
 *     |_ TBSSOUserVO.java
 * </pre>
 * 
 *  @author  : WCJUNG
 *  @date    : 2019. 2. 13. 오후 1:16:14 
 *  @version : 1.0
 *  @desc    : 사용자 정보를 저장하는 vo 클래스
 */
public class TBSSOUserVO implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8451813445592858025L;

	/**
	 * 사용자 사번/ID
	 */
	private String	usrId;

	/**
	 * 이전 비밀번호
	 */
	private String	oldPw;

	/**
	 * 비밀번호
	 */
	private String	pw;

	/**
	 * 사용자 명
	 */
	private String	usrNm;

	/**
	 * 사용자 영문 명
	 */
	private String	usrEngNm;

	/**
	 * 임직원 여부 (Y/N)
	 */
	private String	empYn	= YNCode.NO;

	/**
	 * 소속
	 */
	private String	pozs;

	/**
	 * 부서 코드
	 */
	private String	deptCd;

	/**
	 * 생년월일
	 */
	private String	bthDt;

	/**
	 * 이메일
	 */
	private String	em;

	/**
	 * 전화번호
	 */
	private String	fonNo;

	/**
	 * 등록 상태 코드
	 */
	private String	rgstSttsCd;

	/**
	 * 비밀번호 재발급 여부
	 */
	private String	pwReisYn;

	/**
	 * 비밀번호 재발급 일자
	 */
	private String	pwChngDt;

	/**
	 * 로그인 오류 횟수
	 */
	private int		loginErrCnt;

	/**
	 * 신청 사유
	 */
	private String	rqRzn;

	/**
	 * 거절 사유
	 */
	private String	rjctRzn;

	/**
	 * 등록일시
	 */
	private Date	rgstDttm;

	/**
	 * 등록자(행위로그 필요 필드) 
	 */
	private String rgtntId;
	
	/**
	 * 등록자 IP
	 */
	private String	rgstIp;

	/**
	 * 등록 채널 (CHNLCATE)
	 */
	private String	rgstChnlCd;

	/**
	 * 수정일시
	 */
	private Date	updDttm;

	/**
	 * 수정자 ID
	 */
	private String	updrId;

	/**
	 * 수정자 IP
	 */
	private String	updIp;

	/**
	 * 수정 채널 (CHNLCATE)
	 */
	private String	updChnlCd;

	/**
	 * 검색 키
	 */
	private String	searchKey;

	/**
	 * 검색 단어
	 */
	private String	searchWord;

	/**
	 * 검색 시작일자
	 */
	private String	strtDt;

	/**
	 * 검색 종료일자
	 */
	private String	endDt;

	/**
	 * 등록일시 출력용
	 */
	private String	rgstDttmStr;

	/**
	 * 정렬 키
	 */
	private String	orderKey;

	/**
	 * 정렬 조건
	 */
	private String	orderCond;

	/**
	 * 그룹 번호
	 */
	private int		grpNo;

	/**
	 * 상태 코드 목록
	 */
	private List<String>	rgstSttsCdList;

	/**
	 * 최종 로그인 일시
	 */
	private Date lstLoginDttm;
	
	public String getUsrId() {
		return usrId;
	}

	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	public String getOldPw() {
		return oldPw;
	}

	public void setOldPw(String oldPw) {
		this.oldPw = oldPw;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getUsrNm() {
		return usrNm;
	}

	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
	}

	public String getUsrEngNm() {
		return usrEngNm;
	}

	public void setUsrEngNm(String usrEngNm) {
		this.usrEngNm = usrEngNm;
	}

	public String getEmpYn() {
		return empYn;
	}

	public boolean isEmployee() {
		return YNCode.YES.equals(empYn);
	}

	public void setEmpYn(String empYn) {
		if (null != empYn) {
			this.empYn = empYn.toUpperCase(Locale.ENGLISH);
		} else {
			this.empYn	= empYn;
		}
	}

	public void setEmployee(boolean empYn) {
		this.empYn = empYn ? YNCode.YES : YNCode.NO;
	}

	public String getPozs() {
		return pozs;
	}

	public void setPozs(String pozs) {
		this.pozs = pozs;
	}

	public String getDeptCd() {
		return deptCd;
	}

	public void setDeptCd(String deptCd) {
		this.deptCd = deptCd;
	}

	public String getBthDt() {
		return bthDt;
	}

	public void setBthDt(String bthDt) {
		if (StringUtils.isNotEmpty(bthDt)) {
			this.bthDt	= bthDt.replace("-", "");
		} else {
			this.bthDt	= bthDt;
		}
	}

	public String getEm() {
		return em;
	}

	public void setEm(String em) {
		this.em = em;
	}

	public String getFonNo() {
		return fonNo;
	}

	public void setFonNo(String fonNo) {
		this.fonNo = fonNo;
	}

	public String getRgstSttsCd() {
		return rgstSttsCd;
	}

	public void setRgstSttsCd(String rgstSttsCd) {
		this.rgstSttsCd = rgstSttsCd;
	}

	public String getPwReisYn() {
		return pwReisYn;
	}

	public void setPwReisYn(String pwReisYn) {
		this.pwReisYn = pwReisYn;
	}

	public String getPwChngDt() {
		return pwChngDt;
	}

	public void setPwChngDt(String pwChngDt) {
		this.pwChngDt = pwChngDt;
	}

	public int getLoginErrCnt() {
		return loginErrCnt;
	}

	public void setLoginErrCnt(int loginErrCnt) {
		this.loginErrCnt = loginErrCnt;
	}

	public String getRqRzn() {
		return rqRzn;
	}

	public void setRqRzn(String rqRzn) {
		this.rqRzn = rqRzn;
	}

	public String getRjctRzn() {
		return rjctRzn;
	}

	public void setRjctRzn(String rjctRzn) {
		this.rjctRzn = rjctRzn;
	}

	public Date getRgstDttm() {
		return rgstDttm;
	}

	public void setRgstDttm(Date rgstDttm) {
		this.rgstDttm = rgstDttm;

		SimpleDateFormat	sdf	= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.rgstDttmStr	= sdf.format(rgstDttm);
	}

	public String getRgstIp() {
		return rgstIp;
	}

	public void setRgstIp(String rgstIp) {
		this.rgstIp = rgstIp;
	}

	public String getRgstChnlCd() {
		return rgstChnlCd;
	}

	public void setRgstChnlCd(String rgstChnlCd) {
		this.rgstChnlCd = rgstChnlCd;
	}

	public Date getUpdDttm() {
		return updDttm;
	}

	public void setUpdDttm(Date updDttm) {
		this.updDttm = updDttm;
	}

	public String getUpdrId() {
		return updrId;
	}

	public void setUpdrId(String updrId) {
		this.updrId = updrId;
	}

	public String getUpdIp() {
		return updIp;
	}

	public void setUpdIp(String updIp) {
		this.updIp = updIp;
	}

	public String getUpdChnlCd() {
		return updChnlCd;
	}

	public void setUpdChnlCd(String updChnlCd) {
		this.updChnlCd = updChnlCd;
	}

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	public String getStrtDt() {
		return strtDt;
	}

	public void setStrtDt(String strtDt) {
		this.strtDt = strtDt;
	}

	public String getEndDt() {
		return endDt;
	}

	public void setEndDt(String endDt) {
		this.endDt = endDt;
	}

	public String getRgstDttmStr() {
		return rgstDttmStr;
	}

	public void setRgstDttmStr(String rgstDttmStr) {
		this.rgstDttmStr = rgstDttmStr;
	}

	public String getOrderKey() {
		return orderKey;
	}

	public void setOrderKey(String orderKey) {
		this.orderKey = orderKey;
	}

	public String getOrderCond() {
		return orderCond;
	}

	public void setOrderCond(String orderCond) {
		this.orderCond = orderCond;
	}

	public int getGrpNo() {
		return grpNo;
	}

	public void setGrpNo(int grpNo) {
		this.grpNo = grpNo;
	}

	public List<String> getRgstSttsCdList() {
		return rgstSttsCdList;
	}

	public void setRgstSttsCdList(List<String> rgstSttsCdList) {
		this.rgstSttsCdList = rgstSttsCdList;
	}

	public void addRgstSttsCdList(String rgstSttsCd) {
		if (null == this.rgstSttsCdList) {
			this.rgstSttsCdList	= new ArrayList<String>();
		}

		this.rgstSttsCdList.add(rgstSttsCd);
	}

	public Date getLstLoginDttm() {
		return lstLoginDttm;
	}

	public void setLstLoginDttm(Date lstLoginDttm) {
		this.lstLoginDttm = lstLoginDttm;
	}

	public String getRgtntId() {
		return rgtntId;
	}

	public void setRgtntId(String rgtntId) {
		this.rgtntId = rgtntId;
	}
}
