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
 * <p>PricingInfoType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PricingInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaxPricingInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxPricingInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PricingComponentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}PricingComponentInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SegmentReferenceInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentReferenceInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TripRefIndex" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="RichContentRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OfferTLRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AncillaryServicesRefIndex" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingInfoType", propOrder = {
    "paxPricingInfo",
    "pricingComponentInfo",
    "segmentReferenceInfo"
})
public class PricingInfoType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PaxPricingInfo")
    protected List<PaxPricingInfoType> paxPricingInfo;
    @XmlElement(name = "PricingComponentInfo")
    protected List<PricingComponentInfoType> pricingComponentInfo;
    @XmlElement(name = "SegmentReferenceInfo")
    protected List<SegmentReferenceInfoType> segmentReferenceInfo;
    @XmlAttribute(name = "TripRefIndex")
    protected Long tripRefIndex;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;
    @XmlAttribute(name = "OfferTLRef")
    protected String offerTLRef;
    @XmlAttribute(name = "AncillaryServicesRefIndex")
    protected Long ancillaryServicesRefIndex;

    /**
     * Gets the value of the paxPricingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxPricingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxPricingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxPricingInfoType }
     * 
     * 
     */
    public List<PaxPricingInfoType> getPaxPricingInfo() {
        if (paxPricingInfo == null) {
            paxPricingInfo = new ArrayList<PaxPricingInfoType>();
        }
        return this.paxPricingInfo;
    }

    /**
     * Gets the value of the pricingComponentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingComponentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingComponentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingComponentInfoType }
     * 
     * 
     */
    public List<PricingComponentInfoType> getPricingComponentInfo() {
        if (pricingComponentInfo == null) {
            pricingComponentInfo = new ArrayList<PricingComponentInfoType>();
        }
        return this.pricingComponentInfo;
    }

    /**
     * Gets the value of the segmentReferenceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentReferenceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentReferenceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentReferenceInfoType }
     * 
     * 
     */
    public List<SegmentReferenceInfoType> getSegmentReferenceInfo() {
        if (segmentReferenceInfo == null) {
            segmentReferenceInfo = new ArrayList<SegmentReferenceInfoType>();
        }
        return this.segmentReferenceInfo;
    }

    /**
     * tripRefIndex 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTripRefIndex() {
        return tripRefIndex;
    }

    /**
     * tripRefIndex 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTripRefIndex(Long value) {
        this.tripRefIndex = value;
    }

    /**
     * richContentRef 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRichContentRef() {
        return richContentRef;
    }

    /**
     * richContentRef 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRichContentRef(String value) {
        this.richContentRef = value;
    }

    /**
     * offerTLRef 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferTLRef() {
        return offerTLRef;
    }

    /**
     * offerTLRef 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferTLRef(String value) {
        this.offerTLRef = value;
    }

    /**
     * ancillaryServicesRefIndex 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAncillaryServicesRefIndex() {
        return ancillaryServicesRefIndex;
    }

    /**
     * ancillaryServicesRefIndex 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAncillaryServicesRefIndex(Long value) {
        this.ancillaryServicesRefIndex = value;
    }

}
