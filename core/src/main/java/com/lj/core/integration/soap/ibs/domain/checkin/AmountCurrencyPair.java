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
 * Amount and corresponding currency
 * 
 * <p>AmountCurrencyPair complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AmountCurrencyPair"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="AmountPerPiece" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlatRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountCurrencyPair", propOrder = {
    "totalAmount",
    "amountPerPiece",
    "currency",
    "flatRate"
})
public class AmountCurrencyPair
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "TotalAmount")
    protected float totalAmount;
    @XmlElement(name = "AmountPerPiece")
    protected Float amountPerPiece;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "FlatRate")
    protected Float flatRate;

    /**
     * totalAmount 속성의 값을 가져옵니다.
     * 
     */
    public float getTotalAmount() {
        return totalAmount;
    }

    /**
     * totalAmount 속성의 값을 설정합니다.
     * 
     */
    public void setTotalAmount(float value) {
        this.totalAmount = value;
    }

    /**
     * amountPerPiece 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAmountPerPiece() {
        return amountPerPiece;
    }

    /**
     * amountPerPiece 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAmountPerPiece(Float value) {
        this.amountPerPiece = value;
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
     * flatRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFlatRate() {
        return flatRate;
    }

    /**
     * flatRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFlatRate(Float value) {
        this.flatRate = value;
    }

}
