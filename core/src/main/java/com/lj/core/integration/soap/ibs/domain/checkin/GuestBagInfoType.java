//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>GuestBagInfoType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GuestBagInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ibsplc.com/iRes/simpleTypes/}BagTagInfo"&gt;
 *       &lt;group ref="{http://www.ibsplc.com/iRes/simpleTypes/}BaggageAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestBagInfoType", propOrder = {
    "weight",
    "status"
})
public class GuestBagInfoType
    extends BagTagInfo
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Weight", required = true)
    protected BaggageAllowanceWeightType weight;
    @XmlElement(name = "Status", required = true)
    protected String status;

    /**
     * weight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BaggageAllowanceWeightType }
     *     
     */
    public BaggageAllowanceWeightType getWeight() {
        return weight;
    }

    /**
     * weight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowanceWeightType }
     *     
     */
    public void setWeight(BaggageAllowanceWeightType value) {
        this.weight = value;
    }

    /**
     * status 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * status 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
