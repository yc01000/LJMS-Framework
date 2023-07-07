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
 * Pnr Common Info
 * 
 * <p>PnrCommonType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PnrCommonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrginalCaller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookingDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType" minOccurs="0"/&gt;
 *         &lt;element name="LastModified" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateAndTimeType" minOccurs="0"/&gt;
 *         &lt;element name="AgentOrChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TravelAgentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrCommonType", propOrder = {
    "confirmationNumber",
    "orginalCaller",
    "bookingDate",
    "lastModified",
    "agentOrChannel",
    "travelAgentName"
})
public class PnrCommonType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ConfirmationNumber")
    protected String confirmationNumber;
    @XmlElement(name = "OrginalCaller")
    protected String orginalCaller;
    @XmlElement(name = "BookingDate")
    protected DateOnlyType bookingDate;
    @XmlElement(name = "LastModified")
    protected DateAndTimeType lastModified;
    @XmlElement(name = "AgentOrChannel")
    protected String agentOrChannel;
    @XmlElement(name = "TravelAgentName")
    protected String travelAgentName;

    /**
     * confirmationNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * confirmationNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

    /**
     * orginalCaller 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrginalCaller() {
        return orginalCaller;
    }

    /**
     * orginalCaller 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrginalCaller(String value) {
        this.orginalCaller = value;
    }

    /**
     * bookingDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getBookingDate() {
        return bookingDate;
    }

    /**
     * bookingDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setBookingDate(DateOnlyType value) {
        this.bookingDate = value;
    }

    /**
     * lastModified 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeType }
     *     
     */
    public DateAndTimeType getLastModified() {
        return lastModified;
    }

    /**
     * lastModified 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeType }
     *     
     */
    public void setLastModified(DateAndTimeType value) {
        this.lastModified = value;
    }

    /**
     * agentOrChannel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentOrChannel() {
        return agentOrChannel;
    }

    /**
     * agentOrChannel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentOrChannel(String value) {
        this.agentOrChannel = value;
    }

    /**
     * travelAgentName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelAgentName() {
        return travelAgentName;
    }

    /**
     * travelAgentName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelAgentName(String value) {
        this.travelAgentName = value;
    }

}
