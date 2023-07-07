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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>PNRSegmentDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PNRSegmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TravelDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType" minOccurs="0"/&gt;
 *         &lt;element name="FlightIdentifierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureDateAndTime" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateAndTimeType" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalDateAndTime" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateAndTimeType" minOccurs="0"/&gt;
 *         &lt;element name="JourneyTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Stops" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNRSegmentDetailsType", propOrder = {
    "travelDate",
    "flightIdentifierType",
    "departureAirportCode",
    "departureDateAndTime",
    "arrivalAirportCode",
    "arrivalDateAndTime",
    "journeyTime",
    "stops"
})
public class PNRSegmentDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "TravelDate")
    protected DateOnlyType travelDate;
    @XmlElement(name = "FlightIdentifierType")
    protected String flightIdentifierType;
    @XmlElement(name = "DepartureAirportCode")
    protected String departureAirportCode;
    @XmlElement(name = "DepartureDateAndTime")
    protected DateAndTimeType departureDateAndTime;
    @XmlElement(name = "ArrivalAirportCode")
    protected String arrivalAirportCode;
    @XmlElement(name = "ArrivalDateAndTime")
    protected DateAndTimeType arrivalDateAndTime;
    @XmlElement(name = "JourneyTime")
    protected String journeyTime;
    @XmlElement(name = "Stops")
    protected String stops;

    /**
     * travelDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getTravelDate() {
        return travelDate;
    }

    /**
     * travelDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setTravelDate(DateOnlyType value) {
        this.travelDate = value;
    }

    /**
     * flightIdentifierType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightIdentifierType() {
        return flightIdentifierType;
    }

    /**
     * flightIdentifierType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightIdentifierType(String value) {
        this.flightIdentifierType = value;
    }

    /**
     * departureAirportCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    /**
     * departureAirportCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureAirportCode(String value) {
        this.departureAirportCode = value;
    }

    /**
     * departureDateAndTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeType }
     *     
     */
    public DateAndTimeType getDepartureDateAndTime() {
        return departureDateAndTime;
    }

    /**
     * departureDateAndTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeType }
     *     
     */
    public void setDepartureDateAndTime(DateAndTimeType value) {
        this.departureDateAndTime = value;
    }

    /**
     * arrivalAirportCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalAirportCode() {
        return arrivalAirportCode;
    }

    /**
     * arrivalAirportCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalAirportCode(String value) {
        this.arrivalAirportCode = value;
    }

    /**
     * arrivalDateAndTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeType }
     *     
     */
    public DateAndTimeType getArrivalDateAndTime() {
        return arrivalDateAndTime;
    }

    /**
     * arrivalDateAndTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeType }
     *     
     */
    public void setArrivalDateAndTime(DateAndTimeType value) {
        this.arrivalDateAndTime = value;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStops() {
        return stops;
    }

    /**
     * stops 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStops(String value) {
        this.stops = value;
    }

}
