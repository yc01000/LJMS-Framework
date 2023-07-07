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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ibsplc.com/iRes/simpleTypes/}ModifyBookingRQ"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isCancelPnr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExternalRecordLocatorDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ExternalRecordLocatorDetailsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isCancelPnr",
    "externalRecordLocatorDetailsType"
})
@XmlRootElement(name = "SaveModifyBookingRQ")
public class SaveModifyBookingRQ
    extends ModifyBookingRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Boolean isCancelPnr;
    @XmlElement(name = "ExternalRecordLocatorDetailsType")
    protected ExternalRecordLocatorDetailsType externalRecordLocatorDetailsType;

    /**
     * isCancelPnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCancelPnr() {
        return isCancelPnr;
    }

    /**
     * isCancelPnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCancelPnr(Boolean value) {
        this.isCancelPnr = value;
    }

    /**
     * externalRecordLocatorDetailsType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRecordLocatorDetailsType }
     *     
     */
    public ExternalRecordLocatorDetailsType getExternalRecordLocatorDetailsType() {
        return externalRecordLocatorDetailsType;
    }

    /**
     * externalRecordLocatorDetailsType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRecordLocatorDetailsType }
     *     
     */
    public void setExternalRecordLocatorDetailsType(ExternalRecordLocatorDetailsType value) {
        this.externalRecordLocatorDetailsType = value;
    }

}
