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
 * <p>CustomerLoyaltyDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerLoyaltyDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecurityQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecurityAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActivationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PromoTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyReferer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FlightFrequencyDomestic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FlightFrequencyInternational" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NoOfTripsDomestic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NoOfTripsInternational" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MostCommonDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InterestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}InterestDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CreditPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountLockStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}AccountLockStatus" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActivateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="UpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastLoginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LoginCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LoginFailCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AllowMarketing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowSurvey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AustralianTaxResident" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoginPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerLoyaltyDetails", propOrder = {
    "pin",
    "securityQuestion",
    "securityAnswer",
    "currencyCode",
    "activationCode",
    "statementType",
    "promoTrackingNumber",
    "loyaltyReferer",
    "flightFrequencyDomestic",
    "flightFrequencyInternational",
    "noOfTripsDomestic",
    "noOfTripsInternational",
    "mostCommonDestination",
    "interestDetails",
    "creditPassword",
    "accountLockStatus",
    "createDate",
    "activateDate",
    "updateDate",
    "lastLoginDate",
    "loginCount",
    "loginFailCount",
    "allowMarketing",
    "allowSurvey",
    "australianTaxResident",
    "loginPassword",
    "countryOfResidence"
})
public class CustomerLoyaltyDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PIN")
    protected String pin;
    @XmlElement(name = "SecurityQuestion")
    protected String securityQuestion;
    @XmlElement(name = "SecurityAnswer")
    protected String securityAnswer;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "ActivationCode")
    protected String activationCode;
    @XmlElement(name = "StatementType")
    protected String statementType;
    @XmlElement(name = "PromoTrackingNumber")
    protected String promoTrackingNumber;
    @XmlElement(name = "LoyaltyReferer")
    protected String loyaltyReferer;
    @XmlElement(name = "FlightFrequencyDomestic")
    protected Integer flightFrequencyDomestic;
    @XmlElement(name = "FlightFrequencyInternational")
    protected Integer flightFrequencyInternational;
    @XmlElement(name = "NoOfTripsDomestic")
    protected Integer noOfTripsDomestic;
    @XmlElement(name = "NoOfTripsInternational")
    protected Integer noOfTripsInternational;
    @XmlElement(name = "MostCommonDestination")
    protected String mostCommonDestination;
    @XmlElement(name = "InterestDetails")
    protected List<InterestDetails> interestDetails;
    @XmlElement(name = "CreditPassword")
    protected String creditPassword;
    @XmlElement(name = "AccountLockStatus")
    @XmlSchemaType(name = "string")
    protected AccountLockStatus accountLockStatus;
    @XmlElement(name = "CreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "ActivateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activateDate;
    @XmlElement(name = "UpdateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    @XmlElement(name = "LastLoginDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLoginDate;
    @XmlElement(name = "LoginCount")
    protected Integer loginCount;
    @XmlElement(name = "LoginFailCount")
    protected Integer loginFailCount;
    @XmlElement(name = "AllowMarketing")
    protected Boolean allowMarketing;
    @XmlElement(name = "AllowSurvey")
    protected Boolean allowSurvey;
    @XmlElement(name = "AustralianTaxResident")
    protected Boolean australianTaxResident;
    @XmlElement(name = "LoginPassword")
    protected String loginPassword;
    @XmlElement(name = "CountryOfResidence")
    protected String countryOfResidence;

    /**
     * pin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * pin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

    /**
     * securityQuestion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityQuestion() {
        return securityQuestion;
    }

    /**
     * securityQuestion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityQuestion(String value) {
        this.securityQuestion = value;
    }

    /**
     * securityAnswer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityAnswer() {
        return securityAnswer;
    }

    /**
     * securityAnswer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityAnswer(String value) {
        this.securityAnswer = value;
    }

    /**
     * currencyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * currencyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * activationCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationCode() {
        return activationCode;
    }

    /**
     * activationCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationCode(String value) {
        this.activationCode = value;
    }

    /**
     * statementType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementType() {
        return statementType;
    }

    /**
     * statementType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementType(String value) {
        this.statementType = value;
    }

    /**
     * promoTrackingNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoTrackingNumber() {
        return promoTrackingNumber;
    }

    /**
     * promoTrackingNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoTrackingNumber(String value) {
        this.promoTrackingNumber = value;
    }

    /**
     * loyaltyReferer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyReferer() {
        return loyaltyReferer;
    }

    /**
     * loyaltyReferer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyReferer(String value) {
        this.loyaltyReferer = value;
    }

    /**
     * flightFrequencyDomestic 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightFrequencyDomestic() {
        return flightFrequencyDomestic;
    }

    /**
     * flightFrequencyDomestic 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightFrequencyDomestic(Integer value) {
        this.flightFrequencyDomestic = value;
    }

    /**
     * flightFrequencyInternational 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightFrequencyInternational() {
        return flightFrequencyInternational;
    }

    /**
     * flightFrequencyInternational 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightFrequencyInternational(Integer value) {
        this.flightFrequencyInternational = value;
    }

    /**
     * noOfTripsDomestic 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfTripsDomestic() {
        return noOfTripsDomestic;
    }

    /**
     * noOfTripsDomestic 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfTripsDomestic(Integer value) {
        this.noOfTripsDomestic = value;
    }

    /**
     * noOfTripsInternational 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfTripsInternational() {
        return noOfTripsInternational;
    }

    /**
     * noOfTripsInternational 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfTripsInternational(Integer value) {
        this.noOfTripsInternational = value;
    }

    /**
     * mostCommonDestination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMostCommonDestination() {
        return mostCommonDestination;
    }

    /**
     * mostCommonDestination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMostCommonDestination(String value) {
        this.mostCommonDestination = value;
    }

    /**
     * Gets the value of the interestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestDetails }
     * 
     * 
     */
    public List<InterestDetails> getInterestDetails() {
        if (interestDetails == null) {
            interestDetails = new ArrayList<InterestDetails>();
        }
        return this.interestDetails;
    }

    /**
     * creditPassword 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditPassword() {
        return creditPassword;
    }

    /**
     * creditPassword 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditPassword(String value) {
        this.creditPassword = value;
    }

    /**
     * accountLockStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AccountLockStatus }
     *     
     */
    public AccountLockStatus getAccountLockStatus() {
        return accountLockStatus;
    }

    /**
     * accountLockStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountLockStatus }
     *     
     */
    public void setAccountLockStatus(AccountLockStatus value) {
        this.accountLockStatus = value;
    }

    /**
     * createDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * createDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * activateDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivateDate() {
        return activateDate;
    }

    /**
     * activateDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivateDate(XMLGregorianCalendar value) {
        this.activateDate = value;
    }

    /**
     * updateDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * updateDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * lastLoginDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * lastLoginDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLoginDate(XMLGregorianCalendar value) {
        this.lastLoginDate = value;
    }

    /**
     * loginCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * loginCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoginCount(Integer value) {
        this.loginCount = value;
    }

    /**
     * loginFailCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoginFailCount() {
        return loginFailCount;
    }

    /**
     * loginFailCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoginFailCount(Integer value) {
        this.loginFailCount = value;
    }

    /**
     * allowMarketing 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowMarketing() {
        return allowMarketing;
    }

    /**
     * allowMarketing 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowMarketing(Boolean value) {
        this.allowMarketing = value;
    }

    /**
     * allowSurvey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowSurvey() {
        return allowSurvey;
    }

    /**
     * allowSurvey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowSurvey(Boolean value) {
        this.allowSurvey = value;
    }

    /**
     * australianTaxResident 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAustralianTaxResident() {
        return australianTaxResident;
    }

    /**
     * australianTaxResident 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAustralianTaxResident(Boolean value) {
        this.australianTaxResident = value;
    }

    /**
     * loginPassword 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * loginPassword 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginPassword(String value) {
        this.loginPassword = value;
    }

    /**
     * countryOfResidence 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    /**
     * countryOfResidence 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfResidence(String value) {
        this.countryOfResidence = value;
    }

}
