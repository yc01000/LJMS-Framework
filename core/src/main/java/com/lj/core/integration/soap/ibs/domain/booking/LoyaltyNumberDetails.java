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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>LoyaltyNumberDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyNumberDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TierLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TierLevelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerLoyaltyDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomerLoyaltyDetails" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyNumberDetails", propOrder = {
    "airlineCode",
    "tierLevelCode",
    "tierLevelName",
    "points",
    "accountStatus",
    "customerLoyaltyDetails",
    "loyaltyNumber"
})
public class LoyaltyNumberDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "TierLevelCode")
    protected String tierLevelCode;
    @XmlElement(name = "TierLevelName")
    protected String tierLevelName;
    @XmlElement(name = "Points")
    protected Long points;
    @XmlElement(name = "AccountStatus")
    protected String accountStatus;
    @XmlElement(name = "CustomerLoyaltyDetails")
    protected CustomerLoyaltyDetails customerLoyaltyDetails;
    @XmlElement(name = "LoyaltyNumber")
    protected String loyaltyNumber;

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
     * tierLevelCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierLevelCode() {
        return tierLevelCode;
    }

    /**
     * tierLevelCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierLevelCode(String value) {
        this.tierLevelCode = value;
    }

    /**
     * tierLevelName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierLevelName() {
        return tierLevelName;
    }

    /**
     * tierLevelName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierLevelName(String value) {
        this.tierLevelName = value;
    }

    /**
     * points 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPoints() {
        return points;
    }

    /**
     * points 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPoints(Long value) {
        this.points = value;
    }

    /**
     * accountStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * accountStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

    /**
     * customerLoyaltyDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CustomerLoyaltyDetails }
     *     
     */
    public CustomerLoyaltyDetails getCustomerLoyaltyDetails() {
        return customerLoyaltyDetails;
    }

    /**
     * customerLoyaltyDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerLoyaltyDetails }
     *     
     */
    public void setCustomerLoyaltyDetails(CustomerLoyaltyDetails value) {
        this.customerLoyaltyDetails = value;
    }

    /**
     * loyaltyNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyNumber() {
        return loyaltyNumber;
    }

    /**
     * loyaltyNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyNumber(String value) {
        this.loyaltyNumber = value;
    }

}
