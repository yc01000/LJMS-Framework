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
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="CreateBooking" type="{http://www.ibsplc.com/iRes/simpleTypes/}CreateBookingRQ"/>
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ElementOverrideDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ElementOverrideDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PublishedfareCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketedCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isPnrTicketed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PricingModel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PricingDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PricingTimeTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "createBooking",
    "pnrNumber",
    "elementOverrideDetails",
    "publishedfareCurrency",
    "ticketedCurrency",
    "isPnrTicketed",
    "pricingModel",
    "pricingDateTime",
    "pricingTimeTimeZone"
})
@XmlRootElement(name = "CreateBookingMigRQ")
public class CreateBookingMigRQ {

    @XmlElement(name = "CreateBooking", required = true)
    protected CreateBookingRQ createBooking;
    @XmlElement(name = "PnrNumber", required = true)
    protected String pnrNumber;
    @XmlElement(name = "ElementOverrideDetails")
    protected List<ElementOverrideDetailsType> elementOverrideDetails;
    @XmlElement(name = "PublishedfareCurrency")
    protected String publishedfareCurrency;
    @XmlElement(name = "TicketedCurrency")
    protected String ticketedCurrency;
    protected boolean isPnrTicketed;
    @XmlElement(name = "PricingModel", required = true)
    protected String pricingModel;
    @XmlElement(name = "PricingDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pricingDateTime;
    @XmlElement(name = "PricingTimeTimeZone")
    protected String pricingTimeTimeZone;

    /**
     * createBooking 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CreateBookingRQ }
     *     
     */
    public CreateBookingRQ getCreateBooking() {
        return createBooking;
    }

    /**
     * createBooking 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateBookingRQ }
     *     
     */
    public void setCreateBooking(CreateBookingRQ value) {
        this.createBooking = value;
    }

    /**
     * pnrNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrNumber() {
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
    public void setPnrNumber(String value) {
        this.pnrNumber = value;
    }

    /**
     * Gets the value of the elementOverrideDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementOverrideDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementOverrideDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementOverrideDetailsType }
     * 
     * 
     */
    public List<ElementOverrideDetailsType> getElementOverrideDetails() {
        if (elementOverrideDetails == null) {
            elementOverrideDetails = new ArrayList<ElementOverrideDetailsType>();
        }
        return this.elementOverrideDetails;
    }

    /**
     * publishedfareCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishedfareCurrency() {
        return publishedfareCurrency;
    }

    /**
     * publishedfareCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishedfareCurrency(String value) {
        this.publishedfareCurrency = value;
    }

    /**
     * ticketedCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketedCurrency() {
        return ticketedCurrency;
    }

    /**
     * ticketedCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketedCurrency(String value) {
        this.ticketedCurrency = value;
    }

    /**
     * isPnrTicketed 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsPnrTicketed() {
        return isPnrTicketed;
    }

    /**
     * isPnrTicketed 속성의 값을 설정합니다.
     * 
     */
    public void setIsPnrTicketed(boolean value) {
        this.isPnrTicketed = value;
    }

    /**
     * pricingModel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingModel() {
        return pricingModel;
    }

    /**
     * pricingModel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingModel(String value) {
        this.pricingModel = value;
    }

    /**
     * pricingDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPricingDateTime() {
        return pricingDateTime;
    }

    /**
     * pricingDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPricingDateTime(XMLGregorianCalendar value) {
        this.pricingDateTime = value;
    }

    /**
     * pricingTimeTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingTimeTimeZone() {
        return pricingTimeTimeZone;
    }

    /**
     * pricingTimeTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingTimeTimeZone(String value) {
        this.pricingTimeTimeZone = value;
    }

}
