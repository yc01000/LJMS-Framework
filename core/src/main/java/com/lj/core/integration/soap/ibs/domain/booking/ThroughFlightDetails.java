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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>ThroughFlightDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ThroughFlightDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightDesignator" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightDesignator"/&gt;
 *         &lt;element name="DepartureDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/&gt;
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StopOverPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepAirport" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ArrivalAirport" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="JourneyTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DayChange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StopOverDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}StopOverDetails" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThroughFlightDetails", propOrder = {
    "flightDesignator",
    "departureDate",
    "day",
    "stopOverPoints",
    "depAirport",
    "arrivalAirport",
    "route",
    "departureTime",
    "arrivalTime",
    "journeyTime",
    "dayChange",
    "stopOverDetails"
})
public class ThroughFlightDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FlightDesignator", required = true)
    protected FlightDesignator flightDesignator;
    @XmlElement(name = "DepartureDate", required = true)
    protected DateOnlyType departureDate;
    @XmlElement(name = "Day")
    protected int day;
    @XmlElement(name = "StopOverPoints")
    protected String stopOverPoints;
    @XmlElement(name = "DepAirport", required = true)
    protected String depAirport;
    @XmlElement(name = "ArrivalAirport", required = true)
    protected String arrivalAirport;
    @XmlElement(name = "Route", required = true)
    protected String route;
    @XmlElement(name = "DepartureTime", required = true)
    protected String departureTime;
    @XmlElement(name = "ArrivalTime", required = true)
    protected String arrivalTime;
    @XmlElement(name = "JourneyTime", required = true)
    protected String journeyTime;
    @XmlElement(name = "DayChange")
    protected Integer dayChange;
    @XmlElement(name = "StopOverDetails", required = true)
    protected List<StopOverDetails> stopOverDetails;

    /**
     * flightDesignator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightDesignator }
     *     
     */
    public FlightDesignator getFlightDesignator() {
        return flightDesignator;
    }

    /**
     * flightDesignator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDesignator }
     *     
     */
    public void setFlightDesignator(FlightDesignator value) {
        this.flightDesignator = value;
    }

    /**
     * departureDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getDepartureDate() {
        return departureDate;
    }

    /**
     * departureDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setDepartureDate(DateOnlyType value) {
        this.departureDate = value;
    }

    /**
     * day 속성의 값을 가져옵니다.
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * day 속성의 값을 설정합니다.
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    /**
     * stopOverPoints 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopOverPoints() {
        return stopOverPoints;
    }

    /**
     * stopOverPoints 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopOverPoints(String value) {
        this.stopOverPoints = value;
    }

    /**
     * depAirport 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepAirport() {
        return depAirport;
    }

    /**
     * depAirport 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepAirport(String value) {
        this.depAirport = value;
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
     * route 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * route 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
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
     * dayChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDayChange() {
        return dayChange;
    }

    /**
     * dayChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDayChange(Integer value) {
        this.dayChange = value;
    }

    /**
     * Gets the value of the stopOverDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopOverDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopOverDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopOverDetails }
     * 
     * 
     */
    public List<StopOverDetails> getStopOverDetails() {
        if (stopOverDetails == null) {
            stopOverDetails = new ArrayList<StopOverDetails>();
        }
        return this.stopOverDetails;
    }

}
