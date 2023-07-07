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
 * <p>OandDFeeDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="OandDFeeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OAndDId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FeeAmountDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeAmountDetails" minOccurs="0"/&gt;
 *         &lt;element name="SegmentFeeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentFeeDetailsResponse" minOccurs="0"/&gt;
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
@XmlType(name = "OandDFeeDetailsType", propOrder = {
    "airlineCompanyCode",
    "origin",
    "destination",
    "oAndDId",
    "fareBasisCode",
    "feeAmountDetails",
    "segmentFeeDetails",
    "ssrCode"
})
public class OandDFeeDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCompanyCode")
    protected String airlineCompanyCode;
    protected String origin;
    @XmlElement(name = "Destination")
    protected String destination;
    @XmlElement(name = "OAndDId")
    protected Long oAndDId;
    @XmlElement(name = "FareBasisCode")
    protected String fareBasisCode;
    @XmlElement(name = "FeeAmountDetails")
    protected FeeAmountDetails feeAmountDetails;
    @XmlElement(name = "SegmentFeeDetails")
    protected SegmentFeeDetailsResponse segmentFeeDetails;
    @XmlElement(name = "SSRCode")
    protected List<String> ssrCode;

    /**
     * airlineCompanyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCompanyCode() {
        return airlineCompanyCode;
    }

    /**
     * airlineCompanyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCompanyCode(String value) {
        this.airlineCompanyCode = value;
    }

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
     * oAndDId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOAndDId() {
        return oAndDId;
    }

    /**
     * oAndDId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOAndDId(Long value) {
        this.oAndDId = value;
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
     * feeAmountDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FeeAmountDetails }
     *     
     */
    public FeeAmountDetails getFeeAmountDetails() {
        return feeAmountDetails;
    }

    /**
     * feeAmountDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAmountDetails }
     *     
     */
    public void setFeeAmountDetails(FeeAmountDetails value) {
        this.feeAmountDetails = value;
    }

    /**
     * segmentFeeDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SegmentFeeDetailsResponse }
     *     
     */
    public SegmentFeeDetailsResponse getSegmentFeeDetails() {
        return segmentFeeDetails;
    }

    /**
     * segmentFeeDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentFeeDetailsResponse }
     *     
     */
    public void setSegmentFeeDetails(SegmentFeeDetailsResponse value) {
        this.segmentFeeDetails = value;
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
