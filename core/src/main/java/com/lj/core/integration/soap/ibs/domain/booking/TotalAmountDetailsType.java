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
 * <p>TotalAmountDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TotalAmountDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaxAmountPriceBreakdown" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxAmountPriceBreakdown" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalAmountDetailsType", propOrder = {
    "amount",
    "totalAmount",
    "currency",
    "paxAmountPriceBreakdown"
})
public class TotalAmountDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Amount")
    protected List<AmountDetailsType> amount;
    @XmlElement(name = "TotalAmount")
    protected Double totalAmount;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "PaxAmountPriceBreakdown")
    protected PaxAmountPriceBreakdown paxAmountPriceBreakdown;

    /**
     * Gets the value of the amount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountDetailsType }
     * 
     * 
     */
    public List<AmountDetailsType> getAmount() {
        if (amount == null) {
            amount = new ArrayList<AmountDetailsType>();
        }
        return this.amount;
    }

    /**
     * totalAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * totalAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAmount(Double value) {
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
     * paxAmountPriceBreakdown 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PaxAmountPriceBreakdown }
     *     
     */
    public PaxAmountPriceBreakdown getPaxAmountPriceBreakdown() {
        return paxAmountPriceBreakdown;
    }

    /**
     * paxAmountPriceBreakdown 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxAmountPriceBreakdown }
     *     
     */
    public void setPaxAmountPriceBreakdown(PaxAmountPriceBreakdown value) {
        this.paxAmountPriceBreakdown = value;
    }

}
