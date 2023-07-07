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
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="deliveryMode" type="{http://www.ibsplc.com/iRes/simpleTypes/}VoucherDeliveryMode"/&gt;
 *         &lt;element name="pickupLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sendTo" type="{http://www.ibsplc.com/iRes/simpleTypes/}sendTo"/&gt;
 *         &lt;element name="GiftCertificateTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="giftVoucherCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DenominationDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GiftVoucherDenominationDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element name="GuestPaymentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestPaymentInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="purchaserInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}GVPurchaserInformation"/&gt;
 *         &lt;element name="recipientInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}GVRecipientInformation"/&gt;
 *         &lt;element name="personalMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "deliveryMode",
    "pickupLocation",
    "sendTo",
    "giftCertificateTypeCode",
    "giftVoucherCurrencyCode",
    "denominationDetails",
    "guestPaymentInfo",
    "purchaserInformation",
    "recipientInformation",
    "personalMessage",
    "companyName",
    "taxOffice",
    "language"
})
@XmlRootElement(name = "CreateGiftVoucherRQ")
public class CreateGiftVoucherRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "BookingChannel", required = true)
    protected BookingChannelKeyType bookingChannel;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VoucherDeliveryMode deliveryMode;
    protected String pickupLocation;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SendTo sendTo;
    @XmlElement(name = "GiftCertificateTypeCode")
    protected String giftCertificateTypeCode;
    @XmlElement(required = true)
    protected String giftVoucherCurrencyCode;
    @XmlElement(name = "DenominationDetails", required = true)
    protected List<GiftVoucherDenominationDetails> denominationDetails;
    @XmlElement(name = "GuestPaymentInfo")
    protected List<GuestPaymentInfoType> guestPaymentInfo;
    @XmlElement(required = true)
    protected GVPurchaserInformation purchaserInformation;
    @XmlElement(required = true)
    protected GVRecipientInformation recipientInformation;
    protected String personalMessage;
    protected String companyName;
    protected String taxOffice;
    @XmlElement(required = true)
    protected String language;

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
     * deliveryMode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link VoucherDeliveryMode }
     *     
     */
    public VoucherDeliveryMode getDeliveryMode() {
        return deliveryMode;
    }

    /**
     * deliveryMode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherDeliveryMode }
     *     
     */
    public void setDeliveryMode(VoucherDeliveryMode value) {
        this.deliveryMode = value;
    }

    /**
     * pickupLocation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupLocation() {
        return pickupLocation;
    }

    /**
     * pickupLocation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupLocation(String value) {
        this.pickupLocation = value;
    }

    /**
     * sendTo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SendTo }
     *     
     */
    public SendTo getSendTo() {
        return sendTo;
    }

    /**
     * sendTo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SendTo }
     *     
     */
    public void setSendTo(SendTo value) {
        this.sendTo = value;
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
     * Gets the value of the denominationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the denominationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDenominationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GiftVoucherDenominationDetails }
     * 
     * 
     */
    public List<GiftVoucherDenominationDetails> getDenominationDetails() {
        if (denominationDetails == null) {
            denominationDetails = new ArrayList<GiftVoucherDenominationDetails>();
        }
        return this.denominationDetails;
    }

    /**
     * Gets the value of the guestPaymentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestPaymentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestPaymentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestPaymentInfoType }
     * 
     * 
     */
    public List<GuestPaymentInfoType> getGuestPaymentInfo() {
        if (guestPaymentInfo == null) {
            guestPaymentInfo = new ArrayList<GuestPaymentInfoType>();
        }
        return this.guestPaymentInfo;
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

}
