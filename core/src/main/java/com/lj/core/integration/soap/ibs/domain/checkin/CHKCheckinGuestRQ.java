//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import java.math.BigInteger;
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
 *     &lt;extension base="{http://www.ibsplc.com/iRes/simpleTypes/}BaseCheckinRQ"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Segment" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentInfo" minOccurs="0"/&gt;
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FlightIdentifier" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="NameAndPnrNumber" type="{http://www.ibsplc.com/iRes/simpleTypes/}NameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CheckinPnrNumber" type="{http://www.ibsplc.com/iRes/simpleTypes/}CheckinPnrNumberType" minOccurs="0"/&gt;
 *         &lt;element name="CheckinGuestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CheckinGuestDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfBags" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReturnIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SegmentSeat" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentSeatType" minOccurs="0"/&gt;
 *         &lt;element name="hasFeeAdditionNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hasFeeCheckNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SeatAssignMentFeeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatAssignMentFeeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isRestrictedSeatValidated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isSeatWarningsValidated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "segment",
    "pnrNumber",
    "flightIdentifier",
    "nameAndPnrNumber",
    "checkinPnrNumber",
    "checkinGuestDetails",
    "numberOfBags",
    "connectionIndicator",
    "returnIndicator",
    "segmentSeat",
    "hasFeeAdditionNeeded",
    "hasFeeCheckNeeded",
    "seatAssignMentFeeDetails",
    "isRestrictedSeatValidated",
    "isSeatWarningsValidated"
})
@XmlRootElement(name = "CHK_CheckinGuestRQ")
public class CHKCheckinGuestRQ
    extends BaseCheckinRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Segment")
    protected SegmentInfo segment;
    @XmlElement(name = "PnrNumber")
    protected String pnrNumber;
    @XmlElement(name = "FlightIdentifier")
    protected FlightIdentifierType flightIdentifier;
    @XmlElement(name = "NameAndPnrNumber")
    protected List<NameType> nameAndPnrNumber;
    @XmlElement(name = "CheckinPnrNumber")
    protected CheckinPnrNumberType checkinPnrNumber;
    @XmlElement(name = "CheckinGuestDetails")
    protected List<CheckinGuestDetailsType> checkinGuestDetails;
    @XmlElement(name = "NumberOfBags")
    protected List<BigInteger> numberOfBags;
    @XmlElement(name = "ConnectionIndicator")
    protected Boolean connectionIndicator;
    @XmlElement(name = "ReturnIndicator")
    protected Boolean returnIndicator;
    @XmlElement(name = "SegmentSeat")
    protected SegmentSeatType segmentSeat;
    protected Boolean hasFeeAdditionNeeded;
    protected Boolean hasFeeCheckNeeded;
    @XmlElement(name = "SeatAssignMentFeeDetails")
    protected List<SeatAssignMentFeeType> seatAssignMentFeeDetails;
    protected Boolean isRestrictedSeatValidated;
    protected Boolean isSeatWarningsValidated;

    /**
     * segment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SegmentInfo }
     *     
     */
    public SegmentInfo getSegment() {
        return segment;
    }

    /**
     * segment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentInfo }
     *     
     */
    public void setSegment(SegmentInfo value) {
        this.segment = value;
    }

    /**
     * pnrNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrNumber() {
        return pnrNumber;
    }

    /**
     * pnrNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrNumber(String value) {
        this.pnrNumber = value;
    }

    /**
     * flightIdentifier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightIdentifierType }
     *     
     */
    public FlightIdentifierType getFlightIdentifier() {
        return flightIdentifier;
    }

    /**
     * flightIdentifier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightIdentifierType }
     *     
     */
    public void setFlightIdentifier(FlightIdentifierType value) {
        this.flightIdentifier = value;
    }

    /**
     * Gets the value of the nameAndPnrNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameAndPnrNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameAndPnrNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getNameAndPnrNumber() {
        if (nameAndPnrNumber == null) {
            nameAndPnrNumber = new ArrayList<NameType>();
        }
        return this.nameAndPnrNumber;
    }

    /**
     * checkinPnrNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CheckinPnrNumberType }
     *     
     */
    public CheckinPnrNumberType getCheckinPnrNumber() {
        return checkinPnrNumber;
    }

    /**
     * checkinPnrNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckinPnrNumberType }
     *     
     */
    public void setCheckinPnrNumber(CheckinPnrNumberType value) {
        this.checkinPnrNumber = value;
    }

    /**
     * Gets the value of the checkinGuestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkinGuestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckinGuestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckinGuestDetailsType }
     * 
     * 
     */
    public List<CheckinGuestDetailsType> getCheckinGuestDetails() {
        if (checkinGuestDetails == null) {
            checkinGuestDetails = new ArrayList<CheckinGuestDetailsType>();
        }
        return this.checkinGuestDetails;
    }

    /**
     * Gets the value of the numberOfBags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfBags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfBags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getNumberOfBags() {
        if (numberOfBags == null) {
            numberOfBags = new ArrayList<BigInteger>();
        }
        return this.numberOfBags;
    }

    /**
     * connectionIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnectionIndicator() {
        return connectionIndicator;
    }

    /**
     * connectionIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnectionIndicator(Boolean value) {
        this.connectionIndicator = value;
    }

    /**
     * returnIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnIndicator() {
        return returnIndicator;
    }

    /**
     * returnIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnIndicator(Boolean value) {
        this.returnIndicator = value;
    }

    /**
     * segmentSeat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SegmentSeatType }
     *     
     */
    public SegmentSeatType getSegmentSeat() {
        return segmentSeat;
    }

    /**
     * segmentSeat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentSeatType }
     *     
     */
    public void setSegmentSeat(SegmentSeatType value) {
        this.segmentSeat = value;
    }

    /**
     * hasFeeAdditionNeeded 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasFeeAdditionNeeded() {
        return hasFeeAdditionNeeded;
    }

    /**
     * hasFeeAdditionNeeded 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasFeeAdditionNeeded(Boolean value) {
        this.hasFeeAdditionNeeded = value;
    }

    /**
     * hasFeeCheckNeeded 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasFeeCheckNeeded() {
        return hasFeeCheckNeeded;
    }

    /**
     * hasFeeCheckNeeded 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasFeeCheckNeeded(Boolean value) {
        this.hasFeeCheckNeeded = value;
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
     * isRestrictedSeatValidated 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRestrictedSeatValidated() {
        return isRestrictedSeatValidated;
    }

    /**
     * isRestrictedSeatValidated 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRestrictedSeatValidated(Boolean value) {
        this.isRestrictedSeatValidated = value;
    }

    /**
     * isSeatWarningsValidated 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSeatWarningsValidated() {
        return isSeatWarningsValidated;
    }

    /**
     * isSeatWarningsValidated 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSeatWarningsValidated(Boolean value) {
        this.isSeatWarningsValidated = value;
    }

}
