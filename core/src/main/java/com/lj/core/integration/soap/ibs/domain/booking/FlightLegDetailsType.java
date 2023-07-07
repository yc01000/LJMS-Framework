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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>FlightLegDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FlightLegDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightIdentifer" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierType"/&gt;
 *         &lt;element name="boardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="offPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="scheduledDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="scheduledArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="journeyTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aircraftType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remainingSeats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="arrivalDayChange" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightLegDetailsType", propOrder = {
    "flightIdentifer",
    "boardPoint",
    "offPoint",
    "scheduledDepartureTime",
    "scheduledArrivalTime",
    "journeyTime",
    "aircraftType",
    "remainingSeats",
    "arrivalDayChange"
})
public class FlightLegDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected FlightIdentifierType flightIdentifer;
    @XmlElement(required = true)
    protected String boardPoint;
    @XmlElement(required = true)
    protected String offPoint;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDepartureTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledArrivalTime;
    @XmlElement(required = true)
    protected String journeyTime;
    protected String aircraftType;
    protected int remainingSeats;
    protected int arrivalDayChange;

    /**
     * flightIdentifer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightIdentifierType }
     *     
     */
    public FlightIdentifierType getFlightIdentifer() {
        return flightIdentifer;
    }

    /**
     * flightIdentifer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightIdentifierType }
     *     
     */
    public void setFlightIdentifer(FlightIdentifierType value) {
        this.flightIdentifer = value;
    }

    /**
     * boardPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardPoint() {
        return boardPoint;
    }

    /**
     * boardPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardPoint(String value) {
        this.boardPoint = value;
    }

    /**
     * offPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPoint() {
        return offPoint;
    }

    /**
     * offPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPoint(String value) {
        this.offPoint = value;
    }

    /**
     * scheduledDepartureTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDepartureTime() {
        return scheduledDepartureTime;
    }

    /**
     * scheduledDepartureTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDepartureTime(XMLGregorianCalendar value) {
        this.scheduledDepartureTime = value;
    }

    /**
     * scheduledArrivalTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledArrivalTime() {
        return scheduledArrivalTime;
    }

    /**
     * scheduledArrivalTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledArrivalTime(XMLGregorianCalendar value) {
        this.scheduledArrivalTime = value;
    }

    /**
     * journeyTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyTime() {
        return journeyTime;
    }

    /**
     * journeyTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyTime(String value) {
        this.journeyTime = value;
    }

    /**
     * aircraftType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftType() {
        return aircraftType;
    }

    /**
     * aircraftType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftType(String value) {
        this.aircraftType = value;
    }

    /**
     * remainingSeats 속성의 값을 가져옵니다.
     * 
     */
    public int getRemainingSeats() {
        return remainingSeats;
    }

    /**
     * remainingSeats 속성의 값을 설정합니다.
     * 
     */
    public void setRemainingSeats(int value) {
        this.remainingSeats = value;
    }

    /**
     * arrivalDayChange 속성의 값을 가져옵니다.
     * 
     */
    public int getArrivalDayChange() {
        return arrivalDayChange;
    }

    /**
     * arrivalDayChange 속성의 값을 설정합니다.
     * 
     */
    public void setArrivalDayChange(int value) {
        this.arrivalDayChange = value;
    }

}
