//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This type will have Next of Kin details.
 * 
 * <p>NokDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="NokDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NokName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NokRelationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressTwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressThree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinceState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumberISDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CellPhoneNumberISDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CellPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="IsInfantNok" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="InfantFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InfantLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NokDetailsType", propOrder = {
    "nokName",
    "nokRelationship",
    "addressOne",
    "addressTwo",
    "addressThree",
    "city",
    "provinceState",
    "country",
    "postalCode",
    "phoneNumberISDCode",
    "phoneNumber",
    "cellPhoneNumberISDCode",
    "cellPhoneNumber",
    "email",
    "faxNumber",
    "isInfantNok",
    "infantFirstName",
    "infantLastName"
})
public class NokDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "NokName", required = true)
    protected String nokName;
    @XmlElement(name = "NokRelationship")
    protected String nokRelationship;
    @XmlElement(name = "AddressOne")
    protected String addressOne;
    @XmlElement(name = "AddressTwo")
    protected String addressTwo;
    @XmlElement(name = "AddressThree")
    protected String addressThree;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "ProvinceState")
    protected String provinceState;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "PhoneNumberISDCode")
    protected String phoneNumberISDCode;
    @XmlElement(name = "PhoneNumber")
    protected BigInteger phoneNumber;
    @XmlElement(name = "CellPhoneNumberISDCode")
    protected String cellPhoneNumberISDCode;
    @XmlElement(name = "CellPhoneNumber")
    protected BigInteger cellPhoneNumber;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "FaxNumber")
    protected BigInteger faxNumber;
    @XmlElement(name = "IsInfantNok")
    protected boolean isInfantNok;
    @XmlElement(name = "InfantFirstName")
    protected String infantFirstName;
    @XmlElement(name = "InfantLastName")
    protected String infantLastName;

    /**
     * nokName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNokName() {
        return nokName;
    }

    /**
     * nokName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNokName(String value) {
        this.nokName = value;
    }

    /**
     * nokRelationship 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNokRelationship() {
        return nokRelationship;
    }

    /**
     * nokRelationship 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNokRelationship(String value) {
        this.nokRelationship = value;
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
     * addressThree 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressThree() {
        return addressThree;
    }

    /**
     * addressThree 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressThree(String value) {
        this.addressThree = value;
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
     * provinceState 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceState() {
        return provinceState;
    }

    /**
     * provinceState 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceState(String value) {
        this.provinceState = value;
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
     * postalCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * postalCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * phoneNumberISDCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberISDCode() {
        return phoneNumberISDCode;
    }

    /**
     * phoneNumberISDCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberISDCode(String value) {
        this.phoneNumberISDCode = value;
    }

    /**
     * phoneNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * phoneNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPhoneNumber(BigInteger value) {
        this.phoneNumber = value;
    }

    /**
     * cellPhoneNumberISDCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneNumberISDCode() {
        return cellPhoneNumberISDCode;
    }

    /**
     * cellPhoneNumberISDCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneNumberISDCode(String value) {
        this.cellPhoneNumberISDCode = value;
    }

    /**
     * cellPhoneNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    /**
     * cellPhoneNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCellPhoneNumber(BigInteger value) {
        this.cellPhoneNumber = value;
    }

    /**
     * email 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * email 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * faxNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFaxNumber() {
        return faxNumber;
    }

    /**
     * faxNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFaxNumber(BigInteger value) {
        this.faxNumber = value;
    }

    /**
     * isInfantNok 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsInfantNok() {
        return isInfantNok;
    }

    /**
     * isInfantNok 속성의 값을 설정합니다.
     * 
     */
    public void setIsInfantNok(boolean value) {
        this.isInfantNok = value;
    }

    /**
     * infantFirstName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfantFirstName() {
        return infantFirstName;
    }

    /**
     * infantFirstName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfantFirstName(String value) {
        this.infantFirstName = value;
    }

    /**
     * infantLastName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfantLastName() {
        return infantLastName;
    }

    /**
     * infantLastName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfantLastName(String value) {
        this.infantLastName = value;
    }

}
