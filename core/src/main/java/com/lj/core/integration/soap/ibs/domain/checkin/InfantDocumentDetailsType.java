//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Document Details.Document for Infant for APIS
 * 
 * <p>InfantDocumentDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="InfantDocumentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nameType" type="{http://www.ibsplc.com/iRes/simpleTypes/}NameType"/&gt;
 *         &lt;element name="nameAsInDoc" type="{http://www.ibsplc.com/iRes/simpleTypes/}NameType" minOccurs="0"/&gt;
 *         &lt;element name="documentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateOfExpiry" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType" minOccurs="0"/&gt;
 *         &lt;element name="dateOfIssue" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType" minOccurs="0"/&gt;
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateOfBirth" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType" minOccurs="0"/&gt;
 *         &lt;element name="ResidenceDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ResidenceDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="DestinationResidenceDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ResidenceDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="placeForVisa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="placeOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPrimaryDocHolder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="paxId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="infantId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="resPaxId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="resInfantId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="issuingCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfantDocumentDetailsType", propOrder = {
    "documentType",
    "nameType",
    "nameAsInDoc",
    "documentNumber",
    "dateOfExpiry",
    "dateOfIssue",
    "nationality",
    "dateOfBirth",
    "residenceDetails",
    "destinationResidenceDetails",
    "placeForVisa",
    "placeOfBirth",
    "isPrimaryDocHolder",
    "paxId",
    "infantId",
    "resPaxId",
    "resInfantId",
    "issuingCountry"
})
public class InfantDocumentDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "DocumentType")
    protected String documentType;
    @XmlElement(required = true)
    protected NameType nameType;
    protected NameType nameAsInDoc;
    @XmlElement(required = true)
    protected String documentNumber;
    protected DateOnlyType dateOfExpiry;
    protected DateOnlyType dateOfIssue;
    protected String nationality;
    @XmlElement(name = "DateOfBirth")
    protected DateOnlyType dateOfBirth;
    @XmlElement(name = "ResidenceDetails")
    protected ResidenceDetailsType residenceDetails;
    @XmlElement(name = "DestinationResidenceDetails")
    protected ResidenceDetailsType destinationResidenceDetails;
    protected String placeForVisa;
    protected String placeOfBirth;
    protected Boolean isPrimaryDocHolder;
    protected BigInteger paxId;
    protected BigInteger infantId;
    protected BigInteger resPaxId;
    protected BigInteger resInfantId;
    protected String issuingCountry;

    /**
     * documentType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * documentType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * nameType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getNameType() {
        return nameType;
    }

    /**
     * nameType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setNameType(NameType value) {
        this.nameType = value;
    }

    /**
     * nameAsInDoc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getNameAsInDoc() {
        return nameAsInDoc;
    }

    /**
     * nameAsInDoc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setNameAsInDoc(NameType value) {
        this.nameAsInDoc = value;
    }

    /**
     * documentNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * documentNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * dateOfExpiry 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getDateOfExpiry() {
        return dateOfExpiry;
    }

    /**
     * dateOfExpiry 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setDateOfExpiry(DateOnlyType value) {
        this.dateOfExpiry = value;
    }

    /**
     * dateOfIssue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * dateOfIssue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setDateOfIssue(DateOnlyType value) {
        this.dateOfIssue = value;
    }

    /**
     * nationality 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * nationality 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * dateOfBirth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * dateOfBirth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setDateOfBirth(DateOnlyType value) {
        this.dateOfBirth = value;
    }

    /**
     * residenceDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceDetailsType }
     *     
     */
    public ResidenceDetailsType getResidenceDetails() {
        return residenceDetails;
    }

    /**
     * residenceDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceDetailsType }
     *     
     */
    public void setResidenceDetails(ResidenceDetailsType value) {
        this.residenceDetails = value;
    }

    /**
     * destinationResidenceDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceDetailsType }
     *     
     */
    public ResidenceDetailsType getDestinationResidenceDetails() {
        return destinationResidenceDetails;
    }

    /**
     * destinationResidenceDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceDetailsType }
     *     
     */
    public void setDestinationResidenceDetails(ResidenceDetailsType value) {
        this.destinationResidenceDetails = value;
    }

    /**
     * placeForVisa 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceForVisa() {
        return placeForVisa;
    }

    /**
     * placeForVisa 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceForVisa(String value) {
        this.placeForVisa = value;
    }

    /**
     * placeOfBirth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * placeOfBirth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
    }

    /**
     * isPrimaryDocHolder 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimaryDocHolder() {
        return isPrimaryDocHolder;
    }

    /**
     * isPrimaryDocHolder 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimaryDocHolder(Boolean value) {
        this.isPrimaryDocHolder = value;
    }

    /**
     * paxId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaxId() {
        return paxId;
    }

    /**
     * paxId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaxId(BigInteger value) {
        this.paxId = value;
    }

    /**
     * infantId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInfantId() {
        return infantId;
    }

    /**
     * infantId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInfantId(BigInteger value) {
        this.infantId = value;
    }

    /**
     * resPaxId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResPaxId() {
        return resPaxId;
    }

    /**
     * resPaxId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResPaxId(BigInteger value) {
        this.resPaxId = value;
    }

    /**
     * resInfantId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResInfantId() {
        return resInfantId;
    }

    /**
     * resInfantId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResInfantId(BigInteger value) {
        this.resInfantId = value;
    }

    /**
     * issuingCountry 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingCountry() {
        return issuingCountry;
    }

    /**
     * issuingCountry 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingCountry(String value) {
        this.issuingCountry = value;
    }

}
