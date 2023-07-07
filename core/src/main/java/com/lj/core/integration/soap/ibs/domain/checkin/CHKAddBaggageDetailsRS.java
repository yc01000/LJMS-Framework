//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.05.28 시간 08:48:55 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BagTagNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/>
 *         &lt;element name="isExcessBagFound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BagAdditionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExcessBagFeeInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}ExcesBagFeeInformation" minOccurs="0"/>
 *         &lt;element name="BagTagInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}BagTagInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CheckinFeeInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}CheckinFeeInformation" maxOccurs="unbounded" minOccurs="0"/>
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
    "bagTagNumber",
    "errorType",
    "isExcessBagFound",
    "paxId",
    "bagAdditionStatus",
    "excessBagFeeInformation",
    "bagTagInformation",
    "checkinFeeInformation"
})
@XmlRootElement(name = "CHK_AddBaggageDetailsRS")
public class CHKAddBaggageDetailsRS {

    @XmlElement(name = "BagTagNumber")
    protected List<String> bagTagNumber;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;
    protected Boolean isExcessBagFound;
    @XmlElement(name = "PaxId")
    protected String paxId;
    @XmlElement(name = "BagAdditionStatus")
    protected String bagAdditionStatus;
    @XmlElement(name = "ExcessBagFeeInformation")
    protected ExcesBagFeeInformation excessBagFeeInformation;
    @XmlElement(name = "BagTagInformation")
    protected List<BagTagInformation> bagTagInformation;
    @XmlElement(name = "CheckinFeeInformation")
    protected List<CheckinFeeInformation> checkinFeeInformation;

    /**
     * Gets the value of the bagTagNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagTagNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagTagNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBagTagNumber() {
        if (bagTagNumber == null) {
            bagTagNumber = new ArrayList<String>();
        }
        return this.bagTagNumber;
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
     * isExcessBagFound 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExcessBagFound() {
        return isExcessBagFound;
    }

    /**
     * isExcessBagFound 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExcessBagFound(Boolean value) {
        this.isExcessBagFound = value;
    }

    /**
     * paxId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxId() {
        return paxId;
    }

    /**
     * paxId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxId(String value) {
        this.paxId = value;
    }

    /**
     * bagAdditionStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagAdditionStatus() {
        return bagAdditionStatus;
    }

    /**
     * bagAdditionStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagAdditionStatus(String value) {
        this.bagAdditionStatus = value;
    }

    /**
     * excessBagFeeInformation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExcesBagFeeInformation }
     *     
     */
    public ExcesBagFeeInformation getExcessBagFeeInformation() {
        return excessBagFeeInformation;
    }

    /**
     * excessBagFeeInformation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcesBagFeeInformation }
     *     
     */
    public void setExcessBagFeeInformation(ExcesBagFeeInformation value) {
        this.excessBagFeeInformation = value;
    }

    /**
     * Gets the value of the bagTagInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagTagInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagTagInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BagTagInformation }
     * 
     * 
     */
    public List<BagTagInformation> getBagTagInformation() {
        if (bagTagInformation == null) {
            bagTagInformation = new ArrayList<BagTagInformation>();
        }
        return this.bagTagInformation;
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
