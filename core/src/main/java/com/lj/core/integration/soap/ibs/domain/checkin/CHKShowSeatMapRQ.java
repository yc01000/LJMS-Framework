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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Example showing seat map retrieval.Flight Route is A-B-C.There is an equipment change in A-B and B-C.User asks the system to retreive seat map info for A-C ,he sets the board Point as A and OffPoint as C.Child Board Point and Child Offpoint defined in ChildSegmentInfo is also set as A and C.System retreives the seat map for A-B and the response will also conssits of the child segments for this segment A-C .This will be A-B and B-C.If the user wants to retreive the seat map for B-C he sets boardPoint and OffPoint as A and C and Child BoardPoint and OffPoint as B-C.
 * 
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirlineCode"/&gt;
 *         &lt;element name="FlightDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FlightNumber" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightNumberType"/&gt;
 *         &lt;element name="ChannelKey" type="{http://www.ibsplc.com/iRes/simpleTypes/}ChannelKeyType"/&gt;
 *         &lt;element name="SegmentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentInfo"/&gt;
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChildSegmentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}SegmentInfo" minOccurs="0"/&gt;
 *         &lt;element name="PointOfSale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TourOperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isSeatFeeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BundleAncillaries" type="{http://www.ibsplc.com/iRes/simpleTypes/}BundleAncillaries" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airlineCode",
    "flightDate",
    "flightNumber",
    "channelKey",
    "segmentInfo",
    "pnrNumber",
    "childSegmentInfo",
    "pointOfSale",
    "tourOperatorCode",
    "isSeatFeeRequired",
    "bundleAncillaries"
})
@XmlRootElement(name = "CHK_ShowSeatMapRQ")
public class CHKShowSeatMapRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected AirlineCode airlineCode;
    @XmlElement(name = "FlightDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flightDate;
    @XmlElement(name = "FlightNumber", required = true)
    protected FlightNumberType flightNumber;
    @XmlElement(name = "ChannelKey", required = true)
    protected ChannelKeyType channelKey;
    @XmlElement(name = "SegmentInfo", required = true)
    protected SegmentInfo segmentInfo;
    @XmlElement(name = "PnrNumber")
    protected String pnrNumber;
    @XmlElement(name = "ChildSegmentInfo")
    protected SegmentInfo childSegmentInfo;
    @XmlElement(name = "PointOfSale")
    protected String pointOfSale;
    @XmlElement(name = "TourOperatorCode")
    protected String tourOperatorCode;
    protected Boolean isSeatFeeRequired;
    @XmlElement(name = "BundleAncillaries")
    protected List<BundleAncillaries> bundleAncillaries;

    /**
     * airlineCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AirlineCode }
     *     
     */
    public AirlineCode getAirlineCode() {
        return airlineCode;
    }

    /**
     * airlineCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineCode }
     *     
     */
    public void setAirlineCode(AirlineCode value) {
        this.airlineCode = value;
    }

    /**
     * flightDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlightDate() {
        return flightDate;
    }

    /**
     * flightDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlightDate(XMLGregorianCalendar value) {
        this.flightDate = value;
    }

    /**
     * flightNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightNumberType }
     *     
     */
    public FlightNumberType getFlightNumber() {
        return flightNumber;
    }

    /**
     * flightNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightNumberType }
     *     
     */
    public void setFlightNumber(FlightNumberType value) {
        this.flightNumber = value;
    }

    /**
     * channelKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ChannelKeyType }
     *     
     */
    public ChannelKeyType getChannelKey() {
        return channelKey;
    }

    /**
     * channelKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelKeyType }
     *     
     */
    public void setChannelKey(ChannelKeyType value) {
        this.channelKey = value;
    }

    /**
     * segmentInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SegmentInfo }
     *     
     */
    public SegmentInfo getSegmentInfo() {
        return segmentInfo;
    }

    /**
     * segmentInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentInfo }
     *     
     */
    public void setSegmentInfo(SegmentInfo value) {
        this.segmentInfo = value;
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
     * childSegmentInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SegmentInfo }
     *     
     */
    public SegmentInfo getChildSegmentInfo() {
        return childSegmentInfo;
    }

    /**
     * childSegmentInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentInfo }
     *     
     */
    public void setChildSegmentInfo(SegmentInfo value) {
        this.childSegmentInfo = value;
    }

    /**
     * pointOfSale 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSale() {
        return pointOfSale;
    }

    /**
     * pointOfSale 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSale(String value) {
        this.pointOfSale = value;
    }

    /**
     * tourOperatorCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorCode() {
        return tourOperatorCode;
    }

    /**
     * tourOperatorCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorCode(String value) {
        this.tourOperatorCode = value;
    }

    /**
     * isSeatFeeRequired 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSeatFeeRequired() {
        return isSeatFeeRequired;
    }

    /**
     * isSeatFeeRequired 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSeatFeeRequired(Boolean value) {
        this.isSeatFeeRequired = value;
    }

    /**
     * Gets the value of the bundleAncillaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bundleAncillaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBundleAncillaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BundleAncillaries }
     * 
     * 
     */
    public List<BundleAncillaries> getBundleAncillaries() {
        if (bundleAncillaries == null) {
            bundleAncillaries = new ArrayList<BundleAncillaries>();
        }
        return this.bundleAncillaries;
    }

}
