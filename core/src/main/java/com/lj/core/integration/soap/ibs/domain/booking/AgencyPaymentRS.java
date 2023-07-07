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
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="BatchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BatchDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TotalRemittanceAmtDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CurrencyAmountType" minOccurs="0"/&gt;
 *         &lt;element name="IsApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AgencyPaymentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}AgencyPaymentDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditChainCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
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
    "batchNumber",
    "batchDate",
    "totalRemittanceAmtDetails",
    "isApproved",
    "approvalDate",
    "agencyPaymentDetails",
    "userId",
    "creditChainCode",
    "errorType"
})
@XmlRootElement(name = "AgencyPaymentRS")
public class AgencyPaymentRS
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "BatchNumber")
    protected String batchNumber;
    @XmlElement(name = "BatchDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar batchDate;
    @XmlElement(name = "TotalRemittanceAmtDetails")
    protected CurrencyAmountType totalRemittanceAmtDetails;
    @XmlElement(name = "IsApproved")
    protected Boolean isApproved;
    @XmlElement(name = "ApprovalDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvalDate;
    @XmlElement(name = "AgencyPaymentDetails")
    protected List<AgencyPaymentDetailsType> agencyPaymentDetails;
    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "CreditChainCode")
    protected String creditChainCode;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;

    /**
     * batchNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * batchNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNumber(String value) {
        this.batchNumber = value;
    }

    /**
     * batchDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBatchDate() {
        return batchDate;
    }

    /**
     * batchDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBatchDate(XMLGregorianCalendar value) {
        this.batchDate = value;
    }

    /**
     * totalRemittanceAmtDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getTotalRemittanceAmtDetails() {
        return totalRemittanceAmtDetails;
    }

    /**
     * totalRemittanceAmtDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setTotalRemittanceAmtDetails(CurrencyAmountType value) {
        this.totalRemittanceAmtDetails = value;
    }

    /**
     * isApproved 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsApproved() {
        return isApproved;
    }

    /**
     * isApproved 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsApproved(Boolean value) {
        this.isApproved = value;
    }

    /**
     * approvalDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovalDate() {
        return approvalDate;
    }

    /**
     * approvalDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovalDate(XMLGregorianCalendar value) {
        this.approvalDate = value;
    }

    /**
     * Gets the value of the agencyPaymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agencyPaymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgencyPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgencyPaymentDetailsType }
     * 
     * 
     */
    public List<AgencyPaymentDetailsType> getAgencyPaymentDetails() {
        if (agencyPaymentDetails == null) {
            agencyPaymentDetails = new ArrayList<AgencyPaymentDetailsType>();
        }
        return this.agencyPaymentDetails;
    }

    /**
     * userId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * userId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * creditChainCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditChainCode() {
        return creditChainCode;
    }

    /**
     * creditChainCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditChainCode(String value) {
        this.creditChainCode = value;
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

}
