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
 * <p>AdditionalCreditCardInfoType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AdditionalCreditCardInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallmentPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthenticationType" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuthenticationDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="CardPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GoodsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GoodsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThreeDNotificationURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CSSURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentPageTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PosMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardBin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalCreditCardInfoType", propOrder = {
    "registrationNumber",
    "authType",
    "installmentPeriod",
    "authenticationType",
    "cardPassword",
    "goodsCount",
    "goodsName",
    "customerUserID",
    "threeDNotificationURL",
    "cssurl",
    "paymentPageTemplate",
    "posMessage",
    "timeStamp",
    "signature",
    "bankId",
    "bankName",
    "cardBin"
})
public class AdditionalCreditCardInfoType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "RegistrationNumber")
    protected String registrationNumber;
    @XmlElement(name = "AuthType")
    protected String authType;
    @XmlElement(name = "InstallmentPeriod")
    protected String installmentPeriod;
    @XmlElement(name = "AuthenticationType")
    @XmlSchemaType(name = "string")
    protected AuthenticationDetailsType authenticationType;
    @XmlElement(name = "CardPassword")
    protected String cardPassword;
    @XmlElement(name = "GoodsCount")
    protected Integer goodsCount;
    @XmlElement(name = "GoodsName")
    protected String goodsName;
    @XmlElement(name = "CustomerUserID")
    protected String customerUserID;
    @XmlElement(name = "ThreeDNotificationURL")
    protected String threeDNotificationURL;
    @XmlElement(name = "CSSURL")
    protected String cssurl;
    @XmlElement(name = "PaymentPageTemplate")
    protected String paymentPageTemplate;
    @XmlElement(name = "PosMessage")
    protected String posMessage;
    @XmlElement(name = "TimeStamp")
    protected String timeStamp;
    @XmlElement(name = "Signature")
    protected String signature;
    @XmlElement(name = "BankId")
    protected String bankId;
    @XmlElement(name = "BankName")
    protected String bankName;
    @XmlElement(name = "CardBin")
    protected String cardBin;

    /**
     * registrationNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * registrationNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * authType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * authType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthType(String value) {
        this.authType = value;
    }

    /**
     * installmentPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallmentPeriod() {
        return installmentPeriod;
    }

    /**
     * installmentPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallmentPeriod(String value) {
        this.installmentPeriod = value;
    }

    /**
     * authenticationType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationDetailsType }
     *     
     */
    public AuthenticationDetailsType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * authenticationType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationDetailsType }
     *     
     */
    public void setAuthenticationType(AuthenticationDetailsType value) {
        this.authenticationType = value;
    }

    /**
     * cardPassword 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPassword() {
        return cardPassword;
    }

    /**
     * cardPassword 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPassword(String value) {
        this.cardPassword = value;
    }

    /**
     * goodsCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGoodsCount() {
        return goodsCount;
    }

    /**
     * goodsCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGoodsCount(Integer value) {
        this.goodsCount = value;
    }

    /**
     * goodsName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * goodsName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsName(String value) {
        this.goodsName = value;
    }

    /**
     * customerUserID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUserID() {
        return customerUserID;
    }

    /**
     * customerUserID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUserID(String value) {
        this.customerUserID = value;
    }

    /**
     * threeDNotificationURL 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDNotificationURL() {
        return threeDNotificationURL;
    }

    /**
     * threeDNotificationURL 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDNotificationURL(String value) {
        this.threeDNotificationURL = value;
    }

    /**
     * cssurl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSSURL() {
        return cssurl;
    }

    /**
     * cssurl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSSURL(String value) {
        this.cssurl = value;
    }

    /**
     * paymentPageTemplate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPageTemplate() {
        return paymentPageTemplate;
    }

    /**
     * paymentPageTemplate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPageTemplate(String value) {
        this.paymentPageTemplate = value;
    }

    /**
     * posMessage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosMessage() {
        return posMessage;
    }

    /**
     * posMessage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosMessage(String value) {
        this.posMessage = value;
    }

    /**
     * timeStamp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * timeStamp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

    /**
     * signature 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * signature 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * bankId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * bankId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankId(String value) {
        this.bankId = value;
    }

    /**
     * bankName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * bankName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * cardBin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBin() {
        return cardBin;
    }

    /**
     * cardBin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBin(String value) {
        this.cardBin = value;
    }

}
