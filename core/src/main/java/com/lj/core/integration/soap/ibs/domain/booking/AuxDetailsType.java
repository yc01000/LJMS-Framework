//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2021.04.29 시간 12:54:19 PM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>AuxDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AuxDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuxId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AuxKeyword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AuxCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CarRentalDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}InsuranceDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="FeeInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeInformation" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuxStatusType" minOccurs="0"/&gt;
 *         &lt;element name="CanSendMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuxDetailsType", propOrder = {
    "auxId",
    "auxKeyword",
    "auxCategory",
    "remarks",
    "carDetails",
    "insuranceDetails",
    "feeInformation",
    "status",
    "canSendMail",
    "emailAddress",
    "guestID"
})
public class AuxDetailsType
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
    @XmlElement(name = "CarDetails")
    protected CarRentalDetailsType carDetails;
    @XmlElement(name = "InsuranceDetails")
    protected InsuranceDetailsType insuranceDetails;
    @XmlElement(name = "FeeInformation")
    protected FeeInformation feeInformation;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected AuxStatusType status;
    @XmlElement(name = "CanSendMail")
    protected Boolean canSendMail;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "GuestID")
    protected String guestID;

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
     * carDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CarRentalDetailsType }
     *     
     */
    public CarRentalDetailsType getCarDetails() {
        return carDetails;
    }

    /**
     * carDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CarRentalDetailsType }
     *     
     */
    public void setCarDetails(CarRentalDetailsType value) {
        this.carDetails = value;
    }

    /**
     * insuranceDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceDetailsType }
     *     
     */
    public InsuranceDetailsType getInsuranceDetails() {
        return insuranceDetails;
    }

    /**
     * insuranceDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceDetailsType }
     *     
     */
    public void setInsuranceDetails(InsuranceDetailsType value) {
        this.insuranceDetails = value;
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
     * status 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AuxStatusType }
     *     
     */
    public AuxStatusType getStatus() {
        return status;
    }

    /**
     * status 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AuxStatusType }
     *     
     */
    public void setStatus(AuxStatusType value) {
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
     * guestID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestID() {
        return guestID;
    }

    /**
     * guestID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestID(String value) {
        this.guestID = value;
    }

}
