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
 * Count of Male, Female, Child, Infant passengers.
 * 
 * <p>PassengerInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PassengerInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaleCnt" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="FamaleCnt" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ChildCnt" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="InfantCnt" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerInfo", propOrder = {
    "maleCnt",
    "famaleCnt",
    "childCnt",
    "infantCnt"
})
public class PassengerInfo
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "MaleCnt", required = true)
    protected BigInteger maleCnt;
    @XmlElement(name = "FamaleCnt", required = true)
    protected BigInteger famaleCnt;
    @XmlElement(name = "ChildCnt", required = true)
    protected BigInteger childCnt;
    @XmlElement(name = "InfantCnt", required = true)
    protected BigInteger infantCnt;

    /**
     * maleCnt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleCnt() {
        return maleCnt;
    }

    /**
     * maleCnt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleCnt(BigInteger value) {
        this.maleCnt = value;
    }

    /**
     * famaleCnt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFamaleCnt() {
        return famaleCnt;
    }

    /**
     * famaleCnt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFamaleCnt(BigInteger value) {
        this.famaleCnt = value;
    }

    /**
     * childCnt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChildCnt() {
        return childCnt;
    }

    /**
     * childCnt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChildCnt(BigInteger value) {
        this.childCnt = value;
    }

    /**
     * infantCnt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInfantCnt() {
        return infantCnt;
    }

    /**
     * infantCnt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInfantCnt(BigInteger value) {
        this.infantCnt = value;
    }

}
