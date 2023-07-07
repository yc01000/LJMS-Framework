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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingChannel" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingChannelKeyType"/&gt;
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PnrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaleDateGMT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TravelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PointOfPurchase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgentIataCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorpAcctId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnrCreationDateGMT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PnrAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SegmentInfoDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentInfoDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeeRequestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeRequestDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AuxiliaryFeeInputDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxiliaryFeeInputDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CCFeeRequestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CCFeeRequestDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "bookingChannel",
    "airlineCode",
    "pnrType",
    "saleDateGMT",
    "travelType",
    "pointOfPurchase",
    "agentIataCode",
    "corpAcctId",
    "pnrCreationDateGMT",
    "pnrAction",
    "segmentInfoDetails",
    "feeRequestDetails",
    "auxiliaryFeeInputDetails",
    "ccFeeRequestDetails"
})
@XmlRootElement(name = "ProcessFeeRQ")
public class ProcessFeeRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "BookingChannel", required = true)
    protected BookingChannelKeyType bookingChannel;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "PnrType")
    protected String pnrType;
    @XmlElement(name = "SaleDateGMT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar saleDateGMT;
    @XmlElement(name = "TravelType")
    protected String travelType;
    @XmlElement(name = "PointOfPurchase")
    protected String pointOfPurchase;
    @XmlElement(name = "AgentIataCode")
    protected String agentIataCode;
    @XmlElement(name = "CorpAcctId")
    protected String corpAcctId;
    @XmlElement(name = "PnrCreationDateGMT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pnrCreationDateGMT;
    @XmlElement(name = "PnrAction")
    protected String pnrAction;
    @XmlElement(name = "SegmentInfoDetails")
    protected List<SegmentInfoDetails> segmentInfoDetails;
    @XmlElement(name = "FeeRequestDetails")
    protected List<FeeRequestDetails> feeRequestDetails;
    @XmlElement(name = "AuxiliaryFeeInputDetails")
    protected List<AuxiliaryFeeInputDetails> auxiliaryFeeInputDetails;
    @XmlElement(name = "CCFeeRequestDetails")
    protected List<CCFeeRequestDetails> ccFeeRequestDetails;

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
     * saleDateGMT 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleDateGMT() {
        return saleDateGMT;
    }

    /**
     * saleDateGMT 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleDateGMT(XMLGregorianCalendar value) {
        this.saleDateGMT = value;
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
     * agentIataCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentIataCode() {
        return agentIataCode;
    }

    /**
     * agentIataCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentIataCode(String value) {
        this.agentIataCode = value;
    }

    /**
     * corpAcctId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpAcctId() {
        return corpAcctId;
    }

    /**
     * corpAcctId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpAcctId(String value) {
        this.corpAcctId = value;
    }

    /**
     * pnrCreationDateGMT 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPnrCreationDateGMT() {
        return pnrCreationDateGMT;
    }

    /**
     * pnrCreationDateGMT 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPnrCreationDateGMT(XMLGregorianCalendar value) {
        this.pnrCreationDateGMT = value;
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
     * Gets the value of the segmentInfoDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentInfoDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentInfoDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentInfoDetails }
     * 
     * 
     */
    public List<SegmentInfoDetails> getSegmentInfoDetails() {
        if (segmentInfoDetails == null) {
            segmentInfoDetails = new ArrayList<SegmentInfoDetails>();
        }
        return this.segmentInfoDetails;
    }

    /**
     * Gets the value of the feeRequestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeRequestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeRequestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeRequestDetails }
     * 
     * 
     */
    public List<FeeRequestDetails> getFeeRequestDetails() {
        if (feeRequestDetails == null) {
            feeRequestDetails = new ArrayList<FeeRequestDetails>();
        }
        return this.feeRequestDetails;
    }

    /**
     * Gets the value of the auxiliaryFeeInputDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxiliaryFeeInputDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuxiliaryFeeInputDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuxiliaryFeeInputDetails }
     * 
     * 
     */
    public List<AuxiliaryFeeInputDetails> getAuxiliaryFeeInputDetails() {
        if (auxiliaryFeeInputDetails == null) {
            auxiliaryFeeInputDetails = new ArrayList<AuxiliaryFeeInputDetails>();
        }
        return this.auxiliaryFeeInputDetails;
    }

    /**
     * Gets the value of the ccFeeRequestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccFeeRequestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCFeeRequestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCFeeRequestDetails }
     * 
     * 
     */
    public List<CCFeeRequestDetails> getCCFeeRequestDetails() {
        if (ccFeeRequestDetails == null) {
            ccFeeRequestDetails = new ArrayList<CCFeeRequestDetails>();
        }
        return this.ccFeeRequestDetails;
    }

}
