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
 * <p>LowFaresType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="LowFaresType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FareType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="faretypelocallang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsOnward" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FlightDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="BaseFareAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalFare" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CombinedPaxDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FareDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FareLevelCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaxDiscountString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalSurcharge" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FareDisplayCurrencyDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareDisplayCurrencyDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LowFaresType", propOrder = {
    "fareType",
    "faretypelocallang",
    "currency",
    "isOnward",
    "flightDate",
    "baseFareAmount",
    "totalFare",
    "combinedPaxDiscount",
    "fareDiscount",
    "fareBasisCode",
    "fareLevelCode",
    "cabinClass",
    "fareClass",
    "paxDiscountString",
    "displayAmount",
    "totalTax",
    "totalSurcharge",
    "fareDisplayCurrencyDetails"
})
public class LowFaresType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FareType", required = true)
    protected String fareType;
    protected String faretypelocallang;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "IsOnward")
    protected boolean isOnward;
    @XmlElement(name = "FlightDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar flightDate;
    @XmlElement(name = "BaseFareAmount")
    protected double baseFareAmount;
    @XmlElement(name = "TotalFare")
    protected double totalFare;
    @XmlElement(name = "CombinedPaxDiscount")
    protected double combinedPaxDiscount;
    @XmlElement(name = "FareDiscount")
    protected double fareDiscount;
    @XmlElement(name = "FareBasisCode", required = true)
    protected String fareBasisCode;
    @XmlElement(name = "FareLevelCode", required = true)
    protected String fareLevelCode;
    @XmlElement(name = "CabinClass", required = true)
    protected String cabinClass;
    @XmlElement(name = "FareClass", required = true)
    protected String fareClass;
    @XmlElement(name = "PaxDiscountString")
    protected String paxDiscountString;
    @XmlElement(name = "DisplayAmount")
    protected double displayAmount;
    @XmlElement(name = "TotalTax")
    protected double totalTax;
    @XmlElement(name = "TotalSurcharge")
    protected double totalSurcharge;
    @XmlElement(name = "FareDisplayCurrencyDetails")
    protected List<FareDisplayCurrencyDetailsType> fareDisplayCurrencyDetails;

    /**
     * fareType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareType() {
        return fareType;
    }

    /**
     * fareType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareType(String value) {
        this.fareType = value;
    }

    /**
     * faretypelocallang 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaretypelocallang() {
        return faretypelocallang;
    }

    /**
     * faretypelocallang 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaretypelocallang(String value) {
        this.faretypelocallang = value;
    }

    /**
     * currency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * currency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * isOnward 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsOnward() {
        return isOnward;
    }

    /**
     * isOnward 속성의 값을 설정합니다.
     * 
     */
    public void setIsOnward(boolean value) {
        this.isOnward = value;
    }

    /**
     * flightDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlightDate() {
        return flightDate;
    }

    /**
     * flightDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlightDate(XMLGregorianCalendar value) {
        this.flightDate = value;
    }

    /**
     * baseFareAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getBaseFareAmount() {
        return baseFareAmount;
    }

    /**
     * baseFareAmount 속성의 값을 설정합니다.
     * 
     */
    public void setBaseFareAmount(double value) {
        this.baseFareAmount = value;
    }

    /**
     * totalFare 속성의 값을 가져옵니다.
     * 
     */
    public double getTotalFare() {
        return totalFare;
    }

    /**
     * totalFare 속성의 값을 설정합니다.
     * 
     */
    public void setTotalFare(double value) {
        this.totalFare = value;
    }

    /**
     * combinedPaxDiscount 속성의 값을 가져옵니다.
     * 
     */
    public double getCombinedPaxDiscount() {
        return combinedPaxDiscount;
    }

    /**
     * combinedPaxDiscount 속성의 값을 설정합니다.
     * 
     */
    public void setCombinedPaxDiscount(double value) {
        this.combinedPaxDiscount = value;
    }

    /**
     * fareDiscount 속성의 값을 가져옵니다.
     * 
     */
    public double getFareDiscount() {
        return fareDiscount;
    }

    /**
     * fareDiscount 속성의 값을 설정합니다.
     * 
     */
    public void setFareDiscount(double value) {
        this.fareDiscount = value;
    }

    /**
     * fareBasisCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * fareBasisCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * fareLevelCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareLevelCode() {
        return fareLevelCode;
    }

    /**
     * fareLevelCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareLevelCode(String value) {
        this.fareLevelCode = value;
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
     * paxDiscountString 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxDiscountString() {
        return paxDiscountString;
    }

    /**
     * paxDiscountString 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxDiscountString(String value) {
        this.paxDiscountString = value;
    }

    /**
     * displayAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getDisplayAmount() {
        return displayAmount;
    }

    /**
     * displayAmount 속성의 값을 설정합니다.
     * 
     */
    public void setDisplayAmount(double value) {
        this.displayAmount = value;
    }

    /**
     * totalTax 속성의 값을 가져옵니다.
     * 
     */
    public double getTotalTax() {
        return totalTax;
    }

    /**
     * totalTax 속성의 값을 설정합니다.
     * 
     */
    public void setTotalTax(double value) {
        this.totalTax = value;
    }

    /**
     * totalSurcharge 속성의 값을 가져옵니다.
     * 
     */
    public double getTotalSurcharge() {
        return totalSurcharge;
    }

    /**
     * totalSurcharge 속성의 값을 설정합니다.
     * 
     */
    public void setTotalSurcharge(double value) {
        this.totalSurcharge = value;
    }

    /**
     * Gets the value of the fareDisplayCurrencyDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDisplayCurrencyDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDisplayCurrencyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDisplayCurrencyDetailsType }
     * 
     * 
     */
    public List<FareDisplayCurrencyDetailsType> getFareDisplayCurrencyDetails() {
        if (fareDisplayCurrencyDetails == null) {
            fareDisplayCurrencyDetails = new ArrayList<FareDisplayCurrencyDetailsType>();
        }
        return this.fareDisplayCurrencyDetails;
    }

}
