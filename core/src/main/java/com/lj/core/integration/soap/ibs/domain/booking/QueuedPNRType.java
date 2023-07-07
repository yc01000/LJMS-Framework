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
 * <p>QueuedPNRType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="QueuedPNRType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PNRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="QueueOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="RevenueCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceivedAtGMT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ReasonTimeGMT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceivedAtLTC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RecievedTimeInAgencyLTC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueuedPNRType", propOrder = {
    "pnrNumber",
    "queueNumber",
    "queueOfficeCode",
    "creationDate",
    "revenueCompany",
    "receivedAtGMT",
    "reasonTimeGMT",
    "reason",
    "itemTag",
    "receivedAtLTC",
    "recievedTimeInAgencyLTC"
})
public class QueuedPNRType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PNRNumber", required = true)
    protected String pnrNumber;
    @XmlElement(name = "QueueNumber", required = true)
    protected String queueNumber;
    @XmlElement(name = "QueueOfficeCode", required = true)
    protected String queueOfficeCode;
    @XmlElement(name = "CreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "RevenueCompany")
    protected String revenueCompany;
    @XmlElement(name = "ReceivedAtGMT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedAtGMT;
    @XmlElement(name = "ReasonTimeGMT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reasonTimeGMT;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "ItemTag")
    protected String itemTag;
    @XmlElement(name = "ReceivedAtLTC")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedAtLTC;
    @XmlElement(name = "RecievedTimeInAgencyLTC")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recievedTimeInAgencyLTC;

    /**
     * pnrNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRNumber() {
        return pnrNumber;
    }

    /**
     * pnrNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNRNumber(String value) {
        this.pnrNumber = value;
    }

    /**
     * queueNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueNumber() {
        return queueNumber;
    }

    /**
     * queueNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueNumber(String value) {
        this.queueNumber = value;
    }

    /**
     * queueOfficeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueOfficeCode() {
        return queueOfficeCode;
    }

    /**
     * queueOfficeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueOfficeCode(String value) {
        this.queueOfficeCode = value;
    }

    /**
     * creationDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * creationDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * revenueCompany 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueCompany() {
        return revenueCompany;
    }

    /**
     * revenueCompany 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueCompany(String value) {
        this.revenueCompany = value;
    }

    /**
     * receivedAtGMT 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedAtGMT() {
        return receivedAtGMT;
    }

    /**
     * receivedAtGMT 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedAtGMT(XMLGregorianCalendar value) {
        this.receivedAtGMT = value;
    }

    /**
     * reasonTimeGMT 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReasonTimeGMT() {
        return reasonTimeGMT;
    }

    /**
     * reasonTimeGMT 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReasonTimeGMT(XMLGregorianCalendar value) {
        this.reasonTimeGMT = value;
    }

    /**
     * reason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * reason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * itemTag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTag() {
        return itemTag;
    }

    /**
     * itemTag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTag(String value) {
        this.itemTag = value;
    }

    /**
     * receivedAtLTC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedAtLTC() {
        return receivedAtLTC;
    }

    /**
     * receivedAtLTC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedAtLTC(XMLGregorianCalendar value) {
        this.receivedAtLTC = value;
    }

    /**
     * recievedTimeInAgencyLTC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecievedTimeInAgencyLTC() {
        return recievedTimeInAgencyLTC;
    }

    /**
     * recievedTimeInAgencyLTC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecievedTimeInAgencyLTC(XMLGregorianCalendar value) {
        this.recievedTimeInAgencyLTC = value;
    }

}
