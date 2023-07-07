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
 * <p>NameType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="NameType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Title" type="{http://www.ibsplc.com/iRes/simpleTypes/}TitleType" minOccurs="0"/&gt;
 *         &lt;element name="Salutation" type="{http://www.ibsplc.com/iRes/simpleTypes/}SalutationType" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.ibsplc.com/iRes/simpleTypes/}SalutationType" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://www.ibsplc.com/iRes/simpleTypes/}GenderType"/&gt;
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GuestType" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameType", propOrder = {
    "firstName",
    "age",
    "lastName",
    "title",
    "salutation",
    "middleName",
    "gender",
    "pnrNumber",
    "numberInParty",
    "guestType"
})
public class NameType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "Age")
    protected int age;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "Title")
    @XmlSchemaType(name = "string")
    protected TitleType title;
    @XmlElement(name = "Salutation")
    @XmlSchemaType(name = "string")
    protected SalutationType salutation;
    @XmlElement(name = "MiddleName")
    @XmlSchemaType(name = "string")
    protected SalutationType middleName;
    @XmlElement(name = "Gender", required = true)
    @XmlSchemaType(name = "string")
    protected GenderType gender;
    @XmlElement(name = "PnrNumber", required = true)
    protected String pnrNumber;
    @XmlElement(name = "NumberInParty", required = true)
    protected String numberInParty;
    @XmlElement(name = "GuestType", required = true)
    protected Object guestType;

    /**
     * firstName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * firstName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * age 속성의 값을 가져옵니다.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * age 속성의 값을 설정합니다.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * lastName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * lastName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * title 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TitleType }
     *     
     */
    public TitleType getTitle() {
        return title;
    }

    /**
     * title 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleType }
     *     
     */
    public void setTitle(TitleType value) {
        this.title = value;
    }

    /**
     * salutation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SalutationType }
     *     
     */
    public SalutationType getSalutation() {
        return salutation;
    }

    /**
     * salutation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SalutationType }
     *     
     */
    public void setSalutation(SalutationType value) {
        this.salutation = value;
    }

    /**
     * middleName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SalutationType }
     *     
     */
    public SalutationType getMiddleName() {
        return middleName;
    }

    /**
     * middleName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SalutationType }
     *     
     */
    public void setMiddleName(SalutationType value) {
        this.middleName = value;
    }

    /**
     * gender 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGender() {
        return gender;
    }

    /**
     * gender 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGender(GenderType value) {
        this.gender = value;
    }

    /**
     * pnrNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrNumber() {
        return pnrNumber;
    }

    /**
     * pnrNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrNumber(String value) {
        this.pnrNumber = value;
    }

    /**
     * numberInParty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberInParty() {
        return numberInParty;
    }

    /**
     * numberInParty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberInParty(String value) {
        this.numberInParty = value;
    }

    /**
     * guestType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGuestType() {
        return guestType;
    }

    /**
     * guestType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGuestType(Object value) {
        this.guestType = value;
    }

}
