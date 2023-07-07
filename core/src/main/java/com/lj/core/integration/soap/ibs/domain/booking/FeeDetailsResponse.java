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
 * <p>FeeDetailsResponse complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FeeDetailsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="airlineCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apiFeeCodeCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="travelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointOfPurchase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="saleDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="agentIataCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corpAcctId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ruleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="pnrCreationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="feeAmountDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeAmountDetails" minOccurs="0"/&gt;
 *         &lt;element name="OandDFeeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}OandDFeeDetailsResponse"/&gt;
 *         &lt;element name="paxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "FeeDetailsResponse", propOrder = {
    "feeCode",
    "applicationType",
    "airlineCompanyCode",
    "apiFeeCodeCurrency",
    "channel",
    "travelType",
    "pointOfPurchase",
    "saleDate",
    "agentIataCode",
    "corpAcctId",
    "ruleId",
    "pnrCreationDate",
    "feeAmountDetails",
    "oandDFeeDetails",
    "paxType",
    "ssrCode"
})
public class FeeDetailsResponse
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FeeCode")
    protected String feeCode;
    protected String applicationType;
    protected String airlineCompanyCode;
    protected String apiFeeCodeCurrency;
    protected String channel;
    protected String travelType;
    protected String pointOfPurchase;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saleDate;
    protected String agentIataCode;
    protected String corpAcctId;
    protected Long ruleId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pnrCreationDate;
    protected FeeAmountDetails feeAmountDetails;
    @XmlElement(name = "OandDFeeDetails", required = true)
    protected OandDFeeDetailsResponse oandDFeeDetails;
    protected String paxType;
    @XmlElement(name = "SSRCode")
    protected List<String> ssrCode;

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
     * applicationType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * applicationType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationType(String value) {
        this.applicationType = value;
    }

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
     * apiFeeCodeCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiFeeCodeCurrency() {
        return apiFeeCodeCurrency;
    }

    /**
     * apiFeeCodeCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiFeeCodeCurrency(String value) {
        this.apiFeeCodeCurrency = value;
    }

    /**
     * channel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * channel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * travelType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelType() {
        return travelType;
    }

    /**
     * travelType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelType(String value) {
        this.travelType = value;
    }

    /**
     * pointOfPurchase 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfPurchase() {
        return pointOfPurchase;
    }

    /**
     * pointOfPurchase 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfPurchase(String value) {
        this.pointOfPurchase = value;
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
     * agentIataCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentIataCode() {
        return agentIataCode;
    }

    /**
     * agentIataCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentIataCode(String value) {
        this.agentIataCode = value;
    }

    /**
     * corpAcctId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpAcctId() {
        return corpAcctId;
    }

    /**
     * corpAcctId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpAcctId(String value) {
        this.corpAcctId = value;
    }

    /**
     * ruleId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRuleId() {
        return ruleId;
    }

    /**
     * ruleId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRuleId(Long value) {
        this.ruleId = value;
    }

    /**
     * pnrCreationDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPnrCreationDate() {
        return pnrCreationDate;
    }

    /**
     * pnrCreationDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPnrCreationDate(XMLGregorianCalendar value) {
        this.pnrCreationDate = value;
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
     * oandDFeeDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OandDFeeDetailsResponse }
     *     
     */
    public OandDFeeDetailsResponse getOandDFeeDetails() {
        return oandDFeeDetails;
    }

    /**
     * oandDFeeDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OandDFeeDetailsResponse }
     *     
     */
    public void setOandDFeeDetails(OandDFeeDetailsResponse value) {
        this.oandDFeeDetails = value;
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
