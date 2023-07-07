//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2021.04.29 시간 12:54:19 PM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaleableAncillaries" type="{http://www.ibsplc.com/iRes/simpleTypes/}SaleableAncillaries" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
 *         &lt;element name="RichContentInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}RichContentInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "saleableAncillaries",
    "errorType",
    "richContentInfo"
})
@XmlRootElement(name = "ListBaggageServicesRS")
public class ListBaggageServicesRS
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "SaleableAncillaries")
    protected List<SaleableAncillaries> saleableAncillaries;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;
    @XmlElement(name = "RichContentInfo")
    protected List<RichContentInfoType> richContentInfo;

    /**
     * Gets the value of the saleableAncillaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleableAncillaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleableAncillaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaleableAncillaries }
     * 
     * 
     */
    public List<SaleableAncillaries> getSaleableAncillaries() {
        if (saleableAncillaries == null) {
            saleableAncillaries = new ArrayList<SaleableAncillaries>();
        }
        return this.saleableAncillaries;
    }

    /**
     * errorType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getErrorType() {
        return errorType;
    }

    /**
     * errorType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setErrorType(ErrorType value) {
        this.errorType = value;
    }

    /**
     * Gets the value of the richContentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the richContentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRichContentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RichContentInfoType }
     * 
     * 
     */
    public List<RichContentInfoType> getRichContentInfo() {
        if (richContentInfo == null) {
            richContentInfo = new ArrayList<RichContentInfoType>();
        }
        return this.richContentInfo;
    }

}
