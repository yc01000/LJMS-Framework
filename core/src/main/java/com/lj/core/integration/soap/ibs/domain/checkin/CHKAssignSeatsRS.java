//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.05.28 시간 08:48:55 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeatMapInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatMapInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/>
 *         &lt;element name="GuestSeatDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestSeatDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="feeExist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SeatAssignMentFeeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatAssignMentFeeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GuestSeatDetailsForMultiguest" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestSeatFeeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "seatMapInformation",
    "errorType",
    "guestSeatDetails",
    "feeExist",
    "seatAssignMentFeeDetails",
    "guestSeatDetailsForMultiguest"
})
@XmlRootElement(name = "CHK_AssignSeatsRS")
public class CHKAssignSeatsRS {

    @XmlElement(name = "SeatMapInformation")
    protected List<SeatMapInformation> seatMapInformation;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;
    @XmlElement(name = "GuestSeatDetails")
    protected List<GuestSeatDetails> guestSeatDetails;
    protected Boolean feeExist;
    @XmlElement(name = "SeatAssignMentFeeDetails")
    protected List<SeatAssignMentFeeType> seatAssignMentFeeDetails;
    @XmlElement(name = "GuestSeatDetailsForMultiguest")
    protected List<GuestSeatFeeInfo> guestSeatDetailsForMultiguest;

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
     * Gets the value of the guestSeatDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestSeatDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestSeatDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestSeatDetails }
     * 
     * 
     */
    public List<GuestSeatDetails> getGuestSeatDetails() {
        if (guestSeatDetails == null) {
            guestSeatDetails = new ArrayList<GuestSeatDetails>();
        }
        return this.guestSeatDetails;
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
     * Gets the value of the guestSeatDetailsForMultiguest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestSeatDetailsForMultiguest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestSeatDetailsForMultiguest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestSeatFeeInfo }
     * 
     * 
     */
    public List<GuestSeatFeeInfo> getGuestSeatDetailsForMultiguest() {
        if (guestSeatDetailsForMultiguest == null) {
            guestSeatDetailsForMultiguest = new ArrayList<GuestSeatFeeInfo>();
        }
        return this.guestSeatDetailsForMultiguest;
    }

}
