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
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BookingChannel" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingChannelKeyType"/&gt;
 *         &lt;element name="loyaltyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vppId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GiftVoucherNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BulkOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GiftVoucherTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OwnerOfCreation" type="{http://www.ibsplc.com/iRes/simpleTypes/}OwnerOfCreationTypes"/&gt;
 *         &lt;element name="GiftVoucherCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GiftVoucherAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="GiftVoucherStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}GiftVoucherStatusTypes"/&gt;
 *         &lt;element name="FromExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ToExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FromCreationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ToCreationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="listIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "loyaltyNumber",
    "agencyCode",
    "vppId",
    "giftVoucherNumber",
    "bulkOrderNumber",
    "giftVoucherTypeCode",
    "ownerOfCreation",
    "giftVoucherCurrencyCode",
    "giftVoucherAmount",
    "giftVoucherStatus",
    "fromExpiryDate",
    "toExpiryDate",
    "fromCreationDate",
    "toCreationDate",
    "listIndex"
})
@XmlRootElement(name = "ListGiftVouchersRQ")
public class ListGiftVouchersRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "BookingChannel", required = true)
    protected BookingChannelKeyType bookingChannel;
    protected String loyaltyNumber;
    protected String agencyCode;
    protected String vppId;
    @XmlElement(name = "GiftVoucherNumber")
    protected String giftVoucherNumber;
    @XmlElement(name = "BulkOrderNumber")
    protected String bulkOrderNumber;
    @XmlElement(name = "GiftVoucherTypeCode")
    protected String giftVoucherTypeCode;
    @XmlElement(name = "OwnerOfCreation", required = true)
    @XmlSchemaType(name = "string")
    protected OwnerOfCreationTypes ownerOfCreation;
    @XmlElement(name = "GiftVoucherCurrencyCode")
    protected String giftVoucherCurrencyCode;
    @XmlElement(name = "GiftVoucherAmount")
    protected Double giftVoucherAmount;
    @XmlElement(name = "GiftVoucherStatus", required = true)
    @XmlSchemaType(name = "string")
    protected GiftVoucherStatusTypes giftVoucherStatus;
    @XmlElement(name = "FromExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromExpiryDate;
    @XmlElement(name = "ToExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toExpiryDate;
    @XmlElement(name = "FromCreationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromCreationDate;
    @XmlElement(name = "ToCreationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toCreationDate;
    protected int listIndex;

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
     * loyaltyNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyNumber() {
        return loyaltyNumber;
    }

    /**
     * loyaltyNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyNumber(String value) {
        this.loyaltyNumber = value;
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
     * vppId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVppId() {
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
    public void setVppId(String value) {
        this.vppId = value;
    }

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
     * ownerOfCreation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OwnerOfCreationTypes }
     *     
     */
    public OwnerOfCreationTypes getOwnerOfCreation() {
        return ownerOfCreation;
    }

    /**
     * ownerOfCreation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerOfCreationTypes }
     *     
     */
    public void setOwnerOfCreation(OwnerOfCreationTypes value) {
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
     * giftVoucherAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGiftVoucherAmount() {
        return giftVoucherAmount;
    }

    /**
     * giftVoucherAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGiftVoucherAmount(Double value) {
        this.giftVoucherAmount = value;
    }

    /**
     * giftVoucherStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GiftVoucherStatusTypes }
     *     
     */
    public GiftVoucherStatusTypes getGiftVoucherStatus() {
        return giftVoucherStatus;
    }

    /**
     * giftVoucherStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftVoucherStatusTypes }
     *     
     */
    public void setGiftVoucherStatus(GiftVoucherStatusTypes value) {
        this.giftVoucherStatus = value;
    }

    /**
     * fromExpiryDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromExpiryDate() {
        return fromExpiryDate;
    }

    /**
     * fromExpiryDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromExpiryDate(XMLGregorianCalendar value) {
        this.fromExpiryDate = value;
    }

    /**
     * toExpiryDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToExpiryDate() {
        return toExpiryDate;
    }

    /**
     * toExpiryDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToExpiryDate(XMLGregorianCalendar value) {
        this.toExpiryDate = value;
    }

    /**
     * fromCreationDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromCreationDate() {
        return fromCreationDate;
    }

    /**
     * fromCreationDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromCreationDate(XMLGregorianCalendar value) {
        this.fromCreationDate = value;
    }

    /**
     * toCreationDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToCreationDate() {
        return toCreationDate;
    }

    /**
     * toCreationDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToCreationDate(XMLGregorianCalendar value) {
        this.toCreationDate = value;
    }

    /**
     * listIndex 속성의 값을 가져옵니다.
     * 
     */
    public int getListIndex() {
        return listIndex;
    }

    /**
     * listIndex 속성의 값을 설정합니다.
     * 
     */
    public void setListIndex(int value) {
        this.listIndex = value;
    }

}
