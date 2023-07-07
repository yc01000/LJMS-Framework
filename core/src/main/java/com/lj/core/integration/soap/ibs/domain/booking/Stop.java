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
 * <p>Stop complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Stop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StopNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Airport" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ArrivalDay" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DepartureDay" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stop", propOrder = {
    "stopNumber",
    "airport",
    "arrivalTime",
    "arrivalDay",
    "departureTime",
    "departureDay"
})
public class Stop
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "StopNumber", required = true)
    protected String stopNumber;
    @XmlElement(name = "Airport", required = true)
    protected String airport;
    @XmlElement(name = "ArrivalTime", required = true)
    protected String arrivalTime;
    @XmlElement(name = "ArrivalDay", required = true)
    protected String arrivalDay;
    @XmlElement(name = "DepartureTime", required = true)
    protected String departureTime;
    @XmlElement(name = "DepartureDay", required = true)
    protected String departureDay;

    /**
     * stopNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopNumber() {
        return stopNumber;
    }

    /**
     * stopNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopNumber(String value) {
        this.stopNumber = value;
    }

    /**
     * airport 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirport() {
        return airport;
    }

    /**
     * airport 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirport(String value) {
        this.airport = value;
    }

    /**
     * arrivalTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * arrivalTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * arrivalDay 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDay() {
        return arrivalDay;
    }

    /**
     * arrivalDay 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDay(String value) {
        this.arrivalDay = value;
    }

    /**
     * departureTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * departureTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * departureDay 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDay() {
        return departureDay;
    }

    /**
     * departureDay 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDay(String value) {
        this.departureDay = value;
    }

}
