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
 * <p>FlightSegmentType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FlightSegmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightIdentifier" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierType"/&gt;
 *         &lt;element name="AircraftType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AircraftVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureAirport" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DepartureDateTimeUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ArrivalAirport" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ArrivalDateTimeUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DepartureTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegmentType", propOrder = {
    "flightIdentifier",
    "aircraftType",
    "aircraftVersion",
    "departureAirport",
    "departureDateTimeUTC",
    "arrivalAirport",
    "arrivalDateTimeUTC",
    "departureTerminal",
    "arrivalTerminal"
})
public class FlightSegmentType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FlightIdentifier", required = true)
    protected FlightIdentifierType flightIdentifier;
    @XmlElement(name = "AircraftType")
    protected String aircraftType;
    @XmlElement(name = "AircraftVersion")
    protected String aircraftVersion;
    @XmlElement(name = "DepartureAirport", required = true)
    protected String departureAirport;
    @XmlElement(name = "DepartureDateTimeUTC", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateTimeUTC;
    @XmlElement(name = "ArrivalAirport", required = true)
    protected String arrivalAirport;
    @XmlElement(name = "ArrivalDateTimeUTC", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDateTimeUTC;
    @XmlElement(name = "DepartureTerminal")
    protected String departureTerminal;
    @XmlElement(name = "ArrivalTerminal")
    protected String arrivalTerminal;

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
     * departureAirport 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureAirport() {
        return departureAirport;
    }

    /**
     * departureAirport 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureAirport(String value) {
        this.departureAirport = value;
    }

    /**
     * departureDateTimeUTC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDateTimeUTC() {
        return departureDateTimeUTC;
    }

    /**
     * departureDateTimeUTC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDateTimeUTC(XMLGregorianCalendar value) {
        this.departureDateTimeUTC = value;
    }

    /**
     * arrivalAirport 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * arrivalAirport 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalAirport(String value) {
        this.arrivalAirport = value;
    }

    /**
     * arrivalDateTimeUTC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDateTimeUTC() {
        return arrivalDateTimeUTC;
    }

    /**
     * arrivalDateTimeUTC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDateTimeUTC(XMLGregorianCalendar value) {
        this.arrivalDateTimeUTC = value;
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

}
