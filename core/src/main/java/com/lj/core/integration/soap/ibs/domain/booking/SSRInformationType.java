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
 * <p>SSRInformationType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SSRInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ssrCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IataSsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssrRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSRId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ssrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssrDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSRStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SsrAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubSsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfRequests" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SSRComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SsrFieldDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}SsrFieldDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ChildSsrs" type="{http://www.ibsplc.com/iRes/simpleTypes/}ChildSsrsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsParentSSR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ParentSSRId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SeatId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SsrFieldMetaData" type="{http://www.ibsplc.com/iRes/simpleTypes/}SsrFieldMetaDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "SSRInformationType", propOrder = {
    "ssrCode",
    "iataSsrCode",
    "ssrType",
    "ssrRemarks",
    "ssrId",
    "ssrName",
    "ssrDescription",
    "ssrStatus",
    "ssrAirlineCode",
    "subSsrCode",
    "numberOfRequests",
    "ssrComments",
    "guestId",
    "ssrFieldDetailsType",
    "segmentId",
    "childSsrs",
    "isParentSSR",
    "parentSSRId",
    "seatId",
    "ssrFieldMetaData"
})
public class SSRInformationType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected String ssrCode;
    @XmlElement(name = "IataSsrCode")
    protected String iataSsrCode;
    protected String ssrType;
    protected String ssrRemarks;
    @XmlElement(name = "SSRId")
    protected Long ssrId;
    protected String ssrName;
    protected String ssrDescription;
    @XmlElement(name = "SSRStatus")
    protected String ssrStatus;
    @XmlElement(name = "SsrAirlineCode")
    protected String ssrAirlineCode;
    @XmlElement(name = "SubSsrCode")
    protected String subSsrCode;
    @XmlElement(name = "NumberOfRequests")
    protected Integer numberOfRequests;
    @XmlElement(name = "SSRComments")
    protected String ssrComments;
    @XmlElement(name = "GuestId")
    protected Long guestId;
    @XmlElement(name = "SsrFieldDetailsType")
    protected List<SsrFieldDetailsType> ssrFieldDetailsType;
    @XmlElement(name = "SegmentId")
    protected List<String> segmentId;
    @XmlElement(name = "ChildSsrs")
    protected List<ChildSsrsType> childSsrs;
    @XmlElement(name = "IsParentSSR")
    protected Boolean isParentSSR;
    @XmlElement(name = "ParentSSRId")
    protected Long parentSSRId;
    @XmlElement(name = "SeatId")
    protected Long seatId;
    @XmlElement(name = "SsrFieldMetaData")
    protected List<SsrFieldMetaDataType> ssrFieldMetaData;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;

    /**
     * ssrCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrCode() {
        return ssrCode;
    }

    /**
     * ssrCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrCode(String value) {
        this.ssrCode = value;
    }

    /**
     * iataSsrCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIataSsrCode() {
        return iataSsrCode;
    }

    /**
     * iataSsrCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIataSsrCode(String value) {
        this.iataSsrCode = value;
    }

    /**
     * ssrType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrType() {
        return ssrType;
    }

    /**
     * ssrType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrType(String value) {
        this.ssrType = value;
    }

    /**
     * ssrRemarks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrRemarks() {
        return ssrRemarks;
    }

    /**
     * ssrRemarks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrRemarks(String value) {
        this.ssrRemarks = value;
    }

    /**
     * ssrId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSSRId() {
        return ssrId;
    }

    /**
     * ssrId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSSRId(Long value) {
        this.ssrId = value;
    }

    /**
     * ssrName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrName() {
        return ssrName;
    }

    /**
     * ssrName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrName(String value) {
        this.ssrName = value;
    }

    /**
     * ssrDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrDescription() {
        return ssrDescription;
    }

    /**
     * ssrDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrDescription(String value) {
        this.ssrDescription = value;
    }

    /**
     * ssrStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRStatus() {
        return ssrStatus;
    }

    /**
     * ssrStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRStatus(String value) {
        this.ssrStatus = value;
    }

    /**
     * ssrAirlineCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrAirlineCode() {
        return ssrAirlineCode;
    }

    /**
     * ssrAirlineCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrAirlineCode(String value) {
        this.ssrAirlineCode = value;
    }

    /**
     * subSsrCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSsrCode() {
        return subSsrCode;
    }

    /**
     * subSsrCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSsrCode(String value) {
        this.subSsrCode = value;
    }

    /**
     * numberOfRequests 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRequests() {
        return numberOfRequests;
    }

    /**
     * numberOfRequests 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRequests(Integer value) {
        this.numberOfRequests = value;
    }

    /**
     * ssrComments 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRComments() {
        return ssrComments;
    }

    /**
     * ssrComments 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRComments(String value) {
        this.ssrComments = value;
    }

    /**
     * guestId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuestId() {
        return guestId;
    }

    /**
     * guestId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuestId(Long value) {
        this.guestId = value;
    }

    /**
     * Gets the value of the ssrFieldDetailsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrFieldDetailsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSsrFieldDetailsType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SsrFieldDetailsType }
     * 
     * 
     */
    public List<SsrFieldDetailsType> getSsrFieldDetailsType() {
        if (ssrFieldDetailsType == null) {
            ssrFieldDetailsType = new ArrayList<SsrFieldDetailsType>();
        }
        return this.ssrFieldDetailsType;
    }

    /**
     * Gets the value of the segmentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSegmentId() {
        if (segmentId == null) {
            segmentId = new ArrayList<String>();
        }
        return this.segmentId;
    }

    /**
     * Gets the value of the childSsrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childSsrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildSsrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildSsrsType }
     * 
     * 
     */
    public List<ChildSsrsType> getChildSsrs() {
        if (childSsrs == null) {
            childSsrs = new ArrayList<ChildSsrsType>();
        }
        return this.childSsrs;
    }

    /**
     * isParentSSR 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsParentSSR() {
        return isParentSSR;
    }

    /**
     * isParentSSR 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsParentSSR(Boolean value) {
        this.isParentSSR = value;
    }

    /**
     * parentSSRId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentSSRId() {
        return parentSSRId;
    }

    /**
     * parentSSRId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentSSRId(Long value) {
        this.parentSSRId = value;
    }

    /**
     * seatId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeatId() {
        return seatId;
    }

    /**
     * seatId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeatId(Long value) {
        this.seatId = value;
    }

    /**
     * Gets the value of the ssrFieldMetaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrFieldMetaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSsrFieldMetaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SsrFieldMetaDataType }
     * 
     * 
     */
    public List<SsrFieldMetaDataType> getSsrFieldMetaData() {
        if (ssrFieldMetaData == null) {
            ssrFieldMetaData = new ArrayList<SsrFieldMetaDataType>();
        }
        return this.ssrFieldMetaData;
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
