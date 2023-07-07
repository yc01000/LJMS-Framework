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
 * <p>FeeDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FeeDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SegmentID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeeID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WaiverOverrideReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "FeeDetails", propOrder = {
    "segmentID",
    "feeID",
    "feeCode",
    "amount",
    "currency",
    "waiverOverrideReason",
    "taxDetails",
    "ancillaryDetailsType"
})
public class FeeDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "SegmentID", type = Long.class)
    protected List<Long> segmentID;
    @XmlElement(name = "FeeID")
    protected long feeID;
    @XmlElement(name = "FeeCode", required = true)
    protected String feeCode;
    @XmlElement(name = "Amount")
    protected double amount;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "WaiverOverrideReason")
    protected String waiverOverrideReason;
    @XmlElement(name = "TaxDetails")
    protected List<TaxDetails> taxDetails;
    @XmlElement(name = "AncillaryDetailsType")
    protected List<AncillaryDetailsType> ancillaryDetailsType;

    /**
     * Gets the value of the segmentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSegmentID() {
        if (segmentID == null) {
            segmentID = new ArrayList<Long>();
        }
        return this.segmentID;
    }

    /**
     * feeID 속성의 값을 가져옵니다.
     * 
     */
    public long getFeeID() {
        return feeID;
    }

    /**
     * feeID 속성의 값을 설정합니다.
     * 
     */
    public void setFeeID(long value) {
        this.feeID = value;
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
     * amount 속성의 값을 가져옵니다.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * amount 속성의 값을 설정합니다.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * currency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * currency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
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
     * {@link TaxDetails }
     * 
     * 
     */
    public List<TaxDetails> getTaxDetails() {
        if (taxDetails == null) {
            taxDetails = new ArrayList<TaxDetails>();
        }
        return this.taxDetails;
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
