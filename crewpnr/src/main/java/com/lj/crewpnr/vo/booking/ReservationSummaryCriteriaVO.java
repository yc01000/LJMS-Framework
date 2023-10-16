package com.lj.crewpnr.vo.booking;

public class ReservationSummaryCriteriaVO {
    private String depStartDate;
    private String depEndDate;
    private String stnfrCode;
    private String stntoCode;
    private String SegmentStatus;
    private String fareClass;
    private int paxCount;
    private String agencyCode;

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

    public int getPaxCount() {
        return paxCount;
    }

    public void setPaxCount(int paxCount) {
        this.paxCount = paxCount;
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }
}