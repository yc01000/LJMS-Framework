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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>OldSeatAllocationDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="OldSeatAllocationDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuestID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ChildBoardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ChildOffPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BoardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OffPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SeatAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExstCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SeatStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "OldSeatAllocationDetails", propOrder = {
    "guestID",
    "childBoardPoint",
    "childOffPoint",
    "seatNumber",
    "boardPoint",
    "offPoint",
    "seatAttribute",
    "exstCount",
    "segmentId",
    "seatStatus",
    "seatId"
})
public class OldSeatAllocationDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "GuestID", required = true)
    protected String guestID;
    @XmlElement(name = "ChildBoardPoint", required = true)
    protected String childBoardPoint;
    @XmlElement(name = "ChildOffPoint", required = true)
    protected String childOffPoint;
    @XmlElement(name = "SeatNumber")
    protected String seatNumber;
    @XmlElement(name = "BoardPoint", required = true)
    protected String boardPoint;
    @XmlElement(name = "OffPoint", required = true)
    protected String offPoint;
    @XmlElement(name = "SeatAttribute")
    protected String seatAttribute;
    @XmlElement(name = "ExstCount")
    protected Integer exstCount;
    @XmlElement(name = "SegmentId")
    protected long segmentId;
    @XmlElement(name = "SeatStatus")
    protected String seatStatus;
    @XmlElement(name = "SeatId")
    protected Long seatId;

    /**
     * guestID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestID() {
        return guestID;
    }

    /**
     * guestID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestID(String value) {
        this.guestID = value;
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
     * seatNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * seatNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
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
     * seatAttribute 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatAttribute() {
        return seatAttribute;
    }

    /**
     * seatAttribute 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatAttribute(String value) {
        this.seatAttribute = value;
    }

    /**
     * exstCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExstCount() {
        return exstCount;
    }

    /**
     * exstCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExstCount(Integer value) {
        this.exstCount = value;
    }

    /**
     * segmentId 속성의 값을 가져옵니다.
     * 
     */
    public long getSegmentId() {
        return segmentId;
    }

    /**
     * segmentId 속성의 값을 설정합니다.
     * 
     */
    public void setSegmentId(long value) {
        this.segmentId = value;
    }

    /**
     * seatStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatStatus() {
        return seatStatus;
    }

    /**
     * seatStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatStatus(String value) {
        this.seatStatus = value;
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
