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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>PaxChangeType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaxChangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SSRDelIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="travelDocDelIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="nextOfKinDelIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="InfantDelIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PnrActionType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrActionType"/&gt;
 *         &lt;element name="GuestRequestDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestRequestDetailsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxChangeType", propOrder = {
    "ssrDelIndicator",
    "travelDocDelIndicator",
    "nextOfKinDelIndicator",
    "infantDelIndicator",
    "pnrActionType",
    "guestRequestDetailsType"
})
public class PaxChangeType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "SSRDelIndicator")
    protected boolean ssrDelIndicator;
    protected boolean travelDocDelIndicator;
    protected boolean nextOfKinDelIndicator;
    @XmlElement(name = "InfantDelIndicator")
    protected boolean infantDelIndicator;
    @XmlElement(name = "PnrActionType", required = true)
    @XmlSchemaType(name = "string")
    protected PnrActionType pnrActionType;
    @XmlElement(name = "GuestRequestDetailsType", required = true)
    protected GuestRequestDetailsType guestRequestDetailsType;

    /**
     * ssrDelIndicator 속성의 값을 가져옵니다.
     * 
     */
    public boolean isSSRDelIndicator() {
        return ssrDelIndicator;
    }

    /**
     * ssrDelIndicator 속성의 값을 설정합니다.
     * 
     */
    public void setSSRDelIndicator(boolean value) {
        this.ssrDelIndicator = value;
    }

    /**
     * travelDocDelIndicator 속성의 값을 가져옵니다.
     * 
     */
    public boolean isTravelDocDelIndicator() {
        return travelDocDelIndicator;
    }

    /**
     * travelDocDelIndicator 속성의 값을 설정합니다.
     * 
     */
    public void setTravelDocDelIndicator(boolean value) {
        this.travelDocDelIndicator = value;
    }

    /**
     * nextOfKinDelIndicator 속성의 값을 가져옵니다.
     * 
     */
    public boolean isNextOfKinDelIndicator() {
        return nextOfKinDelIndicator;
    }

    /**
     * nextOfKinDelIndicator 속성의 값을 설정합니다.
     * 
     */
    public void setNextOfKinDelIndicator(boolean value) {
        this.nextOfKinDelIndicator = value;
    }

    /**
     * infantDelIndicator 속성의 값을 가져옵니다.
     * 
     */
    public boolean isInfantDelIndicator() {
        return infantDelIndicator;
    }

    /**
     * infantDelIndicator 속성의 값을 설정합니다.
     * 
     */
    public void setInfantDelIndicator(boolean value) {
        this.infantDelIndicator = value;
    }

    /**
     * pnrActionType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PnrActionType }
     *     
     */
    public PnrActionType getPnrActionType() {
        return pnrActionType;
    }

    /**
     * pnrActionType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PnrActionType }
     *     
     */
    public void setPnrActionType(PnrActionType value) {
        this.pnrActionType = value;
    }

    /**
     * guestRequestDetailsType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GuestRequestDetailsType }
     *     
     */
    public GuestRequestDetailsType getGuestRequestDetailsType() {
        return guestRequestDetailsType;
    }

    /**
     * guestRequestDetailsType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestRequestDetailsType }
     *     
     */
    public void setGuestRequestDetailsType(GuestRequestDetailsType value) {
        this.guestRequestDetailsType = value;
    }

}
