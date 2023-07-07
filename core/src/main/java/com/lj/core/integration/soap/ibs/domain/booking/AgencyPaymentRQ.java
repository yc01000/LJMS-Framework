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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BookingChannel" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingChannelKeyType"/&gt;
 *         &lt;element name="NoOfEntries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalRemittanceAmtDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType" minOccurs="0"/&gt;
 *         &lt;element name="BatchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditChainCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Action" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyPaymentActionType"/&gt;
 *         &lt;element name="AgencyPaymentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyPaymentDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airlineCode",
    "bookingChannel",
    "noOfEntries",
    "totalRemittanceAmtDetails",
    "batchNumber",
    "creditChainCode",
    "action",
    "agencyPaymentDetails"
})
@XmlRootElement(name = "AgencyPaymentRQ")
public class AgencyPaymentRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "BookingChannel", required = true)
    protected BookingChannelKeyType bookingChannel;
    @XmlElement(name = "NoOfEntries")
    protected Integer noOfEntries;
    @XmlElement(name = "TotalRemittanceAmtDetails")
    protected CurrencyAmountType totalRemittanceAmtDetails;
    @XmlElement(name = "BatchNumber")
    protected String batchNumber;
    @XmlElement(name = "CreditChainCode")
    protected String creditChainCode;
    @XmlElement(name = "Action", required = true)
    @XmlSchemaType(name = "string")
    protected AgencyPaymentActionType action;
    @XmlElement(name = "AgencyPaymentDetails")
    protected List<AgencyPaymentDetailsType> agencyPaymentDetails;

    /**
     * airlineCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * airlineCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * bookingChannel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BookingChannelKeyType }
     *     
     */
    public BookingChannelKeyType getBookingChannel() {
        return bookingChannel;
    }

    /**
     * bookingChannel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingChannelKeyType }
     *     
     */
    public void setBookingChannel(BookingChannelKeyType value) {
        this.bookingChannel = value;
    }

    /**
     * noOfEntries 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfEntries() {
        return noOfEntries;
    }

    /**
     * noOfEntries 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfEntries(Integer value) {
        this.noOfEntries = value;
    }

    /**
     * totalRemittanceAmtDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getTotalRemittanceAmtDetails() {
        return totalRemittanceAmtDetails;
    }

    /**
     * totalRemittanceAmtDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setTotalRemittanceAmtDetails(CurrencyAmountType value) {
        this.totalRemittanceAmtDetails = value;
    }

    /**
     * batchNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * batchNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNumber(String value) {
        this.batchNumber = value;
    }

    /**
     * creditChainCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditChainCode() {
        return creditChainCode;
    }

    /**
     * creditChainCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditChainCode(String value) {
        this.creditChainCode = value;
    }

    /**
     * action 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AgencyPaymentActionType }
     *     
     */
    public AgencyPaymentActionType getAction() {
        return action;
    }

    /**
     * action 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyPaymentActionType }
     *     
     */
    public void setAction(AgencyPaymentActionType value) {
        this.action = value;
    }

    /**
     * Gets the value of the agencyPaymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agencyPaymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgencyPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgencyPaymentDetailsType }
     * 
     * 
     */
    public List<AgencyPaymentDetailsType> getAgencyPaymentDetails() {
        if (agencyPaymentDetails == null) {
            agencyPaymentDetails = new ArrayList<AgencyPaymentDetailsType>();
        }
        return this.agencyPaymentDetails;
    }

}
