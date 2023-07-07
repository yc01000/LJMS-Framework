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
 * Seat map information in detail. 
 * 
 * <p>SeatMap complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SeatMap"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dest" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SeatNbr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BagPcs" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BagWt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="StatCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatMap", propOrder = {
    "dest",
    "seatNbr",
    "sex",
    "bagPcs",
    "bagWt",
    "statCd"
})
public class SeatMap
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Dest", required = true)
    protected String dest;
    @XmlElement(name = "SeatNbr", required = true)
    protected String seatNbr;
    @XmlElement(name = "Sex", required = true)
    protected String sex;
    @XmlElement(name = "BagPcs", required = true)
    protected BigInteger bagPcs;
    @XmlElement(name = "BagWt")
    protected double bagWt;
    @XmlElement(name = "StatCd", required = true)
    protected String statCd;

    /**
     * dest 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDest() {
        return dest;
    }

    /**
     * dest 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDest(String value) {
        this.dest = value;
    }

    /**
     * seatNbr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNbr() {
        return seatNbr;
    }

    /**
     * seatNbr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNbr(String value) {
        this.seatNbr = value;
    }

    /**
     * sex 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * sex 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * bagPcs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBagPcs() {
        return bagPcs;
    }

    /**
     * bagPcs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBagPcs(BigInteger value) {
        this.bagPcs = value;
    }

    /**
     * bagWt 속성의 값을 가져옵니다.
     * 
     */
    public double getBagWt() {
        return bagWt;
    }

    /**
     * bagWt 속성의 값을 설정합니다.
     * 
     */
    public void setBagWt(double value) {
        this.bagWt = value;
    }

    /**
     * statCd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatCd() {
        return statCd;
    }

    /**
     * statCd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatCd(String value) {
        this.statCd = value;
    }

}
