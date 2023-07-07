//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>PaymentDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isCheckForCCFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FormOfPaymentCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}FOPType"/&gt;
 *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CardType" type="{http://www.ibsplc.com/iRes/simpleTypes/}CardType"/&gt;
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExpirationYear" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CardSecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TrackOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackTwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailsType", propOrder = {
    "isCheckForCCFee",
    "formOfPaymentCode",
    "paymentAmount",
    "cardType",
    "cardNumber",
    "expirationMonth",
    "expirationYear",
    "cardSecurityCode",
    "cardHolderName",
    "paymentCurrency",
    "trackOne",
    "trackTwo"
})
public class PaymentDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Boolean isCheckForCCFee;
    @XmlElement(name = "FormOfPaymentCode", required = true)
    @XmlSchemaType(name = "string")
    protected FOPType formOfPaymentCode;
    @XmlElement(name = "PaymentAmount")
    protected double paymentAmount;
    @XmlElement(name = "CardType", required = true)
    @XmlSchemaType(name = "string")
    protected CardType cardType;
    @XmlElement(name = "CardNumber", required = true)
    protected String cardNumber;
    @XmlElement(name = "ExpirationMonth", required = true)
    protected String expirationMonth;
    @XmlElement(name = "ExpirationYear", required = true)
    protected String expirationYear;
    @XmlElement(name = "CardSecurityCode")
    protected String cardSecurityCode;
    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;
    @XmlElement(name = "PaymentCurrency", required = true)
    protected String paymentCurrency;
    @XmlElement(name = "TrackOne")
    protected String trackOne;
    @XmlElement(name = "TrackTwo")
    protected String trackTwo;

    /**
     * isCheckForCCFee 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCheckForCCFee() {
        return isCheckForCCFee;
    }

    /**
     * isCheckForCCFee 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCheckForCCFee(Boolean value) {
        this.isCheckForCCFee = value;
    }

    /**
     * formOfPaymentCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FOPType }
     *     
     */
    public FOPType getFormOfPaymentCode() {
        return formOfPaymentCode;
    }

    /**
     * formOfPaymentCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FOPType }
     *     
     */
    public void setFormOfPaymentCode(FOPType value) {
        this.formOfPaymentCode = value;
    }

    /**
     * paymentAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * paymentAmount 속성의 값을 설정합니다.
     * 
     */
    public void setPaymentAmount(double value) {
        this.paymentAmount = value;
    }

    /**
     * cardType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CardType }
     *     
     */
    public CardType getCardType() {
        return cardType;
    }

    /**
     * cardType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CardType }
     *     
     */
    public void setCardType(CardType value) {
        this.cardType = value;
    }

    /**
     * cardNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * cardNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * expirationMonth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * expirationMonth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationMonth(String value) {
        this.expirationMonth = value;
    }

    /**
     * expirationYear 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationYear() {
        return expirationYear;
    }

    /**
     * expirationYear 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationYear(String value) {
        this.expirationYear = value;
    }

    /**
     * cardSecurityCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSecurityCode() {
        return cardSecurityCode;
    }

    /**
     * cardSecurityCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSecurityCode(String value) {
        this.cardSecurityCode = value;
    }

    /**
     * cardHolderName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * cardHolderName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * paymentCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    /**
     * paymentCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCurrency(String value) {
        this.paymentCurrency = value;
    }

    /**
     * trackOne 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackOne() {
        return trackOne;
    }

    /**
     * trackOne 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackOne(String value) {
        this.trackOne = value;
    }

    /**
     * trackTwo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackTwo() {
        return trackTwo;
    }

    /**
     * trackTwo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackTwo(String value) {
        this.trackTwo = value;
    }

}
