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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>SsrRules complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SsrRules"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SsrKeyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SegmentNeedLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaxNeedLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestCountNeedLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsAllSegmentMandatoryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsAllPaxmandatoryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsMultipleRequestFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsMultiPaxFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UncombinableSsrs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PrerequisiteSsrs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BundledSsrs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubSSRCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SSRPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SsrRuleText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SsrRules", propOrder = {
    "ssrKeyword",
    "segmentNeedLevel",
    "paxNeedLevel",
    "requestCountNeedLevel",
    "isAllSegmentMandatoryFlag",
    "isAllPaxmandatoryFlag",
    "isMultipleRequestFlag",
    "isMultiPaxFlag",
    "feeCode",
    "uncombinableSsrs",
    "prerequisiteSsrs",
    "bundledSsrs",
    "subSSRCodes",
    "ssrPriority",
    "ssrRuleText"
})
public class SsrRules
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "SsrKeyword")
    protected String ssrKeyword;
    @XmlElement(name = "SegmentNeedLevel")
    protected String segmentNeedLevel;
    @XmlElement(name = "PaxNeedLevel")
    protected String paxNeedLevel;
    @XmlElement(name = "RequestCountNeedLevel")
    protected String requestCountNeedLevel;
    @XmlElement(name = "IsAllSegmentMandatoryFlag")
    protected Boolean isAllSegmentMandatoryFlag;
    @XmlElement(name = "IsAllPaxmandatoryFlag")
    protected Boolean isAllPaxmandatoryFlag;
    @XmlElement(name = "IsMultipleRequestFlag")
    protected Boolean isMultipleRequestFlag;
    @XmlElement(name = "IsMultiPaxFlag")
    protected Boolean isMultiPaxFlag;
    @XmlElement(name = "FeeCode")
    protected String feeCode;
    @XmlElement(name = "UncombinableSsrs")
    protected List<String> uncombinableSsrs;
    @XmlElement(name = "PrerequisiteSsrs")
    protected List<String> prerequisiteSsrs;
    @XmlElement(name = "BundledSsrs")
    protected List<String> bundledSsrs;
    @XmlElement(name = "SubSSRCodes")
    protected List<String> subSSRCodes;
    @XmlElement(name = "SSRPriority")
    protected String ssrPriority;
    @XmlElement(name = "SsrRuleText")
    protected String ssrRuleText;

    /**
     * ssrKeyword 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrKeyword() {
        return ssrKeyword;
    }

    /**
     * ssrKeyword 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrKeyword(String value) {
        this.ssrKeyword = value;
    }

    /**
     * segmentNeedLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentNeedLevel() {
        return segmentNeedLevel;
    }

    /**
     * segmentNeedLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentNeedLevel(String value) {
        this.segmentNeedLevel = value;
    }

    /**
     * paxNeedLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxNeedLevel() {
        return paxNeedLevel;
    }

    /**
     * paxNeedLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxNeedLevel(String value) {
        this.paxNeedLevel = value;
    }

    /**
     * requestCountNeedLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCountNeedLevel() {
        return requestCountNeedLevel;
    }

    /**
     * requestCountNeedLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCountNeedLevel(String value) {
        this.requestCountNeedLevel = value;
    }

    /**
     * isAllSegmentMandatoryFlag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllSegmentMandatoryFlag() {
        return isAllSegmentMandatoryFlag;
    }

    /**
     * isAllSegmentMandatoryFlag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllSegmentMandatoryFlag(Boolean value) {
        this.isAllSegmentMandatoryFlag = value;
    }

    /**
     * isAllPaxmandatoryFlag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllPaxmandatoryFlag() {
        return isAllPaxmandatoryFlag;
    }

    /**
     * isAllPaxmandatoryFlag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllPaxmandatoryFlag(Boolean value) {
        this.isAllPaxmandatoryFlag = value;
    }

    /**
     * isMultipleRequestFlag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultipleRequestFlag() {
        return isMultipleRequestFlag;
    }

    /**
     * isMultipleRequestFlag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultipleRequestFlag(Boolean value) {
        this.isMultipleRequestFlag = value;
    }

    /**
     * isMultiPaxFlag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultiPaxFlag() {
        return isMultiPaxFlag;
    }

    /**
     * isMultiPaxFlag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultiPaxFlag(Boolean value) {
        this.isMultiPaxFlag = value;
    }

    /**
     * feeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCode() {
        return feeCode;
    }

    /**
     * feeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCode(String value) {
        this.feeCode = value;
    }

    /**
     * Gets the value of the uncombinableSsrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uncombinableSsrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUncombinableSsrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUncombinableSsrs() {
        if (uncombinableSsrs == null) {
            uncombinableSsrs = new ArrayList<String>();
        }
        return this.uncombinableSsrs;
    }

    /**
     * Gets the value of the prerequisiteSsrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prerequisiteSsrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrerequisiteSsrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrerequisiteSsrs() {
        if (prerequisiteSsrs == null) {
            prerequisiteSsrs = new ArrayList<String>();
        }
        return this.prerequisiteSsrs;
    }

    /**
     * Gets the value of the bundledSsrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bundledSsrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBundledSsrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBundledSsrs() {
        if (bundledSsrs == null) {
            bundledSsrs = new ArrayList<String>();
        }
        return this.bundledSsrs;
    }

    /**
     * Gets the value of the subSSRCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subSSRCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubSSRCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubSSRCodes() {
        if (subSSRCodes == null) {
            subSSRCodes = new ArrayList<String>();
        }
        return this.subSSRCodes;
    }

    /**
     * ssrPriority 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRPriority() {
        return ssrPriority;
    }

    /**
     * ssrPriority 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRPriority(String value) {
        this.ssrPriority = value;
    }

    /**
     * ssrRuleText 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrRuleText() {
        return ssrRuleText;
    }

    /**
     * ssrRuleText 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrRuleText(String value) {
        this.ssrRuleText = value;
    }

}
