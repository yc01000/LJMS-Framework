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


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ibsplc.com/iRes/simpleTypes/}BasePnrRQType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberOfSeats" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PaxCountDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxCountDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ItineraryDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItineraryDetailsType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="FareInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareInfoType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TaxExemptions" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxExemptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GroupPaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GroupPaxDetailsType"/&gt;
 *         &lt;element name="GroupQuoteContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrContactType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="QuoteOption" type="{http://www.ibsplc.com/iRes/simpleTypes/}QuoteOption" minOccurs="0"/&gt;
 *         &lt;element name="GroupQuoteComments" type="{http://www.ibsplc.com/iRes/simpleTypes/}GroupQuoteCommentsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PromoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numberOfSeats",
    "paxCountDetails",
    "itineraryDetails",
    "fareInfo",
    "taxExemptions",
    "groupPaxDetails",
    "groupQuoteContact",
    "quoteOption",
    "groupQuoteComments",
    "promoCode"
})
@XmlRootElement(name = "CreateGroupQuoteRQ")
public class CreateGroupQuoteRQ
    extends BasePnrRQType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "NumberOfSeats")
    protected Integer numberOfSeats;
    @XmlElement(name = "PaxCountDetails")
    protected List<PaxCountDetailsType> paxCountDetails;
    @XmlElement(name = "ItineraryDetails", required = true)
    protected List<ItineraryDetailsType> itineraryDetails;
    @XmlElement(name = "FareInfo", required = true)
    protected List<FareInfoType> fareInfo;
    @XmlElement(name = "TaxExemptions")
    protected List<TaxExemptionType> taxExemptions;
    @XmlElement(name = "GroupPaxDetails", required = true)
    protected GroupPaxDetailsType groupPaxDetails;
    @XmlElement(name = "GroupQuoteContact", required = true)
    protected List<PnrContactType> groupQuoteContact;
    @XmlElement(name = "QuoteOption")
    @XmlSchemaType(name = "string")
    protected QuoteOption quoteOption;
    @XmlElement(name = "GroupQuoteComments")
    protected List<GroupQuoteCommentsType> groupQuoteComments;
    @XmlElement(name = "PromoCode")
    protected String promoCode;

    /**
     * numberOfSeats 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * numberOfSeats 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfSeats(Integer value) {
        this.numberOfSeats = value;
    }

    /**
     * Gets the value of the paxCountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxCountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxCountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxCountDetailsType }
     * 
     * 
     */
    public List<PaxCountDetailsType> getPaxCountDetails() {
        if (paxCountDetails == null) {
            paxCountDetails = new ArrayList<PaxCountDetailsType>();
        }
        return this.paxCountDetails;
    }

    /**
     * Gets the value of the itineraryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryDetailsType }
     * 
     * 
     */
    public List<ItineraryDetailsType> getItineraryDetails() {
        if (itineraryDetails == null) {
            itineraryDetails = new ArrayList<ItineraryDetailsType>();
        }
        return this.itineraryDetails;
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
     * Gets the value of the taxExemptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxExemptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxExemptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxExemptionType }
     * 
     * 
     */
    public List<TaxExemptionType> getTaxExemptions() {
        if (taxExemptions == null) {
            taxExemptions = new ArrayList<TaxExemptionType>();
        }
        return this.taxExemptions;
    }

    /**
     * groupPaxDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GroupPaxDetailsType }
     *     
     */
    public GroupPaxDetailsType getGroupPaxDetails() {
        return groupPaxDetails;
    }

    /**
     * groupPaxDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupPaxDetailsType }
     *     
     */
    public void setGroupPaxDetails(GroupPaxDetailsType value) {
        this.groupPaxDetails = value;
    }

    /**
     * Gets the value of the groupQuoteContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupQuoteContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupQuoteContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrContactType }
     * 
     * 
     */
    public List<PnrContactType> getGroupQuoteContact() {
        if (groupQuoteContact == null) {
            groupQuoteContact = new ArrayList<PnrContactType>();
        }
        return this.groupQuoteContact;
    }

    /**
     * quoteOption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link QuoteOption }
     *     
     */
    public QuoteOption getQuoteOption() {
        return quoteOption;
    }

    /**
     * quoteOption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteOption }
     *     
     */
    public void setQuoteOption(QuoteOption value) {
        this.quoteOption = value;
    }

    /**
     * Gets the value of the groupQuoteComments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupQuoteComments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupQuoteComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupQuoteCommentsType }
     * 
     * 
     */
    public List<GroupQuoteCommentsType> getGroupQuoteComments() {
        if (groupQuoteComments == null) {
            groupQuoteComments = new ArrayList<GroupQuoteCommentsType>();
        }
        return this.groupQuoteComments;
    }

    /**
     * promoCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * promoCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

}
