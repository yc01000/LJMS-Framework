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
 * <p>AdvancedSearchType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AdvancedSearchType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaxNumOfFlights" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxNumOfStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxFareAmount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TypesOfService" type="{http://www.ibsplc.com/iRes/simpleTypes/}ServiceTypes" minOccurs="0"/&gt;
 *         &lt;element name="PreferredConnections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsCodeShare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvancedSearchType", propOrder = {
    "searchType",
    "maxNumOfFlights",
    "maxNumOfStops",
    "maxFareAmount",
    "fareClass",
    "typesOfService",
    "preferredConnections",
    "isCodeShare"
})
public class AdvancedSearchType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "SearchType")
    protected String searchType;
    @XmlElement(name = "MaxNumOfFlights")
    protected Integer maxNumOfFlights;
    @XmlElement(name = "MaxNumOfStops")
    protected Integer maxNumOfStops;
    @XmlElement(name = "MaxFareAmount")
    protected int maxFareAmount;
    @XmlElement(name = "FareClass")
    protected String fareClass;
    @XmlElement(name = "TypesOfService")
    protected ServiceTypes typesOfService;
    @XmlElement(name = "PreferredConnections")
    protected String preferredConnections;
    @XmlElement(name = "IsCodeShare")
    protected Boolean isCodeShare;

    /**
     * searchType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * searchType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchType(String value) {
        this.searchType = value;
    }

    /**
     * maxNumOfFlights 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumOfFlights() {
        return maxNumOfFlights;
    }

    /**
     * maxNumOfFlights 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumOfFlights(Integer value) {
        this.maxNumOfFlights = value;
    }

    /**
     * maxNumOfStops 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumOfStops() {
        return maxNumOfStops;
    }

    /**
     * maxNumOfStops 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumOfStops(Integer value) {
        this.maxNumOfStops = value;
    }

    /**
     * maxFareAmount 속성의 값을 가져옵니다.
     * 
     */
    public int getMaxFareAmount() {
        return maxFareAmount;
    }

    /**
     * maxFareAmount 속성의 값을 설정합니다.
     * 
     */
    public void setMaxFareAmount(int value) {
        this.maxFareAmount = value;
    }

    /**
     * fareClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareClass() {
        return fareClass;
    }

    /**
     * fareClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareClass(String value) {
        this.fareClass = value;
    }

    /**
     * typesOfService 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTypes }
     *     
     */
    public ServiceTypes getTypesOfService() {
        return typesOfService;
    }

    /**
     * typesOfService 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTypes }
     *     
     */
    public void setTypesOfService(ServiceTypes value) {
        this.typesOfService = value;
    }

    /**
     * preferredConnections 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredConnections() {
        return preferredConnections;
    }

    /**
     * preferredConnections 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredConnections(String value) {
        this.preferredConnections = value;
    }

    /**
     * isCodeShare 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCodeShare() {
        return isCodeShare;
    }

    /**
     * isCodeShare 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCodeShare(Boolean value) {
        this.isCodeShare = value;
    }

}
