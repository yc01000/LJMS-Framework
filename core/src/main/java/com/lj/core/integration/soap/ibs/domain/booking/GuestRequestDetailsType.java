//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2021.04.29 시간 12:54:19 PM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>GuestRequestDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GuestRequestDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LocalGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SurName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LocalSurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NamePrefix" type="{http://www.ibsplc.com/iRes/simpleTypes/}NameTitle_Type" minOccurs="0"/&gt;
 *         &lt;element name="GuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxDetails_Type"/&gt;
 *         &lt;element name="GuestSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BenefitID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StaffGuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}StaffGuestDetails_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemptionCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RewardCollectionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FamilyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateOfHire" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://www.ibsplc.com/iRes/simpleTypes/}GenderDetails_Type" minOccurs="0"/&gt;
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ParentGuestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxRegistrationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecordLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRequestDetailsType", propOrder = {
    "givenName",
    "localGivenName",
    "surName",
    "localSurName",
    "middleName",
    "namePrefix",
    "guestType",
    "guestSubType",
    "dateOfBirth",
    "employeeID",
    "benefitID",
    "staffGuestType",
    "taxExemptionCodes",
    "rewardCollectionNumber",
    "discountCode",
    "profileId",
    "familyId",
    "guestId",
    "dateOfHire",
    "gender",
    "age",
    "parentGuestID",
    "taxRegistrationNo",
    "recordLocator"
})
public class GuestRequestDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "GivenName", required = true)
    protected String givenName;
    @XmlElement(name = "LocalGivenName")
    protected String localGivenName;
    @XmlElement(name = "SurName", required = true)
    protected String surName;
    @XmlElement(name = "LocalSurName")
    protected String localSurName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "NamePrefix")
    @XmlSchemaType(name = "string")
    protected NameTitleType namePrefix;
    @XmlElement(name = "GuestType", required = true)
    @XmlSchemaType(name = "string")
    protected PaxDetailsType guestType;
    @XmlElement(name = "GuestSubType")
    protected String guestSubType;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "EmployeeID")
    protected String employeeID;
    @XmlElement(name = "BenefitID")
    protected String benefitID;
    @XmlElement(name = "StaffGuestType")
    @XmlSchemaType(name = "string")
    protected StaffGuestDetailsType staffGuestType;
    @XmlElement(name = "TaxExemptionCodes")
    protected List<String> taxExemptionCodes;
    @XmlElement(name = "RewardCollectionNumber")
    protected String rewardCollectionNumber;
    @XmlElement(name = "DiscountCode")
    protected String discountCode;
    @XmlElement(name = "ProfileId")
    protected String profileId;
    @XmlElement(name = "FamilyId")
    protected String familyId;
    @XmlElement(name = "GuestId")
    protected String guestId;
    @XmlElement(name = "DateOfHire")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfHire;
    @XmlElement(name = "Gender")
    @XmlSchemaType(name = "string")
    protected GenderDetailsType gender;
    @XmlElement(name = "Age")
    protected Integer age;
    @XmlElement(name = "ParentGuestID")
    protected String parentGuestID;
    @XmlElement(name = "TaxRegistrationNo")
    protected String taxRegistrationNo;
    @XmlElement(name = "RecordLocator")
    protected String recordLocator;

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
     * guestType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PaxDetailsType }
     *     
     */
    public PaxDetailsType getGuestType() {
        return guestType;
    }

    /**
     * guestType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxDetailsType }
     *     
     */
    public void setGuestType(PaxDetailsType value) {
        this.guestType = value;
    }

    /**
     * guestSubType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestSubType() {
        return guestSubType;
    }

    /**
     * guestSubType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestSubType(String value) {
        this.guestSubType = value;
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
     * employeeID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * employeeID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeID(String value) {
        this.employeeID = value;
    }

    /**
     * benefitID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitID() {
        return benefitID;
    }

    /**
     * benefitID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitID(String value) {
        this.benefitID = value;
    }

    /**
     * staffGuestType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link StaffGuestDetailsType }
     *     
     */
    public StaffGuestDetailsType getStaffGuestType() {
        return staffGuestType;
    }

    /**
     * staffGuestType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffGuestDetailsType }
     *     
     */
    public void setStaffGuestType(StaffGuestDetailsType value) {
        this.staffGuestType = value;
    }

    /**
     * Gets the value of the taxExemptionCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxExemptionCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxExemptionCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTaxExemptionCodes() {
        if (taxExemptionCodes == null) {
            taxExemptionCodes = new ArrayList<String>();
        }
        return this.taxExemptionCodes;
    }

    /**
     * rewardCollectionNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardCollectionNumber() {
        return rewardCollectionNumber;
    }

    /**
     * rewardCollectionNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardCollectionNumber(String value) {
        this.rewardCollectionNumber = value;
    }

    /**
     * discountCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     * discountCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountCode(String value) {
        this.discountCode = value;
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

    /**
     * dateOfHire 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfHire() {
        return dateOfHire;
    }

    /**
     * dateOfHire 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfHire(XMLGregorianCalendar value) {
        this.dateOfHire = value;
    }

    /**
     * gender 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GenderDetailsType }
     *     
     */
    public GenderDetailsType getGender(String m) {
        return gender;
    }

    /**
     * gender 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderDetailsType }
     *     
     */
    public void setGender(GenderDetailsType value) {
        this.gender = value;
    }

    /**
     * age 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAge() {
        return age;
    }

    /**
     * age 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAge(Integer value) {
        this.age = value;
    }

    /**
     * parentGuestID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentGuestID() {
        return parentGuestID;
    }

    /**
     * parentGuestID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentGuestID(String value) {
        this.parentGuestID = value;
    }

    /**
     * taxRegistrationNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegistrationNo() {
        return taxRegistrationNo;
    }

    /**
     * taxRegistrationNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegistrationNo(String value) {
        this.taxRegistrationNo = value;
    }

    /**
     * recordLocator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordLocator() {
        return recordLocator;
    }

    /**
     * recordLocator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordLocator(String value) {
        this.recordLocator = value;
    }

}
