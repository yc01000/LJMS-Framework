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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ibsplc.com/iRes/simpleTypes/}BaseBookingRQ"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvailabilitySearches" type="{http://www.ibsplc.com/iRes/simpleTypes/}NearBySearchType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="AdvancedSearches" type="{http://www.ibsplc.com/iRes/simpleTypes/}AdvancedSearchType" minOccurs="0"/&gt;
 *         &lt;element name="PaxCountDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxCountType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TripType" type="{http://www.ibsplc.com/iRes/simpleTypes/}TripType"/&gt;
 *         &lt;element name="FareLevels" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FareTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PointOfPurchase" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PromoCodeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PromoCodeDetails" minOccurs="0"/&gt;
 *         &lt;element name="TravelAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorporateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsDisplayAllFare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "availabilitySearches",
    "advancedSearches",
    "paxCountDetails",
    "tripType",
    "fareLevels",
    "fareTypes",
    "pointOfPurchase",
    "promoCodeDetails",
    "travelAgencyCode",
    "corporateId",
    "isDisplayAllFare"
})
@XmlRootElement(name = "AirAvailabilityRQ")
public class AirAvailabilityRQ
    extends BaseBookingRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AvailabilitySearches", required = true)
    protected List<NearBySearchType> availabilitySearches;
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
    @XmlElement(name = "PointOfPurchase", required = true)
    protected String pointOfPurchase;
    @XmlElement(name = "PromoCodeDetails")
    protected PromoCodeDetails promoCodeDetails;
    @XmlElement(name = "TravelAgencyCode")
    protected String travelAgencyCode;
    @XmlElement(name = "CorporateId")
    protected String corporateId;
    @XmlElement(name = "IsDisplayAllFare")
    protected Boolean isDisplayAllFare;

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
     * {@link NearBySearchType }
     * 
     * 
     */
    public List<NearBySearchType> getAvailabilitySearches() {
        if (availabilitySearches == null) {
            availabilitySearches = new ArrayList<NearBySearchType>();
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
