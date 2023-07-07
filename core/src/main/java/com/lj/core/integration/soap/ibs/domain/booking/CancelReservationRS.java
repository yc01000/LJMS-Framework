//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.05.28 시간 08:48:08 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PnrRePriceDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrRepriceDetails" minOccurs="0"/>
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PnrSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancellationFeeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeInformation" minOccurs="0"/>
 *         &lt;element name="ItineraryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pnrRePriceDetails",
    "pnrNumber",
    "airlineCode",
    "pnrSessionId",
    "cancellationFeeDetails",
    "itineraryStatus",
    "errorType"
})
@XmlRootElement(name = "CancelReservationRS")
public class CancelReservationRS {

    @XmlElement(name = "PnrRePriceDetails")
    protected PnrRepriceDetails pnrRePriceDetails;
    @XmlElement(name = "PnrNumber")
    protected String pnrNumber;
    @XmlElement(name = "AirlineCode")
    protected String airlineCode;
    @XmlElement(name = "PnrSessionId")
    protected String pnrSessionId;
    @XmlElement(name = "CancellationFeeDetails")
    protected FeeInformation cancellationFeeDetails;
    @XmlElement(name = "ItineraryStatus")
    protected String itineraryStatus;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;

    /**
     * pnrRePriceDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PnrRepriceDetails }
     *     
     */
    public PnrRepriceDetails getPnrRePriceDetails() {
        return pnrRePriceDetails;
    }

    /**
     * pnrRePriceDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PnrRepriceDetails }
     *     
     */
    public void setPnrRePriceDetails(PnrRepriceDetails value) {
        this.pnrRePriceDetails = value;
    }

    /**
     * pnrNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrNumber() {
        return pnrNumber;
    }

    /**
     * pnrNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrNumber(String value) {
        this.pnrNumber = value;
    }

    /**
     * airlineCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * airlineCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * pnrSessionId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrSessionId() {
        return pnrSessionId;
    }

    /**
     * pnrSessionId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrSessionId(String value) {
        this.pnrSessionId = value;
    }

    /**
     * cancellationFeeDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FeeInformation }
     *     
     */
    public FeeInformation getCancellationFeeDetails() {
        return cancellationFeeDetails;
    }

    /**
     * cancellationFeeDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeInformation }
     *     
     */
    public void setCancellationFeeDetails(FeeInformation value) {
        this.cancellationFeeDetails = value;
    }

    /**
     * itineraryStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItineraryStatus() {
        return itineraryStatus;
    }

    /**
     * itineraryStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItineraryStatus(String value) {
        this.itineraryStatus = value;
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

}
