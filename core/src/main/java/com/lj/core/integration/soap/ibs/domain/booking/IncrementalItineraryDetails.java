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
 * <p>IncrementalItineraryDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="IncrementalItineraryDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateOfModification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FareAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FareCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GSTAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="GSTCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FeeAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FeeCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncrementalItineraryDetails", propOrder = {
    "dateOfModification",
    "fareAmount",
    "fareCurrency",
    "gstAmount",
    "gstCurrency",
    "feeAmount",
    "feeCurrency"
})
public class IncrementalItineraryDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "DateOfModification", required = true)
    protected String dateOfModification;
    @XmlElement(name = "FareAmount")
    protected double fareAmount;
    @XmlElement(name = "FareCurrency", required = true)
    protected String fareCurrency;
    @XmlElement(name = "GSTAmount")
    protected double gstAmount;
    @XmlElement(name = "GSTCurrency", required = true)
    protected String gstCurrency;
    @XmlElement(name = "FeeAmount")
    protected double feeAmount;
    @XmlElement(name = "FeeCurrency", required = true)
    protected String feeCurrency;

    /**
     * dateOfModification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfModification() {
        return dateOfModification;
    }

    /**
     * dateOfModification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfModification(String value) {
        this.dateOfModification = value;
    }

    /**
     * fareAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getFareAmount() {
        return fareAmount;
    }

    /**
     * fareAmount 속성의 값을 설정합니다.
     * 
     */
    public void setFareAmount(double value) {
        this.fareAmount = value;
    }

    /**
     * fareCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCurrency() {
        return fareCurrency;
    }

    /**
     * fareCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCurrency(String value) {
        this.fareCurrency = value;
    }

    /**
     * gstAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getGSTAmount() {
        return gstAmount;
    }

    /**
     * gstAmount 속성의 값을 설정합니다.
     * 
     */
    public void setGSTAmount(double value) {
        this.gstAmount = value;
    }

    /**
     * gstCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSTCurrency() {
        return gstCurrency;
    }

    /**
     * gstCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSTCurrency(String value) {
        this.gstCurrency = value;
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
     * feeCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCurrency() {
        return feeCurrency;
    }

    /**
     * feeCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCurrency(String value) {
        this.feeCurrency = value;
    }

}
