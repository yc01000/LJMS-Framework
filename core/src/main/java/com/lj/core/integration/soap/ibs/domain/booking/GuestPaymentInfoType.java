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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>GuestPaymentInfoType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GuestPaymentInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FormOfPaymentCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}Payment_Type"/&gt;
 *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="WriteOffCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}WriteOffCodeDetails_Type" minOccurs="0"/&gt;
 *         &lt;element name="WriteOffReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardType" type="{http://www.ibsplc.com/iRes/simpleTypes/}CardDetails_Type" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentTypeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authenticationTxnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="membershipNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DccDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}DccPaymentDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="cvv2Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validationRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthorisationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthorisationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TransactionTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingAddress" type="{http://www.ibsplc.com/iRes/simpleTypes/}BillingAddressType" minOccurs="0"/&gt;
 *         &lt;element name="TrackOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackTwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentElementType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaymentElementDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThreeDSecurityDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ThreeDSecurityDtlsType" minOccurs="0"/&gt;
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
 *         &lt;element name="AdditionalCreditCardInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}AdditionalCreditCardInfoType" minOccurs="0"/&gt;
 *         &lt;element name="CashReceiptType" type="{http://www.ibsplc.com/iRes/simpleTypes/}CashReceiptDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="OriginalAuthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalAuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProcReturnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedirectionURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GatewayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localeCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LandingPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPreAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CartDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ShopingCartDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SignedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="txnTimeInAgentOfficeTimeZone" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CustomerProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomFieldList" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomFieldListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizationSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestPaymentInfoType", propOrder = {
    "guestId",
    "formOfPaymentCode",
    "paymentAmount",
    "exchangeRate",
    "writeOffCode",
    "writeOffReason",
    "cardType",
    "paymentCardType",
    "paymentTypeNumber",
    "authenticationTxnId",
    "membershipNumber",
    "expirationMonth",
    "expirationYear",
    "dccDetailsType",
    "cvv2Number",
    "agentID",
    "password",
    "validationRequired",
    "cardHolderName",
    "authorisationCode",
    "authorisationDate",
    "paymentCurrency",
    "paymentId",
    "paymentStatus",
    "transactionTime",
    "transactionTimeZone",
    "ipAddress",
    "emailID",
    "billingAddress",
    "trackOne",
    "trackTwo",
    "paymentDescription",
    "paymentElementType",
    "errorCode",
    "errorDescription",
    "transactionID",
    "threeDSecurityDetails",
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
    "originalAuthCode",
    "customerId",
    "procReturnCode",
    "paymentMethod",
    "transactionKey",
    "requestURL",
    "redirectionURL",
    "gatewayName",
    "localeCountryCode",
    "landingPage",
    "isPreAuthorized",
    "cartDetailsType",
    "iban",
    "bic",
    "accountHolderName",
    "signedDate",
    "txnTimeInAgentOfficeTimeZone",
    "customerProfileId",
    "agencyCode",
    "customFieldList",
    "paymentCode",
    "paymentSystemCode",
    "authorizationSequenceNumber"
})
public class GuestPaymentInfoType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "GuestId")
    protected Long guestId;
    @XmlElement(name = "FormOfPaymentCode", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentType formOfPaymentCode;
    @XmlElement(name = "PaymentAmount")
    protected double paymentAmount;
    @XmlElement(name = "ExchangeRate")
    protected Double exchangeRate;
    @XmlElement(name = "WriteOffCode")
    @XmlSchemaType(name = "string")
    protected WriteOffCodeDetailsType writeOffCode;
    @XmlElement(name = "WriteOffReason")
    protected String writeOffReason;
    @XmlElement(name = "CardType")
    @XmlSchemaType(name = "string")
    protected CardDetailsType cardType;
    @XmlElement(name = "PaymentCardType")
    protected String paymentCardType;
    protected String paymentTypeNumber;
    protected String authenticationTxnId;
    protected String membershipNumber;
    @XmlElement(name = "ExpirationMonth")
    protected String expirationMonth;
    @XmlElement(name = "ExpirationYear")
    protected String expirationYear;
    @XmlElement(name = "DccDetailsType")
    protected DccPaymentDetailsType dccDetailsType;
    protected String cvv2Number;
    protected String agentID;
    protected String password;
    protected String validationRequired;
    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;
    @XmlElement(name = "AuthorisationCode")
    protected String authorisationCode;
    @XmlElement(name = "AuthorisationDate")
    protected String authorisationDate;
    @XmlElement(name = "PaymentCurrency", required = true)
    protected String paymentCurrency;
    @XmlElement(name = "PaymentId")
    protected String paymentId;
    @XmlElement(name = "PaymentStatus")
    protected String paymentStatus;
    @XmlElement(name = "TransactionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionTime;
    @XmlElement(name = "TransactionTimeZone")
    protected String transactionTimeZone;
    @XmlElement(name = "IpAddress")
    protected String ipAddress;
    @XmlElement(name = "EmailID")
    protected String emailID;
    @XmlElement(name = "BillingAddress")
    protected BillingAddressType billingAddress;
    @XmlElement(name = "TrackOne")
    protected String trackOne;
    @XmlElement(name = "TrackTwo")
    protected String trackTwo;
    @XmlElement(name = "PaymentDescription")
    protected String paymentDescription;
    @XmlElement(name = "PaymentElementType")
    protected List<PaymentElementDetailsType> paymentElementType;
    @XmlElement(name = "ErrorCode")
    protected String errorCode;
    @XmlElement(name = "ErrorDescription")
    protected String errorDescription;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "ThreeDSecurityDetails")
    protected ThreeDSecurityDtlsType threeDSecurityDetails;
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
    protected AdditionalCreditCardInfoType additionalCreditCardInfo;
    @XmlElement(name = "CashReceiptType")
    protected String cashReceiptType;
    @XmlElement(name = "OriginalAuthDate")
    protected String originalAuthDate;
    @XmlElement(name = "OriginalAuthCode")
    protected String originalAuthCode;
    protected String customerId;
    @XmlElement(name = "ProcReturnCode")
    protected String procReturnCode;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;
    @XmlElement(name = "TransactionKey")
    protected String transactionKey;
    @XmlElement(name = "RequestURL")
    protected String requestURL;
    @XmlElement(name = "RedirectionURL")
    protected String redirectionURL;
    @XmlElement(name = "GatewayName")
    protected String gatewayName;
    protected String localeCountryCode;
    @XmlElement(name = "LandingPage")
    protected String landingPage;
    protected Boolean isPreAuthorized;
    @XmlElement(name = "CartDetailsType")
    protected List<ShopingCartDetailsType> cartDetailsType;
    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "BIC")
    protected String bic;
    @XmlElement(name = "AccountHolderName")
    protected String accountHolderName;
    @XmlElement(name = "SignedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar txnTimeInAgentOfficeTimeZone;
    @XmlElement(name = "CustomerProfileId")
    protected String customerProfileId;
    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "CustomFieldList")
    protected List<CustomFieldListType> customFieldList;
    @XmlElement(name = "PaymentCode")
    protected String paymentCode;
    @XmlElement(name = "PaymentSystemCode")
    protected String paymentSystemCode;
    @XmlElement(name = "AuthorizationSequenceNumber")
    protected String authorizationSequenceNumber;

    /**
     * guestId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuestId() {
        return guestId;
    }

    /**
     * guestId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuestId(Long value) {
        this.guestId = value;
    }

    /**
     * formOfPaymentCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getFormOfPaymentCode() {
        return formOfPaymentCode;
    }

    /**
     * formOfPaymentCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setFormOfPaymentCode(PaymentType value) {
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
     * exchangeRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * exchangeRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExchangeRate(Double value) {
        this.exchangeRate = value;
    }

    /**
     * writeOffCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link WriteOffCodeDetailsType }
     *     
     */
    public WriteOffCodeDetailsType getWriteOffCode() {
        return writeOffCode;
    }

    /**
     * writeOffCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteOffCodeDetailsType }
     *     
     */
    public void setWriteOffCode(WriteOffCodeDetailsType value) {
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
     * cardType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CardDetailsType }
     *     
     */
    public CardDetailsType getCardType() {
        return cardType;
    }

    /**
     * cardType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDetailsType }
     *     
     */
    public void setCardType(CardDetailsType value) {
        this.cardType = value;
    }

    /**
     * paymentCardType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardType() {
        return paymentCardType;
    }

    /**
     * paymentCardType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardType(String value) {
        this.paymentCardType = value;
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
     * membershipNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipNumber() {
        return membershipNumber;
    }

    /**
     * membershipNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipNumber(String value) {
        this.membershipNumber = value;
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
     * dccDetailsType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DccPaymentDetailsType }
     *     
     */
    public DccPaymentDetailsType getDccDetailsType() {
        return dccDetailsType;
    }

    /**
     * dccDetailsType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DccPaymentDetailsType }
     *     
     */
    public void setDccDetailsType(DccPaymentDetailsType value) {
        this.dccDetailsType = value;
    }

    /**
     * cvv2Number 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvv2Number() {
        return cvv2Number;
    }

    /**
     * cvv2Number 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvv2Number(String value) {
        this.cvv2Number = value;
    }

    /**
     * agentID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentID() {
        return agentID;
    }

    /**
     * agentID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentID(String value) {
        this.agentID = value;
    }

    /**
     * password 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * password 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * validationRequired 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationRequired() {
        return validationRequired;
    }

    /**
     * validationRequired 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationRequired(String value) {
        this.validationRequired = value;
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
     * authorisationCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorisationCode() {
        return authorisationCode;
    }

    /**
     * authorisationCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorisationCode(String value) {
        this.authorisationCode = value;
    }

    /**
     * authorisationDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorisationDate() {
        return authorisationDate;
    }

    /**
     * authorisationDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorisationDate(String value) {
        this.authorisationDate = value;
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
     * paymentId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * paymentId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentId(String value) {
        this.paymentId = value;
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
     * transactionTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionTime() {
        return transactionTime;
    }

    /**
     * transactionTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionTime(XMLGregorianCalendar value) {
        this.transactionTime = value;
    }

    /**
     * transactionTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTimeZone() {
        return transactionTimeZone;
    }

    /**
     * transactionTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTimeZone(String value) {
        this.transactionTimeZone = value;
    }

    /**
     * ipAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * ipAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * emailID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailID() {
        return emailID;
    }

    /**
     * emailID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailID(String value) {
        this.emailID = value;
    }

    /**
     * billingAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BillingAddressType }
     *     
     */
    public BillingAddressType getBillingAddress() {
        return billingAddress;
    }

    /**
     * billingAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAddressType }
     *     
     */
    public void setBillingAddress(BillingAddressType value) {
        this.billingAddress = value;
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
     * {@link PaymentElementDetailsType }
     * 
     * 
     */
    public List<PaymentElementDetailsType> getPaymentElementType() {
        if (paymentElementType == null) {
            paymentElementType = new ArrayList<PaymentElementDetailsType>();
        }
        return this.paymentElementType;
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
     * threeDSecurityDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ThreeDSecurityDtlsType }
     *     
     */
    public ThreeDSecurityDtlsType getThreeDSecurityDetails() {
        return threeDSecurityDetails;
    }

    /**
     * threeDSecurityDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDSecurityDtlsType }
     *     
     */
    public void setThreeDSecurityDetails(ThreeDSecurityDtlsType value) {
        this.threeDSecurityDetails = value;
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
     *     {@link AdditionalCreditCardInfoType }
     *     
     */
    public AdditionalCreditCardInfoType getAdditionalCreditCardInfo() {
        return additionalCreditCardInfo;
    }

    /**
     * additionalCreditCardInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCreditCardInfoType }
     *     
     */
    public void setAdditionalCreditCardInfo(AdditionalCreditCardInfoType value) {
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

    /**
     * customerId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * customerId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * procReturnCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcReturnCode() {
        return procReturnCode;
    }

    /**
     * procReturnCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcReturnCode(String value) {
        this.procReturnCode = value;
    }

    /**
     * paymentMethod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * paymentMethod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * transactionKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionKey() {
        return transactionKey;
    }

    /**
     * transactionKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionKey(String value) {
        this.transactionKey = value;
    }

    /**
     * requestURL 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestURL() {
        return requestURL;
    }

    /**
     * requestURL 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestURL(String value) {
        this.requestURL = value;
    }

    /**
     * redirectionURL 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectionURL() {
        return redirectionURL;
    }

    /**
     * redirectionURL 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectionURL(String value) {
        this.redirectionURL = value;
    }

    /**
     * gatewayName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayName() {
        return gatewayName;
    }

    /**
     * gatewayName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayName(String value) {
        this.gatewayName = value;
    }

    /**
     * localeCountryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleCountryCode() {
        return localeCountryCode;
    }

    /**
     * localeCountryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleCountryCode(String value) {
        this.localeCountryCode = value;
    }

    /**
     * landingPage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandingPage() {
        return landingPage;
    }

    /**
     * landingPage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandingPage(String value) {
        this.landingPage = value;
    }

    /**
     * isPreAuthorized 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPreAuthorized() {
        return isPreAuthorized;
    }

    /**
     * isPreAuthorized 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPreAuthorized(Boolean value) {
        this.isPreAuthorized = value;
    }

    /**
     * Gets the value of the cartDetailsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartDetailsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCartDetailsType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShopingCartDetailsType }
     * 
     * 
     */
    public List<ShopingCartDetailsType> getCartDetailsType() {
        if (cartDetailsType == null) {
            cartDetailsType = new ArrayList<ShopingCartDetailsType>();
        }
        return this.cartDetailsType;
    }

    /**
     * iban 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * iban 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * bic 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * bic 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * accountHolderName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * accountHolderName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderName(String value) {
        this.accountHolderName = value;
    }

    /**
     * signedDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignedDate() {
        return signedDate;
    }

    /**
     * signedDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignedDate(XMLGregorianCalendar value) {
        this.signedDate = value;
    }

    /**
     * txnTimeInAgentOfficeTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxnTimeInAgentOfficeTimeZone() {
        return txnTimeInAgentOfficeTimeZone;
    }

    /**
     * txnTimeInAgentOfficeTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxnTimeInAgentOfficeTimeZone(XMLGregorianCalendar value) {
        this.txnTimeInAgentOfficeTimeZone = value;
    }

    /**
     * customerProfileId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerProfileId() {
        return customerProfileId;
    }

    /**
     * customerProfileId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerProfileId(String value) {
        this.customerProfileId = value;
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
     * Gets the value of the customFieldList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customFieldList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomFieldList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomFieldListType }
     * 
     * 
     */
    public List<CustomFieldListType> getCustomFieldList() {
        if (customFieldList == null) {
            customFieldList = new ArrayList<CustomFieldListType>();
        }
        return this.customFieldList;
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
     * paymentSystemCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSystemCode() {
        return paymentSystemCode;
    }

    /**
     * paymentSystemCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSystemCode(String value) {
        this.paymentSystemCode = value;
    }

    /**
     * authorizationSequenceNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationSequenceNumber() {
        return authorizationSequenceNumber;
    }

    /**
     * authorizationSequenceNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationSequenceNumber(String value) {
        this.authorizationSequenceNumber = value;
    }

}
