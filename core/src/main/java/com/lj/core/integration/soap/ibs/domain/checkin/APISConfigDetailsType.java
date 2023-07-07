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
 * The object includes APIS configuration details requested for a route.
 * 
 * <p>APISConfigDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="APISConfigDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="originCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="originCityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="destinationCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="destinationCityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apisMandatoryIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estaMandatoryIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nexofKinIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sfpdMandatoryIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="overFlyingCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APISConfigDetailsType", propOrder = {
    "entity",
    "originCountryCode",
    "originCityCode",
    "destinationCountryCode",
    "destinationCityCode",
    "apisMandatoryIndicator",
    "estaMandatoryIndicator",
    "nexofKinIndicator",
    "sfpdMandatoryIndicator",
    "overFlyingCountry"
})
public class APISConfigDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected String entity;
    @XmlElement(required = true)
    protected String originCountryCode;
    @XmlElement(required = true)
    protected String originCityCode;
    @XmlElement(required = true)
    protected String destinationCountryCode;
    @XmlElement(required = true)
    protected String destinationCityCode;
    @XmlElement(required = true)
    protected String apisMandatoryIndicator;
    @XmlElement(required = true)
    protected String estaMandatoryIndicator;
    @XmlElement(required = true)
    protected String nexofKinIndicator;
    @XmlElement(required = true)
    protected String sfpdMandatoryIndicator;
    @XmlElement(required = true)
    protected String overFlyingCountry;

    /**
     * entity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntity() {
        return entity;
    }

    /**
     * entity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntity(String value) {
        this.entity = value;
    }

    /**
     * originCountryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /**
     * originCountryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCountryCode(String value) {
        this.originCountryCode = value;
    }

    /**
     * originCityCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCityCode() {
        return originCityCode;
    }

    /**
     * originCityCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCityCode(String value) {
        this.originCityCode = value;
    }

    /**
     * destinationCountryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /**
     * destinationCountryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCountryCode(String value) {
        this.destinationCountryCode = value;
    }

    /**
     * destinationCityCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCityCode() {
        return destinationCityCode;
    }

    /**
     * destinationCityCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCityCode(String value) {
        this.destinationCityCode = value;
    }

    /**
     * apisMandatoryIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApisMandatoryIndicator() {
        return apisMandatoryIndicator;
    }

    /**
     * apisMandatoryIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApisMandatoryIndicator(String value) {
        this.apisMandatoryIndicator = value;
    }

    /**
     * estaMandatoryIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstaMandatoryIndicator() {
        return estaMandatoryIndicator;
    }

    /**
     * estaMandatoryIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstaMandatoryIndicator(String value) {
        this.estaMandatoryIndicator = value;
    }

    /**
     * nexofKinIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNexofKinIndicator() {
        return nexofKinIndicator;
    }

    /**
     * nexofKinIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNexofKinIndicator(String value) {
        this.nexofKinIndicator = value;
    }

    /**
     * sfpdMandatoryIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfpdMandatoryIndicator() {
        return sfpdMandatoryIndicator;
    }

    /**
     * sfpdMandatoryIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfpdMandatoryIndicator(String value) {
        this.sfpdMandatoryIndicator = value;
    }

    /**
     * overFlyingCountry 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverFlyingCountry() {
        return overFlyingCountry;
    }

    /**
     * overFlyingCountry 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverFlyingCountry(String value) {
        this.overFlyingCountry = value;
    }

}
