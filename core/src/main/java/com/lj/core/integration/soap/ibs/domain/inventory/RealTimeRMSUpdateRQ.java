//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2020.12.01 시간 08:47:33 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.inventory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="RequestCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="FileID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OperatingAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FlightSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FlightDepartureDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="RMSCabinDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CabinDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InventoryChannel" type="{http://www.ibsplc.com/iRes/simpleTypes/}InventoryChannelKeyType"/&gt;
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
    "requestCode",
    "requestID",
    "fileID",
    "airlineCode",
    "operatingAirlineCode",
    "flightNumber",
    "flightSuffix",
    "flightDepartureDate",
    "rmsCabinDetails",
    "inventoryChannel"
})
@XmlRootElement(name = "RealTimeRMSUpdateRQ")
public class RealTimeRMSUpdateRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "RequestCode", required = true)
    protected String requestCode;
    @XmlElement(name = "RequestID")
    protected long requestID;
    @XmlElement(name = "FileID", required = true)
    protected String fileID;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "OperatingAirlineCode", required = true)
    protected String operatingAirlineCode;
    @XmlElement(name = "FlightNumber")
    protected int flightNumber;
    @XmlElement(name = "FlightSuffix")
    protected String flightSuffix;
    @XmlElement(name = "FlightDepartureDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar flightDepartureDate;
    @XmlElement(name = "RMSCabinDetails")
    protected List<CabinDetails> rmsCabinDetails;
    @XmlElement(name = "InventoryChannel", required = true)
    protected InventoryChannelKeyType inventoryChannel;

    /**
     * requestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCode() {
        return requestCode;
    }

    /**
     * requestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCode(String value) {
        this.requestCode = value;
    }

    /**
     * requestID 속성의 값을 가져옵니다.
     * 
     */
    public long getRequestID() {
        return requestID;
    }

    /**
     * requestID 속성의 값을 설정합니다.
     * 
     */
    public void setRequestID(long value) {
        this.requestID = value;
    }

    /**
     * fileID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileID() {
        return fileID;
    }

    /**
     * fileID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileID(String value) {
        this.fileID = value;
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
     * operatingAirlineCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingAirlineCode() {
        return operatingAirlineCode;
    }

    /**
     * operatingAirlineCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingAirlineCode(String value) {
        this.operatingAirlineCode = value;
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
     * flightDepartureDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlightDepartureDate() {
        return flightDepartureDate;
    }

    /**
     * flightDepartureDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlightDepartureDate(XMLGregorianCalendar value) {
        this.flightDepartureDate = value;
    }

    /**
     * Gets the value of the rmsCabinDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmsCabinDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRMSCabinDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinDetails }
     * 
     * 
     */
    public List<CabinDetails> getRMSCabinDetails() {
        if (rmsCabinDetails == null) {
            rmsCabinDetails = new ArrayList<CabinDetails>();
        }
        return this.rmsCabinDetails;
    }

    /**
     * inventoryChannel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link InventoryChannelKeyType }
     *     
     */
    public InventoryChannelKeyType getInventoryChannel() {
        return inventoryChannel;
    }

    /**
     * inventoryChannel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryChannelKeyType }
     *     
     */
    public void setInventoryChannel(InventoryChannelKeyType value) {
        this.inventoryChannel = value;
    }

}
