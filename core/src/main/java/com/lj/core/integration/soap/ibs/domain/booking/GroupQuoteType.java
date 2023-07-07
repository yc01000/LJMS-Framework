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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>GroupQuoteType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GroupQuoteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ibsplc.com/iRes/simpleTypes/}BasePnrRSType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PointOfSale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IPaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnrNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreationDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreationDateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedDateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastModfiedDateTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupQuoteStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItineraryDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItineraryDetailsType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ItinPrice" type="{http://www.ibsplc.com/iRes/simpleTypes/}ItinPriceType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TaxExemptions" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxExemptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GroupPaxDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}GroupPaxDetailsType"/&gt;
 *         &lt;element name="GroupQuoteContact" type="{http://www.ibsplc.com/iRes/simpleTypes/}PnrContactType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="QuoteOption" type="{http://www.ibsplc.com/iRes/simpleTypes/}QuoteOption" minOccurs="0"/&gt;
 *         &lt;element name="GroupQuoteComments" type="{http://www.ibsplc.com/iRes/simpleTypes/}GroupQuoteCommentsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PromoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepositAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}TotalAmountPaid" minOccurs="0"/&gt;
 *         &lt;element name="GroupQuoteAmount" type="{http://www.ibsplc.com/iRes/simpleTypes/}GroupQuoteAmount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CreatorChannelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatorChannelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creationdateinAgentOfficeTimeZone" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="modifiedDateInAgentOfficeTimeZone" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupQuoteType", propOrder = {
    "pointOfSale",
    "iPaddress",
    "pnrNumber",
    "creationDateAndTime",
    "creationDateTimeZone",
    "lastModifiedDateAndTime",
    "lastModfiedDateTimeZone",
    "groupQuoteStatus",
    "itineraryDetails",
    "itinPrice",
    "taxExemptions",
    "groupPaxDetails",
    "groupQuoteContact",
    "quoteOption",
    "groupQuoteComments",
    "promoCode",
    "depositAmount",
    "groupQuoteAmount",
    "creatorChannelCode",
    "creatorChannelType",
    "creationdateinAgentOfficeTimeZone",
    "modifiedDateInAgentOfficeTimeZone",
    "errorType"
})
@XmlSeeAlso({
    ModifyGroupQuoteRS.class,
    ViewGroupQuoteRS.class,
    CreateGroupQuoteRS.class
})
public class GroupQuoteType
    extends BasePnrRSType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PointOfSale")
    protected String pointOfSale;
    @XmlElement(name = "IPaddress")
    protected String iPaddress;
    @XmlElement(name = "PnrNumber")
    protected String pnrNumber;
    @XmlElement(name = "CreationDateAndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateAndTime;
    @XmlElement(name = "CreationDateTimeZone")
    protected String creationDateTimeZone;
    @XmlElement(name = "LastModifiedDateAndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDateAndTime;
    @XmlElement(name = "LastModfiedDateTimeZone")
    protected String lastModfiedDateTimeZone;
    @XmlElement(name = "GroupQuoteStatus", required = true)
    protected String groupQuoteStatus;
    @XmlElement(name = "ItineraryDetails", required = true)
    protected List<ItineraryDetailsType> itineraryDetails;
    @XmlElement(name = "ItinPrice", required = true)
    protected List<ItinPriceType> itinPrice;
    @XmlElement(name = "TaxExemptions")
    protected List<TaxExemptionType> taxExemptions;
    @XmlElement(name = "GroupPaxDetails", required = true)
    protected GroupPaxDetailsType groupPaxDetails;
    @XmlElement(name = "GroupQuoteContact", required = true)
    protected List<PnrContactType> groupQuoteContact;
    @XmlElement(name = "QuoteOption")
    @XmlSchemaType(name = "string")
    protected QuoteOption quoteOption;
    @XmlElement(name = "GroupQuoteComments")
    protected List<GroupQuoteCommentsType> groupQuoteComments;
    @XmlElement(name = "PromoCode")
    protected String promoCode;
    @XmlElement(name = "DepositAmount")
    protected TotalAmountPaid depositAmount;
    @XmlElement(name = "GroupQuoteAmount")
    protected List<GroupQuoteAmount> groupQuoteAmount;
    @XmlElement(name = "CreatorChannelCode")
    protected String creatorChannelCode;
    @XmlElement(name = "CreatorChannelType")
    protected String creatorChannelType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationdateinAgentOfficeTimeZone;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateInAgentOfficeTimeZone;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;

    /**
     * pointOfSale 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSale() {
        return pointOfSale;
    }

    /**
     * pointOfSale 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSale(String value) {
        this.pointOfSale = value;
    }

    /**
     * iPaddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPaddress() {
        return iPaddress;
    }

    /**
     * iPaddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPaddress(String value) {
        this.iPaddress = value;
    }

    /**
     * pnrNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrNumber() {
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
    public void setPnrNumber(String value) {
        this.pnrNumber = value;
    }

    /**
     * creationDateAndTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateAndTime() {
        return creationDateAndTime;
    }

    /**
     * creationDateAndTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateAndTime(XMLGregorianCalendar value) {
        this.creationDateAndTime = value;
    }

    /**
     * creationDateTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDateTimeZone() {
        return creationDateTimeZone;
    }

    /**
     * creationDateTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateTimeZone(String value) {
        this.creationDateTimeZone = value;
    }

    /**
     * lastModifiedDateAndTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDateAndTime() {
        return lastModifiedDateAndTime;
    }

    /**
     * lastModifiedDateAndTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDateAndTime(XMLGregorianCalendar value) {
        this.lastModifiedDateAndTime = value;
    }

    /**
     * lastModfiedDateTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModfiedDateTimeZone() {
        return lastModfiedDateTimeZone;
    }

    /**
     * lastModfiedDateTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModfiedDateTimeZone(String value) {
        this.lastModfiedDateTimeZone = value;
    }

    /**
     * groupQuoteStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupQuoteStatus() {
        return groupQuoteStatus;
    }

    /**
     * groupQuoteStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupQuoteStatus(String value) {
        this.groupQuoteStatus = value;
    }

    /**
     * Gets the value of the itineraryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryDetailsType }
     * 
     * 
     */
    public List<ItineraryDetailsType> getItineraryDetails() {
        if (itineraryDetails == null) {
            itineraryDetails = new ArrayList<ItineraryDetailsType>();
        }
        return this.itineraryDetails;
    }

    /**
     * Gets the value of the itinPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itinPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItinPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItinPriceType }
     * 
     * 
     */
    public List<ItinPriceType> getItinPrice() {
        if (itinPrice == null) {
            itinPrice = new ArrayList<ItinPriceType>();
        }
        return this.itinPrice;
    }

    /**
     * Gets the value of the taxExemptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxExemptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxExemptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxExemptionType }
     * 
     * 
     */
    public List<TaxExemptionType> getTaxExemptions() {
        if (taxExemptions == null) {
            taxExemptions = new ArrayList<TaxExemptionType>();
        }
        return this.taxExemptions;
    }

    /**
     * groupPaxDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GroupPaxDetailsType }
     *     
     */
    public GroupPaxDetailsType getGroupPaxDetails() {
        return groupPaxDetails;
    }

    /**
     * groupPaxDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupPaxDetailsType }
     *     
     */
    public void setGroupPaxDetails(GroupPaxDetailsType value) {
        this.groupPaxDetails = value;
    }

    /**
     * Gets the value of the groupQuoteContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupQuoteContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupQuoteContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrContactType }
     * 
     * 
     */
    public List<PnrContactType> getGroupQuoteContact() {
        if (groupQuoteContact == null) {
            groupQuoteContact = new ArrayList<PnrContactType>();
        }
        return this.groupQuoteContact;
    }

    /**
     * quoteOption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link QuoteOption }
     *     
     */
    public QuoteOption getQuoteOption() {
        return quoteOption;
    }

    /**
     * quoteOption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteOption }
     *     
     */
    public void setQuoteOption(QuoteOption value) {
        this.quoteOption = value;
    }

    /**
     * Gets the value of the groupQuoteComments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupQuoteComments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupQuoteComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupQuoteCommentsType }
     * 
     * 
     */
    public List<GroupQuoteCommentsType> getGroupQuoteComments() {
        if (groupQuoteComments == null) {
            groupQuoteComments = new ArrayList<GroupQuoteCommentsType>();
        }
        return this.groupQuoteComments;
    }

    /**
     * promoCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * promoCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

    /**
     * depositAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountPaid }
     *     
     */
    public TotalAmountPaid getDepositAmount() {
        return depositAmount;
    }

    /**
     * depositAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountPaid }
     *     
     */
    public void setDepositAmount(TotalAmountPaid value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the groupQuoteAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupQuoteAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupQuoteAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupQuoteAmount }
     * 
     * 
     */
    public List<GroupQuoteAmount> getGroupQuoteAmount() {
        if (groupQuoteAmount == null) {
            groupQuoteAmount = new ArrayList<GroupQuoteAmount>();
        }
        return this.groupQuoteAmount;
    }

    /**
     * creatorChannelCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorChannelCode() {
        return creatorChannelCode;
    }

    /**
     * creatorChannelCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorChannelCode(String value) {
        this.creatorChannelCode = value;
    }

    /**
     * creatorChannelType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorChannelType() {
        return creatorChannelType;
    }

    /**
     * creatorChannelType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorChannelType(String value) {
        this.creatorChannelType = value;
    }

    /**
     * creationdateinAgentOfficeTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationdateinAgentOfficeTimeZone() {
        return creationdateinAgentOfficeTimeZone;
    }

    /**
     * creationdateinAgentOfficeTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationdateinAgentOfficeTimeZone(XMLGregorianCalendar value) {
        this.creationdateinAgentOfficeTimeZone = value;
    }

    /**
     * modifiedDateInAgentOfficeTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDateInAgentOfficeTimeZone() {
        return modifiedDateInAgentOfficeTimeZone;
    }

    /**
     * modifiedDateInAgentOfficeTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDateInAgentOfficeTimeZone(XMLGregorianCalendar value) {
        this.modifiedDateInAgentOfficeTimeZone = value;
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
