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
 * <p>TimeLimitDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TimeLimitDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeLimitAction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TimeLimitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TimeLimitLTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TimeLimitUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TimeLimitTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TLTtimeInAgentOfficeTimeZone" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeLimitDetailsType", propOrder = {
    "timeLimitAction",
    "timeLimitType",
    "timeLimitLTC",
    "timeLimitUTC",
    "timeLimitTimeZone",
    "tlTtimeInAgentOfficeTimeZone"
})
public class TimeLimitDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "TimeLimitAction", required = true)
    protected String timeLimitAction;
    @XmlElement(name = "TimeLimitType", required = true)
    protected String timeLimitType;
    @XmlElement(name = "TimeLimitLTC", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeLimitLTC;
    @XmlElement(name = "TimeLimitUTC", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeLimitUTC;
    @XmlElement(name = "TimeLimitTimeZone")
    protected String timeLimitTimeZone;
    @XmlElement(name = "TLTtimeInAgentOfficeTimeZone", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tlTtimeInAgentOfficeTimeZone;

    /**
     * timeLimitAction 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeLimitAction() {
        return timeLimitAction;
    }

    /**
     * timeLimitAction 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeLimitAction(String value) {
        this.timeLimitAction = value;
    }

    /**
     * timeLimitType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeLimitType() {
        return timeLimitType;
    }

    /**
     * timeLimitType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeLimitType(String value) {
        this.timeLimitType = value;
    }

    /**
     * timeLimitLTC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeLimitLTC() {
        return timeLimitLTC;
    }

    /**
     * timeLimitLTC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeLimitLTC(XMLGregorianCalendar value) {
        this.timeLimitLTC = value;
    }

    /**
     * timeLimitUTC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeLimitUTC() {
        return timeLimitUTC;
    }

    /**
     * timeLimitUTC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeLimitUTC(XMLGregorianCalendar value) {
        this.timeLimitUTC = value;
    }

    /**
     * timeLimitTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeLimitTimeZone() {
        return timeLimitTimeZone;
    }

    /**
     * timeLimitTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeLimitTimeZone(String value) {
        this.timeLimitTimeZone = value;
    }

    /**
     * tlTtimeInAgentOfficeTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTLTtimeInAgentOfficeTimeZone() {
        return tlTtimeInAgentOfficeTimeZone;
    }

    /**
     * tlTtimeInAgentOfficeTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTLTtimeInAgentOfficeTimeZone(XMLGregorianCalendar value) {
        this.tlTtimeInAgentOfficeTimeZone = value;
    }

}
