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
 *         &lt;element name="OAndDDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}OandDDetails" maxOccurs="unbounded"/>
 *         &lt;element name="GroupPaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GroupPaxDetails" minOccurs="0"/>
 *         &lt;element name="PnrGuestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrGuestDetailsType" maxOccurs="unbounded"/>
 *         &lt;element name="BookingChannel" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingChannelKeyType"/>
 *         &lt;element name="BookerDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookerDetails" minOccurs="0"/>
 *         &lt;element name="PnrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PointOfPurchase" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumberOfSeats" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaxCountType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxCountType" maxOccurs="unbounded"/>
 *         &lt;element name="LoyaltyDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}LoyaltyDetails" minOccurs="0"/>
 *         &lt;element name="PromoCodeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PromoCodeDetails" minOccurs="0"/>
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalAgentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentAgentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportingOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorporateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PnrAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsManualPriceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerPnrSSRDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SSRDetailsType" maxOccurs="unbounded" minOccurs="0"/>
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
    "oAndDDetails",
    "groupPaxDetails",
    "pnrGuestDetails",
    "bookingChannel",
    "bookerDetails",
    "pnrType",
    "pointOfPurchase",
    "numberOfSeats",
    "paxCountType",
    "loyaltyDetails",
    "promoCodeDetails",
    "agencyCode",
    "originalAgentID",
    "currentAgentID",
    "reportingOffice",
    "corporateId",
    "auxDetails",
    "pnrAction",
    "isManualPriceRequired",
    "currency",
    "perPnrSSRDetails"
})
@XmlRootElement(name = "RetrieveFareQuoteEnhancementRQ")
public class RetrieveFareQuoteEnhancementRQ {

    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "OAndDDetails", required = true)
    protected List<OandDDetails> oAndDDetails;
    @XmlElement(name = "GroupPaxDetails")
    protected GroupPaxDetails groupPaxDetails;
    @XmlElement(name = "PnrGuestDetails", required = true)
    protected List<PnrGuestDetailsType> pnrGuestDetails;
    @XmlElement(name = "BookingChannel", required = true)
    protected BookingChannelKeyType bookingChannel;
    @XmlElement(name = "BookerDetails")
    protected BookerDetails bookerDetails;
    @XmlElement(name = "PnrType")
    protected String pnrType;
    @XmlElement(name = "PointOfPurchase", required = true)
    protected String pointOfPurchase;
    @XmlElement(name = "NumberOfSeats")
    protected Integer numberOfSeats;
    @XmlElement(name = "PaxCountType", required = true)
    protected List<PaxCountType> paxCountType;
    @XmlElement(name = "LoyaltyDetails")
    protected LoyaltyDetails loyaltyDetails;
    @XmlElement(name = "PromoCodeDetails")
    protected PromoCodeDetails promoCodeDetails;
    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "OriginalAgentID")
    protected String originalAgentID;
    @XmlElement(name = "CurrentAgentID")
    protected String currentAgentID;
    @XmlElement(name = "ReportingOffice")
    protected String reportingOffice;
    @XmlElement(name = "CorporateId")
    protected String corporateId;
    @XmlElement(name = "AuxDetails")
    protected List<AuxDetailsType> auxDetails;
    @XmlElement(name = "PnrAction")
    protected String pnrAction;
    @XmlElement(name = "IsManualPriceRequired")
    protected Boolean isManualPriceRequired;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "PerPnrSSRDetails")
    protected List<SSRDetailsType> perPnrSSRDetails;

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
     * Gets the value of the oAndDDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oAndDDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOAndDDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OandDDetails }
     * 
     * 
     */
    public List<OandDDetails> getOAndDDetails() {
        if (oAndDDetails == null) {
            oAndDDetails = new ArrayList<OandDDetails>();
        }
        return this.oAndDDetails;
    }

    /**
     * groupPaxDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GroupPaxDetails }
     *     
     */
    public GroupPaxDetails getGroupPaxDetails() {
        return groupPaxDetails;
    }

    /**
     * groupPaxDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupPaxDetails }
     *     
     */
    public void setGroupPaxDetails(GroupPaxDetails value) {
        this.groupPaxDetails = value;
    }

    /**
     * Gets the value of the pnrGuestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrGuestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrGuestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrGuestDetailsType }
     * 
     * 
     */
    public List<PnrGuestDetailsType> getPnrGuestDetails() {
        if (pnrGuestDetails == null) {
            pnrGuestDetails = new ArrayList<PnrGuestDetailsType>();
        }
        return this.pnrGuestDetails;
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
     * bookerDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BookerDetails }
     *     
     */
    public BookerDetails getBookerDetails() {
        return bookerDetails;
    }

    /**
     * bookerDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BookerDetails }
     *     
     */
    public void setBookerDetails(BookerDetails value) {
        this.bookerDetails = value;
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
     * numberOfSeats 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * numberOfSeats 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfSeats(Integer value) {
        this.numberOfSeats = value;
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
     * loyaltyDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyDetails }
     *     
     */
    public LoyaltyDetails getLoyaltyDetails() {
        return loyaltyDetails;
    }

    /**
     * loyaltyDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyDetails }
     *     
     */
    public void setLoyaltyDetails(LoyaltyDetails value) {
        this.loyaltyDetails = value;
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
     * reportingOffice 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingOffice() {
        return reportingOffice;
    }

    /**
     * reportingOffice 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingOffice(String value) {
        this.reportingOffice = value;
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
     * Gets the value of the auxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuxDetailsType }
     * 
     * 
     */
    public List<AuxDetailsType> getAuxDetails() {
        if (auxDetails == null) {
            auxDetails = new ArrayList<AuxDetailsType>();
        }
        return this.auxDetails;
    }

    /**
     * pnrAction 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrAction() {
        return pnrAction;
    }

    /**
     * pnrAction 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrAction(String value) {
        this.pnrAction = value;
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
     * Gets the value of the perPnrSSRDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the perPnrSSRDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerPnrSSRDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSRDetailsType }
     * 
     * 
     */
    public List<SSRDetailsType> getPerPnrSSRDetails() {
        if (perPnrSSRDetails == null) {
            perPnrSSRDetails = new ArrayList<SSRDetailsType>();
        }
        return this.perPnrSSRDetails;
    }

}
