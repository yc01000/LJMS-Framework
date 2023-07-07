//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>CheckinStatusType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckinStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STANDBY"/&gt;
 *     &lt;enumeration value="WAITLIST"/&gt;
 *     &lt;enumeration value="CONFIRMED"/&gt;
 *     &lt;enumeration value="OFFLOADED"/&gt;
 *     &lt;enumeration value="BOARDED"/&gt;
 *     &lt;enumeration value="DEBOARDED"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *     &lt;enumeration value="STANDBY CLEARED"/&gt;
 *     &lt;enumeration value="STANDBY BOARDED"/&gt;
 *     &lt;enumeration value="SUBJECT AVAILABILITY"/&gt;
 *     &lt;enumeration value="CHECKED IN"/&gt;
 *     &lt;enumeration value="SECURITY CLEARANCE"/&gt;
 *     &lt;enumeration value="STANDBY SECURITY CLEARANCE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CheckinStatusType")
@XmlEnum
public enum CheckinStatusType {

    STANDBY("STANDBY"),
    WAITLIST("WAITLIST"),
    CONFIRMED("CONFIRMED"),
    OFFLOADED("OFFLOADED"),
    BOARDED("BOARDED"),
    DEBOARDED("DEBOARDED"),
    CANCELLED("CANCELLED"),
    @XmlEnumValue("STANDBY CLEARED")
    STANDBY_CLEARED("STANDBY CLEARED"),
    @XmlEnumValue("STANDBY BOARDED")
    STANDBY_BOARDED("STANDBY BOARDED"),
    @XmlEnumValue("SUBJECT AVAILABILITY")
    SUBJECT_AVAILABILITY("SUBJECT AVAILABILITY"),
    @XmlEnumValue("CHECKED IN")
    CHECKED_IN("CHECKED IN"),
    @XmlEnumValue("SECURITY CLEARANCE")
    SECURITY_CLEARANCE("SECURITY CLEARANCE"),
    @XmlEnumValue("STANDBY SECURITY CLEARANCE")
    STANDBY_SECURITY_CLEARANCE("STANDBY SECURITY CLEARANCE");
    private final String value;

    CheckinStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckinStatusType fromValue(String v) {
        for (CheckinStatusType c: CheckinStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
