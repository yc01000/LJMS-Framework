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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ScheduleSearchType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ScheduleSearchType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirportPair" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportPairType" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleFromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ScheduleToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleSearchType", propOrder = {
    "airportPair",
    "scheduleFromDate",
    "scheduleToDate",
    "scheduleId"
})
public class ScheduleSearchType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirportPair")
    protected AirportPairType airportPair;
    @XmlElement(name = "ScheduleFromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleFromDate;
    @XmlElement(name = "ScheduleToDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleToDate;
    @XmlElement(name = "ScheduleId")
    protected Integer scheduleId;

    /**
     * airportPair 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AirportPairType }
     *     
     */
    public AirportPairType getAirportPair() {
        return airportPair;
    }

    /**
     * airportPair 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportPairType }
     *     
     */
    public void setAirportPair(AirportPairType value) {
        this.airportPair = value;
    }

    /**
     * scheduleFromDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleFromDate() {
        return scheduleFromDate;
    }

    /**
     * scheduleFromDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleFromDate(XMLGregorianCalendar value) {
        this.scheduleFromDate = value;
    }

    /**
     * scheduleToDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleToDate() {
        return scheduleToDate;
    }

    /**
     * scheduleToDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleToDate(XMLGregorianCalendar value) {
        this.scheduleToDate = value;
    }

    /**
     * scheduleId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduleId() {
        return scheduleId;
    }

    /**
     * scheduleId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduleId(Integer value) {
        this.scheduleId = value;
    }

}
