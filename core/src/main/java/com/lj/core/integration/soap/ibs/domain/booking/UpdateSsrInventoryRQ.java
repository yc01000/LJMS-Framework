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
 *         &lt;element name="BookingChannel" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingChannelKeyType"/&gt;
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SsrBookingSegmentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SsrBookingSegmentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SsrInvUpdateMode" type="{http://www.ibsplc.com/iRes/simpleTypes/}SsrInvUpdateModeType" minOccurs="0"/&gt;
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
    "bookingChannel",
    "airlineCode",
    "ssrBookingSegmentDetails",
    "ssrInvUpdateMode"
})
@XmlRootElement(name = "UpdateSsrInventoryRQ")
public class UpdateSsrInventoryRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "BookingChannel", required = true)
    protected BookingChannelKeyType bookingChannel;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "SsrBookingSegmentDetails")
    protected List<SsrBookingSegmentDetails> ssrBookingSegmentDetails;
    @XmlElement(name = "SsrInvUpdateMode")
    @XmlSchemaType(name = "string")
    protected SsrInvUpdateModeType ssrInvUpdateMode;

    /**
     * bookingChannel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BookingChannelKeyType }
     *     
     */
    public BookingChannelKeyType getBookingChannel() {
        return bookingChannel;
    }

    /**
     * bookingChannel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingChannelKeyType }
     *     
     */
    public void setBookingChannel(BookingChannelKeyType value) {
        this.bookingChannel = value;
    }

    /**
     * airlineCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * airlineCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the ssrBookingSegmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrBookingSegmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSsrBookingSegmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SsrBookingSegmentDetails }
     * 
     * 
     */
    public List<SsrBookingSegmentDetails> getSsrBookingSegmentDetails() {
        if (ssrBookingSegmentDetails == null) {
            ssrBookingSegmentDetails = new ArrayList<SsrBookingSegmentDetails>();
        }
        return this.ssrBookingSegmentDetails;
    }

    /**
     * ssrInvUpdateMode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SsrInvUpdateModeType }
     *     
     */
    public SsrInvUpdateModeType getSsrInvUpdateMode() {
        return ssrInvUpdateMode;
    }

    /**
     * ssrInvUpdateMode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SsrInvUpdateModeType }
     *     
     */
    public void setSsrInvUpdateMode(SsrInvUpdateModeType value) {
        this.ssrInvUpdateMode = value;
    }

}
