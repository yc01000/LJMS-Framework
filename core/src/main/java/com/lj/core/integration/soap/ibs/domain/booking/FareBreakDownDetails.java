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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>FareBreakDownDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FareBreakDownDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OandDID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fareclass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShowFareBasisIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BaseFare" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="BaseFareCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AppliedFare" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="AppliedFareCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SurchargeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SurchargeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HiddenFareIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "FareBreakDownDetails", propOrder = {
    "oandDID",
    "fareBasis",
    "fareType",
    "fareclass",
    "showFareBasisIndicator",
    "baseFare",
    "baseFareCurrency",
    "appliedFare",
    "appliedFareCurrency",
    "taxDetails",
    "surchargeDetails",
    "hiddenFareIndicator"
})
public class FareBreakDownDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "OandDID")
    protected long oandDID;
    @XmlElement(name = "FareBasis", required = true)
    protected String fareBasis;
    @XmlElement(name = "FareType")
    protected String fareType;
    @XmlElement(name = "Fareclass", required = true)
    protected String fareclass;
    @XmlElement(name = "ShowFareBasisIndicator", required = true)
    protected String showFareBasisIndicator;
    @XmlElement(name = "BaseFare")
    protected double baseFare;
    @XmlElement(name = "BaseFareCurrency", required = true)
    protected String baseFareCurrency;
    @XmlElement(name = "AppliedFare")
    protected double appliedFare;
    @XmlElement(name = "AppliedFareCurrency", required = true)
    protected String appliedFareCurrency;
    @XmlElement(name = "TaxDetails")
    protected List<TaxDetails> taxDetails;
    @XmlElement(name = "SurchargeDetails")
    protected List<SurchargeDetails> surchargeDetails;
    @XmlElement(name = "HiddenFareIndicator", required = true)
    protected String hiddenFareIndicator;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;

    /**
     * oandDID 속성의 값을 가져옵니다.
     * 
     */
    public long getOandDID() {
        return oandDID;
    }

    /**
     * oandDID 속성의 값을 설정합니다.
     * 
     */
    public void setOandDID(long value) {
        this.oandDID = value;
    }

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
     * fareclass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareclass() {
        return fareclass;
    }

    /**
     * fareclass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareclass(String value) {
        this.fareclass = value;
    }

    /**
     * showFareBasisIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowFareBasisIndicator() {
        return showFareBasisIndicator;
    }

    /**
     * showFareBasisIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowFareBasisIndicator(String value) {
        this.showFareBasisIndicator = value;
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
     * baseFareCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseFareCurrency() {
        return baseFareCurrency;
    }

    /**
     * baseFareCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseFareCurrency(String value) {
        this.baseFareCurrency = value;
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
     * appliedFareCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliedFareCurrency() {
        return appliedFareCurrency;
    }

    /**
     * appliedFareCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliedFareCurrency(String value) {
        this.appliedFareCurrency = value;
    }

    /**
     * Gets the value of the taxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetails }
     * 
     * 
     */
    public List<TaxDetails> getTaxDetails() {
        if (taxDetails == null) {
            taxDetails = new ArrayList<TaxDetails>();
        }
        return this.taxDetails;
    }

    /**
     * Gets the value of the surchargeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surchargeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurchargeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurchargeDetails }
     * 
     * 
     */
    public List<SurchargeDetails> getSurchargeDetails() {
        if (surchargeDetails == null) {
            surchargeDetails = new ArrayList<SurchargeDetails>();
        }
        return this.surchargeDetails;
    }

    /**
     * hiddenFareIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiddenFareIndicator() {
        return hiddenFareIndicator;
    }

    /**
     * hiddenFareIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiddenFareIndicator(String value) {
        this.hiddenFareIndicator = value;
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
