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
 * <p>FeeInformation complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FeeInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FeeAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FeeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PaxId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationType" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeApplicationType" minOccurs="0"/&gt;
 *         &lt;element name="canBypassFeeRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutomaticFeeAddedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FeeCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OandDFeeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}OandDFeeDetailsInputType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxDetailsPerGuest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SurChargeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SurChargeDetailsPerGuest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsFeeWaiveRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsFeeOverriden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ApplicableFeeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="IsAddedInCurrentSession" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeInformation", propOrder = {
    "feeCode",
    "feeAmount",
    "feeId",
    "paxId",
    "applicationType",
    "canBypassFeeRules",
    "automaticFeeAddedStatus",
    "feeCurrency",
    "feeName",
    "oandDFeeDetails",
    "taxDetails",
    "surChargeDetails",
    "isFeeWaiveRequired",
    "isFeeOverriden",
    "applicableFeeAmount",
    "isAddedInCurrentSession"
})
public class FeeInformation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FeeCode", required = true)
    protected String feeCode;
    @XmlElement(name = "FeeAmount")
    protected double feeAmount;
    @XmlElement(name = "FeeId")
    protected Long feeId;
    @XmlElement(name = "PaxId")
    protected Long paxId;
    @XmlElement(name = "ApplicationType")
    @XmlSchemaType(name = "string")
    protected FeeApplicationType applicationType;
    protected Boolean canBypassFeeRules;
    @XmlElement(name = "AutomaticFeeAddedStatus")
    protected String automaticFeeAddedStatus;
    @XmlElement(name = "FeeCurrency", required = true)
    protected String feeCurrency;
    @XmlElement(name = "FeeName")
    protected String feeName;
    @XmlElement(name = "OandDFeeDetails")
    protected List<OandDFeeDetailsInputType> oandDFeeDetails;
    @XmlElement(name = "TaxDetails")
    protected List<TaxDetailsPerGuest> taxDetails;
    @XmlElement(name = "SurChargeDetails")
    protected List<SurChargeDetailsPerGuest> surChargeDetails;
    @XmlElement(name = "IsFeeWaiveRequired")
    protected Boolean isFeeWaiveRequired;
    @XmlElement(name = "IsFeeOverriden")
    protected Boolean isFeeOverriden;
    @XmlElement(name = "ApplicableFeeAmount")
    protected Double applicableFeeAmount;
    @XmlElement(name = "IsAddedInCurrentSession")
    protected Boolean isAddedInCurrentSession;

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
     * paxId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaxId() {
        return paxId;
    }

    /**
     * paxId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaxId(Long value) {
        this.paxId = value;
    }

    /**
     * applicationType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FeeApplicationType }
     *     
     */
    public FeeApplicationType getApplicationType() {
        return applicationType;
    }

    /**
     * applicationType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeApplicationType }
     *     
     */
    public void setApplicationType(FeeApplicationType value) {
        this.applicationType = value;
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
     * automaticFeeAddedStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticFeeAddedStatus() {
        return automaticFeeAddedStatus;
    }

    /**
     * automaticFeeAddedStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticFeeAddedStatus(String value) {
        this.automaticFeeAddedStatus = value;
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
     * feeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeName() {
        return feeName;
    }

    /**
     * feeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeName(String value) {
        this.feeName = value;
    }

    /**
     * Gets the value of the oandDFeeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oandDFeeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOandDFeeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OandDFeeDetailsInputType }
     * 
     * 
     */
    public List<OandDFeeDetailsInputType> getOandDFeeDetails() {
        if (oandDFeeDetails == null) {
            oandDFeeDetails = new ArrayList<OandDFeeDetailsInputType>();
        }
        return this.oandDFeeDetails;
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
     * Gets the value of the surChargeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surChargeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurChargeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurChargeDetailsPerGuest }
     * 
     * 
     */
    public List<SurChargeDetailsPerGuest> getSurChargeDetails() {
        if (surChargeDetails == null) {
            surChargeDetails = new ArrayList<SurChargeDetailsPerGuest>();
        }
        return this.surChargeDetails;
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
     * applicableFeeAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getApplicableFeeAmount() {
        return applicableFeeAmount;
    }

    /**
     * applicableFeeAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setApplicableFeeAmount(Double value) {
        this.applicableFeeAmount = value;
    }

    /**
     * isAddedInCurrentSession 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAddedInCurrentSession() {
        return isAddedInCurrentSession;
    }

    /**
     * isAddedInCurrentSession 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAddedInCurrentSession(Boolean value) {
        this.isAddedInCurrentSession = value;
    }

}
