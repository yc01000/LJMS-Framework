//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2020.12.01 시간 08:47:33 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.inventory;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>LegFareClassDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="LegFareClassDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FareClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentFareClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BaseAuthorizedUnits" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AuthorizedUnits" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LegSoldSeats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LegRemainingSeats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegFareClassDetails", propOrder = {
    "fareClassCode",
    "parentFareClassCode",
    "baseAuthorizedUnits",
    "authorizedUnits",
    "legSoldSeats",
    "legRemainingSeats"
})
public class LegFareClassDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FareClassCode")
    protected String fareClassCode;
    @XmlElement(name = "ParentFareClassCode")
    protected String parentFareClassCode;
    @XmlElement(name = "BaseAuthorizedUnits")
    protected int baseAuthorizedUnits;
    @XmlElement(name = "AuthorizedUnits")
    protected int authorizedUnits;
    @XmlElement(name = "LegSoldSeats")
    protected int legSoldSeats;
    @XmlElement(name = "LegRemainingSeats")
    protected int legRemainingSeats;

    /**
     * fareClassCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareClassCode() {
        return fareClassCode;
    }

    /**
     * fareClassCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareClassCode(String value) {
        this.fareClassCode = value;
    }

    /**
     * parentFareClassCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentFareClassCode() {
        return parentFareClassCode;
    }

    /**
     * parentFareClassCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentFareClassCode(String value) {
        this.parentFareClassCode = value;
    }

    /**
     * baseAuthorizedUnits 속성의 값을 가져옵니다.
     * 
     */
    public int getBaseAuthorizedUnits() {
        return baseAuthorizedUnits;
    }

    /**
     * baseAuthorizedUnits 속성의 값을 설정합니다.
     * 
     */
    public void setBaseAuthorizedUnits(int value) {
        this.baseAuthorizedUnits = value;
    }

    /**
     * authorizedUnits 속성의 값을 가져옵니다.
     * 
     */
    public int getAuthorizedUnits() {
        return authorizedUnits;
    }

    /**
     * authorizedUnits 속성의 값을 설정합니다.
     * 
     */
    public void setAuthorizedUnits(int value) {
        this.authorizedUnits = value;
    }

    /**
     * legSoldSeats 속성의 값을 가져옵니다.
     * 
     */
    public int getLegSoldSeats() {
        return legSoldSeats;
    }

    /**
     * legSoldSeats 속성의 값을 설정합니다.
     * 
     */
    public void setLegSoldSeats(int value) {
        this.legSoldSeats = value;
    }

    /**
     * legRemainingSeats 속성의 값을 가져옵니다.
     * 
     */
    public int getLegRemainingSeats() {
        return legRemainingSeats;
    }

    /**
     * legRemainingSeats 속성의 값을 설정합니다.
     * 
     */
    public void setLegRemainingSeats(int value) {
        this.legRemainingSeats = value;
    }

}
