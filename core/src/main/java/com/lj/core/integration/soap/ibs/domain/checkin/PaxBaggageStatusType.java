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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>PaxBaggageStatusType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaxBaggageStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.ibsplc.com/iRes/simpleTypes/}NameType"/&gt;
 *         &lt;element name="BagTagNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isExcessBagFound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BagAdditionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExcessBagFeeInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}ExcesBagFeeInformation" minOccurs="0"/&gt;
 *         &lt;element name="GuestBagInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestBagInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxBaggageStatusType", propOrder = {
    "name",
    "bagTagNumber",
    "isExcessBagFound",
    "paxId",
    "bagAdditionStatus",
    "excessBagFeeInformation",
    "guestBagInfo"
})
public class PaxBaggageStatusType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Name", required = true)
    protected NameType name;
    @XmlElement(name = "BagTagNumber")
    protected List<String> bagTagNumber;
    protected Boolean isExcessBagFound;
    @XmlElement(name = "PaxId")
    protected String paxId;
    @XmlElement(name = "BagAdditionStatus")
    protected String bagAdditionStatus;
    @XmlElement(name = "ExcessBagFeeInformation")
    protected ExcesBagFeeInformation excessBagFeeInformation;
    @XmlElement(name = "GuestBagInfo")
    protected List<GuestBagInfoType> guestBagInfo;

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

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
     * Gets the value of the guestBagInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestBagInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestBagInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestBagInfoType }
     * 
     * 
     */
    public List<GuestBagInfoType> getGuestBagInfo() {
        if (guestBagInfo == null) {
            guestBagInfo = new ArrayList<GuestBagInfoType>();
        }
        return this.guestBagInfo;
    }

}
