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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ModifyBookingRS complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ModifyBookingRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ibsplc.com/iRes/simpleTypes/}BasePnrRSType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreationDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreationDateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastModfiedDateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalCaller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaxCountType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxCountDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Itinerary" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItineraryDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ItinPrice" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItinPriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GuestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestReponseDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SSRDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SSRInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaxBaggageAllowance" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxBaggageAllowanceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AuxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SeatAssignmentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatAssignmentDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TravelDocuments" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelDocumentsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GroupPaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GroupPaxDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="PnrContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrContactType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PnrComments" type="{http://www.ibsplc.com/iRes/simpleTypes/}CommentDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GuestLoyaltyInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestLoyaltyInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GuestPaymentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestPaymentInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeeInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EMDInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}EmdInformationDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PromoCodeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PromoCodeDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="IsContinueWithSsr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsContinueWithoutSsr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PnrSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPnrUnpaid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalBookingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pnrOnHoldIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DiscountCouponDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxDiscountCouponDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExternalRecordLocatorDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ExternalRecordLocatorDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FarePaidStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}FarePaidStatusDetails_Type" minOccurs="0"/&gt;
 *         &lt;element name="AmountPaid" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountPaidType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EncodedAmountToBeShown" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrPaymentEncodedType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmountDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TotalAmountDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmountToBePaid" type="{http://www.ibsplc.com/iRes/simpleTypes/}TotalAmountToBePaidDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="PointOfOriginCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PointOfOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PricingModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isBookingConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PointOfSale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MsgForSeatAutoFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalNonRefundableAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}TotalNonRefAmount" minOccurs="0"/&gt;
 *         &lt;element name="TimeLimitDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRTimeLimitDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmountPaid" type="{http://www.ibsplc.com/iRes/simpleTypes/}TotalAmountPaid" minOccurs="0"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAuthorisationResponse" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaymentAuthorisationResponseType" minOccurs="0"/&gt;
 *         &lt;element name="RichContentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}RichContentInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomFieldList" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomNameValueListType" minOccurs="0"/&gt;
 *         &lt;element name="Warnings" type="{http://www.ibsplc.com/iRes/simpleTypes/}WarningType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyBookingRS", propOrder = {
    "pnrNumber",
    "creationDateAndTime",
    "creationDateTimeZone",
    "lastModifiedDateAndTime",
    "lastModfiedDateTimeZone",
    "originalCaller",
    "pnrStatus",
    "paxCountType",
    "itinerary",
    "itinPrice",
    "guestDetails",
    "ssrDetails",
    "paxBaggageAllowance",
    "auxDetails",
    "seatAssignmentDetails",
    "travelDocuments",
    "groupPaxDetails",
    "pnrContact",
    "pnrComments",
    "guestLoyaltyInfo",
    "guestPaymentInfo",
    "feeInformation",
    "emdInformation",
    "promoCodeDetails",
    "isContinueWithSsr",
    "isContinueWithoutSsr",
    "pnrSessionId",
    "isPnrUnpaid",
    "tourCode",
    "externalBookingNumber",
    "pnrOnHoldIndicator",
    "discountCouponDetails",
    "externalRecordLocatorDetails",
    "farePaidStatus",
    "amountPaid",
    "encodedAmountToBeShown",
    "totalAmountDetails",
    "totalAmountToBePaid",
    "pointOfOriginCurrency",
    "pointOfOrigin",
    "pricingModel",
    "isBookingConfirmation",
    "pointOfSale",
    "msgForSeatAutoFee",
    "totalNonRefundableAmount",
    "timeLimitDetails",
    "totalAmountPaid",
    "errorType",
    "paymentAuthorisationResponse",
    "richContentInfo",
    "customFieldList",
    "warnings"
})
@XmlSeeAlso({
    RetrieveTimelimitForModifyRS.class,
    SaveModifyBookingRS.class
})
public class ModifyBookingRS
    extends BasePnrRSType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PnrNumber")
    protected String pnrNumber;
    @XmlElement(name = "CreationDateAndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateAndTime;
    @XmlElement(name = "CreationDateTimeZone")
    protected String creationDateTimeZone;
    @XmlElement(name = "LastModifiedDateAndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDateAndTime;
    @XmlElement(name = "LastModfiedDateTimeZone")
    protected String lastModfiedDateTimeZone;
    @XmlElement(name = "OriginalCaller")
    protected String originalCaller;
    @XmlElement(name = "PnrStatus")
    protected String pnrStatus;
    @XmlElement(name = "PaxCountType")
    protected List<PaxCountDetailsType> paxCountType;
    @XmlElement(name = "Itinerary")
    protected List<ItineraryDetailsType> itinerary;
    @XmlElement(name = "ItinPrice")
    protected List<ItinPriceType> itinPrice;
    @XmlElement(name = "GuestDetails")
    protected List<GuestReponseDetailsType> guestDetails;
    @XmlElement(name = "SSRDetails")
    protected List<SSRInformationType> ssrDetails;
    @XmlElement(name = "PaxBaggageAllowance")
    protected List<PaxBaggageAllowanceType> paxBaggageAllowance;
    @XmlElement(name = "AuxDetails")
    protected List<AuxInformationType> auxDetails;
    @XmlElement(name = "SeatAssignmentDetails")
    protected List<SeatAssignmentDetailsType> seatAssignmentDetails;
    @XmlElement(name = "TravelDocuments")
    protected List<TravelDocumentsType> travelDocuments;
    @XmlElement(name = "GroupPaxDetails")
    protected GroupPaxDetailsType groupPaxDetails;
    @XmlElement(name = "PnrContact")
    protected List<PnrContactType> pnrContact;
    @XmlElement(name = "PnrComments")
    protected List<CommentDetailsType> pnrComments;
    @XmlElement(name = "GuestLoyaltyInfo")
    protected List<GuestLoyaltyInfoType> guestLoyaltyInfo;
    @XmlElement(name = "GuestPaymentInfo")
    protected List<GuestPaymentInfoType> guestPaymentInfo;
    @XmlElement(name = "FeeInformation")
    protected List<FeeInformationType> feeInformation;
    @XmlElement(name = "EMDInformation")
    protected List<EmdInformationDetailsType> emdInformation;
    @XmlElement(name = "PromoCodeDetails")
    protected PromoCodeDetailsType promoCodeDetails;
    @XmlElement(name = "IsContinueWithSsr")
    protected Boolean isContinueWithSsr;
    @XmlElement(name = "IsContinueWithoutSsr")
    protected Boolean isContinueWithoutSsr;
    @XmlElement(name = "PnrSessionId")
    protected String pnrSessionId;
    protected Boolean isPnrUnpaid;
    @XmlElement(name = "TourCode")
    protected String tourCode;
    @XmlElement(name = "ExternalBookingNumber")
    protected String externalBookingNumber;
    protected Boolean pnrOnHoldIndicator;
    @XmlElement(name = "DiscountCouponDetails")
    protected List<PaxDiscountCouponDetailsType> discountCouponDetails;
    @XmlElement(name = "ExternalRecordLocatorDetails")
    protected List<ExternalRecordLocatorDetailsType> externalRecordLocatorDetails;
    @XmlElement(name = "FarePaidStatus")
    @XmlSchemaType(name = "string")
    protected FarePaidStatusDetailsType farePaidStatus;
    @XmlElement(name = "AmountPaid")
    protected List<AmountPaidType> amountPaid;
    @XmlElement(name = "EncodedAmountToBeShown")
    protected List<PnrPaymentEncodedType> encodedAmountToBeShown;
    @XmlElement(name = "TotalAmountDetails")
    protected TotalAmountDetailsType totalAmountDetails;
    @XmlElement(name = "TotalAmountToBePaid")
    protected TotalAmountToBePaidDetailsType totalAmountToBePaid;
    @XmlElement(name = "PointOfOriginCurrency")
    protected String pointOfOriginCurrency;
    @XmlElement(name = "PointOfOrigin")
    protected String pointOfOrigin;
    @XmlElement(name = "PricingModel")
    protected String pricingModel;
    protected Boolean isBookingConfirmation;
    @XmlElement(name = "PointOfSale")
    protected String pointOfSale;
    @XmlElement(name = "MsgForSeatAutoFee")
    protected String msgForSeatAutoFee;
    @XmlElement(name = "TotalNonRefundableAmount")
    protected TotalNonRefAmount totalNonRefundableAmount;
    @XmlElement(name = "TimeLimitDetails")
    protected List<PNRTimeLimitDetailsType> timeLimitDetails;
    @XmlElement(name = "TotalAmountPaid")
    protected TotalAmountPaid totalAmountPaid;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;
    @XmlElement(name = "PaymentAuthorisationResponse")
    protected PaymentAuthorisationResponseType paymentAuthorisationResponse;
    @XmlElement(name = "RichContentInfo")
    protected List<RichContentInfoType> richContentInfo;
    @XmlElement(name = "CustomFieldList")
    protected CustomNameValueListType customFieldList;
    @XmlElement(name = "Warnings")
    protected List<WarningType> warnings;

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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateAndTime() {
        return creationDateAndTime;
    }

    /**
     * creationDateAndTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateAndTime(XMLGregorianCalendar value) {
        this.creationDateAndTime = value;
    }

    /**
     * creationDateTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDateTimeZone() {
        return creationDateTimeZone;
    }

    /**
     * creationDateTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateTimeZone(String value) {
        this.creationDateTimeZone = value;
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
     * Gets the value of the paxCountType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxCountType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxCountType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxCountDetailsType }
     * 
     * 
     */
    public List<PaxCountDetailsType> getPaxCountType() {
        if (paxCountType == null) {
            paxCountType = new ArrayList<PaxCountDetailsType>();
        }
        return this.paxCountType;
    }

    /**
     * Gets the value of the itinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryDetailsType }
     * 
     * 
     */
    public List<ItineraryDetailsType> getItinerary() {
        if (itinerary == null) {
            itinerary = new ArrayList<ItineraryDetailsType>();
        }
        return this.itinerary;
    }

    /**
     * Gets the value of the itinPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itinPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItinPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItinPriceType }
     * 
     * 
     */
    public List<ItinPriceType> getItinPrice() {
        if (itinPrice == null) {
            itinPrice = new ArrayList<ItinPriceType>();
        }
        return this.itinPrice;
    }

    /**
     * Gets the value of the guestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestReponseDetailsType }
     * 
     * 
     */
    public List<GuestReponseDetailsType> getGuestDetails() {
        if (guestDetails == null) {
            guestDetails = new ArrayList<GuestReponseDetailsType>();
        }
        return this.guestDetails;
    }

    /**
     * Gets the value of the ssrDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSRInformationType }
     * 
     * 
     */
    public List<SSRInformationType> getSSRDetails() {
        if (ssrDetails == null) {
            ssrDetails = new ArrayList<SSRInformationType>();
        }
        return this.ssrDetails;
    }

    /**
     * Gets the value of the paxBaggageAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxBaggageAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxBaggageAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxBaggageAllowanceType }
     * 
     * 
     */
    public List<PaxBaggageAllowanceType> getPaxBaggageAllowance() {
        if (paxBaggageAllowance == null) {
            paxBaggageAllowance = new ArrayList<PaxBaggageAllowanceType>();
        }
        return this.paxBaggageAllowance;
    }

    /**
     * Gets the value of the auxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuxInformationType }
     * 
     * 
     */
    public List<AuxInformationType> getAuxDetails() {
        if (auxDetails == null) {
            auxDetails = new ArrayList<AuxInformationType>();
        }
        return this.auxDetails;
    }

    /**
     * Gets the value of the seatAssignmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatAssignmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatAssignmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatAssignmentDetailsType }
     * 
     * 
     */
    public List<SeatAssignmentDetailsType> getSeatAssignmentDetails() {
        if (seatAssignmentDetails == null) {
            seatAssignmentDetails = new ArrayList<SeatAssignmentDetailsType>();
        }
        return this.seatAssignmentDetails;
    }

    /**
     * Gets the value of the travelDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelDocumentsType }
     * 
     * 
     */
    public List<TravelDocumentsType> getTravelDocuments() {
        if (travelDocuments == null) {
            travelDocuments = new ArrayList<TravelDocumentsType>();
        }
        return this.travelDocuments;
    }

    /**
     * groupPaxDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GroupPaxDetailsType }
     *     
     */
    public GroupPaxDetailsType getGroupPaxDetails() {
        return groupPaxDetails;
    }

    /**
     * groupPaxDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupPaxDetailsType }
     *     
     */
    public void setGroupPaxDetails(GroupPaxDetailsType value) {
        this.groupPaxDetails = value;
    }

    /**
     * Gets the value of the pnrContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrContactType }
     * 
     * 
     */
    public List<PnrContactType> getPnrContact() {
        if (pnrContact == null) {
            pnrContact = new ArrayList<PnrContactType>();
        }
        return this.pnrContact;
    }

    /**
     * Gets the value of the pnrComments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrComments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentDetailsType }
     * 
     * 
     */
    public List<CommentDetailsType> getPnrComments() {
        if (pnrComments == null) {
            pnrComments = new ArrayList<CommentDetailsType>();
        }
        return this.pnrComments;
    }

    /**
     * Gets the value of the guestLoyaltyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestLoyaltyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestLoyaltyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestLoyaltyInfoType }
     * 
     * 
     */
    public List<GuestLoyaltyInfoType> getGuestLoyaltyInfo() {
        if (guestLoyaltyInfo == null) {
            guestLoyaltyInfo = new ArrayList<GuestLoyaltyInfoType>();
        }
        return this.guestLoyaltyInfo;
    }

    /**
     * Gets the value of the guestPaymentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestPaymentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestPaymentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestPaymentInfoType }
     * 
     * 
     */
    public List<GuestPaymentInfoType> getGuestPaymentInfo() {
        if (guestPaymentInfo == null) {
            guestPaymentInfo = new ArrayList<GuestPaymentInfoType>();
        }
        return this.guestPaymentInfo;
    }

    /**
     * Gets the value of the feeInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeInformationType }
     * 
     * 
     */
    public List<FeeInformationType> getFeeInformation() {
        if (feeInformation == null) {
            feeInformation = new ArrayList<FeeInformationType>();
        }
        return this.feeInformation;
    }

    /**
     * Gets the value of the emdInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emdInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMDInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmdInformationDetailsType }
     * 
     * 
     */
    public List<EmdInformationDetailsType> getEMDInformation() {
        if (emdInformation == null) {
            emdInformation = new ArrayList<EmdInformationDetailsType>();
        }
        return this.emdInformation;
    }

    /**
     * promoCodeDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PromoCodeDetailsType }
     *     
     */
    public PromoCodeDetailsType getPromoCodeDetails() {
        return promoCodeDetails;
    }

    /**
     * promoCodeDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PromoCodeDetailsType }
     *     
     */
    public void setPromoCodeDetails(PromoCodeDetailsType value) {
        this.promoCodeDetails = value;
    }

    /**
     * isContinueWithSsr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsContinueWithSsr() {
        return isContinueWithSsr;
    }

    /**
     * isContinueWithSsr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsContinueWithSsr(Boolean value) {
        this.isContinueWithSsr = value;
    }

    /**
     * isContinueWithoutSsr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsContinueWithoutSsr() {
        return isContinueWithoutSsr;
    }

    /**
     * isContinueWithoutSsr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsContinueWithoutSsr(Boolean value) {
        this.isContinueWithoutSsr = value;
    }

    /**
     * pnrSessionId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrSessionId() {
        return pnrSessionId;
    }

    /**
     * pnrSessionId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrSessionId(String value) {
        this.pnrSessionId = value;
    }

    /**
     * isPnrUnpaid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPnrUnpaid() {
        return isPnrUnpaid;
    }

    /**
     * isPnrUnpaid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPnrUnpaid(Boolean value) {
        this.isPnrUnpaid = value;
    }

    /**
     * tourCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * tourCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * externalBookingNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalBookingNumber() {
        return externalBookingNumber;
    }

    /**
     * externalBookingNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalBookingNumber(String value) {
        this.externalBookingNumber = value;
    }

    /**
     * pnrOnHoldIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPnrOnHoldIndicator() {
        return pnrOnHoldIndicator;
    }

    /**
     * pnrOnHoldIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPnrOnHoldIndicator(Boolean value) {
        this.pnrOnHoldIndicator = value;
    }

    /**
     * Gets the value of the discountCouponDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountCouponDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountCouponDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxDiscountCouponDetailsType }
     * 
     * 
     */
    public List<PaxDiscountCouponDetailsType> getDiscountCouponDetails() {
        if (discountCouponDetails == null) {
            discountCouponDetails = new ArrayList<PaxDiscountCouponDetailsType>();
        }
        return this.discountCouponDetails;
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

    /**
     * farePaidStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FarePaidStatusDetailsType }
     *     
     */
    public FarePaidStatusDetailsType getFarePaidStatus() {
        return farePaidStatus;
    }

    /**
     * farePaidStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePaidStatusDetailsType }
     *     
     */
    public void setFarePaidStatus(FarePaidStatusDetailsType value) {
        this.farePaidStatus = value;
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
     * {@link AmountPaidType }
     * 
     * 
     */
    public List<AmountPaidType> getAmountPaid() {
        if (amountPaid == null) {
            amountPaid = new ArrayList<AmountPaidType>();
        }
        return this.amountPaid;
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
     * {@link PnrPaymentEncodedType }
     * 
     * 
     */
    public List<PnrPaymentEncodedType> getEncodedAmountToBeShown() {
        if (encodedAmountToBeShown == null) {
            encodedAmountToBeShown = new ArrayList<PnrPaymentEncodedType>();
        }
        return this.encodedAmountToBeShown;
    }

    /**
     * totalAmountDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountDetailsType }
     *     
     */
    public TotalAmountDetailsType getTotalAmountDetails() {
        return totalAmountDetails;
    }

    /**
     * totalAmountDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountDetailsType }
     *     
     */
    public void setTotalAmountDetails(TotalAmountDetailsType value) {
        this.totalAmountDetails = value;
    }

    /**
     * totalAmountToBePaid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountToBePaidDetailsType }
     *     
     */
    public TotalAmountToBePaidDetailsType getTotalAmountToBePaid() {
        return totalAmountToBePaid;
    }

    /**
     * totalAmountToBePaid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountToBePaidDetailsType }
     *     
     */
    public void setTotalAmountToBePaid(TotalAmountToBePaidDetailsType value) {
        this.totalAmountToBePaid = value;
    }

    /**
     * pointOfOriginCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfOriginCurrency() {
        return pointOfOriginCurrency;
    }

    /**
     * pointOfOriginCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfOriginCurrency(String value) {
        this.pointOfOriginCurrency = value;
    }

    /**
     * pointOfOrigin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfOrigin() {
        return pointOfOrigin;
    }

    /**
     * pointOfOrigin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfOrigin(String value) {
        this.pointOfOrigin = value;
    }

    /**
     * pricingModel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingModel() {
        return pricingModel;
    }

    /**
     * pricingModel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingModel(String value) {
        this.pricingModel = value;
    }

    /**
     * isBookingConfirmation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBookingConfirmation() {
        return isBookingConfirmation;
    }

    /**
     * isBookingConfirmation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBookingConfirmation(Boolean value) {
        this.isBookingConfirmation = value;
    }

    /**
     * pointOfSale 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSale() {
        return pointOfSale;
    }

    /**
     * pointOfSale 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSale(String value) {
        this.pointOfSale = value;
    }

    /**
     * msgForSeatAutoFee 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgForSeatAutoFee() {
        return msgForSeatAutoFee;
    }

    /**
     * msgForSeatAutoFee 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgForSeatAutoFee(String value) {
        this.msgForSeatAutoFee = value;
    }

    /**
     * totalNonRefundableAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TotalNonRefAmount }
     *     
     */
    public TotalNonRefAmount getTotalNonRefundableAmount() {
        return totalNonRefundableAmount;
    }

    /**
     * totalNonRefundableAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalNonRefAmount }
     *     
     */
    public void setTotalNonRefundableAmount(TotalNonRefAmount value) {
        this.totalNonRefundableAmount = value;
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
     * {@link PNRTimeLimitDetailsType }
     * 
     * 
     */
    public List<PNRTimeLimitDetailsType> getTimeLimitDetails() {
        if (timeLimitDetails == null) {
            timeLimitDetails = new ArrayList<PNRTimeLimitDetailsType>();
        }
        return this.timeLimitDetails;
    }

    /**
     * totalAmountPaid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountPaid }
     *     
     */
    public TotalAmountPaid getTotalAmountPaid() {
        return totalAmountPaid;
    }

    /**
     * totalAmountPaid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountPaid }
     *     
     */
    public void setTotalAmountPaid(TotalAmountPaid value) {
        this.totalAmountPaid = value;
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
     * paymentAuthorisationResponse 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAuthorisationResponseType }
     *     
     */
    public PaymentAuthorisationResponseType getPaymentAuthorisationResponse() {
        return paymentAuthorisationResponse;
    }

    /**
     * paymentAuthorisationResponse 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAuthorisationResponseType }
     *     
     */
    public void setPaymentAuthorisationResponse(PaymentAuthorisationResponseType value) {
        this.paymentAuthorisationResponse = value;
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
     * customFieldList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CustomNameValueListType }
     *     
     */
    public CustomNameValueListType getCustomFieldList() {
        return customFieldList;
    }

    /**
     * customFieldList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomNameValueListType }
     *     
     */
    public void setCustomFieldList(CustomNameValueListType value) {
        this.customFieldList = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningType }
     * 
     * 
     */
    public List<WarningType> getWarnings() {
        if (warnings == null) {
            warnings = new ArrayList<WarningType>();
        }
        return this.warnings;
    }

}
