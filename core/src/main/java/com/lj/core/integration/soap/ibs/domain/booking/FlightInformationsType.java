//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2021.04.29 시간 12:54:19 PM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>FlightInformationsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FlightInformationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlightCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DepartureTimeString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BoardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OffPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BoardPointCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OffPointCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="JourneyTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="JourneyTimeString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RemainingSeats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FlightSerialNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInformationsType", propOrder = {
    "flightSuffix",
    "flightCarrier",
    "flightNumber",
    "departureDate",
    "arrivalDate",
    "departureTimeString",
    "boardPoint",
    "offPoint",
    "boardPointCity",
    "offPointCity",
    "departureTime",
    "arrivalTime",
    "journeyTime",
    "journeyTimeString",
    "remainingSeats",
    "flightSerialNumber"
})
public class FlightInformationsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FlightSuffix", required = true)
    protected String flightSuffix;
    @XmlElement(name = "FlightCarrier", required = true)
    protected String flightCarrier;
    @XmlElement(name = "FlightNumber", required = true)
    protected String flightNumber;
    @XmlElement(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "ArrivalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDate;
    @XmlElement(name = "DepartureTimeString", required = true)
    protected String departureTimeString;
    @XmlElement(name = "BoardPoint", required = true)
    protected String boardPoint;
    @XmlElement(name = "OffPoint", required = true)
    protected String offPoint;
    @XmlElement(name = "BoardPointCity", required = true)
    protected String boardPointCity;
    @XmlElement(name = "OffPointCity", required = true)
    protected String offPointCity;
    @XmlElement(name = "DepartureTime")
    protected int departureTime;
    @XmlElement(name = "ArrivalTime")
    protected int arrivalTime;
    @XmlElement(name = "JourneyTime")
    protected int journeyTime;
    @XmlElement(name = "JourneyTimeString", required = true)
    protected String journeyTimeString;
    @XmlElement(name = "RemainingSeats")
    protected int remainingSeats;
    @XmlElement(name = "FlightSerialNumber")
    protected int flightSerialNumber;

    /**
     * flightSuffix 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightSuffix() {
        return flightSuffix;
    }

    /**
     * flightSuffix 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightSuffix(String value) {
        this.flightSuffix = value;
    }

    /**
     * flightCarrier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightCarrier() {
        return flightCarrier;
    }

    /**
     * flightCarrier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightCarrier(String value) {
        this.flightCarrier = value;
    }

    /**
     * flightNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * flightNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * departureDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * departureDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * arrivalDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDate() {
        return arrivalDate;
    }

    /**
     * arrivalDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDate(XMLGregorianCalendar value) {
        this.arrivalDate = value;
    }

    /**
     * departureTimeString 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTimeString() {
        return departureTimeString;
    }

    /**
     * departureTimeString 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTimeString(String value) {
        this.departureTimeString = value;
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
     * boardPointCity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardPointCity() {
        return boardPointCity;
    }

    /**
     * boardPointCity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardPointCity(String value) {
        this.boardPointCity = value;
    }

    /**
     * offPointCity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPointCity() {
        return offPointCity;
    }

    /**
     * offPointCity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPointCity(String value) {
        this.offPointCity = value;
    }

    /**
     * departureTime 속성의 값을 가져옵니다.
     * 
     */
    public int getDepartureTime() {
        return departureTime;
    }

    /**
     * departureTime 속성의 값을 설정합니다.
     * 
     */
    public void setDepartureTime(int value) {
        this.departureTime = value;
    }

    /**
     * arrivalTime 속성의 값을 가져옵니다.
     * 
     */
    public int getArrivalTime() {
        return arrivalTime;
    }

    /**
     * arrivalTime 속성의 값을 설정합니다.
     * 
     */
    public void setArrivalTime(int value) {
        this.arrivalTime = value;
    }

    /**
     * journeyTime 속성의 값을 가져옵니다.
     * 
     */
    public int getJourneyTime() {
        return journeyTime;
    }

    /**
     * journeyTime 속성의 값을 설정합니다.
     * 
     */
    public void setJourneyTime(int value) {
        this.journeyTime = value;
    }

    /**
     * journeyTimeString 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyTimeString() {
        return journeyTimeString;
    }

    /**
     * journeyTimeString 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyTimeString(String value) {
        this.journeyTimeString = value;
    }

    /**
     * remainingSeats 속성의 값을 가져옵니다.
     * 
     */
    public int getRemainingSeats() {
        return remainingSeats;
    }

    /**
     * remainingSeats 속성의 값을 설정합니다.
     * 
     */
    public void setRemainingSeats(int value) {
        this.remainingSeats = value;
    }

    /**
     * flightSerialNumber 속성의 값을 가져옵니다.
     * 
     */
    public int getFlightSerialNumber() {
        return flightSerialNumber;
    }

    /**
     * flightSerialNumber 속성의 값을 설정합니다.
     * 
     */
    public void setFlightSerialNumber(int value) {
        this.flightSerialNumber = value;
    }

}
