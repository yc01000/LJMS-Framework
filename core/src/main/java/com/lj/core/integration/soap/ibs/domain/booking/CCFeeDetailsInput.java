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
 * <p>CCFeeDetailsInput complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CCFeeDetailsInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceInitiator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ServiceCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/&gt;
 *         &lt;element name="CreditCardType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PointOfPurchase" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isDomestic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCFeeDetailsInput", propOrder = {
    "serviceInitiator",
    "currency",
    "amount",
    "serviceCurrency",
    "paymentDate",
    "creditCardType",
    "pointOfPurchase",
    "isDomestic",
    "guestId"
})
public class CCFeeDetailsInput
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ServiceInitiator", required = true)
    protected String serviceInitiator;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "Amount")
    protected double amount;
    @XmlElement(name = "ServiceCurrency", required = true)
    protected String serviceCurrency;
    @XmlElement(name = "PaymentDate", required = true)
    protected DateOnlyType paymentDate;
    @XmlElement(name = "CreditCardType", required = true)
    protected String creditCardType;
    @XmlElement(name = "PointOfPurchase", required = true)
    protected String pointOfPurchase;
    protected Boolean isDomestic;
    @XmlElement(name = "GuestId")
    protected Integer guestId;

    /**
     * serviceInitiator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInitiator() {
        return serviceInitiator;
    }

    /**
     * serviceInitiator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInitiator(String value) {
        this.serviceInitiator = value;
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
     * amount 속성의 값을 가져옵니다.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * amount 속성의 값을 설정합니다.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * serviceCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCurrency() {
        return serviceCurrency;
    }

    /**
     * serviceCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCurrency(String value) {
        this.serviceCurrency = value;
    }

    /**
     * paymentDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getPaymentDate() {
        return paymentDate;
    }

    /**
     * paymentDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setPaymentDate(DateOnlyType value) {
        this.paymentDate = value;
    }

    /**
     * creditCardType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * creditCardType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
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
     * isDomestic 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDomestic() {
        return isDomestic;
    }

    /**
     * isDomestic 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDomestic(Boolean value) {
        this.isDomestic = value;
    }

    /**
     * guestId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuestId() {
        return guestId;
    }

    /**
     * guestId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGuestId(Integer value) {
        this.guestId = value;
    }

}
