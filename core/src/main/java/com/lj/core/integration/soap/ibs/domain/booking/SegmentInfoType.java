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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>SegmentInfoType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SegmentInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightIdentifierInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierInfoType" minOccurs="0"/&gt;
 *         &lt;element name="OperatingAirlineInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}OperatingAirlineInfoType" minOccurs="0"/&gt;
 *         &lt;element name="DepartureInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelPointInfoType" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelPointInfoType" minOccurs="0"/&gt;
 *         &lt;element name="AircraftInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}AircraftInfoType" minOccurs="0"/&gt;
 *         &lt;element name="DeiInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}DeiInfoType" minOccurs="0"/&gt;
 *         &lt;element name="SegmentAvailability" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentAvailabilityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SegmentIndex" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="Stops" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DayChange" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="JourneyTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsIropedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentInfoType", propOrder = {
    "flightIdentifierInfo",
    "operatingAirlineInfo",
    "departureInfo",
    "arrivalInfo",
    "aircraftInfo",
    "deiInfo",
    "segmentAvailability"
})
public class SegmentInfoType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FlightIdentifierInfo")
    protected FlightIdentifierInfoType flightIdentifierInfo;
    @XmlElement(name = "OperatingAirlineInfo")
    protected OperatingAirlineInfoType operatingAirlineInfo;
    @XmlElement(name = "DepartureInfo")
    protected TravelPointInfoType departureInfo;
    @XmlElement(name = "ArrivalInfo")
    protected TravelPointInfoType arrivalInfo;
    @XmlElement(name = "AircraftInfo")
    protected AircraftInfoType aircraftInfo;
    @XmlElement(name = "DeiInfo")
    protected DeiInfoType deiInfo;
    @XmlElement(name = "SegmentAvailability")
    protected List<SegmentAvailabilityType> segmentAvailability;
    @XmlAttribute(name = "SegmentIndex")
    protected Long segmentIndex;
    @XmlAttribute(name = "Stops")
    protected Integer stops;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "DayChange")
    protected Integer dayChange;
    @XmlAttribute(name = "JourneyTime")
    protected String journeyTime;
    @XmlAttribute(name = "IsIropedInd")
    protected Boolean isIropedInd;

    /**
     * flightIdentifierInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightIdentifierInfoType }
     *     
     */
    public FlightIdentifierInfoType getFlightIdentifierInfo() {
        return flightIdentifierInfo;
    }

    /**
     * flightIdentifierInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightIdentifierInfoType }
     *     
     */
    public void setFlightIdentifierInfo(FlightIdentifierInfoType value) {
        this.flightIdentifierInfo = value;
    }

    /**
     * operatingAirlineInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OperatingAirlineInfoType }
     *     
     */
    public OperatingAirlineInfoType getOperatingAirlineInfo() {
        return operatingAirlineInfo;
    }

    /**
     * operatingAirlineInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingAirlineInfoType }
     *     
     */
    public void setOperatingAirlineInfo(OperatingAirlineInfoType value) {
        this.operatingAirlineInfo = value;
    }

    /**
     * departureInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TravelPointInfoType }
     *     
     */
    public TravelPointInfoType getDepartureInfo() {
        return departureInfo;
    }

    /**
     * departureInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelPointInfoType }
     *     
     */
    public void setDepartureInfo(TravelPointInfoType value) {
        this.departureInfo = value;
    }

    /**
     * arrivalInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TravelPointInfoType }
     *     
     */
    public TravelPointInfoType getArrivalInfo() {
        return arrivalInfo;
    }

    /**
     * arrivalInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelPointInfoType }
     *     
     */
    public void setArrivalInfo(TravelPointInfoType value) {
        this.arrivalInfo = value;
    }

    /**
     * aircraftInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AircraftInfoType }
     *     
     */
    public AircraftInfoType getAircraftInfo() {
        return aircraftInfo;
    }

    /**
     * aircraftInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftInfoType }
     *     
     */
    public void setAircraftInfo(AircraftInfoType value) {
        this.aircraftInfo = value;
    }

    /**
     * deiInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DeiInfoType }
     *     
     */
    public DeiInfoType getDeiInfo() {
        return deiInfo;
    }

    /**
     * deiInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DeiInfoType }
     *     
     */
    public void setDeiInfo(DeiInfoType value) {
        this.deiInfo = value;
    }

    /**
     * Gets the value of the segmentAvailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentAvailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentAvailabilityType }
     * 
     * 
     */
    public List<SegmentAvailabilityType> getSegmentAvailability() {
        if (segmentAvailability == null) {
            segmentAvailability = new ArrayList<SegmentAvailabilityType>();
        }
        return this.segmentAvailability;
    }

    /**
     * segmentIndex 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSegmentIndex() {
        return segmentIndex;
    }

    /**
     * segmentIndex 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSegmentIndex(Long value) {
        this.segmentIndex = value;
    }

    /**
     * stops 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStops() {
        return stops;
    }

    /**
     * stops 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStops(Integer value) {
        this.stops = value;
    }

    /**
     * status 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * status 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * isIropedInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIropedInd() {
        return isIropedInd;
    }

    /**
     * isIropedInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIropedInd(Boolean value) {
        this.isIropedInd = value;
    }

}
