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
 * <p>CommentTypeCode에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="CommentTypeCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FREE_FORM_COMMENT"/&gt;
 *     &lt;enumeration value="MANIFEST_COMMENT"/&gt;
 *     &lt;enumeration value="INVOICE_COMMENT"/&gt;
 *     &lt;enumeration value="CONFIDENTIAL_COMMENT"/&gt;
 *     &lt;enumeration value="SECURITY_COMMENT"/&gt;
 *     &lt;enumeration value="CRS HISTORY"/&gt;
 *     &lt;enumeration value="OPERATIONAL_COMMENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommentTypeCode")
@XmlEnum
public enum CommentTypeCode {

    FREE_FORM_COMMENT("FREE_FORM_COMMENT"),
    MANIFEST_COMMENT("MANIFEST_COMMENT"),
    INVOICE_COMMENT("INVOICE_COMMENT"),
    CONFIDENTIAL_COMMENT("CONFIDENTIAL_COMMENT"),
    SECURITY_COMMENT("SECURITY_COMMENT"),
    @XmlEnumValue("CRS HISTORY")
    CRS_HISTORY("CRS HISTORY"),
    OPERATIONAL_COMMENT("OPERATIONAL_COMMENT");
    private final String value;

    CommentTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommentTypeCode fromValue(String v) {
        for (CommentTypeCode c: CommentTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
