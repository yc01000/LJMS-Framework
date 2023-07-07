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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CCFeeRequestDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CCFeeRequestDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ServiceInitiator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDateLTC" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/&gt;
 *         &lt;element name="CreditCardType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PaxSegmentMapping" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxSegmentMapping" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCFeeRequestDetails", propOrder = {
    "amount",
    "serviceInitiator",
    "paymentCurrency",
    "serviceCurrency",
    "paymentDateLTC",
    "creditCardType",
    "feeCode",
    "additionDate",
    "paxSegmentMapping"
})
public class CCFeeRequestDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Amount")
    protected Double amount;
    @XmlElement(name = "ServiceInitiator", required = true)
    protected String serviceInitiator;
    @XmlElement(name = "PaymentCurrency", required = true)
    protected String paymentCurrency;
    @XmlElement(name = "ServiceCurrency")
    protected String serviceCurrency;
    @XmlElement(name = "PaymentDateLTC", required = true)
    protected DateOnlyType paymentDateLTC;
    @XmlElement(name = "CreditCardType", required = true)
    protected String creditCardType;
    @XmlElement(name = "FeeCode")
    protected String feeCode;
    @XmlElement(name = "AdditionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar additionDate;
    @XmlElement(name = "PaxSegmentMapping")
    protected List<PaxSegmentMapping> paxSegmentMapping;

    /**
     * amount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * amount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * serviceInitiator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInitiator() {
        return serviceInitiator;
    }

    /**
     * serviceInitiator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInitiator(String value) {
        this.serviceInitiator = value;
    }

    /**
     * paymentCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    /**
     * paymentCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCurrency(String value) {
        this.paymentCurrency = value;
    }

    /**
     * serviceCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCurrency() {
        return serviceCurrency;
    }

    /**
     * serviceCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCurrency(String value) {
        this.serviceCurrency = value;
    }

    /**
     * paymentDateLTC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getPaymentDateLTC() {
        return paymentDateLTC;
    }

    /**
     * paymentDateLTC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setPaymentDateLTC(DateOnlyType value) {
        this.paymentDateLTC = value;
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
     * additionDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdditionDate() {
        return additionDate;
    }

    /**
     * additionDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdditionDate(XMLGregorianCalendar value) {
        this.additionDate = value;
    }

    /**
     * Gets the value of the paxSegmentMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxSegmentMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxSegmentMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxSegmentMapping }
     * 
     * 
     */
    public List<PaxSegmentMapping> getPaxSegmentMapping() {
        if (paxSegmentMapping == null) {
            paxSegmentMapping = new ArrayList<PaxSegmentMapping>();
        }
        return this.paxSegmentMapping;
    }

}
