//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NameAndAddressType" type="{http://www.ibsplc.com/iRes/simpleTypes/}NameAndAddressType" minOccurs="0"/&gt;
 *         &lt;element name="PnrCommonType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrCommonType" minOccurs="0"/&gt;
 *         &lt;element name="PNRSegmentDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRSegmentDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PNRGuestNameTypes" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRGuestNameTypes" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PNRFareDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRFareDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AirlineLevelTaxRegNumber" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirlineLevelTaxRegNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PnrRules" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrRules" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nameAndAddressType",
    "pnrCommonType",
    "pnrSegmentDetailsType",
    "pnrGuestNameTypes",
    "pnrFareDetailsType",
    "airlineLevelTaxRegNumber",
    "pnrRules",
    "errorType",
    "currency"
})
@XmlRootElement(name = "CHK_PrintItineraryRS")
public class CHKPrintItineraryRS
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "NameAndAddressType")
    protected NameAndAddressType nameAndAddressType;
    @XmlElement(name = "PnrCommonType")
    protected PnrCommonType pnrCommonType;
    @XmlElement(name = "PNRSegmentDetailsType")
    protected List<PNRSegmentDetailsType> pnrSegmentDetailsType;
    @XmlElement(name = "PNRGuestNameTypes")
    protected List<PNRGuestNameTypes> pnrGuestNameTypes;
    @XmlElement(name = "PNRFareDetailsType")
    protected List<PNRFareDetailsType> pnrFareDetailsType;
    @XmlElement(name = "AirlineLevelTaxRegNumber")
    protected List<AirlineLevelTaxRegNumber> airlineLevelTaxRegNumber;
    @XmlElement(name = "PnrRules")
    protected List<PnrRules> pnrRules;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;
    @XmlElement(name = "Currency")
    protected String currency;

    /**
     * nameAndAddressType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddressType }
     *     
     */
    public NameAndAddressType getNameAndAddressType() {
        return nameAndAddressType;
    }

    /**
     * nameAndAddressType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddressType }
     *     
     */
    public void setNameAndAddressType(NameAndAddressType value) {
        this.nameAndAddressType = value;
    }

    /**
     * pnrCommonType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PnrCommonType }
     *     
     */
    public PnrCommonType getPnrCommonType() {
        return pnrCommonType;
    }

    /**
     * pnrCommonType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PnrCommonType }
     *     
     */
    public void setPnrCommonType(PnrCommonType value) {
        this.pnrCommonType = value;
    }

    /**
     * Gets the value of the pnrSegmentDetailsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrSegmentDetailsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPNRSegmentDetailsType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRSegmentDetailsType }
     * 
     * 
     */
    public List<PNRSegmentDetailsType> getPNRSegmentDetailsType() {
        if (pnrSegmentDetailsType == null) {
            pnrSegmentDetailsType = new ArrayList<PNRSegmentDetailsType>();
        }
        return this.pnrSegmentDetailsType;
    }

    /**
     * Gets the value of the pnrGuestNameTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrGuestNameTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPNRGuestNameTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRGuestNameTypes }
     * 
     * 
     */
    public List<PNRGuestNameTypes> getPNRGuestNameTypes() {
        if (pnrGuestNameTypes == null) {
            pnrGuestNameTypes = new ArrayList<PNRGuestNameTypes>();
        }
        return this.pnrGuestNameTypes;
    }

    /**
     * Gets the value of the pnrFareDetailsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrFareDetailsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPNRFareDetailsType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRFareDetailsType }
     * 
     * 
     */
    public List<PNRFareDetailsType> getPNRFareDetailsType() {
        if (pnrFareDetailsType == null) {
            pnrFareDetailsType = new ArrayList<PNRFareDetailsType>();
        }
        return this.pnrFareDetailsType;
    }

    /**
     * Gets the value of the airlineLevelTaxRegNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airlineLevelTaxRegNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirlineLevelTaxRegNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlineLevelTaxRegNumber }
     * 
     * 
     */
    public List<AirlineLevelTaxRegNumber> getAirlineLevelTaxRegNumber() {
        if (airlineLevelTaxRegNumber == null) {
            airlineLevelTaxRegNumber = new ArrayList<AirlineLevelTaxRegNumber>();
        }
        return this.airlineLevelTaxRegNumber;
    }

    /**
     * Gets the value of the pnrRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrRules }
     * 
     * 
     */
    public List<PnrRules> getPnrRules() {
        if (pnrRules == null) {
            pnrRules = new ArrayList<PnrRules>();
        }
        return this.pnrRules;
    }

    /**
     * errorType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getErrorType() {
        return errorType;
    }

    /**
     * errorType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setErrorType(ErrorType value) {
        this.errorType = value;
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

}
