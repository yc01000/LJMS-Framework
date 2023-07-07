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
 * <p>PaxFeeMapping complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaxFeeMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaxID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="PaxType" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestType" minOccurs="0"/&gt;
 *         &lt;element name="TotalFeeAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApplicationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CreditCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FeeResponseDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeResponseDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxDetailType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxFeeMapping", propOrder = {
    "paxID",
    "paxType",
    "totalFeeAmount",
    "totalAmount",
    "currency",
    "feeCode",
    "applicationType",
    "creditCardType",
    "feeResponseDetails",
    "taxDetails"
})
public class PaxFeeMapping
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PaxID")
    protected long paxID;
    @XmlElement(name = "PaxType")
    @XmlSchemaType(name = "string")
    protected GuestType paxType;
    @XmlElement(name = "TotalFeeAmount")
    protected double totalFeeAmount;
    @XmlElement(name = "TotalAmount")
    protected double totalAmount;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "FeeCode", required = true)
    protected String feeCode;
    @XmlElement(name = "ApplicationType", required = true)
    protected String applicationType;
    @XmlElement(name = "CreditCardType")
    protected String creditCardType;
    @XmlElement(name = "FeeResponseDetails", required = true)
    protected List<FeeResponseDetails> feeResponseDetails;
    @XmlElement(name = "TaxDetails")
    protected TaxDetailType taxDetails;

    /**
     * paxID 속성의 값을 가져옵니다.
     * 
     */
    public long getPaxID() {
        return paxID;
    }

    /**
     * paxID 속성의 값을 설정합니다.
     * 
     */
    public void setPaxID(long value) {
        this.paxID = value;
    }

    /**
     * paxType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GuestType }
     *     
     */
    public GuestType getPaxType() {
        return paxType;
    }

    /**
     * paxType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestType }
     *     
     */
    public void setPaxType(GuestType value) {
        this.paxType = value;
    }

    /**
     * totalFeeAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getTotalFeeAmount() {
        return totalFeeAmount;
    }

    /**
     * totalFeeAmount 속성의 값을 설정합니다.
     * 
     */
    public void setTotalFeeAmount(double value) {
        this.totalFeeAmount = value;
    }

    /**
     * totalAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * totalAmount 속성의 값을 설정합니다.
     * 
     */
    public void setTotalAmount(double value) {
        this.totalAmount = value;
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
     * applicationType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * applicationType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationType(String value) {
        this.applicationType = value;
    }

    /**
     * creditCardType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * creditCardType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the feeResponseDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeResponseDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeResponseDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeResponseDetails }
     * 
     * 
     */
    public List<FeeResponseDetails> getFeeResponseDetails() {
        if (feeResponseDetails == null) {
            feeResponseDetails = new ArrayList<FeeResponseDetails>();
        }
        return this.feeResponseDetails;
    }

    /**
     * taxDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailType }
     *     
     */
    public TaxDetailType getTaxDetails() {
        return taxDetails;
    }

    /**
     * taxDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailType }
     *     
     */
    public void setTaxDetails(TaxDetailType value) {
        this.taxDetails = value;
    }

}
