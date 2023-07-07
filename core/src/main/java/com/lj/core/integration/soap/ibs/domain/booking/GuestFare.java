//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.05.28 시간 08:48:08 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>GuestFare complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GuestFare">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Basis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestType"/>
 *         &lt;element name="BaseFare" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DisplayFare" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AppliedFare" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Surcharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ReturnRestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FareTransactionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InventoryStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestFare", propOrder = {
    "fareID",
    "level",
    "type",
    "subType",
    "typeLocal",
    "basis",
    "fareClass",
    "guestType",
    "baseFare",
    "displayFare",
    "appliedFare",
    "tax",
    "surcharge",
    "returnRestrictionInd",
    "fareTransactionID",
    "inventoryStatus"
})
public class GuestFare {

    @XmlElement(name = "FareID", required = true)
    protected String fareID;
    @XmlElement(name = "Level", required = true, nillable = true)
    protected String level;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "SubType")
    protected String subType;
    @XmlElement(name = "TypeLocal")
    protected String typeLocal;
    @XmlElement(name = "Basis", required = true)
    protected String basis;
    @XmlElement(name = "FareClass", required = true)
    protected String fareClass;
    @XmlElement(name = "GuestType", required = true)
    @XmlSchemaType(name = "string")
    protected GuestType guestType;
    @XmlElement(name = "BaseFare")
    protected double baseFare;
    @XmlElement(name = "DisplayFare")
    protected double displayFare;
    @XmlElement(name = "AppliedFare")
    protected double appliedFare;
    @XmlElement(name = "Tax")
    protected double tax;
    @XmlElement(name = "Surcharge")
    protected double surcharge;
    @XmlElement(name = "ReturnRestrictionInd")
    protected Boolean returnRestrictionInd;
    @XmlElement(name = "FareTransactionID")
    protected Long fareTransactionID;
    @XmlElement(name = "InventoryStatus", required = true)
    protected String inventoryStatus;

    /**
     * fareID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareID() {
        return fareID;
    }

    /**
     * fareID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareID(String value) {
        this.fareID = value;
    }

    /**
     * level 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * level 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * subType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * subType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * typeLocal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeLocal() {
        return typeLocal;
    }

    /**
     * typeLocal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeLocal(String value) {
        this.typeLocal = value;
    }

    /**
     * basis 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasis() {
        return basis;
    }

    /**
     * basis 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasis(String value) {
        this.basis = value;
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
     * guestType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GuestType }
     *     
     */
    public GuestType getGuestType() {
        return guestType;
    }

    /**
     * guestType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestType }
     *     
     */
    public void setGuestType(GuestType value) {
        this.guestType = value;
    }

    /**
     * baseFare 속성의 값을 가져옵니다.
     * 
     */
    public double getBaseFare() {
        return baseFare;
    }

    /**
     * baseFare 속성의 값을 설정합니다.
     * 
     */
    public void setBaseFare(double value) {
        this.baseFare = value;
    }

    /**
     * displayFare 속성의 값을 가져옵니다.
     * 
     */
    public double getDisplayFare() {
        return displayFare;
    }

    /**
     * displayFare 속성의 값을 설정합니다.
     * 
     */
    public void setDisplayFare(double value) {
        this.displayFare = value;
    }

    /**
     * appliedFare 속성의 값을 가져옵니다.
     * 
     */
    public double getAppliedFare() {
        return appliedFare;
    }

    /**
     * appliedFare 속성의 값을 설정합니다.
     * 
     */
    public void setAppliedFare(double value) {
        this.appliedFare = value;
    }

    /**
     * tax 속성의 값을 가져옵니다.
     * 
     */
    public double getTax() {
        return tax;
    }

    /**
     * tax 속성의 값을 설정합니다.
     * 
     */
    public void setTax(double value) {
        this.tax = value;
    }

    /**
     * surcharge 속성의 값을 가져옵니다.
     * 
     */
    public double getSurcharge() {
        return surcharge;
    }

    /**
     * surcharge 속성의 값을 설정합니다.
     * 
     */
    public void setSurcharge(double value) {
        this.surcharge = value;
    }

    /**
     * returnRestrictionInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnRestrictionInd() {
        return returnRestrictionInd;
    }

    /**
     * returnRestrictionInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnRestrictionInd(Boolean value) {
        this.returnRestrictionInd = value;
    }

    /**
     * fareTransactionID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFareTransactionID() {
        return fareTransactionID;
    }

    /**
     * fareTransactionID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFareTransactionID(Long value) {
        this.fareTransactionID = value;
    }

    /**
     * inventoryStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryStatus() {
        return inventoryStatus;
    }

    /**
     * inventoryStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryStatus(String value) {
        this.inventoryStatus = value;
    }

}
