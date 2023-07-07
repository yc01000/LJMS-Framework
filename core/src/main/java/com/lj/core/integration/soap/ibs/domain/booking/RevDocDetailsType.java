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
 * <p>RevDocDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="RevDocDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/&gt;
 *         &lt;element name="AgencyIATACode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TravelAgentID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="IssueDateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isConjunction" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="InitialTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternationalDomesticIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PNRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PassengerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PassengerEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PassengerContact" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CouponDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}RevDocCouponDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Fare" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="FareCalculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareSurchargeAdc" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FeeAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="TotalSurcharge" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="SurchargeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}RevDocSurchargeDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Discount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="TotalTaxAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="BSPAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType"/&gt;
 *         &lt;element name="TaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}RevDocTaxDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OriginalIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssuedInExchangeDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartialRefundAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TicketingUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PNRCreationUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndorsementAndRestrictions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PNRCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PNRCreationTimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentFOPDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaymentFOPDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}RevDocInvoiceDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevDocDetailsType", propOrder = {
    "transactionDate",
    "agencyIATACode",
    "travelAgentID",
    "documentNumber",
    "documentType",
    "issueDate",
    "issueDateTimeZone",
    "transactionType",
    "isConjunction",
    "initialTicketNumber",
    "internationalDomesticIndicator",
    "pnrNumber",
    "passengerName",
    "passengerType",
    "passengerEmail",
    "passengerContact",
    "couponDetails",
    "fare",
    "fareCalculation",
    "fareSurchargeAdc",
    "feeCode",
    "feeName",
    "feeAmount",
    "totalSurcharge",
    "surchargeDetails",
    "discount",
    "totalTaxAmount",
    "totalAmount",
    "bspAmount",
    "taxDetails",
    "originalIssue",
    "issuedInExchangeDetails",
    "partialRefundAmount",
    "tourCode",
    "ticketingUserCode",
    "pnrCreationUserCode",
    "endorsementAndRestrictions",
    "pnrCreationDate",
    "pnrCreationTimeZone",
    "paymentFOPDetails",
    "invoiceDetails"
})
public class RevDocDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "TransactionDate", required = true)
    protected DateOnlyType transactionDate;
    @XmlElement(name = "AgencyIATACode", required = true)
    protected String agencyIATACode;
    @XmlElement(name = "TravelAgentID", required = true)
    protected String travelAgentID;
    @XmlElement(name = "DocumentNumber", required = true)
    protected String documentNumber;
    @XmlElement(name = "DocumentType", required = true)
    protected String documentType;
    @XmlElement(name = "IssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "IssueDateTimeZone", required = true)
    protected String issueDateTimeZone;
    @XmlElement(name = "TransactionType", required = true)
    protected String transactionType;
    protected boolean isConjunction;
    @XmlElement(name = "InitialTicketNumber")
    protected String initialTicketNumber;
    @XmlElement(name = "InternationalDomesticIndicator", required = true)
    protected String internationalDomesticIndicator;
    @XmlElement(name = "PNRNumber", required = true)
    protected String pnrNumber;
    @XmlElement(name = "PassengerName", required = true)
    protected String passengerName;
    @XmlElement(name = "PassengerType", required = true)
    protected String passengerType;
    @XmlElement(name = "PassengerEmail", required = true)
    protected String passengerEmail;
    @XmlElement(name = "PassengerContact", required = true)
    protected String passengerContact;
    @XmlElement(name = "CouponDetails")
    protected List<RevDocCouponDetailsType> couponDetails;
    @XmlElement(name = "Fare")
    protected AmountType fare;
    @XmlElement(name = "FareCalculation")
    protected String fareCalculation;
    @XmlElement(name = "FareSurchargeAdc")
    protected AmountType fareSurchargeAdc;
    @XmlElement(name = "FeeCode")
    protected String feeCode;
    @XmlElement(name = "FeeName")
    protected String feeName;
    @XmlElement(name = "FeeAmount")
    protected AmountType feeAmount;
    @XmlElement(name = "TotalSurcharge")
    protected AmountType totalSurcharge;
    @XmlElement(name = "SurchargeDetails")
    protected List<RevDocSurchargeDetailsType> surchargeDetails;
    @XmlElement(name = "Discount")
    protected AmountType discount;
    @XmlElement(name = "TotalTaxAmount")
    protected AmountType totalTaxAmount;
    @XmlElement(name = "TotalAmount")
    protected AmountType totalAmount;
    @XmlElement(name = "BSPAmount", required = true)
    protected AmountType bspAmount;
    @XmlElement(name = "TaxDetails")
    protected List<RevDocTaxDetailsType> taxDetails;
    @XmlElement(name = "OriginalIssue")
    protected String originalIssue;
    @XmlElement(name = "IssuedInExchangeDetails")
    protected String issuedInExchangeDetails;
    @XmlElement(name = "PartialRefundAmount")
    protected AmountType partialRefundAmount;
    @XmlElement(name = "TourCode")
    protected String tourCode;
    @XmlElement(name = "TicketingUserCode")
    protected String ticketingUserCode;
    @XmlElement(name = "PNRCreationUserCode")
    protected String pnrCreationUserCode;
    @XmlElement(name = "EndorsementAndRestrictions")
    protected List<String> endorsementAndRestrictions;
    @XmlElement(name = "PNRCreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pnrCreationDate;
    @XmlElement(name = "PNRCreationTimeZone", required = true)
    protected String pnrCreationTimeZone;
    @XmlElement(name = "PaymentFOPDetails")
    protected List<PaymentFOPDetailsType> paymentFOPDetails;
    @XmlElement(name = "InvoiceDetails")
    protected List<RevDocInvoiceDetailsType> invoiceDetails;

    /**
     * transactionDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getTransactionDate() {
        return transactionDate;
    }

    /**
     * transactionDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setTransactionDate(DateOnlyType value) {
        this.transactionDate = value;
    }

    /**
     * agencyIATACode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyIATACode() {
        return agencyIATACode;
    }

    /**
     * agencyIATACode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyIATACode(String value) {
        this.agencyIATACode = value;
    }

    /**
     * travelAgentID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelAgentID() {
        return travelAgentID;
    }

    /**
     * travelAgentID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelAgentID(String value) {
        this.travelAgentID = value;
    }

    /**
     * documentNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * documentNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * documentType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * documentType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * issueDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * issueDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * issueDateTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDateTimeZone() {
        return issueDateTimeZone;
    }

    /**
     * issueDateTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDateTimeZone(String value) {
        this.issueDateTimeZone = value;
    }

    /**
     * transactionType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * transactionType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * isConjunction 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsConjunction() {
        return isConjunction;
    }

    /**
     * isConjunction 속성의 값을 설정합니다.
     * 
     */
    public void setIsConjunction(boolean value) {
        this.isConjunction = value;
    }

    /**
     * initialTicketNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialTicketNumber() {
        return initialTicketNumber;
    }

    /**
     * initialTicketNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialTicketNumber(String value) {
        this.initialTicketNumber = value;
    }

    /**
     * internationalDomesticIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalDomesticIndicator() {
        return internationalDomesticIndicator;
    }

    /**
     * internationalDomesticIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalDomesticIndicator(String value) {
        this.internationalDomesticIndicator = value;
    }

    /**
     * pnrNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRNumber() {
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
    public void setPNRNumber(String value) {
        this.pnrNumber = value;
    }

    /**
     * passengerName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerName() {
        return passengerName;
    }

    /**
     * passengerName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerName(String value) {
        this.passengerName = value;
    }

    /**
     * passengerType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * passengerType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * passengerEmail 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerEmail() {
        return passengerEmail;
    }

    /**
     * passengerEmail 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerEmail(String value) {
        this.passengerEmail = value;
    }

    /**
     * passengerContact 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerContact() {
        return passengerContact;
    }

    /**
     * passengerContact 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerContact(String value) {
        this.passengerContact = value;
    }

    /**
     * Gets the value of the couponDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couponDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouponDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevDocCouponDetailsType }
     * 
     * 
     */
    public List<RevDocCouponDetailsType> getCouponDetails() {
        if (couponDetails == null) {
            couponDetails = new ArrayList<RevDocCouponDetailsType>();
        }
        return this.couponDetails;
    }

    /**
     * fare 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFare() {
        return fare;
    }

    /**
     * fare 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFare(AmountType value) {
        this.fare = value;
    }

    /**
     * fareCalculation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCalculation() {
        return fareCalculation;
    }

    /**
     * fareCalculation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCalculation(String value) {
        this.fareCalculation = value;
    }

    /**
     * fareSurchargeAdc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFareSurchargeAdc() {
        return fareSurchargeAdc;
    }

    /**
     * fareSurchargeAdc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFareSurchargeAdc(AmountType value) {
        this.fareSurchargeAdc = value;
    }

    /**
     * feeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCode() {
        return feeCode;
    }

    /**
     * feeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCode(String value) {
        this.feeCode = value;
    }

    /**
     * feeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeName() {
        return feeName;
    }

    /**
     * feeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeName(String value) {
        this.feeName = value;
    }

    /**
     * feeAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFeeAmount() {
        return feeAmount;
    }

    /**
     * feeAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFeeAmount(AmountType value) {
        this.feeAmount = value;
    }

    /**
     * totalSurcharge 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalSurcharge() {
        return totalSurcharge;
    }

    /**
     * totalSurcharge 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalSurcharge(AmountType value) {
        this.totalSurcharge = value;
    }

    /**
     * Gets the value of the surchargeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surchargeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurchargeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevDocSurchargeDetailsType }
     * 
     * 
     */
    public List<RevDocSurchargeDetailsType> getSurchargeDetails() {
        if (surchargeDetails == null) {
            surchargeDetails = new ArrayList<RevDocSurchargeDetailsType>();
        }
        return this.surchargeDetails;
    }

    /**
     * discount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDiscount() {
        return discount;
    }

    /**
     * discount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDiscount(AmountType value) {
        this.discount = value;
    }

    /**
     * totalTaxAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * totalTaxAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalTaxAmount(AmountType value) {
        this.totalTaxAmount = value;
    }

    /**
     * totalAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * totalAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAmount(AmountType value) {
        this.totalAmount = value;
    }

    /**
     * bspAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBSPAmount() {
        return bspAmount;
    }

    /**
     * bspAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBSPAmount(AmountType value) {
        this.bspAmount = value;
    }

    /**
     * Gets the value of the taxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevDocTaxDetailsType }
     * 
     * 
     */
    public List<RevDocTaxDetailsType> getTaxDetails() {
        if (taxDetails == null) {
            taxDetails = new ArrayList<RevDocTaxDetailsType>();
        }
        return this.taxDetails;
    }

    /**
     * originalIssue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalIssue() {
        return originalIssue;
    }

    /**
     * originalIssue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalIssue(String value) {
        this.originalIssue = value;
    }

    /**
     * issuedInExchangeDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedInExchangeDetails() {
        return issuedInExchangeDetails;
    }

    /**
     * issuedInExchangeDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedInExchangeDetails(String value) {
        this.issuedInExchangeDetails = value;
    }

    /**
     * partialRefundAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPartialRefundAmount() {
        return partialRefundAmount;
    }

    /**
     * partialRefundAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPartialRefundAmount(AmountType value) {
        this.partialRefundAmount = value;
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
     * ticketingUserCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingUserCode() {
        return ticketingUserCode;
    }

    /**
     * ticketingUserCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingUserCode(String value) {
        this.ticketingUserCode = value;
    }

    /**
     * pnrCreationUserCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRCreationUserCode() {
        return pnrCreationUserCode;
    }

    /**
     * pnrCreationUserCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNRCreationUserCode(String value) {
        this.pnrCreationUserCode = value;
    }

    /**
     * Gets the value of the endorsementAndRestrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorsementAndRestrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorsementAndRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEndorsementAndRestrictions() {
        if (endorsementAndRestrictions == null) {
            endorsementAndRestrictions = new ArrayList<String>();
        }
        return this.endorsementAndRestrictions;
    }

    /**
     * pnrCreationDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPNRCreationDate() {
        return pnrCreationDate;
    }

    /**
     * pnrCreationDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPNRCreationDate(XMLGregorianCalendar value) {
        this.pnrCreationDate = value;
    }

    /**
     * pnrCreationTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRCreationTimeZone() {
        return pnrCreationTimeZone;
    }

    /**
     * pnrCreationTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNRCreationTimeZone(String value) {
        this.pnrCreationTimeZone = value;
    }

    /**
     * Gets the value of the paymentFOPDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFOPDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFOPDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentFOPDetailsType }
     * 
     * 
     */
    public List<PaymentFOPDetailsType> getPaymentFOPDetails() {
        if (paymentFOPDetails == null) {
            paymentFOPDetails = new ArrayList<PaymentFOPDetailsType>();
        }
        return this.paymentFOPDetails;
    }

    /**
     * Gets the value of the invoiceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevDocInvoiceDetailsType }
     * 
     * 
     */
    public List<RevDocInvoiceDetailsType> getInvoiceDetails() {
        if (invoiceDetails == null) {
            invoiceDetails = new ArrayList<RevDocInvoiceDetailsType>();
        }
        return this.invoiceDetails;
    }

}
