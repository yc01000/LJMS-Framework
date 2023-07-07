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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>PaymentDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormOfPaymentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="PaymentCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DCCCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DCCAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="PaymentElementType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRExtractPaymentElementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentTypeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConvenienceStoreCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConvenienceStoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConvenienceStoreType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecieptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptPrintURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsableCVSCompanycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetails", propOrder = {
    "formOfPaymentCode",
    "paymentAmount",
    "paymentCurrency",
    "paymentDate",
    "cardType",
    "dccCurrency",
    "agencyCode",
    "dccAmount",
    "conversionRate",
    "paymentElementType",
    "transactionID",
    "paymentDescription",
    "creditCardNumber",
    "paymentTypeNumber",
    "paymentStatus",
    "cardHolderName",
    "paymentCode",
    "convenienceStoreCode",
    "convenienceStoreName",
    "convenienceStoreType",
    "customerFirstName",
    "customerLastName",
    "customerPhoneNumber",
    "recieptNumber",
    "receiptPrintURL",
    "usableCVSCompanycode"
})
public class PaymentDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FormOfPaymentCode", required = true)
    protected String formOfPaymentCode;
    @XmlElement(name = "PaymentAmount")
    protected double paymentAmount;
    @XmlElement(name = "PaymentCurrency", required = true)
    protected String paymentCurrency;
    @XmlElement(name = "PaymentDate", required = true)
    protected String paymentDate;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "DCCCurrency")
    protected String dccCurrency;
    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "DCCAmount")
    protected double dccAmount;
    @XmlElement(name = "ConversionRate")
    protected double conversionRate;
    @XmlElement(name = "PaymentElementType")
    protected List<PNRExtractPaymentElementType> paymentElementType;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "PaymentDescription")
    protected String paymentDescription;
    @XmlElement(name = "CreditCardNumber")
    protected String creditCardNumber;
    protected String paymentTypeNumber;
    @XmlElement(name = "PaymentStatus")
    protected String paymentStatus;
    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;
    @XmlElement(name = "PaymentCode")
    protected String paymentCode;
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

    /**
     * formOfPaymentCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfPaymentCode() {
        return formOfPaymentCode;
    }

    /**
     * formOfPaymentCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfPaymentCode(String value) {
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
     * paymentDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * paymentDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDate(String value) {
        this.paymentDate = value;
    }

    /**
     * cardType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * cardType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * dccCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCCurrency() {
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
    public void setDCCCurrency(String value) {
        this.dccCurrency = value;
    }

    /**
     * agencyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * agencyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * dccAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getDCCAmount() {
        return dccAmount;
    }

    /**
     * dccAmount 속성의 값을 설정합니다.
     * 
     */
    public void setDCCAmount(double value) {
        this.dccAmount = value;
    }

    /**
     * conversionRate 속성의 값을 가져옵니다.
     * 
     */
    public double getConversionRate() {
        return conversionRate;
    }

    /**
     * conversionRate 속성의 값을 설정합니다.
     * 
     */
    public void setConversionRate(double value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the paymentElementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentElementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentElementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRExtractPaymentElementType }
     * 
     * 
     */
    public List<PNRExtractPaymentElementType> getPaymentElementType() {
        if (paymentElementType == null) {
            paymentElementType = new ArrayList<PNRExtractPaymentElementType>();
        }
        return this.paymentElementType;
    }

    /**
     * transactionID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * transactionID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
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
     * creditCardNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * creditCardNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
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
     * paymentStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * paymentStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
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
     * paymentCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCode() {
        return paymentCode;
    }

    /**
     * paymentCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCode(String value) {
        this.paymentCode = value;
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

}
