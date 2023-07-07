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
 * <p>SegmentFeeDetailType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SegmentFeeDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookingSegmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperatingCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TierLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToCabinClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TravelDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FeeAmountDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeAmountDetails" minOccurs="0"/&gt;
 *         &lt;element name="SSRCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentFeeDetailType", propOrder = {
    "airlineCompanyCode",
    "origin",
    "destination",
    "bookingSegmentId",
    "cabinClass",
    "fareClass",
    "fareLevel",
    "operatingCarrierCode",
    "tierLevel",
    "toCabinClass",
    "travelDate",
    "feeAmountDetails",
    "ssrCode"
})
public class SegmentFeeDetailType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCompanyCode")
    protected String airlineCompanyCode;
    protected String origin;
    @XmlElement(name = "Destination")
    protected String destination;
    @XmlElement(name = "BookingSegmentId")
    protected Long bookingSegmentId;
    @XmlElement(name = "CabinClass")
    protected String cabinClass;
    @XmlElement(name = "FareClass")
    protected String fareClass;
    @XmlElement(name = "FareLevel")
    protected String fareLevel;
    @XmlElement(name = "OperatingCarrierCode")
    protected String operatingCarrierCode;
    @XmlElement(name = "TierLevel")
    protected String tierLevel;
    @XmlElement(name = "ToCabinClass")
    protected String toCabinClass;
    @XmlElement(name = "TravelDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar travelDate;
    @XmlElement(name = "FeeAmountDetails")
    protected FeeAmountDetails feeAmountDetails;
    @XmlElement(name = "SSRCode")
    protected List<String> ssrCode;

    /**
     * airlineCompanyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCompanyCode() {
        return airlineCompanyCode;
    }

    /**
     * airlineCompanyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCompanyCode(String value) {
        this.airlineCompanyCode = value;
    }

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
     * bookingSegmentId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBookingSegmentId() {
        return bookingSegmentId;
    }

    /**
     * bookingSegmentId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBookingSegmentId(Long value) {
        this.bookingSegmentId = value;
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
     * feeAmountDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FeeAmountDetails }
     *     
     */
    public FeeAmountDetails getFeeAmountDetails() {
        return feeAmountDetails;
    }

    /**
     * feeAmountDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAmountDetails }
     *     
     */
    public void setFeeAmountDetails(FeeAmountDetails value) {
        this.feeAmountDetails = value;
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

}
