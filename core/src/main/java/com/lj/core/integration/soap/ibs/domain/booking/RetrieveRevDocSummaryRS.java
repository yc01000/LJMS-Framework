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
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AirlineNumericalCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TotalPages" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="RevDocSales" type="{http://www.ibsplc.com/iRes/simpleTypes/}RevDocSalesType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/&gt;
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
    "airlineCode",
    "airlineNumericalCode",
    "agencyCode",
    "totalPages",
    "pageNumber",
    "revDocSales",
    "errorType"
})
@XmlRootElement(name = "RetrieveRevDocSummaryRS")
public class RetrieveRevDocSummaryRS
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected String airlineCode;
    @XmlElement(name = "AirlineNumericalCode", required = true)
    protected String airlineNumericalCode;
    @XmlElement(name = "AgencyCode", required = true)
    protected String agencyCode;
    @XmlElement(name = "TotalPages")
    protected long totalPages;
    @XmlElement(name = "PageNumber")
    protected long pageNumber;
    @XmlElement(name = "RevDocSales")
    protected List<RevDocSalesType> revDocSales;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;

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
     * airlineNumericalCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineNumericalCode() {
        return airlineNumericalCode;
    }

    /**
     * airlineNumericalCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineNumericalCode(String value) {
        this.airlineNumericalCode = value;
    }

    /**
     * agencyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * agencyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * totalPages 속성의 값을 가져옵니다.
     * 
     */
    public long getTotalPages() {
        return totalPages;
    }

    /**
     * totalPages 속성의 값을 설정합니다.
     * 
     */
    public void setTotalPages(long value) {
        this.totalPages = value;
    }

    /**
     * pageNumber 속성의 값을 가져옵니다.
     * 
     */
    public long getPageNumber() {
        return pageNumber;
    }

    /**
     * pageNumber 속성의 값을 설정합니다.
     * 
     */
    public void setPageNumber(long value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the revDocSales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revDocSales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevDocSales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevDocSalesType }
     * 
     * 
     */
    public List<RevDocSalesType> getRevDocSales() {
        if (revDocSales == null) {
            revDocSales = new ArrayList<RevDocSalesType>();
        }
        return this.revDocSales;
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
