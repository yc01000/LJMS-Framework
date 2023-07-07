//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.05.28 시간 08:48:08 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ibsplc.com/iRes/simpleTypes/}BaseBookingRQ">
 *       &lt;sequence>
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalAgentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentAgentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportingOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorporateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PnrSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuestAndPaymentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrGuestDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OandDChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}OandDChangeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PnrContactChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrContactChangeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CommentChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}CommentChangeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TimeLimitChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}TimeLimitChangeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChangeInPartyType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ChangeInPartyType" minOccurs="0"/>
 *         &lt;element name="ModifyPaxType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ModifyPaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NumberOfSeats" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SsrChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}SsrChangeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FeeChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeChangeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UpgradeChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}UpgradeChangeType" minOccurs="0"/>
 *         &lt;element name="AuxDetailsChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxDetailsChangeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BookerDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookerDetails" minOccurs="0"/>
 *         &lt;element name="DateOfHireDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOfHireDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isPnrUnpaid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsManualPriceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pnrNumber",
    "profileId",
    "agencyCode",
    "originalAgentID",
    "currentAgentID",
    "reportingOffice",
    "corporateId",
    "pnrSessionId",
    "guestAndPaymentDetails",
    "oandDChangeType",
    "pnrContactChangeType",
    "commentChangeType",
    "timeLimitChangeType",
    "changeInPartyType",
    "modifyPaxType",
    "numberOfSeats",
    "ssrChangeType",
    "feeChangeType",
    "upgradeChangeType",
    "auxDetailsChangeType",
    "bookerDetails",
    "dateOfHireDetails",
    "tourCode",
    "isPnrUnpaid",
    "isManualPriceRequired"
})
@XmlRootElement(name = "ModifyReservationRQ")
public class ModifyReservationRQ
    extends BaseBookingRQ
{

    @XmlElement(name = "PnrNumber", required = true)
    protected String pnrNumber;
    @XmlElement(name = "ProfileId")
    protected String profileId;
    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "OriginalAgentID")
    protected String originalAgentID;
    @XmlElement(name = "CurrentAgentID")
    protected String currentAgentID;
    @XmlElement(name = "ReportingOffice")
    protected String reportingOffice;
    @XmlElement(name = "CorporateId")
    protected String corporateId;
    @XmlElement(name = "PnrSessionId")
    protected String pnrSessionId;
    @XmlElement(name = "GuestAndPaymentDetails")
    protected List<PnrGuestDetailsType> guestAndPaymentDetails;
    @XmlElement(name = "OandDChangeType")
    protected List<OandDChangeType> oandDChangeType;
    @XmlElement(name = "PnrContactChangeType")
    protected List<PnrContactChangeType> pnrContactChangeType;
    @XmlElement(name = "CommentChangeType")
    protected List<CommentChangeType> commentChangeType;
    @XmlElement(name = "TimeLimitChangeType")
    protected List<TimeLimitChangeType> timeLimitChangeType;
    @XmlElement(name = "ChangeInPartyType")
    protected ChangeInPartyType changeInPartyType;
    @XmlElement(name = "ModifyPaxType")
    protected List<ModifyPaxType> modifyPaxType;
    @XmlElement(name = "NumberOfSeats")
    protected Integer numberOfSeats;
    @XmlElement(name = "SsrChangeType")
    protected List<SsrChangeType> ssrChangeType;
    @XmlElement(name = "FeeChangeType")
    protected List<FeeChangeType> feeChangeType;
    @XmlElement(name = "UpgradeChangeType")
    protected UpgradeChangeType upgradeChangeType;
    @XmlElement(name = "AuxDetailsChangeType")
    protected List<AuxDetailsChangeType> auxDetailsChangeType;
    @XmlElement(name = "BookerDetails")
    protected BookerDetails bookerDetails;
    @XmlElement(name = "DateOfHireDetails")
    protected List<DateOfHireDetails> dateOfHireDetails;
    @XmlElement(name = "TourCode")
    protected String tourCode;
    protected Boolean isPnrUnpaid;
    @XmlElement(name = "IsManualPriceRequired")
    protected Boolean isManualPriceRequired;

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
     * originalAgentID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalAgentID() {
        return originalAgentID;
    }

    /**
     * originalAgentID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalAgentID(String value) {
        this.originalAgentID = value;
    }

    /**
     * currentAgentID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentAgentID() {
        return currentAgentID;
    }

    /**
     * currentAgentID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentAgentID(String value) {
        this.currentAgentID = value;
    }

    /**
     * reportingOffice 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingOffice() {
        return reportingOffice;
    }

    /**
     * reportingOffice 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingOffice(String value) {
        this.reportingOffice = value;
    }

    /**
     * corporateId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateId() {
        return corporateId;
    }

    /**
     * corporateId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateId(String value) {
        this.corporateId = value;
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
     * Gets the value of the guestAndPaymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestAndPaymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestAndPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrGuestDetailsType }
     * 
     * 
     */
    public List<PnrGuestDetailsType> getGuestAndPaymentDetails() {
        if (guestAndPaymentDetails == null) {
            guestAndPaymentDetails = new ArrayList<PnrGuestDetailsType>();
        }
        return this.guestAndPaymentDetails;
    }

    /**
     * Gets the value of the oandDChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oandDChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOandDChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OandDChangeType }
     * 
     * 
     */
    public List<OandDChangeType> getOandDChangeType() {
        if (oandDChangeType == null) {
            oandDChangeType = new ArrayList<OandDChangeType>();
        }
        return this.oandDChangeType;
    }

    /**
     * Gets the value of the pnrContactChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrContactChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrContactChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrContactChangeType }
     * 
     * 
     */
    public List<PnrContactChangeType> getPnrContactChangeType() {
        if (pnrContactChangeType == null) {
            pnrContactChangeType = new ArrayList<PnrContactChangeType>();
        }
        return this.pnrContactChangeType;
    }

    /**
     * Gets the value of the commentChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commentChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommentChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentChangeType }
     * 
     * 
     */
    public List<CommentChangeType> getCommentChangeType() {
        if (commentChangeType == null) {
            commentChangeType = new ArrayList<CommentChangeType>();
        }
        return this.commentChangeType;
    }

    /**
     * Gets the value of the timeLimitChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeLimitChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeLimitChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeLimitChangeType }
     * 
     * 
     */
    public List<TimeLimitChangeType> getTimeLimitChangeType() {
        if (timeLimitChangeType == null) {
            timeLimitChangeType = new ArrayList<TimeLimitChangeType>();
        }
        return this.timeLimitChangeType;
    }

    /**
     * changeInPartyType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ChangeInPartyType }
     *     
     */
    public ChangeInPartyType getChangeInPartyType() {
        return changeInPartyType;
    }

    /**
     * changeInPartyType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeInPartyType }
     *     
     */
    public void setChangeInPartyType(ChangeInPartyType value) {
        this.changeInPartyType = value;
    }

    /**
     * Gets the value of the modifyPaxType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifyPaxType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifyPaxType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModifyPaxType }
     * 
     * 
     */
    public List<ModifyPaxType> getModifyPaxType() {
        if (modifyPaxType == null) {
            modifyPaxType = new ArrayList<ModifyPaxType>();
        }
        return this.modifyPaxType;
    }

    /**
     * numberOfSeats 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * numberOfSeats 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfSeats(Integer value) {
        this.numberOfSeats = value;
    }

    /**
     * Gets the value of the ssrChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSsrChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SsrChangeType }
     * 
     * 
     */
    public List<SsrChangeType> getSsrChangeType() {
        if (ssrChangeType == null) {
            ssrChangeType = new ArrayList<SsrChangeType>();
        }
        return this.ssrChangeType;
    }

    /**
     * Gets the value of the feeChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeChangeType }
     * 
     * 
     */
    public List<FeeChangeType> getFeeChangeType() {
        if (feeChangeType == null) {
            feeChangeType = new ArrayList<FeeChangeType>();
        }
        return this.feeChangeType;
    }

    /**
     * upgradeChangeType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UpgradeChangeType }
     *     
     */
    public UpgradeChangeType getUpgradeChangeType() {
        return upgradeChangeType;
    }

    /**
     * upgradeChangeType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UpgradeChangeType }
     *     
     */
    public void setUpgradeChangeType(UpgradeChangeType value) {
        this.upgradeChangeType = value;
    }

    /**
     * Gets the value of the auxDetailsChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxDetailsChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuxDetailsChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuxDetailsChangeType }
     * 
     * 
     */
    public List<AuxDetailsChangeType> getAuxDetailsChangeType() {
        if (auxDetailsChangeType == null) {
            auxDetailsChangeType = new ArrayList<AuxDetailsChangeType>();
        }
        return this.auxDetailsChangeType;
    }

    /**
     * bookerDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BookerDetails }
     *     
     */
    public BookerDetails getBookerDetails() {
        return bookerDetails;
    }

    /**
     * bookerDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BookerDetails }
     *     
     */
    public void setBookerDetails(BookerDetails value) {
        this.bookerDetails = value;
    }

    /**
     * Gets the value of the dateOfHireDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateOfHireDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateOfHireDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateOfHireDetails }
     * 
     * 
     */
    public List<DateOfHireDetails> getDateOfHireDetails() {
        if (dateOfHireDetails == null) {
            dateOfHireDetails = new ArrayList<DateOfHireDetails>();
        }
        return this.dateOfHireDetails;
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
     * isManualPriceRequired 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsManualPriceRequired() {
        return isManualPriceRequired;
    }

    /**
     * isManualPriceRequired 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsManualPriceRequired(Boolean value) {
        this.isManualPriceRequired = value;
    }

}
