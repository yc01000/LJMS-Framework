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
 * Flight information corresponding to flight date,flight number and board-off airport code.
 * 
 * <p>FlightArgs complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FlightArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FLTNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ACNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ROUTE0" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ROUTE1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="STD" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="USER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IPADDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TICKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightArgs", propOrder = {
    "fltno",
    "acno",
    "route0",
    "route1",
    "std",
    "user",
    "ipaddr",
    "ticks"
})
public class FlightArgs
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FLTNO", required = true)
    protected String fltno;
    @XmlElement(name = "ACNO", required = true)
    protected String acno;
    @XmlElement(name = "ROUTE0", required = true)
    protected String route0;
    @XmlElement(name = "ROUTE1", required = true)
    protected String route1;
    @XmlElement(name = "STD", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar std;
    @XmlElement(name = "USER")
    protected String user;
    @XmlElement(name = "IPADDR")
    protected String ipaddr;
    @XmlElement(name = "TICKS")
    protected String ticks;

    /**
     * fltno 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLTNO() {
        return fltno;
    }

    /**
     * fltno 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLTNO(String value) {
        this.fltno = value;
    }

    /**
     * acno 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACNO() {
        return acno;
    }

    /**
     * acno 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACNO(String value) {
        this.acno = value;
    }

    /**
     * route0 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROUTE0() {
        return route0;
    }

    /**
     * route0 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROUTE0(String value) {
        this.route0 = value;
    }

    /**
     * route1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROUTE1() {
        return route1;
    }

    /**
     * route1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROUTE1(String value) {
        this.route1 = value;
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
     * user 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSER() {
        return user;
    }

    /**
     * user 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSER(String value) {
        this.user = value;
    }

    /**
     * ipaddr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPADDR() {
        return ipaddr;
    }

    /**
     * ipaddr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPADDR(String value) {
        this.ipaddr = value;
    }

    /**
     * ticks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKS() {
        return ticks;
    }

    /**
     * ticks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKS(String value) {
        this.ticks = value;
    }

}
