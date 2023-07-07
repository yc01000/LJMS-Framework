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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Manifest Information of the flight.
 * 
 * <p>CustomerManifestInformation complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerManifestInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ETD" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ManifestedCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CheckedinCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="NoShowCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="JumpSeatCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="StandbyCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ClearedStandbyCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ThroughManifestedCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ThroughCheckedinCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ThroughNoShowCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ChildManifested" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ChildCheckedin" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="FemaleManifested" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="FemaleCheckedin" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="MaleManifested" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="MaleCheckedin" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TotalManifestedCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TotalCheckedinCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="InfManifested" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="InfCheckedin" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TotalHeadsOnBoard" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ZoneInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}ZoneInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerManifestPaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomerManifestPaxType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerManifestInformation", propOrder = {
    "etd",
    "manifestedCount",
    "checkedinCount",
    "noShowCount",
    "jumpSeatCount",
    "standbyCount",
    "clearedStandbyCount",
    "throughManifestedCount",
    "throughCheckedinCount",
    "throughNoShowCount",
    "childManifested",
    "childCheckedin",
    "femaleManifested",
    "femaleCheckedin",
    "maleManifested",
    "maleCheckedin",
    "totalManifestedCount",
    "totalCheckedinCount",
    "infManifested",
    "infCheckedin",
    "totalHeadsOnBoard",
    "zoneInformation",
    "customerManifestPaxDetails"
})
public class CustomerManifestInformation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ETD")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar etd;
    @XmlElement(name = "ManifestedCount", required = true)
    protected BigInteger manifestedCount;
    @XmlElement(name = "CheckedinCount", required = true)
    protected BigInteger checkedinCount;
    @XmlElement(name = "NoShowCount", required = true)
    protected BigInteger noShowCount;
    @XmlElement(name = "JumpSeatCount", required = true)
    protected BigInteger jumpSeatCount;
    @XmlElement(name = "StandbyCount", required = true)
    protected BigInteger standbyCount;
    @XmlElement(name = "ClearedStandbyCount", required = true)
    protected BigInteger clearedStandbyCount;
    @XmlElement(name = "ThroughManifestedCount", required = true)
    protected BigInteger throughManifestedCount;
    @XmlElement(name = "ThroughCheckedinCount", required = true)
    protected BigInteger throughCheckedinCount;
    @XmlElement(name = "ThroughNoShowCount", required = true)
    protected BigInteger throughNoShowCount;
    @XmlElement(name = "ChildManifested", required = true)
    protected BigInteger childManifested;
    @XmlElement(name = "ChildCheckedin", required = true)
    protected BigInteger childCheckedin;
    @XmlElement(name = "FemaleManifested", required = true)
    protected BigInteger femaleManifested;
    @XmlElement(name = "FemaleCheckedin", required = true)
    protected BigInteger femaleCheckedin;
    @XmlElement(name = "MaleManifested", required = true)
    protected BigInteger maleManifested;
    @XmlElement(name = "MaleCheckedin", required = true)
    protected BigInteger maleCheckedin;
    @XmlElement(name = "TotalManifestedCount", required = true)
    protected BigInteger totalManifestedCount;
    @XmlElement(name = "TotalCheckedinCount", required = true)
    protected BigInteger totalCheckedinCount;
    @XmlElement(name = "InfManifested", required = true)
    protected BigInteger infManifested;
    @XmlElement(name = "InfCheckedin", required = true)
    protected BigInteger infCheckedin;
    @XmlElement(name = "TotalHeadsOnBoard", required = true)
    protected BigInteger totalHeadsOnBoard;
    @XmlElement(name = "ZoneInformation")
    protected List<ZoneInfoType> zoneInformation;
    @XmlElement(name = "CustomerManifestPaxDetails")
    protected List<CustomerManifestPaxType> customerManifestPaxDetails;

    /**
     * etd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETD() {
        return etd;
    }

    /**
     * etd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETD(XMLGregorianCalendar value) {
        this.etd = value;
    }

    /**
     * manifestedCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getManifestedCount() {
        return manifestedCount;
    }

    /**
     * manifestedCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setManifestedCount(BigInteger value) {
        this.manifestedCount = value;
    }

    /**
     * checkedinCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCheckedinCount() {
        return checkedinCount;
    }

    /**
     * checkedinCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCheckedinCount(BigInteger value) {
        this.checkedinCount = value;
    }

    /**
     * noShowCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoShowCount() {
        return noShowCount;
    }

    /**
     * noShowCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoShowCount(BigInteger value) {
        this.noShowCount = value;
    }

    /**
     * jumpSeatCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJumpSeatCount() {
        return jumpSeatCount;
    }

    /**
     * jumpSeatCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJumpSeatCount(BigInteger value) {
        this.jumpSeatCount = value;
    }

    /**
     * standbyCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStandbyCount() {
        return standbyCount;
    }

    /**
     * standbyCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStandbyCount(BigInteger value) {
        this.standbyCount = value;
    }

    /**
     * clearedStandbyCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClearedStandbyCount() {
        return clearedStandbyCount;
    }

    /**
     * clearedStandbyCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClearedStandbyCount(BigInteger value) {
        this.clearedStandbyCount = value;
    }

    /**
     * throughManifestedCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThroughManifestedCount() {
        return throughManifestedCount;
    }

    /**
     * throughManifestedCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThroughManifestedCount(BigInteger value) {
        this.throughManifestedCount = value;
    }

    /**
     * throughCheckedinCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThroughCheckedinCount() {
        return throughCheckedinCount;
    }

    /**
     * throughCheckedinCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThroughCheckedinCount(BigInteger value) {
        this.throughCheckedinCount = value;
    }

    /**
     * throughNoShowCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThroughNoShowCount() {
        return throughNoShowCount;
    }

    /**
     * throughNoShowCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThroughNoShowCount(BigInteger value) {
        this.throughNoShowCount = value;
    }

    /**
     * childManifested 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChildManifested() {
        return childManifested;
    }

    /**
     * childManifested 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChildManifested(BigInteger value) {
        this.childManifested = value;
    }

    /**
     * childCheckedin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChildCheckedin() {
        return childCheckedin;
    }

    /**
     * childCheckedin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChildCheckedin(BigInteger value) {
        this.childCheckedin = value;
    }

    /**
     * femaleManifested 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleManifested() {
        return femaleManifested;
    }

    /**
     * femaleManifested 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleManifested(BigInteger value) {
        this.femaleManifested = value;
    }

    /**
     * femaleCheckedin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleCheckedin() {
        return femaleCheckedin;
    }

    /**
     * femaleCheckedin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleCheckedin(BigInteger value) {
        this.femaleCheckedin = value;
    }

    /**
     * maleManifested 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleManifested() {
        return maleManifested;
    }

    /**
     * maleManifested 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleManifested(BigInteger value) {
        this.maleManifested = value;
    }

    /**
     * maleCheckedin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleCheckedin() {
        return maleCheckedin;
    }

    /**
     * maleCheckedin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleCheckedin(BigInteger value) {
        this.maleCheckedin = value;
    }

    /**
     * totalManifestedCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalManifestedCount() {
        return totalManifestedCount;
    }

    /**
     * totalManifestedCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalManifestedCount(BigInteger value) {
        this.totalManifestedCount = value;
    }

    /**
     * totalCheckedinCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCheckedinCount() {
        return totalCheckedinCount;
    }

    /**
     * totalCheckedinCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCheckedinCount(BigInteger value) {
        this.totalCheckedinCount = value;
    }

    /**
     * infManifested 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInfManifested() {
        return infManifested;
    }

    /**
     * infManifested 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInfManifested(BigInteger value) {
        this.infManifested = value;
    }

    /**
     * infCheckedin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInfCheckedin() {
        return infCheckedin;
    }

    /**
     * infCheckedin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInfCheckedin(BigInteger value) {
        this.infCheckedin = value;
    }

    /**
     * totalHeadsOnBoard 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalHeadsOnBoard() {
        return totalHeadsOnBoard;
    }

    /**
     * totalHeadsOnBoard 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalHeadsOnBoard(BigInteger value) {
        this.totalHeadsOnBoard = value;
    }

    /**
     * Gets the value of the zoneInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoneInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoneInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZoneInfoType }
     * 
     * 
     */
    public List<ZoneInfoType> getZoneInformation() {
        if (zoneInformation == null) {
            zoneInformation = new ArrayList<ZoneInfoType>();
        }
        return this.zoneInformation;
    }

    /**
     * Gets the value of the customerManifestPaxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerManifestPaxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerManifestPaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerManifestPaxType }
     * 
     * 
     */
    public List<CustomerManifestPaxType> getCustomerManifestPaxDetails() {
        if (customerManifestPaxDetails == null) {
            customerManifestPaxDetails = new ArrayList<CustomerManifestPaxType>();
        }
        return this.customerManifestPaxDetails;
    }

}
