//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Details for availability search.NA for CheckIn API.
 * 
 * <p>AvailabilitySearchType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AvailabilitySearchType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OandD" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentInfo"/&gt;
 *         &lt;element name="travelDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="positiveDaysOut" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="negativeDaysOut" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilitySearchType", propOrder = {
    "oandD",
    "travelDate",
    "positiveDaysOut",
    "negativeDaysOut",
    "cabinClass"
})
public class AvailabilitySearchType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "OandD", required = true)
    protected SegmentInfo oandD;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar travelDate;
    protected int positiveDaysOut;
    protected int negativeDaysOut;
    @XmlElement(required = true)
    protected String cabinClass;

    /**
     * oandD 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SegmentInfo }
     *     
     */
    public SegmentInfo getOandD() {
        return oandD;
    }

    /**
     * oandD 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentInfo }
     *     
     */
    public void setOandD(SegmentInfo value) {
        this.oandD = value;
    }

    /**
     * travelDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelDate() {
        return travelDate;
    }

    /**
     * travelDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelDate(XMLGregorianCalendar value) {
        this.travelDate = value;
    }

    /**
     * positiveDaysOut 속성의 값을 가져옵니다.
     * 
     */
    public int getPositiveDaysOut() {
        return positiveDaysOut;
    }

    /**
     * positiveDaysOut 속성의 값을 설정합니다.
     * 
     */
    public void setPositiveDaysOut(int value) {
        this.positiveDaysOut = value;
    }

    /**
     * negativeDaysOut 속성의 값을 가져옵니다.
     * 
     */
    public int getNegativeDaysOut() {
        return negativeDaysOut;
    }

    /**
     * negativeDaysOut 속성의 값을 설정합니다.
     * 
     */
    public void setNegativeDaysOut(int value) {
        this.negativeDaysOut = value;
    }

    /**
     * cabinClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * cabinClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

}
