//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.05.28 시간 08:48:08 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="giftVoucherTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bulkOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftVoucherDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}CreatedGiftVoucherDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="errorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType" minOccurs="0"/>
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
    "giftVoucherTypeCode",
    "bulkOrderNumber",
    "giftVoucherDetails",
    "errorType"
})
@XmlRootElement(name = "CreateBulkGiftVouchersRS")
public class CreateBulkGiftVouchersRS {

    protected String giftVoucherTypeCode;
    protected String bulkOrderNumber;
    protected List<CreatedGiftVoucherDetails> giftVoucherDetails;
    protected ErrorType errorType;

    /**
     * giftVoucherTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftVoucherTypeCode() {
        return giftVoucherTypeCode;
    }

    /**
     * giftVoucherTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftVoucherTypeCode(String value) {
        this.giftVoucherTypeCode = value;
    }

    /**
     * bulkOrderNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulkOrderNumber() {
        return bulkOrderNumber;
    }

    /**
     * bulkOrderNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulkOrderNumber(String value) {
        this.bulkOrderNumber = value;
    }

    /**
     * Gets the value of the giftVoucherDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftVoucherDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftVoucherDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreatedGiftVoucherDetails }
     * 
     * 
     */
    public List<CreatedGiftVoucherDetails> getGiftVoucherDetails() {
        if (giftVoucherDetails == null) {
            giftVoucherDetails = new ArrayList<CreatedGiftVoucherDetails>();
        }
        return this.giftVoucherDetails;
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
