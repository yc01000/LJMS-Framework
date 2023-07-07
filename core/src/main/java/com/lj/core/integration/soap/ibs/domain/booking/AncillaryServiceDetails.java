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
 * <p>AncillaryServiceDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AncillaryServiceDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncludedAncillariesInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}IncludedAncillariesInfo" maxOccurs="unbounded"/&gt;
 *         &lt;element name="AncillaryFeeInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}AncillaryFeeInfo"/&gt;
 *         &lt;element name="AncillarySegmentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}AncillarySegmentInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ServiceCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ServiceName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ServiceCategory" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsBundle" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BundlePriority" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RichContentRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryServiceDetails", propOrder = {
    "includedAncillariesInfo",
    "ancillaryFeeInfo",
    "ancillarySegmentInfo"
})
public class AncillaryServiceDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "IncludedAncillariesInfo", required = true)
    protected List<IncludedAncillariesInfo> includedAncillariesInfo;
    @XmlElement(name = "AncillaryFeeInfo", required = true)
    protected AncillaryFeeInfo ancillaryFeeInfo;
    @XmlElement(name = "AncillarySegmentInfo", required = true)
    protected List<AncillarySegmentInfo> ancillarySegmentInfo;
    @XmlAttribute(name = "ServiceCode", required = true)
    protected String serviceCode;
    @XmlAttribute(name = "ServiceName", required = true)
    protected String serviceName;
    @XmlAttribute(name = "ServiceCategory", required = true)
    protected String serviceCategory;
    @XmlAttribute(name = "IsBundle", required = true)
    protected boolean isBundle;
    @XmlAttribute(name = "BundlePriority", required = true)
    protected String bundlePriority;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;

    /**
     * Gets the value of the includedAncillariesInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedAncillariesInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedAncillariesInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncludedAncillariesInfo }
     * 
     * 
     */
    public List<IncludedAncillariesInfo> getIncludedAncillariesInfo() {
        if (includedAncillariesInfo == null) {
            includedAncillariesInfo = new ArrayList<IncludedAncillariesInfo>();
        }
        return this.includedAncillariesInfo;
    }

    /**
     * ancillaryFeeInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryFeeInfo }
     *     
     */
    public AncillaryFeeInfo getAncillaryFeeInfo() {
        return ancillaryFeeInfo;
    }

    /**
     * ancillaryFeeInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryFeeInfo }
     *     
     */
    public void setAncillaryFeeInfo(AncillaryFeeInfo value) {
        this.ancillaryFeeInfo = value;
    }

    /**
     * Gets the value of the ancillarySegmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillarySegmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillarySegmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillarySegmentInfo }
     * 
     * 
     */
    public List<AncillarySegmentInfo> getAncillarySegmentInfo() {
        if (ancillarySegmentInfo == null) {
            ancillarySegmentInfo = new ArrayList<AncillarySegmentInfo>();
        }
        return this.ancillarySegmentInfo;
    }

    /**
     * serviceCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * serviceCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * serviceName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * serviceName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * serviceCategory 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCategory() {
        return serviceCategory;
    }

    /**
     * serviceCategory 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCategory(String value) {
        this.serviceCategory = value;
    }

    /**
     * isBundle 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsBundle() {
        return isBundle;
    }

    /**
     * isBundle 속성의 값을 설정합니다.
     * 
     */
    public void setIsBundle(boolean value) {
        this.isBundle = value;
    }

    /**
     * bundlePriority 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundlePriority() {
        return bundlePriority;
    }

    /**
     * bundlePriority 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundlePriority(String value) {
        this.bundlePriority = value;
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

}
