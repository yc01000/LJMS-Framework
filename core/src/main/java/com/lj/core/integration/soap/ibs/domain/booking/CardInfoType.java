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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>CardInfoType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CardInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardNumber" type="{http://www.ibsplc.com/iRes/simpleTypes/}PositionInfoType" minOccurs="0"/&gt;
 *         &lt;element name="ExpiryYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpriyMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecurityCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}PositionInfoType" minOccurs="0"/&gt;
 *         &lt;element name="CustomInfoList" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomInfoListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardInfoType", propOrder = {
    "cardNumber",
    "expiryYear",
    "expriyMonth",
    "securityCode",
    "customInfoList"
})
public class CardInfoType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "CardNumber")
    protected PositionInfoType cardNumber;
    @XmlElement(name = "ExpiryYear")
    protected String expiryYear;
    @XmlElement(name = "ExpriyMonth")
    protected String expriyMonth;
    @XmlElement(name = "SecurityCode")
    protected PositionInfoType securityCode;
    @XmlElement(name = "CustomInfoList")
    protected List<CustomInfoListType> customInfoList;

    /**
     * cardNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PositionInfoType }
     *     
     */
    public PositionInfoType getCardNumber() {
        return cardNumber;
    }

    /**
     * cardNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionInfoType }
     *     
     */
    public void setCardNumber(PositionInfoType value) {
        this.cardNumber = value;
    }

    /**
     * expiryYear 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryYear() {
        return expiryYear;
    }

    /**
     * expiryYear 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryYear(String value) {
        this.expiryYear = value;
    }

    /**
     * expriyMonth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpriyMonth() {
        return expriyMonth;
    }

    /**
     * expriyMonth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpriyMonth(String value) {
        this.expriyMonth = value;
    }

    /**
     * securityCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PositionInfoType }
     *     
     */
    public PositionInfoType getSecurityCode() {
        return securityCode;
    }

    /**
     * securityCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionInfoType }
     *     
     */
    public void setSecurityCode(PositionInfoType value) {
        this.securityCode = value;
    }

    /**
     * Gets the value of the customInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomInfoListType }
     * 
     * 
     */
    public List<CustomInfoListType> getCustomInfoList() {
        if (customInfoList == null) {
            customInfoList = new ArrayList<CustomInfoListType>();
        }
        return this.customInfoList;
    }

}
