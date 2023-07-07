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
 * <p>GuestCouponDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GuestCouponDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CouponStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotValidBefore" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyDetailsType"/&gt;
 *         &lt;element name="NotValidAfter" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyDetailsType"/&gt;
 *         &lt;element name="BaggageAllowance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="boardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="offPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestCouponDetailsType", propOrder = {
    "couponNumber",
    "couponStatus",
    "notValidBefore",
    "notValidAfter",
    "baggageAllowance",
    "boardPoint",
    "offPoint",
    "segmentId"
})
public class GuestCouponDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "CouponNumber", required = true)
    protected String couponNumber;
    @XmlElement(name = "CouponStatus")
    protected String couponStatus;
    @XmlElement(name = "NotValidBefore", required = true)
    protected DateOnlyDetailsType notValidBefore;
    @XmlElement(name = "NotValidAfter", required = true)
    protected DateOnlyDetailsType notValidAfter;
    @XmlElement(name = "BaggageAllowance", required = true)
    protected String baggageAllowance;
    @XmlElement(required = true)
    protected String boardPoint;
    @XmlElement(required = true)
    protected String offPoint;
    @XmlElement(name = "SegmentId")
    protected long segmentId;

    /**
     * couponNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponNumber() {
        return couponNumber;
    }

    /**
     * couponNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponNumber(String value) {
        this.couponNumber = value;
    }

    /**
     * couponStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponStatus() {
        return couponStatus;
    }

    /**
     * couponStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponStatus(String value) {
        this.couponStatus = value;
    }

    /**
     * notValidBefore 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyDetailsType }
     *     
     */
    public DateOnlyDetailsType getNotValidBefore() {
        return notValidBefore;
    }

    /**
     * notValidBefore 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyDetailsType }
     *     
     */
    public void setNotValidBefore(DateOnlyDetailsType value) {
        this.notValidBefore = value;
    }

    /**
     * notValidAfter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyDetailsType }
     *     
     */
    public DateOnlyDetailsType getNotValidAfter() {
        return notValidAfter;
    }

    /**
     * notValidAfter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyDetailsType }
     *     
     */
    public void setNotValidAfter(DateOnlyDetailsType value) {
        this.notValidAfter = value;
    }

    /**
     * baggageAllowance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageAllowance() {
        return baggageAllowance;
    }

    /**
     * baggageAllowance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageAllowance(String value) {
        this.baggageAllowance = value;
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

}
