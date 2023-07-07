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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information about the seat requirement of the guest.
 * 
 * <p>GuestSeatInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GuestSeatInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuestName" type="{http://www.ibsplc.com/iRes/simpleTypes/}NameType"/&gt;
 *         &lt;element name="SeatDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatNumberOrAttribute" minOccurs="0"/&gt;
 *         &lt;element name="SeatAssignMentFeeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatAssignMentFeeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isRestrictedSeatValidated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isSeatWarningsValidated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestSeatInfo", propOrder = {
    "guestName",
    "seatDetails",
    "seatAssignMentFeeDetails",
    "isRestrictedSeatValidated",
    "isSeatWarningsValidated"
})
public class GuestSeatInfo
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "GuestName", required = true)
    protected NameType guestName;
    @XmlElement(name = "SeatDetails")
    protected SeatNumberOrAttribute seatDetails;
    @XmlElement(name = "SeatAssignMentFeeDetails")
    protected List<SeatAssignMentFeeType> seatAssignMentFeeDetails;
    protected Boolean isRestrictedSeatValidated;
    protected Boolean isSeatWarningsValidated;

    /**
     * guestName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getGuestName() {
        return guestName;
    }

    /**
     * guestName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setGuestName(NameType value) {
        this.guestName = value;
    }

    /**
     * seatDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SeatNumberOrAttribute }
     *     
     */
    public SeatNumberOrAttribute getSeatDetails() {
        return seatDetails;
    }

    /**
     * seatDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatNumberOrAttribute }
     *     
     */
    public void setSeatDetails(SeatNumberOrAttribute value) {
        this.seatDetails = value;
    }

    /**
     * Gets the value of the seatAssignMentFeeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatAssignMentFeeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatAssignMentFeeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatAssignMentFeeType }
     * 
     * 
     */
    public List<SeatAssignMentFeeType> getSeatAssignMentFeeDetails() {
        if (seatAssignMentFeeDetails == null) {
            seatAssignMentFeeDetails = new ArrayList<SeatAssignMentFeeType>();
        }
        return this.seatAssignMentFeeDetails;
    }

    /**
     * isRestrictedSeatValidated 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRestrictedSeatValidated() {
        return isRestrictedSeatValidated;
    }

    /**
     * isRestrictedSeatValidated 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRestrictedSeatValidated(Boolean value) {
        this.isRestrictedSeatValidated = value;
    }

    /**
     * isSeatWarningsValidated 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSeatWarningsValidated() {
        return isSeatWarningsValidated;
    }

    /**
     * isSeatWarningsValidated 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSeatWarningsValidated(Boolean value) {
        this.isSeatWarningsValidated = value;
    }

}
