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
import jakarta.xml.bind.annotation.XmlType;


/**
 * This contains the standby code and the number of bookings made on that particular standb code.
 * 
 * <p>StandbyHireDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="StandbyHireDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateOfHire" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumberOfBookings" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandbyHireDetailsType", propOrder = {
    "dateOfHire",
    "numberOfBookings"
})
public class StandbyHireDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "DateOfHire", required = true)
    protected String dateOfHire;
    @XmlElement(name = "NumberOfBookings")
    protected int numberOfBookings;

    /**
     * dateOfHire 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfHire() {
        return dateOfHire;
    }

    /**
     * dateOfHire 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfHire(String value) {
        this.dateOfHire = value;
    }

    /**
     * numberOfBookings 속성의 값을 가져옵니다.
     * 
     */
    public int getNumberOfBookings() {
        return numberOfBookings;
    }

    /**
     * numberOfBookings 속성의 값을 설정합니다.
     * 
     */
    public void setNumberOfBookings(int value) {
        this.numberOfBookings = value;
    }

}
