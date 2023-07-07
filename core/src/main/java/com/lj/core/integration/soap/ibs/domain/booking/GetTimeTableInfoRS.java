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
 *         &lt;element name="FromScheduleResults" type="{http://www.ibsplc.com/iRes/simpleTypes/}ScheduleInfoDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ToScheduleResults" type="{http://www.ibsplc.com/iRes/simpleTypes/}ScheduleInfoDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FromPageNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ToPageNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
 *         &lt;element name="FromTotalPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ToTotalPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "fromScheduleResults",
    "toScheduleResults",
    "fromPageNo",
    "toPageNo",
    "sessionId",
    "errorType",
    "fromTotalPages",
    "toTotalPages"
})
@XmlRootElement(name = "GetTimeTableInfoRS")
public class GetTimeTableInfoRS
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FromScheduleResults")
    protected List<ScheduleInfoDetails> fromScheduleResults;
    @XmlElement(name = "ToScheduleResults")
    protected List<ScheduleInfoDetails> toScheduleResults;
    @XmlElement(name = "FromPageNo")
    protected Integer fromPageNo;
    @XmlElement(name = "ToPageNo")
    protected Integer toPageNo;
    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;
    @XmlElement(name = "FromTotalPages")
    protected Integer fromTotalPages;
    @XmlElement(name = "ToTotalPages")
    protected Integer toTotalPages;

    /**
     * Gets the value of the fromScheduleResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromScheduleResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromScheduleResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleInfoDetails }
     * 
     * 
     */
    public List<ScheduleInfoDetails> getFromScheduleResults() {
        if (fromScheduleResults == null) {
            fromScheduleResults = new ArrayList<ScheduleInfoDetails>();
        }
        return this.fromScheduleResults;
    }

    /**
     * Gets the value of the toScheduleResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toScheduleResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToScheduleResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleInfoDetails }
     * 
     * 
     */
    public List<ScheduleInfoDetails> getToScheduleResults() {
        if (toScheduleResults == null) {
            toScheduleResults = new ArrayList<ScheduleInfoDetails>();
        }
        return this.toScheduleResults;
    }

    /**
     * fromPageNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFromPageNo() {
        return fromPageNo;
    }

    /**
     * fromPageNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFromPageNo(Integer value) {
        this.fromPageNo = value;
    }

    /**
     * toPageNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getToPageNo() {
        return toPageNo;
    }

    /**
     * toPageNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setToPageNo(Integer value) {
        this.toPageNo = value;
    }

    /**
     * sessionId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * sessionId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
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
     * fromTotalPages 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFromTotalPages() {
        return fromTotalPages;
    }

    /**
     * fromTotalPages 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFromTotalPages(Integer value) {
        this.fromTotalPages = value;
    }

    /**
     * toTotalPages 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getToTotalPages() {
        return toTotalPages;
    }

    /**
     * toTotalPages 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setToTotalPages(Integer value) {
        this.toTotalPages = value;
    }

}
