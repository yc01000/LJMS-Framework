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
 * <p>ScheduleList complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ScheduleList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlightDesignator" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightDesignator"/&gt;
 *         &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DaysOfOperation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ScheduleStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ScheduleEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ScheduleID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleList", propOrder = {
    "flightType",
    "flightDesignator",
    "route",
    "daysOfOperation",
    "scheduleStartDate",
    "scheduleEndDate",
    "status",
    "scheduleID"
})
public class ScheduleList
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FlightType", required = true)
    protected String flightType;
    @XmlElement(name = "FlightDesignator", required = true)
    protected FlightDesignator flightDesignator;
    @XmlElement(name = "Route", required = true)
    protected String route;
    @XmlElement(name = "DaysOfOperation", required = true)
    protected String daysOfOperation;
    @XmlElement(name = "ScheduleStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleStartDate;
    @XmlElement(name = "ScheduleEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleEndDate;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "ScheduleID")
    protected int scheduleID;

    /**
     * flightType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightType() {
        return flightType;
    }

    /**
     * flightType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightType(String value) {
        this.flightType = value;
    }

    /**
     * flightDesignator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightDesignator }
     *     
     */
    public FlightDesignator getFlightDesignator() {
        return flightDesignator;
    }

    /**
     * flightDesignator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDesignator }
     *     
     */
    public void setFlightDesignator(FlightDesignator value) {
        this.flightDesignator = value;
    }

    /**
     * route 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * route 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * daysOfOperation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysOfOperation() {
        return daysOfOperation;
    }

    /**
     * daysOfOperation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysOfOperation(String value) {
        this.daysOfOperation = value;
    }

    /**
     * scheduleStartDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleStartDate() {
        return scheduleStartDate;
    }

    /**
     * scheduleStartDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleStartDate(XMLGregorianCalendar value) {
        this.scheduleStartDate = value;
    }

    /**
     * scheduleEndDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleEndDate() {
        return scheduleEndDate;
    }

    /**
     * scheduleEndDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleEndDate(XMLGregorianCalendar value) {
        this.scheduleEndDate = value;
    }

    /**
     * status 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * status 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * scheduleID 속성의 값을 가져옵니다.
     * 
     */
    public int getScheduleID() {
        return scheduleID;
    }

    /**
     * scheduleID 속성의 값을 설정합니다.
     * 
     */
    public void setScheduleID(int value) {
        this.scheduleID = value;
    }

}
