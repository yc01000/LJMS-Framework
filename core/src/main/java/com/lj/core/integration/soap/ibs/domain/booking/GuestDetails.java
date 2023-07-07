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
 * <p>GuestDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GuestDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LocalLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalLastName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalLastName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LocalFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalFirstName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalFirstName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyNumberDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}LoyaltyNumberDetails" minOccurs="0"/&gt;
 *         &lt;element name="PartnerLoyaltyNumberDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PartnerLoyaltyNumberDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GuestSalutaion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.ibsplc.com/iRes/simpleTypes/}NamePrefixType" minOccurs="0"/&gt;
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="GuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestType"/&gt;
 *         &lt;element name="Gender" type="{http://www.ibsplc.com/iRes/simpleTypes/}GenderType" minOccurs="0"/&gt;
 *         &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MealSSR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeatSSR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtherSSR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TravelDocuments" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelDocuments" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CreditCards" type="{http://www.ibsplc.com/iRes/simpleTypes/}CreditCardDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProfileGuestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerValueDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomerValueDetails" minOccurs="0"/&gt;
 *         &lt;element name="ConsentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomerProfileConsentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestDetails", propOrder = {
    "lastName",
    "localLastName",
    "localLastName1",
    "localLastName2",
    "middleName",
    "firstName",
    "localFirstName",
    "localFirstName1",
    "localFirstName2",
    "loyaltyNumberDetails",
    "partnerLoyaltyNumberDetails",
    "guestSalutaion",
    "title",
    "dateOfBirth",
    "guestType",
    "gender",
    "occupation",
    "language",
    "mealSSR",
    "seatSSR",
    "otherSSR",
    "travelDocuments",
    "creditCards",
    "profileGuestId",
    "customerValueDetails",
    "consentDetails"
})
public class GuestDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "LocalLastName")
    protected String localLastName;
    @XmlElement(name = "LocalLastName1")
    protected String localLastName1;
    @XmlElement(name = "LocalLastName2")
    protected String localLastName2;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "LocalFirstName")
    protected String localFirstName;
    @XmlElement(name = "LocalFirstName1")
    protected String localFirstName1;
    @XmlElement(name = "LocalFirstName2")
    protected String localFirstName2;
    @XmlElement(name = "LoyaltyNumberDetails")
    protected LoyaltyNumberDetails loyaltyNumberDetails;
    @XmlElement(name = "PartnerLoyaltyNumberDetails")
    protected List<PartnerLoyaltyNumberDetails> partnerLoyaltyNumberDetails;
    @XmlElement(name = "GuestSalutaion")
    protected String guestSalutaion;
    @XmlElement(name = "Title")
    @XmlSchemaType(name = "string")
    protected NamePrefixType title;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "GuestType", required = true)
    @XmlSchemaType(name = "string")
    protected GuestType guestType;
    @XmlElement(name = "Gender")
    @XmlSchemaType(name = "string")
    protected GenderType gender;
    @XmlElement(name = "Occupation")
    protected String occupation;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "MealSSR")
    protected String mealSSR;
    @XmlElement(name = "SeatSSR")
    protected String seatSSR;
    @XmlElement(name = "OtherSSR")
    protected String otherSSR;
    @XmlElement(name = "TravelDocuments")
    protected List<TravelDocuments> travelDocuments;
    @XmlElement(name = "CreditCards")
    protected List<CreditCardDetails> creditCards;
    @XmlElement(name = "ProfileGuestId")
    protected String profileGuestId;
    @XmlElement(name = "CustomerValueDetails")
    protected CustomerValueDetails customerValueDetails;
    @XmlElement(name = "ConsentDetails")
    protected List<CustomerProfileConsentDetails> consentDetails;

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
     * localLastName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalLastName() {
        return localLastName;
    }

    /**
     * localLastName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalLastName(String value) {
        this.localLastName = value;
    }

    /**
     * localLastName1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalLastName1() {
        return localLastName1;
    }

    /**
     * localLastName1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalLastName1(String value) {
        this.localLastName1 = value;
    }

    /**
     * localLastName2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalLastName2() {
        return localLastName2;
    }

    /**
     * localLastName2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalLastName2(String value) {
        this.localLastName2 = value;
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
     * localFirstName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalFirstName() {
        return localFirstName;
    }

    /**
     * localFirstName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalFirstName(String value) {
        this.localFirstName = value;
    }

    /**
     * localFirstName1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalFirstName1() {
        return localFirstName1;
    }

    /**
     * localFirstName1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalFirstName1(String value) {
        this.localFirstName1 = value;
    }

    /**
     * localFirstName2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalFirstName2() {
        return localFirstName2;
    }

    /**
     * localFirstName2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalFirstName2(String value) {
        this.localFirstName2 = value;
    }

    /**
     * loyaltyNumberDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyNumberDetails }
     *     
     */
    public LoyaltyNumberDetails getLoyaltyNumberDetails() {
        return loyaltyNumberDetails;
    }

    /**
     * loyaltyNumberDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyNumberDetails }
     *     
     */
    public void setLoyaltyNumberDetails(LoyaltyNumberDetails value) {
        this.loyaltyNumberDetails = value;
    }

    /**
     * Gets the value of the partnerLoyaltyNumberDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerLoyaltyNumberDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerLoyaltyNumberDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerLoyaltyNumberDetails }
     * 
     * 
     */
    public List<PartnerLoyaltyNumberDetails> getPartnerLoyaltyNumberDetails() {
        if (partnerLoyaltyNumberDetails == null) {
            partnerLoyaltyNumberDetails = new ArrayList<PartnerLoyaltyNumberDetails>();
        }
        return this.partnerLoyaltyNumberDetails;
    }

    /**
     * guestSalutaion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestSalutaion() {
        return guestSalutaion;
    }

    /**
     * guestSalutaion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestSalutaion(String value) {
        this.guestSalutaion = value;
    }

    /**
     * title 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefixType }
     *     
     */
    public NamePrefixType getTitle() {
        return title;
    }

    /**
     * title 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefixType }
     *     
     */
    public void setTitle(NamePrefixType value) {
        this.title = value;
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
     * guestType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GuestType }
     *     
     */
    public GuestType getGuestType() {
        return guestType;
    }

    /**
     * guestType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestType }
     *     
     */
    public void setGuestType(GuestType value) {
        this.guestType = value;
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
     * occupation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * occupation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
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
     * mealSSR 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealSSR() {
        return mealSSR;
    }

    /**
     * mealSSR 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealSSR(String value) {
        this.mealSSR = value;
    }

    /**
     * seatSSR 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatSSR() {
        return seatSSR;
    }

    /**
     * seatSSR 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatSSR(String value) {
        this.seatSSR = value;
    }

    /**
     * otherSSR 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherSSR() {
        return otherSSR;
    }

    /**
     * otherSSR 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherSSR(String value) {
        this.otherSSR = value;
    }

    /**
     * Gets the value of the travelDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelDocuments }
     * 
     * 
     */
    public List<TravelDocuments> getTravelDocuments() {
        if (travelDocuments == null) {
            travelDocuments = new ArrayList<TravelDocuments>();
        }
        return this.travelDocuments;
    }

    /**
     * Gets the value of the creditCards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditCards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditCards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditCardDetails }
     * 
     * 
     */
    public List<CreditCardDetails> getCreditCards() {
        if (creditCards == null) {
            creditCards = new ArrayList<CreditCardDetails>();
        }
        return this.creditCards;
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
     * customerValueDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CustomerValueDetails }
     *     
     */
    public CustomerValueDetails getCustomerValueDetails() {
        return customerValueDetails;
    }

    /**
     * customerValueDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerValueDetails }
     *     
     */
    public void setCustomerValueDetails(CustomerValueDetails value) {
        this.customerValueDetails = value;
    }

    /**
     * Gets the value of the consentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerProfileConsentDetails }
     * 
     * 
     */
    public List<CustomerProfileConsentDetails> getConsentDetails() {
        if (consentDetails == null) {
            consentDetails = new ArrayList<CustomerProfileConsentDetails>();
        }
        return this.consentDetails;
    }

}
