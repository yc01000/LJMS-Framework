//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2021.04.29 시간 12:54:19 PM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>CheckedBaggageDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CheckedBaggageDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExcessWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="WeightAllowance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MaxWeightPerBag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MaxTotalweightAllowed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MaxPieceAllowance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExcessPieces" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Pieces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckedBaggageDetails", propOrder = {
    "excessWeight",
    "weightAllowance",
    "maxWeightPerBag",
    "maxTotalweightAllowed",
    "maxPieceAllowance",
    "excessPieces",
    "pieces",
    "unit",
    "serviceCode"
})
public class CheckedBaggageDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ExcessWeight")
    protected Double excessWeight;
    @XmlElement(name = "WeightAllowance")
    protected Double weightAllowance;
    @XmlElement(name = "MaxWeightPerBag")
    protected Double maxWeightPerBag;
    @XmlElement(name = "MaxTotalweightAllowed")
    protected Double maxTotalweightAllowed;
    @XmlElement(name = "MaxPieceAllowance")
    protected Integer maxPieceAllowance;
    @XmlElement(name = "ExcessPieces")
    protected Double excessPieces;
    @XmlElement(name = "Pieces")
    protected Integer pieces;
    @XmlElement(name = "Unit")
    protected String unit;
    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;

    /**
     * excessWeight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExcessWeight() {
        return excessWeight;
    }

    /**
     * excessWeight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExcessWeight(Double value) {
        this.excessWeight = value;
    }

    /**
     * weightAllowance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeightAllowance() {
        return weightAllowance;
    }

    /**
     * weightAllowance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeightAllowance(Double value) {
        this.weightAllowance = value;
    }

    /**
     * maxWeightPerBag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxWeightPerBag() {
        return maxWeightPerBag;
    }

    /**
     * maxWeightPerBag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxWeightPerBag(Double value) {
        this.maxWeightPerBag = value;
    }

    /**
     * maxTotalweightAllowed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxTotalweightAllowed() {
        return maxTotalweightAllowed;
    }

    /**
     * maxTotalweightAllowed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxTotalweightAllowed(Double value) {
        this.maxTotalweightAllowed = value;
    }

    /**
     * maxPieceAllowance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPieceAllowance() {
        return maxPieceAllowance;
    }

    /**
     * maxPieceAllowance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPieceAllowance(Integer value) {
        this.maxPieceAllowance = value;
    }

    /**
     * excessPieces 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExcessPieces() {
        return excessPieces;
    }

    /**
     * excessPieces 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExcessPieces(Double value) {
        this.excessPieces = value;
    }

    /**
     * pieces 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPieces() {
        return pieces;
    }

    /**
     * pieces 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPieces(Integer value) {
        this.pieces = value;
    }

    /**
     * unit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * unit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * serviceCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * serviceCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

}
