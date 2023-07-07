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
 * <p>PaxFareComponentAmountDtlsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaxFareComponentAmountDtlsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaxType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BaseFare" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FareComponentTaxDetailsTypes" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareComponentTaxDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FareComponentSurchargeDetailsTypes" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareComponentSurchargeDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxFareComponentAmountDtlsType", propOrder = {
    "paxType",
    "baseFare",
    "discount",
    "currency",
    "fareComponentTaxDetailsTypes",
    "fareComponentSurchargeDetailsTypes"
})
public class PaxFareComponentAmountDtlsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PaxType", required = true)
    protected String paxType;
    @XmlElement(name = "BaseFare")
    protected double baseFare;
    @XmlElement(name = "Discount")
    protected double discount;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "FareComponentTaxDetailsTypes")
    protected List<FareComponentTaxDetailsType> fareComponentTaxDetailsTypes;
    @XmlElement(name = "FareComponentSurchargeDetailsTypes")
    protected List<FareComponentSurchargeDetailsType> fareComponentSurchargeDetailsTypes;

    /**
     * paxType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxType() {
        return paxType;
    }

    /**
     * paxType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxType(String value) {
        this.paxType = value;
    }

    /**
     * baseFare 속성의 값을 가져옵니다.
     * 
     */
    public double getBaseFare() {
        return baseFare;
    }

    /**
     * baseFare 속성의 값을 설정합니다.
     * 
     */
    public void setBaseFare(double value) {
        this.baseFare = value;
    }

    /**
     * discount 속성의 값을 가져옵니다.
     * 
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * discount 속성의 값을 설정합니다.
     * 
     */
    public void setDiscount(double value) {
        this.discount = value;
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
     * Gets the value of the fareComponentTaxDetailsTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareComponentTaxDetailsTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareComponentTaxDetailsTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentTaxDetailsType }
     * 
     * 
     */
    public List<FareComponentTaxDetailsType> getFareComponentTaxDetailsTypes() {
        if (fareComponentTaxDetailsTypes == null) {
            fareComponentTaxDetailsTypes = new ArrayList<FareComponentTaxDetailsType>();
        }
        return this.fareComponentTaxDetailsTypes;
    }

    /**
     * Gets the value of the fareComponentSurchargeDetailsTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareComponentSurchargeDetailsTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareComponentSurchargeDetailsTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentSurchargeDetailsType }
     * 
     * 
     */
    public List<FareComponentSurchargeDetailsType> getFareComponentSurchargeDetailsTypes() {
        if (fareComponentSurchargeDetailsTypes == null) {
            fareComponentSurchargeDetailsTypes = new ArrayList<FareComponentSurchargeDetailsType>();
        }
        return this.fareComponentSurchargeDetailsTypes;
    }

}
