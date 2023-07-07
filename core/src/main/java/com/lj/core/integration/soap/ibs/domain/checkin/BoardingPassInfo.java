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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Boarding pass related info
 * 
 * <p>BoardingPassInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BoardingPassInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuestName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlightNumber" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightNumberType"/&gt;
 *         &lt;element name="SeatNumber" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatNumberType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BoardingTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="BoardPoint" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportType"/&gt;
 *         &lt;element name="OffPoint" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportType"/&gt;
 *         &lt;element name="BagTagNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MarketingInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BarCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DateOfTravel" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="BoardingGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BoardingPassType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EstimatedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ConnectingFlightIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaxInfantIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InfantIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FrequentFlyerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FrequentFlyerTier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SSRs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FrequentFlyerLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Title" type="{http://www.ibsplc.com/iRes/simpleTypes/}TitleType"/&gt;
 *         &lt;element name="FirstNameLocal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastNameLocal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PriorityTier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrioritySSRs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="standbyNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="standbyPriority" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NextAvailableFlight" type="{http://www.ibsplc.com/iRes/simpleTypes/}NextAvailableFlightType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="StandbyInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaperTicketRequiredInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AppliedFare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BpPrintCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Surcharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalFare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TicketDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TicketDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Fee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalBaggageWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodeShareFareClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Destination" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportType" minOccurs="0"/&gt;
 *         &lt;element name="CabinClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TitleLocal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IssuingOffice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BundledSSrs" type="{http://www.ibsplc.com/iRes/simpleTypes/}BundledSSrsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BaggageDropOffTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareLevelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoardingPassInfo", propOrder = {
    "guestName",
    "flightNumber",
    "seatNumber",
    "gateNumber",
    "terminal",
    "pnrNumber",
    "sequenceNumber",
    "carrierCode",
    "boardingTime",
    "boardPoint",
    "offPoint",
    "bagTagNumber",
    "marketingInfo",
    "barCode",
    "dateOfTravel",
    "boardingGroup",
    "boardingPassType",
    "departureTime",
    "estimatedDepartureTime",
    "arrivalTime",
    "connectingFlightIndicator",
    "paxInfantIndicator",
    "infantIndicator",
    "frequentFlyerID",
    "frequentFlyerTier",
    "cabinClass",
    "ssRs",
    "frequentFlyerLabel",
    "middleName",
    "title",
    "firstNameLocal",
    "lastNameLocal",
    "priorityTier",
    "prioritySSRs",
    "standbyNumber",
    "standbyPriority",
    "remarks",
    "nextAvailableFlight",
    "standbyInfo",
    "paperTicketRequiredInfo",
    "appliedFare",
    "bpPrintCount",
    "taxAmount",
    "surcharge",
    "totalFare",
    "ticketDetails",
    "fee",
    "paymentDate",
    "paymentType",
    "ticketNumber",
    "phoneNumber",
    "cellNumber",
    "zone",
    "totalBaggageWeight",
    "codeShareFareClass",
    "fareClass",
    "destination",
    "cabinClassCode",
    "agentCode",
    "titleLocal",
    "issuingOffice",
    "issueDate",
    "fareBasisCode",
    "bundledSSrs",
    "baggageDropOffTime",
    "fareLevelName",
    "serialNumber"
})
public class BoardingPassInfo
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "GuestName", required = true)
    protected String guestName;
    @XmlElement(name = "FlightNumber", required = true)
    protected FlightNumberType flightNumber;
    @XmlElement(name = "SeatNumber")
    protected List<SeatNumberType> seatNumber;
    @XmlElement(name = "GateNumber")
    protected String gateNumber;
    @XmlElement(name = "Terminal")
    protected String terminal;
    @XmlElement(name = "PnrNumber")
    protected String pnrNumber;
    @XmlElement(name = "SequenceNumber")
    protected String sequenceNumber;
    @XmlElement(name = "CarrierCode", required = true)
    protected String carrierCode;
    @XmlElement(name = "BoardingTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar boardingTime;
    @XmlElement(name = "BoardPoint", required = true)
    protected AirportType boardPoint;
    @XmlElement(name = "OffPoint", required = true)
    protected AirportType offPoint;
    @XmlElement(name = "BagTagNumber")
    protected List<String> bagTagNumber;
    @XmlElement(name = "MarketingInfo")
    protected String marketingInfo;
    @XmlElement(name = "BarCode", required = true)
    protected String barCode;
    @XmlElement(name = "DateOfTravel", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfTravel;
    @XmlElement(name = "BoardingGroup")
    protected String boardingGroup;
    @XmlElement(name = "BoardingPassType", required = true)
    protected String boardingPassType;
    @XmlElement(name = "DepartureTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureTime;
    @XmlElement(name = "EstimatedDepartureTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedDepartureTime;
    @XmlElement(name = "ArrivalTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalTime;
    @XmlElement(name = "ConnectingFlightIndicator", required = true)
    protected String connectingFlightIndicator;
    @XmlElement(name = "PaxInfantIndicator", required = true)
    protected String paxInfantIndicator;
    @XmlElement(name = "InfantIndicator", required = true)
    protected String infantIndicator;
    @XmlElement(name = "FrequentFlyerID", required = true)
    protected String frequentFlyerID;
    @XmlElement(name = "FrequentFlyerTier", required = true)
    protected String frequentFlyerTier;
    @XmlElement(name = "CabinClass", required = true)
    protected String cabinClass;
    @XmlElement(name = "SSRs")
    protected String ssRs;
    @XmlElement(name = "FrequentFlyerLabel")
    protected String frequentFlyerLabel;
    @XmlElement(name = "MiddleName", required = true)
    protected String middleName;
    @XmlElement(name = "Title", required = true)
    @XmlSchemaType(name = "string")
    protected TitleType title;
    @XmlElement(name = "FirstNameLocal", required = true)
    protected String firstNameLocal;
    @XmlElement(name = "LastNameLocal", required = true)
    protected String lastNameLocal;
    @XmlElement(name = "PriorityTier")
    protected String priorityTier;
    @XmlElement(name = "PrioritySSRs")
    protected String prioritySSRs;
    @XmlElement(required = true)
    protected String standbyNumber;
    @XmlElement(required = true)
    protected String standbyPriority;
    protected String remarks;
    @XmlElement(name = "NextAvailableFlight", required = true)
    protected List<NextAvailableFlightType> nextAvailableFlight;
    @XmlElement(name = "StandbyInfo", required = true)
    protected String standbyInfo;
    @XmlElement(name = "PaperTicketRequiredInfo", required = true)
    protected String paperTicketRequiredInfo;
    @XmlElement(name = "AppliedFare")
    protected String appliedFare;
    @XmlElement(name = "BpPrintCount")
    protected String bpPrintCount;
    @XmlElement(name = "TaxAmount")
    protected String taxAmount;
    @XmlElement(name = "Surcharge")
    protected String surcharge;
    @XmlElement(name = "TotalFare")
    protected String totalFare;
    @XmlElement(name = "TicketDetails")
    protected List<TicketDetailsType> ticketDetails;
    @XmlElement(name = "Fee")
    protected String fee;
    @XmlElement(name = "PaymentDate")
    protected String paymentDate;
    @XmlElement(name = "PaymentType")
    protected String paymentType;
    @XmlElement(name = "TicketNumber")
    protected List<String> ticketNumber;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "CellNumber")
    protected String cellNumber;
    @XmlElement(name = "Zone")
    protected String zone;
    @XmlElement(name = "TotalBaggageWeight")
    protected String totalBaggageWeight;
    @XmlElement(name = "CodeShareFareClass")
    protected String codeShareFareClass;
    @XmlElement(name = "FareClass")
    protected String fareClass;
    @XmlElement(name = "Destination")
    protected AirportType destination;
    @XmlElement(name = "CabinClassCode")
    protected String cabinClassCode;
    @XmlElement(name = "AgentCode")
    protected String agentCode;
    @XmlElement(name = "TitleLocal", required = true)
    protected String titleLocal;
    @XmlElement(name = "IssuingOffice", required = true)
    protected String issuingOffice;
    @XmlElement(name = "IssueDate", required = true)
    protected String issueDate;
    @XmlElement(name = "FareBasisCode", required = true)
    protected String fareBasisCode;
    @XmlElement(name = "BundledSSrs")
    protected List<BundledSSrsType> bundledSSrs;
    @XmlElement(name = "BaggageDropOffTime")
    protected String baggageDropOffTime;
    @XmlElement(name = "FareLevelName")
    protected String fareLevelName;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;

    /**
     * guestName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestName() {
        return guestName;
    }

    /**
     * guestName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestName(String value) {
        this.guestName = value;
    }

    /**
     * flightNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightNumberType }
     *     
     */
    public FlightNumberType getFlightNumber() {
        return flightNumber;
    }

    /**
     * flightNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightNumberType }
     *     
     */
    public void setFlightNumber(FlightNumberType value) {
        this.flightNumber = value;
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
     * gateNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGateNumber() {
        return gateNumber;
    }

    /**
     * gateNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGateNumber(String value) {
        this.gateNumber = value;
    }

    /**
     * terminal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * terminal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
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
     * sequenceNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * sequenceNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * carrierCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * carrierCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * boardingTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBoardingTime() {
        return boardingTime;
    }

    /**
     * boardingTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBoardingTime(XMLGregorianCalendar value) {
        this.boardingTime = value;
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
     * Gets the value of the bagTagNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagTagNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagTagNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBagTagNumber() {
        if (bagTagNumber == null) {
            bagTagNumber = new ArrayList<String>();
        }
        return this.bagTagNumber;
    }

    /**
     * marketingInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingInfo() {
        return marketingInfo;
    }

    /**
     * marketingInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingInfo(String value) {
        this.marketingInfo = value;
    }

    /**
     * barCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * barCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCode(String value) {
        this.barCode = value;
    }

    /**
     * dateOfTravel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfTravel() {
        return dateOfTravel;
    }

    /**
     * dateOfTravel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfTravel(XMLGregorianCalendar value) {
        this.dateOfTravel = value;
    }

    /**
     * boardingGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardingGroup() {
        return boardingGroup;
    }

    /**
     * boardingGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardingGroup(String value) {
        this.boardingGroup = value;
    }

    /**
     * boardingPassType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardingPassType() {
        return boardingPassType;
    }

    /**
     * boardingPassType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardingPassType(String value) {
        this.boardingPassType = value;
    }

    /**
     * departureTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * departureTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
    }

    /**
     * estimatedDepartureTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedDepartureTime() {
        return estimatedDepartureTime;
    }

    /**
     * estimatedDepartureTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedDepartureTime(XMLGregorianCalendar value) {
        this.estimatedDepartureTime = value;
    }

    /**
     * arrivalTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * arrivalTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
    }

    /**
     * connectingFlightIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectingFlightIndicator() {
        return connectingFlightIndicator;
    }

    /**
     * connectingFlightIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectingFlightIndicator(String value) {
        this.connectingFlightIndicator = value;
    }

    /**
     * paxInfantIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxInfantIndicator() {
        return paxInfantIndicator;
    }

    /**
     * paxInfantIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxInfantIndicator(String value) {
        this.paxInfantIndicator = value;
    }

    /**
     * infantIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfantIndicator() {
        return infantIndicator;
    }

    /**
     * infantIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfantIndicator(String value) {
        this.infantIndicator = value;
    }

    /**
     * frequentFlyerID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequentFlyerID() {
        return frequentFlyerID;
    }

    /**
     * frequentFlyerID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequentFlyerID(String value) {
        this.frequentFlyerID = value;
    }

    /**
     * frequentFlyerTier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequentFlyerTier() {
        return frequentFlyerTier;
    }

    /**
     * frequentFlyerTier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequentFlyerTier(String value) {
        this.frequentFlyerTier = value;
    }

    /**
     * cabinClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * cabinClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

    /**
     * ssRs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRs() {
        return ssRs;
    }

    /**
     * ssRs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRs(String value) {
        this.ssRs = value;
    }

    /**
     * frequentFlyerLabel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequentFlyerLabel() {
        return frequentFlyerLabel;
    }

    /**
     * frequentFlyerLabel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequentFlyerLabel(String value) {
        this.frequentFlyerLabel = value;
    }

    /**
     * middleName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * middleName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * title 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TitleType }
     *     
     */
    public TitleType getTitle() {
        return title;
    }

    /**
     * title 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleType }
     *     
     */
    public void setTitle(TitleType value) {
        this.title = value;
    }

    /**
     * firstNameLocal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNameLocal() {
        return firstNameLocal;
    }

    /**
     * firstNameLocal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNameLocal(String value) {
        this.firstNameLocal = value;
    }

    /**
     * lastNameLocal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNameLocal() {
        return lastNameLocal;
    }

    /**
     * lastNameLocal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNameLocal(String value) {
        this.lastNameLocal = value;
    }

    /**
     * priorityTier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityTier() {
        return priorityTier;
    }

    /**
     * priorityTier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityTier(String value) {
        this.priorityTier = value;
    }

    /**
     * prioritySSRs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrioritySSRs() {
        return prioritySSRs;
    }

    /**
     * prioritySSRs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrioritySSRs(String value) {
        this.prioritySSRs = value;
    }

    /**
     * standbyNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandbyNumber() {
        return standbyNumber;
    }

    /**
     * standbyNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandbyNumber(String value) {
        this.standbyNumber = value;
    }

    /**
     * standbyPriority 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandbyPriority() {
        return standbyPriority;
    }

    /**
     * standbyPriority 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandbyPriority(String value) {
        this.standbyPriority = value;
    }

    /**
     * remarks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * remarks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the nextAvailableFlight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextAvailableFlight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextAvailableFlight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NextAvailableFlightType }
     * 
     * 
     */
    public List<NextAvailableFlightType> getNextAvailableFlight() {
        if (nextAvailableFlight == null) {
            nextAvailableFlight = new ArrayList<NextAvailableFlightType>();
        }
        return this.nextAvailableFlight;
    }

    /**
     * standbyInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandbyInfo() {
        return standbyInfo;
    }

    /**
     * standbyInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandbyInfo(String value) {
        this.standbyInfo = value;
    }

    /**
     * paperTicketRequiredInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaperTicketRequiredInfo() {
        return paperTicketRequiredInfo;
    }

    /**
     * paperTicketRequiredInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaperTicketRequiredInfo(String value) {
        this.paperTicketRequiredInfo = value;
    }

    /**
     * appliedFare 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliedFare() {
        return appliedFare;
    }

    /**
     * appliedFare 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliedFare(String value) {
        this.appliedFare = value;
    }

    /**
     * bpPrintCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpPrintCount() {
        return bpPrintCount;
    }

    /**
     * bpPrintCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpPrintCount(String value) {
        this.bpPrintCount = value;
    }

    /**
     * taxAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * taxAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * surcharge 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurcharge() {
        return surcharge;
    }

    /**
     * surcharge 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurcharge(String value) {
        this.surcharge = value;
    }

    /**
     * totalFare 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFare() {
        return totalFare;
    }

    /**
     * totalFare 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFare(String value) {
        this.totalFare = value;
    }

    /**
     * Gets the value of the ticketDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketDetailsType }
     * 
     * 
     */
    public List<TicketDetailsType> getTicketDetails() {
        if (ticketDetails == null) {
            ticketDetails = new ArrayList<TicketDetailsType>();
        }
        return this.ticketDetails;
    }

    /**
     * fee 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFee() {
        return fee;
    }

    /**
     * fee 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFee(String value) {
        this.fee = value;
    }

    /**
     * paymentDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * paymentDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDate(String value) {
        this.paymentDate = value;
    }

    /**
     * paymentType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * paymentType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTicketNumber() {
        if (ticketNumber == null) {
            ticketNumber = new ArrayList<String>();
        }
        return this.ticketNumber;
    }

    /**
     * phoneNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * phoneNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * cellNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellNumber() {
        return cellNumber;
    }

    /**
     * cellNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellNumber(String value) {
        this.cellNumber = value;
    }

    /**
     * zone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * zone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

    /**
     * totalBaggageWeight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalBaggageWeight() {
        return totalBaggageWeight;
    }

    /**
     * totalBaggageWeight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalBaggageWeight(String value) {
        this.totalBaggageWeight = value;
    }

    /**
     * codeShareFareClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeShareFareClass() {
        return codeShareFareClass;
    }

    /**
     * codeShareFareClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeShareFareClass(String value) {
        this.codeShareFareClass = value;
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
     * cabinClassCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClassCode() {
        return cabinClassCode;
    }

    /**
     * cabinClassCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinClassCode(String value) {
        this.cabinClassCode = value;
    }

    /**
     * agentCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCode() {
        return agentCode;
    }

    /**
     * agentCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCode(String value) {
        this.agentCode = value;
    }

    /**
     * titleLocal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleLocal() {
        return titleLocal;
    }

    /**
     * titleLocal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleLocal(String value) {
        this.titleLocal = value;
    }

    /**
     * issuingOffice 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingOffice() {
        return issuingOffice;
    }

    /**
     * issuingOffice 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingOffice(String value) {
        this.issuingOffice = value;
    }

    /**
     * issueDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * issueDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    /**
     * fareBasisCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * fareBasisCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the bundledSSrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bundledSSrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBundledSSrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BundledSSrsType }
     * 
     * 
     */
    public List<BundledSSrsType> getBundledSSrs() {
        if (bundledSSrs == null) {
            bundledSSrs = new ArrayList<BundledSSrsType>();
        }
        return this.bundledSSrs;
    }

    /**
     * baggageDropOffTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageDropOffTime() {
        return baggageDropOffTime;
    }

    /**
     * baggageDropOffTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageDropOffTime(String value) {
        this.baggageDropOffTime = value;
    }

    /**
     * fareLevelName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareLevelName() {
        return fareLevelName;
    }

    /**
     * fareLevelName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareLevelName(String value) {
        this.fareLevelName = value;
    }

    /**
     * serialNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * serialNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

}
