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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>AuxInformationType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AuxInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuxId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AuxKeyword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AuxCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuxFieldDetailsType" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxFieldDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxStatusDetails_Type" minOccurs="0"/&gt;
 *         &lt;element name="CanSendMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RichContentRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuxInformationType", propOrder = {
    "auxId",
    "auxKeyword",
    "auxCategory",
    "remarks",
    "auxFieldDetailsType",
    "guestId",
    "status",
    "canSendMail",
    "emailAddress",
    "segmentId"
})
public class AuxInformationType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AuxId")
    protected Long auxId;
    @XmlElement(name = "AuxKeyword", required = true)
    protected String auxKeyword;
    @XmlElement(name = "AuxCategory", required = true)
    protected String auxCategory;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "AuxFieldDetailsType")
    protected List<AuxFieldDetailsType> auxFieldDetailsType;
    @XmlElement(name = "GuestId")
    protected Long guestId;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected AuxStatusDetailsType status;
    @XmlElement(name = "CanSendMail")
    protected Boolean canSendMail;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "SegmentId")
    protected String segmentId;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;

    /**
     * auxId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuxId() {
        return auxId;
    }

    /**
     * auxId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuxId(Long value) {
        this.auxId = value;
    }

    /**
     * auxKeyword 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxKeyword() {
        return auxKeyword;
    }

    /**
     * auxKeyword 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxKeyword(String value) {
        this.auxKeyword = value;
    }

    /**
     * auxCategory 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxCategory() {
        return auxCategory;
    }

    /**
     * auxCategory 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxCategory(String value) {
        this.auxCategory = value;
    }

    /**
     * remarks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * remarks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the auxFieldDetailsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxFieldDetailsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuxFieldDetailsType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuxFieldDetailsType }
     * 
     * 
     */
    public List<AuxFieldDetailsType> getAuxFieldDetailsType() {
        if (auxFieldDetailsType == null) {
            auxFieldDetailsType = new ArrayList<AuxFieldDetailsType>();
        }
        return this.auxFieldDetailsType;
    }

    /**
     * guestId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuestId() {
        return guestId;
    }

    /**
     * guestId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuestId(Long value) {
        this.guestId = value;
    }

    /**
     * status 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AuxStatusDetailsType }
     *     
     */
    public AuxStatusDetailsType getStatus() {
        return status;
    }

    /**
     * status 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AuxStatusDetailsType }
     *     
     */
    public void setStatus(AuxStatusDetailsType value) {
        this.status = value;
    }

    /**
     * canSendMail 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanSendMail() {
        return canSendMail;
    }

    /**
     * canSendMail 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanSendMail(Boolean value) {
        this.canSendMail = value;
    }

    /**
     * emailAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * emailAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * segmentId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * segmentId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentId(String value) {
        this.segmentId = value;
    }

    /**
     * richContentRef 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRichContentRef() {
        return richContentRef;
    }

    /**
     * richContentRef 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRichContentRef(String value) {
        this.richContentRef = value;
    }

}
