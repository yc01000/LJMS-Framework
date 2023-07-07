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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>FeeRequestType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FeeRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FeeAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FeeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationType" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeApplicationDetails_Type" minOccurs="0"/&gt;
 *         &lt;element name="AncillaryDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}AncillaryDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="canBypassFeeRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FeeCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsFeeWaiveRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsFeeOverriden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isFopFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WaiverOverrideReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WaiverCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeRequestType", propOrder = {
    "feeCode",
    "feeAmount",
    "feeId",
    "guestId",
    "segmentId",
    "applicationType",
    "ancillaryDetailsType",
    "canBypassFeeRules",
    "feeCurrency",
    "isFeeWaiveRequired",
    "isFeeOverriden",
    "isFopFee",
    "waiverOverrideReason",
    "certificateNumber",
    "waiverCode"
})
public class FeeRequestType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FeeCode", required = true)
    protected String feeCode;
    @XmlElement(name = "FeeAmount")
    protected double feeAmount;
    @XmlElement(name = "FeeId")
    protected Long feeId;
    @XmlElement(name = "GuestId")
    protected Long guestId;
    @XmlElement(name = "SegmentId")
    protected List<String> segmentId;
    @XmlElement(name = "ApplicationType")
    @XmlSchemaType(name = "string")
    protected FeeApplicationDetailsType applicationType;
    @XmlElement(name = "AncillaryDetailsType")
    protected List<AncillaryDetailsType> ancillaryDetailsType;
    protected Boolean canBypassFeeRules;
    @XmlElement(name = "FeeCurrency", required = true)
    protected String feeCurrency;
    @XmlElement(name = "IsFeeWaiveRequired")
    protected Boolean isFeeWaiveRequired;
    @XmlElement(name = "IsFeeOverriden")
    protected Boolean isFeeOverriden;
    protected Boolean isFopFee;
    @XmlElement(name = "WaiverOverrideReason")
    protected String waiverOverrideReason;
    @XmlElement(name = "CertificateNumber")
    protected String certificateNumber;
    @XmlElement(name = "WaiverCode")
    protected String waiverCode;

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
     * feeAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getFeeAmount() {
        return feeAmount;
    }

    /**
     * feeAmount 속성의 값을 설정합니다.
     * 
     */
    public void setFeeAmount(double value) {
        this.feeAmount = value;
    }

    /**
     * feeId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeeId() {
        return feeId;
    }

    /**
     * feeId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeeId(Long value) {
        this.feeId = value;
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
     * applicationType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FeeApplicationDetailsType }
     *     
     */
    public FeeApplicationDetailsType getApplicationType() {
        return applicationType;
    }

    /**
     * applicationType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeApplicationDetailsType }
     *     
     */
    public void setApplicationType(FeeApplicationDetailsType value) {
        this.applicationType = value;
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

    /**
     * canBypassFeeRules 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBypassFeeRules() {
        return canBypassFeeRules;
    }

    /**
     * canBypassFeeRules 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBypassFeeRules(Boolean value) {
        this.canBypassFeeRules = value;
    }

    /**
     * feeCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCurrency() {
        return feeCurrency;
    }

    /**
     * feeCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCurrency(String value) {
        this.feeCurrency = value;
    }

    /**
     * isFeeWaiveRequired 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFeeWaiveRequired() {
        return isFeeWaiveRequired;
    }

    /**
     * isFeeWaiveRequired 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFeeWaiveRequired(Boolean value) {
        this.isFeeWaiveRequired = value;
    }

    /**
     * isFeeOverriden 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFeeOverriden() {
        return isFeeOverriden;
    }

    /**
     * isFeeOverriden 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFeeOverriden(Boolean value) {
        this.isFeeOverriden = value;
    }

    /**
     * isFopFee 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFopFee() {
        return isFopFee;
    }

    /**
     * isFopFee 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFopFee(Boolean value) {
        this.isFopFee = value;
    }

    /**
     * waiverOverrideReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiverOverrideReason() {
        return waiverOverrideReason;
    }

    /**
     * waiverOverrideReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiverOverrideReason(String value) {
        this.waiverOverrideReason = value;
    }

    /**
     * certificateNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * certificateNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumber(String value) {
        this.certificateNumber = value;
    }

    /**
     * waiverCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiverCode() {
        return waiverCode;
    }

    /**
     * waiverCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiverCode(String value) {
        this.waiverCode = value;
    }

}
