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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>CustomerProfileContactDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileContactDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PrefferedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CellphoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlternatePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtensionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailingAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressTwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SendItineraryToEmailId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AlternateEmailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SendItineraryToAltEmailId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPhoneNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CellNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlternatePhoneNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SmartPhoneMailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SmartPhoneSendItinerary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProfileGuestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SendItineraryToSMS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileContactDetails", propOrder = {
    "addressType",
    "prefferedIndicator",
    "phoneNumber",
    "cellphoneNumber",
    "businessPhoneNumber",
    "alternatePhoneNumber",
    "extensionNumber",
    "mailingAddress",
    "addressOne",
    "addressTwo",
    "province",
    "zipCode",
    "city",
    "country",
    "fax",
    "emailId",
    "sendItineraryToEmailId",
    "alternateEmailId",
    "sendItineraryToAltEmailId",
    "phoneNumberCountryCode",
    "businessPhoneNumberCountryCode",
    "cellNumberCountryCode",
    "alternatePhoneNumberCountryCode",
    "smartPhoneMailId",
    "smartPhoneSendItinerary",
    "profileGuestId",
    "sendItineraryToSMS"
})
public class CustomerProfileContactDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AddressType", required = true)
    protected String addressType;
    @XmlElement(name = "PrefferedIndicator")
    protected boolean prefferedIndicator;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "CellphoneNumber")
    protected String cellphoneNumber;
    @XmlElement(name = "BusinessPhoneNumber")
    protected String businessPhoneNumber;
    @XmlElement(name = "AlternatePhoneNumber")
    protected String alternatePhoneNumber;
    @XmlElement(name = "ExtensionNumber")
    protected String extensionNumber;
    @XmlElement(name = "MailingAddress")
    protected String mailingAddress;
    @XmlElement(name = "AddressOne")
    protected String addressOne;
    @XmlElement(name = "AddressTwo")
    protected String addressTwo;
    @XmlElement(name = "Province")
    protected String province;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "EmailId")
    protected String emailId;
    @XmlElement(name = "SendItineraryToEmailId")
    protected Boolean sendItineraryToEmailId;
    @XmlElement(name = "AlternateEmailId")
    protected String alternateEmailId;
    @XmlElement(name = "SendItineraryToAltEmailId")
    protected Boolean sendItineraryToAltEmailId;
    @XmlElement(name = "PhoneNumberCountryCode")
    protected String phoneNumberCountryCode;
    @XmlElement(name = "BusinessPhoneNumberCountryCode")
    protected String businessPhoneNumberCountryCode;
    @XmlElement(name = "CellNumberCountryCode")
    protected String cellNumberCountryCode;
    @XmlElement(name = "AlternatePhoneNumberCountryCode")
    protected String alternatePhoneNumberCountryCode;
    @XmlElement(name = "SmartPhoneMailId")
    protected String smartPhoneMailId;
    @XmlElement(name = "SmartPhoneSendItinerary")
    protected Boolean smartPhoneSendItinerary;
    @XmlElement(name = "ProfileGuestId")
    protected String profileGuestId;
    @XmlElement(name = "SendItineraryToSMS")
    protected Boolean sendItineraryToSMS;

    /**
     * addressType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * addressType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * prefferedIndicator 속성의 값을 가져옵니다.
     * 
     */
    public boolean isPrefferedIndicator() {
        return prefferedIndicator;
    }

    /**
     * prefferedIndicator 속성의 값을 설정합니다.
     * 
     */
    public void setPrefferedIndicator(boolean value) {
        this.prefferedIndicator = value;
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
     * cellphoneNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    /**
     * cellphoneNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellphoneNumber(String value) {
        this.cellphoneNumber = value;
    }

    /**
     * businessPhoneNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPhoneNumber() {
        return businessPhoneNumber;
    }

    /**
     * businessPhoneNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPhoneNumber(String value) {
        this.businessPhoneNumber = value;
    }

    /**
     * alternatePhoneNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternatePhoneNumber() {
        return alternatePhoneNumber;
    }

    /**
     * alternatePhoneNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternatePhoneNumber(String value) {
        this.alternatePhoneNumber = value;
    }

    /**
     * extensionNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionNumber() {
        return extensionNumber;
    }

    /**
     * extensionNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionNumber(String value) {
        this.extensionNumber = value;
    }

    /**
     * mailingAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingAddress() {
        return mailingAddress;
    }

    /**
     * mailingAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingAddress(String value) {
        this.mailingAddress = value;
    }

    /**
     * addressOne 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressOne() {
        return addressOne;
    }

    /**
     * addressOne 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressOne(String value) {
        this.addressOne = value;
    }

    /**
     * addressTwo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTwo() {
        return addressTwo;
    }

    /**
     * addressTwo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTwo(String value) {
        this.addressTwo = value;
    }

    /**
     * province 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * province 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * zipCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * zipCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * city 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * city 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * country 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * country 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * fax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * fax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
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
     * sendItineraryToEmailId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendItineraryToEmailId() {
        return sendItineraryToEmailId;
    }

    /**
     * sendItineraryToEmailId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendItineraryToEmailId(Boolean value) {
        this.sendItineraryToEmailId = value;
    }

    /**
     * alternateEmailId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateEmailId() {
        return alternateEmailId;
    }

    /**
     * alternateEmailId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateEmailId(String value) {
        this.alternateEmailId = value;
    }

    /**
     * sendItineraryToAltEmailId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendItineraryToAltEmailId() {
        return sendItineraryToAltEmailId;
    }

    /**
     * sendItineraryToAltEmailId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendItineraryToAltEmailId(Boolean value) {
        this.sendItineraryToAltEmailId = value;
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
     * businessPhoneNumberCountryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPhoneNumberCountryCode() {
        return businessPhoneNumberCountryCode;
    }

    /**
     * businessPhoneNumberCountryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPhoneNumberCountryCode(String value) {
        this.businessPhoneNumberCountryCode = value;
    }

    /**
     * cellNumberCountryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellNumberCountryCode() {
        return cellNumberCountryCode;
    }

    /**
     * cellNumberCountryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellNumberCountryCode(String value) {
        this.cellNumberCountryCode = value;
    }

    /**
     * alternatePhoneNumberCountryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternatePhoneNumberCountryCode() {
        return alternatePhoneNumberCountryCode;
    }

    /**
     * alternatePhoneNumberCountryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternatePhoneNumberCountryCode(String value) {
        this.alternatePhoneNumberCountryCode = value;
    }

    /**
     * smartPhoneMailId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartPhoneMailId() {
        return smartPhoneMailId;
    }

    /**
     * smartPhoneMailId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartPhoneMailId(String value) {
        this.smartPhoneMailId = value;
    }

    /**
     * smartPhoneSendItinerary 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmartPhoneSendItinerary() {
        return smartPhoneSendItinerary;
    }

    /**
     * smartPhoneSendItinerary 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmartPhoneSendItinerary(Boolean value) {
        this.smartPhoneSendItinerary = value;
    }

    /**
     * profileGuestId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileGuestId() {
        return profileGuestId;
    }

    /**
     * profileGuestId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileGuestId(String value) {
        this.profileGuestId = value;
    }

    /**
     * sendItineraryToSMS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendItineraryToSMS() {
        return sendItineraryToSMS;
    }

    /**
     * sendItineraryToSMS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendItineraryToSMS(Boolean value) {
        this.sendItineraryToSMS = value;
    }

}
