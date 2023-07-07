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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>PnrPaxDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PnrPaxDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaxId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="NamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LocalLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LocalFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PNRExtractLoyaltyDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRExtractLoyaltyDetails" minOccurs="0"/&gt;
 *         &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeatDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PNRExtractSSRDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRExtractSSRDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FeeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExemptionDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ExemptionDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FareBreakDownDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareBreakDownDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TicketNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxRegistrationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TravelDocuments" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelDocuments" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PaxTicketDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRExtractPaxTicketDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BaggageInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}BaggageInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrPaxDetails", propOrder = {
    "title",
    "paxId",
    "namePrefix",
    "lastName",
    "localLastName",
    "middleName",
    "firstName",
    "localFirstName",
    "dateOfBirth",
    "pnrExtractLoyaltyDetails",
    "profileId",
    "seatDetails",
    "pnrExtractSSRDetails",
    "passengerType",
    "feeDetails",
    "exemptionDetails",
    "fareBreakDownDetails",
    "ticketNumbers",
    "taxRegistrationNo",
    "travelDocuments",
    "age",
    "paxTicketDetails",
    "baggageInformation"
})
public class PnrPaxDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "PaxId")
    protected long paxId;
    @XmlElement(name = "NamePrefix")
    protected String namePrefix;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "LocalLastName")
    protected String localLastName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "LocalFirstName")
    protected String localFirstName;
    @XmlElement(name = "DateOfBirth")
    protected String dateOfBirth;
    @XmlElement(name = "PNRExtractLoyaltyDetails")
    protected PNRExtractLoyaltyDetails pnrExtractLoyaltyDetails;
    @XmlElement(name = "ProfileId")
    protected String profileId;
    @XmlElement(name = "SeatDetails")
    protected List<SeatDetails> seatDetails;
    @XmlElement(name = "PNRExtractSSRDetails")
    protected List<PNRExtractSSRDetails> pnrExtractSSRDetails;
    @XmlElement(name = "PassengerType", required = true)
    protected String passengerType;
    @XmlElement(name = "FeeDetails")
    protected List<FeeDetails> feeDetails;
    @XmlElement(name = "ExemptionDetails")
    protected List<ExemptionDetails> exemptionDetails;
    @XmlElement(name = "FareBreakDownDetails", required = true)
    protected List<FareBreakDownDetails> fareBreakDownDetails;
    @XmlElement(name = "TicketNumbers")
    protected String ticketNumbers;
    @XmlElement(name = "TaxRegistrationNo")
    protected String taxRegistrationNo;
    @XmlElement(name = "TravelDocuments")
    protected List<TravelDocuments> travelDocuments;
    @XmlElement(name = "Age")
    protected Integer age;
    @XmlElement(name = "PaxTicketDetails")
    protected List<PNRExtractPaxTicketDetailsType> paxTicketDetails;
    @XmlElement(name = "BaggageInformation")
    protected List<BaggageInformation> baggageInformation;

    /**
     * title 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * title 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * paxId 속성의 값을 가져옵니다.
     * 
     */
    public long getPaxId() {
        return paxId;
    }

    /**
     * paxId 속성의 값을 설정합니다.
     * 
     */
    public void setPaxId(long value) {
        this.paxId = value;
    }

    /**
     * namePrefix 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePrefix() {
        return namePrefix;
    }

    /**
     * namePrefix 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePrefix(String value) {
        this.namePrefix = value;
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
     * dateOfBirth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * dateOfBirth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * pnrExtractLoyaltyDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PNRExtractLoyaltyDetails }
     *     
     */
    public PNRExtractLoyaltyDetails getPNRExtractLoyaltyDetails() {
        return pnrExtractLoyaltyDetails;
    }

    /**
     * pnrExtractLoyaltyDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRExtractLoyaltyDetails }
     *     
     */
    public void setPNRExtractLoyaltyDetails(PNRExtractLoyaltyDetails value) {
        this.pnrExtractLoyaltyDetails = value;
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
     * Gets the value of the seatDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatDetails }
     * 
     * 
     */
    public List<SeatDetails> getSeatDetails() {
        if (seatDetails == null) {
            seatDetails = new ArrayList<SeatDetails>();
        }
        return this.seatDetails;
    }

    /**
     * Gets the value of the pnrExtractSSRDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrExtractSSRDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPNRExtractSSRDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRExtractSSRDetails }
     * 
     * 
     */
    public List<PNRExtractSSRDetails> getPNRExtractSSRDetails() {
        if (pnrExtractSSRDetails == null) {
            pnrExtractSSRDetails = new ArrayList<PNRExtractSSRDetails>();
        }
        return this.pnrExtractSSRDetails;
    }

    /**
     * passengerType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * passengerType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the feeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeDetails }
     * 
     * 
     */
    public List<FeeDetails> getFeeDetails() {
        if (feeDetails == null) {
            feeDetails = new ArrayList<FeeDetails>();
        }
        return this.feeDetails;
    }

    /**
     * Gets the value of the exemptionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exemptionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExemptionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExemptionDetails }
     * 
     * 
     */
    public List<ExemptionDetails> getExemptionDetails() {
        if (exemptionDetails == null) {
            exemptionDetails = new ArrayList<ExemptionDetails>();
        }
        return this.exemptionDetails;
    }

    /**
     * Gets the value of the fareBreakDownDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareBreakDownDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareBreakDownDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareBreakDownDetails }
     * 
     * 
     */
    public List<FareBreakDownDetails> getFareBreakDownDetails() {
        if (fareBreakDownDetails == null) {
            fareBreakDownDetails = new ArrayList<FareBreakDownDetails>();
        }
        return this.fareBreakDownDetails;
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
     * {@link PNRExtractPaxTicketDetailsType }
     * 
     * 
     */
    public List<PNRExtractPaxTicketDetailsType> getPaxTicketDetails() {
        if (paxTicketDetails == null) {
            paxTicketDetails = new ArrayList<PNRExtractPaxTicketDetailsType>();
        }
        return this.paxTicketDetails;
    }

    /**
     * Gets the value of the baggageInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageInformation }
     * 
     * 
     */
    public List<BaggageInformation> getBaggageInformation() {
        if (baggageInformation == null) {
            baggageInformation = new ArrayList<BaggageInformation>();
        }
        return this.baggageInformation;
    }

}
