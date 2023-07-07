//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.05.28 시간 08:48:08 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="webViewMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyManagerTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyManagerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyManagerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.ibsplc.com/iRes/simpleTypes/}Address" minOccurs="0"/>
 *         &lt;element name="AgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyRegionalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="corporateCardDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CorporateCardDetails" minOccurs="0"/>
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "webViewMode",
    "airlineCode",
    "agencyManagerTitle",
    "agencyManagerFirstName",
    "agencyManagerLastName",
    "address",
    "agencyName",
    "agencyRegionalName",
    "corporateCardDetails",
    "errorType"
})
@XmlRootElement(name = "ValidateAgencyLoginPasswordRS")
public class ValidateAgencyLoginPasswordRS {

    protected String webViewMode;
    @XmlElement(name = "AirlineCode")
    protected String airlineCode;
    @XmlElement(name = "AgencyManagerTitle")
    protected String agencyManagerTitle;
    @XmlElement(name = "AgencyManagerFirstName")
    protected String agencyManagerFirstName;
    @XmlElement(name = "AgencyManagerLastName")
    protected String agencyManagerLastName;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "AgencyName")
    protected String agencyName;
    @XmlElement(name = "AgencyRegionalName")
    protected String agencyRegionalName;
    protected CorporateCardDetails corporateCardDetails;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;

    /**
     * webViewMode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebViewMode() {
        return webViewMode;
    }

    /**
     * webViewMode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebViewMode(String value) {
        this.webViewMode = value;
    }

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
     * agencyManagerTitle 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyManagerTitle() {
        return agencyManagerTitle;
    }

    /**
     * agencyManagerTitle 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyManagerTitle(String value) {
        this.agencyManagerTitle = value;
    }

    /**
     * agencyManagerFirstName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyManagerFirstName() {
        return agencyManagerFirstName;
    }

    /**
     * agencyManagerFirstName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyManagerFirstName(String value) {
        this.agencyManagerFirstName = value;
    }

    /**
     * agencyManagerLastName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyManagerLastName() {
        return agencyManagerLastName;
    }

    /**
     * agencyManagerLastName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyManagerLastName(String value) {
        this.agencyManagerLastName = value;
    }

    /**
     * address 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * address 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
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
     * corporateCardDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CorporateCardDetails }
     *     
     */
    public CorporateCardDetails getCorporateCardDetails() {
        return corporateCardDetails;
    }

    /**
     * corporateCardDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateCardDetails }
     *     
     */
    public void setCorporateCardDetails(CorporateCardDetails value) {
        this.corporateCardDetails = value;
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
