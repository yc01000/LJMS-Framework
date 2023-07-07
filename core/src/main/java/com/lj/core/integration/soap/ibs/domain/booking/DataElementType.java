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
import jakarta.xml.bind.annotation.XmlType;


/**
 * This contains the DEI code and the corresponding value.
 * 
 * <p>DataElementType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="DataElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeiCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DeiDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeiValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CanDisplayDei" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataElementType", propOrder = {
    "deiCode",
    "deiDesc",
    "deiValue",
    "canDisplayDei"
})
public class DataElementType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "DeiCode", required = true)
    protected String deiCode;
    @XmlElement(name = "DeiDesc")
    protected String deiDesc;
    @XmlElement(name = "DeiValue")
    protected String deiValue;
    @XmlElement(name = "CanDisplayDei")
    protected Boolean canDisplayDei;

    /**
     * deiCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeiCode() {
        return deiCode;
    }

    /**
     * deiCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeiCode(String value) {
        this.deiCode = value;
    }

    /**
     * deiDesc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeiDesc() {
        return deiDesc;
    }

    /**
     * deiDesc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeiDesc(String value) {
        this.deiDesc = value;
    }

    /**
     * deiValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeiValue() {
        return deiValue;
    }

    /**
     * deiValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeiValue(String value) {
        this.deiValue = value;
    }

    /**
     * canDisplayDei 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanDisplayDei() {
        return canDisplayDei;
    }

    /**
     * canDisplayDei 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanDisplayDei(Boolean value) {
        this.canDisplayDei = value;
    }

}
