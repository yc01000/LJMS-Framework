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
 * <p>OandDChangeType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="OandDChangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ActionType"/&gt;
 *         &lt;element name="OandDDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}OandDDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OandDChangeType", propOrder = {
    "actionType",
    "oandDDetails"
})
public class OandDChangeType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ActionType", required = true)
    @XmlSchemaType(name = "string")
    protected ActionType actionType;
    @XmlElement(name = "OandDDetails", required = true)
    protected OandDDetails oandDDetails;

    /**
     * actionType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getActionType() {
        return actionType;
    }

    /**
     * actionType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setActionType(ActionType value) {
        this.actionType = value;
    }

    /**
     * oandDDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OandDDetails }
     *     
     */
    public OandDDetails getOandDDetails() {
        return oandDDetails;
    }

    /**
     * oandDDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OandDDetails }
     *     
     */
    public void setOandDDetails(OandDDetails value) {
        this.oandDDetails = value;
    }

}
