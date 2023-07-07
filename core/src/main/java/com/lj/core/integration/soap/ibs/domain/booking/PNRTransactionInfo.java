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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>PNRTransactionInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PNRTransactionInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PNRAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PNRActionUserInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRActionUserInfo" minOccurs="0"/&gt;
 *         &lt;element name="PNRGeneralChangeInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRGeneralChangeInfo" minOccurs="0"/&gt;
 *         &lt;element name="ItineraryHistoryInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItineraryHistoryInfo" minOccurs="0"/&gt;
 *         &lt;element name="ItinPriceHistoryInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItinPriceHistoryInfo" minOccurs="0"/&gt;
 *         &lt;element name="GuestDetailsHistoryInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestDetailsHistoryInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GuestTicketHistoryInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestTicketHistoryInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SSRDetailsHistoryInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}SSRDetailsHistoryInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SeatAssignmentHistoryDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatAssignmentHistoryDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PnrContactHistoryInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrContactHistoryInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PnrCommentsHistoryInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrCommentsHistoryInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GuestPaymentHistoryInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestPaymentHistoryInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeeHistoryInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeHistoryInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TravelDocHistoryInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelDocHistoryInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AuxHistoryInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxHistoryInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CrossReferenceHistoryInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}CrossReferenceHistoryInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EMDDetailsHistoryInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}EMDDetailsHistoryInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNRTransactionInfo", propOrder = {
    "pnrAction",
    "pnrActionUserInfo",
    "pnrGeneralChangeInfo",
    "itineraryHistoryInfo",
    "itinPriceHistoryInfo",
    "guestDetailsHistoryInfo",
    "guestTicketHistoryInfo",
    "ssrDetailsHistoryInfo",
    "seatAssignmentHistoryDetails",
    "pnrContactHistoryInfo",
    "pnrCommentsHistoryInfo",
    "guestPaymentHistoryInfo",
    "feeHistoryInfo",
    "travelDocHistoryInfo",
    "auxHistoryInfo",
    "crossReferenceHistoryInfo",
    "emdDetailsHistoryInfo"
})
public class PNRTransactionInfo
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PNRAction")
    protected String pnrAction;
    @XmlElement(name = "PNRActionUserInfo")
    protected PNRActionUserInfo pnrActionUserInfo;
    @XmlElement(name = "PNRGeneralChangeInfo")
    protected PNRGeneralChangeInfo pnrGeneralChangeInfo;
    @XmlElement(name = "ItineraryHistoryInfo")
    protected ItineraryHistoryInfo itineraryHistoryInfo;
    @XmlElement(name = "ItinPriceHistoryInfo")
    protected ItinPriceHistoryInfo itinPriceHistoryInfo;
    @XmlElement(name = "GuestDetailsHistoryInfo")
    protected List<GuestDetailsHistoryInfo> guestDetailsHistoryInfo;
    @XmlElement(name = "GuestTicketHistoryInfo")
    protected List<GuestTicketHistoryInfo> guestTicketHistoryInfo;
    @XmlElement(name = "SSRDetailsHistoryInfo")
    protected List<SSRDetailsHistoryInfo> ssrDetailsHistoryInfo;
    @XmlElement(name = "SeatAssignmentHistoryDetails")
    protected List<SeatAssignmentHistoryDetails> seatAssignmentHistoryDetails;
    @XmlElement(name = "PnrContactHistoryInfo")
    protected List<PnrContactHistoryInfo> pnrContactHistoryInfo;
    @XmlElement(name = "PnrCommentsHistoryInfo")
    protected List<PnrCommentsHistoryInfo> pnrCommentsHistoryInfo;
    @XmlElement(name = "GuestPaymentHistoryInfo")
    protected List<GuestPaymentHistoryInfo> guestPaymentHistoryInfo;
    @XmlElement(name = "FeeHistoryInfo")
    protected List<FeeHistoryInfo> feeHistoryInfo;
    @XmlElement(name = "TravelDocHistoryInfo")
    protected List<TravelDocHistoryInfo> travelDocHistoryInfo;
    @XmlElement(name = "AuxHistoryInfo")
    protected List<AuxHistoryInfo> auxHistoryInfo;
    @XmlElement(name = "CrossReferenceHistoryInfo")
    protected List<CrossReferenceHistoryInfo> crossReferenceHistoryInfo;
    @XmlElement(name = "EMDDetailsHistoryInfo")
    protected List<EMDDetailsHistoryInfo> emdDetailsHistoryInfo;

    /**
     * pnrAction 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRAction() {
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
    public void setPNRAction(String value) {
        this.pnrAction = value;
    }

    /**
     * pnrActionUserInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PNRActionUserInfo }
     *     
     */
    public PNRActionUserInfo getPNRActionUserInfo() {
        return pnrActionUserInfo;
    }

    /**
     * pnrActionUserInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRActionUserInfo }
     *     
     */
    public void setPNRActionUserInfo(PNRActionUserInfo value) {
        this.pnrActionUserInfo = value;
    }

    /**
     * pnrGeneralChangeInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PNRGeneralChangeInfo }
     *     
     */
    public PNRGeneralChangeInfo getPNRGeneralChangeInfo() {
        return pnrGeneralChangeInfo;
    }

    /**
     * pnrGeneralChangeInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRGeneralChangeInfo }
     *     
     */
    public void setPNRGeneralChangeInfo(PNRGeneralChangeInfo value) {
        this.pnrGeneralChangeInfo = value;
    }

    /**
     * itineraryHistoryInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryHistoryInfo }
     *     
     */
    public ItineraryHistoryInfo getItineraryHistoryInfo() {
        return itineraryHistoryInfo;
    }

    /**
     * itineraryHistoryInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryHistoryInfo }
     *     
     */
    public void setItineraryHistoryInfo(ItineraryHistoryInfo value) {
        this.itineraryHistoryInfo = value;
    }

    /**
     * itinPriceHistoryInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ItinPriceHistoryInfo }
     *     
     */
    public ItinPriceHistoryInfo getItinPriceHistoryInfo() {
        return itinPriceHistoryInfo;
    }

    /**
     * itinPriceHistoryInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinPriceHistoryInfo }
     *     
     */
    public void setItinPriceHistoryInfo(ItinPriceHistoryInfo value) {
        this.itinPriceHistoryInfo = value;
    }

    /**
     * Gets the value of the guestDetailsHistoryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestDetailsHistoryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestDetailsHistoryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestDetailsHistoryInfo }
     * 
     * 
     */
    public List<GuestDetailsHistoryInfo> getGuestDetailsHistoryInfo() {
        if (guestDetailsHistoryInfo == null) {
            guestDetailsHistoryInfo = new ArrayList<GuestDetailsHistoryInfo>();
        }
        return this.guestDetailsHistoryInfo;
    }

    /**
     * Gets the value of the guestTicketHistoryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestTicketHistoryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestTicketHistoryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestTicketHistoryInfo }
     * 
     * 
     */
    public List<GuestTicketHistoryInfo> getGuestTicketHistoryInfo() {
        if (guestTicketHistoryInfo == null) {
            guestTicketHistoryInfo = new ArrayList<GuestTicketHistoryInfo>();
        }
        return this.guestTicketHistoryInfo;
    }

    /**
     * Gets the value of the ssrDetailsHistoryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrDetailsHistoryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRDetailsHistoryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSRDetailsHistoryInfo }
     * 
     * 
     */
    public List<SSRDetailsHistoryInfo> getSSRDetailsHistoryInfo() {
        if (ssrDetailsHistoryInfo == null) {
            ssrDetailsHistoryInfo = new ArrayList<SSRDetailsHistoryInfo>();
        }
        return this.ssrDetailsHistoryInfo;
    }

    /**
     * Gets the value of the seatAssignmentHistoryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatAssignmentHistoryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatAssignmentHistoryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatAssignmentHistoryDetails }
     * 
     * 
     */
    public List<SeatAssignmentHistoryDetails> getSeatAssignmentHistoryDetails() {
        if (seatAssignmentHistoryDetails == null) {
            seatAssignmentHistoryDetails = new ArrayList<SeatAssignmentHistoryDetails>();
        }
        return this.seatAssignmentHistoryDetails;
    }

    /**
     * Gets the value of the pnrContactHistoryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrContactHistoryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrContactHistoryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrContactHistoryInfo }
     * 
     * 
     */
    public List<PnrContactHistoryInfo> getPnrContactHistoryInfo() {
        if (pnrContactHistoryInfo == null) {
            pnrContactHistoryInfo = new ArrayList<PnrContactHistoryInfo>();
        }
        return this.pnrContactHistoryInfo;
    }

    /**
     * Gets the value of the pnrCommentsHistoryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrCommentsHistoryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrCommentsHistoryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrCommentsHistoryInfo }
     * 
     * 
     */
    public List<PnrCommentsHistoryInfo> getPnrCommentsHistoryInfo() {
        if (pnrCommentsHistoryInfo == null) {
            pnrCommentsHistoryInfo = new ArrayList<PnrCommentsHistoryInfo>();
        }
        return this.pnrCommentsHistoryInfo;
    }

    /**
     * Gets the value of the guestPaymentHistoryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestPaymentHistoryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestPaymentHistoryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestPaymentHistoryInfo }
     * 
     * 
     */
    public List<GuestPaymentHistoryInfo> getGuestPaymentHistoryInfo() {
        if (guestPaymentHistoryInfo == null) {
            guestPaymentHistoryInfo = new ArrayList<GuestPaymentHistoryInfo>();
        }
        return this.guestPaymentHistoryInfo;
    }

    /**
     * Gets the value of the feeHistoryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeHistoryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeHistoryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeHistoryInfo }
     * 
     * 
     */
    public List<FeeHistoryInfo> getFeeHistoryInfo() {
        if (feeHistoryInfo == null) {
            feeHistoryInfo = new ArrayList<FeeHistoryInfo>();
        }
        return this.feeHistoryInfo;
    }

    /**
     * Gets the value of the travelDocHistoryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelDocHistoryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelDocHistoryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelDocHistoryInfo }
     * 
     * 
     */
    public List<TravelDocHistoryInfo> getTravelDocHistoryInfo() {
        if (travelDocHistoryInfo == null) {
            travelDocHistoryInfo = new ArrayList<TravelDocHistoryInfo>();
        }
        return this.travelDocHistoryInfo;
    }

    /**
     * Gets the value of the auxHistoryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxHistoryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuxHistoryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuxHistoryInfo }
     * 
     * 
     */
    public List<AuxHistoryInfo> getAuxHistoryInfo() {
        if (auxHistoryInfo == null) {
            auxHistoryInfo = new ArrayList<AuxHistoryInfo>();
        }
        return this.auxHistoryInfo;
    }

    /**
     * Gets the value of the crossReferenceHistoryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crossReferenceHistoryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrossReferenceHistoryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrossReferenceHistoryInfo }
     * 
     * 
     */
    public List<CrossReferenceHistoryInfo> getCrossReferenceHistoryInfo() {
        if (crossReferenceHistoryInfo == null) {
            crossReferenceHistoryInfo = new ArrayList<CrossReferenceHistoryInfo>();
        }
        return this.crossReferenceHistoryInfo;
    }

    /**
     * Gets the value of the emdDetailsHistoryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emdDetailsHistoryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMDDetailsHistoryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDDetailsHistoryInfo }
     * 
     * 
     */
    public List<EMDDetailsHistoryInfo> getEMDDetailsHistoryInfo() {
        if (emdDetailsHistoryInfo == null) {
            emdDetailsHistoryInfo = new ArrayList<EMDDetailsHistoryInfo>();
        }
        return this.emdDetailsHistoryInfo;
    }

}
