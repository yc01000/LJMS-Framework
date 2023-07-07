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
 * <p>PnrSummary complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PnrSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlightSegmentSummaryDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightSegmentSummaryDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PnrGuestSummaryDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrGuestSummaryDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PnrCreationTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PnrStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AmountPaid" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrPayment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmountToBePaid" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrPayment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TimeLimitDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TimeLimitDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creationTimeInAgentsTimeZone" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedDateAndTimeInAgentTimeZone" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrSummary", propOrder = {
    "pnrNumber",
    "flightSegmentSummaryDetails",
    "pnrGuestSummaryDetails",
    "pnrCreationTime",
    "pnrStatus",
    "amountPaid",
    "totalAmountToBePaid",
    "timeLimitDetails",
    "paymentStatus",
    "pnrType",
    "creationTimeInAgentsTimeZone",
    "lastModifiedDateAndTimeInAgentTimeZone",
    "groupName",
    "groupType"
})
public class PnrSummary
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PnrNumber", required = true)
    protected String pnrNumber;
    @XmlElement(name = "FlightSegmentSummaryDetails")
    protected List<FlightSegmentSummaryDetails> flightSegmentSummaryDetails;
    @XmlElement(name = "PnrGuestSummaryDetails", required = true)
    protected List<PnrGuestSummaryDetails> pnrGuestSummaryDetails;
    @XmlElement(name = "PnrCreationTime", required = true)
    protected String pnrCreationTime;
    @XmlElement(name = "PnrStatus", required = true)
    protected String pnrStatus;
    @XmlElement(name = "AmountPaid")
    protected List<PnrPayment> amountPaid;
    @XmlElement(name = "TotalAmountToBePaid")
    protected List<PnrPayment> totalAmountToBePaid;
    @XmlElement(name = "TimeLimitDetails")
    protected List<TimeLimitDetailsType> timeLimitDetails;
    @XmlElement(name = "PaymentStatus")
    protected String paymentStatus;
    @XmlElement(name = "PnrType")
    protected String pnrType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTimeInAgentsTimeZone;
    @XmlElement(name = "LastModifiedDateAndTimeInAgentTimeZone", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDateAndTimeInAgentTimeZone;
    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(name = "GroupType")
    protected String groupType;

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
     * Gets the value of the flightSegmentSummaryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegmentSummaryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentSummaryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightSegmentSummaryDetails }
     * 
     * 
     */
    public List<FlightSegmentSummaryDetails> getFlightSegmentSummaryDetails() {
        if (flightSegmentSummaryDetails == null) {
            flightSegmentSummaryDetails = new ArrayList<FlightSegmentSummaryDetails>();
        }
        return this.flightSegmentSummaryDetails;
    }

    /**
     * Gets the value of the pnrGuestSummaryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrGuestSummaryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrGuestSummaryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrGuestSummaryDetails }
     * 
     * 
     */
    public List<PnrGuestSummaryDetails> getPnrGuestSummaryDetails() {
        if (pnrGuestSummaryDetails == null) {
            pnrGuestSummaryDetails = new ArrayList<PnrGuestSummaryDetails>();
        }
        return this.pnrGuestSummaryDetails;
    }

    /**
     * pnrCreationTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrCreationTime() {
        return pnrCreationTime;
    }

    /**
     * pnrCreationTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrCreationTime(String value) {
        this.pnrCreationTime = value;
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
     * Gets the value of the amountPaid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountPaid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountPaid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrPayment }
     * 
     * 
     */
    public List<PnrPayment> getAmountPaid() {
        if (amountPaid == null) {
            amountPaid = new ArrayList<PnrPayment>();
        }
        return this.amountPaid;
    }

    /**
     * Gets the value of the totalAmountToBePaid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalAmountToBePaid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalAmountToBePaid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrPayment }
     * 
     * 
     */
    public List<PnrPayment> getTotalAmountToBePaid() {
        if (totalAmountToBePaid == null) {
            totalAmountToBePaid = new ArrayList<PnrPayment>();
        }
        return this.totalAmountToBePaid;
    }

    /**
     * Gets the value of the timeLimitDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeLimitDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeLimitDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeLimitDetailsType }
     * 
     * 
     */
    public List<TimeLimitDetailsType> getTimeLimitDetails() {
        if (timeLimitDetails == null) {
            timeLimitDetails = new ArrayList<TimeLimitDetailsType>();
        }
        return this.timeLimitDetails;
    }

    /**
     * paymentStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * paymentStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

    /**
     * pnrType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrType() {
        return pnrType;
    }

    /**
     * pnrType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrType(String value) {
        this.pnrType = value;
    }

    /**
     * creationTimeInAgentsTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTimeInAgentsTimeZone() {
        return creationTimeInAgentsTimeZone;
    }

    /**
     * creationTimeInAgentsTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTimeInAgentsTimeZone(XMLGregorianCalendar value) {
        this.creationTimeInAgentsTimeZone = value;
    }

    /**
     * lastModifiedDateAndTimeInAgentTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDateAndTimeInAgentTimeZone() {
        return lastModifiedDateAndTimeInAgentTimeZone;
    }

    /**
     * lastModifiedDateAndTimeInAgentTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDateAndTimeInAgentTimeZone(XMLGregorianCalendar value) {
        this.lastModifiedDateAndTimeInAgentTimeZone = value;
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
     * groupType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * groupType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

}
