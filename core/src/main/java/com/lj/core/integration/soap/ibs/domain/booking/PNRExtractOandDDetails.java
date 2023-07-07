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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>PNRExtractOandDDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PNRExtractOandDDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumberOfStops" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OandDID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="PNRExtractFlightSegmentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRExtractFlightSegmentDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element name="StandbyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlightNumbers" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNRExtractOandDDetails", propOrder = {
    "origin",
    "destination",
    "route",
    "numberOfStops",
    "oandDID",
    "pnrExtractFlightSegmentDetails",
    "standbyCode",
    "cabinClass",
    "flightNumbers"
})
public class PNRExtractOandDDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Origin", required = true)
    protected String origin;
    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlElement(name = "Route", required = true)
    protected String route;
    @XmlElement(name = "NumberOfStops")
    protected int numberOfStops;
    @XmlElement(name = "OandDID")
    protected long oandDID;
    @XmlElement(name = "PNRExtractFlightSegmentDetails", required = true)
    protected List<PNRExtractFlightSegmentDetails> pnrExtractFlightSegmentDetails;
    @XmlElement(name = "StandbyCode")
    protected String standbyCode;
    @XmlElement(name = "CabinClass", required = true)
    protected String cabinClass;
    @XmlElement(name = "FlightNumbers", required = true)
    protected String flightNumbers;

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
     * numberOfStops 속성의 값을 가져옵니다.
     * 
     */
    public int getNumberOfStops() {
        return numberOfStops;
    }

    /**
     * numberOfStops 속성의 값을 설정합니다.
     * 
     */
    public void setNumberOfStops(int value) {
        this.numberOfStops = value;
    }

    /**
     * oandDID 속성의 값을 가져옵니다.
     * 
     */
    public long getOandDID() {
        return oandDID;
    }

    /**
     * oandDID 속성의 값을 설정합니다.
     * 
     */
    public void setOandDID(long value) {
        this.oandDID = value;
    }

    /**
     * Gets the value of the pnrExtractFlightSegmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrExtractFlightSegmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPNRExtractFlightSegmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRExtractFlightSegmentDetails }
     * 
     * 
     */
    public List<PNRExtractFlightSegmentDetails> getPNRExtractFlightSegmentDetails() {
        if (pnrExtractFlightSegmentDetails == null) {
            pnrExtractFlightSegmentDetails = new ArrayList<PNRExtractFlightSegmentDetails>();
        }
        return this.pnrExtractFlightSegmentDetails;
    }

    /**
     * standbyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandbyCode() {
        return standbyCode;
    }

    /**
     * standbyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandbyCode(String value) {
        this.standbyCode = value;
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
     * flightNumbers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumbers() {
        return flightNumbers;
    }

    /**
     * flightNumbers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumbers(String value) {
        this.flightNumbers = value;
    }

}
