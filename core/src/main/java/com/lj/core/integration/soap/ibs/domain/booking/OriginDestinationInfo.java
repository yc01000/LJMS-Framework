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
 * <p>OriginDestinationInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="OriginDestinationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TripInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}TripInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PricingInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}PricingInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BestFareInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}BestFareInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TripDirection" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsPartOfRoundTrip" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SearchIndex" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="PricingUnitID" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestinationInfo", propOrder = {
    "tripInfo",
    "pricingInfo",
    "bestFareInfo"
})
public class OriginDestinationInfo
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "TripInfo")
    protected List<TripInfoType> tripInfo;
    @XmlElement(name = "PricingInfo")
    protected List<PricingInfoType> pricingInfo;
    @XmlElement(name = "BestFareInfo")
    protected List<BestFareInfo> bestFareInfo;
    @XmlAttribute(name = "TripDirection")
    protected String tripDirection;
    @XmlAttribute(name = "IsPartOfRoundTrip")
    protected Boolean isPartOfRoundTrip;
    @XmlAttribute(name = "SearchIndex")
    protected Integer searchIndex;
    @XmlAttribute(name = "PricingUnitID")
    protected Integer pricingUnitID;
    @XmlAttribute(name = "Origin")
    protected String origin;
    @XmlAttribute(name = "Destination")
    protected String destination;

    /**
     * Gets the value of the tripInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tripInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TripInfoType }
     * 
     * 
     */
    public List<TripInfoType> getTripInfo() {
        if (tripInfo == null) {
            tripInfo = new ArrayList<TripInfoType>();
        }
        return this.tripInfo;
    }

    /**
     * Gets the value of the pricingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingInfoType }
     * 
     * 
     */
    public List<PricingInfoType> getPricingInfo() {
        if (pricingInfo == null) {
            pricingInfo = new ArrayList<PricingInfoType>();
        }
        return this.pricingInfo;
    }

    /**
     * Gets the value of the bestFareInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bestFareInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBestFareInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BestFareInfo }
     * 
     * 
     */
    public List<BestFareInfo> getBestFareInfo() {
        if (bestFareInfo == null) {
            bestFareInfo = new ArrayList<BestFareInfo>();
        }
        return this.bestFareInfo;
    }

    /**
     * tripDirection 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripDirection() {
        return tripDirection;
    }

    /**
     * tripDirection 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripDirection(String value) {
        this.tripDirection = value;
    }

    /**
     * isPartOfRoundTrip 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPartOfRoundTrip() {
        return isPartOfRoundTrip;
    }

    /**
     * isPartOfRoundTrip 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPartOfRoundTrip(Boolean value) {
        this.isPartOfRoundTrip = value;
    }

    /**
     * searchIndex 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchIndex() {
        return searchIndex;
    }

    /**
     * searchIndex 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchIndex(Integer value) {
        this.searchIndex = value;
    }

    /**
     * pricingUnitID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPricingUnitID() {
        return pricingUnitID;
    }

    /**
     * pricingUnitID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPricingUnitID(Integer value) {
        this.pricingUnitID = value;
    }

    /**
     * origin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * origin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * destination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * destination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

}
