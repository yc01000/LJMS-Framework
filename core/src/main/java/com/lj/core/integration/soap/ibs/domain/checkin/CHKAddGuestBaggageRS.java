//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaxBaggageStatusInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxBaggageStatusType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
 *         &lt;element name="ExcessFeeInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}AmountCurrencyPair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CheckinFeeInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}CheckinFeeInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "pnrNumber",
    "paxBaggageStatusInfo",
    "errorType",
    "excessFeeInfo",
    "checkinFeeInformation"
})
@XmlRootElement(name = "CHK_AddGuestBaggageRS")
public class CHKAddGuestBaggageRS
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PnrNumber")
    protected List<String> pnrNumber;
    @XmlElement(name = "PaxBaggageStatusInfo", required = true)
    protected List<PaxBaggageStatusType> paxBaggageStatusInfo;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;
    @XmlElement(name = "ExcessFeeInfo")
    protected List<AmountCurrencyPair> excessFeeInfo;
    @XmlElement(name = "CheckinFeeInformation")
    protected List<CheckinFeeInformation> checkinFeeInformation;

    /**
     * Gets the value of the pnrNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPnrNumber() {
        if (pnrNumber == null) {
            pnrNumber = new ArrayList<String>();
        }
        return this.pnrNumber;
    }

    /**
     * Gets the value of the paxBaggageStatusInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxBaggageStatusInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxBaggageStatusInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxBaggageStatusType }
     * 
     * 
     */
    public List<PaxBaggageStatusType> getPaxBaggageStatusInfo() {
        if (paxBaggageStatusInfo == null) {
            paxBaggageStatusInfo = new ArrayList<PaxBaggageStatusType>();
        }
        return this.paxBaggageStatusInfo;
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

    /**
     * Gets the value of the excessFeeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excessFeeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcessFeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountCurrencyPair }
     * 
     * 
     */
    public List<AmountCurrencyPair> getExcessFeeInfo() {
        if (excessFeeInfo == null) {
            excessFeeInfo = new ArrayList<AmountCurrencyPair>();
        }
        return this.excessFeeInfo;
    }

    /**
     * Gets the value of the checkinFeeInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkinFeeInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckinFeeInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckinFeeInformation }
     * 
     * 
     */
    public List<CheckinFeeInformation> getCheckinFeeInformation() {
        if (checkinFeeInformation == null) {
            checkinFeeInformation = new ArrayList<CheckinFeeInformation>();
        }
        return this.checkinFeeInformation;
    }

}
