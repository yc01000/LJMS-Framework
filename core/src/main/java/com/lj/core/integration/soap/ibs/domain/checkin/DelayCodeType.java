//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Delay codes set for the flight.
 * 
 * <p>DelayCodeType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="DelayCodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DelayCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DelayTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="DelayDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DelayComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubDelayCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubDelayCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelayCodeType", propOrder = {
    "delayCode",
    "delayTime",
    "delayDescription",
    "delayComment",
    "subDelayCode",
    "subDelayCodeDescription"
})
public class DelayCodeType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "DelayCode", required = true)
    protected String delayCode;
    @XmlElement(name = "DelayTime")
    protected BigInteger delayTime;
    @XmlElement(name = "DelayDescription")
    protected String delayDescription;
    @XmlElement(name = "DelayComment")
    protected String delayComment;
    @XmlElement(name = "SubDelayCode")
    protected String subDelayCode;
    @XmlElement(name = "SubDelayCodeDescription")
    protected String subDelayCodeDescription;

    /**
     * delayCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayCode() {
        return delayCode;
    }

    /**
     * delayCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayCode(String value) {
        this.delayCode = value;
    }

    /**
     * delayTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDelayTime() {
        return delayTime;
    }

    /**
     * delayTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDelayTime(BigInteger value) {
        this.delayTime = value;
    }

    /**
     * delayDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayDescription() {
        return delayDescription;
    }

    /**
     * delayDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayDescription(String value) {
        this.delayDescription = value;
    }

    /**
     * delayComment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayComment() {
        return delayComment;
    }

    /**
     * delayComment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayComment(String value) {
        this.delayComment = value;
    }

    /**
     * subDelayCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDelayCode() {
        return subDelayCode;
    }

    /**
     * subDelayCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDelayCode(String value) {
        this.subDelayCode = value;
    }

    /**
     * subDelayCodeDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDelayCodeDescription() {
        return subDelayCodeDescription;
    }

    /**
     * subDelayCodeDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDelayCodeDescription(String value) {
        this.subDelayCodeDescription = value;
    }

}
