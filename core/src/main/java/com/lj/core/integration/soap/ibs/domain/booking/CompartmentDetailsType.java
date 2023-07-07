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
 * <p>CompartmentDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CompartmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompartmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartRow" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EndRow" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SeatConfiguration" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InternalSeatConfiguration" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SeatDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatDetailsType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompartmentDetailsType", propOrder = {
    "compartmentId",
    "startRow",
    "endRow",
    "seatConfiguration",
    "internalSeatConfiguration",
    "seatDetails"
})
public class CompartmentDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "CompartmentId")
    protected String compartmentId;
    @XmlElement(name = "StartRow", required = true)
    protected String startRow;
    @XmlElement(name = "EndRow", required = true)
    protected String endRow;
    @XmlElement(name = "SeatConfiguration", required = true)
    protected String seatConfiguration;
    @XmlElement(name = "InternalSeatConfiguration", required = true)
    protected String internalSeatConfiguration;
    @XmlElement(name = "SeatDetails", required = true)
    protected List<SeatDetailsType> seatDetails;

    /**
     * compartmentId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * compartmentId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompartmentId(String value) {
        this.compartmentId = value;
    }

    /**
     * startRow 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartRow() {
        return startRow;
    }

    /**
     * startRow 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartRow(String value) {
        this.startRow = value;
    }

    /**
     * endRow 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndRow() {
        return endRow;
    }

    /**
     * endRow 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndRow(String value) {
        this.endRow = value;
    }

    /**
     * seatConfiguration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatConfiguration() {
        return seatConfiguration;
    }

    /**
     * seatConfiguration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatConfiguration(String value) {
        this.seatConfiguration = value;
    }

    /**
     * internalSeatConfiguration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalSeatConfiguration() {
        return internalSeatConfiguration;
    }

    /**
     * internalSeatConfiguration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalSeatConfiguration(String value) {
        this.internalSeatConfiguration = value;
    }

    /**
     * Gets the value of the seatDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatDetailsType }
     * 
     * 
     */
    public List<SeatDetailsType> getSeatDetails() {
        if (seatDetails == null) {
            seatDetails = new ArrayList<SeatDetailsType>();
        }
        return this.seatDetails;
    }

}
