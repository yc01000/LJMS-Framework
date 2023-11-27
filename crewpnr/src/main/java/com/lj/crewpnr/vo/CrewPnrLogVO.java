package com.lj.crewpnr.vo;

public class CrewPnrLogVO {
    private int seq;
    private String depDate;
    private String fltNum;
    private String stnfrCode;
    private String stntoCode;
    private String fareClass;
    private int paxCnt;
    private String rgstDttm;
    private String errorValue;

    private String cabinClassDisplay;

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getDepDate() {
        return depDate;
    }

    public void setDepDate(String depDate) {
        this.depDate = depDate;
    }

    public String getFltNum() {
        return fltNum;
    }

    public void setFltNum(String fltNum) {
        this.fltNum = fltNum;
    }

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

    public String getFareClass() {
        return fareClass;
    }

    public void setFareClass(String fareClass) {
        this.fareClass = fareClass;
    }

    public int getPaxCnt() {
        return paxCnt;
    }

    public void setPaxCnt(int paxCnt) {
        this.paxCnt = paxCnt;
    }

    public String getRgstDttm() {
        return rgstDttm;
    }

    public void setRgstDttm(String rgstDttm) {
        this.rgstDttm = rgstDttm;
    }

    public String getErrorValue() {
        return errorValue;
    }

    public void setErrorValue(String errorValue) {
        this.errorValue = errorValue;
    }

    public String getCabinClassDisplay() {
        return cabinClassDisplay;
    }

    public void setCabinClassDisplay(String cabinClassDisplay) {
        this.cabinClassDisplay = cabinClassDisplay;
    }
}
