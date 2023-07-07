//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuestList" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SeatMapInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatMapInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BoardingPass" type="{http://www.ibsplc.com/iRes/simpleTypes/}BoardingPassInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
 *         &lt;element name="IsReturnCheckInPossible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="feeExist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SeatAssignMentFeeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatAssignMentFeeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CheckinFeeInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}CheckinFeeInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResponseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "guestList",
    "seatMapInformation",
    "boardingPass",
    "message",
    "errorType",
    "isReturnCheckInPossible",
    "feeExist",
    "seatAssignMentFeeDetails",
    "checkinFeeInformation",
    "responseStatus"
})
@XmlRootElement(name = "CHK_CheckinGuestRS")
public class CHKCheckinGuestRS
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "GuestList")
    protected List<GuestInfo> guestList;
    @XmlElement(name = "SeatMapInformation")
    protected List<SeatMapInformation> seatMapInformation;
    @XmlElement(name = "BoardingPass")
    protected List<BoardingPassInfo> boardingPass;
    @XmlElement(name = "Message")
    protected List<String> message;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;
    @XmlElement(name = "IsReturnCheckInPossible")
    protected Boolean isReturnCheckInPossible;
    protected Boolean feeExist;
    @XmlElement(name = "SeatAssignMentFeeDetails")
    protected List<SeatAssignMentFeeType> seatAssignMentFeeDetails;
    @XmlElement(name = "CheckinFeeInformation")
    protected List<CheckinFeeInformation> checkinFeeInformation;
    @XmlElement(name = "ResponseStatus")
    protected String responseStatus;

    /**
     * Gets the value of the guestList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestInfo }
     * 
     * 
     */
    public List<GuestInfo> getGuestList() {
        if (guestList == null) {
            guestList = new ArrayList<GuestInfo>();
        }
        return this.guestList;
    }

    /**
     * Gets the value of the seatMapInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatMapInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatMapInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatMapInformation }
     * 
     * 
     */
    public List<SeatMapInformation> getSeatMapInformation() {
        if (seatMapInformation == null) {
            seatMapInformation = new ArrayList<SeatMapInformation>();
        }
        return this.seatMapInformation;
    }

    /**
     * Gets the value of the boardingPass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boardingPass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoardingPass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoardingPassInfo }
     * 
     * 
     */
    public List<BoardingPassInfo> getBoardingPass() {
        if (boardingPass == null) {
            boardingPass = new ArrayList<BoardingPassInfo>();
        }
        return this.boardingPass;
    }

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMessage() {
        if (message == null) {
            message = new ArrayList<String>();
        }
        return this.message;
    }

    /**
     * errorType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getErrorType() {
        return errorType;
    }

    /**
     * errorType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setErrorType(ErrorType value) {
        this.errorType = value;
    }

    /**
     * isReturnCheckInPossible 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReturnCheckInPossible() {
        return isReturnCheckInPossible;
    }

    /**
     * isReturnCheckInPossible 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReturnCheckInPossible(Boolean value) {
        this.isReturnCheckInPossible = value;
    }

    /**
     * feeExist 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeeExist() {
        return feeExist;
    }

    /**
     * feeExist 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeeExist(Boolean value) {
        this.feeExist = value;
    }

    /**
     * Gets the value of the seatAssignMentFeeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatAssignMentFeeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatAssignMentFeeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatAssignMentFeeType }
     * 
     * 
     */
    public List<SeatAssignMentFeeType> getSeatAssignMentFeeDetails() {
        if (seatAssignMentFeeDetails == null) {
            seatAssignMentFeeDetails = new ArrayList<SeatAssignMentFeeType>();
        }
        return this.seatAssignMentFeeDetails;
    }

    /**
     * Gets the value of the checkinFeeInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkinFeeInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckinFeeInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckinFeeInformation }
     * 
     * 
     */
    public List<CheckinFeeInformation> getCheckinFeeInformation() {
        if (checkinFeeInformation == null) {
            checkinFeeInformation = new ArrayList<CheckinFeeInformation>();
        }
        return this.checkinFeeInformation;
    }

    /**
     * responseStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseStatus() {
        return responseStatus;
    }

    /**
     * responseStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseStatus(String value) {
        this.responseStatus = value;
    }

}
