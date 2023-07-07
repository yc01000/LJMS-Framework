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
 * <p>PricingComponentInfoType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PricingComponentInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaxBaseFare" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxBaseFareType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SegmentLinkInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentLinkInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PricingComponentIndex" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="FareLevel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FareSubType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsReturnRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FareId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingComponentInfoType", propOrder = {
    "paxBaseFare",
    "segmentLinkInfo"
})
public class PricingComponentInfoType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PaxBaseFare")
    protected List<PaxBaseFareType> paxBaseFare;
    @XmlElement(name = "SegmentLinkInfo")
    protected List<SegmentLinkInfoType> segmentLinkInfo;
    @XmlAttribute(name = "PricingComponentIndex")
    protected Long pricingComponentIndex;
    @XmlAttribute(name = "FareLevel")
    protected String fareLevel;
    @XmlAttribute(name = "FareBasis")
    protected String fareBasis;
    @XmlAttribute(name = "FareType")
    protected String fareType;
    @XmlAttribute(name = "FareSubType")
    protected String fareSubType;
    @XmlAttribute(name = "IsReturnRestricted")
    protected Boolean isReturnRestricted;
    @XmlAttribute(name = "FareId")
    protected String fareId;

    /**
     * Gets the value of the paxBaseFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxBaseFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxBaseFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxBaseFareType }
     * 
     * 
     */
    public List<PaxBaseFareType> getPaxBaseFare() {
        if (paxBaseFare == null) {
            paxBaseFare = new ArrayList<PaxBaseFareType>();
        }
        return this.paxBaseFare;
    }

    /**
     * Gets the value of the segmentLinkInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentLinkInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentLinkInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentLinkInfoType }
     * 
     * 
     */
    public List<SegmentLinkInfoType> getSegmentLinkInfo() {
        if (segmentLinkInfo == null) {
            segmentLinkInfo = new ArrayList<SegmentLinkInfoType>();
        }
        return this.segmentLinkInfo;
    }

    /**
     * pricingComponentIndex 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPricingComponentIndex() {
        return pricingComponentIndex;
    }

    /**
     * pricingComponentIndex 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPricingComponentIndex(Long value) {
        this.pricingComponentIndex = value;
    }

    /**
     * fareLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareLevel() {
        return fareLevel;
    }

    /**
     * fareLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareLevel(String value) {
        this.fareLevel = value;
    }

    /**
     * fareBasis 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * fareBasis 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

    /**
     * fareType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareType() {
        return fareType;
    }

    /**
     * fareType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareType(String value) {
        this.fareType = value;
    }

    /**
     * fareSubType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareSubType() {
        return fareSubType;
    }

    /**
     * fareSubType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareSubType(String value) {
        this.fareSubType = value;
    }

    /**
     * isReturnRestricted 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReturnRestricted() {
        return isReturnRestricted;
    }

    /**
     * isReturnRestricted 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReturnRestricted(Boolean value) {
        this.isReturnRestricted = value;
    }

    /**
     * fareId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareId() {
        return fareId;
    }

    /**
     * fareId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareId(String value) {
        this.fareId = value;
    }

}
