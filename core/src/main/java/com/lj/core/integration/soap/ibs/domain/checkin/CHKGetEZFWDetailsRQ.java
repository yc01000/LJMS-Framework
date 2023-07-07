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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Retrieve the flight information corresponding to flight date,flight number and airport code.
 * 
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightDetailsInputType" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightDetailsInputType"/&gt;
 *         &lt;element name="ChannelKey" type="{http://www.ibsplc.com/iRes/simpleTypes/}ChannelKeyType"/&gt;
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
    "flightDetailsInputType",
    "channelKey"
})
@XmlRootElement(name = "CHK_GetEZFWDetailsRQ")
public class CHKGetEZFWDetailsRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected FlightDetailsInputType flightDetailsInputType;
    @XmlElement(name = "ChannelKey", required = true)
    protected ChannelKeyType channelKey;

    /**
     * flightDetailsInputType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailsInputType }
     *     
     */
    public FlightDetailsInputType getFlightDetailsInputType() {
        return flightDetailsInputType;
    }

    /**
     * flightDetailsInputType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailsInputType }
     *     
     */
    public void setFlightDetailsInputType(FlightDetailsInputType value) {
        this.flightDetailsInputType = value;
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

}
