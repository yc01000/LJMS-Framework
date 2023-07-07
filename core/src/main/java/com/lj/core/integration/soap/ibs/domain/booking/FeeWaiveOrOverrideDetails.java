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
 * <p>FeeWaiveOrOverrideDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FeeWaiveOrOverrideDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsWaiveOrOverride" type="{http://www.ibsplc.com/iRes/simpleTypes/}WaiveOrOverride"/&gt;
 *         &lt;element name="PercentOfOverride" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="AbsoluteValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OverrideReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeWaiveOrOverrideDetails", propOrder = {
    "feeName",
    "feeCode",
    "isWaiveOrOverride",
    "percentOfOverride",
    "absoluteValue",
    "currency",
    "overrideReason"
})
public class FeeWaiveOrOverrideDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FeeName")
    protected String feeName;
    @XmlElement(name = "FeeCode")
    protected String feeCode;
    @XmlElement(name = "IsWaiveOrOverride", required = true)
    @XmlSchemaType(name = "string")
    protected WaiveOrOverride isWaiveOrOverride;
    @XmlElement(name = "PercentOfOverride")
    protected Double percentOfOverride;
    @XmlElement(name = "AbsoluteValue")
    protected Double absoluteValue;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "OverrideReason")
    protected String overrideReason;

    /**
     * feeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeName() {
        return feeName;
    }

    /**
     * feeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeName(String value) {
        this.feeName = value;
    }

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
     * isWaiveOrOverride 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link WaiveOrOverride }
     *     
     */
    public WaiveOrOverride getIsWaiveOrOverride() {
        return isWaiveOrOverride;
    }

    /**
     * isWaiveOrOverride 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link WaiveOrOverride }
     *     
     */
    public void setIsWaiveOrOverride(WaiveOrOverride value) {
        this.isWaiveOrOverride = value;
    }

    /**
     * percentOfOverride 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentOfOverride() {
        return percentOfOverride;
    }

    /**
     * percentOfOverride 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentOfOverride(Double value) {
        this.percentOfOverride = value;
    }

    /**
     * absoluteValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAbsoluteValue() {
        return absoluteValue;
    }

    /**
     * absoluteValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAbsoluteValue(Double value) {
        this.absoluteValue = value;
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
     * overrideReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideReason() {
        return overrideReason;
    }

    /**
     * overrideReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideReason(String value) {
        this.overrideReason = value;
    }

}
