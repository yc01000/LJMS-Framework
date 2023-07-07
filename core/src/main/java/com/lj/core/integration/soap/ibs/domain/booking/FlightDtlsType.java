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
 * <p>FlightDtlsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FlightDtlsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightIdentifierType" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierType"/&gt;
 *         &lt;element name="BoardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OffPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DepartureDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}DepartureType"/&gt;
 *         &lt;element name="ArrivalDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ArrivalType"/&gt;
 *         &lt;element name="JourneyTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TailNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AircraftType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DayChange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IROPComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LegStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DcsStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DelayCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}DelayCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LegOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FlightType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightDtlsType", propOrder = {
    "flightIdentifierType",
    "boardPoint",
    "offPoint",
    "departureDetails",
    "arrivalDetails",
    "journeyTime",
    "tailNumber",
    "aircraftType",
    "lastUpdateTime",
    "dayChange",
    "iropComments",
    "legStatus",
    "dcsStatus",
    "delayCode",
    "legOrder",
    "flightType"
})
public class FlightDtlsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FlightIdentifierType", required = true)
    protected FlightIdentifierType flightIdentifierType;
    @XmlElement(name = "BoardPoint", required = true)
    protected String boardPoint;
    @XmlElement(name = "OffPoint", required = true)
    protected String offPoint;
    @XmlElement(name = "DepartureDetails", required = true)
    protected DepartureType departureDetails;
    @XmlElement(name = "ArrivalDetails", required = true)
    protected ArrivalType arrivalDetails;
    @XmlElement(name = "JourneyTime", required = true)
    protected String journeyTime;
    @XmlElement(name = "TailNumber")
    protected String tailNumber;
    @XmlElement(name = "AircraftType")
    protected String aircraftType;
    @XmlElement(name = "LastUpdateTime")
    protected String lastUpdateTime;
    @XmlElement(name = "DayChange")
    protected Integer dayChange;
    @XmlElement(name = "IROPComments")
    protected String iropComments;
    @XmlElement(name = "LegStatus")
    protected String legStatus;
    @XmlElement(name = "DcsStatus")
    protected String dcsStatus;
    @XmlElement(name = "DelayCode")
    protected List<DelayCodeType> delayCode;
    @XmlElement(name = "LegOrder")
    protected Integer legOrder;
    @XmlElement(name = "FlightType")
    protected String flightType;

    /**
     * flightIdentifierType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightIdentifierType }
     *     
     */
    public FlightIdentifierType getFlightIdentifierType() {
        return flightIdentifierType;
    }

    /**
     * flightIdentifierType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightIdentifierType }
     *     
     */
    public void setFlightIdentifierType(FlightIdentifierType value) {
        this.flightIdentifierType = value;
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
     * departureDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DepartureType }
     *     
     */
    public DepartureType getDepartureDetails() {
        return departureDetails;
    }

    /**
     * departureDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureType }
     *     
     */
    public void setDepartureDetails(DepartureType value) {
        this.departureDetails = value;
    }

    /**
     * arrivalDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalType }
     *     
     */
    public ArrivalType getArrivalDetails() {
        return arrivalDetails;
    }

    /**
     * arrivalDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalType }
     *     
     */
    public void setArrivalDetails(ArrivalType value) {
        this.arrivalDetails = value;
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
     * tailNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTailNumber() {
        return tailNumber;
    }

    /**
     * tailNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTailNumber(String value) {
        this.tailNumber = value;
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
     * lastUpdateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * lastUpdateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateTime(String value) {
        this.lastUpdateTime = value;
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
     * iropComments 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIROPComments() {
        return iropComments;
    }

    /**
     * iropComments 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIROPComments(String value) {
        this.iropComments = value;
    }

    /**
     * legStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegStatus() {
        return legStatus;
    }

    /**
     * legStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegStatus(String value) {
        this.legStatus = value;
    }

    /**
     * dcsStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcsStatus() {
        return dcsStatus;
    }

    /**
     * dcsStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcsStatus(String value) {
        this.dcsStatus = value;
    }

    /**
     * Gets the value of the delayCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delayCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelayCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DelayCodeType }
     * 
     * 
     */
    public List<DelayCodeType> getDelayCode() {
        if (delayCode == null) {
            delayCode = new ArrayList<DelayCodeType>();
        }
        return this.delayCode;
    }

    /**
     * legOrder 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLegOrder() {
        return legOrder;
    }

    /**
     * legOrder 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLegOrder(Integer value) {
        this.legOrder = value;
    }

    /**
     * flightType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightType() {
        return flightType;
    }

    /**
     * flightType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightType(String value) {
        this.flightType = value;
    }

}
