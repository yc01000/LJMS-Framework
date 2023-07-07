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
 *         &lt;element name="DocumentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}DocumentDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InfantDocumentDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}InfantDocumentDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "documentDetails",
    "infantDocumentDetails",
    "errorType"
})
@XmlRootElement(name = "CHK_GetApisRS")
public class CHKGetApisRS
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "DocumentDetails")
    protected List<DocumentDetailsType> documentDetails;
    @XmlElement(name = "InfantDocumentDetails")
    protected List<InfantDocumentDetailsType> infantDocumentDetails;
    @XmlElement(name = "ErrorType")
    protected ErrorType errorType;

    /**
     * Gets the value of the documentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentDetailsType }
     * 
     * 
     */
    public List<DocumentDetailsType> getDocumentDetails() {
        if (documentDetails == null) {
            documentDetails = new ArrayList<DocumentDetailsType>();
        }
        return this.documentDetails;
    }

    /**
     * Gets the value of the infantDocumentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infantDocumentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfantDocumentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfantDocumentDetailsType }
     * 
     * 
     */
    public List<InfantDocumentDetailsType> getInfantDocumentDetails() {
        if (infantDocumentDetails == null) {
            infantDocumentDetails = new ArrayList<InfantDocumentDetailsType>();
        }
        return this.infantDocumentDetails;
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
