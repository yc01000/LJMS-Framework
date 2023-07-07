//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>CabinClassType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CabinClassType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="saleableSeats" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="bookedSeats" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="adultCheckedinSeats" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="childCheckedinSeats" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="infantCheckedinSeats" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="standbyCheckedinCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="cabin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinClassType", propOrder = {
    "saleableSeats",
    "bookedSeats",
    "adultCheckedinSeats",
    "childCheckedinSeats",
    "infantCheckedinSeats",
    "standbyCheckedinCount"
})
public class CabinClassType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected BigInteger saleableSeats;
    protected BigInteger bookedSeats;
    protected BigInteger adultCheckedinSeats;
    protected BigInteger childCheckedinSeats;
    protected BigInteger infantCheckedinSeats;
    protected BigInteger standbyCheckedinCount;
    @XmlAttribute(name = "cabin")
    protected String cabin;

    /**
     * saleableSeats 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSaleableSeats() {
        return saleableSeats;
    }

    /**
     * saleableSeats 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSaleableSeats(BigInteger value) {
        this.saleableSeats = value;
    }

    /**
     * bookedSeats 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBookedSeats() {
        return bookedSeats;
    }

    /**
     * bookedSeats 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBookedSeats(BigInteger value) {
        this.bookedSeats = value;
    }

    /**
     * adultCheckedinSeats 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdultCheckedinSeats() {
        return adultCheckedinSeats;
    }

    /**
     * adultCheckedinSeats 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdultCheckedinSeats(BigInteger value) {
        this.adultCheckedinSeats = value;
    }

    /**
     * childCheckedinSeats 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChildCheckedinSeats() {
        return childCheckedinSeats;
    }

    /**
     * childCheckedinSeats 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChildCheckedinSeats(BigInteger value) {
        this.childCheckedinSeats = value;
    }

    /**
     * infantCheckedinSeats 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInfantCheckedinSeats() {
        return infantCheckedinSeats;
    }

    /**
     * infantCheckedinSeats 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInfantCheckedinSeats(BigInteger value) {
        this.infantCheckedinSeats = value;
    }

    /**
     * standbyCheckedinCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStandbyCheckedinCount() {
        return standbyCheckedinCount;
    }

    /**
     * standbyCheckedinCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStandbyCheckedinCount(BigInteger value) {
        this.standbyCheckedinCount = value;
    }

    /**
     * cabin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabin() {
        return cabin;
    }

    /**
     * cabin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabin(String value) {
        this.cabin = value;
    }

}
