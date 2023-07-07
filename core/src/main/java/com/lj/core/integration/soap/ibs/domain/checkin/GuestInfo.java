//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 *  Information about guest.
 * 
 * <p>GuestInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GuestInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestNameInfo" minOccurs="0"/&gt;
 *         &lt;element name="SegmentGuestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentGuestInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PlatingCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsInterlinePNR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsThroughCheckinAgreement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PNRLockStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaxKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TourOperatorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecordLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestInfo", propOrder = {
    "name",
    "segmentGuestDetails",
    "platingCarrierCode",
    "isInterlinePNR",
    "isThroughCheckinAgreement",
    "pnrLockStatus",
    "paxKey",
    "tourOperatorNumber",
    "recordLocator"
})
public class GuestInfo
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Name")
    protected GuestNameInfo name;
    @XmlElement(name = "SegmentGuestDetails")
    protected List<SegmentGuestInfo> segmentGuestDetails;
    @XmlElement(name = "PlatingCarrierCode")
    protected String platingCarrierCode;
    @XmlElement(name = "IsInterlinePNR")
    protected Boolean isInterlinePNR;
    @XmlElement(name = "IsThroughCheckinAgreement")
    protected Boolean isThroughCheckinAgreement;
    @XmlElement(name = "PNRLockStatus")
    protected String pnrLockStatus;
    @XmlElement(name = "PaxKey")
    protected String paxKey;
    @XmlElement(name = "TourOperatorNumber")
    protected String tourOperatorNumber;
    @XmlElement(name = "RecordLocator")
    protected String recordLocator;

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GuestNameInfo }
     *     
     */
    public GuestNameInfo getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestNameInfo }
     *     
     */
    public void setName(GuestNameInfo value) {
        this.name = value;
    }

    /**
     * Gets the value of the segmentGuestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentGuestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentGuestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentGuestInfo }
     * 
     * 
     */
    public List<SegmentGuestInfo> getSegmentGuestDetails() {
        if (segmentGuestDetails == null) {
            segmentGuestDetails = new ArrayList<SegmentGuestInfo>();
        }
        return this.segmentGuestDetails;
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
     * isInterlinePNR 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInterlinePNR() {
        return isInterlinePNR;
    }

    /**
     * isInterlinePNR 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInterlinePNR(Boolean value) {
        this.isInterlinePNR = value;
    }

    /**
     * isThroughCheckinAgreement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsThroughCheckinAgreement() {
        return isThroughCheckinAgreement;
    }

    /**
     * isThroughCheckinAgreement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsThroughCheckinAgreement(Boolean value) {
        this.isThroughCheckinAgreement = value;
    }

    /**
     * pnrLockStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRLockStatus() {
        return pnrLockStatus;
    }

    /**
     * pnrLockStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNRLockStatus(String value) {
        this.pnrLockStatus = value;
    }

    /**
     * paxKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxKey() {
        return paxKey;
    }

    /**
     * paxKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxKey(String value) {
        this.paxKey = value;
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
     * recordLocator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordLocator() {
        return recordLocator;
    }

    /**
     * recordLocator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordLocator(String value) {
        this.recordLocator = value;
    }

}
