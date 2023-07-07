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
 * <p>ListGroupQuoteType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ListGroupQuoteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupQuoteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupQuoteStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastModfiedDateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaxTypeFare" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxTypeAmount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OfferOption" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DepositOption" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BalanceOption" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NTBAOption" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="UnreadCommentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FlightSegmentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightSegmentDetailsType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PaxCountDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxCountDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DepositAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}TotalAmountPaid" minOccurs="0"/&gt;
 *         &lt;element name="AgentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListGroupQuoteType", propOrder = {
    "groupQuoteNumber",
    "groupQuoteStatus",
    "lastModifiedDateAndTime",
    "lastModfiedDateTimeZone",
    "agencyCode",
    "groupName",
    "pnrNumber",
    "pnrStatus",
    "paxTypeFare",
    "totalAmount",
    "currency",
    "offerOption",
    "depositOption",
    "balanceOption",
    "ntbaOption",
    "unreadCommentIndicator",
    "flightSegmentDetails",
    "paxCountDetails",
    "depositAmount",
    "agentID"
})
public class ListGroupQuoteType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "GroupQuoteNumber")
    protected String groupQuoteNumber;
    @XmlElement(name = "GroupQuoteStatus")
    protected String groupQuoteStatus;
    @XmlElement(name = "LastModifiedDateAndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDateAndTime;
    @XmlElement(name = "LastModfiedDateTimeZone")
    protected String lastModfiedDateTimeZone;
    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(name = "PnrNumber")
    protected String pnrNumber;
    @XmlElement(name = "PnrStatus")
    protected String pnrStatus;
    @XmlElement(name = "PaxTypeFare")
    protected List<PaxTypeAmount> paxTypeFare;
    @XmlElement(name = "TotalAmount")
    protected Double totalAmount;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "OfferOption")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offerOption;
    @XmlElement(name = "DepositOption")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depositOption;
    @XmlElement(name = "BalanceOption")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar balanceOption;
    @XmlElement(name = "NTBAOption")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ntbaOption;
    @XmlElement(name = "UnreadCommentIndicator")
    protected Boolean unreadCommentIndicator;
    @XmlElement(name = "FlightSegmentDetails", required = true)
    protected List<FlightSegmentDetailsType> flightSegmentDetails;
    @XmlElement(name = "PaxCountDetails")
    protected List<PaxCountDetailsType> paxCountDetails;
    @XmlElement(name = "DepositAmount")
    protected TotalAmountPaid depositAmount;
    @XmlElement(name = "AgentID")
    protected String agentID;

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
     * groupQuoteStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupQuoteStatus() {
        return groupQuoteStatus;
    }

    /**
     * groupQuoteStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupQuoteStatus(String value) {
        this.groupQuoteStatus = value;
    }

    /**
     * lastModifiedDateAndTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDateAndTime() {
        return lastModifiedDateAndTime;
    }

    /**
     * lastModifiedDateAndTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDateAndTime(XMLGregorianCalendar value) {
        this.lastModifiedDateAndTime = value;
    }

    /**
     * lastModfiedDateTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModfiedDateTimeZone() {
        return lastModfiedDateTimeZone;
    }

    /**
     * lastModfiedDateTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModfiedDateTimeZone(String value) {
        this.lastModfiedDateTimeZone = value;
    }

    /**
     * agencyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * agencyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

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
     * pnrNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrNumber() {
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
    public void setPnrNumber(String value) {
        this.pnrNumber = value;
    }

    /**
     * pnrStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrStatus() {
        return pnrStatus;
    }

    /**
     * pnrStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrStatus(String value) {
        this.pnrStatus = value;
    }

    /**
     * Gets the value of the paxTypeFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxTypeFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxTypeFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxTypeAmount }
     * 
     * 
     */
    public List<PaxTypeAmount> getPaxTypeFare() {
        if (paxTypeFare == null) {
            paxTypeFare = new ArrayList<PaxTypeAmount>();
        }
        return this.paxTypeFare;
    }

    /**
     * totalAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * totalAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAmount(Double value) {
        this.totalAmount = value;
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
     * offerOption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOfferOption() {
        return offerOption;
    }

    /**
     * offerOption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOfferOption(XMLGregorianCalendar value) {
        this.offerOption = value;
    }

    /**
     * depositOption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepositOption() {
        return depositOption;
    }

    /**
     * depositOption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepositOption(XMLGregorianCalendar value) {
        this.depositOption = value;
    }

    /**
     * balanceOption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBalanceOption() {
        return balanceOption;
    }

    /**
     * balanceOption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBalanceOption(XMLGregorianCalendar value) {
        this.balanceOption = value;
    }

    /**
     * ntbaOption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNTBAOption() {
        return ntbaOption;
    }

    /**
     * ntbaOption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNTBAOption(XMLGregorianCalendar value) {
        this.ntbaOption = value;
    }

    /**
     * unreadCommentIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnreadCommentIndicator() {
        return unreadCommentIndicator;
    }

    /**
     * unreadCommentIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnreadCommentIndicator(Boolean value) {
        this.unreadCommentIndicator = value;
    }

    /**
     * Gets the value of the flightSegmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightSegmentDetailsType }
     * 
     * 
     */
    public List<FlightSegmentDetailsType> getFlightSegmentDetails() {
        if (flightSegmentDetails == null) {
            flightSegmentDetails = new ArrayList<FlightSegmentDetailsType>();
        }
        return this.flightSegmentDetails;
    }

    /**
     * Gets the value of the paxCountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxCountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxCountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxCountDetailsType }
     * 
     * 
     */
    public List<PaxCountDetailsType> getPaxCountDetails() {
        if (paxCountDetails == null) {
            paxCountDetails = new ArrayList<PaxCountDetailsType>();
        }
        return this.paxCountDetails;
    }

    /**
     * depositAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountPaid }
     *     
     */
    public TotalAmountPaid getDepositAmount() {
        return depositAmount;
    }

    /**
     * depositAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountPaid }
     *     
     */
    public void setDepositAmount(TotalAmountPaid value) {
        this.depositAmount = value;
    }

    /**
     * agentID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentID() {
        return agentID;
    }

    /**
     * agentID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentID(String value) {
        this.agentID = value;
    }

}
