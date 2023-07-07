//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.05.28 시간 08:48:55 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ibsplc.com/iRes/simpleTypes/}BaseCheckinRQ">
 *       &lt;sequence>
 *         &lt;element name="BaggageInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}BaggageType" maxOccurs="unbounded"/>
 *         &lt;element name="SegmentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentInfo"/>
 *         &lt;element name="Name" type="{http://www.ibsplc.com/iRes/simpleTypes/}NameType"/>
 *         &lt;element name="NumberOfBags" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BagWeight" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FlightIdentifier" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierType"/>
 *         &lt;element name="IsExcessBagFound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AmountDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountCurrencyPair" minOccurs="0"/>
 *         &lt;element name="NoofExcessPieces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExcessFlowIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "baggageInfo",
    "segmentInfo",
    "name",
    "numberOfBags",
    "bagWeight",
    "flightIdentifier",
    "isExcessBagFound",
    "amountDetails",
    "noofExcessPieces",
    "excessFlowIndicator",
    "cabinClass"
})
@XmlRootElement(name = "CHK_AddBaggageDetailsRQ")
public class CHKAddBaggageDetailsRQ
    extends BaseCheckinRQ
{

    @XmlElement(name = "BaggageInfo", required = true)
    protected List<BaggageType> baggageInfo;
    @XmlElement(name = "SegmentInfo", required = true)
    protected SegmentInfo segmentInfo;
    @XmlElement(name = "Name", required = true)
    protected NameType name;
    @XmlElement(name = "NumberOfBags", required = true)
    protected String numberOfBags;
    @XmlElement(name = "BagWeight")
    protected List<String> bagWeight;
    @XmlElement(name = "FlightIdentifier", required = true)
    protected FlightIdentifierType flightIdentifier;
    @XmlElement(name = "IsExcessBagFound")
    protected Boolean isExcessBagFound;
    @XmlElement(name = "AmountDetails")
    protected AmountCurrencyPair amountDetails;
    @XmlElement(name = "NoofExcessPieces")
    protected Integer noofExcessPieces;
    @XmlElement(name = "ExcessFlowIndicator")
    protected Boolean excessFlowIndicator;
    @XmlElement(name = "CabinClass")
    protected String cabinClass;

    /**
     * Gets the value of the baggageInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageType }
     * 
     * 
     */
    public List<BaggageType> getBaggageInfo() {
        if (baggageInfo == null) {
            baggageInfo = new ArrayList<BaggageType>();
        }
        return this.baggageInfo;
    }

    /**
     * segmentInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SegmentInfo }
     *     
     */
    public SegmentInfo getSegmentInfo() {
        return segmentInfo;
    }

    /**
     * segmentInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentInfo }
     *     
     */
    public void setSegmentInfo(SegmentInfo value) {
        this.segmentInfo = value;
    }

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * numberOfBags 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfBags() {
        return numberOfBags;
    }

    /**
     * numberOfBags 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfBags(String value) {
        this.numberOfBags = value;
    }

    /**
     * Gets the value of the bagWeight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagWeight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagWeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBagWeight() {
        if (bagWeight == null) {
            bagWeight = new ArrayList<String>();
        }
        return this.bagWeight;
    }

    /**
     * flightIdentifier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightIdentifierType }
     *     
     */
    public FlightIdentifierType getFlightIdentifier() {
        return flightIdentifier;
    }

    /**
     * flightIdentifier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightIdentifierType }
     *     
     */
    public void setFlightIdentifier(FlightIdentifierType value) {
        this.flightIdentifier = value;
    }

    /**
     * isExcessBagFound 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExcessBagFound() {
        return isExcessBagFound;
    }

    /**
     * isExcessBagFound 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExcessBagFound(Boolean value) {
        this.isExcessBagFound = value;
    }

    /**
     * amountDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AmountCurrencyPair }
     *     
     */
    public AmountCurrencyPair getAmountDetails() {
        return amountDetails;
    }

    /**
     * amountDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountCurrencyPair }
     *     
     */
    public void setAmountDetails(AmountCurrencyPair value) {
        this.amountDetails = value;
    }

    /**
     * noofExcessPieces 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoofExcessPieces() {
        return noofExcessPieces;
    }

    /**
     * noofExcessPieces 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoofExcessPieces(Integer value) {
        this.noofExcessPieces = value;
    }

    /**
     * excessFlowIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcessFlowIndicator() {
        return excessFlowIndicator;
    }

    /**
     * excessFlowIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcessFlowIndicator(Boolean value) {
        this.excessFlowIndicator = value;
    }

    /**
     * cabinClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * cabinClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

}
