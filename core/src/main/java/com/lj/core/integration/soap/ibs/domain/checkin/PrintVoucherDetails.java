//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>PrintVoucherDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PrintVoucherDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VoucherCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VoucherSubTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VoucherSubTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VoucherTypeNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PNRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlightIdentifier" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightIdentifierType"/&gt;
 *         &lt;element name="OffPoint" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportType" minOccurs="0"/&gt;
 *         &lt;element name="BoardPoint" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirportType" minOccurs="0"/&gt;
 *         &lt;element name="VoucherNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateOfCreation" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TimeOfCreation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaxKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResPaxID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TermsAndConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RevenueCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VoucherBarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MCONumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MCODateOfIssue" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PrintStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VoucherStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintVoucherDetails", propOrder = {
    "voucherCode",
    "voucherSubTypeCode",
    "voucherSubTypeName",
    "voucherTypeNumber",
    "pnrNumber",
    "numberInParty",
    "firstName",
    "familyName",
    "amount",
    "currency",
    "flightIdentifier",
    "offPoint",
    "boardPoint",
    "voucherNumber",
    "expiryDate",
    "comments",
    "dateOfCreation",
    "timeOfCreation",
    "paxKey",
    "resPaxID",
    "termsAndConditions",
    "revenueCompany",
    "validityPeriod",
    "voucherBarCode",
    "mcoNumber",
    "mcoDateOfIssue",
    "printStatus",
    "voucherStatus"
})
public class PrintVoucherDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "VoucherCode", required = true)
    protected String voucherCode;
    @XmlElement(name = "VoucherSubTypeCode", required = true)
    protected String voucherSubTypeCode;
    @XmlElement(name = "VoucherSubTypeName", required = true)
    protected String voucherSubTypeName;
    @XmlElement(name = "VoucherTypeNumber", required = true)
    protected String voucherTypeNumber;
    @XmlElement(name = "PNRNumber", required = true)
    protected String pnrNumber;
    @XmlElement(name = "NumberInParty", required = true)
    protected String numberInParty;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "FamilyName")
    protected String familyName;
    @XmlElement(name = "Amount")
    protected double amount;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "FlightIdentifier", required = true)
    protected FlightIdentifierType flightIdentifier;
    @XmlElement(name = "OffPoint")
    protected AirportType offPoint;
    @XmlElement(name = "BoardPoint")
    protected AirportType boardPoint;
    @XmlElement(name = "VoucherNumber", required = true)
    protected String voucherNumber;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "DateOfCreation", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfCreation;
    @XmlElement(name = "TimeOfCreation")
    protected String timeOfCreation;
    @XmlElement(name = "PaxKey", required = true)
    protected String paxKey;
    @XmlElement(name = "ResPaxID", required = true)
    protected String resPaxID;
    @XmlElement(name = "TermsAndConditions")
    protected String termsAndConditions;
    @XmlElement(name = "RevenueCompany")
    protected String revenueCompany;
    @XmlElement(name = "ValidityPeriod", required = true)
    protected String validityPeriod;
    @XmlElement(name = "VoucherBarCode")
    protected String voucherBarCode;
    @XmlElement(name = "MCONumber", required = true)
    protected String mcoNumber;
    @XmlElement(name = "MCODateOfIssue", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mcoDateOfIssue;
    @XmlElement(name = "PrintStatus")
    protected String printStatus;
    @XmlElement(name = "VoucherStatus")
    protected String voucherStatus;

    /**
     * voucherCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherCode() {
        return voucherCode;
    }

    /**
     * voucherCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherCode(String value) {
        this.voucherCode = value;
    }

    /**
     * voucherSubTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherSubTypeCode() {
        return voucherSubTypeCode;
    }

    /**
     * voucherSubTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherSubTypeCode(String value) {
        this.voucherSubTypeCode = value;
    }

    /**
     * voucherSubTypeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherSubTypeName() {
        return voucherSubTypeName;
    }

    /**
     * voucherSubTypeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherSubTypeName(String value) {
        this.voucherSubTypeName = value;
    }

    /**
     * voucherTypeNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherTypeNumber() {
        return voucherTypeNumber;
    }

    /**
     * voucherTypeNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherTypeNumber(String value) {
        this.voucherTypeNumber = value;
    }

    /**
     * pnrNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRNumber() {
        return pnrNumber;
    }

    /**
     * pnrNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNRNumber(String value) {
        this.pnrNumber = value;
    }

    /**
     * numberInParty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberInParty() {
        return numberInParty;
    }

    /**
     * numberInParty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberInParty(String value) {
        this.numberInParty = value;
    }

    /**
     * firstName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * firstName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * familyName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * familyName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * amount 속성의 값을 가져옵니다.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * amount 속성의 값을 설정합니다.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * currency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * currency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * flightIdentifier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FlightIdentifierType }
     *     
     */
    public FlightIdentifierType getFlightIdentifier() {
        return flightIdentifier;
    }

    /**
     * flightIdentifier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightIdentifierType }
     *     
     */
    public void setFlightIdentifier(FlightIdentifierType value) {
        this.flightIdentifier = value;
    }

    /**
     * offPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AirportType }
     *     
     */
    public AirportType getOffPoint() {
        return offPoint;
    }

    /**
     * offPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportType }
     *     
     */
    public void setOffPoint(AirportType value) {
        this.offPoint = value;
    }

    /**
     * boardPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AirportType }
     *     
     */
    public AirportType getBoardPoint() {
        return boardPoint;
    }

    /**
     * boardPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportType }
     *     
     */
    public void setBoardPoint(AirportType value) {
        this.boardPoint = value;
    }

    /**
     * voucherNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherNumber() {
        return voucherNumber;
    }

    /**
     * voucherNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherNumber(String value) {
        this.voucherNumber = value;
    }

    /**
     * expiryDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * expiryDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * comments 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * comments 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * dateOfCreation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfCreation() {
        return dateOfCreation;
    }

    /**
     * dateOfCreation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfCreation(XMLGregorianCalendar value) {
        this.dateOfCreation = value;
    }

    /**
     * timeOfCreation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOfCreation() {
        return timeOfCreation;
    }

    /**
     * timeOfCreation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfCreation(String value) {
        this.timeOfCreation = value;
    }

    /**
     * paxKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxKey() {
        return paxKey;
    }

    /**
     * paxKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxKey(String value) {
        this.paxKey = value;
    }

    /**
     * resPaxID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResPaxID() {
        return resPaxID;
    }

    /**
     * resPaxID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResPaxID(String value) {
        this.resPaxID = value;
    }

    /**
     * termsAndConditions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    /**
     * termsAndConditions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsAndConditions(String value) {
        this.termsAndConditions = value;
    }

    /**
     * revenueCompany 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueCompany() {
        return revenueCompany;
    }

    /**
     * revenueCompany 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueCompany(String value) {
        this.revenueCompany = value;
    }

    /**
     * validityPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * validityPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityPeriod(String value) {
        this.validityPeriod = value;
    }

    /**
     * voucherBarCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherBarCode() {
        return voucherBarCode;
    }

    /**
     * voucherBarCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherBarCode(String value) {
        this.voucherBarCode = value;
    }

    /**
     * mcoNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCONumber() {
        return mcoNumber;
    }

    /**
     * mcoNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCONumber(String value) {
        this.mcoNumber = value;
    }

    /**
     * mcoDateOfIssue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMCODateOfIssue() {
        return mcoDateOfIssue;
    }

    /**
     * mcoDateOfIssue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMCODateOfIssue(XMLGregorianCalendar value) {
        this.mcoDateOfIssue = value;
    }

    /**
     * printStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintStatus() {
        return printStatus;
    }

    /**
     * printStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintStatus(String value) {
        this.printStatus = value;
    }

    /**
     * voucherStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherStatus() {
        return voucherStatus;
    }

    /**
     * voucherStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherStatus(String value) {
        this.voucherStatus = value;
    }

}
