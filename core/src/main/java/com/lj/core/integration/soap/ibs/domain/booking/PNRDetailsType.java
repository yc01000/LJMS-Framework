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
 * <p>PNRDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PNRDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OandDDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}OandDDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element name="GroupPaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GroupPaxDetails" minOccurs="0"/&gt;
 *         &lt;element name="PnrGuestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrGuestDetailsType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PnrContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrContact" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SSRDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SSRDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.ibsplc.com/iRes/simpleTypes/}CommentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BookerDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookerDetails" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}LoyaltyDetails" minOccurs="0"/&gt;
 *         &lt;element name="PromoCodeDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PromoCodeDetails" minOccurs="0"/&gt;
 *         &lt;element name="CrossreferenceDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CrossreferenceDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AuxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DiscountCouponDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}DiscountCouponDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TimeLimitDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}TimeLimitDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalNonRefundableAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DeletedPnrGuestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrGuestDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNRDetailsType", propOrder = {
    "oandDDetails",
    "groupPaxDetails",
    "pnrGuestDetails",
    "pnrContact",
    "ssrDetails",
    "comments",
    "bookerDetails",
    "loyaltyDetails",
    "promoCodeDetails",
    "crossreferenceDetails",
    "auxDetails",
    "discountCouponDetails",
    "timeLimitDetails",
    "totalNonRefundableAmount",
    "deletedPnrGuestDetails"
})
public class PNRDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "OandDDetails", required = true)
    protected List<OandDDetails> oandDDetails;
    @XmlElement(name = "GroupPaxDetails")
    protected GroupPaxDetails groupPaxDetails;
    @XmlElement(name = "PnrGuestDetails", required = true)
    protected List<PnrGuestDetailsType> pnrGuestDetails;
    @XmlElement(name = "PnrContact", required = true)
    protected List<PnrContact> pnrContact;
    @XmlElement(name = "SSRDetails")
    protected List<SSRDetailsType> ssrDetails;
    @XmlElement(name = "Comments")
    protected List<CommentType> comments;
    @XmlElement(name = "BookerDetails")
    protected BookerDetails bookerDetails;
    @XmlElement(name = "LoyaltyDetails")
    protected LoyaltyDetails loyaltyDetails;
    @XmlElement(name = "PromoCodeDetails")
    protected PromoCodeDetails promoCodeDetails;
    @XmlElement(name = "CrossreferenceDetails")
    protected List<CrossreferenceDetailsType> crossreferenceDetails;
    @XmlElement(name = "AuxDetails")
    protected List<AuxDetailsType> auxDetails;
    @XmlElement(name = "DiscountCouponDetails")
    protected List<DiscountCouponDetails> discountCouponDetails;
    @XmlElement(name = "TimeLimitDetails")
    protected List<TimeLimitDetailsType> timeLimitDetails;
    protected Double totalNonRefundableAmount;
    @XmlElement(name = "DeletedPnrGuestDetails")
    protected List<PnrGuestDetailsType> deletedPnrGuestDetails;

    /**
     * Gets the value of the oandDDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oandDDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOandDDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OandDDetails }
     * 
     * 
     */
    public List<OandDDetails> getOandDDetails() {
        if (oandDDetails == null) {
            oandDDetails = new ArrayList<OandDDetails>();
        }
        return this.oandDDetails;
    }

    /**
     * groupPaxDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GroupPaxDetails }
     *     
     */
    public GroupPaxDetails getGroupPaxDetails() {
        return groupPaxDetails;
    }

    /**
     * groupPaxDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupPaxDetails }
     *     
     */
    public void setGroupPaxDetails(GroupPaxDetails value) {
        this.groupPaxDetails = value;
    }

    /**
     * Gets the value of the pnrGuestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrGuestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrGuestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrGuestDetailsType }
     * 
     * 
     */
    public List<PnrGuestDetailsType> getPnrGuestDetails() {
        if (pnrGuestDetails == null) {
            pnrGuestDetails = new ArrayList<PnrGuestDetailsType>();
        }
        return this.pnrGuestDetails;
    }

    /**
     * Gets the value of the pnrContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrContact }
     * 
     * 
     */
    public List<PnrContact> getPnrContact() {
        if (pnrContact == null) {
            pnrContact = new ArrayList<PnrContact>();
        }
        return this.pnrContact;
    }

    /**
     * Gets the value of the ssrDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSRDetailsType }
     * 
     * 
     */
    public List<SSRDetailsType> getSSRDetails() {
        if (ssrDetails == null) {
            ssrDetails = new ArrayList<SSRDetailsType>();
        }
        return this.ssrDetails;
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
     * {@link CommentType }
     * 
     * 
     */
    public List<CommentType> getComments() {
        if (comments == null) {
            comments = new ArrayList<CommentType>();
        }
        return this.comments;
    }

    /**
     * bookerDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BookerDetails }
     *     
     */
    public BookerDetails getBookerDetails() {
        return bookerDetails;
    }

    /**
     * bookerDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BookerDetails }
     *     
     */
    public void setBookerDetails(BookerDetails value) {
        this.bookerDetails = value;
    }

    /**
     * loyaltyDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyDetails }
     *     
     */
    public LoyaltyDetails getLoyaltyDetails() {
        return loyaltyDetails;
    }

    /**
     * loyaltyDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyDetails }
     *     
     */
    public void setLoyaltyDetails(LoyaltyDetails value) {
        this.loyaltyDetails = value;
    }

    /**
     * promoCodeDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PromoCodeDetails }
     *     
     */
    public PromoCodeDetails getPromoCodeDetails() {
        return promoCodeDetails;
    }

    /**
     * promoCodeDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PromoCodeDetails }
     *     
     */
    public void setPromoCodeDetails(PromoCodeDetails value) {
        this.promoCodeDetails = value;
    }

    /**
     * Gets the value of the crossreferenceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crossreferenceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrossreferenceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrossreferenceDetailsType }
     * 
     * 
     */
    public List<CrossreferenceDetailsType> getCrossreferenceDetails() {
        if (crossreferenceDetails == null) {
            crossreferenceDetails = new ArrayList<CrossreferenceDetailsType>();
        }
        return this.crossreferenceDetails;
    }

    /**
     * Gets the value of the auxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuxDetailsType }
     * 
     * 
     */
    public List<AuxDetailsType> getAuxDetails() {
        if (auxDetails == null) {
            auxDetails = new ArrayList<AuxDetailsType>();
        }
        return this.auxDetails;
    }

    /**
     * Gets the value of the discountCouponDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountCouponDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountCouponDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountCouponDetails }
     * 
     * 
     */
    public List<DiscountCouponDetails> getDiscountCouponDetails() {
        if (discountCouponDetails == null) {
            discountCouponDetails = new ArrayList<DiscountCouponDetails>();
        }
        return this.discountCouponDetails;
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
     * totalNonRefundableAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalNonRefundableAmount() {
        return totalNonRefundableAmount;
    }

    /**
     * totalNonRefundableAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalNonRefundableAmount(Double value) {
        this.totalNonRefundableAmount = value;
    }

    /**
     * Gets the value of the deletedPnrGuestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletedPnrGuestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletedPnrGuestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrGuestDetailsType }
     * 
     * 
     */
    public List<PnrGuestDetailsType> getDeletedPnrGuestDetails() {
        if (deletedPnrGuestDetails == null) {
            deletedPnrGuestDetails = new ArrayList<PnrGuestDetailsType>();
        }
        return this.deletedPnrGuestDetails;
    }

}
