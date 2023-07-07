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
 * <p>CabinChangeDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CabinChangeDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OldCabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NewCabinClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsStandbyUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CanContinueUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinChangeDetails", propOrder = {
    "segmentId",
    "oldCabinClass",
    "newCabinClass",
    "isStandbyUpgrade",
    "canContinueUpgrade"
})
public class CabinChangeDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "SegmentId")
    protected String segmentId;
    @XmlElement(name = "OldCabinClass", required = true)
    protected String oldCabinClass;
    @XmlElement(name = "NewCabinClass", required = true)
    protected String newCabinClass;
    @XmlElement(name = "IsStandbyUpgrade")
    protected Boolean isStandbyUpgrade;
    @XmlElement(name = "CanContinueUpgrade")
    protected Boolean canContinueUpgrade;

    /**
     * segmentId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * segmentId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentId(String value) {
        this.segmentId = value;
    }

    /**
     * oldCabinClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldCabinClass() {
        return oldCabinClass;
    }

    /**
     * oldCabinClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldCabinClass(String value) {
        this.oldCabinClass = value;
    }

    /**
     * newCabinClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCabinClass() {
        return newCabinClass;
    }

    /**
     * newCabinClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCabinClass(String value) {
        this.newCabinClass = value;
    }

    /**
     * isStandbyUpgrade 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStandbyUpgrade() {
        return isStandbyUpgrade;
    }

    /**
     * isStandbyUpgrade 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStandbyUpgrade(Boolean value) {
        this.isStandbyUpgrade = value;
    }

    /**
     * canContinueUpgrade 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanContinueUpgrade() {
        return canContinueUpgrade;
    }

    /**
     * canContinueUpgrade 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanContinueUpgrade(Boolean value) {
        this.canContinueUpgrade = value;
    }

}
