//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Details of the seat
 * 
 * <p>SeatDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SeatDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SeatNumber" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatNumberType" minOccurs="0"/&gt;
 *         &lt;element name="InternalRowNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="InternalColumnNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ExternalRowNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ExternalColumnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationAttribute" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FacilityAttribute" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ZoneAttribute" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SeatPriorityAttribute" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AttachedSsr" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PreferredSeatSsr" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ControlAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeatPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AllocatedPassengerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AllowedFareClasses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedFareClasses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SeatAssignMentFee" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatAssignMentFeeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatDetailsType", propOrder = {
    "seatNumber",
    "internalRowNumber",
    "internalColumnNumber",
    "externalRowNumber",
    "externalColumnName",
    "locationAttribute",
    "facilityAttribute",
    "zoneAttribute",
    "seatPriorityAttribute",
    "attachedSsr",
    "preferredSeatSsr",
    "controlAttribute",
    "seatPreference",
    "allocatedPassengerType",
    "allowedFareClasses",
    "restrictedFareClasses",
    "seatAssignMentFee"
})
public class SeatDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "SeatNumber")
    protected SeatNumberType seatNumber;
    @XmlElement(name = "InternalRowNumber")
    protected BigInteger internalRowNumber;
    @XmlElement(name = "InternalColumnNumber")
    protected BigInteger internalColumnNumber;
    @XmlElement(name = "ExternalRowNumber")
    protected BigInteger externalRowNumber;
    @XmlElement(name = "ExternalColumnName")
    protected String externalColumnName;
    @XmlElement(name = "LocationAttribute")
    protected List<String> locationAttribute;
    @XmlElement(name = "FacilityAttribute")
    protected List<String> facilityAttribute;
    @XmlElement(name = "ZoneAttribute")
    protected List<String> zoneAttribute;
    @XmlElement(name = "SeatPriorityAttribute")
    protected List<String> seatPriorityAttribute;
    @XmlElement(name = "AttachedSsr")
    protected List<String> attachedSsr;
    @XmlElement(name = "PreferredSeatSsr")
    protected List<String> preferredSeatSsr;
    @XmlElement(name = "ControlAttribute")
    protected String controlAttribute;
    @XmlElement(name = "SeatPreference")
    protected String seatPreference;
    @XmlElement(name = "AllocatedPassengerType")
    protected String allocatedPassengerType;
    @XmlElement(name = "AllowedFareClasses")
    protected List<String> allowedFareClasses;
    @XmlElement(name = "RestrictedFareClasses")
    protected List<String> restrictedFareClasses;
    @XmlElement(name = "SeatAssignMentFee")
    protected List<SeatAssignMentFeeType> seatAssignMentFee;

    /**
     * seatNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SeatNumberType }
     *     
     */
    public SeatNumberType getSeatNumber() {
        return seatNumber;
    }

    /**
     * seatNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatNumberType }
     *     
     */
    public void setSeatNumber(SeatNumberType value) {
        this.seatNumber = value;
    }

    /**
     * internalRowNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInternalRowNumber() {
        return internalRowNumber;
    }

    /**
     * internalRowNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInternalRowNumber(BigInteger value) {
        this.internalRowNumber = value;
    }

    /**
     * internalColumnNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInternalColumnNumber() {
        return internalColumnNumber;
    }

    /**
     * internalColumnNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInternalColumnNumber(BigInteger value) {
        this.internalColumnNumber = value;
    }

    /**
     * externalRowNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExternalRowNumber() {
        return externalRowNumber;
    }

    /**
     * externalRowNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExternalRowNumber(BigInteger value) {
        this.externalRowNumber = value;
    }

    /**
     * externalColumnName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalColumnName() {
        return externalColumnName;
    }

    /**
     * externalColumnName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalColumnName(String value) {
        this.externalColumnName = value;
    }

    /**
     * Gets the value of the locationAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocationAttribute() {
        if (locationAttribute == null) {
            locationAttribute = new ArrayList<String>();
        }
        return this.locationAttribute;
    }

    /**
     * Gets the value of the facilityAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFacilityAttribute() {
        if (facilityAttribute == null) {
            facilityAttribute = new ArrayList<String>();
        }
        return this.facilityAttribute;
    }

    /**
     * Gets the value of the zoneAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoneAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoneAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getZoneAttribute() {
        if (zoneAttribute == null) {
            zoneAttribute = new ArrayList<String>();
        }
        return this.zoneAttribute;
    }

    /**
     * Gets the value of the seatPriorityAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatPriorityAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatPriorityAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeatPriorityAttribute() {
        if (seatPriorityAttribute == null) {
            seatPriorityAttribute = new ArrayList<String>();
        }
        return this.seatPriorityAttribute;
    }

    /**
     * Gets the value of the attachedSsr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachedSsr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachedSsr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAttachedSsr() {
        if (attachedSsr == null) {
            attachedSsr = new ArrayList<String>();
        }
        return this.attachedSsr;
    }

    /**
     * Gets the value of the preferredSeatSsr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredSeatSsr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredSeatSsr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPreferredSeatSsr() {
        if (preferredSeatSsr == null) {
            preferredSeatSsr = new ArrayList<String>();
        }
        return this.preferredSeatSsr;
    }

    /**
     * controlAttribute 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlAttribute() {
        return controlAttribute;
    }

    /**
     * controlAttribute 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlAttribute(String value) {
        this.controlAttribute = value;
    }

    /**
     * seatPreference 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatPreference() {
        return seatPreference;
    }

    /**
     * seatPreference 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatPreference(String value) {
        this.seatPreference = value;
    }

    /**
     * allocatedPassengerType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocatedPassengerType() {
        return allocatedPassengerType;
    }

    /**
     * allocatedPassengerType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocatedPassengerType(String value) {
        this.allocatedPassengerType = value;
    }

    /**
     * Gets the value of the allowedFareClasses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedFareClasses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedFareClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAllowedFareClasses() {
        if (allowedFareClasses == null) {
            allowedFareClasses = new ArrayList<String>();
        }
        return this.allowedFareClasses;
    }

    /**
     * Gets the value of the restrictedFareClasses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictedFareClasses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictedFareClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRestrictedFareClasses() {
        if (restrictedFareClasses == null) {
            restrictedFareClasses = new ArrayList<String>();
        }
        return this.restrictedFareClasses;
    }

    /**
     * Gets the value of the seatAssignMentFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatAssignMentFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatAssignMentFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatAssignMentFeeType }
     * 
     * 
     */
    public List<SeatAssignMentFeeType> getSeatAssignMentFee() {
        if (seatAssignMentFee == null) {
            seatAssignMentFee = new ArrayList<SeatAssignMentFeeType>();
        }
        return this.seatAssignMentFee;
    }

}
