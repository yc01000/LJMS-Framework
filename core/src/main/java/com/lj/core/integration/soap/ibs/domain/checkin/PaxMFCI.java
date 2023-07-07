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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Male, Female, Child, Infant count for each destination and cabin
 * 
 * <p>PaxMFCI complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaxMFCI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dest" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FrstClsMFCI" type="{http://www.ibsplc.com/iRes/simpleTypes/}PassengerInfo"/&gt;
 *         &lt;element name="SecClsMFCI" type="{http://www.ibsplc.com/iRes/simpleTypes/}PassengerInfo"/&gt;
 *         &lt;element name="LastClsMFCI" type="{http://www.ibsplc.com/iRes/simpleTypes/}PassengerInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxMFCI", propOrder = {
    "dest",
    "frstClsMFCI",
    "secClsMFCI",
    "lastClsMFCI"
})
public class PaxMFCI
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Dest", required = true)
    protected String dest;
    @XmlElement(name = "FrstClsMFCI", required = true)
    protected PassengerInfo frstClsMFCI;
    @XmlElement(name = "SecClsMFCI", required = true)
    protected PassengerInfo secClsMFCI;
    @XmlElement(name = "LastClsMFCI", required = true)
    protected PassengerInfo lastClsMFCI;

    /**
     * dest 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDest() {
        return dest;
    }

    /**
     * dest 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDest(String value) {
        this.dest = value;
    }

    /**
     * frstClsMFCI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PassengerInfo }
     *     
     */
    public PassengerInfo getFrstClsMFCI() {
        return frstClsMFCI;
    }

    /**
     * frstClsMFCI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerInfo }
     *     
     */
    public void setFrstClsMFCI(PassengerInfo value) {
        this.frstClsMFCI = value;
    }

    /**
     * secClsMFCI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PassengerInfo }
     *     
     */
    public PassengerInfo getSecClsMFCI() {
        return secClsMFCI;
    }

    /**
     * secClsMFCI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerInfo }
     *     
     */
    public void setSecClsMFCI(PassengerInfo value) {
        this.secClsMFCI = value;
    }

    /**
     * lastClsMFCI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PassengerInfo }
     *     
     */
    public PassengerInfo getLastClsMFCI() {
        return lastClsMFCI;
    }

    /**
     * lastClsMFCI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerInfo }
     *     
     */
    public void setLastClsMFCI(PassengerInfo value) {
        this.lastClsMFCI = value;
    }

}
