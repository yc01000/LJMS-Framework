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
 *         &lt;element name="AgencyCategory" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyCategoryType"/&gt;
 *         &lt;element name="LastModifiedStartDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedEndDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
    "agencyCategory",
    "lastModifiedStartDateAndTime",
    "lastModifiedEndDateAndTime"
})
@XmlRootElement(name = "RetrieveAgenciesRQ")
public class RetrieveAgenciesRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "BookingChannel", required = true)
    protected BookingChannelKeyType bookingChannel;
    @XmlElement(name = "AgencyCategory", required = true)
    @XmlSchemaType(name = "string")
    protected AgencyCategoryType agencyCategory;
    @XmlElement(name = "LastModifiedStartDateAndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedStartDateAndTime;
    @XmlElement(name = "LastModifiedEndDateAndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedEndDateAndTime;

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
     * agencyCategory 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AgencyCategoryType }
     *     
     */
    public AgencyCategoryType getAgencyCategory() {
        return agencyCategory;
    }

    /**
     * agencyCategory 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyCategoryType }
     *     
     */
    public void setAgencyCategory(AgencyCategoryType value) {
        this.agencyCategory = value;
    }

    /**
     * lastModifiedStartDateAndTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedStartDateAndTime() {
        return lastModifiedStartDateAndTime;
    }

    /**
     * lastModifiedStartDateAndTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedStartDateAndTime(XMLGregorianCalendar value) {
        this.lastModifiedStartDateAndTime = value;
    }

    /**
     * lastModifiedEndDateAndTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedEndDateAndTime() {
        return lastModifiedEndDateAndTime;
    }

    /**
     * lastModifiedEndDateAndTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedEndDateAndTime(XMLGregorianCalendar value) {
        this.lastModifiedEndDateAndTime = value;
    }

}
