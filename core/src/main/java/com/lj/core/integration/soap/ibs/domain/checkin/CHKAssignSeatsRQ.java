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
 *         &lt;element name="AirlineCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirlineCode"/>
 *         &lt;element name="Name" type="{http://www.ibsplc.com/iRes/simpleTypes/}NameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FlightIdentifier" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierType"/>
 *         &lt;element name="ChannelKey" type="{http://www.ibsplc.com/iRes/simpleTypes/}ChannelKeyType"/>
 *         &lt;element name="SegmentSeat" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentSeatType" minOccurs="0"/>
 *         &lt;element name="DateOfTravel" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/>
 *         &lt;element name="hasFeeAdditionNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasFeeCheckNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SeatAssignMentFeeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatAssignMentFeeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IsAssignSeatSeparately" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GuestSeatInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestSeatInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Segment" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentInfo" minOccurs="0"/>
 *         &lt;element name="isRestrictedSeatValidated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isSeatWarningsValidated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "airlineCode",
    "name",
    "flightIdentifier",
    "channelKey",
    "segmentSeat",
    "dateOfTravel",
    "hasFeeAdditionNeeded",
    "hasFeeCheckNeeded",
    "seatAssignMentFeeDetails",
    "isAssignSeatSeparately",
    "guestSeatInformation",
    "segment",
    "isRestrictedSeatValidated",
    "isSeatWarningsValidated"
})
@XmlRootElement(name = "CHK_AssignSeatsRQ")
public class CHKAssignSeatsRQ {

    @XmlElement(name = "AirlineCode", required = true)
    protected AirlineCode airlineCode;
    @XmlElement(name = "Name")
    protected List<NameType> name;
    @XmlElement(name = "FlightIdentifier", required = true)
    protected FlightIdentifierType flightIdentifier;
    @XmlElement(name = "ChannelKey", required = true)
    protected ChannelKeyType channelKey;
    @XmlElement(name = "SegmentSeat")
    protected SegmentSeatType segmentSeat;
    @XmlElement(name = "DateOfTravel", required = true)
    protected DateOnlyType dateOfTravel;
    protected Boolean hasFeeAdditionNeeded;
    protected Boolean hasFeeCheckNeeded;
    @XmlElement(name = "SeatAssignMentFeeDetails")
    protected List<SeatAssignMentFeeType> seatAssignMentFeeDetails;
    @XmlElement(name = "IsAssignSeatSeparately")
    protected Boolean isAssignSeatSeparately;
    @XmlElement(name = "GuestSeatInformation")
    protected List<GuestSeatInfo> guestSeatInformation;
    @XmlElement(name = "Segment")
    protected SegmentInfo segment;
    protected Boolean isRestrictedSeatValidated;
    protected Boolean isSeatWarningsValidated;

    /**
     * airlineCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AirlineCode }
     *     
     */
    public AirlineCode getAirlineCode() {
        return airlineCode;
    }

    /**
     * airlineCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineCode }
     *     
     */
    public void setAirlineCode(AirlineCode value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getName() {
        if (name == null) {
            name = new ArrayList<NameType>();
        }
        return this.name;
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
     * channelKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ChannelKeyType }
     *     
     */
    public ChannelKeyType getChannelKey() {
        return channelKey;
    }

    /**
     * channelKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelKeyType }
     *     
     */
    public void setChannelKey(ChannelKeyType value) {
        this.channelKey = value;
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
     * dateOfTravel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getDateOfTravel() {
        return dateOfTravel;
    }

    /**
     * dateOfTravel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setDateOfTravel(DateOnlyType value) {
        this.dateOfTravel = value;
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
     * isAssignSeatSeparately 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAssignSeatSeparately() {
        return isAssignSeatSeparately;
    }

    /**
     * isAssignSeatSeparately 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAssignSeatSeparately(Boolean value) {
        this.isAssignSeatSeparately = value;
    }

    /**
     * Gets the value of the guestSeatInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestSeatInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestSeatInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestSeatInfo }
     * 
     * 
     */
    public List<GuestSeatInfo> getGuestSeatInformation() {
        if (guestSeatInformation == null) {
            guestSeatInformation = new ArrayList<GuestSeatInfo>();
        }
        return this.guestSeatInformation;
    }

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
