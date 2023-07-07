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
 *     &lt;extension base="{http://www.ibsplc.com/iRes/simpleTypes/}BasePnrRQType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isAirlineInitiatedChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isLoyaltyCancellation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CHGCXLWaiverType" type="{http://www.ibsplc.com/iRes/simpleTypes/}CHGCXLWaiverType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CHGCXLOverrideType" type="{http://www.ibsplc.com/iRes/simpleTypes/}CHGCXLOverrideType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomFieldList" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomNameValueListType" minOccurs="0"/&gt;
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
    "pnrNumber",
    "isAirlineInitiatedChange",
    "isLoyaltyCancellation",
    "chgcxlWaiverType",
    "chgcxlOverrideType",
    "customFieldList"
})
@XmlRootElement(name = "CancelBookingRQ")
public class CancelBookingRQ
    extends BasePnrRQType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PnrNumber", required = true)
    protected String pnrNumber;
    protected Boolean isAirlineInitiatedChange;
    protected Boolean isLoyaltyCancellation;
    @XmlElement(name = "CHGCXLWaiverType")
    protected List<CHGCXLWaiverType> chgcxlWaiverType;
    @XmlElement(name = "CHGCXLOverrideType")
    protected List<CHGCXLOverrideType> chgcxlOverrideType;
    @XmlElement(name = "CustomFieldList")
    protected CustomNameValueListType customFieldList;

    /**
     * pnrNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrNumber() {
        return pnrNumber;
    }

    /**
     * pnrNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrNumber(String value) {
        this.pnrNumber = value;
    }

    /**
     * isAirlineInitiatedChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAirlineInitiatedChange() {
        return isAirlineInitiatedChange;
    }

    /**
     * isAirlineInitiatedChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAirlineInitiatedChange(Boolean value) {
        this.isAirlineInitiatedChange = value;
    }

    /**
     * isLoyaltyCancellation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLoyaltyCancellation() {
        return isLoyaltyCancellation;
    }

    /**
     * isLoyaltyCancellation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLoyaltyCancellation(Boolean value) {
        this.isLoyaltyCancellation = value;
    }

    /**
     * Gets the value of the chgcxlWaiverType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chgcxlWaiverType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCHGCXLWaiverType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CHGCXLWaiverType }
     * 
     * 
     */
    public List<CHGCXLWaiverType> getCHGCXLWaiverType() {
        if (chgcxlWaiverType == null) {
            chgcxlWaiverType = new ArrayList<CHGCXLWaiverType>();
        }
        return this.chgcxlWaiverType;
    }

    /**
     * Gets the value of the chgcxlOverrideType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chgcxlOverrideType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCHGCXLOverrideType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CHGCXLOverrideType }
     * 
     * 
     */
    public List<CHGCXLOverrideType> getCHGCXLOverrideType() {
        if (chgcxlOverrideType == null) {
            chgcxlOverrideType = new ArrayList<CHGCXLOverrideType>();
        }
        return this.chgcxlOverrideType;
    }

    /**
     * customFieldList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CustomNameValueListType }
     *     
     */
    public CustomNameValueListType getCustomFieldList() {
        return customFieldList;
    }

    /**
     * customFieldList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomNameValueListType }
     *     
     */
    public void setCustomFieldList(CustomNameValueListType value) {
        this.customFieldList = value;
    }

}
