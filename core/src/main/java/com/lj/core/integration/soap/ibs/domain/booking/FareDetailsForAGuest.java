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


/**
 * <p>FareDetailsForAGuest complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FareDetailsForAGuest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FareLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareTypeLocalLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareQuoteDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareQuoteDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="FareRuleDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestType" minOccurs="0"/&gt;
 *         &lt;element name="BaseFare" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="AppliedFare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfSeats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TaxDetailsPerGuest" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="SurChargeDetailsPerGuest" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayFareAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FareSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareSubTypeLocalLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnRestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FareTransactionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="InventoryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDetailsForAGuest", propOrder = {
    "fareLevel",
    "fareType",
    "fareTypeLocalLang",
    "fareQuoteDetails",
    "fareRuleDesc",
    "fareBasisCode",
    "fareClass",
    "guestType",
    "baseFare",
    "appliedFare",
    "numberOfSeats",
    "taxDetailsPerGuest",
    "surChargeDetailsPerGuest",
    "currency",
    "guestId",
    "displayFareAmount",
    "totalPaymentAmount",
    "fareSubType",
    "fareSubTypeLocalLang",
    "returnRestrictionInd",
    "fareTransactionID",
    "inventoryStatus"
})
public class FareDetailsForAGuest
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FareLevel")
    protected String fareLevel;
    @XmlElement(name = "FareType")
    protected String fareType;
    @XmlElement(name = "FareTypeLocalLang")
    protected String fareTypeLocalLang;
    @XmlElement(name = "FareQuoteDetails")
    protected FareQuoteDetailsType fareQuoteDetails;
    @XmlElement(name = "FareRuleDesc")
    protected String fareRuleDesc;
    @XmlElement(name = "FareBasisCode", required = true)
    protected String fareBasisCode;
    @XmlElement(name = "FareClass", required = true)
    protected String fareClass;
    @XmlElement(name = "GuestType")
    @XmlSchemaType(name = "string")
    protected GuestType guestType;
    @XmlElement(name = "BaseFare")
    protected double baseFare;
    @XmlElement(name = "AppliedFare")
    protected Double appliedFare;
    @XmlElement(name = "NumberOfSeats")
    protected int numberOfSeats;
    @XmlElement(name = "TaxDetailsPerGuest")
    protected double taxDetailsPerGuest;
    @XmlElement(name = "SurChargeDetailsPerGuest")
    protected Double surChargeDetailsPerGuest;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "GuestId")
    protected String guestId;
    @XmlElement(name = "DisplayFareAmount")
    protected double displayFareAmount;
    @XmlElement(name = "TotalPaymentAmount")
    protected Double totalPaymentAmount;
    @XmlElement(name = "FareSubType")
    protected String fareSubType;
    @XmlElement(name = "FareSubTypeLocalLang")
    protected String fareSubTypeLocalLang;
    @XmlElement(name = "ReturnRestrictionInd")
    protected Boolean returnRestrictionInd;
    @XmlElement(name = "FareTransactionID")
    protected Long fareTransactionID;
    @XmlElement(name = "InventoryStatus")
    protected String inventoryStatus;

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
     * fareType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareType() {
        return fareType;
    }

    /**
     * fareType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareType(String value) {
        this.fareType = value;
    }

    /**
     * fareTypeLocalLang 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareTypeLocalLang() {
        return fareTypeLocalLang;
    }

    /**
     * fareTypeLocalLang 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareTypeLocalLang(String value) {
        this.fareTypeLocalLang = value;
    }

    /**
     * fareQuoteDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FareQuoteDetailsType }
     *     
     */
    public FareQuoteDetailsType getFareQuoteDetails() {
        return fareQuoteDetails;
    }

    /**
     * fareQuoteDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FareQuoteDetailsType }
     *     
     */
    public void setFareQuoteDetails(FareQuoteDetailsType value) {
        this.fareQuoteDetails = value;
    }

    /**
     * fareRuleDesc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareRuleDesc() {
        return fareRuleDesc;
    }

    /**
     * fareRuleDesc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareRuleDesc(String value) {
        this.fareRuleDesc = value;
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
     * guestType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GuestType }
     *     
     */
    public GuestType getGuestType() {
        return guestType;
    }

    /**
     * guestType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestType }
     *     
     */
    public void setGuestType(GuestType value) {
        this.guestType = value;
    }

    /**
     * baseFare 속성의 값을 가져옵니다.
     * 
     */
    public double getBaseFare() {
        return baseFare;
    }

    /**
     * baseFare 속성의 값을 설정합니다.
     * 
     */
    public void setBaseFare(double value) {
        this.baseFare = value;
    }

    /**
     * appliedFare 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAppliedFare() {
        return appliedFare;
    }

    /**
     * appliedFare 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAppliedFare(Double value) {
        this.appliedFare = value;
    }

    /**
     * numberOfSeats 속성의 값을 가져옵니다.
     * 
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * numberOfSeats 속성의 값을 설정합니다.
     * 
     */
    public void setNumberOfSeats(int value) {
        this.numberOfSeats = value;
    }

    /**
     * taxDetailsPerGuest 속성의 값을 가져옵니다.
     * 
     */
    public double getTaxDetailsPerGuest() {
        return taxDetailsPerGuest;
    }

    /**
     * taxDetailsPerGuest 속성의 값을 설정합니다.
     * 
     */
    public void setTaxDetailsPerGuest(double value) {
        this.taxDetailsPerGuest = value;
    }

    /**
     * surChargeDetailsPerGuest 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSurChargeDetailsPerGuest() {
        return surChargeDetailsPerGuest;
    }

    /**
     * surChargeDetailsPerGuest 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSurChargeDetailsPerGuest(Double value) {
        this.surChargeDetailsPerGuest = value;
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
     * guestId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestId() {
        return guestId;
    }

    /**
     * guestId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestId(String value) {
        this.guestId = value;
    }

    /**
     * displayFareAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getDisplayFareAmount() {
        return displayFareAmount;
    }

    /**
     * displayFareAmount 속성의 값을 설정합니다.
     * 
     */
    public void setDisplayFareAmount(double value) {
        this.displayFareAmount = value;
    }

    /**
     * totalPaymentAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    /**
     * totalPaymentAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalPaymentAmount(Double value) {
        this.totalPaymentAmount = value;
    }

    /**
     * fareSubType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareSubType() {
        return fareSubType;
    }

    /**
     * fareSubType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareSubType(String value) {
        this.fareSubType = value;
    }

    /**
     * fareSubTypeLocalLang 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareSubTypeLocalLang() {
        return fareSubTypeLocalLang;
    }

    /**
     * fareSubTypeLocalLang 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareSubTypeLocalLang(String value) {
        this.fareSubTypeLocalLang = value;
    }

    /**
     * returnRestrictionInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnRestrictionInd() {
        return returnRestrictionInd;
    }

    /**
     * returnRestrictionInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnRestrictionInd(Boolean value) {
        this.returnRestrictionInd = value;
    }

    /**
     * fareTransactionID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFareTransactionID() {
        return fareTransactionID;
    }

    /**
     * fareTransactionID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFareTransactionID(Long value) {
        this.fareTransactionID = value;
    }

    /**
     * inventoryStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryStatus() {
        return inventoryStatus;
    }

    /**
     * inventoryStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryStatus(String value) {
        this.inventoryStatus = value;
    }

}
