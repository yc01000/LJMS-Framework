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
 * <p>PaymentReceiptDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaymentReceiptDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReceiptNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="PrintDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="TotalAmountForPymReceipt" type="{http://www.ibsplc.com/iRes/simpleTypes/}TotalAmountForPymReceiptType" minOccurs="0"/&gt;
 *         &lt;element name="FarePymntDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FarePymntDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="FeePymntDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeePymntDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FormOfPaymentCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}FOPType"/&gt;
 *         &lt;element name="PaymentTypeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GSTNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDoneBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceInitiator" type="{http://www.ibsplc.com/iRes/simpleTypes/}ServiceInitiatorType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaxName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isDuplicate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PaymentSubcode" type="{http://www.ibsplc.com/iRes/simpleTypes/}CardType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReceiptDetailsType", propOrder = {
    "receiptNumber",
    "paymentDate",
    "printDate",
    "totalAmountForPymReceipt",
    "farePymntDetails",
    "feePymntDetails",
    "formOfPaymentCode",
    "paymentTypeNumber",
    "gstNumber",
    "transactionID",
    "paymentDoneBy",
    "trackingNumber",
    "serviceInitiator",
    "paymentDescription",
    "remarks",
    "paxName",
    "isDuplicate",
    "paymentDateAndTime",
    "paymentSubcode"
})
public class PaymentReceiptDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ReceiptNumber", required = true)
    protected String receiptNumber;
    @XmlElement(name = "PaymentDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(name = "PrintDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar printDate;
    @XmlElement(name = "TotalAmountForPymReceipt")
    protected TotalAmountForPymReceiptType totalAmountForPymReceipt;
    @XmlElement(name = "FarePymntDetails")
    protected FarePymntDetailsType farePymntDetails;
    @XmlElement(name = "FeePymntDetails")
    protected List<FeePymntDetailsType> feePymntDetails;
    @XmlElement(name = "FormOfPaymentCode", required = true)
    @XmlSchemaType(name = "string")
    protected FOPType formOfPaymentCode;
    @XmlElement(name = "PaymentTypeNumber")
    protected String paymentTypeNumber;
    @XmlElement(name = "GSTNumber")
    protected String gstNumber;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "PaymentDoneBy")
    protected String paymentDoneBy;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "ServiceInitiator")
    @XmlSchemaType(name = "string")
    protected ServiceInitiatorType serviceInitiator;
    @XmlElement(name = "PaymentDescription")
    protected String paymentDescription;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "PaxName")
    protected String paxName;
    protected Boolean isDuplicate;
    @XmlElement(name = "PaymentDateAndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDateAndTime;
    @XmlElement(name = "PaymentSubcode")
    @XmlSchemaType(name = "string")
    protected CardType paymentSubcode;

    /**
     * receiptNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * receiptNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptNumber(String value) {
        this.receiptNumber = value;
    }

    /**
     * paymentDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * paymentDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * printDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrintDate() {
        return printDate;
    }

    /**
     * printDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrintDate(XMLGregorianCalendar value) {
        this.printDate = value;
    }

    /**
     * totalAmountForPymReceipt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountForPymReceiptType }
     *     
     */
    public TotalAmountForPymReceiptType getTotalAmountForPymReceipt() {
        return totalAmountForPymReceipt;
    }

    /**
     * totalAmountForPymReceipt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountForPymReceiptType }
     *     
     */
    public void setTotalAmountForPymReceipt(TotalAmountForPymReceiptType value) {
        this.totalAmountForPymReceipt = value;
    }

    /**
     * farePymntDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FarePymntDetailsType }
     *     
     */
    public FarePymntDetailsType getFarePymntDetails() {
        return farePymntDetails;
    }

    /**
     * farePymntDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePymntDetailsType }
     *     
     */
    public void setFarePymntDetails(FarePymntDetailsType value) {
        this.farePymntDetails = value;
    }

    /**
     * Gets the value of the feePymntDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feePymntDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeePymntDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeePymntDetailsType }
     * 
     * 
     */
    public List<FeePymntDetailsType> getFeePymntDetails() {
        if (feePymntDetails == null) {
            feePymntDetails = new ArrayList<FeePymntDetailsType>();
        }
        return this.feePymntDetails;
    }

    /**
     * formOfPaymentCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FOPType }
     *     
     */
    public FOPType getFormOfPaymentCode() {
        return formOfPaymentCode;
    }

    /**
     * formOfPaymentCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FOPType }
     *     
     */
    public void setFormOfPaymentCode(FOPType value) {
        this.formOfPaymentCode = value;
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
     * gstNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSTNumber() {
        return gstNumber;
    }

    /**
     * gstNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSTNumber(String value) {
        this.gstNumber = value;
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
     * paymentDoneBy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDoneBy() {
        return paymentDoneBy;
    }

    /**
     * paymentDoneBy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDoneBy(String value) {
        this.paymentDoneBy = value;
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
     * serviceInitiator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInitiatorType }
     *     
     */
    public ServiceInitiatorType getServiceInitiator() {
        return serviceInitiator;
    }

    /**
     * serviceInitiator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInitiatorType }
     *     
     */
    public void setServiceInitiator(ServiceInitiatorType value) {
        this.serviceInitiator = value;
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
     * remarks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * remarks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * paxName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxName() {
        return paxName;
    }

    /**
     * paxName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxName(String value) {
        this.paxName = value;
    }

    /**
     * isDuplicate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDuplicate() {
        return isDuplicate;
    }

    /**
     * isDuplicate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDuplicate(Boolean value) {
        this.isDuplicate = value;
    }

    /**
     * paymentDateAndTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDateAndTime() {
        return paymentDateAndTime;
    }

    /**
     * paymentDateAndTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDateAndTime(XMLGregorianCalendar value) {
        this.paymentDateAndTime = value;
    }

    /**
     * paymentSubcode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CardType }
     *     
     */
    public CardType getPaymentSubcode() {
        return paymentSubcode;
    }

    /**
     * paymentSubcode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CardType }
     *     
     */
    public void setPaymentSubcode(CardType value) {
        this.paymentSubcode = value;
    }

}
