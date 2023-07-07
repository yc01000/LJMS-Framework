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
 * <p>StaffGuestDetails_Type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="StaffGuestDetails_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EM"/&gt;
 *     &lt;enumeration value="SP"/&gt;
 *     &lt;enumeration value="DP"/&gt;
 *     &lt;enumeration value="TC"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="ZED"/&gt;
 *     &lt;enumeration value="ZEA"/&gt;
 *     &lt;enumeration value="ZEC"/&gt;
 *     &lt;enumeration value="ZEI"/&gt;
 *     &lt;enumeration value="ZSP"/&gt;
 *     &lt;enumeration value="ZCS"/&gt;
 *     &lt;enumeration value="ZSO"/&gt;
 *     &lt;enumeration value="ZSS"/&gt;
 *     &lt;enumeration value="ZCO"/&gt;
 *     &lt;enumeration value="ZEP"/&gt;
 *     &lt;enumeration value="ZPS"/&gt;
 *     &lt;enumeration value="ZPM"/&gt;
 *     &lt;enumeration value="ZES"/&gt;
 *     &lt;enumeration value="ZSA"/&gt;
 *     &lt;enumeration value="ZMA"/&gt;
 *     &lt;enumeration value="ZEF"/&gt;
 *     &lt;enumeration value="ZPC"/&gt;
 *     &lt;enumeration value="ZPA"/&gt;
 *     &lt;enumeration value="ZWA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StaffGuestDetails_Type")
@XmlEnum
public enum StaffGuestDetailsType {

    EM,
    SP,
    DP,
    TC,
    PA,
    CH,
    FR,
    ZED,
    ZEA,
    ZEC,
    ZEI,
    ZSP,
    ZCS,
    ZSO,
    ZSS,
    ZCO,
    ZEP,
    ZPS,
    ZPM,
    ZES,
    ZSA,
    ZMA,
    ZEF,
    ZPC,
    ZPA,
    ZWA;

    public String value() {
        return name();
    }

    public static StaffGuestDetailsType fromValue(String v) {
        return valueOf(v);
    }

}
