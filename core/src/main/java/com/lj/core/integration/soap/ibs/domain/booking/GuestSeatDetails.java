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
 * <p>GuestSeatDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GuestSeatDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SurName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LocalSurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LocalGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeatKeyword" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatKeyWordType" minOccurs="0"/&gt;
 *         &lt;element name="SeatNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NamePrefix" type="{http://www.ibsplc.com/iRes/simpleTypes/}NamePrefixType"/&gt;
 *         &lt;element name="FamilyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestSeatDetails", propOrder = {
    "surName",
    "localSurName",
    "middleName",
    "givenName",
    "localGivenName",
    "seatKeyword",
    "seatNumbers",
    "namePrefix",
    "familyId",
    "guestId"
})
public class GuestSeatDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "SurName", required = true)
    protected String surName;
    @XmlElement(name = "LocalSurName")
    protected String localSurName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "GivenName", required = true)
    protected String givenName;
    @XmlElement(name = "LocalGivenName")
    protected String localGivenName;
    @XmlElement(name = "SeatKeyword")
    @XmlSchemaType(name = "string")
    protected SeatKeyWordType seatKeyword;
    @XmlElement(name = "SeatNumbers")
    protected String seatNumbers;
    @XmlElement(name = "NamePrefix", required = true)
    @XmlSchemaType(name = "string")
    protected NamePrefixType namePrefix;
    @XmlElement(name = "FamilyId", required = true)
    protected String familyId;
    @XmlElement(name = "GuestId", required = true)
    protected String guestId;

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
     * seatKeyword 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SeatKeyWordType }
     *     
     */
    public SeatKeyWordType getSeatKeyword() {
        return seatKeyword;
    }

    /**
     * seatKeyword 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatKeyWordType }
     *     
     */
    public void setSeatKeyword(SeatKeyWordType value) {
        this.seatKeyword = value;
    }

    /**
     * seatNumbers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumbers() {
        return seatNumbers;
    }

    /**
     * seatNumbers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumbers(String value) {
        this.seatNumbers = value;
    }

    /**
     * namePrefix 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefixType }
     *     
     */
    public NamePrefixType getNamePrefix() {
        return namePrefix;
    }

    /**
     * namePrefix 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefixType }
     *     
     */
    public void setNamePrefix(NamePrefixType value) {
        this.namePrefix = value;
    }

    /**
     * familyId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyId() {
        return familyId;
    }

    /**
     * familyId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyId(String value) {
        this.familyId = value;
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

}
