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
 *         &lt;element name="PointOfPurchase" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumberOfGuests" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OandDDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}OandDDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BookingChannel" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingChannelKeyType"/>
 *         &lt;element name="PromoCodeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PromoCodeDetails" minOccurs="0"/>
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalAgentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentAgentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorporateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxCountType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxCountType" maxOccurs="unbounded"/>
 *         &lt;element name="IsManualPriceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PnrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pointOfPurchase",
    "numberOfGuests",
    "oandDDetails",
    "bookingChannel",
    "promoCodeDetails",
    "agencyCode",
    "originalAgentID",
    "currentAgentID",
    "corporateId",
    "paxCountType",
    "isManualPriceRequired",
    "currency",
    "pnrType"
})
@XmlRootElement(name = "FareQuoteRQ")
public class FareQuoteRQ {

    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "PointOfPurchase", required = true)
    protected String pointOfPurchase;
    @XmlElement(name = "NumberOfGuests")
    protected int numberOfGuests;
    @XmlElement(name = "OandDDetails")
    protected List<OandDDetails> oandDDetails;
    @XmlElement(name = "BookingChannel", required = true)
    protected BookingChannelKeyType bookingChannel;
    @XmlElement(name = "PromoCodeDetails")
    protected PromoCodeDetails promoCodeDetails;
    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "OriginalAgentID")
    protected String originalAgentID;
    @XmlElement(name = "CurrentAgentID")
    protected String currentAgentID;
    @XmlElement(name = "CorporateId")
    protected String corporateId;
    @XmlElement(name = "PaxCountType", required = true)
    protected List<PaxCountType> paxCountType;
    @XmlElement(name = "IsManualPriceRequired")
    protected Boolean isManualPriceRequired;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "PnrType")
    protected String pnrType;

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
     * numberOfGuests 속성의 값을 가져옵니다.
     * 
     */
    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    /**
     * numberOfGuests 속성의 값을 설정합니다.
     * 
     */
    public void setNumberOfGuests(int value) {
        this.numberOfGuests = value;
    }

    /**
     * Gets the value of the oandDDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oandDDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOandDDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OandDDetails }
     * 
     * 
     */
    public List<OandDDetails> getOandDDetails() {
        if (oandDDetails == null) {
            oandDDetails = new ArrayList<OandDDetails>();
        }
        return this.oandDDetails;
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
     * agencyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * agencyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * originalAgentID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalAgentID() {
        return originalAgentID;
    }

    /**
     * originalAgentID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalAgentID(String value) {
        this.originalAgentID = value;
    }

    /**
     * currentAgentID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentAgentID() {
        return currentAgentID;
    }

    /**
     * currentAgentID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentAgentID(String value) {
        this.currentAgentID = value;
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
     * Gets the value of the paxCountType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxCountType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxCountType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxCountType }
     * 
     * 
     */
    public List<PaxCountType> getPaxCountType() {
        if (paxCountType == null) {
            paxCountType = new ArrayList<PaxCountType>();
        }
        return this.paxCountType;
    }

    /**
     * isManualPriceRequired 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsManualPriceRequired() {
        return isManualPriceRequired;
    }

    /**
     * isManualPriceRequired 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsManualPriceRequired(Boolean value) {
        this.isManualPriceRequired = value;
    }

    /**
     * currency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * currency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * pnrType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrType() {
        return pnrType;
    }

    /**
     * pnrType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrType(String value) {
        this.pnrType = value;
    }

}
