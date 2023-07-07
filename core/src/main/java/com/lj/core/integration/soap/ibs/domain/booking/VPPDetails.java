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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>VPPDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="VPPDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VPPID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesManagerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommissionableAt" type="{http://www.ibsplc.com/iRes/simpleTypes/}CommissionableAt"/&gt;
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StartDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType"/&gt;
 *         &lt;element name="EndDate" type="{http://www.ibsplc.com/iRes/simpleTypes/}DateOnlyType" minOccurs="0"/&gt;
 *         &lt;element name="ContactType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ContactInformation"/&gt;
 *         &lt;element name="VPPStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}VPPStatus"/&gt;
 *         &lt;element name="SingleGVInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BulkGVInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyRegionalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DenominationType" type="{http://www.ibsplc.com/iRes/simpleTypes/}DenominationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VPPDetails", propOrder = {
    "airlineCode",
    "vppid",
    "companyName",
    "salesManagerID",
    "commissionableAt",
    "agencyCode",
    "startDate",
    "endDate",
    "contactType",
    "vppStatus",
    "singleGVInd",
    "bulkGVInd",
    "agencyName",
    "agencyRegionalName",
    "denominationType"
})
public class VPPDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "VPPID", required = true)
    protected String vppid;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "SalesManagerID")
    protected String salesManagerID;
    @XmlElement(name = "CommissionableAt", required = true)
    @XmlSchemaType(name = "string")
    protected CommissionableAt commissionableAt;
    @XmlElement(name = "AgencyCode", required = true)
    protected String agencyCode;
    @XmlElement(name = "StartDate", required = true)
    protected DateOnlyType startDate;
    @XmlElement(name = "EndDate")
    protected DateOnlyType endDate;
    @XmlElement(name = "ContactType", required = true)
    protected ContactInformation contactType;
    @XmlElement(name = "VPPStatus", required = true)
    @XmlSchemaType(name = "string")
    protected VPPStatus vppStatus;
    @XmlElement(name = "SingleGVInd")
    protected String singleGVInd;
    @XmlElement(name = "BulkGVInd")
    protected String bulkGVInd;
    @XmlElement(name = "AgencyName")
    protected String agencyName;
    @XmlElement(name = "AgencyRegionalName")
    protected String agencyRegionalName;
    @XmlElement(name = "DenominationType", required = true)
    protected List<DenominationType> denominationType;

    /**
     * airlineCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * airlineCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * vppid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVPPID() {
        return vppid;
    }

    /**
     * vppid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVPPID(String value) {
        this.vppid = value;
    }

    /**
     * companyName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * companyName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * salesManagerID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesManagerID() {
        return salesManagerID;
    }

    /**
     * salesManagerID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesManagerID(String value) {
        this.salesManagerID = value;
    }

    /**
     * commissionableAt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CommissionableAt }
     *     
     */
    public CommissionableAt getCommissionableAt() {
        return commissionableAt;
    }

    /**
     * commissionableAt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionableAt }
     *     
     */
    public void setCommissionableAt(CommissionableAt value) {
        this.commissionableAt = value;
    }

    /**
     * agencyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * agencyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * startDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getStartDate() {
        return startDate;
    }

    /**
     * startDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setStartDate(DateOnlyType value) {
        this.startDate = value;
    }

    /**
     * endDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateOnlyType }
     *     
     */
    public DateOnlyType getEndDate() {
        return endDate;
    }

    /**
     * endDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOnlyType }
     *     
     */
    public void setEndDate(DateOnlyType value) {
        this.endDate = value;
    }

    /**
     * contactType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformation }
     *     
     */
    public ContactInformation getContactType() {
        return contactType;
    }

    /**
     * contactType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformation }
     *     
     */
    public void setContactType(ContactInformation value) {
        this.contactType = value;
    }

    /**
     * vppStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link VPPStatus }
     *     
     */
    public VPPStatus getVPPStatus() {
        return vppStatus;
    }

    /**
     * vppStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link VPPStatus }
     *     
     */
    public void setVPPStatus(VPPStatus value) {
        this.vppStatus = value;
    }

    /**
     * singleGVInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleGVInd() {
        return singleGVInd;
    }

    /**
     * singleGVInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleGVInd(String value) {
        this.singleGVInd = value;
    }

    /**
     * bulkGVInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulkGVInd() {
        return bulkGVInd;
    }

    /**
     * bulkGVInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulkGVInd(String value) {
        this.bulkGVInd = value;
    }

    /**
     * agencyName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * agencyName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyName(String value) {
        this.agencyName = value;
    }

    /**
     * agencyRegionalName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyRegionalName() {
        return agencyRegionalName;
    }

    /**
     * agencyRegionalName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyRegionalName(String value) {
        this.agencyRegionalName = value;
    }

    /**
     * Gets the value of the denominationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the denominationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDenominationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DenominationType }
     * 
     * 
     */
    public List<DenominationType> getDenominationType() {
        if (denominationType == null) {
            denominationType = new ArrayList<DenominationType>();
        }
        return this.denominationType;
    }

}
