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
 * <p>PaxDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaxDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PassengerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSRDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SSRDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BagTags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckinStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PaxType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FFPNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InfantIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="McoNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxDetails", propOrder = {
    "passengerName",
    "seatNumber",
    "ssrDetails",
    "bagTags",
    "checkinStatus",
    "ticketNumber",
    "couponNumber",
    "paxType",
    "ffpNumber",
    "infantIndicator",
    "mcoNumbers"
})
public class PaxDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PassengerName", required = true)
    protected String passengerName;
    @XmlElement(name = "SeatNumber")
    protected String seatNumber;
    @XmlElement(name = "SSRDetails")
    protected List<SSRDetails> ssrDetails;
    @XmlElement(name = "BagTags")
    protected String bagTags;
    @XmlElement(name = "CheckinStatus")
    protected String checkinStatus;
    @XmlElement(name = "TicketNumber")
    protected String ticketNumber;
    @XmlElement(name = "CouponNumber")
    protected Integer couponNumber;
    @XmlElement(name = "PaxType", required = true)
    protected String paxType;
    @XmlElement(name = "FFPNumber")
    protected String ffpNumber;
    @XmlElement(name = "InfantIndicator", required = true)
    protected String infantIndicator;
    @XmlElement(name = "McoNumbers")
    protected String mcoNumbers;

    /**
     * passengerName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerName() {
        return passengerName;
    }

    /**
     * passengerName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerName(String value) {
        this.passengerName = value;
    }

    /**
     * seatNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * seatNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * Gets the value of the ssrDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSRDetails }
     * 
     * 
     */
    public List<SSRDetails> getSSRDetails() {
        if (ssrDetails == null) {
            ssrDetails = new ArrayList<SSRDetails>();
        }
        return this.ssrDetails;
    }

    /**
     * bagTags 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagTags() {
        return bagTags;
    }

    /**
     * bagTags 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagTags(String value) {
        this.bagTags = value;
    }

    /**
     * checkinStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckinStatus() {
        return checkinStatus;
    }

    /**
     * checkinStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckinStatus(String value) {
        this.checkinStatus = value;
    }

    /**
     * ticketNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * ticketNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * couponNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCouponNumber() {
        return couponNumber;
    }

    /**
     * couponNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCouponNumber(Integer value) {
        this.couponNumber = value;
    }

    /**
     * paxType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxType() {
        return paxType;
    }

    /**
     * paxType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxType(String value) {
        this.paxType = value;
    }

    /**
     * ffpNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFPNumber() {
        return ffpNumber;
    }

    /**
     * ffpNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFPNumber(String value) {
        this.ffpNumber = value;
    }

    /**
     * infantIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfantIndicator() {
        return infantIndicator;
    }

    /**
     * infantIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfantIndicator(String value) {
        this.infantIndicator = value;
    }

    /**
     * mcoNumbers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcoNumbers() {
        return mcoNumbers;
    }

    /**
     * mcoNumbers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcoNumbers(String value) {
        this.mcoNumbers = value;
    }

}
