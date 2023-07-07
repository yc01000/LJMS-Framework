//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The fee info for excess baggage,if exists.
 * 
 * <p>BagConnectionDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BagConnectionDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightDestinationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlightDestinationNameLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FlightCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlightSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DeptTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlightDestination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DepartureCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DepartureCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DepartureCityLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationAirportNameLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FlightDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagConnectionDetails", propOrder = {
    "flightDestinationName",
    "flightDestinationNameLocal",
    "flightCarrier",
    "flightNumber",
    "flightSuffix",
    "deptTime",
    "flightDestination",
    "departureCode",
    "departureCity",
    "departureCityLocal",
    "sequenceNumber",
    "destinationAirportNameLocal",
    "flightDate"
})
public class BagConnectionDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FlightDestinationName", required = true)
    protected String flightDestinationName;
    @XmlElement(name = "FlightDestinationNameLocal")
    protected String flightDestinationNameLocal;
    @XmlElement(name = "FlightCarrier", required = true)
    protected String flightCarrier;
    @XmlElement(name = "FlightNumber", required = true)
    protected String flightNumber;
    @XmlElement(name = "FlightSuffix", required = true)
    protected String flightSuffix;
    @XmlElement(name = "DeptTime", required = true)
    protected String deptTime;
    @XmlElement(name = "FlightDestination", required = true)
    protected String flightDestination;
    @XmlElement(name = "DepartureCode", required = true)
    protected String departureCode;
    @XmlElement(name = "DepartureCity", required = true)
    protected String departureCity;
    @XmlElement(name = "DepartureCityLocal")
    protected String departureCityLocal;
    @XmlElement(name = "SequenceNumber")
    protected String sequenceNumber;
    @XmlElement(name = "DestinationAirportNameLocal")
    protected String destinationAirportNameLocal;
    @XmlElement(name = "FlightDate")
    protected String flightDate;

    /**
     * flightDestinationName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightDestinationName() {
        return flightDestinationName;
    }

    /**
     * flightDestinationName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightDestinationName(String value) {
        this.flightDestinationName = value;
    }

    /**
     * flightDestinationNameLocal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightDestinationNameLocal() {
        return flightDestinationNameLocal;
    }

    /**
     * flightDestinationNameLocal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightDestinationNameLocal(String value) {
        this.flightDestinationNameLocal = value;
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
     * deptTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptTime() {
        return deptTime;
    }

    /**
     * deptTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptTime(String value) {
        this.deptTime = value;
    }

    /**
     * flightDestination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightDestination() {
        return flightDestination;
    }

    /**
     * flightDestination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightDestination(String value) {
        this.flightDestination = value;
    }

    /**
     * departureCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureCode() {
        return departureCode;
    }

    /**
     * departureCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureCode(String value) {
        this.departureCode = value;
    }

    /**
     * departureCity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureCity() {
        return departureCity;
    }

    /**
     * departureCity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureCity(String value) {
        this.departureCity = value;
    }

    /**
     * departureCityLocal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureCityLocal() {
        return departureCityLocal;
    }

    /**
     * departureCityLocal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureCityLocal(String value) {
        this.departureCityLocal = value;
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
     * destinationAirportNameLocal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAirportNameLocal() {
        return destinationAirportNameLocal;
    }

    /**
     * destinationAirportNameLocal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAirportNameLocal(String value) {
        this.destinationAirportNameLocal = value;
    }

    /**
     * flightDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightDate() {
        return flightDate;
    }

    /**
     * flightDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightDate(String value) {
        this.flightDate = value;
    }

}
