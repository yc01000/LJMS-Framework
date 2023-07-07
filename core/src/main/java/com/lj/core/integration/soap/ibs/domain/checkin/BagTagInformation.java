//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The fee info for excess baggage,if exists.
 * 
 * <p>BagTagInformation complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BagTagInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GuestName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BoardPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CheckinStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BagTagIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BagTagNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BagTagDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FlightCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlightSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlightDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/&gt;
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BarCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MarketingFlightCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarketingFlightNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MarketingFlightSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeptTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BoardCityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OffCityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BoardCityNameLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OffCityNameLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AirlineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FrequentFlierNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyTier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BoardAirportNameLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OffAirportNameLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BoardAirportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OffAirportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FinalDestinationAirportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FinalDestinationAirportNameLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalNumberOfBags" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalBaggageWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalDestinationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isInternationalFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BaggageConnectionInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}BagConnectionDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsPriorityPassenger" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfGuest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cabinclass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CapSelecteeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagTagInformation", propOrder = {
    "airlineCode",
    "guestName",
    "title",
    "boardPoint",
    "destination",
    "checkinStatus",
    "resStatus",
    "bagTagIssuer",
    "bagTagNumber",
    "bagTagDate",
    "pnrNumber",
    "sequenceNumber",
    "flightCarrier",
    "flightSuffix",
    "flightDate",
    "flightNumber",
    "barCode",
    "marketingFlightCarrier",
    "marketingFlightNumber",
    "marketingFlightSuffix",
    "deptTime",
    "boardCityName",
    "offCityName",
    "boardCityNameLocal",
    "offCityNameLocal",
    "airlineNumber",
    "frequentFlierNumber",
    "loyaltyTier",
    "boardAirportNameLocal",
    "offAirportNameLocal",
    "boardAirportName",
    "offAirportName",
    "finalDestinationAirportName",
    "finalDestinationAirportNameLocal",
    "departureDate",
    "totalNumberOfBags",
    "totalBaggageWeight",
    "officeCode",
    "destinationName",
    "localDestinationName",
    "userId",
    "seatNumber",
    "isInternationalFlight",
    "baggageConnectionInfo",
    "isPriorityPassenger",
    "numberOfGuest",
    "cabinclass",
    "capSelecteeInd"
})
public class BagTagInformation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "GuestName", required = true)
    protected String guestName;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "BoardPoint", required = true)
    protected String boardPoint;
    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlElement(name = "CheckinStatus", required = true)
    protected String checkinStatus;
    @XmlElement(name = "ResStatus", required = true)
    protected String resStatus;
    @XmlElement(name = "BagTagIssuer")
    protected String bagTagIssuer;
    @XmlElement(name = "BagTagNumber")
    protected String bagTagNumber;
    @XmlElement(name = "BagTagDate")
    protected String bagTagDate;
    @XmlElement(name = "PnrNumber", required = true)
    protected String pnrNumber;
    @XmlElement(name = "SequenceNumber")
    protected String sequenceNumber;
    @XmlElement(name = "FlightCarrier", required = true)
    protected String flightCarrier;
    @XmlElement(name = "FlightSuffix", required = true)
    protected String flightSuffix;
    @XmlElement(name = "FlightDate", required = true)
    protected DateOnlyType flightDate;
    @XmlElement(name = "FlightNumber")
    protected int flightNumber;
    @XmlElement(name = "BarCode", required = true)
    protected String barCode;
    @XmlElement(name = "MarketingFlightCarrier")
    protected String marketingFlightCarrier;
    @XmlElement(name = "MarketingFlightNumber")
    protected Integer marketingFlightNumber;
    @XmlElement(name = "MarketingFlightSuffix")
    protected String marketingFlightSuffix;
    @XmlElement(name = "DeptTime", required = true)
    protected String deptTime;
    @XmlElement(name = "BoardCityName", required = true)
    protected String boardCityName;
    @XmlElement(name = "OffCityName", required = true)
    protected String offCityName;
    @XmlElement(name = "BoardCityNameLocal")
    protected String boardCityNameLocal;
    @XmlElement(name = "OffCityNameLocal")
    protected String offCityNameLocal;
    @XmlElement(name = "AirlineNumber", required = true)
    protected String airlineNumber;
    @XmlElement(name = "FrequentFlierNumber")
    protected String frequentFlierNumber;
    @XmlElement(name = "LoyaltyTier")
    protected String loyaltyTier;
    @XmlElement(name = "BoardAirportNameLocal")
    protected String boardAirportNameLocal;
    @XmlElement(name = "OffAirportNameLocal")
    protected String offAirportNameLocal;
    @XmlElement(name = "BoardAirportName")
    protected String boardAirportName;
    @XmlElement(name = "OffAirportName")
    protected String offAirportName;
    @XmlElement(name = "FinalDestinationAirportName")
    protected String finalDestinationAirportName;
    @XmlElement(name = "FinalDestinationAirportNameLocal")
    protected String finalDestinationAirportNameLocal;
    @XmlElement(name = "DepartureDate")
    protected String departureDate;
    @XmlElement(name = "TotalNumberOfBags")
    protected Integer totalNumberOfBags;
    @XmlElement(name = "TotalBaggageWeight")
    protected String totalBaggageWeight;
    @XmlElement(name = "OfficeCode")
    protected String officeCode;
    @XmlElement(name = "DestinationName")
    protected String destinationName;
    @XmlElement(name = "LocalDestinationName")
    protected String localDestinationName;
    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "SeatNumber")
    protected String seatNumber;
    protected Boolean isInternationalFlight;
    @XmlElement(name = "BaggageConnectionInfo")
    protected List<BagConnectionDetails> baggageConnectionInfo;
    @XmlElement(name = "IsPriorityPassenger")
    protected Boolean isPriorityPassenger;
    @XmlElement(name = "NumberOfGuest")
    protected String numberOfGuest;
    @XmlElement(name = "Cabinclass")
    protected String cabinclass;
    @XmlElement(name = "CapSelecteeInd")
    protected String capSelecteeInd;

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
     * guestName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestName() {
        return guestName;
    }

    /**
     * guestName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestName(String value) {
        this.guestName = value;
    }

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
     * destination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * destination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * checkinStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckinStatus() {
        return checkinStatus;
    }

    /**
     * checkinStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckinStatus(String value) {
        this.checkinStatus = value;
    }

    /**
     * resStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResStatus() {
        return resStatus;
    }

    /**
     * resStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResStatus(String value) {
        this.resStatus = value;
    }

    /**
     * bagTagIssuer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagTagIssuer() {
        return bagTagIssuer;
    }

    /**
     * bagTagIssuer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagTagIssuer(String value) {
        this.bagTagIssuer = value;
    }

    /**
     * bagTagNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagTagNumber() {
        return bagTagNumber;
    }

    /**
     * bagTagNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagTagNumber(String value) {
        this.bagTagNumber = value;
    }

    /**
     * bagTagDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagTagDate() {
        return bagTagDate;
    }

    /**
     * bagTagDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagTagDate(String value) {
        this.bagTagDate = value;
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
     * sequenceNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * sequenceNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * flightCarrier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightCarrier() {
        return flightCarrier;
    }

    /**
     * flightCarrier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightCarrier(String value) {
        this.flightCarrier = value;
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
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getFlightDate() {
        return flightDate;
    }

    /**
     * flightDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setFlightDate(DateOnlyType value) {
        this.flightDate = value;
    }

    /**
     * flightNumber 속성의 값을 가져옵니다.
     * 
     */
    public int getFlightNumber() {
        return flightNumber;
    }

    /**
     * flightNumber 속성의 값을 설정합니다.
     * 
     */
    public void setFlightNumber(int value) {
        this.flightNumber = value;
    }

    /**
     * barCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * barCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCode(String value) {
        this.barCode = value;
    }

    /**
     * marketingFlightCarrier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingFlightCarrier() {
        return marketingFlightCarrier;
    }

    /**
     * marketingFlightCarrier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingFlightCarrier(String value) {
        this.marketingFlightCarrier = value;
    }

    /**
     * marketingFlightNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarketingFlightNumber() {
        return marketingFlightNumber;
    }

    /**
     * marketingFlightNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarketingFlightNumber(Integer value) {
        this.marketingFlightNumber = value;
    }

    /**
     * marketingFlightSuffix 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingFlightSuffix() {
        return marketingFlightSuffix;
    }

    /**
     * marketingFlightSuffix 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingFlightSuffix(String value) {
        this.marketingFlightSuffix = value;
    }

    /**
     * deptTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptTime() {
        return deptTime;
    }

    /**
     * deptTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptTime(String value) {
        this.deptTime = value;
    }

    /**
     * boardCityName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardCityName() {
        return boardCityName;
    }

    /**
     * boardCityName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardCityName(String value) {
        this.boardCityName = value;
    }

    /**
     * offCityName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffCityName() {
        return offCityName;
    }

    /**
     * offCityName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffCityName(String value) {
        this.offCityName = value;
    }

    /**
     * boardCityNameLocal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardCityNameLocal() {
        return boardCityNameLocal;
    }

    /**
     * boardCityNameLocal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardCityNameLocal(String value) {
        this.boardCityNameLocal = value;
    }

    /**
     * offCityNameLocal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffCityNameLocal() {
        return offCityNameLocal;
    }

    /**
     * offCityNameLocal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffCityNameLocal(String value) {
        this.offCityNameLocal = value;
    }

    /**
     * airlineNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineNumber() {
        return airlineNumber;
    }

    /**
     * airlineNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineNumber(String value) {
        this.airlineNumber = value;
    }

    /**
     * frequentFlierNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequentFlierNumber() {
        return frequentFlierNumber;
    }

    /**
     * frequentFlierNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequentFlierNumber(String value) {
        this.frequentFlierNumber = value;
    }

    /**
     * loyaltyTier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyTier() {
        return loyaltyTier;
    }

    /**
     * loyaltyTier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyTier(String value) {
        this.loyaltyTier = value;
    }

    /**
     * boardAirportNameLocal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardAirportNameLocal() {
        return boardAirportNameLocal;
    }

    /**
     * boardAirportNameLocal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardAirportNameLocal(String value) {
        this.boardAirportNameLocal = value;
    }

    /**
     * offAirportNameLocal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffAirportNameLocal() {
        return offAirportNameLocal;
    }

    /**
     * offAirportNameLocal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffAirportNameLocal(String value) {
        this.offAirportNameLocal = value;
    }

    /**
     * boardAirportName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardAirportName() {
        return boardAirportName;
    }

    /**
     * boardAirportName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardAirportName(String value) {
        this.boardAirportName = value;
    }

    /**
     * offAirportName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffAirportName() {
        return offAirportName;
    }

    /**
     * offAirportName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffAirportName(String value) {
        this.offAirportName = value;
    }

    /**
     * finalDestinationAirportName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalDestinationAirportName() {
        return finalDestinationAirportName;
    }

    /**
     * finalDestinationAirportName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalDestinationAirportName(String value) {
        this.finalDestinationAirportName = value;
    }

    /**
     * finalDestinationAirportNameLocal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalDestinationAirportNameLocal() {
        return finalDestinationAirportNameLocal;
    }

    /**
     * finalDestinationAirportNameLocal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalDestinationAirportNameLocal(String value) {
        this.finalDestinationAirportNameLocal = value;
    }

    /**
     * departureDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * departureDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
        this.departureDate = value;
    }

    /**
     * totalNumberOfBags 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumberOfBags() {
        return totalNumberOfBags;
    }

    /**
     * totalNumberOfBags 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumberOfBags(Integer value) {
        this.totalNumberOfBags = value;
    }

    /**
     * totalBaggageWeight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalBaggageWeight() {
        return totalBaggageWeight;
    }

    /**
     * totalBaggageWeight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalBaggageWeight(String value) {
        this.totalBaggageWeight = value;
    }

    /**
     * officeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeCode() {
        return officeCode;
    }

    /**
     * officeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeCode(String value) {
        this.officeCode = value;
    }

    /**
     * destinationName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationName() {
        return destinationName;
    }

    /**
     * destinationName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationName(String value) {
        this.destinationName = value;
    }

    /**
     * localDestinationName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDestinationName() {
        return localDestinationName;
    }

    /**
     * localDestinationName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDestinationName(String value) {
        this.localDestinationName = value;
    }

    /**
     * userId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * userId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * seatNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * seatNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * isInternationalFlight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInternationalFlight() {
        return isInternationalFlight;
    }

    /**
     * isInternationalFlight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInternationalFlight(Boolean value) {
        this.isInternationalFlight = value;
    }

    /**
     * Gets the value of the baggageConnectionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageConnectionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageConnectionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BagConnectionDetails }
     * 
     * 
     */
    public List<BagConnectionDetails> getBaggageConnectionInfo() {
        if (baggageConnectionInfo == null) {
            baggageConnectionInfo = new ArrayList<BagConnectionDetails>();
        }
        return this.baggageConnectionInfo;
    }

    /**
     * isPriorityPassenger 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPriorityPassenger() {
        return isPriorityPassenger;
    }

    /**
     * isPriorityPassenger 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPriorityPassenger(Boolean value) {
        this.isPriorityPassenger = value;
    }

    /**
     * numberOfGuest 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfGuest() {
        return numberOfGuest;
    }

    /**
     * numberOfGuest 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfGuest(String value) {
        this.numberOfGuest = value;
    }

    /**
     * cabinclass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinclass() {
        return cabinclass;
    }

    /**
     * cabinclass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinclass(String value) {
        this.cabinclass = value;
    }

    /**
     * capSelecteeInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapSelecteeInd() {
        return capSelecteeInd;
    }

    /**
     * capSelecteeInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapSelecteeInd(String value) {
        this.capSelecteeInd = value;
    }

}
