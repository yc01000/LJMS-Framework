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
 * <p>AncillariesType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AncillariesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaleableSsrs" type="{http://www.ibsplc.com/iRes/simpleTypes/}SaleableSsrsType" minOccurs="0"/&gt;
 *         &lt;element name="SaleableAuxs" type="{http://www.ibsplc.com/iRes/simpleTypes/}SaleableAuxsType" minOccurs="0"/&gt;
 *         &lt;element name="NotifiableSsrs" type="{http://www.ibsplc.com/iRes/simpleTypes/}NotifiableSsrsType" minOccurs="0"/&gt;
 *         &lt;element name="NotofiableAuxs" type="{http://www.ibsplc.com/iRes/simpleTypes/}NotofiableAuxsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillariesType", propOrder = {
    "saleableSsrs",
    "saleableAuxs",
    "notifiableSsrs",
    "notofiableAuxs"
})
public class AncillariesType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "SaleableSsrs")
    protected SaleableSsrsType saleableSsrs;
    @XmlElement(name = "SaleableAuxs")
    protected SaleableAuxsType saleableAuxs;
    @XmlElement(name = "NotifiableSsrs")
    protected NotifiableSsrsType notifiableSsrs;
    @XmlElement(name = "NotofiableAuxs")
    protected NotofiableAuxsType notofiableAuxs;

    /**
     * saleableSsrs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SaleableSsrsType }
     *     
     */
    public SaleableSsrsType getSaleableSsrs() {
        return saleableSsrs;
    }

    /**
     * saleableSsrs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleableSsrsType }
     *     
     */
    public void setSaleableSsrs(SaleableSsrsType value) {
        this.saleableSsrs = value;
    }

    /**
     * saleableAuxs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SaleableAuxsType }
     *     
     */
    public SaleableAuxsType getSaleableAuxs() {
        return saleableAuxs;
    }

    /**
     * saleableAuxs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleableAuxsType }
     *     
     */
    public void setSaleableAuxs(SaleableAuxsType value) {
        this.saleableAuxs = value;
    }

    /**
     * notifiableSsrs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NotifiableSsrsType }
     *     
     */
    public NotifiableSsrsType getNotifiableSsrs() {
        return notifiableSsrs;
    }

    /**
     * notifiableSsrs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifiableSsrsType }
     *     
     */
    public void setNotifiableSsrs(NotifiableSsrsType value) {
        this.notifiableSsrs = value;
    }

    /**
     * notofiableAuxs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NotofiableAuxsType }
     *     
     */
    public NotofiableAuxsType getNotofiableAuxs() {
        return notofiableAuxs;
    }

    /**
     * notofiableAuxs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NotofiableAuxsType }
     *     
     */
    public void setNotofiableAuxs(NotofiableAuxsType value) {
        this.notofiableAuxs = value;
    }

}
