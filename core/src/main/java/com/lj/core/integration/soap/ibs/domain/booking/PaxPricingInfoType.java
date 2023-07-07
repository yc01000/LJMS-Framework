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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>PaxPricingInfoType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaxPricingInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayFare" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountInfoType" minOccurs="0"/&gt;
 *         &lt;element name="Discount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountInfoType" minOccurs="0"/&gt;
 *         &lt;element name="AppliedFare" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountInfoType" minOccurs="0"/&gt;
 *         &lt;element name="Tax" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountInfoType" minOccurs="0"/&gt;
 *         &lt;element name="Surcharge" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FareTypeLocal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FareSubType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FareSubTypeLocal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PaxType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BaggageAllowanceRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxPricingInfoType", propOrder = {
    "displayFare",
    "discount",
    "appliedFare",
    "tax",
    "surcharge"
})
public class PaxPricingInfoType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "DisplayFare")
    protected AmountInfoType displayFare;
    @XmlElement(name = "Discount")
    protected AmountInfoType discount;
    @XmlElement(name = "AppliedFare")
    protected AmountInfoType appliedFare;
    @XmlElement(name = "Tax")
    protected AmountInfoType tax;
    @XmlElement(name = "Surcharge")
    protected AmountInfoType surcharge;
    @XmlAttribute(name = "FareType")
    protected String fareType;
    @XmlAttribute(name = "FareTypeLocal")
    protected String fareTypeLocal;
    @XmlAttribute(name = "FareSubType")
    protected String fareSubType;
    @XmlAttribute(name = "FareSubTypeLocal")
    protected String fareSubTypeLocal;
    @XmlAttribute(name = "PaxType")
    protected String paxType;
    @XmlAttribute(name = "BaggageAllowanceRef")
    protected String baggageAllowanceRef;

    /**
     * displayFare 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AmountInfoType }
     *     
     */
    public AmountInfoType getDisplayFare() {
        return displayFare;
    }

    /**
     * displayFare 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountInfoType }
     *     
     */
    public void setDisplayFare(AmountInfoType value) {
        this.displayFare = value;
    }

    /**
     * discount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AmountInfoType }
     *     
     */
    public AmountInfoType getDiscount() {
        return discount;
    }

    /**
     * discount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountInfoType }
     *     
     */
    public void setDiscount(AmountInfoType value) {
        this.discount = value;
    }

    /**
     * appliedFare 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AmountInfoType }
     *     
     */
    public AmountInfoType getAppliedFare() {
        return appliedFare;
    }

    /**
     * appliedFare 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountInfoType }
     *     
     */
    public void setAppliedFare(AmountInfoType value) {
        this.appliedFare = value;
    }

    /**
     * tax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AmountInfoType }
     *     
     */
    public AmountInfoType getTax() {
        return tax;
    }

    /**
     * tax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountInfoType }
     *     
     */
    public void setTax(AmountInfoType value) {
        this.tax = value;
    }

    /**
     * surcharge 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AmountInfoType }
     *     
     */
    public AmountInfoType getSurcharge() {
        return surcharge;
    }

    /**
     * surcharge 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountInfoType }
     *     
     */
    public void setSurcharge(AmountInfoType value) {
        this.surcharge = value;
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
     * fareTypeLocal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareTypeLocal() {
        return fareTypeLocal;
    }

    /**
     * fareTypeLocal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareTypeLocal(String value) {
        this.fareTypeLocal = value;
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
     * fareSubTypeLocal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareSubTypeLocal() {
        return fareSubTypeLocal;
    }

    /**
     * fareSubTypeLocal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareSubTypeLocal(String value) {
        this.fareSubTypeLocal = value;
    }

    /**
     * paxType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxType() {
        return paxType;
    }

    /**
     * paxType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxType(String value) {
        this.paxType = value;
    }

    /**
     * baggageAllowanceRef 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageAllowanceRef() {
        return baggageAllowanceRef;
    }

    /**
     * baggageAllowanceRef 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageAllowanceRef(String value) {
        this.baggageAllowanceRef = value;
    }

}
