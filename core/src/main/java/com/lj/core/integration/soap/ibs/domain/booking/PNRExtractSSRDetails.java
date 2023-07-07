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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>PNRExtractSSRDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PNRExtractSSRDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SSRCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubSsrCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SSRType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SSRRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSRStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberofRequests" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SegmentID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SSRName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSRDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CbbgFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRExtractCbbgFields" minOccurs="0"/&gt;
 *         &lt;element name="PBAAFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRExtractPbaaFields" minOccurs="0"/&gt;
 *         &lt;element name="PBAXFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRExtractPbaxFields" minOccurs="0"/&gt;
 *         &lt;element name="PNRExtractCabinBaggageFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRExtractCabinBaggageFields" minOccurs="0"/&gt;
 *         &lt;element name="InfFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRExtractInfFields" minOccurs="0"/&gt;
 *         &lt;element name="UmnrFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}UmnrFields" minOccurs="0"/&gt;
 *         &lt;element name="PetcFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRExtractPetcFields" minOccurs="0"/&gt;
 *         &lt;element name="SsrFieldDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRExtractSsrFieldDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SSRId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ParentSSRId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SsrFieldMetaData" type="{http://www.ibsplc.com/iRes/simpleTypes/}PNRExtractSsrFieldMetaDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PNRExtractSSRDetails", propOrder = {
    "ssrCode",
    "subSsrCode",
    "ssrType",
    "ssrRemarks",
    "ssrStatus",
    "numberofRequests",
    "segmentID",
    "ssrName",
    "ssrDescription",
    "cbbgFields",
    "pbaaFields",
    "pbaxFields",
    "pnrExtractCabinBaggageFields",
    "infFields",
    "umnrFields",
    "petcFields",
    "ssrFieldDetails",
    "ssrId",
    "parentSSRId",
    "ssrFieldMetaData"
})
public class PNRExtractSSRDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "SSRCode", required = true)
    protected String ssrCode;
    @XmlElement(name = "SubSsrCode", required = true)
    protected String subSsrCode;
    @XmlElement(name = "SSRType", required = true)
    protected String ssrType;
    @XmlElement(name = "SSRRemarks")
    protected String ssrRemarks;
    @XmlElement(name = "SSRStatus")
    protected String ssrStatus;
    @XmlElement(name = "NumberofRequests")
    protected int numberofRequests;
    @XmlElement(name = "SegmentID")
    protected long segmentID;
    @XmlElement(name = "SSRName")
    protected String ssrName;
    @XmlElement(name = "SSRDescription")
    protected String ssrDescription;
    @XmlElement(name = "CbbgFields")
    protected PNRExtractCbbgFields cbbgFields;
    @XmlElement(name = "PBAAFields")
    protected PNRExtractPbaaFields pbaaFields;
    @XmlElement(name = "PBAXFields")
    protected PNRExtractPbaxFields pbaxFields;
    @XmlElement(name = "PNRExtractCabinBaggageFields")
    protected PNRExtractCabinBaggageFields pnrExtractCabinBaggageFields;
    @XmlElement(name = "InfFields")
    protected PNRExtractInfFields infFields;
    @XmlElement(name = "UmnrFields")
    protected UmnrFields umnrFields;
    @XmlElement(name = "PetcFields")
    protected PNRExtractPetcFields petcFields;
    @XmlElement(name = "SsrFieldDetails")
    protected List<PNRExtractSsrFieldDetails> ssrFieldDetails;
    @XmlElement(name = "SSRId")
    protected long ssrId;
    @XmlElement(name = "ParentSSRId")
    protected Long parentSSRId;
    @XmlElement(name = "SsrFieldMetaData")
    protected List<PNRExtractSsrFieldMetaDataType> ssrFieldMetaData;
    @XmlAttribute(name = "RichContentRef")
    protected String richContentRef;

    /**
     * ssrCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRCode() {
        return ssrCode;
    }

    /**
     * ssrCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRCode(String value) {
        this.ssrCode = value;
    }

    /**
     * subSsrCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSsrCode() {
        return subSsrCode;
    }

    /**
     * subSsrCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSsrCode(String value) {
        this.subSsrCode = value;
    }

    /**
     * ssrType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRType() {
        return ssrType;
    }

    /**
     * ssrType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRType(String value) {
        this.ssrType = value;
    }

    /**
     * ssrRemarks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRRemarks() {
        return ssrRemarks;
    }

    /**
     * ssrRemarks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRRemarks(String value) {
        this.ssrRemarks = value;
    }

    /**
     * ssrStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRStatus() {
        return ssrStatus;
    }

    /**
     * ssrStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRStatus(String value) {
        this.ssrStatus = value;
    }

    /**
     * numberofRequests 속성의 값을 가져옵니다.
     * 
     */
    public int getNumberofRequests() {
        return numberofRequests;
    }

    /**
     * numberofRequests 속성의 값을 설정합니다.
     * 
     */
    public void setNumberofRequests(int value) {
        this.numberofRequests = value;
    }

    /**
     * segmentID 속성의 값을 가져옵니다.
     * 
     */
    public long getSegmentID() {
        return segmentID;
    }

    /**
     * segmentID 속성의 값을 설정합니다.
     * 
     */
    public void setSegmentID(long value) {
        this.segmentID = value;
    }

    /**
     * ssrName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRName() {
        return ssrName;
    }

    /**
     * ssrName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRName(String value) {
        this.ssrName = value;
    }

    /**
     * ssrDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRDescription() {
        return ssrDescription;
    }

    /**
     * ssrDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRDescription(String value) {
        this.ssrDescription = value;
    }

    /**
     * cbbgFields 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PNRExtractCbbgFields }
     *     
     */
    public PNRExtractCbbgFields getCbbgFields() {
        return cbbgFields;
    }

    /**
     * cbbgFields 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRExtractCbbgFields }
     *     
     */
    public void setCbbgFields(PNRExtractCbbgFields value) {
        this.cbbgFields = value;
    }

    /**
     * pbaaFields 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PNRExtractPbaaFields }
     *     
     */
    public PNRExtractPbaaFields getPBAAFields() {
        return pbaaFields;
    }

    /**
     * pbaaFields 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRExtractPbaaFields }
     *     
     */
    public void setPBAAFields(PNRExtractPbaaFields value) {
        this.pbaaFields = value;
    }

    /**
     * pbaxFields 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PNRExtractPbaxFields }
     *     
     */
    public PNRExtractPbaxFields getPBAXFields() {
        return pbaxFields;
    }

    /**
     * pbaxFields 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRExtractPbaxFields }
     *     
     */
    public void setPBAXFields(PNRExtractPbaxFields value) {
        this.pbaxFields = value;
    }

    /**
     * pnrExtractCabinBaggageFields 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PNRExtractCabinBaggageFields }
     *     
     */
    public PNRExtractCabinBaggageFields getPNRExtractCabinBaggageFields() {
        return pnrExtractCabinBaggageFields;
    }

    /**
     * pnrExtractCabinBaggageFields 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRExtractCabinBaggageFields }
     *     
     */
    public void setPNRExtractCabinBaggageFields(PNRExtractCabinBaggageFields value) {
        this.pnrExtractCabinBaggageFields = value;
    }

    /**
     * infFields 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PNRExtractInfFields }
     *     
     */
    public PNRExtractInfFields getInfFields() {
        return infFields;
    }

    /**
     * infFields 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRExtractInfFields }
     *     
     */
    public void setInfFields(PNRExtractInfFields value) {
        this.infFields = value;
    }

    /**
     * umnrFields 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UmnrFields }
     *     
     */
    public UmnrFields getUmnrFields() {
        return umnrFields;
    }

    /**
     * umnrFields 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UmnrFields }
     *     
     */
    public void setUmnrFields(UmnrFields value) {
        this.umnrFields = value;
    }

    /**
     * petcFields 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PNRExtractPetcFields }
     *     
     */
    public PNRExtractPetcFields getPetcFields() {
        return petcFields;
    }

    /**
     * petcFields 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRExtractPetcFields }
     *     
     */
    public void setPetcFields(PNRExtractPetcFields value) {
        this.petcFields = value;
    }

    /**
     * Gets the value of the ssrFieldDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrFieldDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSsrFieldDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRExtractSsrFieldDetails }
     * 
     * 
     */
    public List<PNRExtractSsrFieldDetails> getSsrFieldDetails() {
        if (ssrFieldDetails == null) {
            ssrFieldDetails = new ArrayList<PNRExtractSsrFieldDetails>();
        }
        return this.ssrFieldDetails;
    }

    /**
     * ssrId 속성의 값을 가져옵니다.
     * 
     */
    public long getSSRId() {
        return ssrId;
    }

    /**
     * ssrId 속성의 값을 설정합니다.
     * 
     */
    public void setSSRId(long value) {
        this.ssrId = value;
    }

    /**
     * parentSSRId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentSSRId() {
        return parentSSRId;
    }

    /**
     * parentSSRId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentSSRId(Long value) {
        this.parentSSRId = value;
    }

    /**
     * Gets the value of the ssrFieldMetaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrFieldMetaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSsrFieldMetaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRExtractSsrFieldMetaDataType }
     * 
     * 
     */
    public List<PNRExtractSsrFieldMetaDataType> getSsrFieldMetaData() {
        if (ssrFieldMetaData == null) {
            ssrFieldMetaData = new ArrayList<PNRExtractSsrFieldMetaDataType>();
        }
        return this.ssrFieldMetaData;
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
