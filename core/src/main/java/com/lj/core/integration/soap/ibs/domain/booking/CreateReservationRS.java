//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.05.28 시간 08:48:08 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PNR" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNR" minOccurs="0"/>
 *         &lt;element name="UnassignedSeatDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}UnassignedSeatDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ItineraryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SsrForSeat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pnr",
    "unassignedSeatDetails",
    "itineraryStatus",
    "ssrForSeat",
    "errorType"
})
@XmlRootElement(name = "CreateReservationRS")
public class CreateReservationRS {

    @XmlElement(name = "PNR")
    protected PNR pnr;
    @XmlElement(name = "UnassignedSeatDetails")
    protected List<UnassignedSeatDetails> unassignedSeatDetails;
    @XmlElement(name = "ItineraryStatus")
    protected String itineraryStatus;
    @XmlElement(name = "SsrForSeat")
    protected String ssrForSeat;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;

    /**
     * pnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PNR }
     *     
     */
    public PNR getPNR() {
        return pnr;
    }

    /**
     * pnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PNR }
     *     
     */
    public void setPNR(PNR value) {
        this.pnr = value;
    }

    /**
     * Gets the value of the unassignedSeatDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unassignedSeatDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnassignedSeatDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnassignedSeatDetails }
     * 
     * 
     */
    public List<UnassignedSeatDetails> getUnassignedSeatDetails() {
        if (unassignedSeatDetails == null) {
            unassignedSeatDetails = new ArrayList<UnassignedSeatDetails>();
        }
        return this.unassignedSeatDetails;
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
     * ssrForSeat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrForSeat() {
        return ssrForSeat;
    }

    /**
     * ssrForSeat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrForSeat(String value) {
        this.ssrForSeat = value;
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
