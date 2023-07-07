//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2021.04.29 시간 12:54:19 PM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

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
 * <p>SeatMapInformation complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SeatMapInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SeatMapdetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatMapDetailsType"/&gt;
 *         &lt;element name="LocationAttribute" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FacilityAttributes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ZoneAttributes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SeatPriorityAttributes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "facilityAttributes",
    "zoneAttributes",
    "seatPriorityAttributes",
    "attachedSsr",
    "maximumInfantsPerUnit"
})
public class SeatMapInformation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "SeatMapdetails", required = true)
    protected SeatMapDetailsType seatMapdetails;
    @XmlElement(name = "LocationAttribute")
    protected List<String> locationAttribute;
    @XmlElement(name = "FacilityAttributes", required = true)
    protected List<String> facilityAttributes;
    @XmlElement(name = "ZoneAttributes")
    protected List<String> zoneAttributes;
    @XmlElement(name = "SeatPriorityAttributes")
    protected List<String> seatPriorityAttributes;
    @XmlElement(name = "AttachedSsr")
    protected List<String> attachedSsr;
    @XmlElement(name = "MaximumInfantsPerUnit")
    protected BigInteger maximumInfantsPerUnit;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;

    /**
     * seatMapdetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SeatMapDetailsType }
     *     
     */
    public SeatMapDetailsType getSeatMapdetails() {
        return seatMapdetails;
    }

    /**
     * seatMapdetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatMapDetailsType }
     *     
     */
    public void setSeatMapdetails(SeatMapDetailsType value) {
        this.seatMapdetails = value;
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
     * Gets the value of the facilityAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFacilityAttributes() {
        if (facilityAttributes == null) {
            facilityAttributes = new ArrayList<String>();
        }
        return this.facilityAttributes;
    }

    /**
     * Gets the value of the zoneAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoneAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoneAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getZoneAttributes() {
        if (zoneAttributes == null) {
            zoneAttributes = new ArrayList<String>();
        }
        return this.zoneAttributes;
    }

    /**
     * Gets the value of the seatPriorityAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatPriorityAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatPriorityAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeatPriorityAttributes() {
        if (seatPriorityAttributes == null) {
            seatPriorityAttributes = new ArrayList<String>();
        }
        return this.seatPriorityAttributes;
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
