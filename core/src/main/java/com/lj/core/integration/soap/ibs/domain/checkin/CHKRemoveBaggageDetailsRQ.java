//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirlineCode"/&gt;
 *         &lt;element name="ChannelKey" type="{http://www.ibsplc.com/iRes/simpleTypes/}ChannelKeyType"/&gt;
 *         &lt;element name="SegmentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentInfo"/&gt;
 *         &lt;element name="FlightIdentifier" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierType"/&gt;
 *         &lt;element name="Name" type="{http://www.ibsplc.com/iRes/simpleTypes/}NameType"/&gt;
 *         &lt;element name="BagTagDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}BagTagDetailsType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="IsFeeRemovalNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airlineCode",
    "channelKey",
    "segmentInfo",
    "flightIdentifier",
    "name",
    "bagTagDetails",
    "isFeeRemovalNeeded"
})
@XmlRootElement(name = "CHK_RemoveBaggageDetailsRQ")
public class CHKRemoveBaggageDetailsRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected AirlineCode airlineCode;
    @XmlElement(name = "ChannelKey", required = true)
    protected ChannelKeyType channelKey;
    @XmlElement(name = "SegmentInfo", required = true)
    protected SegmentInfo segmentInfo;
    @XmlElement(name = "FlightIdentifier", required = true)
    protected FlightIdentifierType flightIdentifier;
    @XmlElement(name = "Name", required = true)
    protected NameType name;
    @XmlElement(name = "BagTagDetails", required = true)
    protected List<BagTagDetailsType> bagTagDetails;
    @XmlElement(name = "IsFeeRemovalNeeded")
    protected Boolean isFeeRemovalNeeded;

    /**
     * airlineCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AirlineCode }
     *     
     */
    public AirlineCode getAirlineCode() {
        return airlineCode;
    }

    /**
     * airlineCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineCode }
     *     
     */
    public void setAirlineCode(AirlineCode value) {
        this.airlineCode = value;
    }

    /**
     * channelKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ChannelKeyType }
     *     
     */
    public ChannelKeyType getChannelKey() {
        return channelKey;
    }

    /**
     * channelKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelKeyType }
     *     
     */
    public void setChannelKey(ChannelKeyType value) {
        this.channelKey = value;
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
     * Gets the value of the bagTagDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagTagDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagTagDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BagTagDetailsType }
     * 
     * 
     */
    public List<BagTagDetailsType> getBagTagDetails() {
        if (bagTagDetails == null) {
            bagTagDetails = new ArrayList<BagTagDetailsType>();
        }
        return this.bagTagDetails;
    }

    /**
     * isFeeRemovalNeeded 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFeeRemovalNeeded() {
        return isFeeRemovalNeeded;
    }

    /**
     * isFeeRemovalNeeded 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFeeRemovalNeeded(Boolean value) {
        this.isFeeRemovalNeeded = value;
    }

}
