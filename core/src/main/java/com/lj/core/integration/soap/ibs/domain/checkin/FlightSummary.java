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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information to be showm as flight summary.
 * 
 * <p>FlightSummary complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FlightSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightNumber" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightNumberType"/&gt;
 *         &lt;element name="FlightDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FlightRoute" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlightStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ETD" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="STD" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ETA" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="STA" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DelayTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureGate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BoardingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="JourneyTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BoardingStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}BoardingStatusType" minOccurs="0"/&gt;
 *         &lt;element name="Segment" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentInfo"/&gt;
 *         &lt;element name="TailNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WeatherwiseIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentChangeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IROPIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCheckinPossible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsConnectionCheckinPossible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isDisplayableDeiExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSummary", propOrder = {
    "flightNumber",
    "flightDate",
    "flightRoute",
    "flightStatus",
    "etd",
    "std",
    "eta",
    "sta",
    "delayTime",
    "departureGate",
    "boardingTime",
    "journeyTime",
    "boardingStatus",
    "segment",
    "tailNumber",
    "weatherwiseIndicator",
    "equipmentChangeIndicator",
    "iropIndicator",
    "isCheckinPossible",
    "isConnectionCheckinPossible",
    "isDisplayableDeiExists"
})
public class FlightSummary
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FlightNumber", required = true)
    protected FlightNumberType flightNumber;
    @XmlElement(name = "FlightDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flightDate;
    @XmlElement(name = "FlightRoute", required = true)
    protected String flightRoute;
    @XmlElement(name = "FlightStatus", required = true)
    protected String flightStatus;
    @XmlElement(name = "ETD")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar etd;
    @XmlElement(name = "STD", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar std;
    @XmlElement(name = "ETA")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eta;
    @XmlElement(name = "STA", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sta;
    @XmlElement(name = "DelayTime")
    protected String delayTime;
    @XmlElement(name = "DepartureGate")
    protected String departureGate;
    @XmlElement(name = "BoardingTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar boardingTime;
    @XmlElement(name = "JourneyTime")
    protected String journeyTime;
    @XmlElement(name = "BoardingStatus")
    @XmlSchemaType(name = "string")
    protected BoardingStatusType boardingStatus;
    @XmlElement(name = "Segment", required = true)
    protected SegmentInfo segment;
    @XmlElement(name = "TailNumber")
    protected String tailNumber;
    @XmlElement(name = "WeatherwiseIndicator")
    protected Boolean weatherwiseIndicator;
    @XmlElement(name = "EquipmentChangeIndicator")
    protected Boolean equipmentChangeIndicator;
    @XmlElement(name = "IROPIndicator")
    protected Boolean iropIndicator;
    @XmlElement(name = "IsCheckinPossible")
    protected Boolean isCheckinPossible;
    @XmlElement(name = "IsConnectionCheckinPossible")
    protected Boolean isConnectionCheckinPossible;
    protected Boolean isDisplayableDeiExists;

    /**
     * flightNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightNumberType }
     *     
     */
    public FlightNumberType getFlightNumber() {
        return flightNumber;
    }

    /**
     * flightNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightNumberType }
     *     
     */
    public void setFlightNumber(FlightNumberType value) {
        this.flightNumber = value;
    }

    /**
     * flightDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlightDate() {
        return flightDate;
    }

    /**
     * flightDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlightDate(XMLGregorianCalendar value) {
        this.flightDate = value;
    }

    /**
     * flightRoute 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightRoute() {
        return flightRoute;
    }

    /**
     * flightRoute 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightRoute(String value) {
        this.flightRoute = value;
    }

    /**
     * flightStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightStatus() {
        return flightStatus;
    }

    /**
     * flightStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightStatus(String value) {
        this.flightStatus = value;
    }

    /**
     * etd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETD() {
        return etd;
    }

    /**
     * etd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETD(XMLGregorianCalendar value) {
        this.etd = value;
    }

    /**
     * std 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTD() {
        return std;
    }

    /**
     * std 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTD(XMLGregorianCalendar value) {
        this.std = value;
    }

    /**
     * eta 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETA() {
        return eta;
    }

    /**
     * eta 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETA(XMLGregorianCalendar value) {
        this.eta = value;
    }

    /**
     * sta 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTA() {
        return sta;
    }

    /**
     * sta 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTA(XMLGregorianCalendar value) {
        this.sta = value;
    }

    /**
     * delayTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayTime() {
        return delayTime;
    }

    /**
     * delayTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayTime(String value) {
        this.delayTime = value;
    }

    /**
     * departureGate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureGate() {
        return departureGate;
    }

    /**
     * departureGate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureGate(String value) {
        this.departureGate = value;
    }

    /**
     * boardingTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBoardingTime() {
        return boardingTime;
    }

    /**
     * boardingTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBoardingTime(XMLGregorianCalendar value) {
        this.boardingTime = value;
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
     * boardingStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BoardingStatusType }
     *     
     */
    public BoardingStatusType getBoardingStatus() {
        return boardingStatus;
    }

    /**
     * boardingStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingStatusType }
     *     
     */
    public void setBoardingStatus(BoardingStatusType value) {
        this.boardingStatus = value;
    }

    /**
     * segment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SegmentInfo }
     *     
     */
    public SegmentInfo getSegment() {
        return segment;
    }

    /**
     * segment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentInfo }
     *     
     */
    public void setSegment(SegmentInfo value) {
        this.segment = value;
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
     * weatherwiseIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeatherwiseIndicator() {
        return weatherwiseIndicator;
    }

    /**
     * weatherwiseIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeatherwiseIndicator(Boolean value) {
        this.weatherwiseIndicator = value;
    }

    /**
     * equipmentChangeIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentChangeIndicator() {
        return equipmentChangeIndicator;
    }

    /**
     * equipmentChangeIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentChangeIndicator(Boolean value) {
        this.equipmentChangeIndicator = value;
    }

    /**
     * iropIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIROPIndicator() {
        return iropIndicator;
    }

    /**
     * iropIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIROPIndicator(Boolean value) {
        this.iropIndicator = value;
    }

    /**
     * isCheckinPossible 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCheckinPossible() {
        return isCheckinPossible;
    }

    /**
     * isCheckinPossible 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCheckinPossible(Boolean value) {
        this.isCheckinPossible = value;
    }

    /**
     * isConnectionCheckinPossible 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConnectionCheckinPossible() {
        return isConnectionCheckinPossible;
    }

    /**
     * isConnectionCheckinPossible 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConnectionCheckinPossible(Boolean value) {
        this.isConnectionCheckinPossible = value;
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
