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
 * <p>PaxFinderVODetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaxFinderVODetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FamilyId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="GuestId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxFinderVODetails", propOrder = {
    "familyId",
    "guestId"
})
public class PaxFinderVODetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FamilyId")
    protected long familyId;
    @XmlElement(name = "GuestId")
    protected long guestId;

    /**
     * familyId 속성의 값을 가져옵니다.
     * 
     */
    public long getFamilyId() {
        return familyId;
    }

    /**
     * familyId 속성의 값을 설정합니다.
     * 
     */
    public void setFamilyId(long value) {
        this.familyId = value;
    }

    /**
     * guestId 속성의 값을 가져옵니다.
     * 
     */
    public long getGuestId() {
        return guestId;
    }

    /**
     * guestId 속성의 값을 설정합니다.
     * 
     */
    public void setGuestId(long value) {
        this.guestId = value;
    }

}
