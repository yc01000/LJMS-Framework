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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 *  Detailed information about the seatMap
 * 
 * <p>SeatMapInformation complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SeatMapInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SeatMapdetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatMapDetailsType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LocationAttribute" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FacilityAttribute" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ZoneAttribute" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SeatPriorityAttribute" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AttachedSsr" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaximumInfantsPerUnit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RichContentRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatMapInformation", propOrder = {
    "seatMapdetails",
    "locationAttribute",
    "facilityAttribute",
    "zoneAttribute",
    "seatPriorityAttribute",
    "attachedSsr",
    "maximumInfantsPerUnit"
})
public class SeatMapInformation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "SeatMapdetails", required = true)
    protected List<SeatMapDetailsType> seatMapdetails;
    @XmlElement(name = "LocationAttribute")
    protected List<String> locationAttribute;
    @XmlElement(name = "FacilityAttribute", required = true)
    protected List<String> facilityAttribute;
    @XmlElement(name = "ZoneAttribute")
    protected List<String> zoneAttribute;
    @XmlElement(name = "SeatPriorityAttribute")
    protected List<String> seatPriorityAttribute;
    @XmlElement(name = "AttachedSsr")
    protected List<String> attachedSsr;
    @XmlElement(name = "MaximumInfantsPerUnit")
    protected BigInteger maximumInfantsPerUnit;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;

    /**
     * Gets the value of the seatMapdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatMapdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatMapdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatMapDetailsType }
     * 
     * 
     */
    public List<SeatMapDetailsType> getSeatMapdetails() {
        if (seatMapdetails == null) {
            seatMapdetails = new ArrayList<SeatMapDetailsType>();
        }
        return this.seatMapdetails;
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
     * maximumInfantsPerUnit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumInfantsPerUnit() {
        return maximumInfantsPerUnit;
    }

    /**
     * maximumInfantsPerUnit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumInfantsPerUnit(BigInteger value) {
        this.maximumInfantsPerUnit = value;
    }

    /**
     * richContentRef 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRichContentRef() {
        return richContentRef;
    }

    /**
     * richContentRef 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRichContentRef(String value) {
        this.richContentRef = value;
    }

}
