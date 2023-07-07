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
 *     &lt;extension base="{http://www.ibsplc.com/iRes/simpleTypes/}BasePnrRSType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Itinerary" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItineraryDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ItinPrice" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItinPriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SSRDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SSRInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AuxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SeatAssignmentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatAssignmentDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GuestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestReponseDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeeInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itinerary",
    "itinPrice",
    "ssrDetails",
    "auxDetails",
    "seatAssignmentDetails",
    "guestDetails",
    "feeInformation",
    "errorType"
})
@XmlRootElement(name = "PriceAncillaryRS")
public class PriceAncillaryRS
    extends BasePnrRSType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Itinerary")
    protected List<ItineraryDetailsType> itinerary;
    @XmlElement(name = "ItinPrice")
    protected List<ItinPriceType> itinPrice;
    @XmlElement(name = "SSRDetails")
    protected List<SSRInformationType> ssrDetails;
    @XmlElement(name = "AuxDetails")
    protected List<AuxInformationType> auxDetails;
    @XmlElement(name = "SeatAssignmentDetails")
    protected List<SeatAssignmentDetailsType> seatAssignmentDetails;
    @XmlElement(name = "GuestDetails")
    protected List<GuestReponseDetailsType> guestDetails;
    @XmlElement(name = "FeeInformation")
    protected List<FeeInformationType> feeInformation;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;

    /**
     * Gets the value of the itinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryDetailsType }
     * 
     * 
     */
    public List<ItineraryDetailsType> getItinerary() {
        if (itinerary == null) {
            itinerary = new ArrayList<ItineraryDetailsType>();
        }
        return this.itinerary;
    }

    /**
     * Gets the value of the itinPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itinPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItinPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItinPriceType }
     * 
     * 
     */
    public List<ItinPriceType> getItinPrice() {
        if (itinPrice == null) {
            itinPrice = new ArrayList<ItinPriceType>();
        }
        return this.itinPrice;
    }

    /**
     * Gets the value of the ssrDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSRInformationType }
     * 
     * 
     */
    public List<SSRInformationType> getSSRDetails() {
        if (ssrDetails == null) {
            ssrDetails = new ArrayList<SSRInformationType>();
        }
        return this.ssrDetails;
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
     * {@link AuxInformationType }
     * 
     * 
     */
    public List<AuxInformationType> getAuxDetails() {
        if (auxDetails == null) {
            auxDetails = new ArrayList<AuxInformationType>();
        }
        return this.auxDetails;
    }

    /**
     * Gets the value of the seatAssignmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatAssignmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatAssignmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatAssignmentDetailsType }
     * 
     * 
     */
    public List<SeatAssignmentDetailsType> getSeatAssignmentDetails() {
        if (seatAssignmentDetails == null) {
            seatAssignmentDetails = new ArrayList<SeatAssignmentDetailsType>();
        }
        return this.seatAssignmentDetails;
    }

    /**
     * Gets the value of the guestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestReponseDetailsType }
     * 
     * 
     */
    public List<GuestReponseDetailsType> getGuestDetails() {
        if (guestDetails == null) {
            guestDetails = new ArrayList<GuestReponseDetailsType>();
        }
        return this.guestDetails;
    }

    /**
     * Gets the value of the feeInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeInformationType }
     * 
     * 
     */
    public List<FeeInformationType> getFeeInformation() {
        if (feeInformation == null) {
            feeInformation = new ArrayList<FeeInformationType>();
        }
        return this.feeInformation;
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
