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
 * <p>GroupPaxDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GroupPaxDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GroupLeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfileAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LeaderTitle" type="{http://www.ibsplc.com/iRes/simpleTypes/}NamePrefixType" minOccurs="0"/&gt;
 *         &lt;element name="LeaderFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LeaderLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SpecialHandlingReqdIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HasGroupFormReceived" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="GroupQuoteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupPaxDetails", propOrder = {
    "groupName",
    "groupType",
    "groupLeader",
    "profileId",
    "profileAlias",
    "guestProfileId",
    "leaderTitle",
    "leaderFirstName",
    "leaderLastName",
    "specialHandlingReqdIndicator",
    "hasGroupFormReceived",
    "groupQuoteNumber"
})
public class GroupPaxDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "GroupName", required = true)
    protected String groupName;
    @XmlElement(name = "GroupType", required = true)
    protected String groupType;
    @XmlElement(name = "GroupLeader")
    protected String groupLeader;
    @XmlElement(name = "ProfileId")
    protected String profileId;
    @XmlElement(name = "ProfileAlias")
    protected String profileAlias;
    @XmlElement(name = "GuestProfileId")
    protected String guestProfileId;
    @XmlElement(name = "LeaderTitle")
    @XmlSchemaType(name = "string")
    protected NamePrefixType leaderTitle;
    @XmlElement(name = "LeaderFirstName", required = true)
    protected String leaderFirstName;
    @XmlElement(name = "LeaderLastName", required = true)
    protected String leaderLastName;
    @XmlElement(name = "SpecialHandlingReqdIndicator")
    protected boolean specialHandlingReqdIndicator;
    @XmlElement(name = "HasGroupFormReceived")
    protected boolean hasGroupFormReceived;
    @XmlElement(name = "GroupQuoteNumber")
    protected String groupQuoteNumber;

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
     * groupLeader 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupLeader() {
        return groupLeader;
    }

    /**
     * groupLeader 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupLeader(String value) {
        this.groupLeader = value;
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
     * guestProfileId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestProfileId() {
        return guestProfileId;
    }

    /**
     * guestProfileId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestProfileId(String value) {
        this.guestProfileId = value;
    }

    /**
     * leaderTitle 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefixType }
     *     
     */
    public NamePrefixType getLeaderTitle() {
        return leaderTitle;
    }

    /**
     * leaderTitle 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefixType }
     *     
     */
    public void setLeaderTitle(NamePrefixType value) {
        this.leaderTitle = value;
    }

    /**
     * leaderFirstName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderFirstName() {
        return leaderFirstName;
    }

    /**
     * leaderFirstName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderFirstName(String value) {
        this.leaderFirstName = value;
    }

    /**
     * leaderLastName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderLastName() {
        return leaderLastName;
    }

    /**
     * leaderLastName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderLastName(String value) {
        this.leaderLastName = value;
    }

    /**
     * specialHandlingReqdIndicator 속성의 값을 가져옵니다.
     * 
     */
    public boolean isSpecialHandlingReqdIndicator() {
        return specialHandlingReqdIndicator;
    }

    /**
     * specialHandlingReqdIndicator 속성의 값을 설정합니다.
     * 
     */
    public void setSpecialHandlingReqdIndicator(boolean value) {
        this.specialHandlingReqdIndicator = value;
    }

    /**
     * hasGroupFormReceived 속성의 값을 가져옵니다.
     * 
     */
    public boolean isHasGroupFormReceived() {
        return hasGroupFormReceived;
    }

    /**
     * hasGroupFormReceived 속성의 값을 설정합니다.
     * 
     */
    public void setHasGroupFormReceived(boolean value) {
        this.hasGroupFormReceived = value;
    }

    /**
     * groupQuoteNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupQuoteNumber() {
        return groupQuoteNumber;
    }

    /**
     * groupQuoteNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupQuoteNumber(String value) {
        this.groupQuoteNumber = value;
    }

}
