//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2021.04.29 시간 12:54:19 PM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>SalutationType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="SalutationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Dr"/&gt;
 *     &lt;enumeration value="Engg"/&gt;
 *     &lt;enumeration value="Sr"/&gt;
 *     &lt;enumeration value="Jr"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SalutationType")
@XmlEnum
public enum SalutationType {

    @XmlEnumValue("Dr")
    DR("Dr"),
    @XmlEnumValue("Engg")
    ENGG("Engg"),
    @XmlEnumValue("Sr")
    SR("Sr"),
    @XmlEnumValue("Jr")
    JR("Jr");
    private final String value;

    SalutationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SalutationType fromValue(String v) {
        for (SalutationType c: SalutationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
