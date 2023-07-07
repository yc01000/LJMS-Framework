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
 * <p>PnrDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PnrDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PNRExtractOandDDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRExtractOandDDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PnrPaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrPaxDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PNRExtractPnrContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRExtractPnrContact" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Comments" type="{http://www.ibsplc.com/iRes/simpleTypes/}Comments" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PNRExtractBookerDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRExtractBookerDetails" minOccurs="0"/&gt;
 *         &lt;element name="TimeLimitDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TimeLimitDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PNRExtractSSRDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRExtractSSRDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrDetails", propOrder = {
    "pnrExtractOandDDetails",
    "pnrPaxDetails",
    "pnrExtractPnrContact",
    "comments",
    "pnrExtractBookerDetails",
    "timeLimitDetails",
    "pnrExtractSSRDetails"
})
public class PnrDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PNRExtractOandDDetails", required = true)
    protected List<PNRExtractOandDDetails> pnrExtractOandDDetails;
    @XmlElement(name = "PnrPaxDetails", required = true)
    protected List<PnrPaxDetails> pnrPaxDetails;
    @XmlElement(name = "PNRExtractPnrContact", required = true)
    protected List<PNRExtractPnrContact> pnrExtractPnrContact;
    @XmlElement(name = "Comments")
    protected List<Comments> comments;
    @XmlElement(name = "PNRExtractBookerDetails")
    protected PNRExtractBookerDetails pnrExtractBookerDetails;
    @XmlElement(name = "TimeLimitDetails")
    protected List<TimeLimitDetailsType> timeLimitDetails;
    @XmlElement(name = "PNRExtractSSRDetails")
    protected List<PNRExtractSSRDetails> pnrExtractSSRDetails;

    /**
     * Gets the value of the pnrExtractOandDDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrExtractOandDDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPNRExtractOandDDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRExtractOandDDetails }
     * 
     * 
     */
    public List<PNRExtractOandDDetails> getPNRExtractOandDDetails() {
        if (pnrExtractOandDDetails == null) {
            pnrExtractOandDDetails = new ArrayList<PNRExtractOandDDetails>();
        }
        return this.pnrExtractOandDDetails;
    }

    /**
     * Gets the value of the pnrPaxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrPaxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrPaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrPaxDetails }
     * 
     * 
     */
    public List<PnrPaxDetails> getPnrPaxDetails() {
        if (pnrPaxDetails == null) {
            pnrPaxDetails = new ArrayList<PnrPaxDetails>();
        }
        return this.pnrPaxDetails;
    }

    /**
     * Gets the value of the pnrExtractPnrContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrExtractPnrContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPNRExtractPnrContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRExtractPnrContact }
     * 
     * 
     */
    public List<PNRExtractPnrContact> getPNRExtractPnrContact() {
        if (pnrExtractPnrContact == null) {
            pnrExtractPnrContact = new ArrayList<PNRExtractPnrContact>();
        }
        return this.pnrExtractPnrContact;
    }

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comments }
     * 
     * 
     */
    public List<Comments> getComments() {
        if (comments == null) {
            comments = new ArrayList<Comments>();
        }
        return this.comments;
    }

    /**
     * pnrExtractBookerDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PNRExtractBookerDetails }
     *     
     */
    public PNRExtractBookerDetails getPNRExtractBookerDetails() {
        return pnrExtractBookerDetails;
    }

    /**
     * pnrExtractBookerDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRExtractBookerDetails }
     *     
     */
    public void setPNRExtractBookerDetails(PNRExtractBookerDetails value) {
        this.pnrExtractBookerDetails = value;
    }

    /**
     * Gets the value of the timeLimitDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeLimitDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeLimitDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeLimitDetailsType }
     * 
     * 
     */
    public List<TimeLimitDetailsType> getTimeLimitDetails() {
        if (timeLimitDetails == null) {
            timeLimitDetails = new ArrayList<TimeLimitDetailsType>();
        }
        return this.timeLimitDetails;
    }

    /**
     * Gets the value of the pnrExtractSSRDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrExtractSSRDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPNRExtractSSRDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRExtractSSRDetails }
     * 
     * 
     */
    public List<PNRExtractSSRDetails> getPNRExtractSSRDetails() {
        if (pnrExtractSSRDetails == null) {
            pnrExtractSSRDetails = new ArrayList<PNRExtractSSRDetails>();
        }
        return this.pnrExtractSSRDetails;
    }

}
