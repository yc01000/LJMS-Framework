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
 * <p>SaleableAncillaries complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SaleableAncillaries"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaleableSsrs" type="{http://www.ibsplc.com/iRes/simpleTypes/}SaleableSsrs" minOccurs="0"/&gt;
 *         &lt;element name="SaleableAuxs" type="{http://www.ibsplc.com/iRes/simpleTypes/}SaleableAuxs" minOccurs="0"/&gt;
 *         &lt;element name="AirportAncillaries" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportAncillaries" minOccurs="0"/&gt;
 *         &lt;element name="NotifiableSsrs" type="{http://www.ibsplc.com/iRes/simpleTypes/}NotifiableSsrs" minOccurs="0"/&gt;
 *         &lt;element name="NotofiableAuxs" type="{http://www.ibsplc.com/iRes/simpleTypes/}NotofiableAuxs" minOccurs="0"/&gt;
 *         &lt;element name="SegmentIds" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentIds" minOccurs="0"/&gt;
 *         &lt;element name="OandDId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Itinerary" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItineraryDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleableAncillaries", propOrder = {
    "saleableSsrs",
    "saleableAuxs",
    "airportAncillaries",
    "notifiableSsrs",
    "notofiableAuxs",
    "segmentIds",
    "oandDId",
    "itinerary"
})
public class SaleableAncillaries
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "SaleableSsrs")
    protected SaleableSsrs saleableSsrs;
    @XmlElement(name = "SaleableAuxs")
    protected SaleableAuxs saleableAuxs;
    @XmlElement(name = "AirportAncillaries")
    protected AirportAncillaries airportAncillaries;
    @XmlElement(name = "NotifiableSsrs")
    protected NotifiableSsrs notifiableSsrs;
    @XmlElement(name = "NotofiableAuxs")
    protected NotofiableAuxs notofiableAuxs;
    @XmlElement(name = "SegmentIds")
    protected SegmentIds segmentIds;
    @XmlElement(name = "OandDId")
    protected Long oandDId;
    @XmlElement(name = "Itinerary")
    protected List<ItineraryDetailsType> itinerary;

    /**
     * saleableSsrs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SaleableSsrs }
     *     
     */
    public SaleableSsrs getSaleableSsrs() {
        return saleableSsrs;
    }

    /**
     * saleableSsrs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleableSsrs }
     *     
     */
    public void setSaleableSsrs(SaleableSsrs value) {
        this.saleableSsrs = value;
    }

    /**
     * saleableAuxs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SaleableAuxs }
     *     
     */
    public SaleableAuxs getSaleableAuxs() {
        return saleableAuxs;
    }

    /**
     * saleableAuxs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleableAuxs }
     *     
     */
    public void setSaleableAuxs(SaleableAuxs value) {
        this.saleableAuxs = value;
    }

    /**
     * airportAncillaries 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AirportAncillaries }
     *     
     */
    public AirportAncillaries getAirportAncillaries() {
        return airportAncillaries;
    }

    /**
     * airportAncillaries 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportAncillaries }
     *     
     */
    public void setAirportAncillaries(AirportAncillaries value) {
        this.airportAncillaries = value;
    }

    /**
     * notifiableSsrs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NotifiableSsrs }
     *     
     */
    public NotifiableSsrs getNotifiableSsrs() {
        return notifiableSsrs;
    }

    /**
     * notifiableSsrs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifiableSsrs }
     *     
     */
    public void setNotifiableSsrs(NotifiableSsrs value) {
        this.notifiableSsrs = value;
    }

    /**
     * notofiableAuxs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NotofiableAuxs }
     *     
     */
    public NotofiableAuxs getNotofiableAuxs() {
        return notofiableAuxs;
    }

    /**
     * notofiableAuxs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NotofiableAuxs }
     *     
     */
    public void setNotofiableAuxs(NotofiableAuxs value) {
        this.notofiableAuxs = value;
    }

    /**
     * segmentIds 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SegmentIds }
     *     
     */
    public SegmentIds getSegmentIds() {
        return segmentIds;
    }

    /**
     * segmentIds 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentIds }
     *     
     */
    public void setSegmentIds(SegmentIds value) {
        this.segmentIds = value;
    }

    /**
     * oandDId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOandDId() {
        return oandDId;
    }

    /**
     * oandDId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOandDId(Long value) {
        this.oandDId = value;
    }

    /**
     * Gets the value of the itinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryDetailsType }
     * 
     * 
     */
    public List<ItineraryDetailsType> getItinerary() {
        if (itinerary == null) {
            itinerary = new ArrayList<ItineraryDetailsType>();
        }
        return this.itinerary;
    }

}
