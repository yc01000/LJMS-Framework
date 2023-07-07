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


/**
 * <p>PnrRepriceDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PnrRepriceDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PnrGuestDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrGuestDetailsType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="OandDDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}OandDDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AuxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalNonRefundableAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FarePaidStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}FarePaidStatusType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrRepriceDetails", propOrder = {
    "pnrGuestDetailsType",
    "oandDDetails",
    "auxDetails",
    "totalNonRefundableAmount",
    "farePaidStatus"
})
public class PnrRepriceDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PnrGuestDetailsType", required = true)
    protected List<PnrGuestDetailsType> pnrGuestDetailsType;
    @XmlElement(name = "OandDDetails")
    protected List<OandDDetails> oandDDetails;
    @XmlElement(name = "AuxDetails")
    protected List<AuxDetailsType> auxDetails;
    protected Double totalNonRefundableAmount;
    @XmlElement(name = "FarePaidStatus")
    @XmlSchemaType(name = "string")
    protected FarePaidStatusType farePaidStatus;

    /**
     * Gets the value of the pnrGuestDetailsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrGuestDetailsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrGuestDetailsType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrGuestDetailsType }
     * 
     * 
     */
    public List<PnrGuestDetailsType> getPnrGuestDetailsType() {
        if (pnrGuestDetailsType == null) {
            pnrGuestDetailsType = new ArrayList<PnrGuestDetailsType>();
        }
        return this.pnrGuestDetailsType;
    }

    /**
     * Gets the value of the oandDDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oandDDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOandDDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OandDDetails }
     * 
     * 
     */
    public List<OandDDetails> getOandDDetails() {
        if (oandDDetails == null) {
            oandDDetails = new ArrayList<OandDDetails>();
        }
        return this.oandDDetails;
    }

    /**
     * Gets the value of the auxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuxDetailsType }
     * 
     * 
     */
    public List<AuxDetailsType> getAuxDetails() {
        if (auxDetails == null) {
            auxDetails = new ArrayList<AuxDetailsType>();
        }
        return this.auxDetails;
    }

    /**
     * totalNonRefundableAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalNonRefundableAmount() {
        return totalNonRefundableAmount;
    }

    /**
     * totalNonRefundableAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalNonRefundableAmount(Double value) {
        this.totalNonRefundableAmount = value;
    }

    /**
     * farePaidStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FarePaidStatusType }
     *     
     */
    public FarePaidStatusType getFarePaidStatus() {
        return farePaidStatus;
    }

    /**
     * farePaidStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePaidStatusType }
     *     
     */
    public void setFarePaidStatus(FarePaidStatusType value) {
        this.farePaidStatus = value;
    }

}
