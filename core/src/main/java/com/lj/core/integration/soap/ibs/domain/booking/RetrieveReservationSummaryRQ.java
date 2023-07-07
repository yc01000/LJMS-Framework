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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookingChannel" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingChannelKeyType"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FlightStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FlightEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorporateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FlightSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FlightDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="BoardPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OffPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GiftCertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnrType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRType" minOccurs="0"/&gt;
 *         &lt;element name="ActivePnrNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PastPnrNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsCancelledRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TravelDocNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsUnFlownPassengersOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ETicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SlipOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TicketedStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}TicketStatus" minOccurs="0"/&gt;
 *         &lt;element name="BookerProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "profileId",
    "bookingChannel",
    "startDate",
    "endDate",
    "flightStartDate",
    "flightEndDate",
    "airlineCode",
    "pnrNumber",
    "givenName",
    "surName",
    "agencyCode",
    "corporateId",
    "middleName",
    "carrierCode",
    "flightNumber",
    "flightSuffix",
    "flightDate",
    "boardPoint",
    "offPoint",
    "pnrStatus",
    "emailId",
    "creditCardNumber",
    "phoneNumberCountryCode",
    "phoneNumber",
    "giftCertificateNumber",
    "loyaltyNumber",
    "pnrType",
    "activePnrNumber",
    "pastPnrNumber",
    "isCancelledRequired",
    "travelDocNumber",
    "isUnFlownPassengersOnly",
    "eTicketNumber",
    "slipOrderNumber",
    "ticketedStatus",
    "bookerProfileId",
    "groupType"
})
@XmlRootElement(name = "RetrieveReservationSummaryRQ")
public class RetrieveReservationSummaryRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ProfileId")
    protected String profileId;
    @XmlElement(name = "BookingChannel", required = true)
    protected BookingChannelKeyType bookingChannel;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "FlightStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar flightStartDate;
    @XmlElement(name = "FlightEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar flightEndDate;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "PnrNumber")
    protected String pnrNumber;
    @XmlElement(name = "GivenName")
    protected String givenName;
    @XmlElement(name = "SurName")
    protected String surName;
    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "CorporateId")
    protected String corporateId;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "CarrierCode")
    protected String carrierCode;
    @XmlElement(name = "FlightNumber")
    protected Integer flightNumber;
    @XmlElement(name = "FlightSuffix")
    protected String flightSuffix;
    @XmlElement(name = "FlightDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar flightDate;
    @XmlElement(name = "BoardPoint")
    protected String boardPoint;
    @XmlElement(name = "OffPoint")
    protected String offPoint;
    @XmlElement(name = "PnrStatus")
    protected String pnrStatus;
    @XmlElement(name = "EmailId")
    protected String emailId;
    @XmlElement(name = "CreditCardNumber")
    protected String creditCardNumber;
    @XmlElement(name = "PhoneNumberCountryCode")
    protected String phoneNumberCountryCode;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "GiftCertificateNumber")
    protected String giftCertificateNumber;
    @XmlElement(name = "LoyaltyNumber")
    protected String loyaltyNumber;
    @XmlElement(name = "PnrType")
    @XmlSchemaType(name = "string")
    protected PNRType pnrType;
    @XmlElement(name = "ActivePnrNumber")
    protected int activePnrNumber;
    @XmlElement(name = "PastPnrNumber")
    protected int pastPnrNumber;
    @XmlElement(name = "IsCancelledRequired")
    protected boolean isCancelledRequired;
    @XmlElement(name = "TravelDocNumber")
    protected String travelDocNumber;
    @XmlElement(name = "IsUnFlownPassengersOnly")
    protected boolean isUnFlownPassengersOnly;
    @XmlElement(name = "ETicketNumber")
    protected String eTicketNumber;
    @XmlElement(name = "SlipOrderNumber")
    protected String slipOrderNumber;
    @XmlElement(name = "TicketedStatus")
    @XmlSchemaType(name = "string")
    protected TicketStatus ticketedStatus;
    @XmlElement(name = "BookerProfileId")
    protected String bookerProfileId;
    @XmlElement(name = "GroupType")
    protected String groupType;

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
     * bookingChannel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BookingChannelKeyType }
     *     
     */
    public BookingChannelKeyType getBookingChannel() {
        return bookingChannel;
    }

    /**
     * bookingChannel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingChannelKeyType }
     *     
     */
    public void setBookingChannel(BookingChannelKeyType value) {
        this.bookingChannel = value;
    }

    /**
     * startDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * startDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * endDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * endDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * flightStartDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlightStartDate() {
        return flightStartDate;
    }

    /**
     * flightStartDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlightStartDate(XMLGregorianCalendar value) {
        this.flightStartDate = value;
    }

    /**
     * flightEndDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlightEndDate() {
        return flightEndDate;
    }

    /**
     * flightEndDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlightEndDate(XMLGregorianCalendar value) {
        this.flightEndDate = value;
    }

    /**
     * airlineCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * airlineCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
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
     * agencyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * agencyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * corporateId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateId() {
        return corporateId;
    }

    /**
     * corporateId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateId(String value) {
        this.corporateId = value;
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
     * carrierCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * carrierCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * flightNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightNumber() {
        return flightNumber;
    }

    /**
     * flightNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightNumber(Integer value) {
        this.flightNumber = value;
    }

    /**
     * flightSuffix 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightSuffix() {
        return flightSuffix;
    }

    /**
     * flightSuffix 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightSuffix(String value) {
        this.flightSuffix = value;
    }

    /**
     * flightDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlightDate() {
        return flightDate;
    }

    /**
     * flightDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlightDate(XMLGregorianCalendar value) {
        this.flightDate = value;
    }

    /**
     * boardPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardPoint() {
        return boardPoint;
    }

    /**
     * boardPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardPoint(String value) {
        this.boardPoint = value;
    }

    /**
     * offPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPoint() {
        return offPoint;
    }

    /**
     * offPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPoint(String value) {
        this.offPoint = value;
    }

    /**
     * pnrStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrStatus() {
        return pnrStatus;
    }

    /**
     * pnrStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrStatus(String value) {
        this.pnrStatus = value;
    }

    /**
     * emailId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * emailId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailId(String value) {
        this.emailId = value;
    }

    /**
     * creditCardNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * creditCardNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * phoneNumberCountryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberCountryCode() {
        return phoneNumberCountryCode;
    }

    /**
     * phoneNumberCountryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberCountryCode(String value) {
        this.phoneNumberCountryCode = value;
    }

    /**
     * phoneNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * phoneNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * giftCertificateNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCertificateNumber() {
        return giftCertificateNumber;
    }

    /**
     * giftCertificateNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCertificateNumber(String value) {
        this.giftCertificateNumber = value;
    }

    /**
     * loyaltyNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyNumber() {
        return loyaltyNumber;
    }

    /**
     * loyaltyNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyNumber(String value) {
        this.loyaltyNumber = value;
    }

    /**
     * pnrType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PNRType }
     *     
     */
    public PNRType getPnrType() {
        return pnrType;
    }

    /**
     * pnrType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRType }
     *     
     */
    public void setPnrType(PNRType value) {
        this.pnrType = value;
    }

    /**
     * activePnrNumber 속성의 값을 가져옵니다.
     * 
     */
    public int getActivePnrNumber() {
        return activePnrNumber;
    }

    /**
     * activePnrNumber 속성의 값을 설정합니다.
     * 
     */
    public void setActivePnrNumber(int value) {
        this.activePnrNumber = value;
    }

    /**
     * pastPnrNumber 속성의 값을 가져옵니다.
     * 
     */
    public int getPastPnrNumber() {
        return pastPnrNumber;
    }

    /**
     * pastPnrNumber 속성의 값을 설정합니다.
     * 
     */
    public void setPastPnrNumber(int value) {
        this.pastPnrNumber = value;
    }

    /**
     * isCancelledRequired 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsCancelledRequired() {
        return isCancelledRequired;
    }

    /**
     * isCancelledRequired 속성의 값을 설정합니다.
     * 
     */
    public void setIsCancelledRequired(boolean value) {
        this.isCancelledRequired = value;
    }

    /**
     * travelDocNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelDocNumber() {
        return travelDocNumber;
    }

    /**
     * travelDocNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelDocNumber(String value) {
        this.travelDocNumber = value;
    }

    /**
     * isUnFlownPassengersOnly 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsUnFlownPassengersOnly() {
        return isUnFlownPassengersOnly;
    }

    /**
     * isUnFlownPassengersOnly 속성의 값을 설정합니다.
     * 
     */
    public void setIsUnFlownPassengersOnly(boolean value) {
        this.isUnFlownPassengersOnly = value;
    }

    /**
     * eTicketNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETicketNumber() {
        return eTicketNumber;
    }

    /**
     * eTicketNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETicketNumber(String value) {
        this.eTicketNumber = value;
    }

    /**
     * slipOrderNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlipOrderNumber() {
        return slipOrderNumber;
    }

    /**
     * slipOrderNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlipOrderNumber(String value) {
        this.slipOrderNumber = value;
    }

    /**
     * ticketedStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TicketStatus }
     *     
     */
    public TicketStatus getTicketedStatus() {
        return ticketedStatus;
    }

    /**
     * ticketedStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketStatus }
     *     
     */
    public void setTicketedStatus(TicketStatus value) {
        this.ticketedStatus = value;
    }

    /**
     * bookerProfileId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookerProfileId() {
        return bookerProfileId;
    }

    /**
     * bookerProfileId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookerProfileId(String value) {
        this.bookerProfileId = value;
    }

    /**
     * groupType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * groupType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

}
