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
 * <p>PnrContactType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PnrContactType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NamePrefix" type="{http://www.ibsplc.com/iRes/simpleTypes/}NameTitle_Type" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalSurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmergencyContactRelation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.ibsplc.com/iRes/simpleTypes/}AddressType"/&gt;
 *         &lt;element name="ItineraryReceivingMode" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItineraryReceivingType" minOccurs="0"/&gt;
 *         &lt;element name="ContactType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ContactDetails_Type" minOccurs="0"/&gt;
 *         &lt;element name="IsPrefferedContact" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PrefferedLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrContactType", propOrder = {
    "namePrefix",
    "givenName",
    "localGivenName",
    "middleName",
    "surName",
    "localSurName",
    "guestId",
    "emergencyContactRelation",
    "address",
    "itineraryReceivingMode",
    "contactType",
    "isPrefferedContact",
    "prefferedLanguage"
})
public class PnrContactType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "NamePrefix")
    @XmlSchemaType(name = "string")
    protected NameTitleType namePrefix;
    @XmlElement(name = "GivenName")
    protected String givenName;
    @XmlElement(name = "LocalGivenName")
    protected String localGivenName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "SurName")
    protected String surName;
    @XmlElement(name = "LocalSurName")
    protected String localSurName;
    @XmlElement(name = "GuestId")
    protected String guestId;
    @XmlElement(name = "EmergencyContactRelation")
    protected String emergencyContactRelation;
    @XmlElement(name = "Address", required = true)
    protected AddressType address;
    @XmlElement(name = "ItineraryReceivingMode")
    @XmlSchemaType(name = "string")
    protected ItineraryReceivingType itineraryReceivingMode;
    @XmlElement(name = "ContactType")
    @XmlSchemaType(name = "string")
    protected ContactDetailsType contactType;
    @XmlElement(name = "IsPrefferedContact")
    protected boolean isPrefferedContact;
    @XmlElement(name = "PrefferedLanguage")
    protected String prefferedLanguage;

    /**
     * namePrefix 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NameTitleType }
     *     
     */
    public NameTitleType getNamePrefix() {
        return namePrefix;
    }

    /**
     * namePrefix 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTitleType }
     *     
     */
    public void setNamePrefix(NameTitleType value) {
        this.namePrefix = value;
    }

    /**
     * givenName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * givenName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * localGivenName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalGivenName() {
        return localGivenName;
    }

    /**
     * localGivenName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalGivenName(String value) {
        this.localGivenName = value;
    }

    /**
     * middleName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * middleName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * surName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurName() {
        return surName;
    }

    /**
     * surName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurName(String value) {
        this.surName = value;
    }

    /**
     * localSurName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalSurName() {
        return localSurName;
    }

    /**
     * localSurName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalSurName(String value) {
        this.localSurName = value;
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
     * emergencyContactRelation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactRelation() {
        return emergencyContactRelation;
    }

    /**
     * emergencyContactRelation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactRelation(String value) {
        this.emergencyContactRelation = value;
    }

    /**
     * address 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * address 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * itineraryReceivingMode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryReceivingType }
     *     
     */
    public ItineraryReceivingType getItineraryReceivingMode() {
        return itineraryReceivingMode;
    }

    /**
     * itineraryReceivingMode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryReceivingType }
     *     
     */
    public void setItineraryReceivingMode(ItineraryReceivingType value) {
        this.itineraryReceivingMode = value;
    }

    /**
     * contactType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetailsType }
     *     
     */
    public ContactDetailsType getContactType() {
        return contactType;
    }

    /**
     * contactType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetailsType }
     *     
     */
    public void setContactType(ContactDetailsType value) {
        this.contactType = value;
    }

    /**
     * isPrefferedContact 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsPrefferedContact() {
        return isPrefferedContact;
    }

    /**
     * isPrefferedContact 속성의 값을 설정합니다.
     * 
     */
    public void setIsPrefferedContact(boolean value) {
        this.isPrefferedContact = value;
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

}
