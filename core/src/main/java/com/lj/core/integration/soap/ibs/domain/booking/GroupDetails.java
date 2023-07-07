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
 * <p>GroupDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GroupDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GroupLeaderFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GroupLeaderLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GroupLeaderMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupQuoteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuoteCreationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuoteAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupDetails", propOrder = {
    "groupName",
    "groupLeaderFirstName",
    "groupLeaderLastName",
    "groupLeaderMiddleName",
    "groupQuoteNumber",
    "quoteCreationDate",
    "quoteAmount",
    "currency"
})
public class GroupDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "GroupName", required = true)
    protected String groupName;
    @XmlElement(name = "GroupLeaderFirstName", required = true)
    protected String groupLeaderFirstName;
    @XmlElement(name = "GroupLeaderLastName", required = true)
    protected String groupLeaderLastName;
    @XmlElement(name = "GroupLeaderMiddleName")
    protected String groupLeaderMiddleName;
    @XmlElement(name = "GroupQuoteNumber")
    protected String groupQuoteNumber;
    @XmlElement(name = "QuoteCreationDate")
    protected String quoteCreationDate;
    @XmlElement(name = "QuoteAmount")
    protected double quoteAmount;
    @XmlElement(name = "Currency")
    protected String currency;

    /**
     * groupName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * groupName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * groupLeaderFirstName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupLeaderFirstName() {
        return groupLeaderFirstName;
    }

    /**
     * groupLeaderFirstName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupLeaderFirstName(String value) {
        this.groupLeaderFirstName = value;
    }

    /**
     * groupLeaderLastName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupLeaderLastName() {
        return groupLeaderLastName;
    }

    /**
     * groupLeaderLastName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupLeaderLastName(String value) {
        this.groupLeaderLastName = value;
    }

    /**
     * groupLeaderMiddleName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupLeaderMiddleName() {
        return groupLeaderMiddleName;
    }

    /**
     * groupLeaderMiddleName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupLeaderMiddleName(String value) {
        this.groupLeaderMiddleName = value;
    }

    /**
     * groupQuoteNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupQuoteNumber() {
        return groupQuoteNumber;
    }

    /**
     * groupQuoteNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupQuoteNumber(String value) {
        this.groupQuoteNumber = value;
    }

    /**
     * quoteCreationDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteCreationDate() {
        return quoteCreationDate;
    }

    /**
     * quoteCreationDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteCreationDate(String value) {
        this.quoteCreationDate = value;
    }

    /**
     * quoteAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getQuoteAmount() {
        return quoteAmount;
    }

    /**
     * quoteAmount 속성의 값을 설정합니다.
     * 
     */
    public void setQuoteAmount(double value) {
        this.quoteAmount = value;
    }

    /**
     * currency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * currency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
