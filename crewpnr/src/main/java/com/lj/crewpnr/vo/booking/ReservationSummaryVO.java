package com.lj.crewpnr.vo.booking;

public class ReservationSummaryVO {
    private String fltnum;
    private String depDate;
    private String stnfrCode;
    private String stntoCode;
    private String departureDateTime;
    private String arrivalDateTime;
    private String fareClass;
    private int paxCount;
    private String PNRNumber;
    private String SegmentStatus;
    private String SegmentStatusDtl;
    private String pnrStatus;

    private String status;

    private String statusDisplay;

    private String cabinClassDisplay;

    public String getFltnum() {
        return fltnum;
    }

    public void setFltnum(String fltnum) {
        this.fltnum = fltnum;
    }

    public String getDepDate() {
        return depDate;
    }

    public void setDepDate(String depDate) {
        this.depDate = depDate;
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

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
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

    public String getPNRNumber() {
        return PNRNumber;
    }

    public void setPNRNumber(String PNRNumber) {
        this.PNRNumber = PNRNumber;
    }

    public String getSegmentStatus() {
        return SegmentStatus;
    }

    public void setSegmentStatus(String segmentStatus) {
        SegmentStatus = segmentStatus;
    }

    public String getSegmentStatusDtl() {
        return SegmentStatusDtl;
    }

    public void setSegmentStatusDtl(String segmentStatusDtl) {
        SegmentStatusDtl = segmentStatusDtl;
    }

    public String getPnrStatus() {
        return pnrStatus;
    }

    public void setPnrStatus(String pnrStatus) {
        this.pnrStatus = pnrStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDisplay() {
        return statusDisplay;
    }

    public void setStatusDisplay(String statusDisplay) {
        this.statusDisplay = statusDisplay;
    }

    public String getCabinClassDisplay() {
        return cabinClassDisplay;
    }

    public void setCabinClassDisplay(String cabinClassDisplay) {
        this.cabinClassDisplay = cabinClassDisplay;
    }
}
