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
 * <p>RetrieveGCWithProfileAlias complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="RetrieveGCWithProfileAlias"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GiftVoucherType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GiftCertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BulkOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GiftCertificateCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="GiftCertificateBalanceAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="GiftCertificateStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GiftCertificateExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="OwnerOfCreation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PurchaserDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PurchaserDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="RecepientDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}RecipientDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
 *         &lt;element name="ConvertToCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConvertedAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="GiftCertificateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveGCWithProfileAlias", propOrder = {
    "giftVoucherType",
    "giftCertificateNumber",
    "bulkOrderNumber",
    "giftCertificateCurrencyCode",
    "originalAmount",
    "giftCertificateBalanceAmount",
    "giftCertificateStatus",
    "giftCertificateExpiryDate",
    "ownerOfCreation",
    "purchaserDetails",
    "recepientDetails",
    "errorType",
    "convertToCurrency",
    "convertedAmount",
    "giftCertificateType"
})
public class RetrieveGCWithProfileAlias
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "GiftVoucherType", required = true)
    protected String giftVoucherType;
    @XmlElement(name = "GiftCertificateNumber", required = true)
    protected String giftCertificateNumber;
    @XmlElement(name = "BulkOrderNumber")
    protected String bulkOrderNumber;
    @XmlElement(name = "GiftCertificateCurrencyCode", required = true)
    protected String giftCertificateCurrencyCode;
    @XmlElement(name = "OriginalAmount")
    protected Double originalAmount;
    @XmlElement(name = "GiftCertificateBalanceAmount")
    protected Double giftCertificateBalanceAmount;
    @XmlElement(name = "GiftCertificateStatus", required = true)
    protected String giftCertificateStatus;
    @XmlElement(name = "GiftCertificateExpiryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar giftCertificateExpiryDate;
    @XmlElement(name = "OwnerOfCreation")
    protected String ownerOfCreation;
    @XmlElement(name = "PurchaserDetails")
    protected PurchaserDetailsType purchaserDetails;
    @XmlElement(name = "RecepientDetails")
    protected RecipientDetailsType recepientDetails;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;
    @XmlElement(name = "ConvertToCurrency")
    protected String convertToCurrency;
    @XmlElement(name = "ConvertedAmount")
    protected double convertedAmount;
    @XmlElement(name = "GiftCertificateType")
    protected String giftCertificateType;

    /**
     * giftVoucherType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftVoucherType() {
        return giftVoucherType;
    }

    /**
     * giftVoucherType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftVoucherType(String value) {
        this.giftVoucherType = value;
    }

    /**
     * giftCertificateNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertificateNumber() {
        return giftCertificateNumber;
    }

    /**
     * giftCertificateNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertificateNumber(String value) {
        this.giftCertificateNumber = value;
    }

    /**
     * bulkOrderNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulkOrderNumber() {
        return bulkOrderNumber;
    }

    /**
     * bulkOrderNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulkOrderNumber(String value) {
        this.bulkOrderNumber = value;
    }

    /**
     * giftCertificateCurrencyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertificateCurrencyCode() {
        return giftCertificateCurrencyCode;
    }

    /**
     * giftCertificateCurrencyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertificateCurrencyCode(String value) {
        this.giftCertificateCurrencyCode = value;
    }

    /**
     * originalAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOriginalAmount() {
        return originalAmount;
    }

    /**
     * originalAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOriginalAmount(Double value) {
        this.originalAmount = value;
    }

    /**
     * giftCertificateBalanceAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGiftCertificateBalanceAmount() {
        return giftCertificateBalanceAmount;
    }

    /**
     * giftCertificateBalanceAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGiftCertificateBalanceAmount(Double value) {
        this.giftCertificateBalanceAmount = value;
    }

    /**
     * giftCertificateStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertificateStatus() {
        return giftCertificateStatus;
    }

    /**
     * giftCertificateStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertificateStatus(String value) {
        this.giftCertificateStatus = value;
    }

    /**
     * giftCertificateExpiryDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGiftCertificateExpiryDate() {
        return giftCertificateExpiryDate;
    }

    /**
     * giftCertificateExpiryDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGiftCertificateExpiryDate(XMLGregorianCalendar value) {
        this.giftCertificateExpiryDate = value;
    }

    /**
     * ownerOfCreation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerOfCreation() {
        return ownerOfCreation;
    }

    /**
     * ownerOfCreation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerOfCreation(String value) {
        this.ownerOfCreation = value;
    }

    /**
     * purchaserDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PurchaserDetailsType }
     *     
     */
    public PurchaserDetailsType getPurchaserDetails() {
        return purchaserDetails;
    }

    /**
     * purchaserDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaserDetailsType }
     *     
     */
    public void setPurchaserDetails(PurchaserDetailsType value) {
        this.purchaserDetails = value;
    }

    /**
     * recepientDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RecipientDetailsType }
     *     
     */
    public RecipientDetailsType getRecepientDetails() {
        return recepientDetails;
    }

    /**
     * recepientDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientDetailsType }
     *     
     */
    public void setRecepientDetails(RecipientDetailsType value) {
        this.recepientDetails = value;
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
     * convertToCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvertToCurrency() {
        return convertToCurrency;
    }

    /**
     * convertToCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvertToCurrency(String value) {
        this.convertToCurrency = value;
    }

    /**
     * convertedAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getConvertedAmount() {
        return convertedAmount;
    }

    /**
     * convertedAmount 속성의 값을 설정합니다.
     * 
     */
    public void setConvertedAmount(double value) {
        this.convertedAmount = value;
    }

    /**
     * giftCertificateType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertificateType() {
        return giftCertificateType;
    }

    /**
     * giftCertificateType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertificateType(String value) {
        this.giftCertificateType = value;
    }

}
