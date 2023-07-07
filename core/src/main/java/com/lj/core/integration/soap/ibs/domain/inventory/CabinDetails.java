//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2020.12.01 시간 08:47:33 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.inventory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>CabinDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CabinDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Destinaton" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CabinCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CabinSaleStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareClasses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LegFareClassDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}LegFareClassDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LegSequenceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SegmentFareClassDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentFareClassDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinDetails", propOrder = {
    "origin",
    "destinaton",
    "cabinCode",
    "cabinSaleStatus",
    "fareClasses",
    "legFareClassDetails",
    "legSequenceId",
    "segmentFareClassDetails"
})
public class CabinDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Origin", required = true)
    protected String origin;
    @XmlElement(name = "Destinaton", required = true)
    protected String destinaton;
    @XmlElement(name = "CabinCode", required = true)
    protected String cabinCode;
    @XmlElement(name = "CabinSaleStatus")
    protected String cabinSaleStatus;
    @XmlElement(name = "FareClasses")
    protected String fareClasses;
    @XmlElement(name = "LegFareClassDetails")
    protected List<LegFareClassDetails> legFareClassDetails;
    @XmlElement(name = "LegSequenceId")
    protected Integer legSequenceId;
    @XmlElement(name = "SegmentFareClassDetails")
    protected List<SegmentFareClassDetails> segmentFareClassDetails;

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
     * destinaton 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinaton() {
        return destinaton;
    }

    /**
     * destinaton 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinaton(String value) {
        this.destinaton = value;
    }

    /**
     * cabinCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinCode() {
        return cabinCode;
    }

    /**
     * cabinCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinCode(String value) {
        this.cabinCode = value;
    }

    /**
     * cabinSaleStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinSaleStatus() {
        return cabinSaleStatus;
    }

    /**
     * cabinSaleStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinSaleStatus(String value) {
        this.cabinSaleStatus = value;
    }

    /**
     * fareClasses 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareClasses() {
        return fareClasses;
    }

    /**
     * fareClasses 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareClasses(String value) {
        this.fareClasses = value;
    }

    /**
     * Gets the value of the legFareClassDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legFareClassDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegFareClassDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegFareClassDetails }
     * 
     * 
     */
    public List<LegFareClassDetails> getLegFareClassDetails() {
        if (legFareClassDetails == null) {
            legFareClassDetails = new ArrayList<LegFareClassDetails>();
        }
        return this.legFareClassDetails;
    }

    /**
     * legSequenceId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLegSequenceId() {
        return legSequenceId;
    }

    /**
     * legSequenceId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLegSequenceId(Integer value) {
        this.legSequenceId = value;
    }

    /**
     * Gets the value of the segmentFareClassDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentFareClassDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentFareClassDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentFareClassDetails }
     * 
     * 
     */
    public List<SegmentFareClassDetails> getSegmentFareClassDetails() {
        if (segmentFareClassDetails == null) {
            segmentFareClassDetails = new ArrayList<SegmentFareClassDetails>();
        }
        return this.segmentFareClassDetails;
    }

}
