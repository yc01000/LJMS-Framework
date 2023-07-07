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
 * This contains information of seats, standby bookings at cabin level.
 * 
 * <p>CabinSeatType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CabinSeatType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ActualSeats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AuthorizedSeats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ActualAvailableSeats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StandbyBookings" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StandbyDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}StandbyDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinSeatType", propOrder = {
    "cabinClass",
    "actualSeats",
    "authorizedSeats",
    "actualAvailableSeats",
    "standbyBookings",
    "standbyDetails"
})
public class CabinSeatType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "CabinClass", required = true)
    protected String cabinClass;
    @XmlElement(name = "ActualSeats")
    protected int actualSeats;
    @XmlElement(name = "AuthorizedSeats")
    protected int authorizedSeats;
    @XmlElement(name = "ActualAvailableSeats")
    protected int actualAvailableSeats;
    @XmlElement(name = "StandbyBookings")
    protected int standbyBookings;
    @XmlElement(name = "StandbyDetails")
    protected List<StandbyDetailsType> standbyDetails;

    /**
     * cabinClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * cabinClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

    /**
     * actualSeats 속성의 값을 가져옵니다.
     * 
     */
    public int getActualSeats() {
        return actualSeats;
    }

    /**
     * actualSeats 속성의 값을 설정합니다.
     * 
     */
    public void setActualSeats(int value) {
        this.actualSeats = value;
    }

    /**
     * authorizedSeats 속성의 값을 가져옵니다.
     * 
     */
    public int getAuthorizedSeats() {
        return authorizedSeats;
    }

    /**
     * authorizedSeats 속성의 값을 설정합니다.
     * 
     */
    public void setAuthorizedSeats(int value) {
        this.authorizedSeats = value;
    }

    /**
     * actualAvailableSeats 속성의 값을 가져옵니다.
     * 
     */
    public int getActualAvailableSeats() {
        return actualAvailableSeats;
    }

    /**
     * actualAvailableSeats 속성의 값을 설정합니다.
     * 
     */
    public void setActualAvailableSeats(int value) {
        this.actualAvailableSeats = value;
    }

    /**
     * standbyBookings 속성의 값을 가져옵니다.
     * 
     */
    public int getStandbyBookings() {
        return standbyBookings;
    }

    /**
     * standbyBookings 속성의 값을 설정합니다.
     * 
     */
    public void setStandbyBookings(int value) {
        this.standbyBookings = value;
    }

    /**
     * Gets the value of the standbyDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standbyDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandbyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandbyDetailsType }
     * 
     * 
     */
    public List<StandbyDetailsType> getStandbyDetails() {
        if (standbyDetails == null) {
            standbyDetails = new ArrayList<StandbyDetailsType>();
        }
        return this.standbyDetails;
    }

}
