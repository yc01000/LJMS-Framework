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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  Information related to the segment of guest.
 * 
 * <p>SegmentGuestInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SegmentGuestInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightSummary" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightSummary" minOccurs="0"/&gt;
 *         &lt;element name="FareLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReservationStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}ReservationStatusType"/&gt;
 *         &lt;element name="CheckinStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}CheckinStatusType"/&gt;
 *         &lt;element name="ResClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TravelClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SSRDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SSRDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InboundInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}InboundType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OutboundInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}OutboundType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SeatNumber" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatNumberType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfBags" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Destination" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportType"/&gt;
 *         &lt;element name="Origin" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportType"/&gt;
 *         &lt;element name="OffPoint" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportType"/&gt;
 *         &lt;element name="BoardPoint" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportType"/&gt;
 *         &lt;element name="BalanceOwedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyTier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StdbyPrioCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StdbyTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SelfServiceCheckInInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRevenuePax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsWatchLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSecureFlightLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InfantDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestInfantInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RefundIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCheckinPossible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SourceOfCheckIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FreeBaggageAllowance" type="{http://www.ibsplc.com/iRes/simpleTypes/}FreeBaggageAllowanceType" minOccurs="0"/&gt;
 *         &lt;element name="GuestBagInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestBagInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentGuestInfo", propOrder = {
    "flightSummary",
    "fareLevel",
    "fareClass",
    "reservationStatus",
    "checkinStatus",
    "resClass",
    "travelClass",
    "paxId",
    "ssr",
    "ssrDetails",
    "inboundInformation",
    "outboundInformation",
    "seatNumber",
    "numberOfBags",
    "sequenceNumber",
    "destination",
    "origin",
    "offPoint",
    "boardPoint",
    "balanceOwedIndicator",
    "loyaltyNumber",
    "loyaltyTier",
    "stdbyPrioCode",
    "stdbyTypeCode",
    "selfServiceCheckInInd",
    "isRevenuePax",
    "reportedTime",
    "isWatchLocked",
    "isSecureFlightLocked",
    "infantDetails",
    "refundIndicator",
    "isCheckinPossible",
    "sourceOfCheckIn",
    "freeBaggageAllowance",
    "guestBagInfo"
})
public class SegmentGuestInfo
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FlightSummary")
    protected FlightSummary flightSummary;
    @XmlElement(name = "FareLevel")
    protected String fareLevel;
    @XmlElement(name = "FareClass", required = true)
    protected String fareClass;
    @XmlElement(name = "ReservationStatus", required = true)
    @XmlSchemaType(name = "string")
    protected ReservationStatusType reservationStatus;
    @XmlElement(name = "CheckinStatus", required = true)
    @XmlSchemaType(name = "string")
    protected CheckinStatusType checkinStatus;
    @XmlElement(name = "ResClass")
    protected String resClass;
    @XmlElement(name = "TravelClass")
    protected String travelClass;
    @XmlElement(name = "PaxId")
    protected String paxId;
    @XmlElement(name = "SSR")
    protected List<String> ssr;
    @XmlElement(name = "SSRDetails")
    protected List<SSRDetailsType> ssrDetails;
    @XmlElement(name = "InboundInformation")
    protected List<InboundType> inboundInformation;
    @XmlElement(name = "OutboundInformation")
    protected List<OutboundType> outboundInformation;
    @XmlElement(name = "SeatNumber")
    protected List<SeatNumberType> seatNumber;
    @XmlElement(name = "NumberOfBags")
    protected BigInteger numberOfBags;
    @XmlElement(name = "SequenceNumber")
    protected BigInteger sequenceNumber;
    @XmlElement(name = "Destination", required = true)
    protected AirportType destination;
    @XmlElement(name = "Origin", required = true)
    protected AirportType origin;
    @XmlElement(name = "OffPoint", required = true)
    protected AirportType offPoint;
    @XmlElement(name = "BoardPoint", required = true)
    protected AirportType boardPoint;
    @XmlElement(name = "BalanceOwedIndicator")
    protected Boolean balanceOwedIndicator;
    @XmlElement(name = "LoyaltyNumber")
    protected String loyaltyNumber;
    @XmlElement(name = "LoyaltyTier")
    protected String loyaltyTier;
    @XmlElement(name = "StdbyPrioCode")
    protected String stdbyPrioCode;
    @XmlElement(name = "StdbyTypeCode")
    protected String stdbyTypeCode;
    @XmlElement(name = "SelfServiceCheckInInd")
    protected Boolean selfServiceCheckInInd;
    @XmlElement(name = "IsRevenuePax")
    protected Boolean isRevenuePax;
    @XmlElement(name = "ReportedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportedTime;
    @XmlElement(name = "IsWatchLocked")
    protected Boolean isWatchLocked;
    @XmlElement(name = "IsSecureFlightLocked")
    protected Boolean isSecureFlightLocked;
    @XmlElement(name = "InfantDetails")
    protected List<GuestInfantInfo> infantDetails;
    @XmlElement(name = "RefundIndicator")
    protected Boolean refundIndicator;
    @XmlElement(name = "IsCheckinPossible")
    protected Boolean isCheckinPossible;
    @XmlElement(name = "SourceOfCheckIn")
    protected String sourceOfCheckIn;
    @XmlElement(name = "FreeBaggageAllowance")
    protected FreeBaggageAllowanceType freeBaggageAllowance;
    @XmlElement(name = "GuestBagInfo")
    protected List<GuestBagInfoType> guestBagInfo;

    /**
     * flightSummary 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightSummary }
     *     
     */
    public FlightSummary getFlightSummary() {
        return flightSummary;
    }

    /**
     * flightSummary 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSummary }
     *     
     */
    public void setFlightSummary(FlightSummary value) {
        this.flightSummary = value;
    }

    /**
     * fareLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareLevel() {
        return fareLevel;
    }

    /**
     * fareLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareLevel(String value) {
        this.fareLevel = value;
    }

    /**
     * fareClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareClass() {
        return fareClass;
    }

    /**
     * fareClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareClass(String value) {
        this.fareClass = value;
    }

    /**
     * reservationStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ReservationStatusType }
     *     
     */
    public ReservationStatusType getReservationStatus() {
        return reservationStatus;
    }

    /**
     * reservationStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationStatusType }
     *     
     */
    public void setReservationStatus(ReservationStatusType value) {
        this.reservationStatus = value;
    }

    /**
     * checkinStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CheckinStatusType }
     *     
     */
    public CheckinStatusType getCheckinStatus() {
        return checkinStatus;
    }

    /**
     * checkinStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckinStatusType }
     *     
     */
    public void setCheckinStatus(CheckinStatusType value) {
        this.checkinStatus = value;
    }

    /**
     * resClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResClass() {
        return resClass;
    }

    /**
     * resClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResClass(String value) {
        this.resClass = value;
    }

    /**
     * travelClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelClass() {
        return travelClass;
    }

    /**
     * travelClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelClass(String value) {
        this.travelClass = value;
    }

    /**
     * paxId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxId() {
        return paxId;
    }

    /**
     * paxId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxId(String value) {
        this.paxId = value;
    }

    /**
     * Gets the value of the ssr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSSR() {
        if (ssr == null) {
            ssr = new ArrayList<String>();
        }
        return this.ssr;
    }

    /**
     * Gets the value of the ssrDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSRDetailsType }
     * 
     * 
     */
    public List<SSRDetailsType> getSSRDetails() {
        if (ssrDetails == null) {
            ssrDetails = new ArrayList<SSRDetailsType>();
        }
        return this.ssrDetails;
    }

    /**
     * Gets the value of the inboundInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inboundInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInboundInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InboundType }
     * 
     * 
     */
    public List<InboundType> getInboundInformation() {
        if (inboundInformation == null) {
            inboundInformation = new ArrayList<InboundType>();
        }
        return this.inboundInformation;
    }

    /**
     * Gets the value of the outboundInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outboundInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutboundInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutboundType }
     * 
     * 
     */
    public List<OutboundType> getOutboundInformation() {
        if (outboundInformation == null) {
            outboundInformation = new ArrayList<OutboundType>();
        }
        return this.outboundInformation;
    }

    /**
     * Gets the value of the seatNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatNumberType }
     * 
     * 
     */
    public List<SeatNumberType> getSeatNumber() {
        if (seatNumber == null) {
            seatNumber = new ArrayList<SeatNumberType>();
        }
        return this.seatNumber;
    }

    /**
     * numberOfBags 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBags() {
        return numberOfBags;
    }

    /**
     * numberOfBags 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBags(BigInteger value) {
        this.numberOfBags = value;
    }

    /**
     * sequenceNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * sequenceNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * destination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AirportType }
     *     
     */
    public AirportType getDestination() {
        return destination;
    }

    /**
     * destination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportType }
     *     
     */
    public void setDestination(AirportType value) {
        this.destination = value;
    }

    /**
     * origin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AirportType }
     *     
     */
    public AirportType getOrigin() {
        return origin;
    }

    /**
     * origin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportType }
     *     
     */
    public void setOrigin(AirportType value) {
        this.origin = value;
    }

    /**
     * offPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AirportType }
     *     
     */
    public AirportType getOffPoint() {
        return offPoint;
    }

    /**
     * offPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportType }
     *     
     */
    public void setOffPoint(AirportType value) {
        this.offPoint = value;
    }

    /**
     * boardPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AirportType }
     *     
     */
    public AirportType getBoardPoint() {
        return boardPoint;
    }

    /**
     * boardPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportType }
     *     
     */
    public void setBoardPoint(AirportType value) {
        this.boardPoint = value;
    }

    /**
     * balanceOwedIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalanceOwedIndicator() {
        return balanceOwedIndicator;
    }

    /**
     * balanceOwedIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalanceOwedIndicator(Boolean value) {
        this.balanceOwedIndicator = value;
    }

    /**
     * loyaltyNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyNumber() {
        return loyaltyNumber;
    }

    /**
     * loyaltyNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyNumber(String value) {
        this.loyaltyNumber = value;
    }

    /**
     * loyaltyTier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyTier() {
        return loyaltyTier;
    }

    /**
     * loyaltyTier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyTier(String value) {
        this.loyaltyTier = value;
    }

    /**
     * stdbyPrioCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdbyPrioCode() {
        return stdbyPrioCode;
    }

    /**
     * stdbyPrioCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdbyPrioCode(String value) {
        this.stdbyPrioCode = value;
    }

    /**
     * stdbyTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdbyTypeCode() {
        return stdbyTypeCode;
    }

    /**
     * stdbyTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdbyTypeCode(String value) {
        this.stdbyTypeCode = value;
    }

    /**
     * selfServiceCheckInInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelfServiceCheckInInd() {
        return selfServiceCheckInInd;
    }

    /**
     * selfServiceCheckInInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelfServiceCheckInInd(Boolean value) {
        this.selfServiceCheckInInd = value;
    }

    /**
     * isRevenuePax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRevenuePax() {
        return isRevenuePax;
    }

    /**
     * isRevenuePax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRevenuePax(Boolean value) {
        this.isRevenuePax = value;
    }

    /**
     * reportedTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportedTime() {
        return reportedTime;
    }

    /**
     * reportedTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportedTime(XMLGregorianCalendar value) {
        this.reportedTime = value;
    }

    /**
     * isWatchLocked 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWatchLocked() {
        return isWatchLocked;
    }

    /**
     * isWatchLocked 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWatchLocked(Boolean value) {
        this.isWatchLocked = value;
    }

    /**
     * isSecureFlightLocked 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSecureFlightLocked() {
        return isSecureFlightLocked;
    }

    /**
     * isSecureFlightLocked 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSecureFlightLocked(Boolean value) {
        this.isSecureFlightLocked = value;
    }

    /**
     * Gets the value of the infantDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infantDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfantDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestInfantInfo }
     * 
     * 
     */
    public List<GuestInfantInfo> getInfantDetails() {
        if (infantDetails == null) {
            infantDetails = new ArrayList<GuestInfantInfo>();
        }
        return this.infantDetails;
    }

    /**
     * refundIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundIndicator() {
        return refundIndicator;
    }

    /**
     * refundIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundIndicator(Boolean value) {
        this.refundIndicator = value;
    }

    /**
     * isCheckinPossible 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCheckinPossible() {
        return isCheckinPossible;
    }

    /**
     * isCheckinPossible 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCheckinPossible(Boolean value) {
        this.isCheckinPossible = value;
    }

    /**
     * sourceOfCheckIn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfCheckIn() {
        return sourceOfCheckIn;
    }

    /**
     * sourceOfCheckIn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfCheckIn(String value) {
        this.sourceOfCheckIn = value;
    }

    /**
     * freeBaggageAllowance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FreeBaggageAllowanceType }
     *     
     */
    public FreeBaggageAllowanceType getFreeBaggageAllowance() {
        return freeBaggageAllowance;
    }

    /**
     * freeBaggageAllowance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeBaggageAllowanceType }
     *     
     */
    public void setFreeBaggageAllowance(FreeBaggageAllowanceType value) {
        this.freeBaggageAllowance = value;
    }

    /**
     * Gets the value of the guestBagInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestBagInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestBagInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestBagInfoType }
     * 
     * 
     */
    public List<GuestBagInfoType> getGuestBagInfo() {
        if (guestBagInfo == null) {
            guestBagInfo = new ArrayList<GuestBagInfoType>();
        }
        return this.guestBagInfo;
    }

}
