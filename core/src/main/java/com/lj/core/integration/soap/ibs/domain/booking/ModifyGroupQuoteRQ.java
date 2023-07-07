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
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnrPaxCount" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrPaxCountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemptions" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxExemptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GroupPaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GroupPaxDetailsType"/&gt;
 *         &lt;element name="BookingContactChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingContactChangeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuoteOption" type="{http://www.ibsplc.com/iRes/simpleTypes/}QuoteOption" minOccurs="0"/&gt;
 *         &lt;element name="GQCommentChangeType" type="{http://www.ibsplc.com/iRes/simpleTypes/}GQCommentChangeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GroupQuoteStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DepositAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}TotalAmountPaid" minOccurs="0"/&gt;
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
    "pnrNumber",
    "pnrPaxCount",
    "taxExemptions",
    "groupPaxDetails",
    "bookingContactChangeType",
    "quoteOption",
    "gqCommentChangeType",
    "groupQuoteStatus",
    "depositAmount",
    "promoCode"
})
@XmlRootElement(name = "ModifyGroupQuoteRQ")
public class ModifyGroupQuoteRQ
    extends BasePnrRQType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "NumberOfSeats")
    protected Integer numberOfSeats;
    @XmlElement(name = "PnrNumber")
    protected String pnrNumber;
    @XmlElement(name = "PnrPaxCount")
    protected List<PnrPaxCountType> pnrPaxCount;
    @XmlElement(name = "TaxExemptions")
    protected List<TaxExemptionType> taxExemptions;
    @XmlElement(name = "GroupPaxDetails", required = true)
    protected GroupPaxDetailsType groupPaxDetails;
    @XmlElement(name = "BookingContactChangeType")
    protected List<BookingContactChangeType> bookingContactChangeType;
    @XmlElement(name = "QuoteOption")
    @XmlSchemaType(name = "string")
    protected QuoteOption quoteOption;
    @XmlElement(name = "GQCommentChangeType")
    protected List<GQCommentChangeType> gqCommentChangeType;
    @XmlElement(name = "GroupQuoteStatus", required = true)
    protected String groupQuoteStatus;
    @XmlElement(name = "DepositAmount")
    protected TotalAmountPaid depositAmount;
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
     * Gets the value of the pnrPaxCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrPaxCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrPaxCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrPaxCountType }
     * 
     * 
     */
    public List<PnrPaxCountType> getPnrPaxCount() {
        if (pnrPaxCount == null) {
            pnrPaxCount = new ArrayList<PnrPaxCountType>();
        }
        return this.pnrPaxCount;
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
     * Gets the value of the bookingContactChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingContactChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingContactChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingContactChangeType }
     * 
     * 
     */
    public List<BookingContactChangeType> getBookingContactChangeType() {
        if (bookingContactChangeType == null) {
            bookingContactChangeType = new ArrayList<BookingContactChangeType>();
        }
        return this.bookingContactChangeType;
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
     * Gets the value of the gqCommentChangeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gqCommentChangeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGQCommentChangeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GQCommentChangeType }
     * 
     * 
     */
    public List<GQCommentChangeType> getGQCommentChangeType() {
        if (gqCommentChangeType == null) {
            gqCommentChangeType = new ArrayList<GQCommentChangeType>();
        }
        return this.gqCommentChangeType;
    }

    /**
     * groupQuoteStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupQuoteStatus() {
        return groupQuoteStatus;
    }

    /**
     * groupQuoteStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupQuoteStatus(String value) {
        this.groupQuoteStatus = value;
    }

    /**
     * depositAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountPaid }
     *     
     */
    public TotalAmountPaid getDepositAmount() {
        return depositAmount;
    }

    /**
     * depositAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountPaid }
     *     
     */
    public void setDepositAmount(TotalAmountPaid value) {
        this.depositAmount = value;
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
