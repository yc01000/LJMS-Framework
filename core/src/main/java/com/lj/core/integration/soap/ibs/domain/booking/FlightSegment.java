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
 * <p>FlightSegment complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FlightSegment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SegmentID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="FlightIdentifier" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifier"/&gt;
 *         &lt;element name="boardPoint" type="{http://www.ibsplc.com/iRes/simpleTypes/}boardPoint"/&gt;
 *         &lt;element name="offPoint" type="{http://www.ibsplc.com/iRes/simpleTypes/}boardPoint"/&gt;
 *         &lt;element name="SegmentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ScheduledDepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ScheduledArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ArrivalDayChange" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ConnectionIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StopoverDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}StopOverDetailsExtract" minOccurs="0"/&gt;
 *         &lt;element name="scheduledDepartureDateTimeCal" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DepartureTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scheduledArrivalTimeCal" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ArrivalTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="journeyTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stops" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TicketDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRExtractTicketDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deiCarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isDisplayableDeiExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "FlightSegment", propOrder = {
    "segmentID",
    "flightIdentifier",
    "boardPoint",
    "offPoint",
    "segmentStatus",
    "scheduledDepartureDateTime",
    "scheduledArrivalTime",
    "arrivalDayChange",
    "connectionIndicator",
    "stopoverDetails",
    "scheduledDepartureDateTimeCal",
    "departureTimeZone",
    "scheduledArrivalTimeCal",
    "arrivalTimeZone",
    "journeyTime",
    "stops",
    "ticketDetails",
    "deiCarrierName",
    "isDisplayableDeiExists"
})
public class FlightSegment
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "SegmentID")
    protected long segmentID;
    @XmlElement(name = "FlightIdentifier", required = true)
    protected FlightIdentifier flightIdentifier;
    @XmlElement(required = true)
    protected BoardPoint boardPoint;
    @XmlElement(required = true)
    protected BoardPoint offPoint;
    @XmlElement(name = "SegmentStatus", required = true)
    protected String segmentStatus;
    @XmlElement(name = "ScheduledDepartureDateTime", required = true)
    protected String scheduledDepartureDateTime;
    @XmlElement(name = "ScheduledArrivalTime", required = true)
    protected String scheduledArrivalTime;
    @XmlElement(name = "ArrivalDayChange")
    protected long arrivalDayChange;
    @XmlElement(name = "ConnectionIndicator", required = true)
    protected String connectionIndicator;
    @XmlElement(name = "StopoverDetails")
    protected StopOverDetailsExtract stopoverDetails;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDepartureDateTimeCal;
    @XmlElement(name = "DepartureTimeZone")
    protected String departureTimeZone;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledArrivalTimeCal;
    @XmlElement(name = "ArrivalTimeZone")
    protected String arrivalTimeZone;
    protected String journeyTime;
    protected int stops;
    @XmlElement(name = "TicketDetails")
    protected List<PNRExtractTicketDetailsType> ticketDetails;
    protected String deiCarrierName;
    protected Boolean isDisplayableDeiExists;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;

    /**
     * segmentID 속성의 값을 가져옵니다.
     * 
     */
    public long getSegmentID() {
        return segmentID;
    }

    /**
     * segmentID 속성의 값을 설정합니다.
     * 
     */
    public void setSegmentID(long value) {
        this.segmentID = value;
    }

    /**
     * flightIdentifier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightIdentifier }
     *     
     */
    public FlightIdentifier getFlightIdentifier() {
        return flightIdentifier;
    }

    /**
     * flightIdentifier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightIdentifier }
     *     
     */
    public void setFlightIdentifier(FlightIdentifier value) {
        this.flightIdentifier = value;
    }

    /**
     * boardPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BoardPoint }
     *     
     */
    public BoardPoint getBoardPoint() {
        return boardPoint;
    }

    /**
     * boardPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardPoint }
     *     
     */
    public void setBoardPoint(BoardPoint value) {
        this.boardPoint = value;
    }

    /**
     * offPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BoardPoint }
     *     
     */
    public BoardPoint getOffPoint() {
        return offPoint;
    }

    /**
     * offPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardPoint }
     *     
     */
    public void setOffPoint(BoardPoint value) {
        this.offPoint = value;
    }

    /**
     * segmentStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentStatus() {
        return segmentStatus;
    }

    /**
     * segmentStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentStatus(String value) {
        this.segmentStatus = value;
    }

    /**
     * scheduledDepartureDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledDepartureDateTime() {
        return scheduledDepartureDateTime;
    }

    /**
     * scheduledDepartureDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledDepartureDateTime(String value) {
        this.scheduledDepartureDateTime = value;
    }

    /**
     * scheduledArrivalTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledArrivalTime() {
        return scheduledArrivalTime;
    }

    /**
     * scheduledArrivalTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledArrivalTime(String value) {
        this.scheduledArrivalTime = value;
    }

    /**
     * arrivalDayChange 속성의 값을 가져옵니다.
     * 
     */
    public long getArrivalDayChange() {
        return arrivalDayChange;
    }

    /**
     * arrivalDayChange 속성의 값을 설정합니다.
     * 
     */
    public void setArrivalDayChange(long value) {
        this.arrivalDayChange = value;
    }

    /**
     * connectionIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionIndicator() {
        return connectionIndicator;
    }

    /**
     * connectionIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionIndicator(String value) {
        this.connectionIndicator = value;
    }

    /**
     * stopoverDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link StopOverDetailsExtract }
     *     
     */
    public StopOverDetailsExtract getStopoverDetails() {
        return stopoverDetails;
    }

    /**
     * stopoverDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link StopOverDetailsExtract }
     *     
     */
    public void setStopoverDetails(StopOverDetailsExtract value) {
        this.stopoverDetails = value;
    }

    /**
     * scheduledDepartureDateTimeCal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDepartureDateTimeCal() {
        return scheduledDepartureDateTimeCal;
    }

    /**
     * scheduledDepartureDateTimeCal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDepartureDateTimeCal(XMLGregorianCalendar value) {
        this.scheduledDepartureDateTimeCal = value;
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
     * scheduledArrivalTimeCal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledArrivalTimeCal() {
        return scheduledArrivalTimeCal;
    }

    /**
     * scheduledArrivalTimeCal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledArrivalTimeCal(XMLGregorianCalendar value) {
        this.scheduledArrivalTimeCal = value;
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
     * {@link PNRExtractTicketDetailsType }
     * 
     * 
     */
    public List<PNRExtractTicketDetailsType> getTicketDetails() {
        if (ticketDetails == null) {
            ticketDetails = new ArrayList<PNRExtractTicketDetailsType>();
        }
        return this.ticketDetails;
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
