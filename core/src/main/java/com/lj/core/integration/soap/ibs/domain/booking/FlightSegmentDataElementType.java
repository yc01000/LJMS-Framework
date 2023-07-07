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
 * This contains the DEI code and the corresponding value.
 * 
 * <p>FlightSegmentDataElementType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FlightSegmentDataElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightSegmentIdentifierDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightSegmentIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="DataElements" type="{http://www.ibsplc.com/iRes/simpleTypes/}DataElementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MealCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}DataElementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CannedFacts" type="{http://www.ibsplc.com/iRes/simpleTypes/}DataElementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CodeShareInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}DataElementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegmentDataElementType", propOrder = {
    "flightSegmentIdentifierDetails",
    "dataElements",
    "mealCode",
    "cannedFacts",
    "codeShareInfo"
})
public class FlightSegmentDataElementType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FlightSegmentIdentifierDetails")
    protected FlightSegmentIdentifierType flightSegmentIdentifierDetails;
    @XmlElement(name = "DataElements")
    protected List<DataElementType> dataElements;
    @XmlElement(name = "MealCode")
    protected List<DataElementType> mealCode;
    @XmlElement(name = "CannedFacts")
    protected List<DataElementType> cannedFacts;
    @XmlElement(name = "CodeShareInfo")
    protected List<DataElementType> codeShareInfo;

    /**
     * flightSegmentIdentifierDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightSegmentIdentifierType }
     *     
     */
    public FlightSegmentIdentifierType getFlightSegmentIdentifierDetails() {
        return flightSegmentIdentifierDetails;
    }

    /**
     * flightSegmentIdentifierDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSegmentIdentifierType }
     *     
     */
    public void setFlightSegmentIdentifierDetails(FlightSegmentIdentifierType value) {
        this.flightSegmentIdentifierDetails = value;
    }

    /**
     * Gets the value of the dataElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataElementType }
     * 
     * 
     */
    public List<DataElementType> getDataElements() {
        if (dataElements == null) {
            dataElements = new ArrayList<DataElementType>();
        }
        return this.dataElements;
    }

    /**
     * Gets the value of the mealCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mealCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMealCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataElementType }
     * 
     * 
     */
    public List<DataElementType> getMealCode() {
        if (mealCode == null) {
            mealCode = new ArrayList<DataElementType>();
        }
        return this.mealCode;
    }

    /**
     * Gets the value of the cannedFacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cannedFacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCannedFacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataElementType }
     * 
     * 
     */
    public List<DataElementType> getCannedFacts() {
        if (cannedFacts == null) {
            cannedFacts = new ArrayList<DataElementType>();
        }
        return this.cannedFacts;
    }

    /**
     * Gets the value of the codeShareInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeShareInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeShareInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataElementType }
     * 
     * 
     */
    public List<DataElementType> getCodeShareInfo() {
        if (codeShareInfo == null) {
            codeShareInfo = new ArrayList<DataElementType>();
        }
        return this.codeShareInfo;
    }

}
