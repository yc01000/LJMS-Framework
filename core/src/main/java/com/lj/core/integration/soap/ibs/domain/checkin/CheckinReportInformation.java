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
 * Checkin Report.
 * 
 * <p>CheckinReportInformation complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CheckinReportInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightIdentifier" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="BoardPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FlightCapacity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="InfantCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="FlightLid" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="GuestCountFromAirport" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CheckinReportDataCountVOs" type="{http://www.ibsplc.com/iRes/simpleTypes/}CheckinReportDataCountVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FlightRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OffPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaleWt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FemaleWt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ChildWt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="InfantWt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UnitMaleWt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UnitFemaleWt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UnitChildWt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UnitInfantWt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BoardPointOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CheckinReportGuestDetailsVOs" type="{http://www.ibsplc.com/iRes/simpleTypes/}CheckinReportGuestDetailsVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckinReportInformation", propOrder = {
    "flightIdentifier",
    "boardPoint",
    "flightCapacity",
    "infantCount",
    "flightLid",
    "guestCountFromAirport",
    "checkinReportDataCountVOs",
    "flightRoute",
    "offPoint",
    "maleWt",
    "femaleWt",
    "childWt",
    "infantWt",
    "unitMaleWt",
    "unitFemaleWt",
    "unitChildWt",
    "unitInfantWt",
    "boardPointOrder",
    "checkinReportGuestDetailsVOs",
    "cabinClass"
})
public class CheckinReportInformation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FlightIdentifier")
    protected FlightIdentifierType flightIdentifier;
    @XmlElement(name = "BoardPoint")
    protected String boardPoint;
    @XmlElement(name = "FlightCapacity")
    protected BigInteger flightCapacity;
    @XmlElement(name = "InfantCount")
    protected BigInteger infantCount;
    @XmlElement(name = "FlightLid")
    protected BigInteger flightLid;
    @XmlElement(name = "GuestCountFromAirport")
    protected BigInteger guestCountFromAirport;
    @XmlElement(name = "CheckinReportDataCountVOs")
    protected List<CheckinReportDataCountVO> checkinReportDataCountVOs;
    @XmlElement(name = "FlightRoute")
    protected String flightRoute;
    @XmlElement(name = "OffPoint")
    protected String offPoint;
    @XmlElement(name = "MaleWt")
    protected Double maleWt;
    @XmlElement(name = "FemaleWt")
    protected Double femaleWt;
    @XmlElement(name = "ChildWt")
    protected Double childWt;
    @XmlElement(name = "InfantWt")
    protected Double infantWt;
    @XmlElement(name = "UnitMaleWt")
    protected Double unitMaleWt;
    @XmlElement(name = "UnitFemaleWt")
    protected Double unitFemaleWt;
    @XmlElement(name = "UnitChildWt")
    protected Double unitChildWt;
    @XmlElement(name = "UnitInfantWt")
    protected Double unitInfantWt;
    @XmlElement(name = "BoardPointOrder")
    protected BigInteger boardPointOrder;
    @XmlElement(name = "CheckinReportGuestDetailsVOs")
    protected List<CheckinReportGuestDetailsVO> checkinReportGuestDetailsVOs;
    @XmlElement(name = "CabinClass")
    protected String cabinClass;

    /**
     * flightIdentifier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightIdentifierType }
     *     
     */
    public FlightIdentifierType getFlightIdentifier() {
        return flightIdentifier;
    }

    /**
     * flightIdentifier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightIdentifierType }
     *     
     */
    public void setFlightIdentifier(FlightIdentifierType value) {
        this.flightIdentifier = value;
    }

    /**
     * boardPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardPoint() {
        return boardPoint;
    }

    /**
     * boardPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardPoint(String value) {
        this.boardPoint = value;
    }

    /**
     * flightCapacity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlightCapacity() {
        return flightCapacity;
    }

    /**
     * flightCapacity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlightCapacity(BigInteger value) {
        this.flightCapacity = value;
    }

    /**
     * infantCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInfantCount() {
        return infantCount;
    }

    /**
     * infantCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInfantCount(BigInteger value) {
        this.infantCount = value;
    }

    /**
     * flightLid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlightLid() {
        return flightLid;
    }

    /**
     * flightLid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlightLid(BigInteger value) {
        this.flightLid = value;
    }

    /**
     * guestCountFromAirport 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGuestCountFromAirport() {
        return guestCountFromAirport;
    }

    /**
     * guestCountFromAirport 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGuestCountFromAirport(BigInteger value) {
        this.guestCountFromAirport = value;
    }

    /**
     * Gets the value of the checkinReportDataCountVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkinReportDataCountVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckinReportDataCountVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckinReportDataCountVO }
     * 
     * 
     */
    public List<CheckinReportDataCountVO> getCheckinReportDataCountVOs() {
        if (checkinReportDataCountVOs == null) {
            checkinReportDataCountVOs = new ArrayList<CheckinReportDataCountVO>();
        }
        return this.checkinReportDataCountVOs;
    }

    /**
     * flightRoute 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightRoute() {
        return flightRoute;
    }

    /**
     * flightRoute 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightRoute(String value) {
        this.flightRoute = value;
    }

    /**
     * offPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPoint() {
        return offPoint;
    }

    /**
     * offPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPoint(String value) {
        this.offPoint = value;
    }

    /**
     * maleWt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaleWt() {
        return maleWt;
    }

    /**
     * maleWt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaleWt(Double value) {
        this.maleWt = value;
    }

    /**
     * femaleWt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFemaleWt() {
        return femaleWt;
    }

    /**
     * femaleWt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFemaleWt(Double value) {
        this.femaleWt = value;
    }

    /**
     * childWt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getChildWt() {
        return childWt;
    }

    /**
     * childWt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setChildWt(Double value) {
        this.childWt = value;
    }

    /**
     * infantWt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInfantWt() {
        return infantWt;
    }

    /**
     * infantWt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInfantWt(Double value) {
        this.infantWt = value;
    }

    /**
     * unitMaleWt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitMaleWt() {
        return unitMaleWt;
    }

    /**
     * unitMaleWt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitMaleWt(Double value) {
        this.unitMaleWt = value;
    }

    /**
     * unitFemaleWt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitFemaleWt() {
        return unitFemaleWt;
    }

    /**
     * unitFemaleWt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitFemaleWt(Double value) {
        this.unitFemaleWt = value;
    }

    /**
     * unitChildWt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitChildWt() {
        return unitChildWt;
    }

    /**
     * unitChildWt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitChildWt(Double value) {
        this.unitChildWt = value;
    }

    /**
     * unitInfantWt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitInfantWt() {
        return unitInfantWt;
    }

    /**
     * unitInfantWt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitInfantWt(Double value) {
        this.unitInfantWt = value;
    }

    /**
     * boardPointOrder 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBoardPointOrder() {
        return boardPointOrder;
    }

    /**
     * boardPointOrder 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBoardPointOrder(BigInteger value) {
        this.boardPointOrder = value;
    }

    /**
     * Gets the value of the checkinReportGuestDetailsVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkinReportGuestDetailsVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckinReportGuestDetailsVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckinReportGuestDetailsVO }
     * 
     * 
     */
    public List<CheckinReportGuestDetailsVO> getCheckinReportGuestDetailsVOs() {
        if (checkinReportGuestDetailsVOs == null) {
            checkinReportGuestDetailsVOs = new ArrayList<CheckinReportGuestDetailsVO>();
        }
        return this.checkinReportGuestDetailsVOs;
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

}
