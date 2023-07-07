//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2020.12.01 시간 08:47:33 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.inventory;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>SegmentFareClassDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SegmentFareClassDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FareClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LegAULimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SegmentSaleableSeats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SegmentSoldSeats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SegmentRemainingSeats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentFareClassDetails", propOrder = {
    "fareClassCode",
    "legAULimit",
    "segmentSaleableSeats",
    "segmentSoldSeats",
    "segmentRemainingSeats"
})
public class SegmentFareClassDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FareClassCode")
    protected String fareClassCode;
    @XmlElement(name = "LegAULimit")
    protected int legAULimit;
    @XmlElement(name = "SegmentSaleableSeats")
    protected int segmentSaleableSeats;
    @XmlElement(name = "SegmentSoldSeats")
    protected int segmentSoldSeats;
    @XmlElement(name = "SegmentRemainingSeats")
    protected int segmentRemainingSeats;

    /**
     * fareClassCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareClassCode() {
        return fareClassCode;
    }

    /**
     * fareClassCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareClassCode(String value) {
        this.fareClassCode = value;
    }

    /**
     * legAULimit 속성의 값을 가져옵니다.
     * 
     */
    public int getLegAULimit() {
        return legAULimit;
    }

    /**
     * legAULimit 속성의 값을 설정합니다.
     * 
     */
    public void setLegAULimit(int value) {
        this.legAULimit = value;
    }

    /**
     * segmentSaleableSeats 속성의 값을 가져옵니다.
     * 
     */
    public int getSegmentSaleableSeats() {
        return segmentSaleableSeats;
    }

    /**
     * segmentSaleableSeats 속성의 값을 설정합니다.
     * 
     */
    public void setSegmentSaleableSeats(int value) {
        this.segmentSaleableSeats = value;
    }

    /**
     * segmentSoldSeats 속성의 값을 가져옵니다.
     * 
     */
    public int getSegmentSoldSeats() {
        return segmentSoldSeats;
    }

    /**
     * segmentSoldSeats 속성의 값을 설정합니다.
     * 
     */
    public void setSegmentSoldSeats(int value) {
        this.segmentSoldSeats = value;
    }

    /**
     * segmentRemainingSeats 속성의 값을 가져옵니다.
     * 
     */
    public int getSegmentRemainingSeats() {
        return segmentRemainingSeats;
    }

    /**
     * segmentRemainingSeats 속성의 값을 설정합니다.
     * 
     */
    public void setSegmentRemainingSeats(int value) {
        this.segmentRemainingSeats = value;
    }

}
