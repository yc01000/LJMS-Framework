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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ibsplc.com/iRes/simpleTypes/}BasePnrRSType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PNRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CreationDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CreationDateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastModifiedDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="LastModfiedDateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OriginalCaller" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PnrStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InterlineType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlatingCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnrOnHoldIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PricingModel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PointOfPurchase" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PointOfOriginCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalBookingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Itinerary" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItineraryDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ItinPrice" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItinPriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GuestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestReponseDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaxBaggageAllowance" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxBaggageAllowanceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SSRDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SSRInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AuxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SeatAssignmentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatAssignmentDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TravelDocuments" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelDocumentsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GroupPaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GroupPaxDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="PnrContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrContactType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PnrComments" type="{http://www.ibsplc.com/iRes/simpleTypes/}CommentDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GuestLoyaltyInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestLoyaltyInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GuestPaymentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestPaymentInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeeInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PromoCodeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PromoCodeDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="DiscountCouponDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxDiscountCouponDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExternalRecordLocatorDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ExternalRecordLocatorDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FarePaidStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}FarePaidStatusDetails_Type" minOccurs="0"/&gt;
 *         &lt;element name="EncodedAmountToBeShown" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrPaymentEncodedType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmountDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TotalAmountDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TimeLimitDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRTimeLimitDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmountToBePaid" type="{http://www.ibsplc.com/iRes/simpleTypes/}TotalAmountToBePaidDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmountPaid" type="{http://www.ibsplc.com/iRes/simpleTypes/}TotalAmountPaid" minOccurs="0"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
 *         &lt;element name="IsModifiable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CrossreferenceDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CrossreferenceDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pnrNumber",
    "creationDateAndTime",
    "creationDateTimeZone",
    "lastModifiedDateAndTime",
    "lastModfiedDateTimeZone",
    "originalCaller",
    "pnrStatus",
    "interlineType",
    "platingCarrierCode",
    "pnrOnHoldIndicator",
    "pricingModel",
    "pointOfPurchase",
    "pointOfOriginCurrency",
    "tourCode",
    "externalBookingNumber",
    "itinerary",
    "itinPrice",
    "guestDetails",
    "paxBaggageAllowance",
    "ssrDetails",
    "auxDetails",
    "seatAssignmentDetails",
    "travelDocuments",
    "groupPaxDetails",
    "pnrContact",
    "pnrComments",
    "guestLoyaltyInfo",
    "guestPaymentInfo",
    "feeInformation",
    "promoCodeDetails",
    "discountCouponDetails",
    "externalRecordLocatorDetails",
    "farePaidStatus",
    "encodedAmountToBeShown",
    "totalAmountDetails",
    "timeLimitDetails",
    "totalAmountToBePaid",
    "totalAmountPaid",
    "errorType",
    "isModifiable",
    "isViewable",
    "crossreferenceDetails"
})
@XmlRootElement(name = "RetrieveBookingArcRS")
public class RetrieveBookingArcRS
    extends BasePnrRSType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PNRNumber", required = true)
    protected String pnrNumber;
    @XmlElement(name = "CreationDateAndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateAndTime;
    @XmlElement(name = "CreationDateTimeZone", required = true)
    protected String creationDateTimeZone;
    @XmlElement(name = "LastModifiedDateAndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDateAndTime;
    @XmlElement(name = "LastModfiedDateTimeZone", required = true)
    protected String lastModfiedDateTimeZone;
    @XmlElement(name = "OriginalCaller", required = true)
    protected String originalCaller;
    @XmlElement(name = "PnrStatus", required = true)
    protected String pnrStatus;
    @XmlElement(name = "InterlineType")
    protected String interlineType;
    @XmlElement(name = "PlatingCarrierCode")
    protected String platingCarrierCode;
    @XmlElement(name = "PnrOnHoldIndicator")
    protected Boolean pnrOnHoldIndicator;
    @XmlElement(name = "PricingModel", required = true)
    protected String pricingModel;
    @XmlElement(name = "PointOfPurchase", required = true)
    protected String pointOfPurchase;
    @XmlElement(name = "PointOfOriginCurrency", required = true)
    protected String pointOfOriginCurrency;
    @XmlElement(name = "TourCode")
    protected String tourCode;
    @XmlElement(name = "ExternalBookingNumber")
    protected String externalBookingNumber;
    @XmlElement(name = "Itinerary")
    protected List<ItineraryDetailsType> itinerary;
    @XmlElement(name = "ItinPrice")
    protected List<ItinPriceType> itinPrice;
    @XmlElement(name = "GuestDetails")
    protected List<GuestReponseDetailsType> guestDetails;
    @XmlElement(name = "PaxBaggageAllowance")
    protected List<PaxBaggageAllowanceType> paxBaggageAllowance;
    @XmlElement(name = "SSRDetails")
    protected List<SSRInformationType> ssrDetails;
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
    @XmlElement(name = "PromoCodeDetails")
    protected PromoCodeDetailsType promoCodeDetails;
    @XmlElement(name = "DiscountCouponDetails")
    protected List<PaxDiscountCouponDetailsType> discountCouponDetails;
    @XmlElement(name = "ExternalRecordLocatorDetails")
    protected List<ExternalRecordLocatorDetailsType> externalRecordLocatorDetails;
    @XmlElement(name = "FarePaidStatus")
    @XmlSchemaType(name = "string")
    protected FarePaidStatusDetailsType farePaidStatus;
    @XmlElement(name = "EncodedAmountToBeShown")
    protected List<PnrPaymentEncodedType> encodedAmountToBeShown;
    @XmlElement(name = "TotalAmountDetails")
    protected List<TotalAmountDetailsType> totalAmountDetails;
    @XmlElement(name = "TimeLimitDetails")
    protected List<PNRTimeLimitDetailsType> timeLimitDetails;
    @XmlElement(name = "TotalAmountToBePaid")
    protected TotalAmountToBePaidDetailsType totalAmountToBePaid;
    @XmlElement(name = "TotalAmountPaid")
    protected TotalAmountPaid totalAmountPaid;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;
    @XmlElement(name = "IsModifiable")
    protected Boolean isModifiable;
    @XmlElement(name = "IsViewable")
    protected Boolean isViewable;
    @XmlElement(name = "CrossreferenceDetails")
    protected List<CrossreferenceDetailsType> crossreferenceDetails;

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
     * interlineType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterlineType() {
        return interlineType;
    }

    /**
     * interlineType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterlineType(String value) {
        this.interlineType = value;
    }

    /**
     * platingCarrierCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatingCarrierCode() {
        return platingCarrierCode;
    }

    /**
     * platingCarrierCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatingCarrierCode(String value) {
        this.platingCarrierCode = value;
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
     * Gets the value of the totalAmountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalAmountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalAmountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalAmountDetailsType }
     * 
     * 
     */
    public List<TotalAmountDetailsType> getTotalAmountDetails() {
        if (totalAmountDetails == null) {
            totalAmountDetails = new ArrayList<TotalAmountDetailsType>();
        }
        return this.totalAmountDetails;
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
     * isModifiable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsModifiable() {
        return isModifiable;
    }

    /**
     * isModifiable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsModifiable(Boolean value) {
        this.isModifiable = value;
    }

    /**
     * isViewable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsViewable() {
        return isViewable;
    }

    /**
     * isViewable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsViewable(Boolean value) {
        this.isViewable = value;
    }

    /**
     * Gets the value of the crossreferenceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crossreferenceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrossreferenceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrossreferenceDetailsType }
     * 
     * 
     */
    public List<CrossreferenceDetailsType> getCrossreferenceDetails() {
        if (crossreferenceDetails == null) {
            crossreferenceDetails = new ArrayList<CrossreferenceDetailsType>();
        }
        return this.crossreferenceDetails;
    }

}
