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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>GuestAmount complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GuestAmount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalRedeemableAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="PayableEntityBreakdown" type="{http://www.ibsplc.com/iRes/simpleTypes/}PayableEntityBreakdownType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="guestId" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="amount" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestAmount", propOrder = {
    "totalRedeemableAmount",
    "payableEntityBreakdown"
})
public class GuestAmount
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "TotalRedeemableAmount")
    protected AmountType totalRedeemableAmount;
    @XmlElement(name = "PayableEntityBreakdown")
    protected PayableEntityBreakdownType payableEntityBreakdown;
    @XmlAttribute(name = "guestId")
    protected Long guestId;
    @XmlAttribute(name = "amount")
    protected Double amount;

    /**
     * totalRedeemableAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalRedeemableAmount() {
        return totalRedeemableAmount;
    }

    /**
     * totalRedeemableAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalRedeemableAmount(AmountType value) {
        this.totalRedeemableAmount = value;
    }

    /**
     * payableEntityBreakdown 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PayableEntityBreakdownType }
     *     
     */
    public PayableEntityBreakdownType getPayableEntityBreakdown() {
        return payableEntityBreakdown;
    }

    /**
     * payableEntityBreakdown 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PayableEntityBreakdownType }
     *     
     */
    public void setPayableEntityBreakdown(PayableEntityBreakdownType value) {
        this.payableEntityBreakdown = value;
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

}
