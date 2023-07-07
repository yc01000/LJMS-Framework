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
 * <p>PNR complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PNR"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CreationDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CreationDateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastModifiedDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="LastModfiedDateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OriginalCaller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnrStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PnrType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsInterline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlatingCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnrDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="PnrSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AmountPaid" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrPayment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmountToBePaid" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrPayment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EncodedAmountToBeShown" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrPaymentEncoded" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalAgentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentAgentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportingOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorporateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TourOperatorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPnrUnpaid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalBookingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PointOfOriginCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pnrOnHoldIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExternalRecordLocatorDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ExternalRecordLocatorDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DisplayCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PointOfSale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PricingModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FarePaidStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}FarePaidStatusType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNR", propOrder = {
    "pnrNumber",
    "creationDateAndTime",
    "creationDateTimeZone",
    "lastModifiedDateAndTime",
    "lastModfiedDateTimeZone",
    "originalCaller",
    "pnrStatus",
    "pnrType",
    "isInterline",
    "platingCarrierCode",
    "pnrDetails",
    "pnrSessionId",
    "amountPaid",
    "totalAmountToBePaid",
    "encodedAmountToBeShown",
    "agencyCode",
    "originalAgentID",
    "currentAgentID",
    "reportingOffice",
    "corporateId",
    "tourOperatorNumber",
    "isPnrUnpaid",
    "tourCode",
    "externalBookingNumber",
    "pointOfOriginCurrency",
    "pnrOnHoldIndicator",
    "externalRecordLocatorDetails",
    "displayCurrency",
    "pointOfSale",
    "pricingModel",
    "farePaidStatus"
})
public class PNR
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PnrNumber", required = true)
    protected String pnrNumber;
    @XmlElement(name = "CreationDateAndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateAndTime;
    @XmlElement(name = "CreationDateTimeZone", required = true)
    protected String creationDateTimeZone;
    @XmlElement(name = "LastModifiedDateAndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDateAndTime;
    @XmlElement(name = "LastModfiedDateTimeZone", required = true)
    protected String lastModfiedDateTimeZone;
    @XmlElement(name = "OriginalCaller")
    protected String originalCaller;
    @XmlElement(name = "PnrStatus", required = true)
    protected String pnrStatus;
    @XmlElement(name = "PnrType", required = true)
    protected String pnrType;
    @XmlElement(name = "IsInterline")
    protected Boolean isInterline;
    @XmlElement(name = "PlatingCarrierCode")
    protected String platingCarrierCode;
    @XmlElement(name = "PnrDetails")
    protected PNRDetailsType pnrDetails;
    @XmlElement(name = "PnrSessionId")
    protected String pnrSessionId;
    @XmlElement(name = "AmountPaid")
    protected List<PnrPayment> amountPaid;
    @XmlElement(name = "TotalAmountToBePaid")
    protected List<PnrPayment> totalAmountToBePaid;
    @XmlElement(name = "EncodedAmountToBeShown")
    protected List<PnrPaymentEncoded> encodedAmountToBeShown;
    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "OriginalAgentID")
    protected String originalAgentID;
    @XmlElement(name = "CurrentAgentID")
    protected String currentAgentID;
    @XmlElement(name = "ReportingOffice")
    protected String reportingOffice;
    @XmlElement(name = "CorporateId")
    protected String corporateId;
    @XmlElement(name = "TourOperatorNumber")
    protected String tourOperatorNumber;
    protected Boolean isPnrUnpaid;
    @XmlElement(name = "TourCode")
    protected String tourCode;
    @XmlElement(name = "ExternalBookingNumber")
    protected String externalBookingNumber;
    @XmlElement(name = "PointOfOriginCurrency")
    protected String pointOfOriginCurrency;
    protected Boolean pnrOnHoldIndicator;
    @XmlElement(name = "ExternalRecordLocatorDetails")
    protected List<ExternalRecordLocatorDetails> externalRecordLocatorDetails;
    @XmlElement(name = "DisplayCurrency")
    protected String displayCurrency;
    @XmlElement(name = "PointOfSale")
    protected String pointOfSale;
    @XmlElement(name = "PricingModel")
    protected String pricingModel;
    @XmlElement(name = "FarePaidStatus")
    @XmlSchemaType(name = "string")
    protected FarePaidStatusType farePaidStatus;

    /**
     * pnrNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrNumber() {
        return pnrNumber;
    }

    /**
     * pnrNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrNumber(String value) {
        this.pnrNumber = value;
    }

    /**
     * creationDateAndTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateAndTime() {
        return creationDateAndTime;
    }

    /**
     * creationDateAndTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateAndTime(XMLGregorianCalendar value) {
        this.creationDateAndTime = value;
    }

    /**
     * creationDateTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDateTimeZone() {
        return creationDateTimeZone;
    }

    /**
     * creationDateTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateTimeZone(String value) {
        this.creationDateTimeZone = value;
    }

    /**
     * lastModifiedDateAndTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDateAndTime() {
        return lastModifiedDateAndTime;
    }

    /**
     * lastModifiedDateAndTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDateAndTime(XMLGregorianCalendar value) {
        this.lastModifiedDateAndTime = value;
    }

    /**
     * lastModfiedDateTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModfiedDateTimeZone() {
        return lastModfiedDateTimeZone;
    }

    /**
     * lastModfiedDateTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModfiedDateTimeZone(String value) {
        this.lastModfiedDateTimeZone = value;
    }

    /**
     * originalCaller 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalCaller() {
        return originalCaller;
    }

    /**
     * originalCaller 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalCaller(String value) {
        this.originalCaller = value;
    }

    /**
     * pnrStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrStatus() {
        return pnrStatus;
    }

    /**
     * pnrStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrStatus(String value) {
        this.pnrStatus = value;
    }

    /**
     * pnrType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrType() {
        return pnrType;
    }

    /**
     * pnrType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrType(String value) {
        this.pnrType = value;
    }

    /**
     * isInterline 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInterline() {
        return isInterline;
    }

    /**
     * isInterline 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInterline(Boolean value) {
        this.isInterline = value;
    }

    /**
     * platingCarrierCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatingCarrierCode() {
        return platingCarrierCode;
    }

    /**
     * platingCarrierCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatingCarrierCode(String value) {
        this.platingCarrierCode = value;
    }

    /**
     * pnrDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PNRDetailsType }
     *     
     */
    public PNRDetailsType getPnrDetails() {
        return pnrDetails;
    }

    /**
     * pnrDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRDetailsType }
     *     
     */
    public void setPnrDetails(PNRDetailsType value) {
        this.pnrDetails = value;
    }

    /**
     * pnrSessionId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrSessionId() {
        return pnrSessionId;
    }

    /**
     * pnrSessionId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrSessionId(String value) {
        this.pnrSessionId = value;
    }

    /**
     * Gets the value of the amountPaid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountPaid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountPaid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrPayment }
     * 
     * 
     */
    public List<PnrPayment> getAmountPaid() {
        if (amountPaid == null) {
            amountPaid = new ArrayList<PnrPayment>();
        }
        return this.amountPaid;
    }

    /**
     * Gets the value of the totalAmountToBePaid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalAmountToBePaid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalAmountToBePaid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrPayment }
     * 
     * 
     */
    public List<PnrPayment> getTotalAmountToBePaid() {
        if (totalAmountToBePaid == null) {
            totalAmountToBePaid = new ArrayList<PnrPayment>();
        }
        return this.totalAmountToBePaid;
    }

    /**
     * Gets the value of the encodedAmountToBeShown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encodedAmountToBeShown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncodedAmountToBeShown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrPaymentEncoded }
     * 
     * 
     */
    public List<PnrPaymentEncoded> getEncodedAmountToBeShown() {
        if (encodedAmountToBeShown == null) {
            encodedAmountToBeShown = new ArrayList<PnrPaymentEncoded>();
        }
        return this.encodedAmountToBeShown;
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
     * originalAgentID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalAgentID() {
        return originalAgentID;
    }

    /**
     * originalAgentID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalAgentID(String value) {
        this.originalAgentID = value;
    }

    /**
     * currentAgentID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentAgentID() {
        return currentAgentID;
    }

    /**
     * currentAgentID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentAgentID(String value) {
        this.currentAgentID = value;
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
     * tourOperatorNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorNumber() {
        return tourOperatorNumber;
    }

    /**
     * tourOperatorNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorNumber(String value) {
        this.tourOperatorNumber = value;
    }

    /**
     * isPnrUnpaid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPnrUnpaid() {
        return isPnrUnpaid;
    }

    /**
     * isPnrUnpaid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPnrUnpaid(Boolean value) {
        this.isPnrUnpaid = value;
    }

    /**
     * tourCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * tourCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * externalBookingNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalBookingNumber() {
        return externalBookingNumber;
    }

    /**
     * externalBookingNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalBookingNumber(String value) {
        this.externalBookingNumber = value;
    }

    /**
     * pointOfOriginCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfOriginCurrency() {
        return pointOfOriginCurrency;
    }

    /**
     * pointOfOriginCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfOriginCurrency(String value) {
        this.pointOfOriginCurrency = value;
    }

    /**
     * pnrOnHoldIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPnrOnHoldIndicator() {
        return pnrOnHoldIndicator;
    }

    /**
     * pnrOnHoldIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPnrOnHoldIndicator(Boolean value) {
        this.pnrOnHoldIndicator = value;
    }

    /**
     * Gets the value of the externalRecordLocatorDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalRecordLocatorDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalRecordLocatorDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalRecordLocatorDetails }
     * 
     * 
     */
    public List<ExternalRecordLocatorDetails> getExternalRecordLocatorDetails() {
        if (externalRecordLocatorDetails == null) {
            externalRecordLocatorDetails = new ArrayList<ExternalRecordLocatorDetails>();
        }
        return this.externalRecordLocatorDetails;
    }

    /**
     * displayCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayCurrency() {
        return displayCurrency;
    }

    /**
     * displayCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayCurrency(String value) {
        this.displayCurrency = value;
    }

    /**
     * pointOfSale 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSale() {
        return pointOfSale;
    }

    /**
     * pointOfSale 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSale(String value) {
        this.pointOfSale = value;
    }

    /**
     * pricingModel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingModel() {
        return pricingModel;
    }

    /**
     * pricingModel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingModel(String value) {
        this.pricingModel = value;
    }

    /**
     * farePaidStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FarePaidStatusType }
     *     
     */
    public FarePaidStatusType getFarePaidStatus() {
        return farePaidStatus;
    }

    /**
     * farePaidStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePaidStatusType }
     *     
     */
    public void setFarePaidStatus(FarePaidStatusType value) {
        this.farePaidStatus = value;
    }

}
