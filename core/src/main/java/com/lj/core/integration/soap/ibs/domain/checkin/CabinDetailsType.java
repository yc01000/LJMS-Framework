//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Cabins in the seat map.
 * 
 * <p>CabinDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CabinDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CabinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CabinId" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="StartRow" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EndRow" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TotalSeats" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CompartmentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CompartmentDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinDetailsType", propOrder = {
    "cabinName",
    "cabinId",
    "startRow",
    "endRow",
    "totalSeats",
    "compartmentDetails"
})
public class CabinDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "CabinName")
    protected String cabinName;
    @XmlElement(name = "CabinId", required = true)
    protected BigInteger cabinId;
    @XmlElement(name = "StartRow", required = true)
    protected BigInteger startRow;
    @XmlElement(name = "EndRow", required = true)
    protected BigInteger endRow;
    @XmlElement(name = "TotalSeats", required = true)
    protected BigInteger totalSeats;
    @XmlElement(name = "CompartmentDetails")
    protected List<CompartmentDetailsType> compartmentDetails;

    /**
     * cabinName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinName() {
        return cabinName;
    }

    /**
     * cabinName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinName(String value) {
        this.cabinName = value;
    }

    /**
     * cabinId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCabinId() {
        return cabinId;
    }

    /**
     * cabinId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCabinId(BigInteger value) {
        this.cabinId = value;
    }

    /**
     * startRow 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartRow() {
        return startRow;
    }

    /**
     * startRow 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartRow(BigInteger value) {
        this.startRow = value;
    }

    /**
     * endRow 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndRow() {
        return endRow;
    }

    /**
     * endRow 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndRow(BigInteger value) {
        this.endRow = value;
    }

    /**
     * totalSeats 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSeats() {
        return totalSeats;
    }

    /**
     * totalSeats 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSeats(BigInteger value) {
        this.totalSeats = value;
    }

    /**
     * Gets the value of the compartmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compartmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompartmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompartmentDetailsType }
     * 
     * 
     */
    public List<CompartmentDetailsType> getCompartmentDetails() {
        if (compartmentDetails == null) {
            compartmentDetails = new ArrayList<CompartmentDetailsType>();
        }
        return this.compartmentDetails;
    }

}
