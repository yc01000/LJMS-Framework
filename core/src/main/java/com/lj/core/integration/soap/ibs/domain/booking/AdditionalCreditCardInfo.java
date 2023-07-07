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
 * <p>AdditionalCreditCardInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AdditionalCreditCardInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallmentPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthenticationType" type="{http://www.ibsplc.com/iRes/simpleTypes/}AuthenticationType" minOccurs="0"/&gt;
 *         &lt;element name="CardPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalCreditCardInfo", propOrder = {
    "registrationNumber",
    "installmentPeriod",
    "authenticationType",
    "cardPassword"
})
public class AdditionalCreditCardInfo
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "RegistrationNumber")
    protected String registrationNumber;
    @XmlElement(name = "InstallmentPeriod")
    protected String installmentPeriod;
    @XmlElement(name = "AuthenticationType")
    @XmlSchemaType(name = "string")
    protected AuthenticationType authenticationType;
    @XmlElement(name = "CardPassword")
    protected String cardPassword;

    /**
     * registrationNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * registrationNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * installmentPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallmentPeriod() {
        return installmentPeriod;
    }

    /**
     * installmentPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallmentPeriod(String value) {
        this.installmentPeriod = value;
    }

    /**
     * authenticationType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationType }
     *     
     */
    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * authenticationType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationType }
     *     
     */
    public void setAuthenticationType(AuthenticationType value) {
        this.authenticationType = value;
    }

    /**
     * cardPassword 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPassword() {
        return cardPassword;
    }

    /**
     * cardPassword 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPassword(String value) {
        this.cardPassword = value;
    }

}
