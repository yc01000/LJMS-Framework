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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>NearBySearchType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="NearBySearchType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TravelDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="SpecificFlightDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PositiveDaysOut" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PreferredTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NegativeDaysOut" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailabilitySsr" type="{http://www.ibsplc.com/iRes/simpleTypes/}AvailabilitySsr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="canSearchNearbyOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canSearchNearbyDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BestFarePossitiveDaysOut" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BestFareNegativeDaysOut" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NearBySearchType", propOrder = {
    "origin",
    "destination",
    "travelDate",
    "specificFlightDetails",
    "positiveDaysOut",
    "preferredTimeOfDay",
    "negativeDaysOut",
    "cabinClass",
    "availabilitySsr",
    "canSearchNearbyOrigin",
    "canSearchNearbyDestination",
    "bestFarePossitiveDaysOut",
    "bestFareNegativeDaysOut"
})
public class NearBySearchType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Origin", required = true)
    protected String origin;
    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlElement(name = "TravelDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar travelDate;
    @XmlElement(name = "SpecificFlightDetails")
    protected String specificFlightDetails;
    @XmlElement(name = "PositiveDaysOut", defaultValue = "0")
    protected int positiveDaysOut;
    @XmlElement(name = "PreferredTimeOfDay")
    protected String preferredTimeOfDay;
    @XmlElement(name = "NegativeDaysOut", defaultValue = "0")
    protected int negativeDaysOut;
    @XmlElement(name = "CabinClass")
    protected String cabinClass;
    @XmlElement(name = "AvailabilitySsr")
    protected List<AvailabilitySsr> availabilitySsr;
    protected Boolean canSearchNearbyOrigin;
    protected Boolean canSearchNearbyDestination;
    @XmlElement(name = "BestFarePossitiveDaysOut", defaultValue = "0")
    protected int bestFarePossitiveDaysOut;
    @XmlElement(name = "BestFareNegativeDaysOut", defaultValue = "0")
    protected int bestFareNegativeDaysOut;

    /**
     * origin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * origin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * destination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * destination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * travelDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelDate() {
        return travelDate;
    }

    /**
     * travelDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelDate(XMLGregorianCalendar value) {
        this.travelDate = value;
    }

    /**
     * specificFlightDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificFlightDetails() {
        return specificFlightDetails;
    }

    /**
     * specificFlightDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificFlightDetails(String value) {
        this.specificFlightDetails = value;
    }

    /**
     * positiveDaysOut 속성의 값을 가져옵니다.
     * 
     */
    public int getPositiveDaysOut() {
        return positiveDaysOut;
    }

    /**
     * positiveDaysOut 속성의 값을 설정합니다.
     * 
     */
    public void setPositiveDaysOut(int value) {
        this.positiveDaysOut = value;
    }

    /**
     * preferredTimeOfDay 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredTimeOfDay() {
        return preferredTimeOfDay;
    }

    /**
     * preferredTimeOfDay 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredTimeOfDay(String value) {
        this.preferredTimeOfDay = value;
    }

    /**
     * negativeDaysOut 속성의 값을 가져옵니다.
     * 
     */
    public int getNegativeDaysOut() {
        return negativeDaysOut;
    }

    /**
     * negativeDaysOut 속성의 값을 설정합니다.
     * 
     */
    public void setNegativeDaysOut(int value) {
        this.negativeDaysOut = value;
    }

    /**
     * cabinClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * cabinClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

    /**
     * Gets the value of the availabilitySsr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availabilitySsr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailabilitySsr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailabilitySsr }
     * 
     * 
     */
    public List<AvailabilitySsr> getAvailabilitySsr() {
        if (availabilitySsr == null) {
            availabilitySsr = new ArrayList<AvailabilitySsr>();
        }
        return this.availabilitySsr;
    }

    /**
     * canSearchNearbyOrigin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanSearchNearbyOrigin() {
        return canSearchNearbyOrigin;
    }

    /**
     * canSearchNearbyOrigin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanSearchNearbyOrigin(Boolean value) {
        this.canSearchNearbyOrigin = value;
    }

    /**
     * canSearchNearbyDestination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanSearchNearbyDestination() {
        return canSearchNearbyDestination;
    }

    /**
     * canSearchNearbyDestination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanSearchNearbyDestination(Boolean value) {
        this.canSearchNearbyDestination = value;
    }

    /**
     * bestFarePossitiveDaysOut 속성의 값을 가져옵니다.
     * 
     */
    public int getBestFarePossitiveDaysOut() {
        return bestFarePossitiveDaysOut;
    }

    /**
     * bestFarePossitiveDaysOut 속성의 값을 설정합니다.
     * 
     */
    public void setBestFarePossitiveDaysOut(int value) {
        this.bestFarePossitiveDaysOut = value;
    }

    /**
     * bestFareNegativeDaysOut 속성의 값을 가져옵니다.
     * 
     */
    public int getBestFareNegativeDaysOut() {
        return bestFareNegativeDaysOut;
    }

    /**
     * bestFareNegativeDaysOut 속성의 값을 설정합니다.
     * 
     */
    public void setBestFareNegativeDaysOut(int value) {
        this.bestFareNegativeDaysOut = value;
    }

}
