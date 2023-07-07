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
 * <p>CCFeeDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CCFeeDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceInitiator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ServiceCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="CreditCardType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PointOfPurchase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ruleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="travelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paxType" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestType" minOccurs="0"/&gt;
 *         &lt;element name="OandDFeeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}OandDFeeDetailsType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="channelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="pnrAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="versionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FeeAmountDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeAmountDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="ItineraryDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentFeeDetailsResponse" minOccurs="0"/&gt;
 *         &lt;element name="PnrCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SSRCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCFeeDetails", propOrder = {
    "serviceInitiator",
    "currency",
    "amount",
    "serviceCurrency",
    "paymentDate",
    "creditCardType",
    "pointOfPurchase",
    "ruleId",
    "feeCode",
    "applicationType",
    "travelType",
    "paxType",
    "oandDFeeDetails",
    "channelCode",
    "additionDate",
    "pnrAction",
    "versionID",
    "feeAmountDetails",
    "itineraryDetails",
    "pnrCreationDate",
    "ssrCode"
})
public class CCFeeDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ServiceInitiator", required = true)
    protected String serviceInitiator;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "Amount")
    protected double amount;
    @XmlElement(name = "ServiceCurrency")
    protected String serviceCurrency;
    @XmlElement(name = "PaymentDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(name = "CreditCardType", required = true)
    protected String creditCardType;
    @XmlElement(name = "PointOfPurchase")
    protected String pointOfPurchase;
    protected Long ruleId;
    @XmlElement(name = "FeeCode")
    protected String feeCode;
    protected String applicationType;
    protected String travelType;
    @XmlSchemaType(name = "string")
    protected GuestType paxType;
    @XmlElement(name = "OandDFeeDetails", required = true)
    protected List<OandDFeeDetailsType> oandDFeeDetails;
    protected String channelCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar additionDate;
    protected String pnrAction;
    protected Integer versionID;
    @XmlElement(name = "FeeAmountDetails")
    protected FeeAmountDetailsType feeAmountDetails;
    @XmlElement(name = "ItineraryDetails")
    protected SegmentFeeDetailsResponse itineraryDetails;
    @XmlElement(name = "PnrCreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pnrCreationDate;
    @XmlElement(name = "SSRCode")
    protected List<String> ssrCode;

    /**
     * serviceInitiator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInitiator() {
        return serviceInitiator;
    }

    /**
     * serviceInitiator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInitiator(String value) {
        this.serviceInitiator = value;
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
     * amount 속성의 값을 가져옵니다.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * amount 속성의 값을 설정합니다.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * serviceCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCurrency() {
        return serviceCurrency;
    }

    /**
     * serviceCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCurrency(String value) {
        this.serviceCurrency = value;
    }

    /**
     * paymentDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * paymentDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * creditCardType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * creditCardType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
    }

    /**
     * pointOfPurchase 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfPurchase() {
        return pointOfPurchase;
    }

    /**
     * pointOfPurchase 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfPurchase(String value) {
        this.pointOfPurchase = value;
    }

    /**
     * ruleId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRuleId() {
        return ruleId;
    }

    /**
     * ruleId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRuleId(Long value) {
        this.ruleId = value;
    }

    /**
     * feeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCode() {
        return feeCode;
    }

    /**
     * feeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCode(String value) {
        this.feeCode = value;
    }

    /**
     * applicationType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * applicationType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationType(String value) {
        this.applicationType = value;
    }

    /**
     * travelType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelType() {
        return travelType;
    }

    /**
     * travelType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelType(String value) {
        this.travelType = value;
    }

    /**
     * paxType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GuestType }
     *     
     */
    public GuestType getPaxType() {
        return paxType;
    }

    /**
     * paxType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestType }
     *     
     */
    public void setPaxType(GuestType value) {
        this.paxType = value;
    }

    /**
     * Gets the value of the oandDFeeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oandDFeeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOandDFeeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OandDFeeDetailsType }
     * 
     * 
     */
    public List<OandDFeeDetailsType> getOandDFeeDetails() {
        if (oandDFeeDetails == null) {
            oandDFeeDetails = new ArrayList<OandDFeeDetailsType>();
        }
        return this.oandDFeeDetails;
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
     * additionDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdditionDate() {
        return additionDate;
    }

    /**
     * additionDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdditionDate(XMLGregorianCalendar value) {
        this.additionDate = value;
    }

    /**
     * pnrAction 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrAction() {
        return pnrAction;
    }

    /**
     * pnrAction 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrAction(String value) {
        this.pnrAction = value;
    }

    /**
     * versionID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersionID() {
        return versionID;
    }

    /**
     * versionID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersionID(Integer value) {
        this.versionID = value;
    }

    /**
     * feeAmountDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FeeAmountDetailsType }
     *     
     */
    public FeeAmountDetailsType getFeeAmountDetails() {
        return feeAmountDetails;
    }

    /**
     * feeAmountDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAmountDetailsType }
     *     
     */
    public void setFeeAmountDetails(FeeAmountDetailsType value) {
        this.feeAmountDetails = value;
    }

    /**
     * itineraryDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SegmentFeeDetailsResponse }
     *     
     */
    public SegmentFeeDetailsResponse getItineraryDetails() {
        return itineraryDetails;
    }

    /**
     * itineraryDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentFeeDetailsResponse }
     *     
     */
    public void setItineraryDetails(SegmentFeeDetailsResponse value) {
        this.itineraryDetails = value;
    }

    /**
     * pnrCreationDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPnrCreationDate() {
        return pnrCreationDate;
    }

    /**
     * pnrCreationDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPnrCreationDate(XMLGregorianCalendar value) {
        this.pnrCreationDate = value;
    }

    /**
     * Gets the value of the ssrCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSSRCode() {
        if (ssrCode == null) {
            ssrCode = new ArrayList<String>();
        }
        return this.ssrCode;
    }

}
