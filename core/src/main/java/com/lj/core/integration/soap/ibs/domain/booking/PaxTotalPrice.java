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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>PaxTotalPrice complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaxTotalPrice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FarePrice" type="{http://www.ibsplc.com/iRes/simpleTypes/}FarePrice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeePrice" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeePrice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="amount" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="paxid" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxTotalPrice", propOrder = {
    "farePrice",
    "feePrice"
})
public class PaxTotalPrice
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FarePrice")
    protected List<FarePrice> farePrice;
    @XmlElement(name = "FeePrice")
    protected List<FeePrice> feePrice;
    @XmlAttribute(name = "currency")
    protected String currency;
    @XmlAttribute(name = "amount")
    protected Double amount;
    @XmlAttribute(name = "paxid")
    protected Long paxid;

    /**
     * Gets the value of the farePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the farePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFarePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarePrice }
     * 
     * 
     */
    public List<FarePrice> getFarePrice() {
        if (farePrice == null) {
            farePrice = new ArrayList<FarePrice>();
        }
        return this.farePrice;
    }

    /**
     * Gets the value of the feePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeePrice }
     * 
     * 
     */
    public List<FeePrice> getFeePrice() {
        if (feePrice == null) {
            feePrice = new ArrayList<FeePrice>();
        }
        return this.feePrice;
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
     * paxid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaxid() {
        return paxid;
    }

    /**
     * paxid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaxid(Long value) {
        this.paxid = value;
    }

}
