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
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="PnrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaxCountDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxCountDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MarkInventoryDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}MarkInventoryDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="Action" type="{http://www.ibsplc.com/iRes/simpleTypes/}ActionsForSession" minOccurs="0"/&gt;
 *         &lt;element name="PnrSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomFieldList" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomFieldListType" minOccurs="0"/&gt;
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
    "pnrType",
    "paxCountDetails",
    "markInventoryDetails",
    "action",
    "pnrSessionId",
    "customFieldList"
})
@XmlRootElement(name = "AdjustFlightInventoryRQ")
public class AdjustFlightInventoryRQ
    extends BasePnrRQType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PnrType")
    protected String pnrType;
    @XmlElement(name = "PaxCountDetails")
    protected List<PaxCountDetailsType> paxCountDetails;
    @XmlElement(name = "MarkInventoryDetails")
    protected MarkInventoryDetailsType markInventoryDetails;
    @XmlElement(name = "Action")
    @XmlSchemaType(name = "string")
    protected ActionsForSession action;
    @XmlElement(name = "PnrSessionId")
    protected String pnrSessionId;
    @XmlElement(name = "CustomFieldList")
    protected CustomFieldListType customFieldList;

    /**
     * pnrType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrType() {
        return pnrType;
    }

    /**
     * pnrType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrType(String value) {
        this.pnrType = value;
    }

    /**
     * Gets the value of the paxCountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxCountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxCountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxCountDetailsType }
     * 
     * 
     */
    public List<PaxCountDetailsType> getPaxCountDetails() {
        if (paxCountDetails == null) {
            paxCountDetails = new ArrayList<PaxCountDetailsType>();
        }
        return this.paxCountDetails;
    }

    /**
     * markInventoryDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MarkInventoryDetailsType }
     *     
     */
    public MarkInventoryDetailsType getMarkInventoryDetails() {
        return markInventoryDetails;
    }

    /**
     * markInventoryDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkInventoryDetailsType }
     *     
     */
    public void setMarkInventoryDetails(MarkInventoryDetailsType value) {
        this.markInventoryDetails = value;
    }

    /**
     * action 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ActionsForSession }
     *     
     */
    public ActionsForSession getAction() {
        return action;
    }

    /**
     * action 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsForSession }
     *     
     */
    public void setAction(ActionsForSession value) {
        this.action = value;
    }

    /**
     * pnrSessionId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrSessionId() {
        return pnrSessionId;
    }

    /**
     * pnrSessionId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrSessionId(String value) {
        this.pnrSessionId = value;
    }

    /**
     * customFieldList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldListType }
     *     
     */
    public CustomFieldListType getCustomFieldList() {
        return customFieldList;
    }

    /**
     * customFieldList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldListType }
     *     
     */
    public void setCustomFieldList(CustomFieldListType value) {
        this.customFieldList = value;
    }

}
