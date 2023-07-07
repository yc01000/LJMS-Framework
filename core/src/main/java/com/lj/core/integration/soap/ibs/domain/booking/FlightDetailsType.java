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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>FlightDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FlightDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FareLevel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BaseFareAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalFare" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CombinedPaxDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FareAfterDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FareID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlightGroups" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightGroupType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PaxDiscountString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RouteString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TotalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalSurchargeAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightDetailsType", propOrder = {
    "fareBasis",
    "fareClass",
    "fareLevel",
    "currency",
    "baseFareAmount",
    "totalFare",
    "combinedPaxDiscount",
    "discount",
    "fareAfterDiscount",
    "cabinClass",
    "fareID",
    "flightGroups",
    "paxDiscountString",
    "routeString",
    "totalTaxAmount",
    "totalSurchargeAmount"
})
public class FlightDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FareBasis", required = true)
    protected String fareBasis;
    @XmlElement(name = "FareClass", required = true)
    protected String fareClass;
    @XmlElement(name = "FareLevel", required = true)
    protected String fareLevel;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "BaseFareAmount")
    protected double baseFareAmount;
    @XmlElement(name = "TotalFare")
    protected double totalFare;
    @XmlElement(name = "CombinedPaxDiscount")
    protected double combinedPaxDiscount;
    @XmlElement(name = "Discount")
    protected double discount;
    @XmlElement(name = "FareAfterDiscount")
    protected double fareAfterDiscount;
    @XmlElement(name = "CabinClass", required = true)
    protected String cabinClass;
    @XmlElement(name = "FareID", required = true)
    protected String fareID;
    @XmlElement(name = "FlightGroups", required = true)
    protected List<FlightGroupType> flightGroups;
    @XmlElement(name = "PaxDiscountString", required = true)
    protected String paxDiscountString;
    @XmlElement(name = "RouteString", required = true)
    protected String routeString;
    @XmlElement(name = "TotalTaxAmount")
    protected double totalTaxAmount;
    @XmlElement(name = "TotalSurchargeAmount")
    protected double totalSurchargeAmount;

    /**
     * fareBasis 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * fareBasis 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
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
     * fareLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareLevel() {
        return fareLevel;
    }

    /**
     * fareLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareLevel(String value) {
        this.fareLevel = value;
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
     * discount 속성의 값을 가져옵니다.
     * 
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * discount 속성의 값을 설정합니다.
     * 
     */
    public void setDiscount(double value) {
        this.discount = value;
    }

    /**
     * fareAfterDiscount 속성의 값을 가져옵니다.
     * 
     */
    public double getFareAfterDiscount() {
        return fareAfterDiscount;
    }

    /**
     * fareAfterDiscount 속성의 값을 설정합니다.
     * 
     */
    public void setFareAfterDiscount(double value) {
        this.fareAfterDiscount = value;
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
     * Gets the value of the flightGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightGroupType }
     * 
     * 
     */
    public List<FlightGroupType> getFlightGroups() {
        if (flightGroups == null) {
            flightGroups = new ArrayList<FlightGroupType>();
        }
        return this.flightGroups;
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
     * routeString 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteString() {
        return routeString;
    }

    /**
     * routeString 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteString(String value) {
        this.routeString = value;
    }

    /**
     * totalTaxAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * totalTaxAmount 속성의 값을 설정합니다.
     * 
     */
    public void setTotalTaxAmount(double value) {
        this.totalTaxAmount = value;
    }

    /**
     * totalSurchargeAmount 속성의 값을 가져옵니다.
     * 
     */
    public double getTotalSurchargeAmount() {
        return totalSurchargeAmount;
    }

    /**
     * totalSurchargeAmount 속성의 값을 설정합니다.
     * 
     */
    public void setTotalSurchargeAmount(double value) {
        this.totalSurchargeAmount = value;
    }

}
