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
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportingOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegisteredLegalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyRegionalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternetLoginPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternetCreditUsagePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyContactDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyContactDetails" minOccurs="0"/&gt;
 *         &lt;element name="AgencyCreditDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyCreditDetails" minOccurs="0"/&gt;
 *         &lt;element name="AgencyCommissionDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyCommissionDetails" minOccurs="0"/&gt;
 *         &lt;element name="AgencyBankingDetail" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyBankingDetail" minOccurs="0"/&gt;
 *         &lt;element name="BusinessRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corporateCardDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CorporateCardDetails" minOccurs="0"/&gt;
 *         &lt;element name="GeneralComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxInvoiceDetail" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxInvoiceDetailType" minOccurs="0"/&gt;
 *         &lt;element name="BookingChannelCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AgentDutyCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
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
    "agencyCode",
    "agencyName",
    "agencyCategory",
    "agencyType",
    "reportingOffice",
    "registeredLegalName",
    "status",
    "agencyRegionalName",
    "internetLoginPassword",
    "internetCreditUsagePassword",
    "agencyContactDetails",
    "agencyCreditDetails",
    "agencyCommissionDetails",
    "agencyBankingDetail",
    "businessRegistrationNumber",
    "corporateCardDetails",
    "generalComments",
    "taxInvoiceDetail",
    "bookingChannelCodes",
    "agentDutyCodes",
    "errorType"
})
@XmlRootElement(name = "ViewAgencyProfileRS")
public class ViewAgencyProfileRS
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "AgencyName")
    protected String agencyName;
    @XmlElement(name = "AgencyCategory")
    protected String agencyCategory;
    @XmlElement(name = "AgencyType")
    protected String agencyType;
    @XmlElement(name = "ReportingOffice")
    protected String reportingOffice;
    @XmlElement(name = "RegisteredLegalName")
    protected String registeredLegalName;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "AgencyRegionalName")
    protected String agencyRegionalName;
    @XmlElement(name = "InternetLoginPassword")
    protected String internetLoginPassword;
    @XmlElement(name = "InternetCreditUsagePassword")
    protected String internetCreditUsagePassword;
    @XmlElement(name = "AgencyContactDetails")
    protected AgencyContactDetails agencyContactDetails;
    @XmlElement(name = "AgencyCreditDetails")
    protected AgencyCreditDetails agencyCreditDetails;
    @XmlElement(name = "AgencyCommissionDetails")
    protected AgencyCommissionDetails agencyCommissionDetails;
    @XmlElement(name = "AgencyBankingDetail")
    protected AgencyBankingDetail agencyBankingDetail;
    @XmlElement(name = "BusinessRegistrationNumber")
    protected String businessRegistrationNumber;
    protected CorporateCardDetails corporateCardDetails;
    @XmlElement(name = "GeneralComments")
    protected String generalComments;
    @XmlElement(name = "TaxInvoiceDetail")
    protected TaxInvoiceDetailType taxInvoiceDetail;
    @XmlElement(name = "BookingChannelCodes")
    protected List<String> bookingChannelCodes;
    @XmlElement(name = "AgentDutyCodes")
    protected List<String> agentDutyCodes;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;

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
     * agencyCategory 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCategory() {
        return agencyCategory;
    }

    /**
     * agencyCategory 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCategory(String value) {
        this.agencyCategory = value;
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
     * registeredLegalName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredLegalName() {
        return registeredLegalName;
    }

    /**
     * registeredLegalName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredLegalName(String value) {
        this.registeredLegalName = value;
    }

    /**
     * status 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * status 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * internetLoginPassword 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetLoginPassword() {
        return internetLoginPassword;
    }

    /**
     * internetLoginPassword 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetLoginPassword(String value) {
        this.internetLoginPassword = value;
    }

    /**
     * internetCreditUsagePassword 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetCreditUsagePassword() {
        return internetCreditUsagePassword;
    }

    /**
     * internetCreditUsagePassword 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetCreditUsagePassword(String value) {
        this.internetCreditUsagePassword = value;
    }

    /**
     * agencyContactDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AgencyContactDetails }
     *     
     */
    public AgencyContactDetails getAgencyContactDetails() {
        return agencyContactDetails;
    }

    /**
     * agencyContactDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyContactDetails }
     *     
     */
    public void setAgencyContactDetails(AgencyContactDetails value) {
        this.agencyContactDetails = value;
    }

    /**
     * agencyCreditDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AgencyCreditDetails }
     *     
     */
    public AgencyCreditDetails getAgencyCreditDetails() {
        return agencyCreditDetails;
    }

    /**
     * agencyCreditDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyCreditDetails }
     *     
     */
    public void setAgencyCreditDetails(AgencyCreditDetails value) {
        this.agencyCreditDetails = value;
    }

    /**
     * agencyCommissionDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AgencyCommissionDetails }
     *     
     */
    public AgencyCommissionDetails getAgencyCommissionDetails() {
        return agencyCommissionDetails;
    }

    /**
     * agencyCommissionDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyCommissionDetails }
     *     
     */
    public void setAgencyCommissionDetails(AgencyCommissionDetails value) {
        this.agencyCommissionDetails = value;
    }

    /**
     * agencyBankingDetail 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AgencyBankingDetail }
     *     
     */
    public AgencyBankingDetail getAgencyBankingDetail() {
        return agencyBankingDetail;
    }

    /**
     * agencyBankingDetail 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyBankingDetail }
     *     
     */
    public void setAgencyBankingDetail(AgencyBankingDetail value) {
        this.agencyBankingDetail = value;
    }

    /**
     * businessRegistrationNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessRegistrationNumber() {
        return businessRegistrationNumber;
    }

    /**
     * businessRegistrationNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessRegistrationNumber(String value) {
        this.businessRegistrationNumber = value;
    }

    /**
     * corporateCardDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CorporateCardDetails }
     *     
     */
    public CorporateCardDetails getCorporateCardDetails() {
        return corporateCardDetails;
    }

    /**
     * corporateCardDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateCardDetails }
     *     
     */
    public void setCorporateCardDetails(CorporateCardDetails value) {
        this.corporateCardDetails = value;
    }

    /**
     * generalComments 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralComments() {
        return generalComments;
    }

    /**
     * generalComments 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralComments(String value) {
        this.generalComments = value;
    }

    /**
     * taxInvoiceDetail 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TaxInvoiceDetailType }
     *     
     */
    public TaxInvoiceDetailType getTaxInvoiceDetail() {
        return taxInvoiceDetail;
    }

    /**
     * taxInvoiceDetail 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInvoiceDetailType }
     *     
     */
    public void setTaxInvoiceDetail(TaxInvoiceDetailType value) {
        this.taxInvoiceDetail = value;
    }

    /**
     * Gets the value of the bookingChannelCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingChannelCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingChannelCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBookingChannelCodes() {
        if (bookingChannelCodes == null) {
            bookingChannelCodes = new ArrayList<String>();
        }
        return this.bookingChannelCodes;
    }

    /**
     * Gets the value of the agentDutyCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentDutyCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentDutyCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAgentDutyCodes() {
        if (agentDutyCodes == null) {
            agentDutyCodes = new ArrayList<String>();
        }
        return this.agentDutyCodes;
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

}
