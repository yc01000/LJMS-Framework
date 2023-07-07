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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>TripInfoType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TripInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SegmentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TripIndex" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="Route" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BaggageAllowanceRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripInfoType", propOrder = {
    "segmentInfo"
})
public class TripInfoType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "SegmentInfo")
    protected List<SegmentInfoType> segmentInfo;
    @XmlAttribute(name = "TripIndex")
    protected Long tripIndex;
    @XmlAttribute(name = "Route")
    protected String route;
    @XmlAttribute(name = "BaggageAllowanceRef")
    protected String baggageAllowanceRef;

    /**
     * Gets the value of the segmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentInfoType }
     * 
     * 
     */
    public List<SegmentInfoType> getSegmentInfo() {
        if (segmentInfo == null) {
            segmentInfo = new ArrayList<SegmentInfoType>();
        }
        return this.segmentInfo;
    }

    /**
     * tripIndex 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTripIndex() {
        return tripIndex;
    }

    /**
     * tripIndex 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTripIndex(Long value) {
        this.tripIndex = value;
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
     * baggageAllowanceRef 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageAllowanceRef() {
        return baggageAllowanceRef;
    }

    /**
     * baggageAllowanceRef 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageAllowanceRef(String value) {
        this.baggageAllowanceRef = value;
    }

}
