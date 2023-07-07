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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>FareDetailsForGuestType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FareDetailsForGuestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FareLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareTypeLocalLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareRuleDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxDetails_Type" minOccurs="0"/&gt;
 *         &lt;element name="BaseFare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReturnRestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FareTransactionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FareSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareSubTypeLocalLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PricingUnitID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FareComponentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsFareRuleOverridden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RichContentRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDetailsForGuestType", propOrder = {
    "fareLevel",
    "fareType",
    "fareTypeLocalLang",
    "fareRuleDesc",
    "fareBasisCode",
    "fareClass",
    "guestType",
    "baseFare",
    "currency",
    "returnRestrictionInd",
    "fareTransactionID",
    "segmentId",
    "fareSubType",
    "fareSubTypeLocalLang",
    "pricingUnitID",
    "fareComponentId",
    "isFareRuleOverridden"
})
public class FareDetailsForGuestType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FareLevel")
    protected String fareLevel;
    @XmlElement(name = "FareType")
    protected String fareType;
    @XmlElement(name = "FareTypeLocalLang")
    protected String fareTypeLocalLang;
    @XmlElement(name = "FareRuleDesc")
    protected String fareRuleDesc;
    @XmlElement(name = "FareBasisCode", required = true)
    protected String fareBasisCode;
    @XmlElement(name = "FareClass")
    protected String fareClass;
    @XmlElement(name = "GuestType")
    @XmlSchemaType(name = "string")
    protected PaxDetailsType guestType;
    @XmlElement(name = "BaseFare")
    protected Double baseFare;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "ReturnRestrictionInd")
    protected Boolean returnRestrictionInd;
    @XmlElement(name = "FareTransactionID")
    protected Long fareTransactionID;
    @XmlElement(name = "SegmentId", type = Long.class)
    protected List<Long> segmentId;
    @XmlElement(name = "FareSubType")
    protected String fareSubType;
    @XmlElement(name = "FareSubTypeLocalLang")
    protected String fareSubTypeLocalLang;
    @XmlElement(name = "PricingUnitID")
    protected Integer pricingUnitID;
    @XmlElement(name = "FareComponentId")
    protected String fareComponentId;
    @XmlElement(name = "IsFareRuleOverridden")
    protected Boolean isFareRuleOverridden;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;

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
     *     {@link PaxDetailsType }
     *     
     */
    public PaxDetailsType getGuestType() {
        return guestType;
    }

    /**
     * guestType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxDetailsType }
     *     
     */
    public void setGuestType(PaxDetailsType value) {
        this.guestType = value;
    }

    /**
     * baseFare 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseFare() {
        return baseFare;
    }

    /**
     * baseFare 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseFare(Double value) {
        this.baseFare = value;
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
     * Gets the value of the segmentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSegmentId() {
        if (segmentId == null) {
            segmentId = new ArrayList<Long>();
        }
        return this.segmentId;
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
     * pricingUnitID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPricingUnitID() {
        return pricingUnitID;
    }

    /**
     * pricingUnitID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPricingUnitID(Integer value) {
        this.pricingUnitID = value;
    }

    /**
     * fareComponentId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareComponentId() {
        return fareComponentId;
    }

    /**
     * fareComponentId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareComponentId(String value) {
        this.fareComponentId = value;
    }

    /**
     * isFareRuleOverridden 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFareRuleOverridden() {
        return isFareRuleOverridden;
    }

    /**
     * isFareRuleOverridden 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFareRuleOverridden(Boolean value) {
        this.isFareRuleOverridden = value;
    }

    /**
     * richContentRef 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRichContentRef() {
        return richContentRef;
    }

    /**
     * richContentRef 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRichContentRef(String value) {
        this.richContentRef = value;
    }

}
