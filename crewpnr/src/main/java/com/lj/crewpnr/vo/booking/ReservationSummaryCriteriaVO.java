package com.lj.crewpnr.vo.booking;

public class ReservationSummaryCriteriaVO {
    private String depStartDate;
    private String depEndDate;
    private String stnfrCode;
    private String stntoCode;
    private String SegmentStatus;
    private String fareClass;
    private String paxCount;
    private String agencyCode;
    private String fltNum;

    private String cabinClass;

    public String getDepStartDate() {
        return depStartDate;
    }

    public void setDepStartDate(String depStartDate) {
        this.depStartDate = depStartDate;
    }

    public String getDepEndDate() {
        return depEndDate;
    }

    public void setDepEndDate(String depEndDate) {
        this.depEndDate = depEndDate;
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

    public String getSegmentStatus() {
        return SegmentStatus;
    }

    public void setSegmentStatus(String segmentStatus) {
        SegmentStatus = segmentStatus;
    }

    public String getFareClass() {
        return fareClass;
    }

    public void setFareClass(String fareClass) {
        this.fareClass = fareClass;
    }

    public String getPaxCount() {
        return paxCount;
    }

    public void setPaxCount(String paxCount) {
        this.paxCount = paxCount;
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    public String getFltNum() {
        return fltNum;
    }

    public void setFltNum(String fltNum) {
        this.fltNum = fltNum;
    }

    public String getCabinClass() {
        return cabinClass;
    }

    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }
}
