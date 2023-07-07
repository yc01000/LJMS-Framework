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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Holds the Pax Baggage Allowance Information such as Weight Allowance and Piece Allowance.
 * 
 * <p>PassengerBaggageAllowanceType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PassengerBaggageAllowanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaggageCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WeightAllowance" type="{http://www.ibsplc.com/iRes/simpleTypes/}WeightAllowanceType"/&gt;
 *         &lt;element name="PieceAllowance" type="{http://www.ibsplc.com/iRes/simpleTypes/}MaximumAllowanceType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PaxType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerBaggageAllowanceType", propOrder = {
    "baggageCategory",
    "weightAllowance",
    "pieceAllowance"
})
public class PassengerBaggageAllowanceType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "BaggageCategory", required = true)
    protected String baggageCategory;
    @XmlElement(name = "WeightAllowance", required = true)
    protected WeightAllowanceType weightAllowance;
    @XmlElement(name = "PieceAllowance", required = true)
    protected MaximumAllowanceType pieceAllowance;
    @XmlAttribute(name = "PaxType")
    protected String paxType;

    /**
     * baggageCategory 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageCategory() {
        return baggageCategory;
    }

    /**
     * baggageCategory 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageCategory(String value) {
        this.baggageCategory = value;
    }

    /**
     * weightAllowance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link WeightAllowanceType }
     *     
     */
    public WeightAllowanceType getWeightAllowance() {
        return weightAllowance;
    }

    /**
     * weightAllowance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightAllowanceType }
     *     
     */
    public void setWeightAllowance(WeightAllowanceType value) {
        this.weightAllowance = value;
    }

    /**
     * pieceAllowance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MaximumAllowanceType }
     *     
     */
    public MaximumAllowanceType getPieceAllowance() {
        return pieceAllowance;
    }

    /**
     * pieceAllowance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumAllowanceType }
     *     
     */
    public void setPieceAllowance(MaximumAllowanceType value) {
        this.pieceAllowance = value;
    }

    /**
     * paxType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxType() {
        return paxType;
    }

    /**
     * paxType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxType(String value) {
        this.paxType = value;
    }

}
