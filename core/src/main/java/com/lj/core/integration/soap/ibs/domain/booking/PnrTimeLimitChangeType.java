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
 * <p>PnrTimeLimitChangeType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PnrTimeLimitChangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PnrActionType" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrActionType"/&gt;
 *         &lt;element name="TimeLimitDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRTimeLimitDetailsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrTimeLimitChangeType", propOrder = {
    "pnrActionType",
    "timeLimitDetails"
})
public class PnrTimeLimitChangeType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PnrActionType", required = true)
    @XmlSchemaType(name = "string")
    protected PnrActionType pnrActionType;
    @XmlElement(name = "TimeLimitDetails")
    protected PNRTimeLimitDetailsType timeLimitDetails;

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
     * timeLimitDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PNRTimeLimitDetailsType }
     *     
     */
    public PNRTimeLimitDetailsType getTimeLimitDetails() {
        return timeLimitDetails;
    }

    /**
     * timeLimitDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRTimeLimitDetailsType }
     *     
     */
    public void setTimeLimitDetails(PNRTimeLimitDetailsType value) {
        this.timeLimitDetails = value;
    }

}
