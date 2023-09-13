package com.lj.crewpnr.vo;

public class CrewPNRLogCriteriaVO {

    private String stnfrCode;
    private String stntoCode;
    private String brdStrtDt;
    private String brdEndDt;
    private String fareClass;
    private int paxCount;

    public String getStnfrCode() {
        return stnfrCode;
    }

    public void setStnfrCode(String stnfrCode) {
        this.stnfrCode = stnfrCode;
    }

    public String getStntoCode() {
        return stntoCode;
    }

    public void setStntoCode(String stntoCode) {
        this.stntoCode = stntoCode;
    }

    public String getBrdStrtDt() {
        return brdStrtDt;
    }

    public void setBrdStrtDt(String brdStrtDt) {
        this.brdStrtDt = brdStrtDt;
    }

    public String getBrdEndDt() {
        return brdEndDt;
    }

    public void setBrdEndDt(String brdEndDt) {
        this.brdEndDt = brdEndDt;
    }

    public String getFareClass() {
        return fareClass;
    }

    public void setFareClass(String fareClass) {
        this.fareClass = fareClass;
    }

    public int getPaxCount() {
        return paxCount;
    }

    public void setPaxCount(int paxCount) {
        this.paxCount = paxCount;
    }
}
