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
 * <p>PaymentInformation complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaymentInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="formOfPaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parentType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ParentFOPType"/&gt;
 *         &lt;element name="paymentAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="paymentCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="owedCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="owedAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="feeTaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeTax" minOccurs="0"/&gt;
 *         &lt;element name="chequeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ChequeDetails" minOccurs="0"/&gt;
 *         &lt;element name="debitCardDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}DebitCardDetails" minOccurs="0"/&gt;
 *         &lt;element name="electronicFundDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ElectronicFundDetails"/&gt;
 *         &lt;element name="writeOffDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}WriteOffDetails"/&gt;
 *         &lt;element name="creditCardDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PymCreditCardDetails"/&gt;
 *         &lt;element name="creditFileDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CreditFileDetails"/&gt;
 *         &lt;element name="agPaymentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AGPaymentDetails" minOccurs="0"/&gt;
 *         &lt;element name="paPaymentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PAPaymentDetails" minOccurs="0"/&gt;
 *         &lt;element name="authenticationTxnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="threeDSecurityDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ThreeDSecurityDtls" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInformation", propOrder = {
    "formOfPaymentType",
    "parentType",
    "paymentAmount",
    "paymentCurrency",
    "exchangeRate",
    "owedCurrency",
    "owedAmount",
    "feeTaxDetails",
    "chequeDetails",
    "debitCardDetails",
    "electronicFundDetails",
    "writeOffDetails",
    "creditCardDetails",
    "creditFileDetails",
    "agPaymentDetails",
    "paPaymentDetails",
    "authenticationTxnId",
    "threeDSecurityDetails"
})
public class PaymentInformation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected String formOfPaymentType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ParentFOPType parentType;
    protected double paymentAmount;
    @XmlElement(required = true)
    protected String paymentCurrency;
    protected double exchangeRate;
    @XmlElement(required = true)
    protected String owedCurrency;
    protected double owedAmount;
    protected FeeTax feeTaxDetails;
    protected ChequeDetails chequeDetails;
    protected DebitCardDetails debitCardDetails;
    @XmlElement(required = true)
    protected ElectronicFundDetails electronicFundDetails;
    @XmlElement(required = true)
    protected WriteOffDetails writeOffDetails;
    @XmlElement(required = true)
    protected PymCreditCardDetails creditCardDetails;
    @XmlElement(required = true)
    protected CreditFileDetails creditFileDetails;
    protected AGPaymentDetails agPaymentDetails;
    protected PAPaymentDetails paPaymentDetails;
    protected String authenticationTxnId;
    protected ThreeDSecurityDtls threeDSecurityDetails;

    /**
     * formOfPaymentType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfPaymentType() {
        return formOfPaymentType;
    }

    /**
     * formOfPaymentType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfPaymentType(String value) {
        this.formOfPaymentType = value;
    }

    /**
     * parentType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ParentFOPType }
     *     
     */
    public ParentFOPType getParentType() {
        return parentType;
    }

    /**
     * parentType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentFOPType }
     *     
     */
    public void setParentType(ParentFOPType value) {
        this.parentType = value;
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
     * exchangeRate 속성의 값을 가져옵니다.
     * 
     */
    public double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * exchangeRate 속성의 값을 설정합니다.
     * 
     */
    public void setExchangeRate(double value) {
        this.exchangeRate = value;
    }

    /**
     * owedCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwedCurrency() {
        return owedCurrency;
    }

    /**
     * owedCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwedCurrency(String value) {
        this.owedCurrency = value;
    }

    /**
     * owedAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getOwedAmount() {
        return owedAmount;
    }

    /**
     * owedAmount 속성의 값을 설정합니다.
     * 
     */
    public void setOwedAmount(double value) {
        this.owedAmount = value;
    }

    /**
     * feeTaxDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FeeTax }
     *     
     */
    public FeeTax getFeeTaxDetails() {
        return feeTaxDetails;
    }

    /**
     * feeTaxDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeTax }
     *     
     */
    public void setFeeTaxDetails(FeeTax value) {
        this.feeTaxDetails = value;
    }

    /**
     * chequeDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ChequeDetails }
     *     
     */
    public ChequeDetails getChequeDetails() {
        return chequeDetails;
    }

    /**
     * chequeDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeDetails }
     *     
     */
    public void setChequeDetails(ChequeDetails value) {
        this.chequeDetails = value;
    }

    /**
     * debitCardDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DebitCardDetails }
     *     
     */
    public DebitCardDetails getDebitCardDetails() {
        return debitCardDetails;
    }

    /**
     * debitCardDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCardDetails }
     *     
     */
    public void setDebitCardDetails(DebitCardDetails value) {
        this.debitCardDetails = value;
    }

    /**
     * electronicFundDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicFundDetails }
     *     
     */
    public ElectronicFundDetails getElectronicFundDetails() {
        return electronicFundDetails;
    }

    /**
     * electronicFundDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicFundDetails }
     *     
     */
    public void setElectronicFundDetails(ElectronicFundDetails value) {
        this.electronicFundDetails = value;
    }

    /**
     * writeOffDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link WriteOffDetails }
     *     
     */
    public WriteOffDetails getWriteOffDetails() {
        return writeOffDetails;
    }

    /**
     * writeOffDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteOffDetails }
     *     
     */
    public void setWriteOffDetails(WriteOffDetails value) {
        this.writeOffDetails = value;
    }

    /**
     * creditCardDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PymCreditCardDetails }
     *     
     */
    public PymCreditCardDetails getCreditCardDetails() {
        return creditCardDetails;
    }

    /**
     * creditCardDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PymCreditCardDetails }
     *     
     */
    public void setCreditCardDetails(PymCreditCardDetails value) {
        this.creditCardDetails = value;
    }

    /**
     * creditFileDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CreditFileDetails }
     *     
     */
    public CreditFileDetails getCreditFileDetails() {
        return creditFileDetails;
    }

    /**
     * creditFileDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditFileDetails }
     *     
     */
    public void setCreditFileDetails(CreditFileDetails value) {
        this.creditFileDetails = value;
    }

    /**
     * agPaymentDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AGPaymentDetails }
     *     
     */
    public AGPaymentDetails getAgPaymentDetails() {
        return agPaymentDetails;
    }

    /**
     * agPaymentDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AGPaymentDetails }
     *     
     */
    public void setAgPaymentDetails(AGPaymentDetails value) {
        this.agPaymentDetails = value;
    }

    /**
     * paPaymentDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PAPaymentDetails }
     *     
     */
    public PAPaymentDetails getPaPaymentDetails() {
        return paPaymentDetails;
    }

    /**
     * paPaymentDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PAPaymentDetails }
     *     
     */
    public void setPaPaymentDetails(PAPaymentDetails value) {
        this.paPaymentDetails = value;
    }

    /**
     * authenticationTxnId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationTxnId() {
        return authenticationTxnId;
    }

    /**
     * authenticationTxnId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationTxnId(String value) {
        this.authenticationTxnId = value;
    }

    /**
     * threeDSecurityDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ThreeDSecurityDtls }
     *     
     */
    public ThreeDSecurityDtls getThreeDSecurityDetails() {
        return threeDSecurityDetails;
    }

    /**
     * threeDSecurityDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDSecurityDtls }
     *     
     */
    public void setThreeDSecurityDetails(ThreeDSecurityDtls value) {
        this.threeDSecurityDetails = value;
    }

}
