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
 * <p>FlightStatusType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OPEN FOR CHECKIN"/&gt;
 *     &lt;enumeration value="CLOSED FOR CHECKIN"/&gt;
 *     &lt;enumeration value="OPEN FOR EDIT"/&gt;
 *     &lt;enumeration value="CLOSED"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *     &lt;enumeration value="AVAILABLE"/&gt;
 *     &lt;enumeration value="OPEN FOR CONNECTION CHECKIN"/&gt;
 *     &lt;enumeration value="OPEN"/&gt;
 *     &lt;enumeration value="DEPARTED"/&gt;
 *     &lt;enumeration value="CLOSEDFORSALES"/&gt;
 *     &lt;enumeration value="HOLDING_SOLD"/&gt;
 *     &lt;enumeration value="CONFIRMED"/&gt;
 *     &lt;enumeration value="WAITLISTED"/&gt;
 *     &lt;enumeration value="STANDBY"/&gt;
 *     &lt;enumeration value="HOLDING_NEEDED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FlightStatusType")
@XmlEnum
public enum FlightStatusType {

    @XmlEnumValue("OPEN FOR CHECKIN")
    OPEN_FOR_CHECKIN("OPEN FOR CHECKIN"),
    @XmlEnumValue("CLOSED FOR CHECKIN")
    CLOSED_FOR_CHECKIN("CLOSED FOR CHECKIN"),
    @XmlEnumValue("OPEN FOR EDIT")
    OPEN_FOR_EDIT("OPEN FOR EDIT"),
    CLOSED("CLOSED"),
    CANCELLED("CANCELLED"),
    AVAILABLE("AVAILABLE"),
    @XmlEnumValue("OPEN FOR CONNECTION CHECKIN")
    OPEN_FOR_CONNECTION_CHECKIN("OPEN FOR CONNECTION CHECKIN"),
    OPEN("OPEN"),
    DEPARTED("DEPARTED"),
    CLOSEDFORSALES("CLOSEDFORSALES"),
    HOLDING_SOLD("HOLDING_SOLD"),
    CONFIRMED("CONFIRMED"),
    WAITLISTED("WAITLISTED"),
    STANDBY("STANDBY"),
    HOLDING_NEEDED("HOLDING_NEEDED");
    private final String value;

    FlightStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightStatusType fromValue(String v) {
        for (FlightStatusType c: FlightStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
