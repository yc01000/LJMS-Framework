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
 * <p>GiftVoucherDenominationDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GiftVoucherDenominationDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="giftVoucherValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="giftVoucherQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="GiftVoucherTaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GiftVoucherTax" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="gcSeqId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftVoucherDenominationDetails", propOrder = {
    "giftVoucherValue",
    "giftVoucherQuantity",
    "giftVoucherTaxDetails",
    "totalTaxAmount",
    "gcSeqId",
    "imageUrl"
})
public class GiftVoucherDenominationDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected double giftVoucherValue;
    protected int giftVoucherQuantity;
    @XmlElement(name = "GiftVoucherTaxDetails")
    protected List<GiftVoucherTax> giftVoucherTaxDetails;
    @XmlElement(name = "TotalTaxAmount")
    protected Double totalTaxAmount;
    protected String gcSeqId;
    protected String imageUrl;

    /**
     * giftVoucherValue 속성의 값을 가져옵니다.
     * 
     */
    public double getGiftVoucherValue() {
        return giftVoucherValue;
    }

    /**
     * giftVoucherValue 속성의 값을 설정합니다.
     * 
     */
    public void setGiftVoucherValue(double value) {
        this.giftVoucherValue = value;
    }

    /**
     * giftVoucherQuantity 속성의 값을 가져옵니다.
     * 
     */
    public int getGiftVoucherQuantity() {
        return giftVoucherQuantity;
    }

    /**
     * giftVoucherQuantity 속성의 값을 설정합니다.
     * 
     */
    public void setGiftVoucherQuantity(int value) {
        this.giftVoucherQuantity = value;
    }

    /**
     * Gets the value of the giftVoucherTaxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftVoucherTaxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftVoucherTaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GiftVoucherTax }
     * 
     * 
     */
    public List<GiftVoucherTax> getGiftVoucherTaxDetails() {
        if (giftVoucherTaxDetails == null) {
            giftVoucherTaxDetails = new ArrayList<GiftVoucherTax>();
        }
        return this.giftVoucherTaxDetails;
    }

    /**
     * totalTaxAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * totalTaxAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalTaxAmount(Double value) {
        this.totalTaxAmount = value;
    }

    /**
     * gcSeqId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGcSeqId() {
        return gcSeqId;
    }

    /**
     * gcSeqId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGcSeqId(String value) {
        this.gcSeqId = value;
    }

    /**
     * imageUrl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * imageUrl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

}
