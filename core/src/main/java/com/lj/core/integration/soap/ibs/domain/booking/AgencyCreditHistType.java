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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>AgencyCreditHistType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AgencyCreditHistType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsCreditAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CreditType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsCommAddedToAvlCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CreditLimit" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType" minOccurs="0"/&gt;
 *         &lt;element name="AvailableCredit" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType" minOccurs="0"/&gt;
 *         &lt;element name="UsedCredit" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType" minOccurs="0"/&gt;
 *         &lt;element name="IsNegCreditAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxNegCreditAllowed" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType" minOccurs="0"/&gt;
 *         &lt;element name="TransactionAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceInitiator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DutyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgencyCreditHistType", propOrder = {
    "agencyCode",
    "agencyName",
    "isCreditAllowed",
    "creditType",
    "isCommAddedToAvlCredit",
    "creditLimit",
    "availableCredit",
    "usedCredit",
    "isNegCreditAllowed",
    "maxNegCreditAllowed",
    "transactionAmount",
    "serviceInitiator",
    "trackingNumber",
    "action",
    "userID",
    "dutyCode",
    "officeCode",
    "lastModifiedDate"
})
public class AgencyCreditHistType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "AgencyName")
    protected String agencyName;
    @XmlElement(name = "IsCreditAllowed")
    protected Boolean isCreditAllowed;
    @XmlElement(name = "CreditType")
    protected String creditType;
    @XmlElement(name = "IsCommAddedToAvlCredit")
    protected Boolean isCommAddedToAvlCredit;
    @XmlElement(name = "CreditLimit")
    protected CurrencyAmountType creditLimit;
    @XmlElement(name = "AvailableCredit")
    protected CurrencyAmountType availableCredit;
    @XmlElement(name = "UsedCredit")
    protected CurrencyAmountType usedCredit;
    @XmlElement(name = "IsNegCreditAllowed")
    protected Boolean isNegCreditAllowed;
    @XmlElement(name = "MaxNegCreditAllowed")
    protected CurrencyAmountType maxNegCreditAllowed;
    @XmlElement(name = "TransactionAmount")
    protected CurrencyAmountType transactionAmount;
    @XmlElement(name = "ServiceInitiator")
    protected String serviceInitiator;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "Action")
    protected String action;
    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "DutyCode")
    protected String dutyCode;
    @XmlElement(name = "OfficeCode")
    protected String officeCode;
    @XmlElement(name = "LastModifiedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;

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
     * agencyName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * agencyName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyName(String value) {
        this.agencyName = value;
    }

    /**
     * isCreditAllowed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCreditAllowed() {
        return isCreditAllowed;
    }

    /**
     * isCreditAllowed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCreditAllowed(Boolean value) {
        this.isCreditAllowed = value;
    }

    /**
     * creditType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditType() {
        return creditType;
    }

    /**
     * creditType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditType(String value) {
        this.creditType = value;
    }

    /**
     * isCommAddedToAvlCredit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCommAddedToAvlCredit() {
        return isCommAddedToAvlCredit;
    }

    /**
     * isCommAddedToAvlCredit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCommAddedToAvlCredit(Boolean value) {
        this.isCommAddedToAvlCredit = value;
    }

    /**
     * creditLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getCreditLimit() {
        return creditLimit;
    }

    /**
     * creditLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setCreditLimit(CurrencyAmountType value) {
        this.creditLimit = value;
    }

    /**
     * availableCredit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getAvailableCredit() {
        return availableCredit;
    }

    /**
     * availableCredit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setAvailableCredit(CurrencyAmountType value) {
        this.availableCredit = value;
    }

    /**
     * usedCredit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getUsedCredit() {
        return usedCredit;
    }

    /**
     * usedCredit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setUsedCredit(CurrencyAmountType value) {
        this.usedCredit = value;
    }

    /**
     * isNegCreditAllowed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNegCreditAllowed() {
        return isNegCreditAllowed;
    }

    /**
     * isNegCreditAllowed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNegCreditAllowed(Boolean value) {
        this.isNegCreditAllowed = value;
    }

    /**
     * maxNegCreditAllowed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getMaxNegCreditAllowed() {
        return maxNegCreditAllowed;
    }

    /**
     * maxNegCreditAllowed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setMaxNegCreditAllowed(CurrencyAmountType value) {
        this.maxNegCreditAllowed = value;
    }

    /**
     * transactionAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * transactionAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setTransactionAmount(CurrencyAmountType value) {
        this.transactionAmount = value;
    }

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
     * trackingNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * trackingNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * action 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * action 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * userID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * userID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * dutyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyCode() {
        return dutyCode;
    }

    /**
     * dutyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyCode(String value) {
        this.dutyCode = value;
    }

    /**
     * officeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeCode() {
        return officeCode;
    }

    /**
     * officeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeCode(String value) {
        this.officeCode = value;
    }

    /**
     * lastModifiedDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * lastModifiedDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

}
