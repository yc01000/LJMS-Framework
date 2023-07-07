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
 * <p>PaymentProcessingType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaymentProcessingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormOfPayment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentTypeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WriteOffCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}WriteOffCodeType" minOccurs="0"/&gt;
 *         &lt;element name="WriteOffReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardType" type="{http://www.ibsplc.com/iRes/simpleTypes/}CardType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentProcessingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConvenienceStoreCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConvenienceStoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConvenienceStoreType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecieptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptPrintURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsableCVSCompanycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaskedCreditcardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalCreditCardInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}AdditionalCreditCardInfo" minOccurs="0"/&gt;
 *         &lt;element name="CashReceiptType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalAuthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalAuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentProcessingType", propOrder = {
    "formOfPayment",
    "paymentTypeNumber",
    "writeOffCode",
    "writeOffReason",
    "cardHolderName",
    "cardType",
    "paymentProcessingStatus",
    "expirationMonth",
    "expirationYear",
    "paymentDescription",
    "errorCode",
    "errorDescription",
    "convenienceStoreCode",
    "convenienceStoreName",
    "convenienceStoreType",
    "customerFirstName",
    "customerLastName",
    "customerPhoneNumber",
    "recieptNumber",
    "receiptPrintURL",
    "usableCVSCompanycode",
    "maskedCreditcardNumber",
    "additionalCreditCardInfo",
    "cashReceiptType",
    "originalAuthDate",
    "originalAuthCode"
})
public class PaymentProcessingType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FormOfPayment", required = true)
    protected String formOfPayment;
    @XmlElement(name = "PaymentTypeNumber")
    protected String paymentTypeNumber;
    @XmlElement(name = "WriteOffCode")
    @XmlSchemaType(name = "string")
    protected WriteOffCodeType writeOffCode;
    @XmlElement(name = "WriteOffReason")
    protected String writeOffReason;
    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;
    @XmlElement(name = "CardType")
    @XmlSchemaType(name = "string")
    protected CardType cardType;
    @XmlElement(name = "PaymentProcessingStatus")
    protected String paymentProcessingStatus;
    @XmlElement(name = "ExpirationMonth")
    protected String expirationMonth;
    @XmlElement(name = "ExpirationYear")
    protected String expirationYear;
    @XmlElement(name = "PaymentDescription")
    protected String paymentDescription;
    @XmlElement(name = "ErrorCode")
    protected String errorCode;
    @XmlElement(name = "ErrorDescription")
    protected String errorDescription;
    @XmlElement(name = "ConvenienceStoreCode")
    protected String convenienceStoreCode;
    @XmlElement(name = "ConvenienceStoreName")
    protected String convenienceStoreName;
    @XmlElement(name = "ConvenienceStoreType")
    protected String convenienceStoreType;
    @XmlElement(name = "CustomerFirstName")
    protected String customerFirstName;
    @XmlElement(name = "CustomerLastName")
    protected String customerLastName;
    @XmlElement(name = "CustomerPhoneNumber")
    protected String customerPhoneNumber;
    @XmlElement(name = "RecieptNumber")
    protected String recieptNumber;
    @XmlElement(name = "ReceiptPrintURL")
    protected String receiptPrintURL;
    @XmlElement(name = "UsableCVSCompanycode")
    protected String usableCVSCompanycode;
    @XmlElement(name = "MaskedCreditcardNumber")
    protected String maskedCreditcardNumber;
    @XmlElement(name = "AdditionalCreditCardInfo")
    protected AdditionalCreditCardInfo additionalCreditCardInfo;
    @XmlElement(name = "CashReceiptType")
    protected String cashReceiptType;
    @XmlElement(name = "OriginalAuthDate")
    protected String originalAuthDate;
    @XmlElement(name = "OriginalAuthCode")
    protected String originalAuthCode;

    /**
     * formOfPayment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * formOfPayment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfPayment(String value) {
        this.formOfPayment = value;
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
     * paymentProcessingStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentProcessingStatus() {
        return paymentProcessingStatus;
    }

    /**
     * paymentProcessingStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentProcessingStatus(String value) {
        this.paymentProcessingStatus = value;
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
     * paymentDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDescription() {
        return paymentDescription;
    }

    /**
     * paymentDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDescription(String value) {
        this.paymentDescription = value;
    }

    /**
     * errorCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * errorCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * errorDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * errorDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * convenienceStoreCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvenienceStoreCode() {
        return convenienceStoreCode;
    }

    /**
     * convenienceStoreCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvenienceStoreCode(String value) {
        this.convenienceStoreCode = value;
    }

    /**
     * convenienceStoreName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvenienceStoreName() {
        return convenienceStoreName;
    }

    /**
     * convenienceStoreName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvenienceStoreName(String value) {
        this.convenienceStoreName = value;
    }

    /**
     * convenienceStoreType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvenienceStoreType() {
        return convenienceStoreType;
    }

    /**
     * convenienceStoreType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvenienceStoreType(String value) {
        this.convenienceStoreType = value;
    }

    /**
     * customerFirstName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    /**
     * customerFirstName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFirstName(String value) {
        this.customerFirstName = value;
    }

    /**
     * customerLastName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLastName() {
        return customerLastName;
    }

    /**
     * customerLastName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLastName(String value) {
        this.customerLastName = value;
    }

    /**
     * customerPhoneNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    /**
     * customerPhoneNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPhoneNumber(String value) {
        this.customerPhoneNumber = value;
    }

    /**
     * recieptNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecieptNumber() {
        return recieptNumber;
    }

    /**
     * recieptNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecieptNumber(String value) {
        this.recieptNumber = value;
    }

    /**
     * receiptPrintURL 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptPrintURL() {
        return receiptPrintURL;
    }

    /**
     * receiptPrintURL 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptPrintURL(String value) {
        this.receiptPrintURL = value;
    }

    /**
     * usableCVSCompanycode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsableCVSCompanycode() {
        return usableCVSCompanycode;
    }

    /**
     * usableCVSCompanycode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsableCVSCompanycode(String value) {
        this.usableCVSCompanycode = value;
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
     * additionalCreditCardInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCreditCardInfo }
     *     
     */
    public AdditionalCreditCardInfo getAdditionalCreditCardInfo() {
        return additionalCreditCardInfo;
    }

    /**
     * additionalCreditCardInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCreditCardInfo }
     *     
     */
    public void setAdditionalCreditCardInfo(AdditionalCreditCardInfo value) {
        this.additionalCreditCardInfo = value;
    }

    /**
     * cashReceiptType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashReceiptType() {
        return cashReceiptType;
    }

    /**
     * cashReceiptType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashReceiptType(String value) {
        this.cashReceiptType = value;
    }

    /**
     * originalAuthDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalAuthDate() {
        return originalAuthDate;
    }

    /**
     * originalAuthDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalAuthDate(String value) {
        this.originalAuthDate = value;
    }

    /**
     * originalAuthCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalAuthCode() {
        return originalAuthCode;
    }

    /**
     * originalAuthCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalAuthCode(String value) {
        this.originalAuthCode = value;
    }

}
