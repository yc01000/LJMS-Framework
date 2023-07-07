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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="GiftCertificateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GiftCertificateTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GiftCertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BulkOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GiftCertificateCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GiftCertificateBalanceAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="GiftCertificateStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GiftCertificateExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="OwnerOfCreation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PurchaserDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PurchaserDetails" minOccurs="0"/&gt;
 *         &lt;element name="RecipientDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}RecipientDetails" minOccurs="0"/&gt;
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
    "giftCertificateType",
    "giftCertificateTypeCode",
    "giftCertificateNumber",
    "bulkOrderNumber",
    "giftCertificateCurrencyCode",
    "giftCertificateBalanceAmount",
    "giftCertificateStatus",
    "giftCertificateExpiryDate",
    "ownerOfCreation",
    "purchaserDetails",
    "recipientDetails",
    "errorType"
})
@XmlRootElement(name = "RetrieveGiftCertificateDetailsRS")
public class RetrieveGiftCertificateDetailsRS
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "GiftCertificateType")
    protected String giftCertificateType;
    @XmlElement(name = "GiftCertificateTypeCode")
    protected String giftCertificateTypeCode;
    @XmlElement(name = "GiftCertificateNumber")
    protected String giftCertificateNumber;
    @XmlElement(name = "BulkOrderNumber")
    protected String bulkOrderNumber;
    @XmlElement(name = "GiftCertificateCurrencyCode")
    protected String giftCertificateCurrencyCode;
    @XmlElement(name = "GiftCertificateBalanceAmount")
    protected Double giftCertificateBalanceAmount;
    @XmlElement(name = "GiftCertificateStatus")
    protected String giftCertificateStatus;
    @XmlElement(name = "GiftCertificateExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar giftCertificateExpiryDate;
    @XmlElement(name = "OwnerOfCreation")
    protected String ownerOfCreation;
    @XmlElement(name = "PurchaserDetails")
    protected PurchaserDetails purchaserDetails;
    @XmlElement(name = "RecipientDetails")
    protected RecipientDetails recipientDetails;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;

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

    /**
     * giftCertificateTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertificateTypeCode() {
        return giftCertificateTypeCode;
    }

    /**
     * giftCertificateTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertificateTypeCode(String value) {
        this.giftCertificateTypeCode = value;
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
     *     {@link PurchaserDetails }
     *     
     */
    public PurchaserDetails getPurchaserDetails() {
        return purchaserDetails;
    }

    /**
     * purchaserDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaserDetails }
     *     
     */
    public void setPurchaserDetails(PurchaserDetails value) {
        this.purchaserDetails = value;
    }

    /**
     * recipientDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RecipientDetails }
     *     
     */
    public RecipientDetails getRecipientDetails() {
        return recipientDetails;
    }

    /**
     * recipientDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientDetails }
     *     
     */
    public void setRecipientDetails(RecipientDetails value) {
        this.recipientDetails = value;
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
