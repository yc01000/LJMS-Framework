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


/**
 * <p>GuestCheckInInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GuestCheckInInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeatNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckInStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}CheckInStatus" minOccurs="0"/&gt;
 *         &lt;element name="SeatId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestCheckInInfo", propOrder = {
    "segmentId",
    "seatNumbers",
    "checkInStatus",
    "seatId"
})
public class GuestCheckInInfo
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "SegmentId")
    protected String segmentId;
    @XmlElement(name = "SeatNumbers")
    protected String seatNumbers;
    @XmlElement(name = "CheckInStatus")
    @XmlSchemaType(name = "string")
    protected CheckInStatus checkInStatus;
    @XmlElement(name = "SeatId")
    protected Long seatId;

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
     * seatNumbers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumbers() {
        return seatNumbers;
    }

    /**
     * seatNumbers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumbers(String value) {
        this.seatNumbers = value;
    }

    /**
     * checkInStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CheckInStatus }
     *     
     */
    public CheckInStatus getCheckInStatus() {
        return checkInStatus;
    }

    /**
     * checkInStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckInStatus }
     *     
     */
    public void setCheckInStatus(CheckInStatus value) {
        this.checkInStatus = value;
    }

    /**
     * seatId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeatId() {
        return seatId;
    }

    /**
     * seatId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeatId(Long value) {
        this.seatId = value;
    }

}
