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
 * <p>ListGiftVoucherDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ListGiftVoucherDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GiftVoucherNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BulkOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GiftVoucherTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VPPId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OwnerOfCreation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GiftVoucherCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GiftVoucherBalanceAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GiftVoucherStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GiftVoucherExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="isPrevBtnDisable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isNextBtnDisable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="totalPages" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListGiftVoucherDetails", propOrder = {
    "giftVoucherNumber",
    "bulkOrderNumber",
    "giftVoucherTypeCode",
    "vppId",
    "ownerOfCreation",
    "giftVoucherCurrencyCode",
    "giftVoucherBalanceAmount",
    "giftVoucherStatus",
    "giftVoucherExpiryDate",
    "isPrevBtnDisable",
    "isNextBtnDisable",
    "totalPages"
})
public class ListGiftVoucherDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "GiftVoucherNumber", required = true)
    protected String giftVoucherNumber;
    @XmlElement(name = "BulkOrderNumber")
    protected String bulkOrderNumber;
    @XmlElement(name = "GiftVoucherTypeCode", required = true)
    protected String giftVoucherTypeCode;
    @XmlElement(name = "VPPId")
    protected String vppId;
    @XmlElement(name = "OwnerOfCreation", required = true)
    protected String ownerOfCreation;
    @XmlElement(name = "GiftVoucherCurrencyCode", required = true)
    protected String giftVoucherCurrencyCode;
    @XmlElement(name = "GiftVoucherBalanceAmount", required = true)
    protected String giftVoucherBalanceAmount;
    @XmlElement(name = "GiftVoucherStatus", required = true)
    protected String giftVoucherStatus;
    @XmlElement(name = "GiftVoucherExpiryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar giftVoucherExpiryDate;
    protected boolean isPrevBtnDisable;
    protected boolean isNextBtnDisable;
    protected int totalPages;

    /**
     * giftVoucherNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftVoucherNumber() {
        return giftVoucherNumber;
    }

    /**
     * giftVoucherNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftVoucherNumber(String value) {
        this.giftVoucherNumber = value;
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
     * vppId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVPPId() {
        return vppId;
    }

    /**
     * vppId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVPPId(String value) {
        this.vppId = value;
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
     * giftVoucherCurrencyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftVoucherCurrencyCode() {
        return giftVoucherCurrencyCode;
    }

    /**
     * giftVoucherCurrencyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftVoucherCurrencyCode(String value) {
        this.giftVoucherCurrencyCode = value;
    }

    /**
     * giftVoucherBalanceAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftVoucherBalanceAmount() {
        return giftVoucherBalanceAmount;
    }

    /**
     * giftVoucherBalanceAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftVoucherBalanceAmount(String value) {
        this.giftVoucherBalanceAmount = value;
    }

    /**
     * giftVoucherStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftVoucherStatus() {
        return giftVoucherStatus;
    }

    /**
     * giftVoucherStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftVoucherStatus(String value) {
        this.giftVoucherStatus = value;
    }

    /**
     * giftVoucherExpiryDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGiftVoucherExpiryDate() {
        return giftVoucherExpiryDate;
    }

    /**
     * giftVoucherExpiryDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGiftVoucherExpiryDate(XMLGregorianCalendar value) {
        this.giftVoucherExpiryDate = value;
    }

    /**
     * isPrevBtnDisable 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsPrevBtnDisable() {
        return isPrevBtnDisable;
    }

    /**
     * isPrevBtnDisable 속성의 값을 설정합니다.
     * 
     */
    public void setIsPrevBtnDisable(boolean value) {
        this.isPrevBtnDisable = value;
    }

    /**
     * isNextBtnDisable 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsNextBtnDisable() {
        return isNextBtnDisable;
    }

    /**
     * isNextBtnDisable 속성의 값을 설정합니다.
     * 
     */
    public void setIsNextBtnDisable(boolean value) {
        this.isNextBtnDisable = value;
    }

    /**
     * totalPages 속성의 값을 가져옵니다.
     * 
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * totalPages 속성의 값을 설정합니다.
     * 
     */
    public void setTotalPages(int value) {
        this.totalPages = value;
    }

}
