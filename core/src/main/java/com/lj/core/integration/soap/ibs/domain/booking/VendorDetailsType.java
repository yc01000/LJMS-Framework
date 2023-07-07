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
 * <p>VendorDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="VendorDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VendorEmailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CanSendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AirportCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsFeeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CarGroupDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CarGroupDetailsType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TravelInsuranceDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelInsuranceDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CountryCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaxTripLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaxSaleTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorDetailsType", propOrder = {
    "vendorCode",
    "vendorName",
    "vendorEmailID",
    "canSendEmail",
    "airportCodes",
    "startTime",
    "endTime",
    "isFeeRequired",
    "carGroupDetails",
    "travelInsuranceDetails",
    "countryCodes",
    "maxTripLength",
    "maxSaleTime"
})
public class VendorDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "VendorCode", required = true)
    protected String vendorCode;
    @XmlElement(name = "VendorName")
    protected String vendorName;
    @XmlElement(name = "VendorEmailID")
    protected String vendorEmailID;
    @XmlElement(name = "CanSendEmail")
    protected Boolean canSendEmail;
    @XmlElement(name = "AirportCodes")
    protected List<String> airportCodes;
    @XmlElement(name = "StartTime")
    protected String startTime;
    @XmlElement(name = "EndTime")
    protected String endTime;
    @XmlElement(name = "IsFeeRequired")
    protected Boolean isFeeRequired;
    @XmlElement(name = "CarGroupDetails", required = true)
    protected List<CarGroupDetailsType> carGroupDetails;
    @XmlElement(name = "TravelInsuranceDetails")
    protected List<TravelInsuranceDetailsType> travelInsuranceDetails;
    @XmlElement(name = "CountryCodes")
    protected List<String> countryCodes;
    @XmlElement(name = "MaxTripLength")
    protected String maxTripLength;
    @XmlElement(name = "MaxSaleTime")
    protected String maxSaleTime;

    /**
     * vendorCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * vendorCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * vendorName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * vendorName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * vendorEmailID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorEmailID() {
        return vendorEmailID;
    }

    /**
     * vendorEmailID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorEmailID(String value) {
        this.vendorEmailID = value;
    }

    /**
     * canSendEmail 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanSendEmail() {
        return canSendEmail;
    }

    /**
     * canSendEmail 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanSendEmail(Boolean value) {
        this.canSendEmail = value;
    }

    /**
     * Gets the value of the airportCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airportCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirportCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAirportCodes() {
        if (airportCodes == null) {
            airportCodes = new ArrayList<String>();
        }
        return this.airportCodes;
    }

    /**
     * startTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * startTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * endTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * endTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * isFeeRequired 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFeeRequired() {
        return isFeeRequired;
    }

    /**
     * isFeeRequired 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFeeRequired(Boolean value) {
        this.isFeeRequired = value;
    }

    /**
     * Gets the value of the carGroupDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carGroupDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarGroupDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarGroupDetailsType }
     * 
     * 
     */
    public List<CarGroupDetailsType> getCarGroupDetails() {
        if (carGroupDetails == null) {
            carGroupDetails = new ArrayList<CarGroupDetailsType>();
        }
        return this.carGroupDetails;
    }

    /**
     * Gets the value of the travelInsuranceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelInsuranceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelInsuranceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelInsuranceDetailsType }
     * 
     * 
     */
    public List<TravelInsuranceDetailsType> getTravelInsuranceDetails() {
        if (travelInsuranceDetails == null) {
            travelInsuranceDetails = new ArrayList<TravelInsuranceDetailsType>();
        }
        return this.travelInsuranceDetails;
    }

    /**
     * Gets the value of the countryCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountryCodes() {
        if (countryCodes == null) {
            countryCodes = new ArrayList<String>();
        }
        return this.countryCodes;
    }

    /**
     * maxTripLength 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxTripLength() {
        return maxTripLength;
    }

    /**
     * maxTripLength 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxTripLength(String value) {
        this.maxTripLength = value;
    }

    /**
     * maxSaleTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxSaleTime() {
        return maxSaleTime;
    }

    /**
     * maxSaleTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxSaleTime(String value) {
        this.maxSaleTime = value;
    }

}
