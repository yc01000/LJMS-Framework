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
 *         &lt;element name="BookingChannel" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingChannelType"/&gt;
 *         &lt;element name="ItineraryDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItineraryDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalTripPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="BookDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CountryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumberOfPersons" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PreferredLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tripType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "itineraryDetails",
    "totalTripPrice",
    "bookDate",
    "countryOfResidence",
    "numberOfPersons",
    "preferredLanguage",
    "tripType",
    "currency"
})
@XmlRootElement(name = "ListInsuranceProductsRQ")
public class ListInsuranceProductsRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "BookingChannel", required = true)
    protected BookingChannelType bookingChannel;
    @XmlElement(name = "ItineraryDetails")
    protected List<ItineraryDetailsType> itineraryDetails;
    @XmlElement(name = "TotalTripPrice")
    protected double totalTripPrice;
    @XmlElement(name = "BookDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bookDate;
    @XmlElement(name = "CountryOfResidence", required = true)
    protected String countryOfResidence;
    @XmlElement(name = "NumberOfPersons")
    protected int numberOfPersons;
    @XmlElement(name = "PreferredLanguage", required = true)
    protected String preferredLanguage;
    protected Integer tripType;
    @XmlElement(name = "Currency", required = true)
    protected String currency;

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
     *     {@link BookingChannelType }
     *     
     */
    public BookingChannelType getBookingChannel() {
        return bookingChannel;
    }

    /**
     * bookingChannel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingChannelType }
     *     
     */
    public void setBookingChannel(BookingChannelType value) {
        this.bookingChannel = value;
    }

    /**
     * Gets the value of the itineraryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryDetailsType }
     * 
     * 
     */
    public List<ItineraryDetailsType> getItineraryDetails() {
        if (itineraryDetails == null) {
            itineraryDetails = new ArrayList<ItineraryDetailsType>();
        }
        return this.itineraryDetails;
    }

    /**
     * totalTripPrice 속성의 값을 가져옵니다.
     * 
     */
    public double getTotalTripPrice() {
        return totalTripPrice;
    }

    /**
     * totalTripPrice 속성의 값을 설정합니다.
     * 
     */
    public void setTotalTripPrice(double value) {
        this.totalTripPrice = value;
    }

    /**
     * bookDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookDate() {
        return bookDate;
    }

    /**
     * bookDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookDate(XMLGregorianCalendar value) {
        this.bookDate = value;
    }

    /**
     * countryOfResidence 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    /**
     * countryOfResidence 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfResidence(String value) {
        this.countryOfResidence = value;
    }

    /**
     * numberOfPersons 속성의 값을 가져옵니다.
     * 
     */
    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    /**
     * numberOfPersons 속성의 값을 설정합니다.
     * 
     */
    public void setNumberOfPersons(int value) {
        this.numberOfPersons = value;
    }

    /**
     * preferredLanguage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * preferredLanguage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredLanguage(String value) {
        this.preferredLanguage = value;
    }

    /**
     * tripType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTripType() {
        return tripType;
    }

    /**
     * tripType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTripType(Integer value) {
        this.tripType = value;
    }

    /**
     * currency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * currency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
