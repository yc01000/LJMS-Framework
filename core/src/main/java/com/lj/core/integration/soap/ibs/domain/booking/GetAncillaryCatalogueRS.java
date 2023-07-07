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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ancillaries" type="{http://www.ibsplc.com/iRes/simpleTypes/}AncillariesType" minOccurs="0"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
 *         &lt;element name="RichContentInfoList" type="{http://www.ibsplc.com/iRes/simpleTypes/}RichContentInfoListType" minOccurs="0"/&gt;
 *         &lt;element name="PaxList" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxListType" minOccurs="0"/&gt;
 *         &lt;element name="SsrFieldMetaDataList" type="{http://www.ibsplc.com/iRes/simpleTypes/}SsrFieldMetaDataListType" minOccurs="0"/&gt;
 *         &lt;element name="Itinerary" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItineraryDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "ancillaries",
    "errorType",
    "richContentInfoList",
    "paxList",
    "ssrFieldMetaDataList",
    "itinerary"
})
@XmlRootElement(name = "GetAncillaryCatalogueRS")
public class GetAncillaryCatalogueRS
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Ancillaries")
    protected AncillariesType ancillaries;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;
    @XmlElement(name = "RichContentInfoList")
    protected RichContentInfoListType richContentInfoList;
    @XmlElement(name = "PaxList")
    protected PaxListType paxList;
    @XmlElement(name = "SsrFieldMetaDataList")
    protected SsrFieldMetaDataListType ssrFieldMetaDataList;
    @XmlElement(name = "Itinerary")
    protected List<ItineraryDetailsType> itinerary;

    /**
     * ancillaries 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AncillariesType }
     *     
     */
    public AncillariesType getAncillaries() {
        return ancillaries;
    }

    /**
     * ancillaries 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillariesType }
     *     
     */
    public void setAncillaries(AncillariesType value) {
        this.ancillaries = value;
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

    /**
     * richContentInfoList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RichContentInfoListType }
     *     
     */
    public RichContentInfoListType getRichContentInfoList() {
        return richContentInfoList;
    }

    /**
     * richContentInfoList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RichContentInfoListType }
     *     
     */
    public void setRichContentInfoList(RichContentInfoListType value) {
        this.richContentInfoList = value;
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
     * ssrFieldMetaDataList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SsrFieldMetaDataListType }
     *     
     */
    public SsrFieldMetaDataListType getSsrFieldMetaDataList() {
        return ssrFieldMetaDataList;
    }

    /**
     * ssrFieldMetaDataList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SsrFieldMetaDataListType }
     *     
     */
    public void setSsrFieldMetaDataList(SsrFieldMetaDataListType value) {
        this.ssrFieldMetaDataList = value;
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

}
