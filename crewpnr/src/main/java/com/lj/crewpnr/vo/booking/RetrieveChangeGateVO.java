package com.lj.crewpnr.vo.booking;

import java.io.Serializable;
import java.util.List;

/**
* <pre>
 * <B>homepage</B>
        *     |_ RetrieveChangeGateVO.java
        * </pre>
        *
        *  @author  : 박성한
        *  @since   : 2017. 12. 5. 오후 3:56:59
        *  @version : 1.0
        *  @desc    : 여정 변경 및 취소 화면의 VO
        */
public class RetrieveChangeGateVO {

    /**
     * 예약 번호
     */
    private String pnrNumber;

    /**
     * 이전 예약 번호
     */
    private String beforePnrNumber;

    /**
     * IBS 고객 성
     */
    private String bookerSurName;

    /**
     * 탑승객 ID
     */
    private List<String> guestId;

    /**
     * 구간 ID
     */
    private List<String> segmentId;

    /**
     * 상위 예약번호
     */
    private String parentPNR;

    /**
     * 하위 예약 번호
     */
    private String childPNR;

    /**
     * 국내 국제 여부
     */
    private String domIntType;

    /**
     * 좌석 수
     */
    private Integer numberOfSeats;

    public String getBeforePnrNumber() {
        return beforePnrNumber;
    }
    public void setBeforePnrNumber(String beforePnrNumber) {
        this.beforePnrNumber = beforePnrNumber;
    }
    public String getPnrNumber() {
        return pnrNumber;
    }
    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }
    public String getBookerSurName() {
        return bookerSurName;
    }
    public void setBookerSurName(String bookerSurName) {
        this.bookerSurName = bookerSurName;
    }
    public List<String> getGuestId() {
        return guestId;
    }
    public void setGuestId(List<String> guestId) {
        this.guestId = guestId;
    }
    public List<String> getSegmentId() {
        return segmentId;
    }
    public void setSegmentId(List<String> segmentId) {
        this.segmentId = segmentId;
    }
    public String getParentPNR() {
        return parentPNR;
    }
    public void setParentPNR(String parentPNR) {
        this.parentPNR = parentPNR;
    }
    public String getChildPNR() {
        return childPNR;
    }
    public void setChildPNR(String childPNR) {
        this.childPNR = childPNR;
    }
    public String getDomIntType() {
        return domIntType;
    }
    public void setDomIntType(String domIntType) {
        this.domIntType = domIntType;
    }
    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
