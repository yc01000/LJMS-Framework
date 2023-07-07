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
 * <p>ScheduleInfoDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ScheduleInfoDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Connectionpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Flightnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FlightSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Startdate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType" minOccurs="0"/&gt;
 *         &lt;element name="Enddate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType" minOccurs="0"/&gt;
 *         &lt;element name="Operationfreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Aircrafttype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEIInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoOfStopsOfCnx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataElements" type="{http://www.ibsplc.com/iRes/simpleTypes/}DataElementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleInfoDetails", propOrder = {
    "origin",
    "destination",
    "connectionpoint",
    "flightnumber",
    "flightSuffix",
    "startdate",
    "enddate",
    "operationfreq",
    "depTime",
    "arrTime",
    "aircrafttype",
    "deiInfo",
    "noOfStopsOfCnx",
    "dataElements"
})
public class ScheduleInfoDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Origin")
    protected String origin;
    @XmlElement(name = "Destination")
    protected String destination;
    @XmlElement(name = "Connectionpoint")
    protected String connectionpoint;
    @XmlElement(name = "Flightnumber")
    protected String flightnumber;
    @XmlElement(name = "FlightSuffix")
    protected String flightSuffix;
    @XmlElement(name = "Startdate")
    protected DateOnlyType startdate;
    @XmlElement(name = "Enddate")
    protected DateOnlyType enddate;
    @XmlElement(name = "Operationfreq")
    protected String operationfreq;
    @XmlElement(name = "DepTime")
    protected String depTime;
    @XmlElement(name = "ArrTime")
    protected String arrTime;
    @XmlElement(name = "Aircrafttype")
    protected String aircrafttype;
    @XmlElement(name = "DEIInfo")
    protected String deiInfo;
    @XmlElement(name = "NoOfStopsOfCnx")
    protected String noOfStopsOfCnx;
    @XmlElement(name = "DataElements")
    protected List<DataElementType> dataElements;

    /**
     * origin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * origin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
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
     * connectionpoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionpoint() {
        return connectionpoint;
    }

    /**
     * connectionpoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionpoint(String value) {
        this.connectionpoint = value;
    }

    /**
     * flightnumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightnumber() {
        return flightnumber;
    }

    /**
     * flightnumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightnumber(String value) {
        this.flightnumber = value;
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
     * startdate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getStartdate() {
        return startdate;
    }

    /**
     * startdate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setStartdate(DateOnlyType value) {
        this.startdate = value;
    }

    /**
     * enddate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getEnddate() {
        return enddate;
    }

    /**
     * enddate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setEnddate(DateOnlyType value) {
        this.enddate = value;
    }

    /**
     * operationfreq 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationfreq() {
        return operationfreq;
    }

    /**
     * operationfreq 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationfreq(String value) {
        this.operationfreq = value;
    }

    /**
     * depTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepTime() {
        return depTime;
    }

    /**
     * depTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepTime(String value) {
        this.depTime = value;
    }

    /**
     * arrTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrTime() {
        return arrTime;
    }

    /**
     * arrTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrTime(String value) {
        this.arrTime = value;
    }

    /**
     * aircrafttype 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircrafttype() {
        return aircrafttype;
    }

    /**
     * aircrafttype 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircrafttype(String value) {
        this.aircrafttype = value;
    }

    /**
     * deiInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEIInfo() {
        return deiInfo;
    }

    /**
     * deiInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEIInfo(String value) {
        this.deiInfo = value;
    }

    /**
     * noOfStopsOfCnx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfStopsOfCnx() {
        return noOfStopsOfCnx;
    }

    /**
     * noOfStopsOfCnx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfStopsOfCnx(String value) {
        this.noOfStopsOfCnx = value;
    }

    /**
     * Gets the value of the dataElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataElementType }
     * 
     * 
     */
    public List<DataElementType> getDataElements() {
        if (dataElements == null) {
            dataElements = new ArrayList<DataElementType>();
        }
        return this.dataElements;
    }

}
