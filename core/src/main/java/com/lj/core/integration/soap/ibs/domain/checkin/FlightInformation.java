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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  Information about flight.
 * 
 * <p>FlightInformation complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FlightInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightIdentifier" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="AirlineCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirlineCode"/&gt;
 *         &lt;element name="BoardPoint" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportType"/&gt;
 *         &lt;element name="OffPoint" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportType"/&gt;
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AgentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgentOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ETD" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="STD" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ETA" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="STA" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ActualArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActualDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OutOfGateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IntoGateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OffGroundTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OnGroundTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalGate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureGate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TailNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApisSentInfoFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AirportComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IropComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IropCommentFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WeatherComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WeatherCommentFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LegStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DelayCodes" type="{http://www.ibsplc.com/iRes/simpleTypes/}DelayCodeType" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="isDisplayableDeiExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DcsStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInformation", propOrder = {
    "flightIdentifier",
    "airlineCode",
    "boardPoint",
    "offPoint",
    "updateTime",
    "agentCode",
    "agentOffice",
    "etd",
    "std",
    "eta",
    "sta",
    "actualArrivalTime",
    "actualDepartureTime",
    "outOfGateTime",
    "intoGateTime",
    "offGroundTime",
    "onGroundTime",
    "arrivalGate",
    "departureGate",
    "tailNumber",
    "equipmentType",
    "apisSentInfoFlag",
    "airportComments",
    "iropComments",
    "iropCommentFlag",
    "weatherComments",
    "weatherCommentFlag",
    "legStatus",
    "delayCodes",
    "isDisplayableDeiExists",
    "dcsStatus"
})
public class FlightInformation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FlightIdentifier")
    protected FlightIdentifierType flightIdentifier;
    @XmlElement(name = "AirlineCode", required = true)
    protected AirlineCode airlineCode;
    @XmlElement(name = "BoardPoint", required = true)
    protected AirportType boardPoint;
    @XmlElement(name = "OffPoint", required = true)
    protected AirportType offPoint;
    @XmlElement(name = "UpdateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(name = "AgentCode")
    protected String agentCode;
    @XmlElement(name = "AgentOffice")
    protected String agentOffice;
    @XmlElement(name = "ETD")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar etd;
    @XmlElement(name = "STD", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar std;
    @XmlElement(name = "ETA")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eta;
    @XmlElement(name = "STA", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sta;
    @XmlElement(name = "ActualArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualArrivalTime;
    @XmlElement(name = "ActualDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDepartureTime;
    @XmlElement(name = "OutOfGateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOfGateTime;
    @XmlElement(name = "IntoGateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar intoGateTime;
    @XmlElement(name = "OffGroundTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offGroundTime;
    @XmlElement(name = "OnGroundTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar onGroundTime;
    @XmlElement(name = "ArrivalGate")
    protected String arrivalGate;
    @XmlElement(name = "DepartureGate")
    protected String departureGate;
    @XmlElement(name = "TailNumber")
    protected String tailNumber;
    @XmlElement(name = "EquipmentType", required = true)
    protected String equipmentType;
    @XmlElement(name = "ApisSentInfoFlag")
    protected Boolean apisSentInfoFlag;
    @XmlElement(name = "AirportComments")
    protected String airportComments;
    @XmlElement(name = "IropComments")
    protected String iropComments;
    @XmlElement(name = "IropCommentFlag")
    protected boolean iropCommentFlag;
    @XmlElement(name = "WeatherComments")
    protected String weatherComments;
    @XmlElement(name = "WeatherCommentFlag")
    protected boolean weatherCommentFlag;
    @XmlElement(name = "LegStatus", required = true)
    protected String legStatus;
    @XmlElement(name = "DelayCodes")
    protected List<DelayCodeType> delayCodes;
    protected Boolean isDisplayableDeiExists;
    @XmlElement(name = "DcsStatus", required = true)
    protected String dcsStatus;

    /**
     * flightIdentifier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightIdentifierType }
     *     
     */
    public FlightIdentifierType getFlightIdentifier() {
        return flightIdentifier;
    }

    /**
     * flightIdentifier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightIdentifierType }
     *     
     */
    public void setFlightIdentifier(FlightIdentifierType value) {
        this.flightIdentifier = value;
    }

    /**
     * airlineCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AirlineCode }
     *     
     */
    public AirlineCode getAirlineCode() {
        return airlineCode;
    }

    /**
     * airlineCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineCode }
     *     
     */
    public void setAirlineCode(AirlineCode value) {
        this.airlineCode = value;
    }

    /**
     * boardPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AirportType }
     *     
     */
    public AirportType getBoardPoint() {
        return boardPoint;
    }

    /**
     * boardPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportType }
     *     
     */
    public void setBoardPoint(AirportType value) {
        this.boardPoint = value;
    }

    /**
     * offPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AirportType }
     *     
     */
    public AirportType getOffPoint() {
        return offPoint;
    }

    /**
     * offPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportType }
     *     
     */
    public void setOffPoint(AirportType value) {
        this.offPoint = value;
    }

    /**
     * updateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * updateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

    /**
     * agentCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCode() {
        return agentCode;
    }

    /**
     * agentCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCode(String value) {
        this.agentCode = value;
    }

    /**
     * agentOffice 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentOffice() {
        return agentOffice;
    }

    /**
     * agentOffice 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentOffice(String value) {
        this.agentOffice = value;
    }

    /**
     * etd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETD() {
        return etd;
    }

    /**
     * etd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETD(XMLGregorianCalendar value) {
        this.etd = value;
    }

    /**
     * std 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTD() {
        return std;
    }

    /**
     * std 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTD(XMLGregorianCalendar value) {
        this.std = value;
    }

    /**
     * eta 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETA() {
        return eta;
    }

    /**
     * eta 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETA(XMLGregorianCalendar value) {
        this.eta = value;
    }

    /**
     * sta 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTA() {
        return sta;
    }

    /**
     * sta 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTA(XMLGregorianCalendar value) {
        this.sta = value;
    }

    /**
     * actualArrivalTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualArrivalTime() {
        return actualArrivalTime;
    }

    /**
     * actualArrivalTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualArrivalTime(XMLGregorianCalendar value) {
        this.actualArrivalTime = value;
    }

    /**
     * actualDepartureTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDepartureTime() {
        return actualDepartureTime;
    }

    /**
     * actualDepartureTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDepartureTime(XMLGregorianCalendar value) {
        this.actualDepartureTime = value;
    }

    /**
     * outOfGateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOfGateTime() {
        return outOfGateTime;
    }

    /**
     * outOfGateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOfGateTime(XMLGregorianCalendar value) {
        this.outOfGateTime = value;
    }

    /**
     * intoGateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntoGateTime() {
        return intoGateTime;
    }

    /**
     * intoGateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntoGateTime(XMLGregorianCalendar value) {
        this.intoGateTime = value;
    }

    /**
     * offGroundTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOffGroundTime() {
        return offGroundTime;
    }

    /**
     * offGroundTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOffGroundTime(XMLGregorianCalendar value) {
        this.offGroundTime = value;
    }

    /**
     * onGroundTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOnGroundTime() {
        return onGroundTime;
    }

    /**
     * onGroundTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOnGroundTime(XMLGregorianCalendar value) {
        this.onGroundTime = value;
    }

    /**
     * arrivalGate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalGate() {
        return arrivalGate;
    }

    /**
     * arrivalGate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalGate(String value) {
        this.arrivalGate = value;
    }

    /**
     * departureGate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureGate() {
        return departureGate;
    }

    /**
     * departureGate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureGate(String value) {
        this.departureGate = value;
    }

    /**
     * tailNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTailNumber() {
        return tailNumber;
    }

    /**
     * tailNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTailNumber(String value) {
        this.tailNumber = value;
    }

    /**
     * equipmentType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentType() {
        return equipmentType;
    }

    /**
     * equipmentType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentType(String value) {
        this.equipmentType = value;
    }

    /**
     * apisSentInfoFlag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApisSentInfoFlag() {
        return apisSentInfoFlag;
    }

    /**
     * apisSentInfoFlag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApisSentInfoFlag(Boolean value) {
        this.apisSentInfoFlag = value;
    }

    /**
     * airportComments 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportComments() {
        return airportComments;
    }

    /**
     * airportComments 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportComments(String value) {
        this.airportComments = value;
    }

    /**
     * iropComments 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIropComments() {
        return iropComments;
    }

    /**
     * iropComments 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIropComments(String value) {
        this.iropComments = value;
    }

    /**
     * iropCommentFlag 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIropCommentFlag() {
        return iropCommentFlag;
    }

    /**
     * iropCommentFlag 속성의 값을 설정합니다.
     * 
     */
    public void setIropCommentFlag(boolean value) {
        this.iropCommentFlag = value;
    }

    /**
     * weatherComments 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherComments() {
        return weatherComments;
    }

    /**
     * weatherComments 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherComments(String value) {
        this.weatherComments = value;
    }

    /**
     * weatherCommentFlag 속성의 값을 가져옵니다.
     * 
     */
    public boolean isWeatherCommentFlag() {
        return weatherCommentFlag;
    }

    /**
     * weatherCommentFlag 속성의 값을 설정합니다.
     * 
     */
    public void setWeatherCommentFlag(boolean value) {
        this.weatherCommentFlag = value;
    }

    /**
     * legStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegStatus() {
        return legStatus;
    }

    /**
     * legStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegStatus(String value) {
        this.legStatus = value;
    }

    /**
     * Gets the value of the delayCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delayCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelayCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DelayCodeType }
     * 
     * 
     */
    public List<DelayCodeType> getDelayCodes() {
        if (delayCodes == null) {
            delayCodes = new ArrayList<DelayCodeType>();
        }
        return this.delayCodes;
    }

    /**
     * isDisplayableDeiExists 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDisplayableDeiExists() {
        return isDisplayableDeiExists;
    }

    /**
     * isDisplayableDeiExists 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDisplayableDeiExists(Boolean value) {
        this.isDisplayableDeiExists = value;
    }

    /**
     * dcsStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcsStatus() {
        return dcsStatus;
    }

    /**
     * dcsStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcsStatus(String value) {
        this.dcsStatus = value;
    }

}
