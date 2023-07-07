//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2021.04.29 시간 12:54:19 PM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>FlightSegmentDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FlightSegmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightSegmentGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="carrierCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fltNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fltSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flightDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyDetailsType"/&gt;
 *         &lt;element name="PartnerCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartnerflightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodeshareRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="offPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="scheduledDepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="scheduledDepartureTimeLTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DepartureTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scheduledArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="scheduledArrivalTimeLTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ArrivalTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segmentStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}ReservationStatusDetails_Type" minOccurs="0"/&gt;
 *         &lt;element name="StandbyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="journeyTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stops" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="arrivalDayChange" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PostDepartureStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}PostDepartureStatusType" minOccurs="0"/&gt;
 *         &lt;element name="FlightStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightStatusDetails_Type" minOccurs="0"/&gt;
 *         &lt;element name="AircraftType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AircraftVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isThroughFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isDeiExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="deiCarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isIropIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isDCSFlightAffected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DCSFlightAffectedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OldSegmentId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AddedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="HasArnk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isForMarking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SegmenReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isFlightOverBooking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ArnkDateLtc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RichContentRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegmentDetailsType", propOrder = {
    "flightSegmentGroupID",
    "segmentId",
    "carrierCode",
    "fltNumber",
    "fltSuffix",
    "flightDate",
    "partnerCarrierCode",
    "partnerflightNumber",
    "codeshareRole",
    "boardPoint",
    "offPoint",
    "scheduledDepartureDateTime",
    "scheduledDepartureTimeLTC",
    "departureTimeZone",
    "scheduledArrivalTime",
    "scheduledArrivalTimeLTC",
    "arrivalTimeZone",
    "departureTerminal",
    "arrivalTerminal",
    "segmentStatus",
    "standbyCode",
    "journeyTime",
    "stops",
    "arrivalDayChange",
    "cabinClass",
    "postDepartureStatus",
    "flightStatus",
    "aircraftType",
    "aircraftVersion",
    "isThroughFlight",
    "isDeiExists",
    "deiCarrierName",
    "isIropIndicator",
    "isDCSFlightAffected",
    "dcsFlightAffectedReason",
    "oldSegmentId",
    "addedTime",
    "hasArnk",
    "fareClass",
    "isForMarking",
    "segmenReferenceId",
    "isFlightOverBooking",
    "arnkDateLtc"
})
public class FlightSegmentDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FlightSegmentGroupID")
    protected String flightSegmentGroupID;
    @XmlElement(name = "SegmentId", required = true)
    protected String segmentId;
    @XmlElement(required = true)
    protected String carrierCode;
    @XmlElement(required = true)
    protected String fltNumber;
    @XmlElement(required = true)
    protected String fltSuffix;
    @XmlElement(required = true)
    protected DateOnlyDetailsType flightDate;
    @XmlElement(name = "PartnerCarrierCode")
    protected String partnerCarrierCode;
    @XmlElement(name = "PartnerflightNumber")
    protected String partnerflightNumber;
    @XmlElement(name = "CodeshareRole")
    protected String codeshareRole;
    @XmlElement(required = true)
    protected String boardPoint;
    @XmlElement(required = true)
    protected String offPoint;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDepartureDateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDepartureTimeLTC;
    @XmlElement(name = "DepartureTimeZone")
    protected String departureTimeZone;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledArrivalTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledArrivalTimeLTC;
    @XmlElement(name = "ArrivalTimeZone")
    protected String arrivalTimeZone;
    @XmlElement(name = "DepartureTerminal")
    protected String departureTerminal;
    @XmlElement(name = "ArrivalTerminal")
    protected String arrivalTerminal;
    @XmlSchemaType(name = "string")
    protected ReservationStatusDetailsType segmentStatus;
    @XmlElement(name = "StandbyCode")
    protected String standbyCode;
    protected String journeyTime;
    protected int stops;
    protected int arrivalDayChange;
    @XmlElement(name = "CabinClass", required = true)
    protected String cabinClass;
    @XmlElement(name = "PostDepartureStatus")
    @XmlSchemaType(name = "string")
    protected PostDepartureStatusType postDepartureStatus;
    @XmlElement(name = "FlightStatus")
    @XmlSchemaType(name = "string")
    protected FlightStatusDetailsType flightStatus;
    @XmlElement(name = "AircraftType")
    protected String aircraftType;
    @XmlElement(name = "AircraftVersion")
    protected String aircraftVersion;
    protected Boolean isThroughFlight;
    protected Boolean isDeiExists;
    protected String deiCarrierName;
    protected Boolean isIropIndicator;
    protected Boolean isDCSFlightAffected;
    @XmlElement(name = "DCSFlightAffectedReason")
    protected String dcsFlightAffectedReason;
    @XmlElement(name = "OldSegmentId")
    protected List<String> oldSegmentId;
    @XmlElement(name = "AddedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar addedTime;
    @XmlElement(name = "HasArnk")
    protected Boolean hasArnk;
    @XmlElement(name = "FareClass")
    protected String fareClass;
    protected Boolean isForMarking;
    @XmlElement(name = "SegmenReferenceId")
    protected String segmenReferenceId;
    protected Boolean isFlightOverBooking;
    @XmlElement(name = "ArnkDateLtc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arnkDateLtc;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;

    /**
     * flightSegmentGroupID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightSegmentGroupID() {
        return flightSegmentGroupID;
    }

    /**
     * flightSegmentGroupID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightSegmentGroupID(String value) {
        this.flightSegmentGroupID = value;
    }

    /**
     * segmentId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * segmentId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentId(String value) {
        this.segmentId = value;
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
     * fltNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltNumber() {
        return fltNumber;
    }

    /**
     * fltNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltNumber(String value) {
        this.fltNumber = value;
    }

    /**
     * fltSuffix 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltSuffix() {
        return fltSuffix;
    }

    /**
     * fltSuffix 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltSuffix(String value) {
        this.fltSuffix = value;
    }

    /**
     * flightDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyDetailsType }
     *     
     */
    public DateOnlyDetailsType getFlightDate() {
        return flightDate;
    }

    /**
     * flightDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyDetailsType }
     *     
     */
    public void setFlightDate(DateOnlyDetailsType value) {
        this.flightDate = value;
    }

    /**
     * partnerCarrierCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerCarrierCode() {
        return partnerCarrierCode;
    }

    /**
     * partnerCarrierCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerCarrierCode(String value) {
        this.partnerCarrierCode = value;
    }

    /**
     * partnerflightNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerflightNumber() {
        return partnerflightNumber;
    }

    /**
     * partnerflightNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerflightNumber(String value) {
        this.partnerflightNumber = value;
    }

    /**
     * codeshareRole 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeshareRole() {
        return codeshareRole;
    }

    /**
     * codeshareRole 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeshareRole(String value) {
        this.codeshareRole = value;
    }

    /**
     * boardPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardPoint() {
        return boardPoint;
    }

    /**
     * boardPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardPoint(String value) {
        this.boardPoint = value;
    }

    /**
     * offPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPoint() {
        return offPoint;
    }

    /**
     * offPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPoint(String value) {
        this.offPoint = value;
    }

    /**
     * scheduledDepartureDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDepartureDateTime() {
        return scheduledDepartureDateTime;
    }

    /**
     * scheduledDepartureDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDepartureDateTime(XMLGregorianCalendar value) {
        this.scheduledDepartureDateTime = value;
    }

    /**
     * scheduledDepartureTimeLTC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDepartureTimeLTC() {
        return scheduledDepartureTimeLTC;
    }

    /**
     * scheduledDepartureTimeLTC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDepartureTimeLTC(XMLGregorianCalendar value) {
        this.scheduledDepartureTimeLTC = value;
    }

    /**
     * departureTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTimeZone() {
        return departureTimeZone;
    }

    /**
     * departureTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTimeZone(String value) {
        this.departureTimeZone = value;
    }

    /**
     * scheduledArrivalTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledArrivalTime() {
        return scheduledArrivalTime;
    }

    /**
     * scheduledArrivalTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledArrivalTime(XMLGregorianCalendar value) {
        this.scheduledArrivalTime = value;
    }

    /**
     * scheduledArrivalTimeLTC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledArrivalTimeLTC() {
        return scheduledArrivalTimeLTC;
    }

    /**
     * scheduledArrivalTimeLTC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledArrivalTimeLTC(XMLGregorianCalendar value) {
        this.scheduledArrivalTimeLTC = value;
    }

    /**
     * arrivalTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTimeZone() {
        return arrivalTimeZone;
    }

    /**
     * arrivalTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTimeZone(String value) {
        this.arrivalTimeZone = value;
    }

    /**
     * departureTerminal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTerminal() {
        return departureTerminal;
    }

    /**
     * departureTerminal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTerminal(String value) {
        this.departureTerminal = value;
    }

    /**
     * arrivalTerminal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTerminal() {
        return arrivalTerminal;
    }

    /**
     * arrivalTerminal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTerminal(String value) {
        this.arrivalTerminal = value;
    }

    /**
     * segmentStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ReservationStatusDetailsType }
     *     
     */
    public ReservationStatusDetailsType getSegmentStatus() {
        return segmentStatus;
    }

    /**
     * segmentStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationStatusDetailsType }
     *     
     */
    public void setSegmentStatus(ReservationStatusDetailsType value) {
        this.segmentStatus = value;
    }

    /**
     * standbyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandbyCode() {
        return standbyCode;
    }

    /**
     * standbyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandbyCode(String value) {
        this.standbyCode = value;
    }

    /**
     * journeyTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyTime() {
        return journeyTime;
    }

    /**
     * journeyTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyTime(String value) {
        this.journeyTime = value;
    }

    /**
     * stops 속성의 값을 가져옵니다.
     * 
     */
    public int getStops() {
        return stops;
    }

    /**
     * stops 속성의 값을 설정합니다.
     * 
     */
    public void setStops(int value) {
        this.stops = value;
    }

    /**
     * arrivalDayChange 속성의 값을 가져옵니다.
     * 
     */
    public int getArrivalDayChange() {
        return arrivalDayChange;
    }

    /**
     * arrivalDayChange 속성의 값을 설정합니다.
     * 
     */
    public void setArrivalDayChange(int value) {
        this.arrivalDayChange = value;
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
     * postDepartureStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PostDepartureStatusType }
     *     
     */
    public PostDepartureStatusType getPostDepartureStatus() {
        return postDepartureStatus;
    }

    /**
     * postDepartureStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PostDepartureStatusType }
     *     
     */
    public void setPostDepartureStatus(PostDepartureStatusType value) {
        this.postDepartureStatus = value;
    }

    /**
     * flightStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightStatusDetailsType }
     *     
     */
    public FlightStatusDetailsType getFlightStatus() {
        return flightStatus;
    }

    /**
     * flightStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightStatusDetailsType }
     *     
     */
    public void setFlightStatus(FlightStatusDetailsType value) {
        this.flightStatus = value;
    }

    /**
     * aircraftType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftType() {
        return aircraftType;
    }

    /**
     * aircraftType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftType(String value) {
        this.aircraftType = value;
    }

    /**
     * aircraftVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftVersion() {
        return aircraftVersion;
    }

    /**
     * aircraftVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftVersion(String value) {
        this.aircraftVersion = value;
    }

    /**
     * isThroughFlight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsThroughFlight() {
        return isThroughFlight;
    }

    /**
     * isThroughFlight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsThroughFlight(Boolean value) {
        this.isThroughFlight = value;
    }

    /**
     * isDeiExists 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeiExists() {
        return isDeiExists;
    }

    /**
     * isDeiExists 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeiExists(Boolean value) {
        this.isDeiExists = value;
    }

    /**
     * deiCarrierName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeiCarrierName() {
        return deiCarrierName;
    }

    /**
     * deiCarrierName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeiCarrierName(String value) {
        this.deiCarrierName = value;
    }

    /**
     * isIropIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIropIndicator() {
        return isIropIndicator;
    }

    /**
     * isIropIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIropIndicator(Boolean value) {
        this.isIropIndicator = value;
    }

    /**
     * isDCSFlightAffected 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDCSFlightAffected() {
        return isDCSFlightAffected;
    }

    /**
     * isDCSFlightAffected 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDCSFlightAffected(Boolean value) {
        this.isDCSFlightAffected = value;
    }

    /**
     * dcsFlightAffectedReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCSFlightAffectedReason() {
        return dcsFlightAffectedReason;
    }

    /**
     * dcsFlightAffectedReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCSFlightAffectedReason(String value) {
        this.dcsFlightAffectedReason = value;
    }

    /**
     * Gets the value of the oldSegmentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oldSegmentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOldSegmentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOldSegmentId() {
        if (oldSegmentId == null) {
            oldSegmentId = new ArrayList<String>();
        }
        return this.oldSegmentId;
    }

    /**
     * addedTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAddedTime() {
        return addedTime;
    }

    /**
     * addedTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAddedTime(XMLGregorianCalendar value) {
        this.addedTime = value;
    }

    /**
     * hasArnk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasArnk() {
        return hasArnk;
    }

    /**
     * hasArnk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasArnk(Boolean value) {
        this.hasArnk = value;
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
     * isForMarking 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsForMarking() {
        return isForMarking;
    }

    /**
     * isForMarking 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsForMarking(Boolean value) {
        this.isForMarking = value;
    }

    /**
     * segmenReferenceId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmenReferenceId() {
        return segmenReferenceId;
    }

    /**
     * segmenReferenceId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmenReferenceId(String value) {
        this.segmenReferenceId = value;
    }

    /**
     * isFlightOverBooking 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFlightOverBooking() {
        return isFlightOverBooking;
    }

    /**
     * isFlightOverBooking 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFlightOverBooking(Boolean value) {
        this.isFlightOverBooking = value;
    }

    /**
     * arnkDateLtc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArnkDateLtc() {
        return arnkDateLtc;
    }

    /**
     * arnkDateLtc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArnkDateLtc(XMLGregorianCalendar value) {
        this.arnkDateLtc = value;
    }

    /**
     * richContentRef 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRichContentRef() {
        return richContentRef;
    }

    /**
     * richContentRef 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRichContentRef(String value) {
        this.richContentRef = value;
    }

}
