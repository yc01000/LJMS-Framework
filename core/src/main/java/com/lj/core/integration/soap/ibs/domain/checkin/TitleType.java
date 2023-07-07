//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>TitleType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="TitleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MR"/&gt;
 *     &lt;enumeration value="MRS"/&gt;
 *     &lt;enumeration value="MS"/&gt;
 *     &lt;enumeration value="MSTR"/&gt;
 *     &lt;enumeration value="MISS"/&gt;
 *     &lt;enumeration value="DR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TitleType")
@XmlEnum
public enum TitleType {

    MR,
    MRS,
    MS,
    MSTR,
    MISS,
    DR;

    public String value() {
        return name();
    }

    public static TitleType fromValue(String v) {
        return valueOf(v);
    }

}
