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
 * <p>FlightGroupType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FlightGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsNonStop" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsThrough" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsConnection" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="InitialDepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FinalArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="InitialDepartureTime" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FinalArrivalTime" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="InitialDepartureTimeString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FinalArrivalTimeString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InitialFlightNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConnectionLevel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalStops" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalJourneyTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FareGroupID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlightInformations" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightInformationsType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightGroupType", propOrder = {
    "isNonStop",
    "isThrough",
    "isConnection",
    "initialDepartureDate",
    "finalArrivalDate",
    "initialDepartureTime",
    "finalArrivalTime",
    "initialDepartureTimeString",
    "finalArrivalTimeString",
    "initialFlightNumber",
    "connectionLevel",
    "totalStops",
    "totalJourneyTime",
    "fareGroupID",
    "flightInformations"
})
public class FlightGroupType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "IsNonStop")
    protected boolean isNonStop;
    @XmlElement(name = "IsThrough")
    protected boolean isThrough;
    @XmlElement(name = "IsConnection")
    protected boolean isConnection;
    @XmlElement(name = "InitialDepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initialDepartureDate;
    @XmlElement(name = "FinalArrivalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finalArrivalDate;
    @XmlElement(name = "InitialDepartureTime")
    protected double initialDepartureTime;
    @XmlElement(name = "FinalArrivalTime")
    protected double finalArrivalTime;
    @XmlElement(name = "InitialDepartureTimeString", required = true)
    protected String initialDepartureTimeString;
    @XmlElement(name = "FinalArrivalTimeString", required = true)
    protected String finalArrivalTimeString;
    @XmlElement(name = "InitialFlightNumber", required = true)
    protected String initialFlightNumber;
    @XmlElement(name = "ConnectionLevel")
    protected int connectionLevel;
    @XmlElement(name = "TotalStops")
    protected int totalStops;
    @XmlElement(name = "TotalJourneyTime")
    protected int totalJourneyTime;
    @XmlElement(name = "FareGroupID", required = true)
    protected String fareGroupID;
    @XmlElement(name = "FlightInformations", required = true)
    protected List<FlightInformationsType> flightInformations;

    /**
     * isNonStop 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsNonStop() {
        return isNonStop;
    }

    /**
     * isNonStop 속성의 값을 설정합니다.
     * 
     */
    public void setIsNonStop(boolean value) {
        this.isNonStop = value;
    }

    /**
     * isThrough 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsThrough() {
        return isThrough;
    }

    /**
     * isThrough 속성의 값을 설정합니다.
     * 
     */
    public void setIsThrough(boolean value) {
        this.isThrough = value;
    }

    /**
     * isConnection 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsConnection() {
        return isConnection;
    }

    /**
     * isConnection 속성의 값을 설정합니다.
     * 
     */
    public void setIsConnection(boolean value) {
        this.isConnection = value;
    }

    /**
     * initialDepartureDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialDepartureDate() {
        return initialDepartureDate;
    }

    /**
     * initialDepartureDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialDepartureDate(XMLGregorianCalendar value) {
        this.initialDepartureDate = value;
    }

    /**
     * finalArrivalDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinalArrivalDate() {
        return finalArrivalDate;
    }

    /**
     * finalArrivalDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinalArrivalDate(XMLGregorianCalendar value) {
        this.finalArrivalDate = value;
    }

    /**
     * initialDepartureTime 속성의 값을 가져옵니다.
     * 
     */
    public double getInitialDepartureTime() {
        return initialDepartureTime;
    }

    /**
     * initialDepartureTime 속성의 값을 설정합니다.
     * 
     */
    public void setInitialDepartureTime(double value) {
        this.initialDepartureTime = value;
    }

    /**
     * finalArrivalTime 속성의 값을 가져옵니다.
     * 
     */
    public double getFinalArrivalTime() {
        return finalArrivalTime;
    }

    /**
     * finalArrivalTime 속성의 값을 설정합니다.
     * 
     */
    public void setFinalArrivalTime(double value) {
        this.finalArrivalTime = value;
    }

    /**
     * initialDepartureTimeString 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialDepartureTimeString() {
        return initialDepartureTimeString;
    }

    /**
     * initialDepartureTimeString 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialDepartureTimeString(String value) {
        this.initialDepartureTimeString = value;
    }

    /**
     * finalArrivalTimeString 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalArrivalTimeString() {
        return finalArrivalTimeString;
    }

    /**
     * finalArrivalTimeString 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalArrivalTimeString(String value) {
        this.finalArrivalTimeString = value;
    }

    /**
     * initialFlightNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialFlightNumber() {
        return initialFlightNumber;
    }

    /**
     * initialFlightNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialFlightNumber(String value) {
        this.initialFlightNumber = value;
    }

    /**
     * connectionLevel 속성의 값을 가져옵니다.
     * 
     */
    public int getConnectionLevel() {
        return connectionLevel;
    }

    /**
     * connectionLevel 속성의 값을 설정합니다.
     * 
     */
    public void setConnectionLevel(int value) {
        this.connectionLevel = value;
    }

    /**
     * totalStops 속성의 값을 가져옵니다.
     * 
     */
    public int getTotalStops() {
        return totalStops;
    }

    /**
     * totalStops 속성의 값을 설정합니다.
     * 
     */
    public void setTotalStops(int value) {
        this.totalStops = value;
    }

    /**
     * totalJourneyTime 속성의 값을 가져옵니다.
     * 
     */
    public int getTotalJourneyTime() {
        return totalJourneyTime;
    }

    /**
     * totalJourneyTime 속성의 값을 설정합니다.
     * 
     */
    public void setTotalJourneyTime(int value) {
        this.totalJourneyTime = value;
    }

    /**
     * fareGroupID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareGroupID() {
        return fareGroupID;
    }

    /**
     * fareGroupID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareGroupID(String value) {
        this.fareGroupID = value;
    }

    /**
     * Gets the value of the flightInformations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightInformations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightInformations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightInformationsType }
     * 
     * 
     */
    public List<FlightInformationsType> getFlightInformations() {
        if (flightInformations == null) {
            flightInformations = new ArrayList<FlightInformationsType>();
        }
        return this.flightInformations;
    }

}
