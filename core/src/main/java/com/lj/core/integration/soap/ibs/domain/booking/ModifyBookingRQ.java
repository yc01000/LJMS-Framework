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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>ModifyBookingRQ complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ModifyBookingRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ibsplc.com/iRes/simpleTypes/}BasePnrRQType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isLoyaltyCancellation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isAirlineInitiatedChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canPutOnHold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnrSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItineraryChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItineraryChangeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FareInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BookingContactChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingContactChangeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PnrCommentChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrCommentChangeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PnrTimeLimitChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrTimeLimitChangeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaxChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxChangeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TravelDocumentChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelDocumentChangeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SsrModifyType" type="{http://www.ibsplc.com/iRes/simpleTypes/}SsrModifyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeeModifyType" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeModifyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfSeats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CabinChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}CabinChangeType" minOccurs="0"/&gt;
 *         &lt;element name="GuestPaymentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestPaymentInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConsentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ConsentDetailsRequestType" minOccurs="0"/&gt;
 *         &lt;element name="PaxDiscountCouponChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxDiscountCouponChangeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SeatAssignmentChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatAssignmentChangeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GuestLoyaltyChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestLoyaltyChangeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AuxInformationChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxInformationChangeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CanContinueWithSsr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsValidateSeatSsr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canOverrideMctViolation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isConfirmPriceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CHGCXLWaiverType" type="{http://www.ibsplc.com/iRes/simpleTypes/}CHGCXLWaiverType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CHGCXLOverrideType" type="{http://www.ibsplc.com/iRes/simpleTypes/}CHGCXLOverrideType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomFieldList" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomFieldListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyBookingRQ", propOrder = {
    "isLoyaltyCancellation",
    "isAirlineInitiatedChange",
    "canPutOnHold",
    "pnrNumber",
    "profileId",
    "pnrSessionId",
    "itineraryChangeType",
    "fareInfo",
    "bookingContactChangeType",
    "pnrCommentChangeType",
    "pnrTimeLimitChangeType",
    "paxChangeType",
    "travelDocumentChangeType",
    "ssrModifyType",
    "feeModifyType",
    "numberOfSeats",
    "cabinChangeType",
    "guestPaymentInfo",
    "consentDetails",
    "paxDiscountCouponChangeType",
    "seatAssignmentChangeType",
    "guestLoyaltyChangeType",
    "auxInformationChangeType",
    "canContinueWithSsr",
    "isValidateSeatSsr",
    "canOverrideMctViolation",
    "isConfirmPriceRequired",
    "chgcxlWaiverType",
    "chgcxlOverrideType",
    "customFieldList"
})
@XmlSeeAlso({
    RetrieveTimelimitForModifyRQ.class,
    SaveModifyBookingRQ.class
})
public class ModifyBookingRQ
    extends BasePnrRQType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Boolean isLoyaltyCancellation;
    protected Boolean isAirlineInitiatedChange;
    protected Boolean canPutOnHold;
    @XmlElement(name = "PnrNumber")
    protected String pnrNumber;
    @XmlElement(name = "ProfileId")
    protected String profileId;
    @XmlElement(name = "PnrSessionId")
    protected String pnrSessionId;
    @XmlElement(name = "ItineraryChangeType")
    protected List<ItineraryChangeType> itineraryChangeType;
    @XmlElement(name = "FareInfo")
    protected List<FareInfoType> fareInfo;
    @XmlElement(name = "BookingContactChangeType")
    protected List<BookingContactChangeType> bookingContactChangeType;
    @XmlElement(name = "PnrCommentChangeType")
    protected List<PnrCommentChangeType> pnrCommentChangeType;
    @XmlElement(name = "PnrTimeLimitChangeType")
    protected List<PnrTimeLimitChangeType> pnrTimeLimitChangeType;
    @XmlElement(name = "PaxChangeType")
    protected List<PaxChangeType> paxChangeType;
    @XmlElement(name = "TravelDocumentChangeType")
    protected List<TravelDocumentChangeType> travelDocumentChangeType;
    @XmlElement(name = "SsrModifyType")
    protected List<SsrModifyType> ssrModifyType;
    @XmlElement(name = "FeeModifyType")
    protected List<FeeModifyType> feeModifyType;
    @XmlElement(name = "NumberOfSeats")
    protected int numberOfSeats;
    @XmlElement(name = "CabinChangeType")
    protected CabinChangeType cabinChangeType;
    @XmlElement(name = "GuestPaymentInfo")
    protected List<GuestPaymentInfoType> guestPaymentInfo;
    @XmlElement(name = "ConsentDetails")
    protected ConsentDetailsRequestType consentDetails;
    @XmlElement(name = "PaxDiscountCouponChangeType")
    protected List<PaxDiscountCouponChangeType> paxDiscountCouponChangeType;
    @XmlElement(name = "SeatAssignmentChangeType")
    protected List<SeatAssignmentChangeType> seatAssignmentChangeType;
    @XmlElement(name = "GuestLoyaltyChangeType")
    protected List<GuestLoyaltyChangeType> guestLoyaltyChangeType;
    @XmlElement(name = "AuxInformationChangeType")
    protected List<AuxInformationChangeType> auxInformationChangeType;
    @XmlElement(name = "CanContinueWithSsr")
    protected Boolean canContinueWithSsr;
    @XmlElement(name = "IsValidateSeatSsr")
    protected Boolean isValidateSeatSsr;
    protected Boolean canOverrideMctViolation;
    protected Boolean isConfirmPriceRequired;
    @XmlElement(name = "CHGCXLWaiverType")
    protected List<CHGCXLWaiverType> chgcxlWaiverType;
    @XmlElement(name = "CHGCXLOverrideType")
    protected List<CHGCXLOverrideType> chgcxlOverrideType;
    @XmlElement(name = "CustomFieldList")
    protected CustomFieldListType customFieldList;

    /**
     * isLoyaltyCancellation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLoyaltyCancellation() {
        return isLoyaltyCancellation;
    }

    /**
     * isLoyaltyCancellation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLoyaltyCancellation(Boolean value) {
        this.isLoyaltyCancellation = value;
    }

    /**
     * isAirlineInitiatedChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAirlineInitiatedChange() {
        return isAirlineInitiatedChange;
    }

    /**
     * isAirlineInitiatedChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAirlineInitiatedChange(Boolean value) {
        this.isAirlineInitiatedChange = value;
    }

    /**
     * canPutOnHold 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanPutOnHold() {
        return canPutOnHold;
    }

    /**
     * canPutOnHold 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanPutOnHold(Boolean value) {
        this.canPutOnHold = value;
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
     * profileId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * profileId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileId(String value) {
        this.profileId = value;
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
     * Gets the value of the itineraryChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryChangeType }
     * 
     * 
     */
    public List<ItineraryChangeType> getItineraryChangeType() {
        if (itineraryChangeType == null) {
            itineraryChangeType = new ArrayList<ItineraryChangeType>();
        }
        return this.itineraryChangeType;
    }

    /**
     * Gets the value of the fareInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInfoType }
     * 
     * 
     */
    public List<FareInfoType> getFareInfo() {
        if (fareInfo == null) {
            fareInfo = new ArrayList<FareInfoType>();
        }
        return this.fareInfo;
    }

    /**
     * Gets the value of the bookingContactChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingContactChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingContactChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingContactChangeType }
     * 
     * 
     */
    public List<BookingContactChangeType> getBookingContactChangeType() {
        if (bookingContactChangeType == null) {
            bookingContactChangeType = new ArrayList<BookingContactChangeType>();
        }
        return this.bookingContactChangeType;
    }

    /**
     * Gets the value of the pnrCommentChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrCommentChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrCommentChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrCommentChangeType }
     * 
     * 
     */
    public List<PnrCommentChangeType> getPnrCommentChangeType() {
        if (pnrCommentChangeType == null) {
            pnrCommentChangeType = new ArrayList<PnrCommentChangeType>();
        }
        return this.pnrCommentChangeType;
    }

    /**
     * Gets the value of the pnrTimeLimitChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrTimeLimitChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrTimeLimitChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrTimeLimitChangeType }
     * 
     * 
     */
    public List<PnrTimeLimitChangeType> getPnrTimeLimitChangeType() {
        if (pnrTimeLimitChangeType == null) {
            pnrTimeLimitChangeType = new ArrayList<PnrTimeLimitChangeType>();
        }
        return this.pnrTimeLimitChangeType;
    }

    /**
     * Gets the value of the paxChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxChangeType }
     * 
     * 
     */
    public List<PaxChangeType> getPaxChangeType() {
        if (paxChangeType == null) {
            paxChangeType = new ArrayList<PaxChangeType>();
        }
        return this.paxChangeType;
    }

    /**
     * Gets the value of the travelDocumentChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelDocumentChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelDocumentChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelDocumentChangeType }
     * 
     * 
     */
    public List<TravelDocumentChangeType> getTravelDocumentChangeType() {
        if (travelDocumentChangeType == null) {
            travelDocumentChangeType = new ArrayList<TravelDocumentChangeType>();
        }
        return this.travelDocumentChangeType;
    }

    /**
     * Gets the value of the ssrModifyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrModifyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSsrModifyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SsrModifyType }
     * 
     * 
     */
    public List<SsrModifyType> getSsrModifyType() {
        if (ssrModifyType == null) {
            ssrModifyType = new ArrayList<SsrModifyType>();
        }
        return this.ssrModifyType;
    }

    /**
     * Gets the value of the feeModifyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeModifyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeModifyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeModifyType }
     * 
     * 
     */
    public List<FeeModifyType> getFeeModifyType() {
        if (feeModifyType == null) {
            feeModifyType = new ArrayList<FeeModifyType>();
        }
        return this.feeModifyType;
    }

    /**
     * numberOfSeats 속성의 값을 가져옵니다.
     * 
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * numberOfSeats 속성의 값을 설정합니다.
     * 
     */
    public void setNumberOfSeats(int value) {
        this.numberOfSeats = value;
    }

    /**
     * cabinChangeType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CabinChangeType }
     *     
     */
    public CabinChangeType getCabinChangeType() {
        return cabinChangeType;
    }

    /**
     * cabinChangeType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinChangeType }
     *     
     */
    public void setCabinChangeType(CabinChangeType value) {
        this.cabinChangeType = value;
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
     * consentDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ConsentDetailsRequestType }
     *     
     */
    public ConsentDetailsRequestType getConsentDetails() {
        return consentDetails;
    }

    /**
     * consentDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentDetailsRequestType }
     *     
     */
    public void setConsentDetails(ConsentDetailsRequestType value) {
        this.consentDetails = value;
    }

    /**
     * Gets the value of the paxDiscountCouponChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxDiscountCouponChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxDiscountCouponChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxDiscountCouponChangeType }
     * 
     * 
     */
    public List<PaxDiscountCouponChangeType> getPaxDiscountCouponChangeType() {
        if (paxDiscountCouponChangeType == null) {
            paxDiscountCouponChangeType = new ArrayList<PaxDiscountCouponChangeType>();
        }
        return this.paxDiscountCouponChangeType;
    }

    /**
     * Gets the value of the seatAssignmentChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatAssignmentChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatAssignmentChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatAssignmentChangeType }
     * 
     * 
     */
    public List<SeatAssignmentChangeType> getSeatAssignmentChangeType() {
        if (seatAssignmentChangeType == null) {
            seatAssignmentChangeType = new ArrayList<SeatAssignmentChangeType>();
        }
        return this.seatAssignmentChangeType;
    }

    /**
     * Gets the value of the guestLoyaltyChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestLoyaltyChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestLoyaltyChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestLoyaltyChangeType }
     * 
     * 
     */
    public List<GuestLoyaltyChangeType> getGuestLoyaltyChangeType() {
        if (guestLoyaltyChangeType == null) {
            guestLoyaltyChangeType = new ArrayList<GuestLoyaltyChangeType>();
        }
        return this.guestLoyaltyChangeType;
    }

    /**
     * Gets the value of the auxInformationChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxInformationChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuxInformationChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuxInformationChangeType }
     * 
     * 
     */
    public List<AuxInformationChangeType> getAuxInformationChangeType() {
        if (auxInformationChangeType == null) {
            auxInformationChangeType = new ArrayList<AuxInformationChangeType>();
        }
        return this.auxInformationChangeType;
    }

    /**
     * canContinueWithSsr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanContinueWithSsr() {
        return canContinueWithSsr;
    }

    /**
     * canContinueWithSsr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanContinueWithSsr(Boolean value) {
        this.canContinueWithSsr = value;
    }

    /**
     * isValidateSeatSsr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValidateSeatSsr() {
        return isValidateSeatSsr;
    }

    /**
     * isValidateSeatSsr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValidateSeatSsr(Boolean value) {
        this.isValidateSeatSsr = value;
    }

    /**
     * canOverrideMctViolation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanOverrideMctViolation() {
        return canOverrideMctViolation;
    }

    /**
     * canOverrideMctViolation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanOverrideMctViolation(Boolean value) {
        this.canOverrideMctViolation = value;
    }

    /**
     * isConfirmPriceRequired 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConfirmPriceRequired() {
        return isConfirmPriceRequired;
    }

    /**
     * isConfirmPriceRequired 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConfirmPriceRequired(Boolean value) {
        this.isConfirmPriceRequired = value;
    }

    /**
     * Gets the value of the chgcxlWaiverType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chgcxlWaiverType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCHGCXLWaiverType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CHGCXLWaiverType }
     * 
     * 
     */
    public List<CHGCXLWaiverType> getCHGCXLWaiverType() {
        if (chgcxlWaiverType == null) {
            chgcxlWaiverType = new ArrayList<CHGCXLWaiverType>();
        }
        return this.chgcxlWaiverType;
    }

    /**
     * Gets the value of the chgcxlOverrideType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chgcxlOverrideType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCHGCXLOverrideType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CHGCXLOverrideType }
     * 
     * 
     */
    public List<CHGCXLOverrideType> getCHGCXLOverrideType() {
        if (chgcxlOverrideType == null) {
            chgcxlOverrideType = new ArrayList<CHGCXLOverrideType>();
        }
        return this.chgcxlOverrideType;
    }

    /**
     * customFieldList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldListType }
     *     
     */
    public CustomFieldListType getCustomFieldList() {
        return customFieldList;
    }

    /**
     * customFieldList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldListType }
     *     
     */
    public void setCustomFieldList(CustomFieldListType value) {
        this.customFieldList = value;
    }

}
