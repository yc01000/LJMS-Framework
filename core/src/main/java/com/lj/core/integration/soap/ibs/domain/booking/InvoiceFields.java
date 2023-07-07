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
 * <p>InvoiceFields complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="InvoiceFields"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Invoicename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Invoiceaddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Invoicecity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Invoicepostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Invoicevat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Invoiceemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceFields", propOrder = {
    "invoicename",
    "invoiceaddress1",
    "invoicecity",
    "invoicepostcode",
    "invoicevat",
    "invoiceemail"
})
public class InvoiceFields
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Invoicename")
    protected String invoicename;
    @XmlElement(name = "Invoiceaddress1")
    protected String invoiceaddress1;
    @XmlElement(name = "Invoicecity")
    protected String invoicecity;
    @XmlElement(name = "Invoicepostcode")
    protected String invoicepostcode;
    @XmlElement(name = "Invoicevat")
    protected String invoicevat;
    @XmlElement(name = "Invoiceemail")
    protected String invoiceemail;

    /**
     * invoicename 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicename() {
        return invoicename;
    }

    /**
     * invoicename 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicename(String value) {
        this.invoicename = value;
    }

    /**
     * invoiceaddress1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceaddress1() {
        return invoiceaddress1;
    }

    /**
     * invoiceaddress1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceaddress1(String value) {
        this.invoiceaddress1 = value;
    }

    /**
     * invoicecity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicecity() {
        return invoicecity;
    }

    /**
     * invoicecity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicecity(String value) {
        this.invoicecity = value;
    }

    /**
     * invoicepostcode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicepostcode() {
        return invoicepostcode;
    }

    /**
     * invoicepostcode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicepostcode(String value) {
        this.invoicepostcode = value;
    }

    /**
     * invoicevat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicevat() {
        return invoicevat;
    }

    /**
     * invoicevat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicevat(String value) {
        this.invoicevat = value;
    }

    /**
     * invoiceemail 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceemail() {
        return invoiceemail;
    }

    /**
     * invoiceemail 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceemail(String value) {
        this.invoiceemail = value;
    }

}
