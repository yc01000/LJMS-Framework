//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Customer Manifest Information of the flight.
 * 
 * <p>ManifestInformation complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ManifestInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ManifestedCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CheckedinCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="NoShowCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ThroughManifestedCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ThroughCheckedinCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ThroughNoShowCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ClearedStandbyCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ThroughStandbyCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ClearedThroughStandbyCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TotalCheckedinCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="OnBoardCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="StandbyCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TotalManifestedCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManifestInformation", propOrder = {
    "manifestedCount",
    "checkedinCount",
    "noShowCount",
    "throughManifestedCount",
    "throughCheckedinCount",
    "throughNoShowCount",
    "clearedStandbyCount",
    "throughStandbyCount",
    "clearedThroughStandbyCount",
    "totalCheckedinCount",
    "onBoardCount",
    "standbyCount",
    "totalManifestedCount"
})
public class ManifestInformation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ManifestedCount", required = true)
    protected BigInteger manifestedCount;
    @XmlElement(name = "CheckedinCount", required = true)
    protected BigInteger checkedinCount;
    @XmlElement(name = "NoShowCount", required = true)
    protected BigInteger noShowCount;
    @XmlElement(name = "ThroughManifestedCount", required = true)
    protected BigInteger throughManifestedCount;
    @XmlElement(name = "ThroughCheckedinCount", required = true)
    protected BigInteger throughCheckedinCount;
    @XmlElement(name = "ThroughNoShowCount", required = true)
    protected BigInteger throughNoShowCount;
    @XmlElement(name = "ClearedStandbyCount", required = true)
    protected BigInteger clearedStandbyCount;
    @XmlElement(name = "ThroughStandbyCount", required = true)
    protected BigInteger throughStandbyCount;
    @XmlElement(name = "ClearedThroughStandbyCount", required = true)
    protected BigInteger clearedThroughStandbyCount;
    @XmlElement(name = "TotalCheckedinCount", required = true)
    protected BigInteger totalCheckedinCount;
    @XmlElement(name = "OnBoardCount", required = true)
    protected BigInteger onBoardCount;
    @XmlElement(name = "StandbyCount", required = true)
    protected BigInteger standbyCount;
    @XmlElement(name = "TotalManifestedCount", required = true)
    protected BigInteger totalManifestedCount;

    /**
     * manifestedCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getManifestedCount() {
        return manifestedCount;
    }

    /**
     * manifestedCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setManifestedCount(BigInteger value) {
        this.manifestedCount = value;
    }

    /**
     * checkedinCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCheckedinCount() {
        return checkedinCount;
    }

    /**
     * checkedinCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCheckedinCount(BigInteger value) {
        this.checkedinCount = value;
    }

    /**
     * noShowCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoShowCount() {
        return noShowCount;
    }

    /**
     * noShowCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoShowCount(BigInteger value) {
        this.noShowCount = value;
    }

    /**
     * throughManifestedCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThroughManifestedCount() {
        return throughManifestedCount;
    }

    /**
     * throughManifestedCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThroughManifestedCount(BigInteger value) {
        this.throughManifestedCount = value;
    }

    /**
     * throughCheckedinCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThroughCheckedinCount() {
        return throughCheckedinCount;
    }

    /**
     * throughCheckedinCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThroughCheckedinCount(BigInteger value) {
        this.throughCheckedinCount = value;
    }

    /**
     * throughNoShowCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThroughNoShowCount() {
        return throughNoShowCount;
    }

    /**
     * throughNoShowCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThroughNoShowCount(BigInteger value) {
        this.throughNoShowCount = value;
    }

    /**
     * clearedStandbyCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClearedStandbyCount() {
        return clearedStandbyCount;
    }

    /**
     * clearedStandbyCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClearedStandbyCount(BigInteger value) {
        this.clearedStandbyCount = value;
    }

    /**
     * throughStandbyCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThroughStandbyCount() {
        return throughStandbyCount;
    }

    /**
     * throughStandbyCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThroughStandbyCount(BigInteger value) {
        this.throughStandbyCount = value;
    }

    /**
     * clearedThroughStandbyCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClearedThroughStandbyCount() {
        return clearedThroughStandbyCount;
    }

    /**
     * clearedThroughStandbyCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClearedThroughStandbyCount(BigInteger value) {
        this.clearedThroughStandbyCount = value;
    }

    /**
     * totalCheckedinCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCheckedinCount() {
        return totalCheckedinCount;
    }

    /**
     * totalCheckedinCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCheckedinCount(BigInteger value) {
        this.totalCheckedinCount = value;
    }

    /**
     * onBoardCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOnBoardCount() {
        return onBoardCount;
    }

    /**
     * onBoardCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOnBoardCount(BigInteger value) {
        this.onBoardCount = value;
    }

    /**
     * standbyCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStandbyCount() {
        return standbyCount;
    }

    /**
     * standbyCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStandbyCount(BigInteger value) {
        this.standbyCount = value;
    }

    /**
     * totalManifestedCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalManifestedCount() {
        return totalManifestedCount;
    }

    /**
     * totalManifestedCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalManifestedCount(BigInteger value) {
        this.totalManifestedCount = value;
    }

}
