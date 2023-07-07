//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>PnrRepriceDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PnrRepriceDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmountPaid" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrPayment" minOccurs="0"/&gt;
 *         &lt;element name="AmountPending" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrPayment" minOccurs="0"/&gt;
 *         &lt;element name="isCCFeePending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="pendingCCFeeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrRepriceDetails", propOrder = {
    "amountPaid",
    "amountPending",
    "isCCFeePending",
    "pendingCCFeeAmount",
    "errorDescription",
    "paymentStatus"
})
public class PnrRepriceDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AmountPaid")
    protected PnrPayment amountPaid;
    @XmlElement(name = "AmountPending")
    protected PnrPayment amountPending;
    protected Boolean isCCFeePending;
    protected Double pendingCCFeeAmount;
    @XmlElement(name = "ErrorDescription")
    protected String errorDescription;
    protected String paymentStatus;

    /**
     * amountPaid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PnrPayment }
     *     
     */
    public PnrPayment getAmountPaid() {
        return amountPaid;
    }

    /**
     * amountPaid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PnrPayment }
     *     
     */
    public void setAmountPaid(PnrPayment value) {
        this.amountPaid = value;
    }

    /**
     * amountPending 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PnrPayment }
     *     
     */
    public PnrPayment getAmountPending() {
        return amountPending;
    }

    /**
     * amountPending 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PnrPayment }
     *     
     */
    public void setAmountPending(PnrPayment value) {
        this.amountPending = value;
    }

    /**
     * isCCFeePending 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCCFeePending() {
        return isCCFeePending;
    }

    /**
     * isCCFeePending 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCCFeePending(Boolean value) {
        this.isCCFeePending = value;
    }

    /**
     * pendingCCFeeAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPendingCCFeeAmount() {
        return pendingCCFeeAmount;
    }

    /**
     * pendingCCFeeAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPendingCCFeeAmount(Double value) {
        this.pendingCCFeeAmount = value;
    }

    /**
     * errorDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * errorDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * paymentStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * paymentStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

}
