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
 * <p>CouponDetailsTypeInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CouponDetailsTypeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RfiscCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CouponStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AncillaryDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}AncillaryDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponDetailsTypeInfo", propOrder = {
    "rfiscCode",
    "couponStatus",
    "couponNumber",
    "segmentId",
    "ancillaryDetailsType"
})
public class CouponDetailsTypeInfo
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "RfiscCode")
    protected String rfiscCode;
    @XmlElement(name = "CouponStatus")
    protected String couponStatus;
    @XmlElement(name = "CouponNumber")
    protected Integer couponNumber;
    @XmlElement(name = "SegmentId", type = Long.class)
    protected List<Long> segmentId;
    @XmlElement(name = "AncillaryDetailsType")
    protected List<AncillaryDetailsType> ancillaryDetailsType;

    /**
     * rfiscCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfiscCode() {
        return rfiscCode;
    }

    /**
     * rfiscCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfiscCode(String value) {
        this.rfiscCode = value;
    }

    /**
     * couponStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponStatus() {
        return couponStatus;
    }

    /**
     * couponStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponStatus(String value) {
        this.couponStatus = value;
    }

    /**
     * couponNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCouponNumber() {
        return couponNumber;
    }

    /**
     * couponNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCouponNumber(Integer value) {
        this.couponNumber = value;
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
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSegmentId() {
        if (segmentId == null) {
            segmentId = new ArrayList<Long>();
        }
        return this.segmentId;
    }

    /**
     * Gets the value of the ancillaryDetailsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryDetailsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryDetailsType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryDetailsType }
     * 
     * 
     */
    public List<AncillaryDetailsType> getAncillaryDetailsType() {
        if (ancillaryDetailsType == null) {
            ancillaryDetailsType = new ArrayList<AncillaryDetailsType>();
        }
        return this.ancillaryDetailsType;
    }

}
