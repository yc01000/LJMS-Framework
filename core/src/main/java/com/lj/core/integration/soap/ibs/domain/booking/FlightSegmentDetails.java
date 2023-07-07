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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>FlightSegmentDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FlightSegmentDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightIdentifier" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierType"/&gt;
 *         &lt;element name="boardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="offPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="scheduledDepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DepartureTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scheduledArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ArrivalTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segmentStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}ReservationStatusType" minOccurs="0"/&gt;
 *         &lt;element name="journeyTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stops" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="arrivalDayChange" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="flightLegDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightLegDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PostDepartureStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}PostDepartureStatus" minOccurs="0"/&gt;
 *         &lt;element name="FlightStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightStatusType" minOccurs="0"/&gt;
 *         &lt;element name="AircraftType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AircraftVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SegmentSequenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isThroughFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isDeiExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="deiCarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isIropIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TicketDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TicketDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isDisplayableDeiExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isFlightOverBooking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegmentDetails", propOrder = {
    "flightIdentifier",
    "boardPoint",
    "offPoint",
    "scheduledDepartureDateTime",
    "departureTimeZone",
    "scheduledArrivalTime",
    "arrivalTimeZone",
    "departureTerminal",
    "arrivalTerminal",
    "segmentStatus",
    "journeyTime",
    "stops",
    "arrivalDayChange",
    "flightLegDetails",
    "segmentId",
    "cabinClass",
    "postDepartureStatus",
    "flightStatus",
    "aircraftType",
    "aircraftVersion",
    "segmentSequenceID",
    "isThroughFlight",
    "isDeiExists",
    "deiCarrierName",
    "isIropIndicator",
    "ticketDetails",
    "isDisplayableDeiExists",
    "isFlightOverBooking"
})
public class FlightSegmentDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected FlightIdentifierType flightIdentifier;
    @XmlElement(required = true)
    protected String boardPoint;
    @XmlElement(required = true)
    protected String offPoint;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDepartureDateTime;
    @XmlElement(name = "DepartureTimeZone")
    protected String departureTimeZone;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledArrivalTime;
    @XmlElement(name = "ArrivalTimeZone")
    protected String arrivalTimeZone;
    @XmlElement(name = "DepartureTerminal")
    protected String departureTerminal;
    @XmlElement(name = "ArrivalTerminal")
    protected String arrivalTerminal;
    @XmlSchemaType(name = "string")
    protected ReservationStatusType segmentStatus;
    protected String journeyTime;
    protected int stops;
    protected int arrivalDayChange;
    protected List<FlightLegDetailsType> flightLegDetails;
    @XmlElement(name = "SegmentId")
    protected String segmentId;
    @XmlElement(name = "CabinClass", required = true)
    protected String cabinClass;
    @XmlElement(name = "PostDepartureStatus")
    @XmlSchemaType(name = "string")
    protected PostDepartureStatus postDepartureStatus;
    @XmlElement(name = "FlightStatus")
    @XmlSchemaType(name = "string")
    protected FlightStatusType flightStatus;
    @XmlElement(name = "AircraftType")
    protected String aircraftType;
    @XmlElement(name = "AircraftVersion")
    protected String aircraftVersion;
    @XmlElement(name = "SegmentSequenceID")
    protected String segmentSequenceID;
    protected Boolean isThroughFlight;
    protected Boolean isDeiExists;
    protected String deiCarrierName;
    protected Boolean isIropIndicator;
    @XmlElement(name = "TicketDetails")
    protected List<TicketDetailsType> ticketDetails;
    protected Boolean isDisplayableDeiExists;
    protected Boolean isFlightOverBooking;

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
     *     {@link ReservationStatusType }
     *     
     */
    public ReservationStatusType getSegmentStatus() {
        return segmentStatus;
    }

    /**
     * segmentStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationStatusType }
     *     
     */
    public void setSegmentStatus(ReservationStatusType value) {
        this.segmentStatus = value;
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
     * Gets the value of the flightLegDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightLegDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightLegDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightLegDetailsType }
     * 
     * 
     */
    public List<FlightLegDetailsType> getFlightLegDetails() {
        if (flightLegDetails == null) {
            flightLegDetails = new ArrayList<FlightLegDetailsType>();
        }
        return this.flightLegDetails;
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
     *     {@link PostDepartureStatus }
     *     
     */
    public PostDepartureStatus getPostDepartureStatus() {
        return postDepartureStatus;
    }

    /**
     * postDepartureStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PostDepartureStatus }
     *     
     */
    public void setPostDepartureStatus(PostDepartureStatus value) {
        this.postDepartureStatus = value;
    }

    /**
     * flightStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightStatusType }
     *     
     */
    public FlightStatusType getFlightStatus() {
        return flightStatus;
    }

    /**
     * flightStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightStatusType }
     *     
     */
    public void setFlightStatus(FlightStatusType value) {
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
     * segmentSequenceID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentSequenceID() {
        return segmentSequenceID;
    }

    /**
     * segmentSequenceID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentSequenceID(String value) {
        this.segmentSequenceID = value;
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
     * isDisplayableDeiExists 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDisplayableDeiExists() {
        return isDisplayableDeiExists;
    }

    /**
     * isDisplayableDeiExists 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDisplayableDeiExists(Boolean value) {
        this.isDisplayableDeiExists = value;
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

}
