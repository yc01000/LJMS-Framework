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
 * <p>RefundType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="RefundType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormOfRefund" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WriteOffCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}WriteOffCodeType" minOccurs="0"/&gt;
 *         &lt;element name="WriteOffReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditFileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditFileExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RefundAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FeeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeInformation" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTypeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardExpiryMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardExpiryYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MaskedCreditcardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundType", propOrder = {
    "formOfRefund",
    "writeOffCode",
    "writeOffReason",
    "creditFileNumber",
    "creditFileExpiryDate",
    "refundAmount",
    "feeType",
    "paymentTypeNumber",
    "creditCardExpiryMonth",
    "paymentSubType",
    "cardExpiryYear",
    "currency",
    "maskedCreditcardNumber",
    "profileID"
})
public class RefundType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FormOfRefund", required = true)
    protected String formOfRefund;
    @XmlElement(name = "WriteOffCode")
    @XmlSchemaType(name = "string")
    protected WriteOffCodeType writeOffCode;
    @XmlElement(name = "WriteOffReason")
    protected String writeOffReason;
    @XmlElement(name = "CreditFileNumber")
    protected String creditFileNumber;
    @XmlElement(name = "CreditFileExpiryDate")
    protected String creditFileExpiryDate;
    @XmlElement(name = "RefundAmount")
    protected double refundAmount;
    @XmlElement(name = "FeeType")
    protected FeeInformation feeType;
    @XmlElement(name = "PaymentTypeNumber")
    protected String paymentTypeNumber;
    @XmlElement(name = "CreditCardExpiryMonth")
    protected String creditCardExpiryMonth;
    @XmlElement(name = "PaymentSubType")
    protected String paymentSubType;
    @XmlElement(name = "CardExpiryYear")
    protected String cardExpiryYear;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "MaskedCreditcardNumber")
    protected String maskedCreditcardNumber;
    @XmlElement(name = "ProfileID")
    protected String profileID;

    /**
     * formOfRefund 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfRefund() {
        return formOfRefund;
    }

    /**
     * formOfRefund 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfRefund(String value) {
        this.formOfRefund = value;
    }

    /**
     * writeOffCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link WriteOffCodeType }
     *     
     */
    public WriteOffCodeType getWriteOffCode() {
        return writeOffCode;
    }

    /**
     * writeOffCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteOffCodeType }
     *     
     */
    public void setWriteOffCode(WriteOffCodeType value) {
        this.writeOffCode = value;
    }

    /**
     * writeOffReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriteOffReason() {
        return writeOffReason;
    }

    /**
     * writeOffReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriteOffReason(String value) {
        this.writeOffReason = value;
    }

    /**
     * creditFileNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditFileNumber() {
        return creditFileNumber;
    }

    /**
     * creditFileNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditFileNumber(String value) {
        this.creditFileNumber = value;
    }

    /**
     * creditFileExpiryDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditFileExpiryDate() {
        return creditFileExpiryDate;
    }

    /**
     * creditFileExpiryDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditFileExpiryDate(String value) {
        this.creditFileExpiryDate = value;
    }

    /**
     * refundAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getRefundAmount() {
        return refundAmount;
    }

    /**
     * refundAmount 속성의 값을 설정합니다.
     * 
     */
    public void setRefundAmount(double value) {
        this.refundAmount = value;
    }

    /**
     * feeType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FeeInformation }
     *     
     */
    public FeeInformation getFeeType() {
        return feeType;
    }

    /**
     * feeType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeInformation }
     *     
     */
    public void setFeeType(FeeInformation value) {
        this.feeType = value;
    }

    /**
     * paymentTypeNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeNumber() {
        return paymentTypeNumber;
    }

    /**
     * paymentTypeNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeNumber(String value) {
        this.paymentTypeNumber = value;
    }

    /**
     * creditCardExpiryMonth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpiryMonth() {
        return creditCardExpiryMonth;
    }

    /**
     * creditCardExpiryMonth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpiryMonth(String value) {
        this.creditCardExpiryMonth = value;
    }

    /**
     * paymentSubType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSubType() {
        return paymentSubType;
    }

    /**
     * paymentSubType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSubType(String value) {
        this.paymentSubType = value;
    }

    /**
     * cardExpiryYear 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpiryYear() {
        return cardExpiryYear;
    }

    /**
     * cardExpiryYear 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpiryYear(String value) {
        this.cardExpiryYear = value;
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
     * maskedCreditcardNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedCreditcardNumber() {
        return maskedCreditcardNumber;
    }

    /**
     * maskedCreditcardNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedCreditcardNumber(String value) {
        this.maskedCreditcardNumber = value;
    }

    /**
     * profileID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileID() {
        return profileID;
    }

    /**
     * profileID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileID(String value) {
        this.profileID = value;
    }

}
