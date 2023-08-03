package com.lj.sso.ssocore.security.vo;

import java.io.Serializable;
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
public class LoginUserInfoVO implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 787363593763508355L;

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
	 * 로그인 IP
	 */
	private String	loginIp;

	/**
	 * 로그인 시간
	 */
	private Date	loginTm;

	/**
	 * 로그인 채널
	 */
	private String	loginChnlCd;

	/**
	 * 사용자 권한 정보
	 */
	private List<String> authorities;

	/**
	 * 소속 그룹 정보
	 */
	private List<Integer>	grpNoList;
	
	/**
	 * 접속 기기 
	 */
	private String acsDvc;
	
	/**
	 * HTTP Session ID
	 */
	private String sessionId;
	
	/**
	 * 최종 접근 일시
	 */
	private Date lastAccessTime;

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

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Date getLoginTm() {
		return loginTm;
	}

	public void setLoginTm(Date loginTm) {
		this.loginTm = loginTm;
	}

	public String getLoginChnlCd() {
		return loginChnlCd;
	}

	public void setLoginChnlCd(String loginChnlCd) {
		this.loginChnlCd = loginChnlCd;
	}

	public List<String> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<String> authorities) {
		this.authorities = authorities;
	}

	public void addAuthority(String authority) {
		if (null == this.authorities) {
			this.authorities	= new ArrayList<String>();
		}

		this.authorities.add(authority);
	}
	
	public List<Integer> getGrpNoList() {
		return grpNoList;
	}

	public void setGrpNoList(List<Integer> grpNoList) {
		this.grpNoList = grpNoList;
	}

	public String getAcsDvc() {
		return acsDvc;
	}

	public void setAcsDvc(String acsDvc) {
		this.acsDvc = acsDvc;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Date getLastAccessTime() {
		return lastAccessTime;
	}

	public void setLastAccessTime(Date lastAccessTime) {
		this.lastAccessTime = lastAccessTime;
	}	
}
