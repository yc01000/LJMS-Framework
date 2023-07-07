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
 * CheckinReportDataCountVO.
 * 
 * <p>CheckinReportDataCountVO complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CheckinReportDataCountVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="MaleCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="FemaleCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ChildCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="InfantCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="BaggageCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="MaleWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FemaleWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ChildWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="InfantWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CheckinStatusType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckInReportOffPointVOs" type="{http://www.ibsplc.com/iRes/simpleTypes/}CheckInReportOffPointVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckinReportDataCountVO", propOrder = {
    "totalCount",
    "maleCount",
    "femaleCount",
    "childCount",
    "infantCount",
    "baggageCount",
    "maleWeight",
    "femaleWeight",
    "childWeight",
    "infantWeight",
    "checkinStatusType",
    "checkInReportOffPointVOs"
})
public class CheckinReportDataCountVO
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "TotalCount")
    protected BigInteger totalCount;
    @XmlElement(name = "MaleCount")
    protected BigInteger maleCount;
    @XmlElement(name = "FemaleCount")
    protected BigInteger femaleCount;
    @XmlElement(name = "ChildCount")
    protected BigInteger childCount;
    @XmlElement(name = "InfantCount")
    protected BigInteger infantCount;
    @XmlElement(name = "BaggageCount")
    protected BigInteger baggageCount;
    @XmlElement(name = "MaleWeight")
    protected Double maleWeight;
    @XmlElement(name = "FemaleWeight")
    protected Double femaleWeight;
    @XmlElement(name = "ChildWeight")
    protected Double childWeight;
    @XmlElement(name = "InfantWeight")
    protected Double infantWeight;
    @XmlElement(name = "CheckinStatusType")
    protected String checkinStatusType;
    @XmlElement(name = "CheckInReportOffPointVOs")
    protected List<CheckInReportOffPointVO> checkInReportOffPointVOs;

    /**
     * totalCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCount() {
        return totalCount;
    }

    /**
     * totalCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCount(BigInteger value) {
        this.totalCount = value;
    }

    /**
     * maleCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleCount() {
        return maleCount;
    }

    /**
     * maleCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleCount(BigInteger value) {
        this.maleCount = value;
    }

    /**
     * femaleCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleCount() {
        return femaleCount;
    }

    /**
     * femaleCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleCount(BigInteger value) {
        this.femaleCount = value;
    }

    /**
     * childCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChildCount() {
        return childCount;
    }

    /**
     * childCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChildCount(BigInteger value) {
        this.childCount = value;
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
     * baggageCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBaggageCount() {
        return baggageCount;
    }

    /**
     * baggageCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBaggageCount(BigInteger value) {
        this.baggageCount = value;
    }

    /**
     * maleWeight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaleWeight() {
        return maleWeight;
    }

    /**
     * maleWeight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaleWeight(Double value) {
        this.maleWeight = value;
    }

    /**
     * femaleWeight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFemaleWeight() {
        return femaleWeight;
    }

    /**
     * femaleWeight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFemaleWeight(Double value) {
        this.femaleWeight = value;
    }

    /**
     * childWeight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getChildWeight() {
        return childWeight;
    }

    /**
     * childWeight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setChildWeight(Double value) {
        this.childWeight = value;
    }

    /**
     * infantWeight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInfantWeight() {
        return infantWeight;
    }

    /**
     * infantWeight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInfantWeight(Double value) {
        this.infantWeight = value;
    }

    /**
     * checkinStatusType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckinStatusType() {
        return checkinStatusType;
    }

    /**
     * checkinStatusType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckinStatusType(String value) {
        this.checkinStatusType = value;
    }

    /**
     * Gets the value of the checkInReportOffPointVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkInReportOffPointVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckInReportOffPointVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckInReportOffPointVO }
     * 
     * 
     */
    public List<CheckInReportOffPointVO> getCheckInReportOffPointVOs() {
        if (checkInReportOffPointVOs == null) {
            checkInReportOffPointVOs = new ArrayList<CheckInReportOffPointVO>();
        }
        return this.checkInReportOffPointVOs;
    }

}
