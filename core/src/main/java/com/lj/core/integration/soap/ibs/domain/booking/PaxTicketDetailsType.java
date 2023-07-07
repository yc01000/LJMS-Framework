//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2021.04.29 시간 12:54:19 PM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>PaxTicketDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaxTicketDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isConjunction" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OriginalTicketIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndorsementAndRestrictions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FareString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TicketingOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxTicketDetailsType", propOrder = {
    "ticketNumber",
    "isConjunction",
    "originalTicketIssueDate",
    "endorsementAndRestrictions",
    "fareString",
    "ticketingOfficeCode"
})
public class PaxTicketDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "TicketNumber", required = true)
    protected String ticketNumber;
    protected boolean isConjunction;
    @XmlElement(name = "OriginalTicketIssueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalTicketIssueDate;
    @XmlElement(name = "EndorsementAndRestrictions")
    protected List<String> endorsementAndRestrictions;
    @XmlElement(name = "FareString")
    protected String fareString;
    @XmlElement(name = "TicketingOfficeCode")
    protected String ticketingOfficeCode;

    /**
     * ticketNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * ticketNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * isConjunction 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsConjunction() {
        return isConjunction;
    }

    /**
     * isConjunction 속성의 값을 설정합니다.
     * 
     */
    public void setIsConjunction(boolean value) {
        this.isConjunction = value;
    }

    /**
     * originalTicketIssueDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalTicketIssueDate() {
        return originalTicketIssueDate;
    }

    /**
     * originalTicketIssueDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalTicketIssueDate(XMLGregorianCalendar value) {
        this.originalTicketIssueDate = value;
    }

    /**
     * Gets the value of the endorsementAndRestrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorsementAndRestrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorsementAndRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEndorsementAndRestrictions() {
        if (endorsementAndRestrictions == null) {
            endorsementAndRestrictions = new ArrayList<String>();
        }
        return this.endorsementAndRestrictions;
    }

    /**
     * fareString 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareString() {
        return fareString;
    }

    /**
     * fareString 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareString(String value) {
        this.fareString = value;
    }

    /**
     * ticketingOfficeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingOfficeCode() {
        return ticketingOfficeCode;
    }

    /**
     * ticketingOfficeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingOfficeCode(String value) {
        this.ticketingOfficeCode = value;
    }

}
