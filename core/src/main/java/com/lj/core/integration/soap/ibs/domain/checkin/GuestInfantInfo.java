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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains the details of the pax.
 * 
 * <p>GuestInfantInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GuestInfantInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InfantFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InfantLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InfantGender" type="{http://www.ibsplc.com/iRes/simpleTypes/}GenderType" minOccurs="0"/&gt;
 *         &lt;element name="InfantDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DcsInfantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResInfantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InfantFirstNameLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InfantLastNameLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.ibsplc.com/iRes/simpleTypes/}TitleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestInfantInfo", propOrder = {
    "infantFirstName",
    "infantLastName",
    "infantGender",
    "infantDateOfBirth",
    "dcsInfantId",
    "resInfantId",
    "infantFirstNameLocal",
    "infantLastNameLocal",
    "title"
})
public class GuestInfantInfo
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "InfantFirstName")
    protected String infantFirstName;
    @XmlElement(name = "InfantLastName")
    protected String infantLastName;
    @XmlElement(name = "InfantGender")
    @XmlSchemaType(name = "string")
    protected GenderType infantGender;
    @XmlElement(name = "InfantDateOfBirth")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar infantDateOfBirth;
    @XmlElement(name = "DcsInfantId")
    protected String dcsInfantId;
    @XmlElement(name = "ResInfantId")
    protected String resInfantId;
    @XmlElement(name = "InfantFirstNameLocal")
    protected String infantFirstNameLocal;
    @XmlElement(name = "InfantLastNameLocal")
    protected String infantLastNameLocal;
    @XmlElement(name = "Title")
    @XmlSchemaType(name = "string")
    protected TitleType title;

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

    /**
     * infantGender 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getInfantGender() {
        return infantGender;
    }

    /**
     * infantGender 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setInfantGender(GenderType value) {
        this.infantGender = value;
    }

    /**
     * infantDateOfBirth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInfantDateOfBirth() {
        return infantDateOfBirth;
    }

    /**
     * infantDateOfBirth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInfantDateOfBirth(XMLGregorianCalendar value) {
        this.infantDateOfBirth = value;
    }

    /**
     * dcsInfantId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcsInfantId() {
        return dcsInfantId;
    }

    /**
     * dcsInfantId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcsInfantId(String value) {
        this.dcsInfantId = value;
    }

    /**
     * resInfantId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResInfantId() {
        return resInfantId;
    }

    /**
     * resInfantId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResInfantId(String value) {
        this.resInfantId = value;
    }

    /**
     * infantFirstNameLocal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfantFirstNameLocal() {
        return infantFirstNameLocal;
    }

    /**
     * infantFirstNameLocal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfantFirstNameLocal(String value) {
        this.infantFirstNameLocal = value;
    }

    /**
     * infantLastNameLocal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfantLastNameLocal() {
        return infantLastNameLocal;
    }

    /**
     * infantLastNameLocal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfantLastNameLocal(String value) {
        this.infantLastNameLocal = value;
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

}
