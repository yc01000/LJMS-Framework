//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Flight Details
 * 
 * <p>FlightGroupType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FlightGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="route" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="journeyTime" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="stops" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="flightNumber" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="scheduledDepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="scheduledArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="flightLegDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightLegDetailsType"/&gt;
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="FareDetailsPerGuest" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareDetailsType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TaxDetailsPerGuest" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightGroupType", propOrder = {
    "route",
    "journeyTime",
    "stops",
    "flightNumber",
    "scheduledDepartureDateTime",
    "scheduledArrivalDateTime",
    "flightLegDetails",
    "origin",
    "destination",
    "fareDetailsPerGuest",
    "taxDetailsPerGuest"
})
public class FlightGroupType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected String route;
    @XmlElement(required = true)
    protected Object journeyTime;
    @XmlElement(required = true)
    protected Object stops;
    @XmlElement(required = true)
    protected List<FlightIdentifierType> flightNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDepartureDateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledArrivalDateTime;
    @XmlElement(required = true)
    protected FlightLegDetailsType flightLegDetails;
    @XmlElement(required = true)
    protected Object origin;
    @XmlElement(required = true)
    protected Object destination;
    @XmlElement(name = "FareDetailsPerGuest", required = true)
    protected List<FareDetailsType> fareDetailsPerGuest;
    @XmlElement(name = "TaxDetailsPerGuest")
    protected List<TaxDetailsType> taxDetailsPerGuest;

    /**
     * route 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * route 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * journeyTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getJourneyTime() {
        return journeyTime;
    }

    /**
     * journeyTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setJourneyTime(Object value) {
        this.journeyTime = value;
    }

    /**
     * stops 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStops() {
        return stops;
    }

    /**
     * stops 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStops(Object value) {
        this.stops = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightIdentifierType }
     * 
     * 
     */
    public List<FlightIdentifierType> getFlightNumber() {
        if (flightNumber == null) {
            flightNumber = new ArrayList<FlightIdentifierType>();
        }
        return this.flightNumber;
    }

    /**
     * scheduledDepartureDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDepartureDateTime() {
        return scheduledDepartureDateTime;
    }

    /**
     * scheduledDepartureDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDepartureDateTime(XMLGregorianCalendar value) {
        this.scheduledDepartureDateTime = value;
    }

    /**
     * scheduledArrivalDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledArrivalDateTime() {
        return scheduledArrivalDateTime;
    }

    /**
     * scheduledArrivalDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledArrivalDateTime(XMLGregorianCalendar value) {
        this.scheduledArrivalDateTime = value;
    }

    /**
     * flightLegDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightLegDetailsType }
     *     
     */
    public FlightLegDetailsType getFlightLegDetails() {
        return flightLegDetails;
    }

    /**
     * flightLegDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightLegDetailsType }
     *     
     */
    public void setFlightLegDetails(FlightLegDetailsType value) {
        this.flightLegDetails = value;
    }

    /**
     * origin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOrigin() {
        return origin;
    }

    /**
     * origin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOrigin(Object value) {
        this.origin = value;
    }

    /**
     * destination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDestination() {
        return destination;
    }

    /**
     * destination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDestination(Object value) {
        this.destination = value;
    }

    /**
     * Gets the value of the fareDetailsPerGuest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDetailsPerGuest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDetailsPerGuest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDetailsType }
     * 
     * 
     */
    public List<FareDetailsType> getFareDetailsPerGuest() {
        if (fareDetailsPerGuest == null) {
            fareDetailsPerGuest = new ArrayList<FareDetailsType>();
        }
        return this.fareDetailsPerGuest;
    }

    /**
     * Gets the value of the taxDetailsPerGuest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDetailsPerGuest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDetailsPerGuest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetailsType }
     * 
     * 
     */
    public List<TaxDetailsType> getTaxDetailsPerGuest() {
        if (taxDetailsPerGuest == null) {
            taxDetailsPerGuest = new ArrayList<TaxDetailsType>();
        }
        return this.taxDetailsPerGuest;
    }

}
