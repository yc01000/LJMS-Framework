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
 * <p>FareDisplayCurrencyDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FareDisplayCurrencyDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TotalFare" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CombinedPaxDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FareDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DisplayAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalSurcharge" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDisplayCurrencyDetailsType", propOrder = {
    "currency",
    "totalFare",
    "combinedPaxDiscount",
    "fareDiscount",
    "displayAmount",
    "totalTax",
    "totalSurcharge"
})
public class FareDisplayCurrencyDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "TotalFare")
    protected double totalFare;
    @XmlElement(name = "CombinedPaxDiscount")
    protected double combinedPaxDiscount;
    @XmlElement(name = "FareDiscount")
    protected double fareDiscount;
    @XmlElement(name = "DisplayAmount")
    protected double displayAmount;
    @XmlElement(name = "TotalTax")
    protected double totalTax;
    @XmlElement(name = "TotalSurcharge")
    protected double totalSurcharge;

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
     * totalFare 속성의 값을 가져옵니다.
     * 
     */
    public double getTotalFare() {
        return totalFare;
    }

    /**
     * totalFare 속성의 값을 설정합니다.
     * 
     */
    public void setTotalFare(double value) {
        this.totalFare = value;
    }

    /**
     * combinedPaxDiscount 속성의 값을 가져옵니다.
     * 
     */
    public double getCombinedPaxDiscount() {
        return combinedPaxDiscount;
    }

    /**
     * combinedPaxDiscount 속성의 값을 설정합니다.
     * 
     */
    public void setCombinedPaxDiscount(double value) {
        this.combinedPaxDiscount = value;
    }

    /**
     * fareDiscount 속성의 값을 가져옵니다.
     * 
     */
    public double getFareDiscount() {
        return fareDiscount;
    }

    /**
     * fareDiscount 속성의 값을 설정합니다.
     * 
     */
    public void setFareDiscount(double value) {
        this.fareDiscount = value;
    }

    /**
     * displayAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getDisplayAmount() {
        return displayAmount;
    }

    /**
     * displayAmount 속성의 값을 설정합니다.
     * 
     */
    public void setDisplayAmount(double value) {
        this.displayAmount = value;
    }

    /**
     * totalTax 속성의 값을 가져옵니다.
     * 
     */
    public double getTotalTax() {
        return totalTax;
    }

    /**
     * totalTax 속성의 값을 설정합니다.
     * 
     */
    public void setTotalTax(double value) {
        this.totalTax = value;
    }

    /**
     * totalSurcharge 속성의 값을 가져옵니다.
     * 
     */
    public double getTotalSurcharge() {
        return totalSurcharge;
    }

    /**
     * totalSurcharge 속성의 값을 설정합니다.
     * 
     */
    public void setTotalSurcharge(double value) {
        this.totalSurcharge = value;
    }

}
