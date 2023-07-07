//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.05.28 시간 08:48:08 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AvailabilitySearches" type="{http://www.ibsplc.com/iRes/simpleTypes/}AvailabilitySearchType" maxOccurs="unbounded"/>
 *         &lt;element name="AdvancedSearches" type="{http://www.ibsplc.com/iRes/simpleTypes/}AdvancedSearchType" minOccurs="0"/>
 *         &lt;element name="PaxCountDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxCountType" maxOccurs="unbounded"/>
 *         &lt;element name="TripType" type="{http://www.ibsplc.com/iRes/simpleTypes/}TripType"/>
 *         &lt;element name="FareLevels" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareClassForChangeFlight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PointOfPurchase" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BookingChannel" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingChannelKeyType"/>
 *         &lt;element name="searchCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromoCodeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PromoCodeDetails" minOccurs="0"/>
 *         &lt;element name="TravelAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorporateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsChangeFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCancelAndRebook" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FareClassForCancelAndRebook" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsTicketed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDisplayAllFare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airlineCode",
    "availabilitySearches",
    "advancedSearches",
    "paxCountDetails",
    "tripType",
    "fareLevels",
    "fareTypes",
    "fareBasisCode",
    "fareClassForChangeFlight",
    "pointOfPurchase",
    "bookingChannel",
    "searchCurrency",
    "promoCodeDetails",
    "travelAgencyCode",
    "corporateId",
    "isChangeFlight",
    "isCancelAndRebook",
    "fareClassForCancelAndRebook",
    "isTicketed",
    "isDisplayAllFare"
})
@XmlRootElement(name = "SearchAvailabilityRQ")
public class SearchAvailabilityRQ {

    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "AvailabilitySearches", required = true)
    protected List<AvailabilitySearchType> availabilitySearches;
    @XmlElement(name = "AdvancedSearches")
    protected AdvancedSearchType advancedSearches;
    @XmlElement(name = "PaxCountDetails", required = true)
    protected List<PaxCountType> paxCountDetails;
    @XmlElement(name = "TripType", required = true)
    @XmlSchemaType(name = "string")
    protected TripType tripType;
    @XmlElement(name = "FareLevels")
    protected List<String> fareLevels;
    @XmlElement(name = "FareTypes")
    protected List<String> fareTypes;
    @XmlElement(name = "FareBasisCode")
    protected String fareBasisCode;
    @XmlElement(name = "FareClassForChangeFlight")
    protected String fareClassForChangeFlight;
    @XmlElement(name = "PointOfPurchase", required = true)
    protected String pointOfPurchase;
    @XmlElement(name = "BookingChannel", required = true)
    protected BookingChannelKeyType bookingChannel;
    protected String searchCurrency;
    @XmlElement(name = "PromoCodeDetails")
    protected PromoCodeDetails promoCodeDetails;
    @XmlElement(name = "TravelAgencyCode")
    protected String travelAgencyCode;
    @XmlElement(name = "CorporateId")
    protected String corporateId;
    @XmlElement(name = "IsChangeFlight")
    protected Boolean isChangeFlight;
    @XmlElement(name = "IsCancelAndRebook")
    protected Boolean isCancelAndRebook;
    @XmlElement(name = "FareClassForCancelAndRebook")
    protected String fareClassForCancelAndRebook;
    @XmlElement(name = "IsTicketed")
    protected Boolean isTicketed;
    @XmlElement(name = "IsDisplayAllFare")
    protected Boolean isDisplayAllFare;

    /**
     * airlineCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * airlineCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the availabilitySearches property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availabilitySearches property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailabilitySearches().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailabilitySearchType }
     * 
     * 
     */
    public List<AvailabilitySearchType> getAvailabilitySearches() {
        if (availabilitySearches == null) {
            availabilitySearches = new ArrayList<AvailabilitySearchType>();
        }
        return this.availabilitySearches;
    }

    /**
     * advancedSearches 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AdvancedSearchType }
     *     
     */
    public AdvancedSearchType getAdvancedSearches() {
        return advancedSearches;
    }

    /**
     * advancedSearches 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvancedSearchType }
     *     
     */
    public void setAdvancedSearches(AdvancedSearchType value) {
        this.advancedSearches = value;
    }

    /**
     * Gets the value of the paxCountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxCountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxCountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxCountType }
     * 
     * 
     */
    public List<PaxCountType> getPaxCountDetails() {
        if (paxCountDetails == null) {
            paxCountDetails = new ArrayList<PaxCountType>();
        }
        return this.paxCountDetails;
    }

    /**
     * tripType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TripType }
     *     
     */
    public TripType getTripType() {
        return tripType;
    }

    /**
     * tripType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TripType }
     *     
     */
    public void setTripType(TripType value) {
        this.tripType = value;
    }

    /**
     * Gets the value of the fareLevels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareLevels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareLevels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFareLevels() {
        if (fareLevels == null) {
            fareLevels = new ArrayList<String>();
        }
        return this.fareLevels;
    }

    /**
     * Gets the value of the fareTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFareTypes() {
        if (fareTypes == null) {
            fareTypes = new ArrayList<String>();
        }
        return this.fareTypes;
    }

    /**
     * fareBasisCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * fareBasisCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * fareClassForChangeFlight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareClassForChangeFlight() {
        return fareClassForChangeFlight;
    }

    /**
     * fareClassForChangeFlight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareClassForChangeFlight(String value) {
        this.fareClassForChangeFlight = value;
    }

    /**
     * pointOfPurchase 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfPurchase() {
        return pointOfPurchase;
    }

    /**
     * pointOfPurchase 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfPurchase(String value) {
        this.pointOfPurchase = value;
    }

    /**
     * bookingChannel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BookingChannelKeyType }
     *     
     */
    public BookingChannelKeyType getBookingChannel() {
        return bookingChannel;
    }

    /**
     * bookingChannel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingChannelKeyType }
     *     
     */
    public void setBookingChannel(BookingChannelKeyType value) {
        this.bookingChannel = value;
    }

    /**
     * searchCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchCurrency() {
        return searchCurrency;
    }

    /**
     * searchCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchCurrency(String value) {
        this.searchCurrency = value;
    }

    /**
     * promoCodeDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PromoCodeDetails }
     *     
     */
    public PromoCodeDetails getPromoCodeDetails() {
        return promoCodeDetails;
    }

    /**
     * promoCodeDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PromoCodeDetails }
     *     
     */
    public void setPromoCodeDetails(PromoCodeDetails value) {
        this.promoCodeDetails = value;
    }

    /**
     * travelAgencyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelAgencyCode() {
        return travelAgencyCode;
    }

    /**
     * travelAgencyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelAgencyCode(String value) {
        this.travelAgencyCode = value;
    }

    /**
     * corporateId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateId() {
        return corporateId;
    }

    /**
     * corporateId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateId(String value) {
        this.corporateId = value;
    }

    /**
     * isChangeFlight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsChangeFlight() {
        return isChangeFlight;
    }

    /**
     * isChangeFlight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsChangeFlight(Boolean value) {
        this.isChangeFlight = value;
    }

    /**
     * isCancelAndRebook 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCancelAndRebook() {
        return isCancelAndRebook;
    }

    /**
     * isCancelAndRebook 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCancelAndRebook(Boolean value) {
        this.isCancelAndRebook = value;
    }

    /**
     * fareClassForCancelAndRebook 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareClassForCancelAndRebook() {
        return fareClassForCancelAndRebook;
    }

    /**
     * fareClassForCancelAndRebook 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareClassForCancelAndRebook(String value) {
        this.fareClassForCancelAndRebook = value;
    }

    /**
     * isTicketed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTicketed() {
        return isTicketed;
    }

    /**
     * isTicketed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTicketed(Boolean value) {
        this.isTicketed = value;
    }

    /**
     * isDisplayAllFare 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDisplayAllFare() {
        return isDisplayAllFare;
    }

    /**
     * isDisplayAllFare 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDisplayAllFare(Boolean value) {
        this.isDisplayAllFare = value;
    }

}
