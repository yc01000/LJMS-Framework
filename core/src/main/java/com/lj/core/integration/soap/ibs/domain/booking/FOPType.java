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
 * <p>FOPType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="FOPType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AG"/&gt;
 *     &lt;enumeration value="CC"/&gt;
 *     &lt;enumeration value="CF"/&gt;
 *     &lt;enumeration value="CS"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="CA"/&gt;
 *     &lt;enumeration value="CK"/&gt;
 *     &lt;enumeration value="DB"/&gt;
 *     &lt;enumeration value="WO"/&gt;
 *     &lt;enumeration value="GV"/&gt;
 *     &lt;enumeration value="GC"/&gt;
 *     &lt;enumeration value="LP"/&gt;
 *     &lt;enumeration value="LT"/&gt;
 *     &lt;enumeration value="TK"/&gt;
 *     &lt;enumeration value="DD"/&gt;
 *     &lt;enumeration value="CO"/&gt;
 *     &lt;enumeration value="CR"/&gt;
 *     &lt;enumeration value="PT"/&gt;
 *     &lt;enumeration value="ET"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="PP"/&gt;
 *     &lt;enumeration value="WA"/&gt;
 *     &lt;enumeration value="ED"/&gt;
 *     &lt;enumeration value="CI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FOPType")
@XmlEnum
public enum FOPType {

    AG,
    CC,
    CF,
    CS,
    PA,
    CA,
    CK,
    DB,
    WO,
    GV,
    GC,
    LP,
    LT,
    TK,
    DD,
    CO,
    CR,
    PT,
    ET,
    IN,
    PP,
    WA,
    ED,
    CI;

    public String value() {
        return name();
    }

    public static FOPType fromValue(String v) {
        return valueOf(v);
    }

}
