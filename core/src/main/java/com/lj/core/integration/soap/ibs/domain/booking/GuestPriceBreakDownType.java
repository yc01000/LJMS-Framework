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
 * Price break down details
 * 
 * <p>GuestPriceBreakDownType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GuestPriceBreakDownType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PriceBreakDown" type="{http://www.ibsplc.com/iRes/simpleTypes/}PriceBreakDownType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Tax" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="GuestType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxDetails_Type" minOccurs="0"/&gt;
 *         &lt;element name="GuestSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestPriceBreakDownType", propOrder = {
    "priceBreakDown",
    "tax",
    "guestId",
    "guestType",
    "guestSubType"
})
public class GuestPriceBreakDownType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PriceBreakDown")
    protected List<PriceBreakDownType> priceBreakDown;
    @XmlElement(name = "Tax")
    protected List<TaxType> tax;
    @XmlElement(name = "GuestId")
    protected Long guestId;
    @XmlElement(name = "GuestType")
    @XmlSchemaType(name = "string")
    protected PaxDetailsType guestType;
    @XmlElement(name = "GuestSubType")
    protected String guestSubType;

    /**
     * Gets the value of the priceBreakDown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceBreakDown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceBreakDown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceBreakDownType }
     * 
     * 
     */
    public List<PriceBreakDownType> getPriceBreakDown() {
        if (priceBreakDown == null) {
            priceBreakDown = new ArrayList<PriceBreakDownType>();
        }
        return this.priceBreakDown;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxType }
     * 
     * 
     */
    public List<TaxType> getTax() {
        if (tax == null) {
            tax = new ArrayList<TaxType>();
        }
        return this.tax;
    }

    /**
     * guestId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuestId() {
        return guestId;
    }

    /**
     * guestId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuestId(Long value) {
        this.guestId = value;
    }

    /**
     * guestType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PaxDetailsType }
     *     
     */
    public PaxDetailsType getGuestType() {
        return guestType;
    }

    /**
     * guestType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxDetailsType }
     *     
     */
    public void setGuestType(PaxDetailsType value) {
        this.guestType = value;
    }

    /**
     * guestSubType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestSubType() {
        return guestSubType;
    }

    /**
     * guestSubType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestSubType(String value) {
        this.guestSubType = value;
    }

}
