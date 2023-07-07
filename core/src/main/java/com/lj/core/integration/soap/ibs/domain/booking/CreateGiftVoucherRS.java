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
 *         &lt;element name="giftVoucherTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bulkOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="giftVoucherDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CreatedGiftVoucherDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaymentDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="purchaserInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}GVPurchaserInformation" minOccurs="0"/&gt;
 *         &lt;element name="recipientInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}GVRecipientInformation" minOccurs="0"/&gt;
 *         &lt;element name="personalMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
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
    "giftVoucherTypeCode",
    "bulkOrderNumber",
    "giftVoucherDetails",
    "paymentDetails",
    "purchaserInformation",
    "recipientInformation",
    "personalMessage",
    "companyName",
    "taxOffice",
    "language",
    "errorType"
})
@XmlRootElement(name = "CreateGiftVoucherRS")
public class CreateGiftVoucherRS
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected String giftVoucherTypeCode;
    protected String bulkOrderNumber;
    protected List<CreatedGiftVoucherDetails> giftVoucherDetails;
    @XmlElement(name = "PaymentDetails")
    protected List<PaymentDetailsType> paymentDetails;
    protected GVPurchaserInformation purchaserInformation;
    protected GVRecipientInformation recipientInformation;
    protected String personalMessage;
    protected String companyName;
    protected String taxOffice;
    protected String language;
    protected ErrorType errorType;

    /**
     * giftVoucherTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftVoucherTypeCode() {
        return giftVoucherTypeCode;
    }

    /**
     * giftVoucherTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftVoucherTypeCode(String value) {
        this.giftVoucherTypeCode = value;
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
     * Gets the value of the giftVoucherDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftVoucherDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftVoucherDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreatedGiftVoucherDetails }
     * 
     * 
     */
    public List<CreatedGiftVoucherDetails> getGiftVoucherDetails() {
        if (giftVoucherDetails == null) {
            giftVoucherDetails = new ArrayList<CreatedGiftVoucherDetails>();
        }
        return this.giftVoucherDetails;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDetailsType }
     * 
     * 
     */
    public List<PaymentDetailsType> getPaymentDetails() {
        if (paymentDetails == null) {
            paymentDetails = new ArrayList<PaymentDetailsType>();
        }
        return this.paymentDetails;
    }

    /**
     * purchaserInformation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GVPurchaserInformation }
     *     
     */
    public GVPurchaserInformation getPurchaserInformation() {
        return purchaserInformation;
    }

    /**
     * purchaserInformation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GVPurchaserInformation }
     *     
     */
    public void setPurchaserInformation(GVPurchaserInformation value) {
        this.purchaserInformation = value;
    }

    /**
     * recipientInformation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GVRecipientInformation }
     *     
     */
    public GVRecipientInformation getRecipientInformation() {
        return recipientInformation;
    }

    /**
     * recipientInformation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GVRecipientInformation }
     *     
     */
    public void setRecipientInformation(GVRecipientInformation value) {
        this.recipientInformation = value;
    }

    /**
     * personalMessage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalMessage() {
        return personalMessage;
    }

    /**
     * personalMessage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalMessage(String value) {
        this.personalMessage = value;
    }

    /**
     * companyName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * companyName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * taxOffice 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxOffice() {
        return taxOffice;
    }

    /**
     * taxOffice 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxOffice(String value) {
        this.taxOffice = value;
    }

    /**
     * language 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * language 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
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
