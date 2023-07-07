//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.05.28 시간 08:48:08 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BookingChannel" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingChannelKeyType"/>
 *         &lt;element name="loyaltyNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vppId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="giftVoucherValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="giftVoucherCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deliveryMode" type="{http://www.ibsplc.com/iRes/simpleTypes/}VoucherDeliveryMode"/>
 *         &lt;element name="pickupLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaymentInformation" maxOccurs="unbounded"/>
 *         &lt;element name="purchaserInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}PurchaserInformation"/>
 *         &lt;element name="recipientInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}RecipientInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    "giftVoucherValue",
    "giftVoucherCurrencyCode",
    "deliveryMode",
    "pickupLocation",
    "paymentInformation",
    "purchaserInformation",
    "recipientInformation"
})
@XmlRootElement(name = "CreateIndividualGiftVoucherRQ")
public class CreateIndividualGiftVoucherRQ {

    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "BookingChannel", required = true)
    protected BookingChannelKeyType bookingChannel;
    @XmlElement(required = true)
    protected String loyaltyNumber;
    @XmlElement(required = true)
    protected String agencyCode;
    @XmlElement(required = true)
    protected String vppId;
    protected double giftVoucherValue;
    @XmlElement(required = true)
    protected String giftVoucherCurrencyCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VoucherDeliveryMode deliveryMode;
    protected String pickupLocation;
    @XmlElement(required = true)
    protected List<PaymentInformation> paymentInformation;
    @XmlElement(required = true)
    protected PurchaserInformation purchaserInformation;
    protected RecipientInformation recipientInformation;

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
     * giftVoucherValue 속성의 값을 가져옵니다.
     * 
     */
    public double getGiftVoucherValue() {
        return giftVoucherValue;
    }

    /**
     * giftVoucherValue 속성의 값을 설정합니다.
     * 
     */
    public void setGiftVoucherValue(double value) {
        this.giftVoucherValue = value;
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
     * Gets the value of the paymentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInformation }
     * 
     * 
     */
    public List<PaymentInformation> getPaymentInformation() {
        if (paymentInformation == null) {
            paymentInformation = new ArrayList<PaymentInformation>();
        }
        return this.paymentInformation;
    }

    /**
     * purchaserInformation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PurchaserInformation }
     *     
     */
    public PurchaserInformation getPurchaserInformation() {
        return purchaserInformation;
    }

    /**
     * purchaserInformation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaserInformation }
     *     
     */
    public void setPurchaserInformation(PurchaserInformation value) {
        this.purchaserInformation = value;
    }

    /**
     * recipientInformation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RecipientInformation }
     *     
     */
    public RecipientInformation getRecipientInformation() {
        return recipientInformation;
    }

    /**
     * recipientInformation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientInformation }
     *     
     */
    public void setRecipientInformation(RecipientInformation value) {
        this.recipientInformation = value;
    }

}
