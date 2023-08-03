/**
 * Copyright © 2018. Jinair. All rights reserved.
 */
package com.lj.sso.ssocore.security.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * <pre>
 * <B>ssoAuth</B>
 *     |_ TBHanwayUserVO.java
 * </pre>
 * 
 *  @author  : WCJUNG
 *  @date    : 2019. 2. 13. 오전 10:25:10 
 *  @version : 1.0
 *  @desc    : 한웨이 사용자 정보 테이블
 */
public class TBHanwayUserVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3504746546744034379L;
	
	private String id;			//ID	VARCHAR2(20 BYTE)
	private String requetType;	//REQUESTTYPE	VARCHAR2(20 BYTE)
	private String companyCode;	//COMPANYCODE	CHAR(2 BYTE)
	private String login;		//LOGIN	VARCHAR2(20 BYTE)
	private String passwd;		//PASSWD	VARCHAR2(200 BYTE)
	private String email;		//EMAIL	VARCHAR2(200 BYTE)
	private String sabun;		//SABUN	VARCHAR2(20 BYTE)
	private String name;		//NAME	VARCHAR2(200 BYTE)
	private String lastName;	//LASTNAME	VARCHAR2(100 BYTE)
	private String firstName;	//FIRSTNAME	VARCHAR2(100 BYTE)
	private String engName;		//ENGNAME	VARCHAR2(200 BYTE)
	private String unitCode;	//UNITCODE	VARCHAR2(20 BYTE)
	private String unitName;	//UNITNAME	VARCHAR2(200 BYTE)
	private String unitNameEn;	//UNITNAMEEN	VARCHAR2(200 BYTE)
	private String commCode;	//COMMCODE	VARCHAR2(20 BYTE)
	private String commName;	//COMMNAME	VARCHAR2(200 BYTE)
	private String commNameEn;	//COMMNAMEEN	VARCHAR2(200 BYTE)
	private String titleCode;	//TITLECODE	VARCHAR2(50 BYTE)
	private String titleName;	//TITLENAME	VARCHAR2(200 BYTE)
	private String titleNameEn;	//TITLENAMEEN	VARCHAR2(200 BYTE)
	private String assCode;		//ASSCODE	VARCHAR2(20 BYTE)
	private String assName;		//ASSNAME	VARCHAR2(200 BYTE)
	private String assNameEn;	//ASSNAMEEN	VARCHAR2(200 BYTE)
	private String pstnCode;	//PSTNCODE	VARCHAR2(20 BYTE)
	private String pstnName;	//PSTNNAME	VARCHAR2(200 BYTE)
	private String pstnNameEn;	//PSTNNAMEEN	VARCHAR2(200 BYTE)
	private String levelCode;	//LEVELCODE	VARCHAR2(20 BYTE)
	private String levelNeme;	//LEVELNAME	VARCHAR2(200 BYTE)
	private String levelNameEn;	//LEVELNAMEEN	VARCHAR2(200 BYTE)
	private String occuCode;	//OCCUCODE	VARCHAR2(20 BYTE)
	private String occuName;	//OCCUNAME	VARCHAR2(200 BYTE)
	private String occuNameEn;	//OCCUNAMEEN	VARCHAR2(200 BYTE)
	private Date enterDate;		//ENTERDATE	DATE
	private String mobileTel;	//MOBILETEL	VARCHAR2(20 BYTE)
	private String officeTel;	//OFFICETEL	VARCHAR2(20 BYTE)
	private String homeTel;		//HOMETEL	VARCHAR2(20 BYTE)
	private String faxTel;		//FAXTEL	VARCHAR2(20 BYTE)
	private String inlineOfficeTel;	//INLINEOFFICETEL	VARCHAR2(20 BYTE)
	private String chargeBusiness;	//CHARGEBUSINESS	VARCHAR2(50 BYTE)
	private String lastEmployeeId;	//LASTEMPLOYEEID	VARCHAR2(20 BYTE)
	private Date requestDate;	//REQUESTDATE	DATE
	private String reserved1;	//RESERVED1	VARCHAR2(200 BYTE)
	private String reserved2;	//RESERVED2	VARCHAR2(200 BYTE)
	private String reserved3;	//RESERVED3	VARCHAR2(200 BYTE)
	private String reserved4;	//RESERVED4	VARCHAR2(200 BYTE)
	private String reserved5;	//RESERVED5	VARCHAR2(200 BYTE)
	private String enableMail;	//ENABLEMAIL	VARCHAR2(200 BYTE)
	private String sortKey;		//SORTKEY	VARCHAR2(20 BYTE)
	private String isAddtionalJob;	//ISADDITIONALJOB	VARCHAR2(20 BYTE)
	private String usageState;	//USAGESTATE	VARCHAR2(20 BYTE)
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRequetType() {
		return requetType;
	}
	public void setRequetType(String requetType) {
		this.requetType = requetType;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSabun() {
		return sabun;
	}
	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEngName() {
		return engName;
	}
	public void setEngName(String engName) {
		this.engName = engName;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getUnitNameEn() {
		return unitNameEn;
	}
	public void setUnitNameEn(String unitNameEn) {
		this.unitNameEn = unitNameEn;
	}
	public String getCommCode() {
		return commCode;
	}
	public void setCommCode(String commCode) {
		this.commCode = commCode;
	}
	public String getCommName() {
		return commName;
	}
	public void setCommName(String commName) {
		this.commName = commName;
	}
	public String getCommNameEn() {
		return commNameEn;
	}
	public void setCommNameEn(String commNameEn) {
		this.commNameEn = commNameEn;
	}
	public String getTitleCode() {
		return titleCode;
	}
	public void setTitleCode(String titleCode) {
		this.titleCode = titleCode;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getTitleNameEn() {
		return titleNameEn;
	}
	public void setTitleNameEn(String titleNameEn) {
		this.titleNameEn = titleNameEn;
	}
	public String getAssCode() {
		return assCode;
	}
	public void setAssCode(String assCode) {
		this.assCode = assCode;
	}
	public String getAssName() {
		return assName;
	}
	public void setAssName(String assName) {
		this.assName = assName;
	}
	public String getAssNameEn() {
		return assNameEn;
	}
	public void setAssNameEn(String assNameEn) {
		this.assNameEn = assNameEn;
	}
	public String getPstnCode() {
		return pstnCode;
	}
	public void setPstnCode(String pstnCode) {
		this.pstnCode = pstnCode;
	}
	public String getPstnName() {
		return pstnName;
	}
	public void setPstnName(String pstnName) {
		this.pstnName = pstnName;
	}
	public String getPstnNameEn() {
		return pstnNameEn;
	}
	public void setPstnNameEn(String pstnNameEn) {
		this.pstnNameEn = pstnNameEn;
	}
	public String getLevelCode() {
		return levelCode;
	}
	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}
	public String getLevelNeme() {
		return levelNeme;
	}
	public void setLevelNeme(String levelNeme) {
		this.levelNeme = levelNeme;
	}
	public String getLevelNameEn() {
		return levelNameEn;
	}
	public void setLevelNameEn(String levelNameEn) {
		this.levelNameEn = levelNameEn;
	}
	public String getOccuCode() {
		return occuCode;
	}
	public void setOccuCode(String occuCode) {
		this.occuCode = occuCode;
	}
	public String getOccuName() {
		return occuName;
	}
	public void setOccuName(String occuName) {
		this.occuName = occuName;
	}
	public String getOccuNameEn() {
		return occuNameEn;
	}
	public void setOccuNameEn(String occuNameEn) {
		this.occuNameEn = occuNameEn;
	}
	public Date getEnterDate() {
		return enterDate;
	}
	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}
	public String getMobileTel() {
		return mobileTel;
	}
	public void setMobileTel(String mobileTel) {
		this.mobileTel = mobileTel;
	}
	public String getOfficeTel() {
		return officeTel;
	}
	public void setOfficeTel(String officeTel) {
		this.officeTel = officeTel;
	}
	public String getHomeTel() {
		return homeTel;
	}
	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel;
	}
	public String getFaxTel() {
		return faxTel;
	}
	public void setFaxTel(String faxTel) {
		this.faxTel = faxTel;
	}
	public String getInlineOfficeTel() {
		return inlineOfficeTel;
	}
	public void setInlineOfficeTel(String inlineOfficeTel) {
		this.inlineOfficeTel = inlineOfficeTel;
	}
	public String getChargeBusiness() {
		return chargeBusiness;
	}
	public void setChargeBusiness(String chargeBusiness) {
		this.chargeBusiness = chargeBusiness;
	}
	public String getLastEmployeeId() {
		return lastEmployeeId;
	}
	public void setLastEmployeeId(String lastEmployeeId) {
		this.lastEmployeeId = lastEmployeeId;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public String getReserved1() {
		return reserved1;
	}
	public void setReserved1(String reserved1) {
		this.reserved1 = reserved1;
	}
	public String getReserved2() {
		return reserved2;
	}
	public void setReserved2(String reserved2) {
		this.reserved2 = reserved2;
	}
	public String getReserved3() {
		return reserved3;
	}
	public void setReserved3(String reserved3) {
		this.reserved3 = reserved3;
	}
	public String getReserved4() {
		return reserved4;
	}
	public void setReserved4(String reserved4) {
		this.reserved4 = reserved4;
	}
	public String getReserved5() {
		return reserved5;
	}
	public void setReserved5(String reserved5) {
		this.reserved5 = reserved5;
	}
	public String getEnableMail() {
		return enableMail;
	}
	public void setEnableMail(String enableMail) {
		this.enableMail = enableMail;
	}
	public String getSortKey() {
		return sortKey;
	}
	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
	}
	public String getIsAddtionalJob() {
		return isAddtionalJob;
	}
	public void setIsAddtionalJob(String isAddtionalJob) {
		this.isAddtionalJob = isAddtionalJob;
	}
	public String getUsageState() {
		return usageState;
	}
	public void setUsageState(String usageState) {
		this.usageState = usageState;
	}
}
