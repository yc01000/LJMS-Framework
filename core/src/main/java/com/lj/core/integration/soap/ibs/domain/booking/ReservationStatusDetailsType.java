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
 * <p>ReservationStatusDetails_Type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="ReservationStatusDetails_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HOLDING_SOLD"/&gt;
 *     &lt;enumeration value="WAITLISTED"/&gt;
 *     &lt;enumeration value="STANDBY"/&gt;
 *     &lt;enumeration value="CONFIRMED"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *     &lt;enumeration value="TIME_CHANGE"/&gt;
 *     &lt;enumeration value="TIME_CHANGE_FROM_CONFIRMED"/&gt;
 *     &lt;enumeration value="TIME_CHANGE_FROM_WAITLIST"/&gt;
 *     &lt;enumeration value="TIME_CHANGE_FROM_STANDBY"/&gt;
 *     &lt;enumeration value="EARLY_SHOW"/&gt;
 *     &lt;enumeration value="LATE_SHOW"/&gt;
 *     &lt;enumeration value="WAS_CONFIRMED"/&gt;
 *     &lt;enumeration value="WAS_WAITLISTED"/&gt;
 *     &lt;enumeration value="WAS_STANDBY"/&gt;
 *     &lt;enumeration value="SCHEDULE_CHANGE"/&gt;
 *     &lt;enumeration value="CONFIRMED_FROM_WAITLIST"/&gt;
 *     &lt;enumeration value="UNABLE_CLOSED"/&gt;
 *     &lt;enumeration value="NO_ACTION_TAKEN"/&gt;
 *     &lt;enumeration value="UNABLE_FLIGHT_NON_OPERATING"/&gt;
 *     &lt;enumeration value="HOLDING_NEEDED"/&gt;
 *     &lt;enumeration value="TP_CONFIRMED"/&gt;
 *     &lt;enumeration value="WAS_REQUESTED"/&gt;
 *     &lt;enumeration value="REQUESTED"/&gt;
 *     &lt;enumeration value="WAS_HOLDING_NEEDED"/&gt;
 *     &lt;enumeration value="CONFIRMED VERBALLY"/&gt;
 *     &lt;enumeration value="TIME_CHANGE_FROM_HOLDING_NEEDED"/&gt;
 *     &lt;enumeration value="WAS_TP_CONFIRMED"/&gt;
 *     &lt;enumeration value="CANCELLED VERBALLY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReservationStatusDetails_Type")
@XmlEnum
public enum ReservationStatusDetailsType {

    HOLDING_SOLD("HOLDING_SOLD"),
    WAITLISTED("WAITLISTED"),
    STANDBY("STANDBY"),
    CONFIRMED("CONFIRMED"),
    CANCELLED("CANCELLED"),
    TIME_CHANGE("TIME_CHANGE"),
    TIME_CHANGE_FROM_CONFIRMED("TIME_CHANGE_FROM_CONFIRMED"),
    TIME_CHANGE_FROM_WAITLIST("TIME_CHANGE_FROM_WAITLIST"),
    TIME_CHANGE_FROM_STANDBY("TIME_CHANGE_FROM_STANDBY"),
    EARLY_SHOW("EARLY_SHOW"),
    LATE_SHOW("LATE_SHOW"),
    WAS_CONFIRMED("WAS_CONFIRMED"),
    WAS_WAITLISTED("WAS_WAITLISTED"),
    WAS_STANDBY("WAS_STANDBY"),
    SCHEDULE_CHANGE("SCHEDULE_CHANGE"),
    CONFIRMED_FROM_WAITLIST("CONFIRMED_FROM_WAITLIST"),
    UNABLE_CLOSED("UNABLE_CLOSED"),
    NO_ACTION_TAKEN("NO_ACTION_TAKEN"),
    UNABLE_FLIGHT_NON_OPERATING("UNABLE_FLIGHT_NON_OPERATING"),
    HOLDING_NEEDED("HOLDING_NEEDED"),
    TP_CONFIRMED("TP_CONFIRMED"),
    WAS_REQUESTED("WAS_REQUESTED"),
    REQUESTED("REQUESTED"),
    WAS_HOLDING_NEEDED("WAS_HOLDING_NEEDED"),
    @XmlEnumValue("CONFIRMED VERBALLY")
    CONFIRMED_VERBALLY("CONFIRMED VERBALLY"),
    TIME_CHANGE_FROM_HOLDING_NEEDED("TIME_CHANGE_FROM_HOLDING_NEEDED"),
    WAS_TP_CONFIRMED("WAS_TP_CONFIRMED"),
    @XmlEnumValue("CANCELLED VERBALLY")
    CANCELLED_VERBALLY("CANCELLED VERBALLY");
    private final String value;

    ReservationStatusDetailsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReservationStatusDetailsType fromValue(String v) {
        for (ReservationStatusDetailsType c: ReservationStatusDetailsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
