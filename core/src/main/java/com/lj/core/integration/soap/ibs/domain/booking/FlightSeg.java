//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.05.28 시간 08:48:08 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>FlightSeg complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FlightSeg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OperatingCarrierInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BoardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OffPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SDT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JourneyTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Stops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DayChange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightStatusType"/>
 *         &lt;element name="isDeiExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AircraftType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isIropIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AircraftVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDisplayableDeiExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSeg", propOrder = {
    "flightInfo",
    "operatingCarrierInfo",
    "boardPoint",
    "offPoint",
    "sdt",
    "sat",
    "journeyTime",
    "stops",
    "dayChange",
    "status",
    "isDeiExists",
    "aircraftType",
    "isIropIndicator",
    "aircraftVersion",
    "isDisplayableDeiExists"
})
public class FlightSeg {

    @XmlElement(name = "FlightInfo", required = true)
    protected String flightInfo;
    @XmlElement(name = "OperatingCarrierInfo")
    protected String operatingCarrierInfo;
    @XmlElement(name = "BoardPoint", required = true)
    protected String boardPoint;
    @XmlElement(name = "OffPoint", required = true)
    protected String offPoint;
    @XmlElement(name = "SDT", required = true)
    protected String sdt;
    @XmlElement(name = "SAT", required = true)
    protected String sat;
    @XmlElement(name = "JourneyTime", required = true, nillable = true)
    protected String journeyTime;
    @XmlElement(name = "Stops")
    protected Integer stops;
    @XmlElement(name = "DayChange")
    protected Integer dayChange;
    @XmlElement(name = "Status", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected FlightStatusType status;
    protected Boolean isDeiExists;
    @XmlElement(name = "AircraftType")
    protected String aircraftType;
    protected Boolean isIropIndicator;
    @XmlElement(name = "AircraftVersion")
    protected String aircraftVersion;
    @XmlElement(name = "IsDisplayableDeiExists")
    protected Boolean isDisplayableDeiExists;

    /**
     * flightInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightInfo() {
        return flightInfo;
    }

    /**
     * flightInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightInfo(String value) {
        this.flightInfo = value;
    }

    /**
     * operatingCarrierInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCarrierInfo() {
        return operatingCarrierInfo;
    }

    /**
     * operatingCarrierInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCarrierInfo(String value) {
        this.operatingCarrierInfo = value;
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
     * sdt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDT() {
        return sdt;
    }

    /**
     * sdt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDT(String value) {
        this.sdt = value;
    }

    /**
     * sat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAT() {
        return sat;
    }

    /**
     * sat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAT(String value) {
        this.sat = value;
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
     * status 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightStatusType }
     *     
     */
    public FlightStatusType getStatus() {
        return status;
    }

    /**
     * status 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightStatusType }
     *     
     */
    public void setStatus(FlightStatusType value) {
        this.status = value;
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

}
