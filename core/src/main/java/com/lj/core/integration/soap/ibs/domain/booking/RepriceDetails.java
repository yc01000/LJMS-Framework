//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2021.04.29 시간 12:54:19 PM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>RepriceDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="RepriceDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancellationFee" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="FormOfRefund" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="RefundAmount" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="CreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="CreditFileNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="CreditFileExpirtyDate" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepriceDetails", propOrder = {
    "cancellationFee",
    "formOfRefund",
    "refundAmount",
    "creditCardNumber",
    "creditFileNumber",
    "creditFileExpirtyDate"
})
public class RepriceDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "CancellationFee", required = true)
    protected Object cancellationFee;
    @XmlElement(name = "FormOfRefund", required = true)
    protected Object formOfRefund;
    @XmlElement(name = "RefundAmount", required = true)
    protected Object refundAmount;
    @XmlElement(name = "CreditCardNumber", required = true)
    protected Object creditCardNumber;
    @XmlElement(name = "CreditFileNumber", required = true)
    protected Object creditFileNumber;
    @XmlElement(name = "CreditFileExpirtyDate", required = true)
    protected Object creditFileExpirtyDate;

    /**
     * cancellationFee 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCancellationFee() {
        return cancellationFee;
    }

    /**
     * cancellationFee 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCancellationFee(Object value) {
        this.cancellationFee = value;
    }

    /**
     * formOfRefund 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFormOfRefund() {
        return formOfRefund;
    }

    /**
     * formOfRefund 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFormOfRefund(Object value) {
        this.formOfRefund = value;
    }

    /**
     * refundAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRefundAmount() {
        return refundAmount;
    }

    /**
     * refundAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRefundAmount(Object value) {
        this.refundAmount = value;
    }

    /**
     * creditCardNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * creditCardNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCreditCardNumber(Object value) {
        this.creditCardNumber = value;
    }

    /**
     * creditFileNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCreditFileNumber() {
        return creditFileNumber;
    }

    /**
     * creditFileNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCreditFileNumber(Object value) {
        this.creditFileNumber = value;
    }

    /**
     * creditFileExpirtyDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCreditFileExpirtyDate() {
        return creditFileExpirtyDate;
    }

    /**
     * creditFileExpirtyDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCreditFileExpirtyDate(Object value) {
        this.creditFileExpirtyDate = value;
    }

}
