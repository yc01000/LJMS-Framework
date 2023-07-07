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
 * Baggage Pieces , Weight for each destination and cabin.
 * 
 * <p>PaxBags complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaxBags"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dest" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FrstClsBags" type="{http://www.ibsplc.com/iRes/simpleTypes/}BaggageInfo"/&gt;
 *         &lt;element name="SecClsBags" type="{http://www.ibsplc.com/iRes/simpleTypes/}BaggageInfo"/&gt;
 *         &lt;element name="LastClsBags" type="{http://www.ibsplc.com/iRes/simpleTypes/}BaggageInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxBags", propOrder = {
    "dest",
    "frstClsBags",
    "secClsBags",
    "lastClsBags"
})
public class PaxBags
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Dest", required = true)
    protected String dest;
    @XmlElement(name = "FrstClsBags", required = true)
    protected BaggageInfo frstClsBags;
    @XmlElement(name = "SecClsBags", required = true)
    protected BaggageInfo secClsBags;
    @XmlElement(name = "LastClsBags", required = true)
    protected BaggageInfo lastClsBags;

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
     * frstClsBags 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BaggageInfo }
     *     
     */
    public BaggageInfo getFrstClsBags() {
        return frstClsBags;
    }

    /**
     * frstClsBags 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageInfo }
     *     
     */
    public void setFrstClsBags(BaggageInfo value) {
        this.frstClsBags = value;
    }

    /**
     * secClsBags 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BaggageInfo }
     *     
     */
    public BaggageInfo getSecClsBags() {
        return secClsBags;
    }

    /**
     * secClsBags 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageInfo }
     *     
     */
    public void setSecClsBags(BaggageInfo value) {
        this.secClsBags = value;
    }

    /**
     * lastClsBags 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BaggageInfo }
     *     
     */
    public BaggageInfo getLastClsBags() {
        return lastClsBags;
    }

    /**
     * lastClsBags 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageInfo }
     *     
     */
    public void setLastClsBags(BaggageInfo value) {
        this.lastClsBags = value;
    }

}
