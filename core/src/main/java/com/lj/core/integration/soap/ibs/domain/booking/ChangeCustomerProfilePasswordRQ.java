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
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LoginUserInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}UserInfo"/&gt;
 *         &lt;element name="IsResetPassword" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EmailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="LoginPasswordChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PasswordChangeType" minOccurs="0"/&gt;
 *         &lt;element name="LinkExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecurityInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}SecurityInfoType" minOccurs="0"/&gt;
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
    "profileId",
    "loginUserInfo",
    "isResetPassword",
    "emailId",
    "dateOfBirth",
    "loginPasswordChangeType",
    "linkExpiryDate",
    "securityInfo",
    "bookingChannel"
})
@XmlRootElement(name = "ChangeCustomerProfilePasswordRQ")
public class ChangeCustomerProfilePasswordRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "ProfileId")
    protected String profileId;
    @XmlElement(name = "LoginUserInfo", required = true)
    protected UserInfo loginUserInfo;
    @XmlElement(name = "IsResetPassword")
    protected boolean isResetPassword;
    @XmlElement(name = "EmailId")
    protected String emailId;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "LoginPasswordChangeType")
    protected PasswordChangeType loginPasswordChangeType;
    @XmlElement(name = "LinkExpiryDate")
    protected String linkExpiryDate;
    @XmlElement(name = "SecurityInfo")
    protected SecurityInfoType securityInfo;
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
     * profileId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * profileId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileId(String value) {
        this.profileId = value;
    }

    /**
     * loginUserInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UserInfo }
     *     
     */
    public UserInfo getLoginUserInfo() {
        return loginUserInfo;
    }

    /**
     * loginUserInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfo }
     *     
     */
    public void setLoginUserInfo(UserInfo value) {
        this.loginUserInfo = value;
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
     * emailId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * emailId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailId(String value) {
        this.emailId = value;
    }

    /**
     * dateOfBirth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * dateOfBirth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
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
     * linkExpiryDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkExpiryDate() {
        return linkExpiryDate;
    }

    /**
     * linkExpiryDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkExpiryDate(String value) {
        this.linkExpiryDate = value;
    }

    /**
     * securityInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInfoType }
     *     
     */
    public SecurityInfoType getSecurityInfo() {
        return securityInfo;
    }

    /**
     * securityInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInfoType }
     *     
     */
    public void setSecurityInfo(SecurityInfoType value) {
        this.securityInfo = value;
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
