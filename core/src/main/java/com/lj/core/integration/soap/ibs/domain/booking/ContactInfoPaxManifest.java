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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>ContactInfoPaxManifest complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ContactInfoPaxManifest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ContactType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CellPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AltCellPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AltEmailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CellPhoneNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AltCellPhoneNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SendSmsNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SendEmailNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PrefferedLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NameinMailingAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumberExtn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AltCellPhoneNumberExtn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoPaxManifest", propOrder = {
    "contactType",
    "phoneNumber",
    "cellPhoneNumber",
    "altCellPhoneNumber",
    "faxNumber",
    "emailID",
    "altEmailID",
    "guestId",
    "phoneNumberCountryCode",
    "cellPhoneNumberCountryCode",
    "altCellPhoneNumberCountryCode",
    "sendSmsNotification",
    "sendEmailNotification",
    "prefferedLanguage",
    "nameinMailingAddress",
    "phoneNumberExtn",
    "altCellPhoneNumberExtn"
})
public class ContactInfoPaxManifest
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ContactType")
    @XmlSchemaType(name = "string")
    protected ContactType contactType;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "CellPhoneNumber")
    protected String cellPhoneNumber;
    @XmlElement(name = "AltCellPhoneNumber")
    protected String altCellPhoneNumber;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;
    @XmlElement(name = "EmailID")
    protected String emailID;
    @XmlElement(name = "AltEmailID")
    protected String altEmailID;
    @XmlElement(name = "GuestId")
    protected String guestId;
    @XmlElement(name = "PhoneNumberCountryCode")
    protected String phoneNumberCountryCode;
    @XmlElement(name = "CellPhoneNumberCountryCode")
    protected String cellPhoneNumberCountryCode;
    @XmlElement(name = "AltCellPhoneNumberCountryCode")
    protected String altCellPhoneNumberCountryCode;
    @XmlElement(name = "SendSmsNotification")
    protected Boolean sendSmsNotification;
    @XmlElement(name = "SendEmailNotification")
    protected Boolean sendEmailNotification;
    @XmlElement(name = "PrefferedLanguage")
    protected String prefferedLanguage;
    @XmlElement(name = "NameinMailingAddress")
    protected String nameinMailingAddress;
    @XmlElement(name = "PhoneNumberExtn")
    protected String phoneNumberExtn;
    @XmlElement(name = "AltCellPhoneNumberExtn")
    protected String altCellPhoneNumberExtn;

    /**
     * contactType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getContactType() {
        return contactType;
    }

    /**
     * contactType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setContactType(ContactType value) {
        this.contactType = value;
    }

    /**
     * phoneNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * phoneNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * cellPhoneNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    /**
     * cellPhoneNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneNumber(String value) {
        this.cellPhoneNumber = value;
    }

    /**
     * altCellPhoneNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltCellPhoneNumber() {
        return altCellPhoneNumber;
    }

    /**
     * altCellPhoneNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltCellPhoneNumber(String value) {
        this.altCellPhoneNumber = value;
    }

    /**
     * faxNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * faxNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * emailID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailID() {
        return emailID;
    }

    /**
     * emailID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailID(String value) {
        this.emailID = value;
    }

    /**
     * altEmailID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltEmailID() {
        return altEmailID;
    }

    /**
     * altEmailID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltEmailID(String value) {
        this.altEmailID = value;
    }

    /**
     * guestId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestId() {
        return guestId;
    }

    /**
     * guestId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestId(String value) {
        this.guestId = value;
    }

    /**
     * phoneNumberCountryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberCountryCode() {
        return phoneNumberCountryCode;
    }

    /**
     * phoneNumberCountryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberCountryCode(String value) {
        this.phoneNumberCountryCode = value;
    }

    /**
     * cellPhoneNumberCountryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneNumberCountryCode() {
        return cellPhoneNumberCountryCode;
    }

    /**
     * cellPhoneNumberCountryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneNumberCountryCode(String value) {
        this.cellPhoneNumberCountryCode = value;
    }

    /**
     * altCellPhoneNumberCountryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltCellPhoneNumberCountryCode() {
        return altCellPhoneNumberCountryCode;
    }

    /**
     * altCellPhoneNumberCountryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltCellPhoneNumberCountryCode(String value) {
        this.altCellPhoneNumberCountryCode = value;
    }

    /**
     * sendSmsNotification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendSmsNotification() {
        return sendSmsNotification;
    }

    /**
     * sendSmsNotification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendSmsNotification(Boolean value) {
        this.sendSmsNotification = value;
    }

    /**
     * sendEmailNotification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendEmailNotification() {
        return sendEmailNotification;
    }

    /**
     * sendEmailNotification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendEmailNotification(Boolean value) {
        this.sendEmailNotification = value;
    }

    /**
     * prefferedLanguage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefferedLanguage() {
        return prefferedLanguage;
    }

    /**
     * prefferedLanguage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefferedLanguage(String value) {
        this.prefferedLanguage = value;
    }

    /**
     * nameinMailingAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameinMailingAddress() {
        return nameinMailingAddress;
    }

    /**
     * nameinMailingAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameinMailingAddress(String value) {
        this.nameinMailingAddress = value;
    }

    /**
     * phoneNumberExtn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberExtn() {
        return phoneNumberExtn;
    }

    /**
     * phoneNumberExtn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberExtn(String value) {
        this.phoneNumberExtn = value;
    }

    /**
     * altCellPhoneNumberExtn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltCellPhoneNumberExtn() {
        return altCellPhoneNumberExtn;
    }

    /**
     * altCellPhoneNumberExtn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltCellPhoneNumberExtn(String value) {
        this.altCellPhoneNumberExtn = value;
    }

}
