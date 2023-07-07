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
 * <p>AgencyPaymentDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AgencyPaymentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormOfPayment" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyPaymentFOPType"/&gt;
 *         &lt;element name="FOPNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemittanceAmtDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType"/&gt;
 *         &lt;element name="TransactionAmtDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType"/&gt;
 *         &lt;element name="AvailableCredit" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType" minOccurs="0"/&gt;
 *         &lt;element name="WriteOffAmtDtls" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType" minOccurs="0"/&gt;
 *         &lt;element name="ReportingOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgencyPaymentDetailsType", propOrder = {
    "agencyCode",
    "paymentDate",
    "comment",
    "formOfPayment",
    "fopNumber",
    "remittanceAmtDetails",
    "transactionAmtDetails",
    "availableCredit",
    "writeOffAmtDtls",
    "reportingOffice"
})
public class AgencyPaymentDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AgencyCode", required = true)
    protected String agencyCode;
    @XmlElement(name = "PaymentDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "FormOfPayment", required = true)
    @XmlSchemaType(name = "string")
    protected AgencyPaymentFOPType formOfPayment;
    @XmlElement(name = "FOPNumber")
    protected String fopNumber;
    @XmlElement(name = "RemittanceAmtDetails", required = true)
    protected CurrencyAmountType remittanceAmtDetails;
    @XmlElement(name = "TransactionAmtDetails", required = true)
    protected CurrencyAmountType transactionAmtDetails;
    @XmlElement(name = "AvailableCredit")
    protected CurrencyAmountType availableCredit;
    @XmlElement(name = "WriteOffAmtDtls")
    protected CurrencyAmountType writeOffAmtDtls;
    @XmlElement(name = "ReportingOffice")
    protected String reportingOffice;

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
     * comment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * comment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * formOfPayment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AgencyPaymentFOPType }
     *     
     */
    public AgencyPaymentFOPType getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * formOfPayment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyPaymentFOPType }
     *     
     */
    public void setFormOfPayment(AgencyPaymentFOPType value) {
        this.formOfPayment = value;
    }

    /**
     * fopNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOPNumber() {
        return fopNumber;
    }

    /**
     * fopNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOPNumber(String value) {
        this.fopNumber = value;
    }

    /**
     * remittanceAmtDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getRemittanceAmtDetails() {
        return remittanceAmtDetails;
    }

    /**
     * remittanceAmtDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setRemittanceAmtDetails(CurrencyAmountType value) {
        this.remittanceAmtDetails = value;
    }

    /**
     * transactionAmtDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getTransactionAmtDetails() {
        return transactionAmtDetails;
    }

    /**
     * transactionAmtDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setTransactionAmtDetails(CurrencyAmountType value) {
        this.transactionAmtDetails = value;
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
     * writeOffAmtDtls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getWriteOffAmtDtls() {
        return writeOffAmtDtls;
    }

    /**
     * writeOffAmtDtls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setWriteOffAmtDtls(CurrencyAmountType value) {
        this.writeOffAmtDtls = value;
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

}
