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
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Ancillary complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Ancillary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceKeyword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SettlementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RFICCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RFICSubCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FeeMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncludedAncillaries" type="{http://www.ibsplc.com/iRes/simpleTypes/}IncludedAncillariesType" minOccurs="0"/&gt;
 *         &lt;element name="SubSSRList" type="{http://www.ibsplc.com/iRes/simpleTypes/}SubSSRListType" minOccurs="0"/&gt;
 *         &lt;element name="Fee" type="{http://www.ibsplc.com/iRes/simpleTypes/}Fee" minOccurs="0"/&gt;
 *         &lt;element name="Tax" type="{http://www.ibsplc.com/iRes/simpleTypes/}Tax" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AncillarySegmentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AncillarySegmentDetailType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IsSubSsrPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsBundle" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BundlePriority" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsFeePresent" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RichContentRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MetaDataRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PaxRefID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ancillary", propOrder = {
    "serviceCode",
    "serviceName",
    "serviceCategory",
    "serviceKeyword",
    "settlementCode",
    "rficCode",
    "rficSubCode",
    "feeMethod",
    "subCodeDescription",
    "includedAncillaries",
    "subSSRList",
    "fee",
    "tax",
    "ancillarySegmentDetails"
})
public class Ancillary
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;
    @XmlElement(name = "ServiceName", required = true)
    protected String serviceName;
    @XmlElement(name = "ServiceCategory")
    protected String serviceCategory;
    @XmlElement(name = "ServiceKeyword", required = true)
    protected String serviceKeyword;
    @XmlElement(name = "SettlementCode")
    protected String settlementCode;
    @XmlElement(name = "RFICCode")
    protected String rficCode;
    @XmlElement(name = "RFICSubCode", required = true)
    protected String rficSubCode;
    @XmlElement(name = "FeeMethod")
    protected String feeMethod;
    @XmlElement(name = "SubCodeDescription")
    protected String subCodeDescription;
    @XmlElement(name = "IncludedAncillaries")
    protected IncludedAncillariesType includedAncillaries;
    @XmlElement(name = "SubSSRList")
    protected SubSSRListType subSSRList;
    @XmlElement(name = "Fee")
    protected Fee fee;
    @XmlElement(name = "Tax")
    protected List<Tax> tax;
    @XmlElement(name = "AncillarySegmentDetails", required = true)
    protected List<AncillarySegmentDetailType> ancillarySegmentDetails;
    @XmlAttribute(name = "IsSubSsrPresent")
    protected Boolean isSubSsrPresent;
    @XmlAttribute(name = "IsBundle")
    protected Boolean isBundle;
    @XmlAttribute(name = "BundlePriority")
    protected String bundlePriority;
    @XmlAttribute(name = "IsFeePresent")
    protected Boolean isFeePresent;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;
    @XmlAttribute(name = "MetaDataRef")
    protected String metaDataRef;
    @XmlAttribute(name = "PaxRefID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> paxRefID;

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
     * serviceKeyword 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceKeyword() {
        return serviceKeyword;
    }

    /**
     * serviceKeyword 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceKeyword(String value) {
        this.serviceKeyword = value;
    }

    /**
     * settlementCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementCode() {
        return settlementCode;
    }

    /**
     * settlementCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementCode(String value) {
        this.settlementCode = value;
    }

    /**
     * rficCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFICCode() {
        return rficCode;
    }

    /**
     * rficCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFICCode(String value) {
        this.rficCode = value;
    }

    /**
     * rficSubCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFICSubCode() {
        return rficSubCode;
    }

    /**
     * rficSubCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFICSubCode(String value) {
        this.rficSubCode = value;
    }

    /**
     * feeMethod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeMethod() {
        return feeMethod;
    }

    /**
     * feeMethod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeMethod(String value) {
        this.feeMethod = value;
    }

    /**
     * subCodeDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCodeDescription() {
        return subCodeDescription;
    }

    /**
     * subCodeDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCodeDescription(String value) {
        this.subCodeDescription = value;
    }

    /**
     * includedAncillaries 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link IncludedAncillariesType }
     *     
     */
    public IncludedAncillariesType getIncludedAncillaries() {
        return includedAncillaries;
    }

    /**
     * includedAncillaries 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludedAncillariesType }
     *     
     */
    public void setIncludedAncillaries(IncludedAncillariesType value) {
        this.includedAncillaries = value;
    }

    /**
     * subSSRList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SubSSRListType }
     *     
     */
    public SubSSRListType getSubSSRList() {
        return subSSRList;
    }

    /**
     * subSSRList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SubSSRListType }
     *     
     */
    public void setSubSSRList(SubSSRListType value) {
        this.subSSRList = value;
    }

    /**
     * fee 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Fee }
     *     
     */
    public Fee getFee() {
        return fee;
    }

    /**
     * fee 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Fee }
     *     
     */
    public void setFee(Fee value) {
        this.fee = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax }
     * 
     * 
     */
    public List<Tax> getTax() {
        if (tax == null) {
            tax = new ArrayList<Tax>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the ancillarySegmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillarySegmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillarySegmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillarySegmentDetailType }
     * 
     * 
     */
    public List<AncillarySegmentDetailType> getAncillarySegmentDetails() {
        if (ancillarySegmentDetails == null) {
            ancillarySegmentDetails = new ArrayList<AncillarySegmentDetailType>();
        }
        return this.ancillarySegmentDetails;
    }

    /**
     * isSubSsrPresent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSubSsrPresent() {
        return isSubSsrPresent;
    }

    /**
     * isSubSsrPresent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSubSsrPresent(Boolean value) {
        this.isSubSsrPresent = value;
    }

    /**
     * isBundle 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBundle() {
        return isBundle;
    }

    /**
     * isBundle 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBundle(Boolean value) {
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
     * isFeePresent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFeePresent() {
        return isFeePresent;
    }

    /**
     * isFeePresent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFeePresent(Boolean value) {
        this.isFeePresent = value;
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
     * metaDataRef 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDataRef() {
        return metaDataRef;
    }

    /**
     * metaDataRef 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDataRef(String value) {
        this.metaDataRef = value;
    }

    /**
     * Gets the value of the paxRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getPaxRefID() {
        if (paxRefID == null) {
            paxRefID = new ArrayList<Object>();
        }
        return this.paxRefID;
    }

}
