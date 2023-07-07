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


/**
 * <p>CustomerProfileConsentDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileConsentDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="category" type="{http://www.ibsplc.com/iRes/simpleTypes/}ConsentCategory"/&gt;
 *         &lt;element name="isConsentActivation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileConsentDetails", propOrder = {
    "category",
    "isConsentActivation",
    "remark",
    "status"
})
public class CustomerProfileConsentDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConsentCategory category;
    protected boolean isConsentActivation;
    protected String remark;
    protected String status;

    /**
     * category 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ConsentCategory }
     *     
     */
    public ConsentCategory getCategory() {
        return category;
    }

    /**
     * category 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentCategory }
     *     
     */
    public void setCategory(ConsentCategory value) {
        this.category = value;
    }

    /**
     * isConsentActivation 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsConsentActivation() {
        return isConsentActivation;
    }

    /**
     * isConsentActivation 속성의 값을 설정합니다.
     * 
     */
    public void setIsConsentActivation(boolean value) {
        this.isConsentActivation = value;
    }

    /**
     * remark 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * remark 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
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

}
