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
 * <p>SSRDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SSRDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ssrCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IataSsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssrRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSRId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SSRKeyWord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubSsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssrDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSRStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SsrAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfRequests" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SSRComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FeeInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeInformation" minOccurs="0"/&gt;
 *         &lt;element name="FamilyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="InfFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}InfFields" minOccurs="0"/&gt;
 *         &lt;element name="UmnrFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}UmnrFields" minOccurs="0"/&gt;
 *         &lt;element name="CbbgFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}CbbgFields" minOccurs="0"/&gt;
 *         &lt;element name="CabinBaggageFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}CabinBaggageFields" minOccurs="0"/&gt;
 *         &lt;element name="PBAAFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}PBAAFields" minOccurs="0"/&gt;
 *         &lt;element name="PBAXFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}PBAXFields" minOccurs="0"/&gt;
 *         &lt;element name="TkneFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}TkneFields" minOccurs="0"/&gt;
 *         &lt;element name="FqtvFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}FqtvFields" minOccurs="0"/&gt;
 *         &lt;element name="PetcFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}PetcFields" minOccurs="0"/&gt;
 *         &lt;element name="SsrFieldDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}SsrFieldDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceFields" type="{http://www.ibsplc.com/iRes/simpleTypes/}InvoiceFields" minOccurs="0"/&gt;
 *         &lt;element name="BookingSegments" type="{http://www.ibsplc.com/iRes/simpleTypes/}BookingSegments" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSRDetailsType", propOrder = {
    "ssrCode",
    "iataSsrCode",
    "ssrType",
    "ssrRemarks",
    "ssrId",
    "ssrKeyWord",
    "ssrName",
    "subSsrCode",
    "ssrDescription",
    "ssrStatus",
    "ssrAirlineCode",
    "numberOfRequests",
    "ssrComments",
    "feeInformation",
    "familyId",
    "guestId",
    "infFields",
    "umnrFields",
    "cbbgFields",
    "cabinBaggageFields",
    "pbaaFields",
    "pbaxFields",
    "tkneFields",
    "fqtvFields",
    "petcFields",
    "ssrFieldDetails",
    "invoiceFields",
    "bookingSegments"
})
public class SSRDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected String ssrCode;
    @XmlElement(name = "IataSsrCode")
    protected String iataSsrCode;
    protected String ssrType;
    protected String ssrRemarks;
    @XmlElement(name = "SSRId")
    protected Long ssrId;
    @XmlElement(name = "SSRKeyWord")
    protected String ssrKeyWord;
    protected String ssrName;
    @XmlElement(name = "SubSsrCode")
    protected String subSsrCode;
    protected String ssrDescription;
    @XmlElement(name = "SSRStatus")
    protected String ssrStatus;
    @XmlElement(name = "SsrAirlineCode")
    protected String ssrAirlineCode;
    @XmlElement(name = "NumberOfRequests")
    protected Integer numberOfRequests;
    @XmlElement(name = "SSRComments")
    protected String ssrComments;
    @XmlElement(name = "FeeInformation")
    protected FeeInformation feeInformation;
    @XmlElement(name = "FamilyId")
    protected Long familyId;
    @XmlElement(name = "GuestId")
    protected Long guestId;
    @XmlElement(name = "InfFields")
    protected InfFields infFields;
    @XmlElement(name = "UmnrFields")
    protected UmnrFields umnrFields;
    @XmlElement(name = "CbbgFields")
    protected CbbgFields cbbgFields;
    @XmlElement(name = "CabinBaggageFields")
    protected CabinBaggageFields cabinBaggageFields;
    @XmlElement(name = "PBAAFields")
    protected PBAAFields pbaaFields;
    @XmlElement(name = "PBAXFields")
    protected PBAXFields pbaxFields;
    @XmlElement(name = "TkneFields")
    protected TkneFields tkneFields;
    @XmlElement(name = "FqtvFields")
    protected FqtvFields fqtvFields;
    @XmlElement(name = "PetcFields")
    protected PetcFields petcFields;
    @XmlElement(name = "SsrFieldDetails")
    protected List<SsrFieldDetails> ssrFieldDetails;
    @XmlElement(name = "InvoiceFields")
    protected InvoiceFields invoiceFields;
    @XmlElement(name = "BookingSegments", required = true)
    protected List<BookingSegments> bookingSegments;

    /**
     * ssrCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrCode() {
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
    public void setSsrCode(String value) {
        this.ssrCode = value;
    }

    /**
     * iataSsrCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIataSsrCode() {
        return iataSsrCode;
    }

    /**
     * iataSsrCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIataSsrCode(String value) {
        this.iataSsrCode = value;
    }

    /**
     * ssrType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrType() {
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
    public void setSsrType(String value) {
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
    public String getSsrRemarks() {
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
    public void setSsrRemarks(String value) {
        this.ssrRemarks = value;
    }

    /**
     * ssrId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSSRId() {
        return ssrId;
    }

    /**
     * ssrId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSSRId(Long value) {
        this.ssrId = value;
    }

    /**
     * ssrKeyWord 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRKeyWord() {
        return ssrKeyWord;
    }

    /**
     * ssrKeyWord 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRKeyWord(String value) {
        this.ssrKeyWord = value;
    }

    /**
     * ssrName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrName() {
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
    public void setSsrName(String value) {
        this.ssrName = value;
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
     * ssrDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrDescription() {
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
    public void setSsrDescription(String value) {
        this.ssrDescription = value;
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
     * ssrAirlineCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrAirlineCode() {
        return ssrAirlineCode;
    }

    /**
     * ssrAirlineCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrAirlineCode(String value) {
        this.ssrAirlineCode = value;
    }

    /**
     * numberOfRequests 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRequests() {
        return numberOfRequests;
    }

    /**
     * numberOfRequests 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRequests(Integer value) {
        this.numberOfRequests = value;
    }

    /**
     * ssrComments 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRComments() {
        return ssrComments;
    }

    /**
     * ssrComments 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRComments(String value) {
        this.ssrComments = value;
    }

    /**
     * feeInformation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FeeInformation }
     *     
     */
    public FeeInformation getFeeInformation() {
        return feeInformation;
    }

    /**
     * feeInformation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeInformation }
     *     
     */
    public void setFeeInformation(FeeInformation value) {
        this.feeInformation = value;
    }

    /**
     * familyId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFamilyId() {
        return familyId;
    }

    /**
     * familyId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFamilyId(Long value) {
        this.familyId = value;
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
     * infFields 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link InfFields }
     *     
     */
    public InfFields getInfFields() {
        return infFields;
    }

    /**
     * infFields 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link InfFields }
     *     
     */
    public void setInfFields(InfFields value) {
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
     * cbbgFields 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CbbgFields }
     *     
     */
    public CbbgFields getCbbgFields() {
        return cbbgFields;
    }

    /**
     * cbbgFields 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CbbgFields }
     *     
     */
    public void setCbbgFields(CbbgFields value) {
        this.cbbgFields = value;
    }

    /**
     * cabinBaggageFields 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CabinBaggageFields }
     *     
     */
    public CabinBaggageFields getCabinBaggageFields() {
        return cabinBaggageFields;
    }

    /**
     * cabinBaggageFields 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinBaggageFields }
     *     
     */
    public void setCabinBaggageFields(CabinBaggageFields value) {
        this.cabinBaggageFields = value;
    }

    /**
     * pbaaFields 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PBAAFields }
     *     
     */
    public PBAAFields getPBAAFields() {
        return pbaaFields;
    }

    /**
     * pbaaFields 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PBAAFields }
     *     
     */
    public void setPBAAFields(PBAAFields value) {
        this.pbaaFields = value;
    }

    /**
     * pbaxFields 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PBAXFields }
     *     
     */
    public PBAXFields getPBAXFields() {
        return pbaxFields;
    }

    /**
     * pbaxFields 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PBAXFields }
     *     
     */
    public void setPBAXFields(PBAXFields value) {
        this.pbaxFields = value;
    }

    /**
     * tkneFields 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TkneFields }
     *     
     */
    public TkneFields getTkneFields() {
        return tkneFields;
    }

    /**
     * tkneFields 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TkneFields }
     *     
     */
    public void setTkneFields(TkneFields value) {
        this.tkneFields = value;
    }

    /**
     * fqtvFields 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FqtvFields }
     *     
     */
    public FqtvFields getFqtvFields() {
        return fqtvFields;
    }

    /**
     * fqtvFields 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FqtvFields }
     *     
     */
    public void setFqtvFields(FqtvFields value) {
        this.fqtvFields = value;
    }

    /**
     * petcFields 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PetcFields }
     *     
     */
    public PetcFields getPetcFields() {
        return petcFields;
    }

    /**
     * petcFields 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PetcFields }
     *     
     */
    public void setPetcFields(PetcFields value) {
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
     * {@link SsrFieldDetails }
     * 
     * 
     */
    public List<SsrFieldDetails> getSsrFieldDetails() {
        if (ssrFieldDetails == null) {
            ssrFieldDetails = new ArrayList<SsrFieldDetails>();
        }
        return this.ssrFieldDetails;
    }

    /**
     * invoiceFields 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceFields }
     *     
     */
    public InvoiceFields getInvoiceFields() {
        return invoiceFields;
    }

    /**
     * invoiceFields 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceFields }
     *     
     */
    public void setInvoiceFields(InvoiceFields value) {
        this.invoiceFields = value;
    }

    /**
     * Gets the value of the bookingSegments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingSegments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingSegments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingSegments }
     * 
     * 
     */
    public List<BookingSegments> getBookingSegments() {
        if (bookingSegments == null) {
            bookingSegments = new ArrayList<BookingSegments>();
        }
        return this.bookingSegments;
    }

}
