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
 * <p>OandDFeeDetailsInputType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="OandDFeeDetailsInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AirlineCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OandDSequenceID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="OandDId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="StandByCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SegmentFeeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentFeeDetailsInputType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SSRCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OandDFeeDetailsInputType", propOrder = {
    "origin",
    "destination",
    "fareBasisCode",
    "airlineCompany",
    "oandDSequenceID",
    "oandDId",
    "standByCode",
    "segmentFeeDetails",
    "ssrCode"
})
public class OandDFeeDetailsInputType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Origin", required = true)
    protected String origin;
    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlElement(name = "FareBasisCode")
    protected String fareBasisCode;
    @XmlElement(name = "AirlineCompany")
    protected String airlineCompany;
    @XmlElement(name = "OandDSequenceID")
    protected long oandDSequenceID;
    @XmlElement(name = "OandDId")
    protected long oandDId;
    @XmlElement(name = "StandByCode")
    protected String standByCode;
    @XmlElement(name = "SegmentFeeDetails", required = true)
    protected List<SegmentFeeDetailsInputType> segmentFeeDetails;
    @XmlElement(name = "SSRCode")
    protected List<String> ssrCode;

    /**
     * origin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * origin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * destination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * destination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
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
     * airlineCompany 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCompany() {
        return airlineCompany;
    }

    /**
     * airlineCompany 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCompany(String value) {
        this.airlineCompany = value;
    }

    /**
     * oandDSequenceID 속성의 값을 가져옵니다.
     * 
     */
    public long getOandDSequenceID() {
        return oandDSequenceID;
    }

    /**
     * oandDSequenceID 속성의 값을 설정합니다.
     * 
     */
    public void setOandDSequenceID(long value) {
        this.oandDSequenceID = value;
    }

    /**
     * oandDId 속성의 값을 가져옵니다.
     * 
     */
    public long getOandDId() {
        return oandDId;
    }

    /**
     * oandDId 속성의 값을 설정합니다.
     * 
     */
    public void setOandDId(long value) {
        this.oandDId = value;
    }

    /**
     * standByCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandByCode() {
        return standByCode;
    }

    /**
     * standByCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandByCode(String value) {
        this.standByCode = value;
    }

    /**
     * Gets the value of the segmentFeeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentFeeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentFeeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentFeeDetailsInputType }
     * 
     * 
     */
    public List<SegmentFeeDetailsInputType> getSegmentFeeDetails() {
        if (segmentFeeDetails == null) {
            segmentFeeDetails = new ArrayList<SegmentFeeDetailsInputType>();
        }
        return this.segmentFeeDetails;
    }

    /**
     * Gets the value of the ssrCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSSRCode() {
        if (ssrCode == null) {
            ssrCode = new ArrayList<String>();
        }
        return this.ssrCode;
    }

}
