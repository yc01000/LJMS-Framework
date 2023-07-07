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
 * <p>PNRFareDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PNRFareDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseFareCodes" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRBaseFareType"/&gt;
 *         &lt;element name="TotalFareForAGuest" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TotalFareForAllGuestInPNR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ChangeFees" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CancelFees" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TaxOnFees" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNRFareDetailsType", propOrder = {
    "baseFareCodes",
    "totalFareForAGuest",
    "totalFareForAllGuestInPNR",
    "changeFees",
    "cancelFees",
    "taxOnFees",
    "total"
})
public class PNRFareDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "BaseFareCodes", required = true)
    protected PNRBaseFareType baseFareCodes;
    @XmlElement(name = "TotalFareForAGuest", required = true)
    protected String totalFareForAGuest;
    @XmlElement(name = "TotalFareForAllGuestInPNR", required = true)
    protected String totalFareForAllGuestInPNR;
    @XmlElement(name = "ChangeFees", required = true)
    protected String changeFees;
    @XmlElement(name = "CancelFees", required = true)
    protected String cancelFees;
    @XmlElement(name = "TaxOnFees", required = true)
    protected String taxOnFees;
    @XmlElement(name = "Total", required = true)
    protected String total;

    /**
     * baseFareCodes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PNRBaseFareType }
     *     
     */
    public PNRBaseFareType getBaseFareCodes() {
        return baseFareCodes;
    }

    /**
     * baseFareCodes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRBaseFareType }
     *     
     */
    public void setBaseFareCodes(PNRBaseFareType value) {
        this.baseFareCodes = value;
    }

    /**
     * totalFareForAGuest 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFareForAGuest() {
        return totalFareForAGuest;
    }

    /**
     * totalFareForAGuest 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFareForAGuest(String value) {
        this.totalFareForAGuest = value;
    }

    /**
     * totalFareForAllGuestInPNR 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFareForAllGuestInPNR() {
        return totalFareForAllGuestInPNR;
    }

    /**
     * totalFareForAllGuestInPNR 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFareForAllGuestInPNR(String value) {
        this.totalFareForAllGuestInPNR = value;
    }

    /**
     * changeFees 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeFees() {
        return changeFees;
    }

    /**
     * changeFees 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeFees(String value) {
        this.changeFees = value;
    }

    /**
     * cancelFees 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelFees() {
        return cancelFees;
    }

    /**
     * cancelFees 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelFees(String value) {
        this.cancelFees = value;
    }

    /**
     * taxOnFees 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxOnFees() {
        return taxOnFees;
    }

    /**
     * taxOnFees 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxOnFees(String value) {
        this.taxOnFees = value;
    }

    /**
     * total 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal() {
        return total;
    }

    /**
     * total 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(String value) {
        this.total = value;
    }

}
