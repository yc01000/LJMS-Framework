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
 * <p>AncillaryService complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AncillaryService"&gt;
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
 *         &lt;element name="IsBundle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BundlePriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncludedAncillaries" type="{http://www.ibsplc.com/iRes/simpleTypes/}IncludedAncillaries" minOccurs="0"/&gt;
 *         &lt;element name="IsFreeBaggageAllowance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FeeInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeInformation"/&gt;
 *         &lt;element name="TaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxDetailsPerGuest" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PassengerList" type="{http://www.ibsplc.com/iRes/simpleTypes/}PassengerList"/&gt;
 *         &lt;element name="SegmentIds" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentIds"/&gt;
 *         &lt;element name="AncillarySegmentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AncillarySegmentDetailType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="CheckedBaggageDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CheckedBaggageDetails"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RichContentRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryService", propOrder = {
    "serviceCode",
    "serviceName",
    "serviceCategory",
    "serviceKeyword",
    "settlementCode",
    "rficCode",
    "rficSubCode",
    "feeMethod",
    "subCodeDescription",
    "isBundle",
    "bundlePriority",
    "includedAncillaries",
    "isFreeBaggageAllowance",
    "feeInformation",
    "taxDetails",
    "passengerList",
    "segmentIds",
    "ancillarySegmentDetails",
    "checkedBaggageDetails"
})
public class AncillaryService
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
    @XmlElement(name = "IsBundle")
    protected Boolean isBundle;
    @XmlElement(name = "BundlePriority")
    protected String bundlePriority;
    @XmlElement(name = "IncludedAncillaries")
    protected IncludedAncillaries includedAncillaries;
    @XmlElement(name = "IsFreeBaggageAllowance")
    protected Boolean isFreeBaggageAllowance;
    @XmlElement(name = "FeeInformation", required = true)
    protected FeeInformation feeInformation;
    @XmlElement(name = "TaxDetails", required = true)
    protected List<TaxDetailsPerGuest> taxDetails;
    @XmlElement(name = "PassengerList", required = true)
    protected PassengerList passengerList;
    @XmlElement(name = "SegmentIds", required = true)
    protected SegmentIds segmentIds;
    @XmlElement(name = "AncillarySegmentDetails", required = true)
    protected List<AncillarySegmentDetailType> ancillarySegmentDetails;
    @XmlElement(name = "CheckedBaggageDetails", required = true)
    protected CheckedBaggageDetails checkedBaggageDetails;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;

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
     * includedAncillaries 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link IncludedAncillaries }
     *     
     */
    public IncludedAncillaries getIncludedAncillaries() {
        return includedAncillaries;
    }

    /**
     * includedAncillaries 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludedAncillaries }
     *     
     */
    public void setIncludedAncillaries(IncludedAncillaries value) {
        this.includedAncillaries = value;
    }

    /**
     * isFreeBaggageAllowance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFreeBaggageAllowance() {
        return isFreeBaggageAllowance;
    }

    /**
     * isFreeBaggageAllowance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFreeBaggageAllowance(Boolean value) {
        this.isFreeBaggageAllowance = value;
    }

    /**
     * feeInformation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FeeInformation }
     *     
     */
    public FeeInformation getFeeInformation() {
        return feeInformation;
    }

    /**
     * feeInformation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeInformation }
     *     
     */
    public void setFeeInformation(FeeInformation value) {
        this.feeInformation = value;
    }

    /**
     * Gets the value of the taxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetailsPerGuest }
     * 
     * 
     */
    public List<TaxDetailsPerGuest> getTaxDetails() {
        if (taxDetails == null) {
            taxDetails = new ArrayList<TaxDetailsPerGuest>();
        }
        return this.taxDetails;
    }

    /**
     * passengerList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PassengerList }
     *     
     */
    public PassengerList getPassengerList() {
        return passengerList;
    }

    /**
     * passengerList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerList }
     *     
     */
    public void setPassengerList(PassengerList value) {
        this.passengerList = value;
    }

    /**
     * segmentIds 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SegmentIds }
     *     
     */
    public SegmentIds getSegmentIds() {
        return segmentIds;
    }

    /**
     * segmentIds 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentIds }
     *     
     */
    public void setSegmentIds(SegmentIds value) {
        this.segmentIds = value;
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
     * checkedBaggageDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CheckedBaggageDetails }
     *     
     */
    public CheckedBaggageDetails getCheckedBaggageDetails() {
        return checkedBaggageDetails;
    }

    /**
     * checkedBaggageDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckedBaggageDetails }
     *     
     */
    public void setCheckedBaggageDetails(CheckedBaggageDetails value) {
        this.checkedBaggageDetails = value;
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
