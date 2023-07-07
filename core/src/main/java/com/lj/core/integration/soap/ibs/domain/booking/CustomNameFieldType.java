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
 * <p>CustomNameFieldType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomNameFieldType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PROFILE_TYPE"/&gt;
 *     &lt;enumeration value="CARD_SEQ_NUM"/&gt;
 *     &lt;enumeration value="TRANSACTION_ID"/&gt;
 *     &lt;enumeration value="IS_ADC"/&gt;
 *     &lt;enumeration value="TRIP_TYPE"/&gt;
 *     &lt;enumeration value="PAYMENT_REQ_EXTRA_PARAMS"/&gt;
 *     &lt;enumeration value="PROFILE_ID"/&gt;
 *     &lt;enumeration value="PAYMENT_TOKEN_ID"/&gt;
 *     &lt;enumeration value="LOYALTY_ID"/&gt;
 *     &lt;enumeration value="CUSTOMER_CARD_ID"/&gt;
 *     &lt;enumeration value="PARTIALLY_FLOWN_IND"/&gt;
 *     &lt;enumeration value="REPRICE_DATE_GMT"/&gt;
 *     &lt;enumeration value="REPRICE_DATE_GMT_NON_TKTED"/&gt;
 *     &lt;enumeration value="TOKEN_GENERATION_KEY"/&gt;
 *     &lt;enumeration value="TOKEN_GENERATION_URL"/&gt;
 *     &lt;enumeration value="PAYMENT_ORDER_ID"/&gt;
 *     &lt;enumeration value="PAYBACK_CARD_NUM"/&gt;
 *     &lt;enumeration value="PAYBACK_COUPON_NUM"/&gt;
 *     &lt;enumeration value="OFFER_META_DATA"/&gt;
 *     &lt;enumeration value="ANCILLARY_OFFERMETA_DATA"/&gt;
 *     &lt;enumeration value="SUCCESS_URL"/&gt;
 *     &lt;enumeration value="FAILURE_URL"/&gt;
 *     &lt;enumeration value="LOCALE_COUNTRY_CODE"/&gt;
 *     &lt;enumeration value="IS_MOTO_TX"/&gt;
 *     &lt;enumeration value="PAYMENT_GATEWAY_SUPPLEMENTARY_INFO"/&gt;
 *     &lt;enumeration value="PNR_NUMBER"/&gt;
 *     &lt;enumeration value="RLOC"/&gt;
 *     &lt;enumeration value="INTERLINE_PARTNER_TYPE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomNameFieldType")
@XmlEnum
public enum CustomNameFieldType {

    PROFILE_TYPE,
    CARD_SEQ_NUM,
    TRANSACTION_ID,
    IS_ADC,
    TRIP_TYPE,
    PAYMENT_REQ_EXTRA_PARAMS,
    PROFILE_ID,
    PAYMENT_TOKEN_ID,
    LOYALTY_ID,
    CUSTOMER_CARD_ID,
    PARTIALLY_FLOWN_IND,
    REPRICE_DATE_GMT,
    REPRICE_DATE_GMT_NON_TKTED,
    TOKEN_GENERATION_KEY,
    TOKEN_GENERATION_URL,
    PAYMENT_ORDER_ID,
    PAYBACK_CARD_NUM,
    PAYBACK_COUPON_NUM,
    OFFER_META_DATA,
    ANCILLARY_OFFERMETA_DATA,
    SUCCESS_URL,
    FAILURE_URL,
    LOCALE_COUNTRY_CODE,
    IS_MOTO_TX,
    PAYMENT_GATEWAY_SUPPLEMENTARY_INFO,
    PNR_NUMBER,
    RLOC,
    INTERLINE_PARTNER_TYPE;

    public String value() {
        return name();
    }

    public static CustomNameFieldType fromValue(String v) {
        return valueOf(v);
    }

}
