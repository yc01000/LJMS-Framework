package com.lj.sso.ssocore.security.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;

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
public class UserInfoVO implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4448326726820027402L;

	
	private boolean employee;
	
	/**
	 * 사용자 사번/ID
	 */
	private String id;
	
	/**
	 * 비밀번호
	 */
	private String pw;

    private String userName;
    
    private String userEngName;
    
    private String employeeYN;
    
    private String position;
    
    private String department;
    
    private String dob;
    
    private String email;
    
    private String tel;
    
    private String sabun;
    
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

	public boolean isEmployee() {
		return employee;
	}

	public void setEmployee(boolean employee) {
		this.employee = employee;
	}

	/**
	 * 사용자 권한 정보
	 */
	public Collection<GrantedAuthority> getAuthorities() {
		List<GrantedAuthority>	authList	= new ArrayList<GrantedAuthority>();

		authList.add(new GrantedAuthority() {
			/**
			 * serialVersionUID
			 */
			private static final long serialVersionUID = -6183109815163616436L;

			@Override
			public String getAuthority() {
				return "ROLE_USER";
			}
		});

		return authList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEngName() {
		return userEngName;
	}

	public void setUserEngName(String userEngName) {
		this.userEngName = userEngName;
	}

	public String getEmployeeYN() {
		return employeeYN;
	}

	public void setEmployeeYN(String employeeYN) {
		this.employeeYN = employeeYN;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSabun() {
		return sabun;
	}

	public void setSabun(String sabun) {
		this.sabun = sabun;
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
	
	
}
