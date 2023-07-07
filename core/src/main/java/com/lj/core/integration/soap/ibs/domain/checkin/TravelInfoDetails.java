//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Travel Related Info
 * 
 * <p>TravelInfoDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TravelInfoDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightIdentifierType" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="segmentType" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelInfoDetails", propOrder = {
    "flightIdentifierType",
    "segmentType"
})
public class TravelInfoDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected FlightIdentifierType flightIdentifierType;
    protected SegmentInfo segmentType;

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

}
