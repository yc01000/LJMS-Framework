package com.lj.crewpnr.vo;

import com.lj.crewpnr.vo.excel.CrewPNRExcelVO;
import com.lj.sso.ssocore.model.UserInfoVO;

import java.util.List;

public class CreateBookingsFormVO {

    private List<CrewPNRExcelVO> crewPNRExcelList;

    private UserInfoVO loginUser;

    public List<CrewPNRExcelVO> getCrewPNRExcelList() {
        return crewPNRExcelList;
    }

    public void setCrewPNRExcelList(List<CrewPNRExcelVO> crewPNRExcelList) {
        this.crewPNRExcelList = crewPNRExcelList;
    }

    public UserInfoVO getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(UserInfoVO loginUser) {
        this.loginUser = loginUser;
    }
}
