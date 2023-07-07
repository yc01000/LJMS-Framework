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
 * <p>PaymentFOPDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaymentFOPDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormOfPaymentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType"/&gt;
 *         &lt;element name="PaymentCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardTransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallationPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardApprovalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GiftCertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeneralRemark" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountingRemark" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BillingIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MarkUpAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentFOPDetailsType", propOrder = {
    "formOfPaymentCode",
    "paymentAmount",
    "paymentCurrency",
    "cardNumber",
    "cardTransactionType",
    "installationPeriod",
    "cardApprovalNumber",
    "giftCertificateNumber",
    "generalRemark",
    "accountingRemark",
    "billingIndicator",
    "markUpAmount"
})
public class PaymentFOPDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FormOfPaymentCode", required = true)
    protected String formOfPaymentCode;
    @XmlElement(name = "PaymentAmount", required = true)
    protected AmountType paymentAmount;
    @XmlElement(name = "PaymentCurrency", required = true)
    protected String paymentCurrency;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "CardTransactionType")
    protected String cardTransactionType;
    @XmlElement(name = "InstallationPeriod")
    protected String installationPeriod;
    @XmlElement(name = "CardApprovalNumber")
    protected String cardApprovalNumber;
    @XmlElement(name = "GiftCertificateNumber")
    protected String giftCertificateNumber;
    @XmlElement(name = "GeneralRemark", required = true)
    protected String generalRemark;
    @XmlElement(name = "AccountingRemark", required = true)
    protected String accountingRemark;
    @XmlElement(name = "BillingIndicator", required = true)
    protected String billingIndicator;
    @XmlElement(name = "MarkUpAmount", required = true)
    protected String markUpAmount;

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
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * paymentAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPaymentAmount(AmountType value) {
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
     * cardTransactionType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTransactionType() {
        return cardTransactionType;
    }

    /**
     * cardTransactionType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTransactionType(String value) {
        this.cardTransactionType = value;
    }

    /**
     * installationPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallationPeriod() {
        return installationPeriod;
    }

    /**
     * installationPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallationPeriod(String value) {
        this.installationPeriod = value;
    }

    /**
     * cardApprovalNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardApprovalNumber() {
        return cardApprovalNumber;
    }

    /**
     * cardApprovalNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardApprovalNumber(String value) {
        this.cardApprovalNumber = value;
    }

    /**
     * giftCertificateNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertificateNumber() {
        return giftCertificateNumber;
    }

    /**
     * giftCertificateNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertificateNumber(String value) {
        this.giftCertificateNumber = value;
    }

    /**
     * generalRemark 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralRemark() {
        return generalRemark;
    }

    /**
     * generalRemark 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralRemark(String value) {
        this.generalRemark = value;
    }

    /**
     * accountingRemark 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingRemark() {
        return accountingRemark;
    }

    /**
     * accountingRemark 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingRemark(String value) {
        this.accountingRemark = value;
    }

    /**
     * billingIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingIndicator() {
        return billingIndicator;
    }

    /**
     * billingIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingIndicator(String value) {
        this.billingIndicator = value;
    }

    /**
     * markUpAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkUpAmount() {
        return markUpAmount;
    }

    /**
     * markUpAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkUpAmount(String value) {
        this.markUpAmount = value;
    }

}
