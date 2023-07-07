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
 * <p>AgencyContactDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AgencyContactDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgencyManagerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyManagerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManagerTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationAddress" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyAddress" minOccurs="0"/&gt;
 *         &lt;element name="BankAddress" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyAddress" minOccurs="0"/&gt;
 *         &lt;element name="MailingAddress" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyAddress" minOccurs="0"/&gt;
 *         &lt;element name="ManagerContactAddress" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyAddress" minOccurs="0"/&gt;
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsdPhoneCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AltPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsdCodeAltPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TollFreeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneExtensionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlternateEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgencyContactDetails", propOrder = {
    "agencyManagerFirstName",
    "agencyManagerLastName",
    "managerTitle",
    "locationAddress",
    "bankAddress",
    "mailingAddress",
    "managerContactAddress",
    "website",
    "emailAddress",
    "phoneNumber",
    "isdPhoneCode",
    "altPhoneNumber",
    "isdCodeAltPhone",
    "fax",
    "tollFreeNumber",
    "language",
    "phoneExtensionNumber",
    "alternateEmailAddress"
})
public class AgencyContactDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AgencyManagerFirstName")
    protected String agencyManagerFirstName;
    @XmlElement(name = "AgencyManagerLastName")
    protected String agencyManagerLastName;
    @XmlElement(name = "ManagerTitle")
    protected String managerTitle;
    @XmlElement(name = "LocationAddress")
    protected AgencyAddress locationAddress;
    @XmlElement(name = "BankAddress")
    protected AgencyAddress bankAddress;
    @XmlElement(name = "MailingAddress")
    protected AgencyAddress mailingAddress;
    @XmlElement(name = "ManagerContactAddress")
    protected AgencyAddress managerContactAddress;
    @XmlElement(name = "Website")
    protected String website;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "IsdPhoneCode")
    protected String isdPhoneCode;
    @XmlElement(name = "AltPhoneNumber")
    protected String altPhoneNumber;
    @XmlElement(name = "IsdCodeAltPhone")
    protected String isdCodeAltPhone;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "TollFreeNumber")
    protected String tollFreeNumber;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "PhoneExtensionNumber")
    protected String phoneExtensionNumber;
    @XmlElement(name = "AlternateEmailAddress")
    protected String alternateEmailAddress;

    /**
     * agencyManagerFirstName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyManagerFirstName() {
        return agencyManagerFirstName;
    }

    /**
     * agencyManagerFirstName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyManagerFirstName(String value) {
        this.agencyManagerFirstName = value;
    }

    /**
     * agencyManagerLastName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyManagerLastName() {
        return agencyManagerLastName;
    }

    /**
     * agencyManagerLastName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyManagerLastName(String value) {
        this.agencyManagerLastName = value;
    }

    /**
     * managerTitle 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerTitle() {
        return managerTitle;
    }

    /**
     * managerTitle 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerTitle(String value) {
        this.managerTitle = value;
    }

    /**
     * locationAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AgencyAddress }
     *     
     */
    public AgencyAddress getLocationAddress() {
        return locationAddress;
    }

    /**
     * locationAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyAddress }
     *     
     */
    public void setLocationAddress(AgencyAddress value) {
        this.locationAddress = value;
    }

    /**
     * bankAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AgencyAddress }
     *     
     */
    public AgencyAddress getBankAddress() {
        return bankAddress;
    }

    /**
     * bankAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyAddress }
     *     
     */
    public void setBankAddress(AgencyAddress value) {
        this.bankAddress = value;
    }

    /**
     * mailingAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AgencyAddress }
     *     
     */
    public AgencyAddress getMailingAddress() {
        return mailingAddress;
    }

    /**
     * mailingAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyAddress }
     *     
     */
    public void setMailingAddress(AgencyAddress value) {
        this.mailingAddress = value;
    }

    /**
     * managerContactAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AgencyAddress }
     *     
     */
    public AgencyAddress getManagerContactAddress() {
        return managerContactAddress;
    }

    /**
     * managerContactAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyAddress }
     *     
     */
    public void setManagerContactAddress(AgencyAddress value) {
        this.managerContactAddress = value;
    }

    /**
     * website 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * website 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * emailAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * emailAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
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
     * isdPhoneCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsdPhoneCode() {
        return isdPhoneCode;
    }

    /**
     * isdPhoneCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsdPhoneCode(String value) {
        this.isdPhoneCode = value;
    }

    /**
     * altPhoneNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltPhoneNumber() {
        return altPhoneNumber;
    }

    /**
     * altPhoneNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltPhoneNumber(String value) {
        this.altPhoneNumber = value;
    }

    /**
     * isdCodeAltPhone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsdCodeAltPhone() {
        return isdCodeAltPhone;
    }

    /**
     * isdCodeAltPhone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsdCodeAltPhone(String value) {
        this.isdCodeAltPhone = value;
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
     * tollFreeNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFreeNumber() {
        return tollFreeNumber;
    }

    /**
     * tollFreeNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollFreeNumber(String value) {
        this.tollFreeNumber = value;
    }

    /**
     * language 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * language 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * phoneExtensionNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneExtensionNumber() {
        return phoneExtensionNumber;
    }

    /**
     * phoneExtensionNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneExtensionNumber(String value) {
        this.phoneExtensionNumber = value;
    }

    /**
     * alternateEmailAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateEmailAddress() {
        return alternateEmailAddress;
    }

    /**
     * alternateEmailAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateEmailAddress(String value) {
        this.alternateEmailAddress = value;
    }

}
