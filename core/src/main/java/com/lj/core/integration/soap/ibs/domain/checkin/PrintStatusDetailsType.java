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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * collection of BagTagNumber and PrintStatus
 * 
 * <p>PrintStatusDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PrintStatusDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BagTagIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BagTagNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PrintStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}PrintStatusType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintStatusDetailsType", propOrder = {
    "bagTagIssuer",
    "bagTagNumber",
    "printStatus"
})
public class PrintStatusDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "BagTagIssuer")
    protected String bagTagIssuer;
    @XmlElement(name = "BagTagNumber", required = true)
    protected String bagTagNumber;
    @XmlElement(name = "PrintStatus", required = true)
    @XmlSchemaType(name = "string")
    protected PrintStatusType printStatus;

    /**
     * bagTagIssuer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagTagIssuer() {
        return bagTagIssuer;
    }

    /**
     * bagTagIssuer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagTagIssuer(String value) {
        this.bagTagIssuer = value;
    }

    /**
     * bagTagNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagTagNumber() {
        return bagTagNumber;
    }

    /**
     * bagTagNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagTagNumber(String value) {
        this.bagTagNumber = value;
    }

    /**
     * printStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PrintStatusType }
     *     
     */
    public PrintStatusType getPrintStatus() {
        return printStatus;
    }

    /**
     * printStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintStatusType }
     *     
     */
    public void setPrintStatus(PrintStatusType value) {
        this.printStatus = value;
    }

}
