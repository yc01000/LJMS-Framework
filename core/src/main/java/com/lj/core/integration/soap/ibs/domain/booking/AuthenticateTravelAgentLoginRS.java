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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DutyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgentFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgentLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportingOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableCredit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CreditCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgentContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgentAddress" minOccurs="0"/&gt;
 *         &lt;element name="AgencyContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}Address" minOccurs="0"/&gt;
 *         &lt;element name="IsLoginPwdSysGenerated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsCreditPwdSysGenerated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsLoginPwdNotifyPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DaysToExpireLoginPwd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsCreditPwdNotifyPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DaysToExpireCreditPwd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsServiceFeeEligible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ServiceFeeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyServiceFeeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyRegionalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsCreditAllowedForAgency" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="QueueNodeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}QueueNodeDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CorporateDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CorporateDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
 *         &lt;element name="SubAgencyCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airlineCode",
    "sessionId",
    "dutyCode",
    "agentFirstName",
    "agentLastName",
    "description",
    "reportingOffice",
    "agencyCode",
    "agencyType",
    "availableCredit",
    "creditCurrency",
    "agentContact",
    "agencyContact",
    "isLoginPwdSysGenerated",
    "isCreditPwdSysGenerated",
    "isLoginPwdNotifyPeriod",
    "daysToExpireLoginPwd",
    "isCreditPwdNotifyPeriod",
    "daysToExpireCreditPwd",
    "isServiceFeeEligible",
    "serviceFeeDetails",
    "agencyName",
    "agencyRegionalName",
    "taxRegistrationNumber",
    "isCreditAllowedForAgency",
    "queueNodeDetails",
    "corporateDetails",
    "errorType",
    "subAgencyCodes"
})
@XmlRootElement(name = "AuthenticateTravelAgentLoginRS")
public class AuthenticateTravelAgentLoginRS
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode")
    protected String airlineCode;
    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "DutyCode")
    protected String dutyCode;
    @XmlElement(name = "AgentFirstName")
    protected String agentFirstName;
    @XmlElement(name = "AgentLastName")
    protected String agentLastName;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ReportingOffice")
    protected String reportingOffice;
    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "AgencyType")
    protected String agencyType;
    @XmlElement(name = "AvailableCredit")
    protected Double availableCredit;
    @XmlElement(name = "CreditCurrency")
    protected String creditCurrency;
    @XmlElement(name = "AgentContact")
    protected AgentAddress agentContact;
    @XmlElement(name = "AgencyContact")
    protected Address agencyContact;
    @XmlElement(name = "IsLoginPwdSysGenerated")
    protected boolean isLoginPwdSysGenerated;
    @XmlElement(name = "IsCreditPwdSysGenerated")
    protected boolean isCreditPwdSysGenerated;
    @XmlElement(name = "IsLoginPwdNotifyPeriod")
    protected boolean isLoginPwdNotifyPeriod;
    @XmlElement(name = "DaysToExpireLoginPwd")
    protected Integer daysToExpireLoginPwd;
    @XmlElement(name = "IsCreditPwdNotifyPeriod")
    protected boolean isCreditPwdNotifyPeriod;
    @XmlElement(name = "DaysToExpireCreditPwd")
    protected Integer daysToExpireCreditPwd;
    @XmlElement(name = "IsServiceFeeEligible")
    protected boolean isServiceFeeEligible;
    @XmlElement(name = "ServiceFeeDetails")
    protected List<AgencyServiceFeeDetails> serviceFeeDetails;
    @XmlElement(name = "AgencyName")
    protected String agencyName;
    @XmlElement(name = "AgencyRegionalName")
    protected String agencyRegionalName;
    @XmlElement(name = "TaxRegistrationNumber")
    protected String taxRegistrationNumber;
    @XmlElement(name = "IsCreditAllowedForAgency")
    protected boolean isCreditAllowedForAgency;
    @XmlElement(name = "QueueNodeDetails")
    protected List<QueueNodeDetailsType> queueNodeDetails;
    @XmlElement(name = "CorporateDetails")
    protected List<CorporateDetailsType> corporateDetails;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;
    @XmlElement(name = "SubAgencyCodes")
    protected List<String> subAgencyCodes;

    /**
     * airlineCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * airlineCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * sessionId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * sessionId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
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
     * agentFirstName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentFirstName() {
        return agentFirstName;
    }

    /**
     * agentFirstName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentFirstName(String value) {
        this.agentFirstName = value;
    }

    /**
     * agentLastName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentLastName() {
        return agentLastName;
    }

    /**
     * agentLastName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentLastName(String value) {
        this.agentLastName = value;
    }

    /**
     * description 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * description 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * reportingOffice 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingOffice() {
        return reportingOffice;
    }

    /**
     * reportingOffice 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingOffice(String value) {
        this.reportingOffice = value;
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
     * agencyType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyType() {
        return agencyType;
    }

    /**
     * agencyType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyType(String value) {
        this.agencyType = value;
    }

    /**
     * availableCredit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvailableCredit() {
        return availableCredit;
    }

    /**
     * availableCredit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvailableCredit(Double value) {
        this.availableCredit = value;
    }

    /**
     * creditCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCurrency() {
        return creditCurrency;
    }

    /**
     * creditCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCurrency(String value) {
        this.creditCurrency = value;
    }

    /**
     * agentContact 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AgentAddress }
     *     
     */
    public AgentAddress getAgentContact() {
        return agentContact;
    }

    /**
     * agentContact 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentAddress }
     *     
     */
    public void setAgentContact(AgentAddress value) {
        this.agentContact = value;
    }

    /**
     * agencyContact 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAgencyContact() {
        return agencyContact;
    }

    /**
     * agencyContact 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAgencyContact(Address value) {
        this.agencyContact = value;
    }

    /**
     * isLoginPwdSysGenerated 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsLoginPwdSysGenerated() {
        return isLoginPwdSysGenerated;
    }

    /**
     * isLoginPwdSysGenerated 속성의 값을 설정합니다.
     * 
     */
    public void setIsLoginPwdSysGenerated(boolean value) {
        this.isLoginPwdSysGenerated = value;
    }

    /**
     * isCreditPwdSysGenerated 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsCreditPwdSysGenerated() {
        return isCreditPwdSysGenerated;
    }

    /**
     * isCreditPwdSysGenerated 속성의 값을 설정합니다.
     * 
     */
    public void setIsCreditPwdSysGenerated(boolean value) {
        this.isCreditPwdSysGenerated = value;
    }

    /**
     * isLoginPwdNotifyPeriod 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsLoginPwdNotifyPeriod() {
        return isLoginPwdNotifyPeriod;
    }

    /**
     * isLoginPwdNotifyPeriod 속성의 값을 설정합니다.
     * 
     */
    public void setIsLoginPwdNotifyPeriod(boolean value) {
        this.isLoginPwdNotifyPeriod = value;
    }

    /**
     * daysToExpireLoginPwd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysToExpireLoginPwd() {
        return daysToExpireLoginPwd;
    }

    /**
     * daysToExpireLoginPwd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysToExpireLoginPwd(Integer value) {
        this.daysToExpireLoginPwd = value;
    }

    /**
     * isCreditPwdNotifyPeriod 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsCreditPwdNotifyPeriod() {
        return isCreditPwdNotifyPeriod;
    }

    /**
     * isCreditPwdNotifyPeriod 속성의 값을 설정합니다.
     * 
     */
    public void setIsCreditPwdNotifyPeriod(boolean value) {
        this.isCreditPwdNotifyPeriod = value;
    }

    /**
     * daysToExpireCreditPwd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysToExpireCreditPwd() {
        return daysToExpireCreditPwd;
    }

    /**
     * daysToExpireCreditPwd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysToExpireCreditPwd(Integer value) {
        this.daysToExpireCreditPwd = value;
    }

    /**
     * isServiceFeeEligible 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsServiceFeeEligible() {
        return isServiceFeeEligible;
    }

    /**
     * isServiceFeeEligible 속성의 값을 설정합니다.
     * 
     */
    public void setIsServiceFeeEligible(boolean value) {
        this.isServiceFeeEligible = value;
    }

    /**
     * Gets the value of the serviceFeeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgencyServiceFeeDetails }
     * 
     * 
     */
    public List<AgencyServiceFeeDetails> getServiceFeeDetails() {
        if (serviceFeeDetails == null) {
            serviceFeeDetails = new ArrayList<AgencyServiceFeeDetails>();
        }
        return this.serviceFeeDetails;
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
     * agencyRegionalName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyRegionalName() {
        return agencyRegionalName;
    }

    /**
     * agencyRegionalName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyRegionalName(String value) {
        this.agencyRegionalName = value;
    }

    /**
     * taxRegistrationNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }

    /**
     * taxRegistrationNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegistrationNumber(String value) {
        this.taxRegistrationNumber = value;
    }

    /**
     * isCreditAllowedForAgency 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsCreditAllowedForAgency() {
        return isCreditAllowedForAgency;
    }

    /**
     * isCreditAllowedForAgency 속성의 값을 설정합니다.
     * 
     */
    public void setIsCreditAllowedForAgency(boolean value) {
        this.isCreditAllowedForAgency = value;
    }

    /**
     * Gets the value of the queueNodeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queueNodeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueueNodeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueueNodeDetailsType }
     * 
     * 
     */
    public List<QueueNodeDetailsType> getQueueNodeDetails() {
        if (queueNodeDetails == null) {
            queueNodeDetails = new ArrayList<QueueNodeDetailsType>();
        }
        return this.queueNodeDetails;
    }

    /**
     * Gets the value of the corporateDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corporateDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorporateDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateDetailsType }
     * 
     * 
     */
    public List<CorporateDetailsType> getCorporateDetails() {
        if (corporateDetails == null) {
            corporateDetails = new ArrayList<CorporateDetailsType>();
        }
        return this.corporateDetails;
    }

    /**
     * errorType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getErrorType() {
        return errorType;
    }

    /**
     * errorType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setErrorType(ErrorType value) {
        this.errorType = value;
    }

    /**
     * Gets the value of the subAgencyCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subAgencyCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubAgencyCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubAgencyCodes() {
        if (subAgencyCodes == null) {
            subAgencyCodes = new ArrayList<String>();
        }
        return this.subAgencyCodes;
    }

}
