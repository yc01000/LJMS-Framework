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
 * <p>PnrGuestDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PnrGuestDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LocalGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SurName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LocalSurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NamePrefix" type="{http://www.ibsplc.com/iRes/simpleTypes/}NamePrefixType" minOccurs="0"/&gt;
 *         &lt;element name="GuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestType"/&gt;
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BenefitID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StaffGuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}StaffGuestType" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemptionCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RewardCollectionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Infants" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrInfantDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}LoyaltyInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GuestPaymentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaymentDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Cabin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeatAllocationDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatAllocationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OldSeatAllocationDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}OldSeatAllocationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SSRDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SSRDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AuxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeeInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FamilyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestRepriceDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestRepriceDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GuestCheckInInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestCheckInInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AmountDetailsForAGuest" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountDetailsForAGuest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DateOfHire" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TravelDocuments" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelDocuments" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://www.ibsplc.com/iRes/simpleTypes/}GenderType" minOccurs="0"/&gt;
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ParentGuestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxRegistrationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TicketingOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TicketNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OldTicketNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalTicketIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PaxTicketDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxTicketDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PnrGuestDetailsType", propOrder = {
    "givenName",
    "localGivenName",
    "surName",
    "localSurName",
    "middleName",
    "namePrefix",
    "guestType",
    "dateOfBirth",
    "employeeID",
    "benefitID",
    "staffGuestType",
    "taxExemptionCodes",
    "rewardCollectionNumber",
    "discountCode",
    "infants",
    "loyaltyInfo",
    "guestPaymentInfo",
    "cabin",
    "seatAllocationDetails",
    "oldSeatAllocationDetails",
    "ssrDetails",
    "auxDetails",
    "feeInformation",
    "profileId",
    "familyId",
    "guestId",
    "guestRepriceDetails",
    "guestCheckInInfo",
    "amountDetailsForAGuest",
    "dateOfHire",
    "travelDocuments",
    "gender",
    "age",
    "parentGuestID",
    "taxRegistrationNo",
    "ticketingOfficeCode",
    "ticketNumbers",
    "fareString",
    "oldTicketNumbers",
    "originalTicketIssueDate",
    "paxTicketDetails",
    "recordLocator"
})
public class PnrGuestDetailsType
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
    protected NamePrefixType namePrefix;
    @XmlElement(name = "GuestType", required = true)
    @XmlSchemaType(name = "string")
    protected GuestType guestType;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "EmployeeID")
    protected String employeeID;
    @XmlElement(name = "BenefitID")
    protected String benefitID;
    @XmlElement(name = "StaffGuestType")
    @XmlSchemaType(name = "string")
    protected StaffGuestType staffGuestType;
    @XmlElement(name = "TaxExemptionCodes")
    protected List<String> taxExemptionCodes;
    @XmlElement(name = "RewardCollectionNumber")
    protected String rewardCollectionNumber;
    @XmlElement(name = "DiscountCode")
    protected String discountCode;
    @XmlElement(name = "Infants")
    protected List<PnrInfantDetailsType> infants;
    @XmlElement(name = "LoyaltyInfo")
    protected List<LoyaltyInfo> loyaltyInfo;
    @XmlElement(name = "GuestPaymentInfo")
    protected List<PaymentDetailsType> guestPaymentInfo;
    @XmlElement(name = "Cabin")
    protected String cabin;
    @XmlElement(name = "SeatAllocationDetails")
    protected List<SeatAllocationDetails> seatAllocationDetails;
    @XmlElement(name = "OldSeatAllocationDetails")
    protected List<OldSeatAllocationDetails> oldSeatAllocationDetails;
    @XmlElement(name = "SSRDetails")
    protected List<SSRDetailsType> ssrDetails;
    @XmlElement(name = "AuxDetails")
    protected List<AuxDetailsType> auxDetails;
    @XmlElement(name = "FeeInformation")
    protected List<FeeInformation> feeInformation;
    @XmlElement(name = "ProfileId")
    protected String profileId;
    @XmlElement(name = "FamilyId")
    protected String familyId;
    @XmlElement(name = "GuestId")
    protected String guestId;
    @XmlElement(name = "GuestRepriceDetails")
    protected List<GuestRepriceDetails> guestRepriceDetails;
    @XmlElement(name = "GuestCheckInInfo")
    protected List<GuestCheckInInfo> guestCheckInInfo;
    @XmlElement(name = "AmountDetailsForAGuest")
    protected List<AmountDetailsForAGuest> amountDetailsForAGuest;
    @XmlElement(name = "DateOfHire")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfHire;
    @XmlElement(name = "TravelDocuments")
    protected List<TravelDocuments> travelDocuments;
    @XmlElement(name = "Gender")
    @XmlSchemaType(name = "string")
    protected GenderType gender;
    @XmlElement(name = "Age")
    protected Integer age;
    @XmlElement(name = "ParentGuestID")
    protected String parentGuestID;
    @XmlElement(name = "TaxRegistrationNo")
    protected String taxRegistrationNo;
    @XmlElement(name = "TicketingOfficeCode")
    protected String ticketingOfficeCode;
    @XmlElement(name = "TicketNumbers")
    protected String ticketNumbers;
    @XmlElement(name = "FareString")
    protected String fareString;
    @XmlElement(name = "OldTicketNumbers")
    protected String oldTicketNumbers;
    @XmlElement(name = "OriginalTicketIssueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalTicketIssueDate;
    @XmlElement(name = "PaxTicketDetails")
    protected List<PaxTicketDetailsType> paxTicketDetails;
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
     *     {@link StaffGuestType }
     *     
     */
    public StaffGuestType getStaffGuestType() {
        return staffGuestType;
    }

    /**
     * staffGuestType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffGuestType }
     *     
     */
    public void setStaffGuestType(StaffGuestType value) {
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
     * Gets the value of the infants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrInfantDetailsType }
     * 
     * 
     */
    public List<PnrInfantDetailsType> getInfants() {
        if (infants == null) {
            infants = new ArrayList<PnrInfantDetailsType>();
        }
        return this.infants;
    }

    /**
     * Gets the value of the loyaltyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyInfo }
     * 
     * 
     */
    public List<LoyaltyInfo> getLoyaltyInfo() {
        if (loyaltyInfo == null) {
            loyaltyInfo = new ArrayList<LoyaltyInfo>();
        }
        return this.loyaltyInfo;
    }

    /**
     * Gets the value of the guestPaymentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestPaymentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestPaymentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDetailsType }
     * 
     * 
     */
    public List<PaymentDetailsType> getGuestPaymentInfo() {
        if (guestPaymentInfo == null) {
            guestPaymentInfo = new ArrayList<PaymentDetailsType>();
        }
        return this.guestPaymentInfo;
    }

    /**
     * cabin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabin() {
        return cabin;
    }

    /**
     * cabin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabin(String value) {
        this.cabin = value;
    }

    /**
     * Gets the value of the seatAllocationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatAllocationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatAllocationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatAllocationDetails }
     * 
     * 
     */
    public List<SeatAllocationDetails> getSeatAllocationDetails() {
        if (seatAllocationDetails == null) {
            seatAllocationDetails = new ArrayList<SeatAllocationDetails>();
        }
        return this.seatAllocationDetails;
    }

    /**
     * Gets the value of the oldSeatAllocationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oldSeatAllocationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOldSeatAllocationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OldSeatAllocationDetails }
     * 
     * 
     */
    public List<OldSeatAllocationDetails> getOldSeatAllocationDetails() {
        if (oldSeatAllocationDetails == null) {
            oldSeatAllocationDetails = new ArrayList<OldSeatAllocationDetails>();
        }
        return this.oldSeatAllocationDetails;
    }

    /**
     * Gets the value of the ssrDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSRDetailsType }
     * 
     * 
     */
    public List<SSRDetailsType> getSSRDetails() {
        if (ssrDetails == null) {
            ssrDetails = new ArrayList<SSRDetailsType>();
        }
        return this.ssrDetails;
    }

    /**
     * Gets the value of the auxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuxDetailsType }
     * 
     * 
     */
    public List<AuxDetailsType> getAuxDetails() {
        if (auxDetails == null) {
            auxDetails = new ArrayList<AuxDetailsType>();
        }
        return this.auxDetails;
    }

    /**
     * Gets the value of the feeInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeInformation }
     * 
     * 
     */
    public List<FeeInformation> getFeeInformation() {
        if (feeInformation == null) {
            feeInformation = new ArrayList<FeeInformation>();
        }
        return this.feeInformation;
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
     * Gets the value of the guestRepriceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestRepriceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestRepriceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestRepriceDetails }
     * 
     * 
     */
    public List<GuestRepriceDetails> getGuestRepriceDetails() {
        if (guestRepriceDetails == null) {
            guestRepriceDetails = new ArrayList<GuestRepriceDetails>();
        }
        return this.guestRepriceDetails;
    }

    /**
     * Gets the value of the guestCheckInInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestCheckInInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestCheckInInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestCheckInInfo }
     * 
     * 
     */
    public List<GuestCheckInInfo> getGuestCheckInInfo() {
        if (guestCheckInInfo == null) {
            guestCheckInInfo = new ArrayList<GuestCheckInInfo>();
        }
        return this.guestCheckInInfo;
    }

    /**
     * Gets the value of the amountDetailsForAGuest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountDetailsForAGuest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountDetailsForAGuest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountDetailsForAGuest }
     * 
     * 
     */
    public List<AmountDetailsForAGuest> getAmountDetailsForAGuest() {
        if (amountDetailsForAGuest == null) {
            amountDetailsForAGuest = new ArrayList<AmountDetailsForAGuest>();
        }
        return this.amountDetailsForAGuest;
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
     * ticketingOfficeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingOfficeCode() {
        return ticketingOfficeCode;
    }

    /**
     * ticketingOfficeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingOfficeCode(String value) {
        this.ticketingOfficeCode = value;
    }

    /**
     * ticketNumbers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumbers() {
        return ticketNumbers;
    }

    /**
     * ticketNumbers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumbers(String value) {
        this.ticketNumbers = value;
    }

    /**
     * fareString 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareString() {
        return fareString;
    }

    /**
     * fareString 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareString(String value) {
        this.fareString = value;
    }

    /**
     * oldTicketNumbers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldTicketNumbers() {
        return oldTicketNumbers;
    }

    /**
     * oldTicketNumbers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldTicketNumbers(String value) {
        this.oldTicketNumbers = value;
    }

    /**
     * originalTicketIssueDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalTicketIssueDate() {
        return originalTicketIssueDate;
    }

    /**
     * originalTicketIssueDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalTicketIssueDate(XMLGregorianCalendar value) {
        this.originalTicketIssueDate = value;
    }

    /**
     * Gets the value of the paxTicketDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxTicketDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxTicketDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxTicketDetailsType }
     * 
     * 
     */
    public List<PaxTicketDetailsType> getPaxTicketDetails() {
        if (paxTicketDetails == null) {
            paxTicketDetails = new ArrayList<PaxTicketDetailsType>();
        }
        return this.paxTicketDetails;
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
