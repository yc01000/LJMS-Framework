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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Warnings" type="{http://www.ibsplc.com/iRes/simpleTypes/}WarningType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OriginDestinationInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}OriginDestinationInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorporateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsFareRefreshRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
 *         &lt;element name="BaggageAllowance" type="{http://www.ibsplc.com/iRes/simpleTypes/}BaggageAllowanceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RichContentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}RichContentInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomFieldList" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomFieldListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OfferTimeLimit" type="{http://www.ibsplc.com/iRes/simpleTypes/}OfferTimeLimitType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AncillaryServicesInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}AncillaryServicesInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "warnings",
    "originDestinationInfo",
    "agencyCode",
    "corporateCode",
    "isFareRefreshRequired",
    "errorType",
    "baggageAllowance",
    "richContentInfo",
    "customFieldList",
    "offerTimeLimit",
    "ancillaryServicesInfo"
})
@XmlRootElement(name = "AirAvailabilityWithAncillaryRS")
public class AirAvailabilityWithAncillaryRS
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Warnings")
    protected List<WarningType> warnings;
    @XmlElement(name = "OriginDestinationInfo")
    protected List<OriginDestinationInfo> originDestinationInfo;
    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "CorporateCode")
    protected String corporateCode;
    @XmlElement(name = "IsFareRefreshRequired")
    protected Boolean isFareRefreshRequired;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;
    @XmlElement(name = "BaggageAllowance")
    protected List<BaggageAllowanceType> baggageAllowance;
    @XmlElement(name = "RichContentInfo")
    protected List<RichContentInfoType> richContentInfo;
    @XmlElement(name = "CustomFieldList")
    protected List<CustomFieldListType> customFieldList;
    @XmlElement(name = "OfferTimeLimit")
    protected List<OfferTimeLimitType> offerTimeLimit;
    @XmlElement(name = "AncillaryServicesInfo")
    protected List<AncillaryServicesInfo> ancillaryServicesInfo;

    /**
     * Gets the value of the warnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningType }
     * 
     * 
     */
    public List<WarningType> getWarnings() {
        if (warnings == null) {
            warnings = new ArrayList<WarningType>();
        }
        return this.warnings;
    }

    /**
     * Gets the value of the originDestinationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestinationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestinationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginDestinationInfo }
     * 
     * 
     */
    public List<OriginDestinationInfo> getOriginDestinationInfo() {
        if (originDestinationInfo == null) {
            originDestinationInfo = new ArrayList<OriginDestinationInfo>();
        }
        return this.originDestinationInfo;
    }

    /**
     * agencyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * agencyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * corporateCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateCode() {
        return corporateCode;
    }

    /**
     * corporateCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateCode(String value) {
        this.corporateCode = value;
    }

    /**
     * isFareRefreshRequired 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFareRefreshRequired() {
        return isFareRefreshRequired;
    }

    /**
     * isFareRefreshRequired 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFareRefreshRequired(Boolean value) {
        this.isFareRefreshRequired = value;
    }

    /**
     * errorType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getErrorType() {
        return errorType;
    }

    /**
     * errorType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setErrorType(ErrorType value) {
        this.errorType = value;
    }

    /**
     * Gets the value of the baggageAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageAllowanceType }
     * 
     * 
     */
    public List<BaggageAllowanceType> getBaggageAllowance() {
        if (baggageAllowance == null) {
            baggageAllowance = new ArrayList<BaggageAllowanceType>();
        }
        return this.baggageAllowance;
    }

    /**
     * Gets the value of the richContentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the richContentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRichContentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RichContentInfoType }
     * 
     * 
     */
    public List<RichContentInfoType> getRichContentInfo() {
        if (richContentInfo == null) {
            richContentInfo = new ArrayList<RichContentInfoType>();
        }
        return this.richContentInfo;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customFieldList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomFieldList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomFieldListType }
     * 
     * 
     */
    public List<CustomFieldListType> getCustomFieldList() {
        if (customFieldList == null) {
            customFieldList = new ArrayList<CustomFieldListType>();
        }
        return this.customFieldList;
    }

    /**
     * Gets the value of the offerTimeLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerTimeLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferTimeLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferTimeLimitType }
     * 
     * 
     */
    public List<OfferTimeLimitType> getOfferTimeLimit() {
        if (offerTimeLimit == null) {
            offerTimeLimit = new ArrayList<OfferTimeLimitType>();
        }
        return this.offerTimeLimit;
    }

    /**
     * Gets the value of the ancillaryServicesInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryServicesInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryServicesInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryServicesInfo }
     * 
     * 
     */
    public List<AncillaryServicesInfo> getAncillaryServicesInfo() {
        if (ancillaryServicesInfo == null) {
            ancillaryServicesInfo = new ArrayList<AncillaryServicesInfo>();
        }
        return this.ancillaryServicesInfo;
    }

}
