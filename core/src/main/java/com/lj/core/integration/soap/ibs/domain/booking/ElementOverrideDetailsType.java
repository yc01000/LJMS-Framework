//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2021.04.29 시간 12:54:19 PM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>ElementOverrideDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ElementOverrideDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElementId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ElementCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ElementType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ElementSubType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AmountInPOS" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="POSCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AmountInPOO" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="POOCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OverrideReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementOverrideDetailsType", propOrder = {
    "elementId",
    "elementCategory",
    "guestId",
    "elementType",
    "elementSubType",
    "amountInPOS",
    "posCurrency",
    "amountInPOO",
    "pooCurrency",
    "overrideReason"
})
public class ElementOverrideDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ElementId")
    protected long elementId;
    @XmlElement(name = "ElementCategory", required = true)
    protected String elementCategory;
    @XmlElement(name = "GuestId")
    protected long guestId;
    @XmlElement(name = "ElementType", required = true)
    protected String elementType;
    @XmlElement(name = "ElementSubType", required = true)
    protected String elementSubType;
    @XmlElement(name = "AmountInPOS")
    protected double amountInPOS;
    @XmlElement(name = "POSCurrency", required = true)
    protected String posCurrency;
    @XmlElement(name = "AmountInPOO")
    protected double amountInPOO;
    @XmlElement(name = "POOCurrency", required = true)
    protected String pooCurrency;
    @XmlElement(name = "OverrideReason")
    protected String overrideReason;

    /**
     * elementId 속성의 값을 가져옵니다.
     * 
     */
    public long getElementId() {
        return elementId;
    }

    /**
     * elementId 속성의 값을 설정합니다.
     * 
     */
    public void setElementId(long value) {
        this.elementId = value;
    }

    /**
     * elementCategory 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementCategory() {
        return elementCategory;
    }

    /**
     * elementCategory 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementCategory(String value) {
        this.elementCategory = value;
    }

    /**
     * guestId 속성의 값을 가져옵니다.
     * 
     */
    public long getGuestId() {
        return guestId;
    }

    /**
     * guestId 속성의 값을 설정합니다.
     * 
     */
    public void setGuestId(long value) {
        this.guestId = value;
    }

    /**
     * elementType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementType() {
        return elementType;
    }

    /**
     * elementType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementType(String value) {
        this.elementType = value;
    }

    /**
     * elementSubType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementSubType() {
        return elementSubType;
    }

    /**
     * elementSubType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementSubType(String value) {
        this.elementSubType = value;
    }

    /**
     * amountInPOS 속성의 값을 가져옵니다.
     * 
     */
    public double getAmountInPOS() {
        return amountInPOS;
    }

    /**
     * amountInPOS 속성의 값을 설정합니다.
     * 
     */
    public void setAmountInPOS(double value) {
        this.amountInPOS = value;
    }

    /**
     * posCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSCurrency() {
        return posCurrency;
    }

    /**
     * posCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSCurrency(String value) {
        this.posCurrency = value;
    }

    /**
     * amountInPOO 속성의 값을 가져옵니다.
     * 
     */
    public double getAmountInPOO() {
        return amountInPOO;
    }

    /**
     * amountInPOO 속성의 값을 설정합니다.
     * 
     */
    public void setAmountInPOO(double value) {
        this.amountInPOO = value;
    }

    /**
     * pooCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOOCurrency() {
        return pooCurrency;
    }

    /**
     * pooCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOOCurrency(String value) {
        this.pooCurrency = value;
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

}
