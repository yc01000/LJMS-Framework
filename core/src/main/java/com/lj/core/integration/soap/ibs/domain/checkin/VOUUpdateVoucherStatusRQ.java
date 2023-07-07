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
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="PrintStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}PrintStatusType"/&gt;
 *         &lt;element name="PrintVoucherDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PrintVoucherDetails"/&gt;
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
    "airlineCode",
    "printStatus",
    "printVoucherDetails",
    "channelKey"
})
@XmlRootElement(name = "VOU_UpdateVoucherStatusRQ")
public class VOUUpdateVoucherStatusRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected AirlineCode airlineCode;
    @XmlElement(name = "PrintStatus", required = true)
    @XmlSchemaType(name = "string")
    protected PrintStatusType printStatus;
    @XmlElement(name = "PrintVoucherDetails", required = true)
    protected PrintVoucherDetails printVoucherDetails;
    @XmlElement(name = "ChannelKey", required = true)
    protected ChannelKeyType channelKey;

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
     * printStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PrintStatusType }
     *     
     */
    public PrintStatusType getPrintStatus() {
        return printStatus;
    }

    /**
     * printStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintStatusType }
     *     
     */
    public void setPrintStatus(PrintStatusType value) {
        this.printStatus = value;
    }

    /**
     * printVoucherDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PrintVoucherDetails }
     *     
     */
    public PrintVoucherDetails getPrintVoucherDetails() {
        return printVoucherDetails;
    }

    /**
     * printVoucherDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintVoucherDetails }
     *     
     */
    public void setPrintVoucherDetails(PrintVoucherDetails value) {
        this.printVoucherDetails = value;
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
