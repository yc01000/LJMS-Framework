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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>FeeTax complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FeeTax"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="feeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="feeAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="hasWaiveAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasOverrideAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasWaived" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasOverridden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="precision" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeTax", propOrder = {
    "feeCode",
    "feeAmount",
    "currency",
    "tax",
    "hasWaiveAccess",
    "hasOverrideAccess",
    "hasWaived",
    "hasOverridden",
    "isDefault",
    "precision"
})
public class FeeTax
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected String feeCode;
    protected double feeAmount;
    @XmlElement(required = true)
    protected String currency;
    protected double tax;
    protected boolean hasWaiveAccess;
    protected boolean hasOverrideAccess;
    protected boolean hasWaived;
    protected boolean hasOverridden;
    protected boolean isDefault;
    protected boolean precision;

    /**
     * feeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCode() {
        return feeCode;
    }

    /**
     * feeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCode(String value) {
        this.feeCode = value;
    }

    /**
     * feeAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getFeeAmount() {
        return feeAmount;
    }

    /**
     * feeAmount 속성의 값을 설정합니다.
     * 
     */
    public void setFeeAmount(double value) {
        this.feeAmount = value;
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
     * tax 속성의 값을 가져옵니다.
     * 
     */
    public double getTax() {
        return tax;
    }

    /**
     * tax 속성의 값을 설정합니다.
     * 
     */
    public void setTax(double value) {
        this.tax = value;
    }

    /**
     * hasWaiveAccess 속성의 값을 가져옵니다.
     * 
     */
    public boolean isHasWaiveAccess() {
        return hasWaiveAccess;
    }

    /**
     * hasWaiveAccess 속성의 값을 설정합니다.
     * 
     */
    public void setHasWaiveAccess(boolean value) {
        this.hasWaiveAccess = value;
    }

    /**
     * hasOverrideAccess 속성의 값을 가져옵니다.
     * 
     */
    public boolean isHasOverrideAccess() {
        return hasOverrideAccess;
    }

    /**
     * hasOverrideAccess 속성의 값을 설정합니다.
     * 
     */
    public void setHasOverrideAccess(boolean value) {
        this.hasOverrideAccess = value;
    }

    /**
     * hasWaived 속성의 값을 가져옵니다.
     * 
     */
    public boolean isHasWaived() {
        return hasWaived;
    }

    /**
     * hasWaived 속성의 값을 설정합니다.
     * 
     */
    public void setHasWaived(boolean value) {
        this.hasWaived = value;
    }

    /**
     * hasOverridden 속성의 값을 가져옵니다.
     * 
     */
    public boolean isHasOverridden() {
        return hasOverridden;
    }

    /**
     * hasOverridden 속성의 값을 설정합니다.
     * 
     */
    public void setHasOverridden(boolean value) {
        this.hasOverridden = value;
    }

    /**
     * isDefault 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsDefault() {
        return isDefault;
    }

    /**
     * isDefault 속성의 값을 설정합니다.
     * 
     */
    public void setIsDefault(boolean value) {
        this.isDefault = value;
    }

    /**
     * precision 속성의 값을 가져옵니다.
     * 
     */
    public boolean isPrecision() {
        return precision;
    }

    /**
     * precision 속성의 값을 설정합니다.
     * 
     */
    public void setPrecision(boolean value) {
        this.precision = value;
    }

}
