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
 * <p>CreditFileType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CreditFileType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreditFileTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceInitiator" type="{http://www.ibsplc.com/iRes/simpleTypes/}ServiceInitiatorType" minOccurs="0"/&gt;
 *         &lt;element name="CreditRecordNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="TransactionAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AirlineComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeneralComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfileReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SharedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BlackOutDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateRangeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BalanceAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ConvertToCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConvertedAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditFileType", propOrder = {
    "creditFileTypeCode",
    "serviceInitiator",
    "creditRecordNumber",
    "expiryDate",
    "transactionAmount",
    "currency",
    "airlineComments",
    "generalComments",
    "owner",
    "profileReference",
    "sharedIndicator",
    "blackOutDate",
    "trackingNumber",
    "balanceAmount",
    "convertToCurrency",
    "convertedAmount"
})
public class CreditFileType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "CreditFileTypeCode", required = true)
    protected String creditFileTypeCode;
    @XmlElement(name = "ServiceInitiator")
    @XmlSchemaType(name = "string")
    protected ServiceInitiatorType serviceInitiator;
    @XmlElement(name = "CreditRecordNumber", required = true)
    protected String creditRecordNumber;
    @XmlElement(name = "ExpiryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "TransactionAmount")
    protected double transactionAmount;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "AirlineComments")
    protected String airlineComments;
    @XmlElement(name = "GeneralComments")
    protected String generalComments;
    @XmlElement(name = "Owner")
    protected String owner;
    @XmlElement(name = "ProfileReference")
    protected String profileReference;
    @XmlElement(name = "SharedIndicator")
    protected String sharedIndicator;
    @XmlElement(name = "BlackOutDate")
    protected List<DateRangeType> blackOutDate;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "BalanceAmount")
    protected double balanceAmount;
    @XmlElement(name = "ConvertToCurrency")
    protected String convertToCurrency;
    @XmlElement(name = "ConvertedAmount")
    protected double convertedAmount;

    /**
     * creditFileTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditFileTypeCode() {
        return creditFileTypeCode;
    }

    /**
     * creditFileTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditFileTypeCode(String value) {
        this.creditFileTypeCode = value;
    }

    /**
     * serviceInitiator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInitiatorType }
     *     
     */
    public ServiceInitiatorType getServiceInitiator() {
        return serviceInitiator;
    }

    /**
     * serviceInitiator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInitiatorType }
     *     
     */
    public void setServiceInitiator(ServiceInitiatorType value) {
        this.serviceInitiator = value;
    }

    /**
     * creditRecordNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditRecordNumber() {
        return creditRecordNumber;
    }

    /**
     * creditRecordNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditRecordNumber(String value) {
        this.creditRecordNumber = value;
    }

    /**
     * expiryDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * expiryDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * transactionAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * transactionAmount 속성의 값을 설정합니다.
     * 
     */
    public void setTransactionAmount(double value) {
        this.transactionAmount = value;
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

    /**
     * airlineComments 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineComments() {
        return airlineComments;
    }

    /**
     * airlineComments 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineComments(String value) {
        this.airlineComments = value;
    }

    /**
     * generalComments 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralComments() {
        return generalComments;
    }

    /**
     * generalComments 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralComments(String value) {
        this.generalComments = value;
    }

    /**
     * owner 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * owner 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * profileReference 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileReference() {
        return profileReference;
    }

    /**
     * profileReference 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileReference(String value) {
        this.profileReference = value;
    }

    /**
     * sharedIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedIndicator() {
        return sharedIndicator;
    }

    /**
     * sharedIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedIndicator(String value) {
        this.sharedIndicator = value;
    }

    /**
     * Gets the value of the blackOutDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blackOutDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlackOutDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateRangeType }
     * 
     * 
     */
    public List<DateRangeType> getBlackOutDate() {
        if (blackOutDate == null) {
            blackOutDate = new ArrayList<DateRangeType>();
        }
        return this.blackOutDate;
    }

    /**
     * trackingNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * trackingNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * balanceAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * balanceAmount 속성의 값을 설정합니다.
     * 
     */
    public void setBalanceAmount(double value) {
        this.balanceAmount = value;
    }

    /**
     * convertToCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvertToCurrency() {
        return convertToCurrency;
    }

    /**
     * convertToCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvertToCurrency(String value) {
        this.convertToCurrency = value;
    }

    /**
     * convertedAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getConvertedAmount() {
        return convertedAmount;
    }

    /**
     * convertedAmount 속성의 값을 설정합니다.
     * 
     */
    public void setConvertedAmount(double value) {
        this.convertedAmount = value;
    }

}
