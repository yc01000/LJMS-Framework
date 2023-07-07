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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>PaxSegmentMapping complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaxSegmentMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaxID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="PaxType" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestType" minOccurs="0"/&gt;
 *         &lt;element name="ItineraryInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItineraryInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SSRSegmentMapping" type="{http://www.ibsplc.com/iRes/simpleTypes/}SSRSegmentMapping" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxSegmentMapping", propOrder = {
    "paxID",
    "paxType",
    "itineraryInfo",
    "ssrSegmentMapping"
})
public class PaxSegmentMapping
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PaxID")
    protected long paxID;
    @XmlElement(name = "PaxType")
    @XmlSchemaType(name = "string")
    protected GuestType paxType;
    @XmlElement(name = "ItineraryInfo")
    protected List<ItineraryInfo> itineraryInfo;
    @XmlElement(name = "SSRSegmentMapping")
    protected List<SSRSegmentMapping> ssrSegmentMapping;

    /**
     * paxID 속성의 값을 가져옵니다.
     * 
     */
    public long getPaxID() {
        return paxID;
    }

    /**
     * paxID 속성의 값을 설정합니다.
     * 
     */
    public void setPaxID(long value) {
        this.paxID = value;
    }

    /**
     * paxType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GuestType }
     *     
     */
    public GuestType getPaxType() {
        return paxType;
    }

    /**
     * paxType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestType }
     *     
     */
    public void setPaxType(GuestType value) {
        this.paxType = value;
    }

    /**
     * Gets the value of the itineraryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryInfo }
     * 
     * 
     */
    public List<ItineraryInfo> getItineraryInfo() {
        if (itineraryInfo == null) {
            itineraryInfo = new ArrayList<ItineraryInfo>();
        }
        return this.itineraryInfo;
    }

    /**
     * Gets the value of the ssrSegmentMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrSegmentMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRSegmentMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSRSegmentMapping }
     * 
     * 
     */
    public List<SSRSegmentMapping> getSSRSegmentMapping() {
        if (ssrSegmentMapping == null) {
            ssrSegmentMapping = new ArrayList<SSRSegmentMapping>();
        }
        return this.ssrSegmentMapping;
    }

}
