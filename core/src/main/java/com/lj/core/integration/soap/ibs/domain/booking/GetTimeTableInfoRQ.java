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
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BookingChannel" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingChannelKeyType"/&gt;
 *         &lt;element name="Searchtype" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/&gt;
 *         &lt;element name="EndDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/&gt;
 *         &lt;element name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FlightSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RetrieveAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FetchSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FromPageNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ToPageNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "airlineCode",
    "bookingChannel",
    "searchtype",
    "origin",
    "destination",
    "startDate",
    "endDate",
    "carrierCode",
    "flightNumber",
    "flightSuffix",
    "retrieveAllInd",
    "sessionId",
    "fetchSize",
    "fromPageNo",
    "toPageNo"
})
@XmlRootElement(name = "GetTimeTableInfoRQ")
public class GetTimeTableInfoRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "BookingChannel", required = true)
    protected BookingChannelKeyType bookingChannel;
    @XmlElement(name = "Searchtype", required = true)
    protected String searchtype;
    @XmlElement(name = "Origin", required = true)
    protected String origin;
    @XmlElement(name = "Destination")
    protected String destination;
    @XmlElement(name = "StartDate", required = true)
    protected DateOnlyType startDate;
    @XmlElement(name = "EndDate", required = true)
    protected DateOnlyType endDate;
    @XmlElement(name = "CarrierCode")
    protected String carrierCode;
    @XmlElement(name = "FlightNumber")
    protected String flightNumber;
    @XmlElement(name = "FlightSuffix")
    protected String flightSuffix;
    @XmlElement(name = "RetrieveAllInd")
    protected boolean retrieveAllInd;
    @XmlElement(name = "SessionId", required = true)
    protected String sessionId;
    @XmlElement(name = "FetchSize")
    protected int fetchSize;
    @XmlElement(name = "FromPageNo")
    protected int fromPageNo;
    @XmlElement(name = "ToPageNo")
    protected Integer toPageNo;

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
     * searchtype 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchtype() {
        return searchtype;
    }

    /**
     * searchtype 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchtype(String value) {
        this.searchtype = value;
    }

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
     * startDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getStartDate() {
        return startDate;
    }

    /**
     * startDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setStartDate(DateOnlyType value) {
        this.startDate = value;
    }

    /**
     * endDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getEndDate() {
        return endDate;
    }

    /**
     * endDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setEndDate(DateOnlyType value) {
        this.endDate = value;
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
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * flightNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
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
     * retrieveAllInd 속성의 값을 가져옵니다.
     * 
     */
    public boolean isRetrieveAllInd() {
        return retrieveAllInd;
    }

    /**
     * retrieveAllInd 속성의 값을 설정합니다.
     * 
     */
    public void setRetrieveAllInd(boolean value) {
        this.retrieveAllInd = value;
    }

    /**
     * sessionId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * sessionId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * fetchSize 속성의 값을 가져옵니다.
     * 
     */
    public int getFetchSize() {
        return fetchSize;
    }

    /**
     * fetchSize 속성의 값을 설정합니다.
     * 
     */
    public void setFetchSize(int value) {
        this.fetchSize = value;
    }

    /**
     * fromPageNo 속성의 값을 가져옵니다.
     * 
     */
    public int getFromPageNo() {
        return fromPageNo;
    }

    /**
     * fromPageNo 속성의 값을 설정합니다.
     * 
     */
    public void setFromPageNo(int value) {
        this.fromPageNo = value;
    }

    /**
     * toPageNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getToPageNo() {
        return toPageNo;
    }

    /**
     * toPageNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setToPageNo(Integer value) {
        this.toPageNo = value;
    }

}
