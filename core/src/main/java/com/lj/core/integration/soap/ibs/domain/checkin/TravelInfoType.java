//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Travel Related Info
 * 
 * <p>TravelInfoType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TravelInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightIdentifierType" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierType"/&gt;
 *         &lt;element name="segmentType" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentInfo"/&gt;
 *         &lt;element name="FlightStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ETD" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="STD" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ETA" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="STA" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CheckinStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}CheckinStatusType" minOccurs="0"/&gt;
 *         &lt;element name="BoardingStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}BoardingStatusType" minOccurs="0"/&gt;
 *         &lt;element name="SeatNumber" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatNumberType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelInfoType", propOrder = {
    "flightIdentifierType",
    "segmentType",
    "flightStatus",
    "etd",
    "std",
    "eta",
    "sta",
    "sequenceNumber",
    "checkinStatus",
    "boardingStatus",
    "seatNumber"
})
public class TravelInfoType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected FlightIdentifierType flightIdentifierType;
    @XmlElement(required = true)
    protected SegmentInfo segmentType;
    @XmlElement(name = "FlightStatus")
    protected String flightStatus;
    @XmlElement(name = "ETD")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar etd;
    @XmlElement(name = "STD")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar std;
    @XmlElement(name = "ETA")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eta;
    @XmlElement(name = "STA")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sta;
    @XmlElement(name = "SequenceNumber")
    protected BigInteger sequenceNumber;
    @XmlElement(name = "CheckinStatus")
    @XmlSchemaType(name = "string")
    protected CheckinStatusType checkinStatus;
    @XmlElement(name = "BoardingStatus")
    @XmlSchemaType(name = "string")
    protected BoardingStatusType boardingStatus;
    @XmlElement(name = "SeatNumber")
    protected List<SeatNumberType> seatNumber;

    /**
     * flightIdentifierType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightIdentifierType }
     *     
     */
    public FlightIdentifierType getFlightIdentifierType() {
        return flightIdentifierType;
    }

    /**
     * flightIdentifierType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightIdentifierType }
     *     
     */
    public void setFlightIdentifierType(FlightIdentifierType value) {
        this.flightIdentifierType = value;
    }

    /**
     * segmentType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SegmentInfo }
     *     
     */
    public SegmentInfo getSegmentType() {
        return segmentType;
    }

    /**
     * segmentType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentInfo }
     *     
     */
    public void setSegmentType(SegmentInfo value) {
        this.segmentType = value;
    }

    /**
     * flightStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightStatus() {
        return flightStatus;
    }

    /**
     * flightStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightStatus(String value) {
        this.flightStatus = value;
    }

    /**
     * etd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETD() {
        return etd;
    }

    /**
     * etd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETD(XMLGregorianCalendar value) {
        this.etd = value;
    }

    /**
     * std 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTD() {
        return std;
    }

    /**
     * std 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTD(XMLGregorianCalendar value) {
        this.std = value;
    }

    /**
     * eta 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETA() {
        return eta;
    }

    /**
     * eta 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETA(XMLGregorianCalendar value) {
        this.eta = value;
    }

    /**
     * sta 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTA() {
        return sta;
    }

    /**
     * sta 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTA(XMLGregorianCalendar value) {
        this.sta = value;
    }

    /**
     * sequenceNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * sequenceNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * checkinStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CheckinStatusType }
     *     
     */
    public CheckinStatusType getCheckinStatus() {
        return checkinStatus;
    }

    /**
     * checkinStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckinStatusType }
     *     
     */
    public void setCheckinStatus(CheckinStatusType value) {
        this.checkinStatus = value;
    }

    /**
     * boardingStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BoardingStatusType }
     *     
     */
    public BoardingStatusType getBoardingStatus() {
        return boardingStatus;
    }

    /**
     * boardingStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingStatusType }
     *     
     */
    public void setBoardingStatus(BoardingStatusType value) {
        this.boardingStatus = value;
    }

    /**
     * Gets the value of the seatNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatNumberType }
     * 
     * 
     */
    public List<SeatNumberType> getSeatNumber() {
        if (seatNumber == null) {
            seatNumber = new ArrayList<SeatNumberType>();
        }
        return this.seatNumber;
    }

}
