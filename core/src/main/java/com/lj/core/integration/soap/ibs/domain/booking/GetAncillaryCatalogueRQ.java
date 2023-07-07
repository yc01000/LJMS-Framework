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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BookingChannel" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingChannelKeyType"/&gt;
 *         &lt;element name="PointOfSale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Itinerary" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItineraryDetailsType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="FareInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareInfoType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SaleDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="BundleAncillaries" type="{http://www.ibsplc.com/iRes/simpleTypes/}BundleAncillaries" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorporateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TourOperatorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaxList" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxListType"/&gt;
 *         &lt;element name="IsNotifiableSSR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncludeRichContentInfoInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncludeSSRFieldsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "bookingChannel",
    "pointOfSale",
    "itinerary",
    "fareInfo",
    "saleDate",
    "bundleAncillaries",
    "agencyCode",
    "corporateId",
    "tourOperatorNumber",
    "paxList",
    "isNotifiableSSR",
    "includeRichContentInfoInd",
    "includeSSRFieldsInd"
})
@XmlRootElement(name = "GetAncillaryCatalogueRQ")
public class GetAncillaryCatalogueRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "BookingChannel", required = true)
    protected BookingChannelKeyType bookingChannel;
    @XmlElement(name = "PointOfSale")
    protected String pointOfSale;
    @XmlElement(name = "Itinerary", required = true)
    protected List<ItineraryDetailsType> itinerary;
    @XmlElement(name = "FareInfo", required = true)
    protected List<FareInfoType> fareInfo;
    @XmlElement(name = "SaleDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saleDate;
    @XmlElement(name = "BundleAncillaries")
    protected List<BundleAncillaries> bundleAncillaries;
    @XmlElement(name = "AgencyCode")
    protected String agencyCode;
    @XmlElement(name = "CorporateId")
    protected String corporateId;
    @XmlElement(name = "TourOperatorNumber")
    protected String tourOperatorNumber;
    @XmlElement(name = "PaxList", required = true)
    protected PaxListType paxList;
    @XmlElement(name = "IsNotifiableSSR")
    protected Boolean isNotifiableSSR;
    @XmlElement(name = "IncludeRichContentInfoInd")
    protected Boolean includeRichContentInfoInd;
    @XmlElement(name = "IncludeSSRFieldsInd")
    protected Boolean includeSSRFieldsInd;

    /**
     * airlineCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * airlineCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * bookingChannel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BookingChannelKeyType }
     *     
     */
    public BookingChannelKeyType getBookingChannel() {
        return bookingChannel;
    }

    /**
     * bookingChannel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingChannelKeyType }
     *     
     */
    public void setBookingChannel(BookingChannelKeyType value) {
        this.bookingChannel = value;
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
     * Gets the value of the fareInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInfoType }
     * 
     * 
     */
    public List<FareInfoType> getFareInfo() {
        if (fareInfo == null) {
            fareInfo = new ArrayList<FareInfoType>();
        }
        return this.fareInfo;
    }

    /**
     * saleDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleDate() {
        return saleDate;
    }

    /**
     * saleDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleDate(XMLGregorianCalendar value) {
        this.saleDate = value;
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

    /**
     * agencyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * agencyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * corporateId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateId() {
        return corporateId;
    }

    /**
     * corporateId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateId(String value) {
        this.corporateId = value;
    }

    /**
     * tourOperatorNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorNumber() {
        return tourOperatorNumber;
    }

    /**
     * tourOperatorNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorNumber(String value) {
        this.tourOperatorNumber = value;
    }

    /**
     * paxList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PaxListType }
     *     
     */
    public PaxListType getPaxList() {
        return paxList;
    }

    /**
     * paxList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxListType }
     *     
     */
    public void setPaxList(PaxListType value) {
        this.paxList = value;
    }

    /**
     * isNotifiableSSR 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNotifiableSSR() {
        return isNotifiableSSR;
    }

    /**
     * isNotifiableSSR 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNotifiableSSR(Boolean value) {
        this.isNotifiableSSR = value;
    }

    /**
     * includeRichContentInfoInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeRichContentInfoInd() {
        return includeRichContentInfoInd;
    }

    /**
     * includeRichContentInfoInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeRichContentInfoInd(Boolean value) {
        this.includeRichContentInfoInd = value;
    }

    /**
     * includeSSRFieldsInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSSRFieldsInd() {
        return includeSSRFieldsInd;
    }

    /**
     * includeSSRFieldsInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSSRFieldsInd(Boolean value) {
        this.includeSSRFieldsInd = value;
    }

}
