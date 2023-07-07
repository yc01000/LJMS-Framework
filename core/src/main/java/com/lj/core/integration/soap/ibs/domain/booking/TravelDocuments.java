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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>TravelDocuments complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TravelDocuments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TravelDocumentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TravelDocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TravelDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TravelDocumentIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TravelDocumentexpirydate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TravelDocumentCountryOfIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Residence" type="{http://www.ibsplc.com/iRes/simpleTypes/}ResidenceDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="isPrimaryHolder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlaceForVisa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlaceOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationResidence" type="{http://www.ibsplc.com/iRes/simpleTypes/}ResidenceDetailsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelDocuments", propOrder = {
    "travelDocumentId",
    "firstName",
    "middleName",
    "lastName",
    "travelDocumentType",
    "travelDocumentNumber",
    "travelDocumentIssueDate",
    "travelDocumentexpirydate",
    "travelDocumentCountryOfIssue",
    "nationality",
    "residence",
    "isPrimaryHolder",
    "gender",
    "placeForVisa",
    "dateOfBirth",
    "placeOfBirth",
    "destinationResidence"
})
public class TravelDocuments
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "TravelDocumentId")
    protected Long travelDocumentId;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "TravelDocumentType")
    protected String travelDocumentType;
    @XmlElement(name = "TravelDocumentNumber")
    protected String travelDocumentNumber;
    @XmlElement(name = "TravelDocumentIssueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar travelDocumentIssueDate;
    @XmlElement(name = "TravelDocumentexpirydate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar travelDocumentexpirydate;
    @XmlElement(name = "TravelDocumentCountryOfIssue")
    protected String travelDocumentCountryOfIssue;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "Residence")
    protected ResidenceDetailsType residence;
    protected Boolean isPrimaryHolder;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "PlaceForVisa")
    protected String placeForVisa;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "PlaceOfBirth")
    protected String placeOfBirth;
    @XmlElement(name = "DestinationResidence")
    protected ResidenceDetailsType destinationResidence;

    /**
     * travelDocumentId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTravelDocumentId() {
        return travelDocumentId;
    }

    /**
     * travelDocumentId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTravelDocumentId(Long value) {
        this.travelDocumentId = value;
    }

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
     * travelDocumentType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelDocumentType() {
        return travelDocumentType;
    }

    /**
     * travelDocumentType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelDocumentType(String value) {
        this.travelDocumentType = value;
    }

    /**
     * travelDocumentNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelDocumentNumber() {
        return travelDocumentNumber;
    }

    /**
     * travelDocumentNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelDocumentNumber(String value) {
        this.travelDocumentNumber = value;
    }

    /**
     * travelDocumentIssueDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelDocumentIssueDate() {
        return travelDocumentIssueDate;
    }

    /**
     * travelDocumentIssueDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelDocumentIssueDate(XMLGregorianCalendar value) {
        this.travelDocumentIssueDate = value;
    }

    /**
     * travelDocumentexpirydate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelDocumentexpirydate() {
        return travelDocumentexpirydate;
    }

    /**
     * travelDocumentexpirydate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelDocumentexpirydate(XMLGregorianCalendar value) {
        this.travelDocumentexpirydate = value;
    }

    /**
     * travelDocumentCountryOfIssue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelDocumentCountryOfIssue() {
        return travelDocumentCountryOfIssue;
    }

    /**
     * travelDocumentCountryOfIssue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelDocumentCountryOfIssue(String value) {
        this.travelDocumentCountryOfIssue = value;
    }

    /**
     * nationality 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * nationality 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * residence 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceDetailsType }
     *     
     */
    public ResidenceDetailsType getResidence() {
        return residence;
    }

    /**
     * residence 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceDetailsType }
     *     
     */
    public void setResidence(ResidenceDetailsType value) {
        this.residence = value;
    }

    /**
     * isPrimaryHolder 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimaryHolder() {
        return isPrimaryHolder;
    }

    /**
     * isPrimaryHolder 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimaryHolder(Boolean value) {
        this.isPrimaryHolder = value;
    }

    /**
     * gender 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * gender 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * placeForVisa 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceForVisa() {
        return placeForVisa;
    }

    /**
     * placeForVisa 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceForVisa(String value) {
        this.placeForVisa = value;
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
     * placeOfBirth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * placeOfBirth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
    }

    /**
     * destinationResidence 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceDetailsType }
     *     
     */
    public ResidenceDetailsType getDestinationResidence() {
        return destinationResidence;
    }

    /**
     * destinationResidence 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceDetailsType }
     *     
     */
    public void setDestinationResidence(ResidenceDetailsType value) {
        this.destinationResidence = value;
    }

}
