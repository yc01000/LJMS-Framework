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
 * <p>AncillaryRuleParameters complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AncillaryRuleParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OandDDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}OandDDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SaleDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="TravelAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorporateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TourOperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BundleAncillaries" type="{http://www.ibsplc.com/iRes/simpleTypes/}BundleAncillaries" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryRuleParameters", propOrder = {
    "oandDDetails",
    "saleDate",
    "travelAgency",
    "corporateCode",
    "tourOperatorCode",
    "bundleAncillaries"
})
public class AncillaryRuleParameters
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "OandDDetails", required = true)
    protected List<OandDDetails> oandDDetails;
    @XmlElement(name = "SaleDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saleDate;
    @XmlElement(name = "TravelAgency")
    protected String travelAgency;
    @XmlElement(name = "CorporateCode")
    protected String corporateCode;
    @XmlElement(name = "TourOperatorCode")
    protected String tourOperatorCode;
    @XmlElement(name = "BundleAncillaries")
    protected BundleAncillaries bundleAncillaries;

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
     * saleDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleDate() {
        return saleDate;
    }

    /**
     * saleDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleDate(XMLGregorianCalendar value) {
        this.saleDate = value;
    }

    /**
     * travelAgency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelAgency() {
        return travelAgency;
    }

    /**
     * travelAgency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelAgency(String value) {
        this.travelAgency = value;
    }

    /**
     * corporateCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateCode() {
        return corporateCode;
    }

    /**
     * corporateCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateCode(String value) {
        this.corporateCode = value;
    }

    /**
     * tourOperatorCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorCode() {
        return tourOperatorCode;
    }

    /**
     * tourOperatorCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorCode(String value) {
        this.tourOperatorCode = value;
    }

    /**
     * bundleAncillaries 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BundleAncillaries }
     *     
     */
    public BundleAncillaries getBundleAncillaries() {
        return bundleAncillaries;
    }

    /**
     * bundleAncillaries 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleAncillaries }
     *     
     */
    public void setBundleAncillaries(BundleAncillaries value) {
        this.bundleAncillaries = value;
    }

}
