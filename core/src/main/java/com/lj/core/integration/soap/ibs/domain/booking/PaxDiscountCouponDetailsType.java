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
 * <p>PaxDiscountCouponDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaxDiscountCouponDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscountCouponID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SegmentGroupingID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxDiscountCouponDetailsType", propOrder = {
    "discountCouponID",
    "guestID",
    "segmentGroupingID"
})
public class PaxDiscountCouponDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "DiscountCouponID")
    protected String discountCouponID;
    @XmlElement(name = "GuestID", required = true)
    protected String guestID;
    @XmlElement(name = "SegmentGroupingID", required = true)
    protected String segmentGroupingID;

    /**
     * discountCouponID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountCouponID() {
        return discountCouponID;
    }

    /**
     * discountCouponID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountCouponID(String value) {
        this.discountCouponID = value;
    }

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
     * segmentGroupingID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentGroupingID() {
        return segmentGroupingID;
    }

    /**
     * segmentGroupingID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentGroupingID(String value) {
        this.segmentGroupingID = value;
    }

}
