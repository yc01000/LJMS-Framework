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
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorporateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TourOperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternetLoginPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternetCreditUsagePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyContactDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyContactDetails" minOccurs="0"/&gt;
 *         &lt;element name="AgencyBankDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyBankingDetail" minOccurs="0"/&gt;
 *         &lt;element name="BusinessRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportingOffice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "agencyCode",
    "corporateId",
    "tourOperatorCode",
    "internetLoginPassword",
    "internetCreditUsagePassword",
    "agencyContactDetails",
    "agencyBankDetails",
    "businessRegistrationNumber",
    "reportingOffice",
    "taxInvoiceDetail"
})
@XmlRootElement(name = "ModifyAgencyProfileRQ")
public class ModifyAgencyProfileRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "BookingChannel", required = true)
    protected BookingChannelKeyType bookingChannel;
    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "CorporateId")
    protected String corporateId;
    @XmlElement(name = "TourOperatorCode")
    protected String tourOperatorCode;
    @XmlElement(name = "InternetLoginPassword")
    protected String internetLoginPassword;
    @XmlElement(name = "InternetCreditUsagePassword")
    protected String internetCreditUsagePassword;
    @XmlElement(name = "AgencyContactDetails")
    protected AgencyContactDetails agencyContactDetails;
    @XmlElement(name = "AgencyBankDetails")
    protected AgencyBankingDetail agencyBankDetails;
    @XmlElement(name = "BusinessRegistrationNumber")
    protected String businessRegistrationNumber;
    @XmlElement(name = "ReportingOffice", required = true)
    protected String reportingOffice;
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
