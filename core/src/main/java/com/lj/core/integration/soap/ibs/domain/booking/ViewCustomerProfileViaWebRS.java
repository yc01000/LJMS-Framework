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
 *         &lt;element name="ProfileAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupLeaderFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupLeaderLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HomeContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomerProfileContactDetails" minOccurs="0"/&gt;
 *         &lt;element name="BusinessContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomerProfileContactDetails" minOccurs="0"/&gt;
 *         &lt;element name="AlternateContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomerProfileContactDetails" minOccurs="0"/&gt;
 *         &lt;element name="ViewMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
 *         &lt;element name="FeeWaiveOrOverrideDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeWaiveOrOverrideDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LocalLanguageContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomerProfileContactDetails" minOccurs="0"/&gt;
 *         &lt;element name="PaxSpecificContacts" type="{http://www.ibsplc.com/iRes/simpleTypes/}CustomerProfileContactDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "profileAlias",
    "profileId",
    "groupName",
    "groupType",
    "groupLeaderFirstName",
    "groupLeaderLastName",
    "profileType",
    "guestDetails",
    "homeContact",
    "businessContact",
    "alternateContact",
    "viewMode",
    "errorType",
    "feeWaiveOrOverrideDetails",
    "localLanguageContact",
    "paxSpecificContacts"
})
@XmlRootElement(name = "ViewCustomerProfileViaWebRS")
public class ViewCustomerProfileViaWebRS
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ProfileAlias")
    protected String profileAlias;
    @XmlElement(name = "ProfileId")
    protected String profileId;
    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(name = "GroupType")
    protected String groupType;
    @XmlElement(name = "GroupLeaderFirstName")
    protected String groupLeaderFirstName;
    @XmlElement(name = "GroupLeaderLastName")
    protected String groupLeaderLastName;
    @XmlElement(name = "ProfileType")
    protected String profileType;
    @XmlElement(name = "GuestDetails")
    protected List<GuestDetails> guestDetails;
    @XmlElement(name = "HomeContact")
    protected CustomerProfileContactDetails homeContact;
    @XmlElement(name = "BusinessContact")
    protected CustomerProfileContactDetails businessContact;
    @XmlElement(name = "AlternateContact")
    protected CustomerProfileContactDetails alternateContact;
    @XmlElement(name = "ViewMode")
    protected String viewMode;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;
    @XmlElement(name = "FeeWaiveOrOverrideDetails")
    protected List<FeeWaiveOrOverrideDetails> feeWaiveOrOverrideDetails;
    @XmlElement(name = "LocalLanguageContact")
    protected CustomerProfileContactDetails localLanguageContact;
    @XmlElement(name = "PaxSpecificContacts")
    protected List<CustomerProfileContactDetails> paxSpecificContacts;

    /**
     * profileAlias 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileAlias() {
        return profileAlias;
    }

    /**
     * profileAlias 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileAlias(String value) {
        this.profileAlias = value;
    }

    /**
     * profileId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * profileId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileId(String value) {
        this.profileId = value;
    }

    /**
     * groupName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * groupName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * groupType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * groupType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

    /**
     * groupLeaderFirstName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupLeaderFirstName() {
        return groupLeaderFirstName;
    }

    /**
     * groupLeaderFirstName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupLeaderFirstName(String value) {
        this.groupLeaderFirstName = value;
    }

    /**
     * groupLeaderLastName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupLeaderLastName() {
        return groupLeaderLastName;
    }

    /**
     * groupLeaderLastName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupLeaderLastName(String value) {
        this.groupLeaderLastName = value;
    }

    /**
     * profileType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileType() {
        return profileType;
    }

    /**
     * profileType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileType(String value) {
        this.profileType = value;
    }

    /**
     * Gets the value of the guestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestDetails }
     * 
     * 
     */
    public List<GuestDetails> getGuestDetails() {
        if (guestDetails == null) {
            guestDetails = new ArrayList<GuestDetails>();
        }
        return this.guestDetails;
    }

    /**
     * homeContact 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileContactDetails }
     *     
     */
    public CustomerProfileContactDetails getHomeContact() {
        return homeContact;
    }

    /**
     * homeContact 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileContactDetails }
     *     
     */
    public void setHomeContact(CustomerProfileContactDetails value) {
        this.homeContact = value;
    }

    /**
     * businessContact 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileContactDetails }
     *     
     */
    public CustomerProfileContactDetails getBusinessContact() {
        return businessContact;
    }

    /**
     * businessContact 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileContactDetails }
     *     
     */
    public void setBusinessContact(CustomerProfileContactDetails value) {
        this.businessContact = value;
    }

    /**
     * alternateContact 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileContactDetails }
     *     
     */
    public CustomerProfileContactDetails getAlternateContact() {
        return alternateContact;
    }

    /**
     * alternateContact 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileContactDetails }
     *     
     */
    public void setAlternateContact(CustomerProfileContactDetails value) {
        this.alternateContact = value;
    }

    /**
     * viewMode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewMode() {
        return viewMode;
    }

    /**
     * viewMode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewMode(String value) {
        this.viewMode = value;
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
     * Gets the value of the feeWaiveOrOverrideDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeWaiveOrOverrideDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeWaiveOrOverrideDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeWaiveOrOverrideDetails }
     * 
     * 
     */
    public List<FeeWaiveOrOverrideDetails> getFeeWaiveOrOverrideDetails() {
        if (feeWaiveOrOverrideDetails == null) {
            feeWaiveOrOverrideDetails = new ArrayList<FeeWaiveOrOverrideDetails>();
        }
        return this.feeWaiveOrOverrideDetails;
    }

    /**
     * localLanguageContact 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileContactDetails }
     *     
     */
    public CustomerProfileContactDetails getLocalLanguageContact() {
        return localLanguageContact;
    }

    /**
     * localLanguageContact 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileContactDetails }
     *     
     */
    public void setLocalLanguageContact(CustomerProfileContactDetails value) {
        this.localLanguageContact = value;
    }

    /**
     * Gets the value of the paxSpecificContacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxSpecificContacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxSpecificContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerProfileContactDetails }
     * 
     * 
     */
    public List<CustomerProfileContactDetails> getPaxSpecificContacts() {
        if (paxSpecificContacts == null) {
            paxSpecificContacts = new ArrayList<CustomerProfileContactDetails>();
        }
        return this.paxSpecificContacts;
    }

}
