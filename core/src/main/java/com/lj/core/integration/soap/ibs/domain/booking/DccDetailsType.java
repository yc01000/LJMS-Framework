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
 * <p>DccDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="DccDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isDCCOffered" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasUserAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="dccMerchantID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dccAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="dccCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dccExchangeRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DccDetailsType", propOrder = {
    "isDCCOffered",
    "hasUserAccepted",
    "dccMerchantID",
    "dccAmount",
    "dccCurrency",
    "dccExchangeRate",
    "status"
})
public class DccDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected boolean isDCCOffered;
    protected boolean hasUserAccepted;
    @XmlElement(required = true)
    protected String dccMerchantID;
    protected double dccAmount;
    @XmlElement(required = true)
    protected String dccCurrency;
    protected double dccExchangeRate;
    @XmlElement(required = true)
    protected String status;

    /**
     * isDCCOffered 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsDCCOffered() {
        return isDCCOffered;
    }

    /**
     * isDCCOffered 속성의 값을 설정합니다.
     * 
     */
    public void setIsDCCOffered(boolean value) {
        this.isDCCOffered = value;
    }

    /**
     * hasUserAccepted 속성의 값을 가져옵니다.
     * 
     */
    public boolean isHasUserAccepted() {
        return hasUserAccepted;
    }

    /**
     * hasUserAccepted 속성의 값을 설정합니다.
     * 
     */
    public void setHasUserAccepted(boolean value) {
        this.hasUserAccepted = value;
    }

    /**
     * dccMerchantID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDccMerchantID() {
        return dccMerchantID;
    }

    /**
     * dccMerchantID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDccMerchantID(String value) {
        this.dccMerchantID = value;
    }

    /**
     * dccAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getDccAmount() {
        return dccAmount;
    }

    /**
     * dccAmount 속성의 값을 설정합니다.
     * 
     */
    public void setDccAmount(double value) {
        this.dccAmount = value;
    }

    /**
     * dccCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDccCurrency() {
        return dccCurrency;
    }

    /**
     * dccCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDccCurrency(String value) {
        this.dccCurrency = value;
    }

    /**
     * dccExchangeRate 속성의 값을 가져옵니다.
     * 
     */
    public double getDccExchangeRate() {
        return dccExchangeRate;
    }

    /**
     * dccExchangeRate 속성의 값을 설정합니다.
     * 
     */
    public void setDccExchangeRate(double value) {
        this.dccExchangeRate = value;
    }

    /**
     * status 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * status 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
