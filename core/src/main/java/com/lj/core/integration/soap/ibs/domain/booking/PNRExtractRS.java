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
 *         &lt;element name="PNROriginator" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNROriginator" minOccurs="0"/&gt;
 *         &lt;element name="PNRDestination" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRDestination" minOccurs="0"/&gt;
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreationDateAndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RevenueCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalCaller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentCaller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PNRType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PNRStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnrDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrDetails" minOccurs="0"/&gt;
 *         &lt;element name="TotalFareDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TotalFareDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalFeeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TotalFeeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalTaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TotalTaxDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalSurchargeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TotalSurchargeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalPaymentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TotalPaymentDetails" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfAdults" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumberOfChildren" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AmountPaid" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalAmountToBePaid" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="itineraryTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="itineraryCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LoggedInUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareRulesDescription" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareRulesDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IncrementalItineraryDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}IncrementalItineraryDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GroupDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GroupDetails" minOccurs="0"/&gt;
 *         &lt;element name="AgencyDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyDetails" minOccurs="0"/&gt;
 *         &lt;element name="AmountToBePaidCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TourOperatorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
 *         &lt;element name="EncodedAmountToBeShown" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrPaymentEncoded" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TransactionalPnrDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TransactionalPnrDetails" minOccurs="0"/&gt;
 *         &lt;element name="RichContentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}RichContentInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExternalRecordLocatorDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ExternalRecordLocatorDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "pnrOriginator",
    "pnrDestination",
    "pnrNumber",
    "creationDateAndTime",
    "revenueCompany",
    "originalCaller",
    "currentCaller",
    "pnrType",
    "pnrStatus",
    "pnrDetails",
    "totalFareDetails",
    "totalFeeDetails",
    "totalTaxDetails",
    "totalSurchargeDetails",
    "totalPaymentDetails",
    "numberOfAdults",
    "numberOfChildren",
    "amountPaid",
    "totalAmountToBePaid",
    "itineraryTotal",
    "itineraryCurrency",
    "currency",
    "lastModifiedDate",
    "lastModifiedBy",
    "channelCode",
    "channelName",
    "loggedInUser",
    "fareRulesDescription",
    "incrementalItineraryDetails",
    "groupDetails",
    "agencyDetails",
    "amountToBePaidCurrency",
    "tourOperatorNumber",
    "errorType",
    "encodedAmountToBeShown",
    "transactionalPnrDetails",
    "richContentInfo",
    "externalRecordLocatorDetails"
})
@XmlRootElement(name = "PNRExtractRS")
public class PNRExtractRS
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PNROriginator")
    protected PNROriginator pnrOriginator;
    @XmlElement(name = "PNRDestination")
    protected PNRDestination pnrDestination;
    @XmlElement(name = "PnrNumber")
    protected String pnrNumber;
    @XmlElement(name = "CreationDateAndTime")
    protected String creationDateAndTime;
    @XmlElement(name = "RevenueCompany")
    protected String revenueCompany;
    @XmlElement(name = "OriginalCaller")
    protected String originalCaller;
    @XmlElement(name = "CurrentCaller")
    protected String currentCaller;
    @XmlElement(name = "PNRType")
    protected String pnrType;
    @XmlElement(name = "PNRStatus")
    protected String pnrStatus;
    @XmlElement(name = "PnrDetails")
    protected PnrDetails pnrDetails;
    @XmlElement(name = "TotalFareDetails")
    protected List<TotalFareDetails> totalFareDetails;
    @XmlElement(name = "TotalFeeDetails")
    protected List<TotalFeeDetails> totalFeeDetails;
    @XmlElement(name = "TotalTaxDetails")
    protected List<TotalTaxDetails> totalTaxDetails;
    @XmlElement(name = "TotalSurchargeDetails")
    protected List<TotalSurchargeDetails> totalSurchargeDetails;
    @XmlElement(name = "TotalPaymentDetails")
    protected TotalPaymentDetails totalPaymentDetails;
    @XmlElement(name = "NumberOfAdults")
    protected int numberOfAdults;
    @XmlElement(name = "NumberOfChildren")
    protected int numberOfChildren;
    @XmlElement(name = "AmountPaid")
    protected double amountPaid;
    @XmlElement(name = "TotalAmountToBePaid")
    protected double totalAmountToBePaid;
    protected double itineraryTotal;
    protected String itineraryCurrency;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "LastModifiedDate")
    protected String lastModifiedDate;
    @XmlElement(name = "LastModifiedBy")
    protected String lastModifiedBy;
    @XmlElement(name = "ChannelCode")
    protected String channelCode;
    @XmlElement(name = "ChannelName")
    protected String channelName;
    @XmlElement(name = "LoggedInUser")
    protected String loggedInUser;
    @XmlElement(name = "FareRulesDescription")
    protected List<FareRulesDescription> fareRulesDescription;
    @XmlElement(name = "IncrementalItineraryDetails")
    protected List<IncrementalItineraryDetails> incrementalItineraryDetails;
    @XmlElement(name = "GroupDetails")
    protected GroupDetails groupDetails;
    @XmlElement(name = "AgencyDetails")
    protected AgencyDetails agencyDetails;
    @XmlElement(name = "AmountToBePaidCurrency")
    protected String amountToBePaidCurrency;
    @XmlElement(name = "TourOperatorNumber")
    protected String tourOperatorNumber;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;
    @XmlElement(name = "EncodedAmountToBeShown")
    protected List<PnrPaymentEncoded> encodedAmountToBeShown;
    @XmlElement(name = "TransactionalPnrDetails")
    protected TransactionalPnrDetails transactionalPnrDetails;
    @XmlElement(name = "RichContentInfo")
    protected List<RichContentInfoType> richContentInfo;
    @XmlElement(name = "ExternalRecordLocatorDetails")
    protected List<ExternalRecordLocatorDetailsType> externalRecordLocatorDetails;

    /**
     * pnrOriginator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PNROriginator }
     *     
     */
    public PNROriginator getPNROriginator() {
        return pnrOriginator;
    }

    /**
     * pnrOriginator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PNROriginator }
     *     
     */
    public void setPNROriginator(PNROriginator value) {
        this.pnrOriginator = value;
    }

    /**
     * pnrDestination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PNRDestination }
     *     
     */
    public PNRDestination getPNRDestination() {
        return pnrDestination;
    }

    /**
     * pnrDestination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRDestination }
     *     
     */
    public void setPNRDestination(PNRDestination value) {
        this.pnrDestination = value;
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
     * creationDateAndTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDateAndTime() {
        return creationDateAndTime;
    }

    /**
     * creationDateAndTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateAndTime(String value) {
        this.creationDateAndTime = value;
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
     * originalCaller 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalCaller() {
        return originalCaller;
    }

    /**
     * originalCaller 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalCaller(String value) {
        this.originalCaller = value;
    }

    /**
     * currentCaller 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentCaller() {
        return currentCaller;
    }

    /**
     * currentCaller 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentCaller(String value) {
        this.currentCaller = value;
    }

    /**
     * pnrType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRType() {
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
    public void setPNRType(String value) {
        this.pnrType = value;
    }

    /**
     * pnrStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRStatus() {
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
    public void setPNRStatus(String value) {
        this.pnrStatus = value;
    }

    /**
     * pnrDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PnrDetails }
     *     
     */
    public PnrDetails getPnrDetails() {
        return pnrDetails;
    }

    /**
     * pnrDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PnrDetails }
     *     
     */
    public void setPnrDetails(PnrDetails value) {
        this.pnrDetails = value;
    }

    /**
     * Gets the value of the totalFareDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalFareDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalFareDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalFareDetails }
     * 
     * 
     */
    public List<TotalFareDetails> getTotalFareDetails() {
        if (totalFareDetails == null) {
            totalFareDetails = new ArrayList<TotalFareDetails>();
        }
        return this.totalFareDetails;
    }

    /**
     * Gets the value of the totalFeeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalFeeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalFeeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalFeeDetails }
     * 
     * 
     */
    public List<TotalFeeDetails> getTotalFeeDetails() {
        if (totalFeeDetails == null) {
            totalFeeDetails = new ArrayList<TotalFeeDetails>();
        }
        return this.totalFeeDetails;
    }

    /**
     * Gets the value of the totalTaxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalTaxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalTaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalTaxDetails }
     * 
     * 
     */
    public List<TotalTaxDetails> getTotalTaxDetails() {
        if (totalTaxDetails == null) {
            totalTaxDetails = new ArrayList<TotalTaxDetails>();
        }
        return this.totalTaxDetails;
    }

    /**
     * Gets the value of the totalSurchargeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalSurchargeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalSurchargeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalSurchargeDetails }
     * 
     * 
     */
    public List<TotalSurchargeDetails> getTotalSurchargeDetails() {
        if (totalSurchargeDetails == null) {
            totalSurchargeDetails = new ArrayList<TotalSurchargeDetails>();
        }
        return this.totalSurchargeDetails;
    }

    /**
     * totalPaymentDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TotalPaymentDetails }
     *     
     */
    public TotalPaymentDetails getTotalPaymentDetails() {
        return totalPaymentDetails;
    }

    /**
     * totalPaymentDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPaymentDetails }
     *     
     */
    public void setTotalPaymentDetails(TotalPaymentDetails value) {
        this.totalPaymentDetails = value;
    }

    /**
     * numberOfAdults 속성의 값을 가져옵니다.
     * 
     */
    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    /**
     * numberOfAdults 속성의 값을 설정합니다.
     * 
     */
    public void setNumberOfAdults(int value) {
        this.numberOfAdults = value;
    }

    /**
     * numberOfChildren 속성의 값을 가져옵니다.
     * 
     */
    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    /**
     * numberOfChildren 속성의 값을 설정합니다.
     * 
     */
    public void setNumberOfChildren(int value) {
        this.numberOfChildren = value;
    }

    /**
     * amountPaid 속성의 값을 가져옵니다.
     * 
     */
    public double getAmountPaid() {
        return amountPaid;
    }

    /**
     * amountPaid 속성의 값을 설정합니다.
     * 
     */
    public void setAmountPaid(double value) {
        this.amountPaid = value;
    }

    /**
     * totalAmountToBePaid 속성의 값을 가져옵니다.
     * 
     */
    public double getTotalAmountToBePaid() {
        return totalAmountToBePaid;
    }

    /**
     * totalAmountToBePaid 속성의 값을 설정합니다.
     * 
     */
    public void setTotalAmountToBePaid(double value) {
        this.totalAmountToBePaid = value;
    }

    /**
     * itineraryTotal 속성의 값을 가져옵니다.
     * 
     */
    public double getItineraryTotal() {
        return itineraryTotal;
    }

    /**
     * itineraryTotal 속성의 값을 설정합니다.
     * 
     */
    public void setItineraryTotal(double value) {
        this.itineraryTotal = value;
    }

    /**
     * itineraryCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItineraryCurrency() {
        return itineraryCurrency;
    }

    /**
     * itineraryCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItineraryCurrency(String value) {
        this.itineraryCurrency = value;
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
     * lastModifiedDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * lastModifiedDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedDate(String value) {
        this.lastModifiedDate = value;
    }

    /**
     * lastModifiedBy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * lastModifiedBy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedBy(String value) {
        this.lastModifiedBy = value;
    }

    /**
     * channelCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * channelCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
    }

    /**
     * channelName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * channelName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelName(String value) {
        this.channelName = value;
    }

    /**
     * loggedInUser 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedInUser() {
        return loggedInUser;
    }

    /**
     * loggedInUser 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedInUser(String value) {
        this.loggedInUser = value;
    }

    /**
     * Gets the value of the fareRulesDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRulesDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRulesDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRulesDescription }
     * 
     * 
     */
    public List<FareRulesDescription> getFareRulesDescription() {
        if (fareRulesDescription == null) {
            fareRulesDescription = new ArrayList<FareRulesDescription>();
        }
        return this.fareRulesDescription;
    }

    /**
     * Gets the value of the incrementalItineraryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incrementalItineraryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncrementalItineraryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncrementalItineraryDetails }
     * 
     * 
     */
    public List<IncrementalItineraryDetails> getIncrementalItineraryDetails() {
        if (incrementalItineraryDetails == null) {
            incrementalItineraryDetails = new ArrayList<IncrementalItineraryDetails>();
        }
        return this.incrementalItineraryDetails;
    }

    /**
     * groupDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GroupDetails }
     *     
     */
    public GroupDetails getGroupDetails() {
        return groupDetails;
    }

    /**
     * groupDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupDetails }
     *     
     */
    public void setGroupDetails(GroupDetails value) {
        this.groupDetails = value;
    }

    /**
     * agencyDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AgencyDetails }
     *     
     */
    public AgencyDetails getAgencyDetails() {
        return agencyDetails;
    }

    /**
     * agencyDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyDetails }
     *     
     */
    public void setAgencyDetails(AgencyDetails value) {
        this.agencyDetails = value;
    }

    /**
     * amountToBePaidCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountToBePaidCurrency() {
        return amountToBePaidCurrency;
    }

    /**
     * amountToBePaidCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountToBePaidCurrency(String value) {
        this.amountToBePaidCurrency = value;
    }

    /**
     * tourOperatorNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorNumber() {
        return tourOperatorNumber;
    }

    /**
     * tourOperatorNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorNumber(String value) {
        this.tourOperatorNumber = value;
    }

    /**
     * errorType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getErrorType() {
        return errorType;
    }

    /**
     * errorType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setErrorType(ErrorType value) {
        this.errorType = value;
    }

    /**
     * Gets the value of the encodedAmountToBeShown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encodedAmountToBeShown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncodedAmountToBeShown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrPaymentEncoded }
     * 
     * 
     */
    public List<PnrPaymentEncoded> getEncodedAmountToBeShown() {
        if (encodedAmountToBeShown == null) {
            encodedAmountToBeShown = new ArrayList<PnrPaymentEncoded>();
        }
        return this.encodedAmountToBeShown;
    }

    /**
     * transactionalPnrDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TransactionalPnrDetails }
     *     
     */
    public TransactionalPnrDetails getTransactionalPnrDetails() {
        return transactionalPnrDetails;
    }

    /**
     * transactionalPnrDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionalPnrDetails }
     *     
     */
    public void setTransactionalPnrDetails(TransactionalPnrDetails value) {
        this.transactionalPnrDetails = value;
    }

    /**
     * Gets the value of the richContentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the richContentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRichContentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RichContentInfoType }
     * 
     * 
     */
    public List<RichContentInfoType> getRichContentInfo() {
        if (richContentInfo == null) {
            richContentInfo = new ArrayList<RichContentInfoType>();
        }
        return this.richContentInfo;
    }

    /**
     * Gets the value of the externalRecordLocatorDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalRecordLocatorDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalRecordLocatorDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalRecordLocatorDetailsType }
     * 
     * 
     */
    public List<ExternalRecordLocatorDetailsType> getExternalRecordLocatorDetails() {
        if (externalRecordLocatorDetails == null) {
            externalRecordLocatorDetails = new ArrayList<ExternalRecordLocatorDetailsType>();
        }
        return this.externalRecordLocatorDetails;
    }

}
