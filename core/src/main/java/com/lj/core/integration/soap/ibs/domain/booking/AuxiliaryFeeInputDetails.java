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
 * <p>AuxiliaryFeeInputDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AuxiliaryFeeInputDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickUpDateLTC" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PickUpTimeLTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DropOffDateLTC" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DropOffTimeLTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pieces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Weights" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaxSegmentMapping" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxSegmentMapping" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuxiliaryFeeInputDetails", propOrder = {
    "feeCode",
    "currency",
    "vendorCode",
    "carGroup",
    "pickUpDateLTC",
    "pickUpTimeLTC",
    "dropOffDateLTC",
    "dropOffTimeLTC",
    "pieces",
    "weights",
    "units",
    "serviceType",
    "nationality",
    "paxSegmentMapping"
})
public class AuxiliaryFeeInputDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FeeCode")
    protected String feeCode;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "VendorCode")
    protected String vendorCode;
    @XmlElement(name = "CarGroup")
    protected String carGroup;
    @XmlElement(name = "PickUpDateLTC")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pickUpDateLTC;
    @XmlElement(name = "PickUpTimeLTC")
    protected String pickUpTimeLTC;
    @XmlElement(name = "DropOffDateLTC")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dropOffDateLTC;
    @XmlElement(name = "DropOffTimeLTC")
    protected String dropOffTimeLTC;
    @XmlElement(name = "Pieces")
    protected Integer pieces;
    @XmlElement(name = "Weights")
    protected Double weights;
    @XmlElement(name = "Units")
    protected String units;
    @XmlElement(name = "ServiceType")
    protected String serviceType;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "PaxSegmentMapping", required = true)
    protected List<PaxSegmentMapping> paxSegmentMapping;

    /**
     * feeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCode() {
        return feeCode;
    }

    /**
     * feeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCode(String value) {
        this.feeCode = value;
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
     * vendorCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * vendorCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * carGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarGroup() {
        return carGroup;
    }

    /**
     * carGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarGroup(String value) {
        this.carGroup = value;
    }

    /**
     * pickUpDateLTC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickUpDateLTC() {
        return pickUpDateLTC;
    }

    /**
     * pickUpDateLTC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickUpDateLTC(XMLGregorianCalendar value) {
        this.pickUpDateLTC = value;
    }

    /**
     * pickUpTimeLTC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpTimeLTC() {
        return pickUpTimeLTC;
    }

    /**
     * pickUpTimeLTC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpTimeLTC(String value) {
        this.pickUpTimeLTC = value;
    }

    /**
     * dropOffDateLTC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDropOffDateLTC() {
        return dropOffDateLTC;
    }

    /**
     * dropOffDateLTC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDropOffDateLTC(XMLGregorianCalendar value) {
        this.dropOffDateLTC = value;
    }

    /**
     * dropOffTimeLTC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffTimeLTC() {
        return dropOffTimeLTC;
    }

    /**
     * dropOffTimeLTC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffTimeLTC(String value) {
        this.dropOffTimeLTC = value;
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
     * weights 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeights() {
        return weights;
    }

    /**
     * weights 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeights(Double value) {
        this.weights = value;
    }

    /**
     * units 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * units 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * serviceType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * serviceType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * nationality 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * nationality 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the paxSegmentMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxSegmentMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxSegmentMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxSegmentMapping }
     * 
     * 
     */
    public List<PaxSegmentMapping> getPaxSegmentMapping() {
        if (paxSegmentMapping == null) {
            paxSegmentMapping = new ArrayList<PaxSegmentMapping>();
        }
        return this.paxSegmentMapping;
    }

}
