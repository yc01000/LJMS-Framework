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
 * <p>DeckDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="DeckDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeckName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TotalSeats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SeatAttributesPosition" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatAttributesPositionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CabinDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CabinDetailsType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeckDetailsType", propOrder = {
    "deckName",
    "totalSeats",
    "seatAttributesPosition",
    "cabinDetails"
})
public class DeckDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "DeckName", required = true)
    protected String deckName;
    @XmlElement(name = "TotalSeats")
    protected int totalSeats;
    @XmlElement(name = "SeatAttributesPosition")
    protected List<SeatAttributesPositionType> seatAttributesPosition;
    @XmlElement(name = "CabinDetails", required = true)
    protected List<CabinDetailsType> cabinDetails;

    /**
     * deckName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeckName() {
        return deckName;
    }

    /**
     * deckName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeckName(String value) {
        this.deckName = value;
    }

    /**
     * totalSeats 속성의 값을 가져옵니다.
     * 
     */
    public int getTotalSeats() {
        return totalSeats;
    }

    /**
     * totalSeats 속성의 값을 설정합니다.
     * 
     */
    public void setTotalSeats(int value) {
        this.totalSeats = value;
    }

    /**
     * Gets the value of the seatAttributesPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatAttributesPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatAttributesPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatAttributesPositionType }
     * 
     * 
     */
    public List<SeatAttributesPositionType> getSeatAttributesPosition() {
        if (seatAttributesPosition == null) {
            seatAttributesPosition = new ArrayList<SeatAttributesPositionType>();
        }
        return this.seatAttributesPosition;
    }

    /**
     * Gets the value of the cabinDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinDetailsType }
     * 
     * 
     */
    public List<CabinDetailsType> getCabinDetails() {
        if (cabinDetails == null) {
            cabinDetails = new ArrayList<CabinDetailsType>();
        }
        return this.cabinDetails;
    }

}
