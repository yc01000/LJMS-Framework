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
 * <p>RevDocCouponDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="RevDocCouponDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FltNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlightDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/&gt;
 *         &lt;element name="BoardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OffPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DepartureCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ArrivalCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ScheduledDepartureDateTimeUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ScheduledDepartureTimeLTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DepartureTimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ScheduledArrivalTimeUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ScheduledArrivalTimeLTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ArrivalTimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="JourneyTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StopOver" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CouponStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BaggageAllowance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotValidBefore" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/&gt;
 *         &lt;element name="NotValidAfter" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevDocCouponDetailsType", propOrder = {
    "couponNumber",
    "carrierCode",
    "fltNumber",
    "flightDate",
    "boardPoint",
    "offPoint",
    "departureCity",
    "arrivalCity",
    "scheduledDepartureDateTimeUTC",
    "scheduledDepartureTimeLTC",
    "departureTimeZone",
    "scheduledArrivalTimeUTC",
    "scheduledArrivalTimeLTC",
    "arrivalTimeZone",
    "journeyTime",
    "stopOver",
    "cabinClass",
    "rbd",
    "fareBasis",
    "couponStatus",
    "baggageAllowance",
    "notValidBefore",
    "notValidAfter"
})
public class RevDocCouponDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "CouponNumber")
    protected int couponNumber;
    @XmlElement(name = "CarrierCode", required = true)
    protected String carrierCode;
    @XmlElement(name = "FltNumber", required = true)
    protected String fltNumber;
    @XmlElement(name = "FlightDate", required = true)
    protected DateOnlyType flightDate;
    @XmlElement(name = "BoardPoint", required = true)
    protected String boardPoint;
    @XmlElement(name = "OffPoint", required = true)
    protected String offPoint;
    @XmlElement(name = "DepartureCity", required = true)
    protected String departureCity;
    @XmlElement(name = "ArrivalCity", required = true)
    protected String arrivalCity;
    @XmlElement(name = "ScheduledDepartureDateTimeUTC", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDepartureDateTimeUTC;
    @XmlElement(name = "ScheduledDepartureTimeLTC", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDepartureTimeLTC;
    @XmlElement(name = "DepartureTimeZone", required = true)
    protected String departureTimeZone;
    @XmlElement(name = "ScheduledArrivalTimeUTC", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledArrivalTimeUTC;
    @XmlElement(name = "ScheduledArrivalTimeLTC", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledArrivalTimeLTC;
    @XmlElement(name = "ArrivalTimeZone", required = true)
    protected String arrivalTimeZone;
    @XmlElement(name = "JourneyTime", required = true)
    protected String journeyTime;
    @XmlElement(name = "StopOver", required = true)
    protected String stopOver;
    @XmlElement(name = "CabinClass")
    protected String cabinClass;
    @XmlElement(name = "RBD")
    protected String rbd;
    @XmlElement(name = "FareBasis")
    protected String fareBasis;
    @XmlElement(name = "CouponStatus", required = true)
    protected String couponStatus;
    @XmlElement(name = "BaggageAllowance")
    protected String baggageAllowance;
    @XmlElement(name = "NotValidBefore", required = true)
    protected DateOnlyType notValidBefore;
    @XmlElement(name = "NotValidAfter", required = true)
    protected DateOnlyType notValidAfter;

    /**
     * couponNumber 속성의 값을 가져옵니다.
     * 
     */
    public int getCouponNumber() {
        return couponNumber;
    }

    /**
     * couponNumber 속성의 값을 설정합니다.
     * 
     */
    public void setCouponNumber(int value) {
        this.couponNumber = value;
    }

    /**
     * carrierCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * carrierCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * fltNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltNumber() {
        return fltNumber;
    }

    /**
     * fltNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltNumber(String value) {
        this.fltNumber = value;
    }

    /**
     * flightDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getFlightDate() {
        return flightDate;
    }

    /**
     * flightDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setFlightDate(DateOnlyType value) {
        this.flightDate = value;
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
     * arrivalCity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalCity() {
        return arrivalCity;
    }

    /**
     * arrivalCity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalCity(String value) {
        this.arrivalCity = value;
    }

    /**
     * scheduledDepartureDateTimeUTC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDepartureDateTimeUTC() {
        return scheduledDepartureDateTimeUTC;
    }

    /**
     * scheduledDepartureDateTimeUTC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDepartureDateTimeUTC(XMLGregorianCalendar value) {
        this.scheduledDepartureDateTimeUTC = value;
    }

    /**
     * scheduledDepartureTimeLTC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDepartureTimeLTC() {
        return scheduledDepartureTimeLTC;
    }

    /**
     * scheduledDepartureTimeLTC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDepartureTimeLTC(XMLGregorianCalendar value) {
        this.scheduledDepartureTimeLTC = value;
    }

    /**
     * departureTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTimeZone() {
        return departureTimeZone;
    }

    /**
     * departureTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTimeZone(String value) {
        this.departureTimeZone = value;
    }

    /**
     * scheduledArrivalTimeUTC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledArrivalTimeUTC() {
        return scheduledArrivalTimeUTC;
    }

    /**
     * scheduledArrivalTimeUTC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledArrivalTimeUTC(XMLGregorianCalendar value) {
        this.scheduledArrivalTimeUTC = value;
    }

    /**
     * scheduledArrivalTimeLTC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledArrivalTimeLTC() {
        return scheduledArrivalTimeLTC;
    }

    /**
     * scheduledArrivalTimeLTC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledArrivalTimeLTC(XMLGregorianCalendar value) {
        this.scheduledArrivalTimeLTC = value;
    }

    /**
     * arrivalTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTimeZone() {
        return arrivalTimeZone;
    }

    /**
     * arrivalTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTimeZone(String value) {
        this.arrivalTimeZone = value;
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
     * stopOver 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopOver() {
        return stopOver;
    }

    /**
     * stopOver 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopOver(String value) {
        this.stopOver = value;
    }

    /**
     * cabinClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * cabinClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

    /**
     * rbd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBD() {
        return rbd;
    }

    /**
     * rbd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBD(String value) {
        this.rbd = value;
    }

    /**
     * fareBasis 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * fareBasis 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

    /**
     * couponStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponStatus() {
        return couponStatus;
    }

    /**
     * couponStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponStatus(String value) {
        this.couponStatus = value;
    }

    /**
     * baggageAllowance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageAllowance() {
        return baggageAllowance;
    }

    /**
     * baggageAllowance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageAllowance(String value) {
        this.baggageAllowance = value;
    }

    /**
     * notValidBefore 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getNotValidBefore() {
        return notValidBefore;
    }

    /**
     * notValidBefore 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setNotValidBefore(DateOnlyType value) {
        this.notValidBefore = value;
    }

    /**
     * notValidAfter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getNotValidAfter() {
        return notValidAfter;
    }

    /**
     * notValidAfter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setNotValidAfter(DateOnlyType value) {
        this.notValidAfter = value;
    }

}
