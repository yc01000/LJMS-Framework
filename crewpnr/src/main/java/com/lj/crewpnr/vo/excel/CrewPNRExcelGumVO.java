package com.lj.crewpnr.vo.excel;

import java.util.List;

public class CrewPNRExcelGumVO {
    private int groupSeq;
    private String fltNumber;
    private String boardPoint;
    private String offPoint;
    private String flightDate;
    private String fareClass;
    private String givenName;
    private String surName;
    private String middleName;
    private String namePrefix;
    private List<PaxInfoVO> paxinfoList;
    private String emailAddress;
    private String cellNumber;

    private String result;
    private String resultMsg;

    public int getGroupSeq() {
        return groupSeq;
    }

    public void setGroupSeq(int groupSeq) {
        this.groupSeq = groupSeq;
    }

    public String getFltNumber() {
        return fltNumber;
    }

    public void setFltNumber(String fltNumber) {
        this.fltNumber = fltNumber;
    }

    public String getBoardPoint() {
        return boardPoint;
    }

    public void setBoardPoint(String boardPoint) {
        this.boardPoint = boardPoint;
    }

    public String getOffPoint() {
        return offPoint;
    }

    public void setOffPoint(String offPoint) {
        this.offPoint = offPoint;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getFareClass() {
        return fareClass;
    }

    public void setFareClass(String fareClass) {
        this.fareClass = fareClass;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public List<PaxInfoVO> getPaxinfoList() {
        return paxinfoList;
    }

    public void setPaxinfoList(List<PaxInfoVO> paxinfoList) {
        this.paxinfoList = paxinfoList;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}
