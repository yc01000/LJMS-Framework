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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SegmentFeeDetailsInputType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SegmentFeeDetailsInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TravelDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ToCabinClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TierLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperatingCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AirlineCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SegmentSequenceID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SegmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scheduledDepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scheduledArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSRCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubSsrCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentFeeDetailsInputType", propOrder = {
    "origin",
    "destination",
    "travelDate",
    "toCabinClass",
    "cabinClass",
    "fareClass",
    "fareLevel",
    "tierLevel",
    "operatingCarrierCode",
    "airlineCompany",
    "segmentSequenceID",
    "segmentId",
    "segmentStatus",
    "scheduledDepartureDateTime",
    "departureTimeZone",
    "scheduledArrivalTime",
    "arrivalTimeZone",
    "ssrCode",
    "subSsrCategory"
})
public class SegmentFeeDetailsInputType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Origin", required = true)
    protected String origin;
    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlElement(name = "TravelDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar travelDate;
    @XmlElement(name = "ToCabinClass")
    protected String toCabinClass;
    @XmlElement(name = "CabinClass")
    protected String cabinClass;
    @XmlElement(name = "FareClass")
    protected String fareClass;
    @XmlElement(name = "FareLevel")
    protected String fareLevel;
    @XmlElement(name = "TierLevel")
    protected String tierLevel;
    @XmlElement(name = "OperatingCarrierCode")
    protected String operatingCarrierCode;
    @XmlElement(name = "AirlineCompany")
    protected String airlineCompany;
    @XmlElement(name = "SegmentSequenceID")
    protected long segmentSequenceID;
    @XmlElement(name = "SegmentId")
    protected long segmentId;
    @XmlElement(name = "SegmentStatus")
    protected String segmentStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDepartureDateTime;
    @XmlElement(name = "DepartureTimeZone")
    protected String departureTimeZone;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledArrivalTime;
    @XmlElement(name = "ArrivalTimeZone")
    protected String arrivalTimeZone;
    @XmlElement(name = "SSRCode")
    protected List<String> ssrCode;
    @XmlElement(name = "SubSsrCategory")
    protected String subSsrCategory;

    /**
     * origin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * origin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * destination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * destination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * travelDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelDate() {
        return travelDate;
    }

    /**
     * travelDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelDate(XMLGregorianCalendar value) {
        this.travelDate = value;
    }

    /**
     * toCabinClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCabinClass() {
        return toCabinClass;
    }

    /**
     * toCabinClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCabinClass(String value) {
        this.toCabinClass = value;
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
     * fareClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareClass() {
        return fareClass;
    }

    /**
     * fareClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareClass(String value) {
        this.fareClass = value;
    }

    /**
     * fareLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareLevel() {
        return fareLevel;
    }

    /**
     * fareLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareLevel(String value) {
        this.fareLevel = value;
    }

    /**
     * tierLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierLevel() {
        return tierLevel;
    }

    /**
     * tierLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierLevel(String value) {
        this.tierLevel = value;
    }

    /**
     * operatingCarrierCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCarrierCode() {
        return operatingCarrierCode;
    }

    /**
     * operatingCarrierCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCarrierCode(String value) {
        this.operatingCarrierCode = value;
    }

    /**
     * airlineCompany 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCompany() {
        return airlineCompany;
    }

    /**
     * airlineCompany 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCompany(String value) {
        this.airlineCompany = value;
    }

    /**
     * segmentSequenceID 속성의 값을 가져옵니다.
     * 
     */
    public long getSegmentSequenceID() {
        return segmentSequenceID;
    }

    /**
     * segmentSequenceID 속성의 값을 설정합니다.
     * 
     */
    public void setSegmentSequenceID(long value) {
        this.segmentSequenceID = value;
    }

    /**
     * segmentId 속성의 값을 가져옵니다.
     * 
     */
    public long getSegmentId() {
        return segmentId;
    }

    /**
     * segmentId 속성의 값을 설정합니다.
     * 
     */
    public void setSegmentId(long value) {
        this.segmentId = value;
    }

    /**
     * segmentStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentStatus() {
        return segmentStatus;
    }

    /**
     * segmentStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentStatus(String value) {
        this.segmentStatus = value;
    }

    /**
     * scheduledDepartureDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDepartureDateTime() {
        return scheduledDepartureDateTime;
    }

    /**
     * scheduledDepartureDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDepartureDateTime(XMLGregorianCalendar value) {
        this.scheduledDepartureDateTime = value;
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
     * scheduledArrivalTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledArrivalTime() {
        return scheduledArrivalTime;
    }

    /**
     * scheduledArrivalTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledArrivalTime(XMLGregorianCalendar value) {
        this.scheduledArrivalTime = value;
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
     * Gets the value of the ssrCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSSRCode() {
        if (ssrCode == null) {
            ssrCode = new ArrayList<String>();
        }
        return this.ssrCode;
    }

    /**
     * subSsrCategory 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSsrCategory() {
        return subSsrCategory;
    }

    /**
     * subSsrCategory 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSsrCategory(String value) {
        this.subSsrCategory = value;
    }

}
