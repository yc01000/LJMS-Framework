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
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BookingChannel" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingChannelKeyType"/&gt;
 *         &lt;element name="ChannelCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorporateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TourOperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AgencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DomesticBudgetCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DomesticBudgetAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeneralComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChainDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyContactDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyContactDetails" minOccurs="0"/&gt;
 *         &lt;element name="AgencyBankDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyBankingDetail" minOccurs="0"/&gt;
 *         &lt;element name="FiscalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegisteredLegalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VATCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxInvoiceDetail" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxInvoiceDetailType" minOccurs="0"/&gt;
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
    "bookingChannel",
    "channelCode",
    "agencyCode",
    "corporateId",
    "tourOperatorCode",
    "agencyName",
    "agencyType",
    "companyType",
    "agencyCategory",
    "licenseNumber",
    "domesticBudgetCurrency",
    "domesticBudgetAmount",
    "generalComments",
    "chainDetails",
    "agencyContactDetails",
    "agencyBankDetails",
    "fiscalCode",
    "parentAgencyCode",
    "registeredLegalName",
    "vatCode",
    "taxInvoiceDetail"
})
@XmlRootElement(name = "CreateAgencyRegistrationRQ")
public class CreateAgencyRegistrationRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "BookingChannel", required = true)
    protected BookingChannelKeyType bookingChannel;
    @XmlElement(name = "ChannelCode")
    protected List<String> channelCode;
    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "CorporateId")
    protected String corporateId;
    @XmlElement(name = "TourOperatorCode")
    protected String tourOperatorCode;
    @XmlElement(name = "AgencyName", required = true)
    protected String agencyName;
    @XmlElement(name = "AgencyType")
    protected String agencyType;
    @XmlElement(name = "CompanyType")
    protected String companyType;
    @XmlElement(name = "AgencyCategory", required = true)
    protected String agencyCategory;
    @XmlElement(name = "LicenseNumber")
    protected String licenseNumber;
    @XmlElement(name = "DomesticBudgetCurrency")
    protected String domesticBudgetCurrency;
    @XmlElement(name = "DomesticBudgetAmount")
    protected String domesticBudgetAmount;
    @XmlElement(name = "GeneralComments")
    protected String generalComments;
    @XmlElement(name = "ChainDetails")
    protected String chainDetails;
    @XmlElement(name = "AgencyContactDetails")
    protected AgencyContactDetails agencyContactDetails;
    @XmlElement(name = "AgencyBankDetails")
    protected AgencyBankingDetail agencyBankDetails;
    @XmlElement(name = "FiscalCode")
    protected String fiscalCode;
    @XmlElement(name = "ParentAgencyCode")
    protected String parentAgencyCode;
    @XmlElement(name = "RegisteredLegalName")
    protected String registeredLegalName;
    @XmlElement(name = "VATCode")
    protected String vatCode;
    @XmlElement(name = "TaxInvoiceDetail")
    protected TaxInvoiceDetailType taxInvoiceDetail;

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
     * bookingChannel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BookingChannelKeyType }
     *     
     */
    public BookingChannelKeyType getBookingChannel() {
        return bookingChannel;
    }

    /**
     * bookingChannel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingChannelKeyType }
     *     
     */
    public void setBookingChannel(BookingChannelKeyType value) {
        this.bookingChannel = value;
    }

    /**
     * Gets the value of the channelCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChannelCode() {
        if (channelCode == null) {
            channelCode = new ArrayList<String>();
        }
        return this.channelCode;
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
     * corporateId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateId() {
        return corporateId;
    }

    /**
     * corporateId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateId(String value) {
        this.corporateId = value;
    }

    /**
     * tourOperatorCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorCode() {
        return tourOperatorCode;
    }

    /**
     * tourOperatorCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorCode(String value) {
        this.tourOperatorCode = value;
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
     * companyType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * companyType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyType(String value) {
        this.companyType = value;
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
     * licenseNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * licenseNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * domesticBudgetCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticBudgetCurrency() {
        return domesticBudgetCurrency;
    }

    /**
     * domesticBudgetCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticBudgetCurrency(String value) {
        this.domesticBudgetCurrency = value;
    }

    /**
     * domesticBudgetAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticBudgetAmount() {
        return domesticBudgetAmount;
    }

    /**
     * domesticBudgetAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticBudgetAmount(String value) {
        this.domesticBudgetAmount = value;
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
     * chainDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainDetails() {
        return chainDetails;
    }

    /**
     * chainDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainDetails(String value) {
        this.chainDetails = value;
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
     * agencyBankDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AgencyBankingDetail }
     *     
     */
    public AgencyBankingDetail getAgencyBankDetails() {
        return agencyBankDetails;
    }

    /**
     * agencyBankDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyBankingDetail }
     *     
     */
    public void setAgencyBankDetails(AgencyBankingDetail value) {
        this.agencyBankDetails = value;
    }

    /**
     * fiscalCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalCode() {
        return fiscalCode;
    }

    /**
     * fiscalCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalCode(String value) {
        this.fiscalCode = value;
    }

    /**
     * parentAgencyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAgencyCode() {
        return parentAgencyCode;
    }

    /**
     * parentAgencyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAgencyCode(String value) {
        this.parentAgencyCode = value;
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
     * vatCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATCode() {
        return vatCode;
    }

    /**
     * vatCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATCode(String value) {
        this.vatCode = value;
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

}
