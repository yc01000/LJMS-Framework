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
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AgentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PasswordType" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgentPasswordType"/&gt;
 *         &lt;element name="IsResetPassword" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LoginPasswordChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PasswordChangeType" minOccurs="0"/&gt;
 *         &lt;element name="CreditPasswordChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PasswordChangeType" minOccurs="0"/&gt;
 *         &lt;element name="BookingChannel" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingChannelKeyType"/&gt;
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
    "agencyCode",
    "agentId",
    "passwordType",
    "isResetPassword",
    "loginPasswordChangeType",
    "creditPasswordChangeType",
    "bookingChannel"
})
@XmlRootElement(name = "ChangeTravelAgentPasswordRQ")
public class ChangeTravelAgentPasswordRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "AgencyCode", required = true)
    protected String agencyCode;
    @XmlElement(name = "AgentId", required = true)
    protected String agentId;
    @XmlElement(name = "PasswordType", required = true)
    @XmlSchemaType(name = "string")
    protected AgentPasswordType passwordType;
    @XmlElement(name = "IsResetPassword")
    protected boolean isResetPassword;
    @XmlElement(name = "LoginPasswordChangeType")
    protected PasswordChangeType loginPasswordChangeType;
    @XmlElement(name = "CreditPasswordChangeType")
    protected PasswordChangeType creditPasswordChangeType;
    @XmlElement(name = "BookingChannel", required = true)
    protected BookingChannelKeyType bookingChannel;

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
     * agencyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * agencyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * agentId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * agentId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentId(String value) {
        this.agentId = value;
    }

    /**
     * passwordType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AgentPasswordType }
     *     
     */
    public AgentPasswordType getPasswordType() {
        return passwordType;
    }

    /**
     * passwordType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentPasswordType }
     *     
     */
    public void setPasswordType(AgentPasswordType value) {
        this.passwordType = value;
    }

    /**
     * isResetPassword 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsResetPassword() {
        return isResetPassword;
    }

    /**
     * isResetPassword 속성의 값을 설정합니다.
     * 
     */
    public void setIsResetPassword(boolean value) {
        this.isResetPassword = value;
    }

    /**
     * loginPasswordChangeType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PasswordChangeType }
     *     
     */
    public PasswordChangeType getLoginPasswordChangeType() {
        return loginPasswordChangeType;
    }

    /**
     * loginPasswordChangeType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordChangeType }
     *     
     */
    public void setLoginPasswordChangeType(PasswordChangeType value) {
        this.loginPasswordChangeType = value;
    }

    /**
     * creditPasswordChangeType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PasswordChangeType }
     *     
     */
    public PasswordChangeType getCreditPasswordChangeType() {
        return creditPasswordChangeType;
    }

    /**
     * creditPasswordChangeType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordChangeType }
     *     
     */
    public void setCreditPasswordChangeType(PasswordChangeType value) {
        this.creditPasswordChangeType = value;
    }

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

}
