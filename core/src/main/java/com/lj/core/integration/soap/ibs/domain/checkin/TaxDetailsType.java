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
 * Tax details of the Guest.
 * 
 * <p>TaxDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TaxDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TaxName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxDetailsType", propOrder = {
    "taxCode",
    "taxName",
    "taxType",
    "taxAmount"
})
public class TaxDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "TaxCode", required = true)
    protected String taxCode;
    @XmlElement(name = "TaxName", required = true)
    protected String taxName;
    @XmlElement(name = "TaxType")
    protected int taxType;
    @XmlElement(name = "TaxAmount")
    protected float taxAmount;

    /**
     * taxCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * taxCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * taxName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxName() {
        return taxName;
    }

    /**
     * taxName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxName(String value) {
        this.taxName = value;
    }

    /**
     * taxType 속성의 값을 가져옵니다.
     * 
     */
    public int getTaxType() {
        return taxType;
    }

    /**
     * taxType 속성의 값을 설정합니다.
     * 
     */
    public void setTaxType(int value) {
        this.taxType = value;
    }

    /**
     * taxAmount 속성의 값을 가져옵니다.
     * 
     */
    public float getTaxAmount() {
        return taxAmount;
    }

    /**
     * taxAmount 속성의 값을 설정합니다.
     * 
     */
    public void setTaxAmount(float value) {
        this.taxAmount = value;
    }

}
