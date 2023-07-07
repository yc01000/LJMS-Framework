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
 * <p>SeatAllocationDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SeatAllocationDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuestSeatDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestSeatDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ChildBoardPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChildOffPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FlightIdentifier" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierType"/&gt;
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OandDId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatAllocationDetails", propOrder = {
    "guestSeatDetails",
    "origin",
    "destination",
    "childBoardPoint",
    "childOffPoint",
    "flightIdentifier",
    "segmentId",
    "oandDId"
})
public class SeatAllocationDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "GuestSeatDetails", required = true)
    protected List<GuestSeatDetails> guestSeatDetails;
    @XmlElement(name = "Origin", required = true)
    protected String origin;
    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlElement(name = "ChildBoardPoint")
    protected String childBoardPoint;
    @XmlElement(name = "ChildOffPoint")
    protected String childOffPoint;
    @XmlElement(name = "FlightIdentifier", required = true)
    protected FlightIdentifierType flightIdentifier;
    @XmlElement(name = "SegmentId", required = true)
    protected String segmentId;
    @XmlElement(name = "OandDId", required = true)
    protected String oandDId;

    /**
     * Gets the value of the guestSeatDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestSeatDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestSeatDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestSeatDetails }
     * 
     * 
     */
    public List<GuestSeatDetails> getGuestSeatDetails() {
        if (guestSeatDetails == null) {
            guestSeatDetails = new ArrayList<GuestSeatDetails>();
        }
        return this.guestSeatDetails;
    }

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
     * childBoardPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildBoardPoint() {
        return childBoardPoint;
    }

    /**
     * childBoardPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildBoardPoint(String value) {
        this.childBoardPoint = value;
    }

    /**
     * childOffPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildOffPoint() {
        return childOffPoint;
    }

    /**
     * childOffPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildOffPoint(String value) {
        this.childOffPoint = value;
    }

    /**
     * flightIdentifier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightIdentifierType }
     *     
     */
    public FlightIdentifierType getFlightIdentifier() {
        return flightIdentifier;
    }

    /**
     * flightIdentifier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightIdentifierType }
     *     
     */
    public void setFlightIdentifier(FlightIdentifierType value) {
        this.flightIdentifier = value;
    }

    /**
     * segmentId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * segmentId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentId(String value) {
        this.segmentId = value;
    }

    /**
     * oandDId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOandDId() {
        return oandDId;
    }

    /**
     * oandDId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOandDId(String value) {
        this.oandDId = value;
    }

}
