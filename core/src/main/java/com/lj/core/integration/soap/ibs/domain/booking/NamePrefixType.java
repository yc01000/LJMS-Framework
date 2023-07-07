//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2021.04.29 시간 12:54:19 PM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>NamePrefixType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="NamePrefixType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="MR"/&gt;
 *     &lt;enumeration value="MRS"/&gt;
 *     &lt;enumeration value="MS"/&gt;
 *     &lt;enumeration value="MISS"/&gt;
 *     &lt;enumeration value="MSTR"/&gt;
 *     &lt;enumeration value="HH"/&gt;
 *     &lt;enumeration value="HE"/&gt;
 *     &lt;enumeration value="SH"/&gt;
 *     &lt;enumeration value="SHA"/&gt;
 *     &lt;enumeration value="DR"/&gt;
 *     &lt;enumeration value="MME"/&gt;
 *     &lt;enumeration value="MLLE"/&gt;
 *     &lt;enumeration value="ME"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NamePrefixType")
@XmlEnum
public enum NamePrefixType {

    M,
    MR,
    MRS,
    MS,
    MISS,
    MSTR,
    HH,
    HE,
    SH,
    SHA,
    DR,
    MME,
    MLLE,
    ME;

    public String value() {
        return name();
    }

    public static NamePrefixType fromValue(String v) {
        return valueOf(v);
    }

}
