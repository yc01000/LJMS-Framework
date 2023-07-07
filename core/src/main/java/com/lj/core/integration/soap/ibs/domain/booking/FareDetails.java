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
 * <p>FareDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FareDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseFare" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FareLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChildBaseFare" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="InfantBaseFare" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDetails", propOrder = {
    "baseFare",
    "fareLevel",
    "fareBasisCode",
    "currency",
    "childBaseFare",
    "infantBaseFare"
})
public class FareDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "BaseFare")
    protected double baseFare;
    @XmlElement(name = "FareLevel")
    protected String fareLevel;
    @XmlElement(name = "FareBasisCode")
    protected String fareBasisCode;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "ChildBaseFare")
    protected double childBaseFare;
    @XmlElement(name = "InfantBaseFare")
    protected double infantBaseFare;

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
     * fareLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareLevel() {
        return fareLevel;
    }

    /**
     * fareLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareLevel(String value) {
        this.fareLevel = value;
    }

    /**
     * fareBasisCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * fareBasisCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
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
     * childBaseFare 속성의 값을 가져옵니다.
     * 
     */
    public double getChildBaseFare() {
        return childBaseFare;
    }

    /**
     * childBaseFare 속성의 값을 설정합니다.
     * 
     */
    public void setChildBaseFare(double value) {
        this.childBaseFare = value;
    }

    /**
     * infantBaseFare 속성의 값을 가져옵니다.
     * 
     */
    public double getInfantBaseFare() {
        return infantBaseFare;
    }

    /**
     * infantBaseFare 속성의 값을 설정합니다.
     * 
     */
    public void setInfantBaseFare(double value) {
        this.infantBaseFare = value;
    }

}
