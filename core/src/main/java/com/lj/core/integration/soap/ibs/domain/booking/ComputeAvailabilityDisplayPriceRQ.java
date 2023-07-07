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
 *         &lt;element name="FareDetailsTypes" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareDetailsType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PaxCountDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxCountType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="FareComponentMappingIds" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareComponentMappingType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PublishedCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PointOfPurchase" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BookingChannel" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingChannelKeyType"/&gt;
 *         &lt;element name="TicketedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
    "fareDetailsTypes",
    "paxCountDetails",
    "fareComponentMappingIds",
    "publishedCurrency",
    "pointOfPurchase",
    "bookingChannel",
    "ticketedDate"
})
@XmlRootElement(name = "ComputeAvailabilityDisplayPriceRQ")
public class ComputeAvailabilityDisplayPriceRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "FareDetailsTypes", required = true)
    protected List<FareDetailsType> fareDetailsTypes;
    @XmlElement(name = "PaxCountDetails", required = true)
    protected List<PaxCountType> paxCountDetails;
    @XmlElement(name = "FareComponentMappingIds", required = true)
    protected List<FareComponentMappingType> fareComponentMappingIds;
    @XmlElement(name = "PublishedCurrency", required = true)
    protected String publishedCurrency;
    @XmlElement(name = "PointOfPurchase", required = true)
    protected String pointOfPurchase;
    @XmlElement(name = "BookingChannel", required = true)
    protected BookingChannelKeyType bookingChannel;
    @XmlElement(name = "TicketedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ticketedDate;

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
     * Gets the value of the fareDetailsTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDetailsTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDetailsTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDetailsType }
     * 
     * 
     */
    public List<FareDetailsType> getFareDetailsTypes() {
        if (fareDetailsTypes == null) {
            fareDetailsTypes = new ArrayList<FareDetailsType>();
        }
        return this.fareDetailsTypes;
    }

    /**
     * Gets the value of the paxCountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxCountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxCountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxCountType }
     * 
     * 
     */
    public List<PaxCountType> getPaxCountDetails() {
        if (paxCountDetails == null) {
            paxCountDetails = new ArrayList<PaxCountType>();
        }
        return this.paxCountDetails;
    }

    /**
     * Gets the value of the fareComponentMappingIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareComponentMappingIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareComponentMappingIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentMappingType }
     * 
     * 
     */
    public List<FareComponentMappingType> getFareComponentMappingIds() {
        if (fareComponentMappingIds == null) {
            fareComponentMappingIds = new ArrayList<FareComponentMappingType>();
        }
        return this.fareComponentMappingIds;
    }

    /**
     * publishedCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishedCurrency() {
        return publishedCurrency;
    }

    /**
     * publishedCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishedCurrency(String value) {
        this.publishedCurrency = value;
    }

    /**
     * pointOfPurchase 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfPurchase() {
        return pointOfPurchase;
    }

    /**
     * pointOfPurchase 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfPurchase(String value) {
        this.pointOfPurchase = value;
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
     * ticketedDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketedDate() {
        return ticketedDate;
    }

    /**
     * ticketedDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTicketedDate(XMLGregorianCalendar value) {
        this.ticketedDate = value;
    }

}
