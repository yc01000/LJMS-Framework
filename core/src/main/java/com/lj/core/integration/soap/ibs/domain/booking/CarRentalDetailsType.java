//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2021.04.29 시간 12:54:19 PM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CarRentalDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CarRentalDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarVendorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CarVendorName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PickUpDropOff" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PickUpDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="PickUpTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DropOffDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DropOffTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CarGroupDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CarGroupType"/&gt;
 *         &lt;element name="NumberOfDays" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarRentalDetailsType", propOrder = {
    "carVendorCode",
    "carVendorName",
    "pickUpDropOff",
    "pickUpDate",
    "pickUpTime",
    "dropOffDate",
    "dropOffTime",
    "carGroupDetails",
    "numberOfDays"
})
public class CarRentalDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "CarVendorCode", required = true)
    protected String carVendorCode;
    @XmlElement(name = "CarVendorName", required = true)
    protected String carVendorName;
    @XmlElement(name = "PickUpDropOff", required = true)
    protected String pickUpDropOff;
    @XmlElement(name = "PickUpDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pickUpDate;
    @XmlElement(name = "PickUpTime", required = true)
    protected String pickUpTime;
    @XmlElement(name = "DropOffDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dropOffDate;
    @XmlElement(name = "DropOffTime", required = true)
    protected String dropOffTime;
    @XmlElement(name = "CarGroupDetails", required = true)
    protected CarGroupType carGroupDetails;
    @XmlElement(name = "NumberOfDays")
    protected long numberOfDays;

    /**
     * carVendorCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarVendorCode() {
        return carVendorCode;
    }

    /**
     * carVendorCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarVendorCode(String value) {
        this.carVendorCode = value;
    }

    /**
     * carVendorName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarVendorName() {
        return carVendorName;
    }

    /**
     * carVendorName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarVendorName(String value) {
        this.carVendorName = value;
    }

    /**
     * pickUpDropOff 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDropOff() {
        return pickUpDropOff;
    }

    /**
     * pickUpDropOff 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDropOff(String value) {
        this.pickUpDropOff = value;
    }

    /**
     * pickUpDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickUpDate() {
        return pickUpDate;
    }

    /**
     * pickUpDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickUpDate(XMLGregorianCalendar value) {
        this.pickUpDate = value;
    }

    /**
     * pickUpTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpTime() {
        return pickUpTime;
    }

    /**
     * pickUpTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpTime(String value) {
        this.pickUpTime = value;
    }

    /**
     * dropOffDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDropOffDate() {
        return dropOffDate;
    }

    /**
     * dropOffDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDropOffDate(XMLGregorianCalendar value) {
        this.dropOffDate = value;
    }

    /**
     * dropOffTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffTime() {
        return dropOffTime;
    }

    /**
     * dropOffTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffTime(String value) {
        this.dropOffTime = value;
    }

    /**
     * carGroupDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CarGroupType }
     *     
     */
    public CarGroupType getCarGroupDetails() {
        return carGroupDetails;
    }

    /**
     * carGroupDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CarGroupType }
     *     
     */
    public void setCarGroupDetails(CarGroupType value) {
        this.carGroupDetails = value;
    }

    /**
     * numberOfDays 속성의 값을 가져옵니다.
     * 
     */
    public long getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * numberOfDays 속성의 값을 설정합니다.
     * 
     */
    public void setNumberOfDays(long value) {
        this.numberOfDays = value;
    }

}
