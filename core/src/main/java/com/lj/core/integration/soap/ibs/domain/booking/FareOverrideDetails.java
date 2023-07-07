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
 * <p>FareOverrideDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FareOverrideDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OverriddenFare" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="OverrideReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareOverrideDetails", propOrder = {
    "guestId",
    "overriddenFare",
    "overrideReason",
    "currencyCode"
})
public class FareOverrideDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "GuestId", type = Long.class)
    protected List<Long> guestId;
    @XmlElement(name = "OverriddenFare")
    protected double overriddenFare;
    @XmlElement(name = "OverrideReason", required = true)
    protected String overrideReason;
    @XmlElement(name = "CurrencyCode", required = true)
    protected String currencyCode;

    /**
     * Gets the value of the guestId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getGuestId() {
        if (guestId == null) {
            guestId = new ArrayList<Long>();
        }
        return this.guestId;
    }

    /**
     * overriddenFare 속성의 값을 가져옵니다.
     * 
     */
    public double getOverriddenFare() {
        return overriddenFare;
    }

    /**
     * overriddenFare 속성의 값을 설정합니다.
     * 
     */
    public void setOverriddenFare(double value) {
        this.overriddenFare = value;
    }

    /**
     * overrideReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideReason() {
        return overrideReason;
    }

    /**
     * overrideReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideReason(String value) {
        this.overrideReason = value;
    }

    /**
     * currencyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * currencyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

}
