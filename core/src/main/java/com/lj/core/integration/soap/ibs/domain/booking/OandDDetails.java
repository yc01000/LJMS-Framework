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
 * <p>OandDDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="OandDDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OandDId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OandDReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FareDetailsForAGuest" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareDetailsForAGuest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsFareOverridden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsFareRuleOverridden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FareOverrideDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareOverrideDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FlightSegmentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightSegmentDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element name="FlightNumbers" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StandbyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OandDSequenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OldOandDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HasArnk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ArnkDateLtc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RefId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RefType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="TripType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsBookedAsReturn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PricingUnitID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsMarked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AddedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="canDeleteAssociatedOAndD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OandDDetails", propOrder = {
    "oandDId",
    "origin",
    "destination",
    "route",
    "oandDReferenceId",
    "fareDetailsForAGuest",
    "isFareOverridden",
    "isFareRuleOverridden",
    "fareOverrideDetails",
    "flightSegmentDetails",
    "flightNumbers",
    "cabinClass",
    "fareClass",
    "standbyCode",
    "oandDSequenceID",
    "oldOandDID",
    "hasArnk",
    "arnkDateLtc",
    "refId",
    "refType",
    "tripType",
    "isBookedAsReturn",
    "pricingUnitID",
    "isMarked",
    "addedTime",
    "canDeleteAssociatedOAndD"
})
public class OandDDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "OandDId")
    protected String oandDId;
    @XmlElement(name = "Origin", required = true)
    protected String origin;
    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlElement(name = "Route", required = true)
    protected String route;
    @XmlElement(name = "OandDReferenceId")
    protected String oandDReferenceId;
    @XmlElement(name = "FareDetailsForAGuest")
    protected List<FareDetailsForAGuest> fareDetailsForAGuest;
    @XmlElement(name = "IsFareOverridden")
    protected Boolean isFareOverridden;
    @XmlElement(name = "IsFareRuleOverridden")
    protected Boolean isFareRuleOverridden;
    @XmlElement(name = "FareOverrideDetails")
    protected List<FareOverrideDetails> fareOverrideDetails;
    @XmlElement(name = "FlightSegmentDetails", required = true)
    protected List<FlightSegmentDetails> flightSegmentDetails;
    @XmlElement(name = "FlightNumbers", required = true)
    protected String flightNumbers;
    @XmlElement(name = "CabinClass", required = true)
    protected String cabinClass;
    @XmlElement(name = "FareClass")
    protected String fareClass;
    @XmlElement(name = "StandbyCode")
    protected String standbyCode;
    @XmlElement(name = "OandDSequenceID")
    protected String oandDSequenceID;
    @XmlElement(name = "OldOandDID")
    protected String oldOandDID;
    @XmlElement(name = "HasArnk")
    protected Boolean hasArnk;
    @XmlElement(name = "ArnkDateLtc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arnkDateLtc;
    @XmlElement(name = "RefId")
    protected Long refId;
    @XmlElement(name = "RefType")
    @XmlSchemaType(name = "string")
    protected ReferenceType refType;
    @XmlElement(name = "TripType")
    protected String tripType;
    @XmlElement(name = "IsBookedAsReturn")
    protected Boolean isBookedAsReturn;
    @XmlElement(name = "PricingUnitID")
    protected Integer pricingUnitID;
    @XmlElement(name = "IsMarked")
    protected Boolean isMarked;
    @XmlElement(name = "AddedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar addedTime;
    protected Boolean canDeleteAssociatedOAndD;

    /**
     * oandDId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOandDId() {
        return oandDId;
    }

    /**
     * oandDId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOandDId(String value) {
        this.oandDId = value;
    }

    /**
     * origin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * origin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * destination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * destination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * route 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * route 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * oandDReferenceId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOandDReferenceId() {
        return oandDReferenceId;
    }

    /**
     * oandDReferenceId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOandDReferenceId(String value) {
        this.oandDReferenceId = value;
    }

    /**
     * Gets the value of the fareDetailsForAGuest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDetailsForAGuest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDetailsForAGuest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDetailsForAGuest }
     * 
     * 
     */
    public List<FareDetailsForAGuest> getFareDetailsForAGuest() {
        if (fareDetailsForAGuest == null) {
            fareDetailsForAGuest = new ArrayList<FareDetailsForAGuest>();
        }
        return this.fareDetailsForAGuest;
    }

    /**
     * isFareOverridden 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFareOverridden() {
        return isFareOverridden;
    }

    /**
     * isFareOverridden 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFareOverridden(Boolean value) {
        this.isFareOverridden = value;
    }

    /**
     * isFareRuleOverridden 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFareRuleOverridden() {
        return isFareRuleOverridden;
    }

    /**
     * isFareRuleOverridden 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFareRuleOverridden(Boolean value) {
        this.isFareRuleOverridden = value;
    }

    /**
     * Gets the value of the fareOverrideDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareOverrideDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareOverrideDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareOverrideDetails }
     * 
     * 
     */
    public List<FareOverrideDetails> getFareOverrideDetails() {
        if (fareOverrideDetails == null) {
            fareOverrideDetails = new ArrayList<FareOverrideDetails>();
        }
        return this.fareOverrideDetails;
    }

    /**
     * Gets the value of the flightSegmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightSegmentDetails }
     * 
     * 
     */
    public List<FlightSegmentDetails> getFlightSegmentDetails() {
        if (flightSegmentDetails == null) {
            flightSegmentDetails = new ArrayList<FlightSegmentDetails>();
        }
        return this.flightSegmentDetails;
    }

    /**
     * flightNumbers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumbers() {
        return flightNumbers;
    }

    /**
     * flightNumbers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumbers(String value) {
        this.flightNumbers = value;
    }

    /**
     * cabinClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * cabinClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

    /**
     * fareClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareClass() {
        return fareClass;
    }

    /**
     * fareClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareClass(String value) {
        this.fareClass = value;
    }

    /**
     * standbyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandbyCode() {
        return standbyCode;
    }

    /**
     * standbyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandbyCode(String value) {
        this.standbyCode = value;
    }

    /**
     * oandDSequenceID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOandDSequenceID() {
        return oandDSequenceID;
    }

    /**
     * oandDSequenceID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOandDSequenceID(String value) {
        this.oandDSequenceID = value;
    }

    /**
     * oldOandDID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldOandDID() {
        return oldOandDID;
    }

    /**
     * oldOandDID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldOandDID(String value) {
        this.oldOandDID = value;
    }

    /**
     * hasArnk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasArnk() {
        return hasArnk;
    }

    /**
     * hasArnk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasArnk(Boolean value) {
        this.hasArnk = value;
    }

    /**
     * arnkDateLtc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArnkDateLtc() {
        return arnkDateLtc;
    }

    /**
     * arnkDateLtc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArnkDateLtc(XMLGregorianCalendar value) {
        this.arnkDateLtc = value;
    }

    /**
     * refId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRefId() {
        return refId;
    }

    /**
     * refId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRefId(Long value) {
        this.refId = value;
    }

    /**
     * refType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRefType() {
        return refType;
    }

    /**
     * refType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRefType(ReferenceType value) {
        this.refType = value;
    }

    /**
     * tripType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripType() {
        return tripType;
    }

    /**
     * tripType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripType(String value) {
        this.tripType = value;
    }

    /**
     * isBookedAsReturn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBookedAsReturn() {
        return isBookedAsReturn;
    }

    /**
     * isBookedAsReturn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBookedAsReturn(Boolean value) {
        this.isBookedAsReturn = value;
    }

    /**
     * pricingUnitID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPricingUnitID() {
        return pricingUnitID;
    }

    /**
     * pricingUnitID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPricingUnitID(Integer value) {
        this.pricingUnitID = value;
    }

    /**
     * isMarked 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMarked() {
        return isMarked;
    }

    /**
     * isMarked 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMarked(Boolean value) {
        this.isMarked = value;
    }

    /**
     * addedTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAddedTime() {
        return addedTime;
    }

    /**
     * addedTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAddedTime(XMLGregorianCalendar value) {
        this.addedTime = value;
    }

    /**
     * canDeleteAssociatedOAndD 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanDeleteAssociatedOAndD() {
        return canDeleteAssociatedOAndD;
    }

    /**
     * canDeleteAssociatedOAndD 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanDeleteAssociatedOAndD(Boolean value) {
        this.canDeleteAssociatedOAndD = value;
    }

}
