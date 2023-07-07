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
 * <p>CardType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="CardType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VISA"/&gt;
 *     &lt;enumeration value="MASTERCARD"/&gt;
 *     &lt;enumeration value="AMEX"/&gt;
 *     &lt;enumeration value="UATP"/&gt;
 *     &lt;enumeration value="DINERS"/&gt;
 *     &lt;enumeration value="JCB"/&gt;
 *     &lt;enumeration value="KOOKMIN"/&gt;
 *     &lt;enumeration value="HYUNDAI"/&gt;
 *     &lt;enumeration value="SHINHAN"/&gt;
 *     &lt;enumeration value="EXBANK"/&gt;
 *     &lt;enumeration value="LOTTE"/&gt;
 *     &lt;enumeration value="SAMSUNG"/&gt;
 *     &lt;enumeration value="BC"/&gt;
 *     &lt;enumeration value="CREDITCARD"/&gt;
 *     &lt;enumeration value="HANASK"/&gt;
 *     &lt;enumeration value="NONGHYUP"/&gt;
 *     &lt;enumeration value="DUMMY"/&gt;
 *     &lt;enumeration value="PAYPAL"/&gt;
 *     &lt;enumeration value="KAKAOPAY"/&gt;
 *     &lt;enumeration value="MOBILETMONEY"/&gt;
 *     &lt;enumeration value="ALIPAY"/&gt;
 *     &lt;enumeration value="TENPAY"/&gt;
 *     &lt;enumeration value="UNIONPAY"/&gt;
 *     &lt;enumeration value="PAYSBUY"/&gt;
 *     &lt;enumeration value="CVSPAYMENT"/&gt;
 *     &lt;enumeration value="ABBCREDIT"/&gt;
 *     &lt;enumeration value="WPCREDIT"/&gt;
 *     &lt;enumeration value="AXESSCARD"/&gt;
 *     &lt;enumeration value="BONUSCARD"/&gt;
 *     &lt;enumeration value="WORLDCARD"/&gt;
 *     &lt;enumeration value="MAXIMUMCARD"/&gt;
 *     &lt;enumeration value="BKM"/&gt;
 *     &lt;enumeration value="TROY"/&gt;
 *     &lt;enumeration value="MOBILEPAY"/&gt;
 *     &lt;enumeration value="PAYOO"/&gt;
 *     &lt;enumeration value="EC"/&gt;
 *     &lt;enumeration value="WECHATPAY"/&gt;
 *     &lt;enumeration value="NAVERPAY"/&gt;
 *     &lt;enumeration value="BA"/&gt;
 *     &lt;enumeration value="VBA"/&gt;
 *     &lt;enumeration value="QUNAR"/&gt;
 *     &lt;enumeration value="DCKRW"/&gt;
 *     &lt;enumeration value="DCOTH"/&gt;
 *     &lt;enumeration value="OCKRW"/&gt;
 *     &lt;enumeration value="OCOTH"/&gt;
 *     &lt;enumeration value="NTTDATACREDIT"/&gt;
 *     &lt;enumeration value="VISAAPPLEPAY"/&gt;
 *     &lt;enumeration value="MASTERAPPLEPAY"/&gt;
 *     &lt;enumeration value="AMEXAPPLEPAY"/&gt;
 *     &lt;enumeration value="ICCARD"/&gt;
 *     &lt;enumeration value="PAYCO"/&gt;
 *     &lt;enumeration value="TOSS"/&gt;
 *     &lt;enumeration value="TWAYPAY"/&gt;
 *     &lt;enumeration value="NKAKAOPAY"/&gt;
 *     &lt;enumeration value="LINEPAY"/&gt;
 *     &lt;enumeration value="MISCELLANEOUS"/&gt;
 *     &lt;enumeration value="DEBITCARD"/&gt;
 *     &lt;enumeration value="KBKOOKMIN"/&gt;
 *     &lt;enumeration value="KEBHANA"/&gt;
 *     &lt;enumeration value="VISAINTL"/&gt;
 *     &lt;enumeration value="JCBINTL"/&gt;
 *     &lt;enumeration value="DINERSCLUB"/&gt;
 *     &lt;enumeration value="LOTTEINTL"/&gt;
 *     &lt;enumeration value="MASTERINTL"/&gt;
 *     &lt;enumeration value="NH"/&gt;
 *     &lt;enumeration value="CITI"/&gt;
 *     &lt;enumeration value="WOORI"/&gt;
 *     &lt;enumeration value="KWANGJU"/&gt;
 *     &lt;enumeration value="SUHYUP"/&gt;
 *     &lt;enumeration value="JEONBUK"/&gt;
 *     &lt;enumeration value="JEJU"/&gt;
 *     &lt;enumeration value="CHOHUNG"/&gt;
 *     &lt;enumeration value="KDB"/&gt;
 *     &lt;enumeration value="CARDPAY"/&gt;
 *     &lt;enumeration value="PAYSAFE"/&gt;
 *     &lt;enumeration value="SMILEPAY"/&gt;
 *     &lt;enumeration value="PAYPAY"/&gt;
 *     &lt;enumeration value="SSGPAY"/&gt;
 *     &lt;enumeration value="EASYWELLPOINT"/&gt;
 *     &lt;enumeration value="EASYPAY"/&gt;
 *     &lt;enumeration value="UNION"/&gt;
 *     &lt;enumeration value="BCCARD"/&gt;
 *     &lt;enumeration value="PROMOTION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardType")
@XmlEnum
public enum CardType {

    VISA,
    MASTERCARD,
    AMEX,
    UATP,
    DINERS,
    JCB,
    KOOKMIN,
    HYUNDAI,
    SHINHAN,
    EXBANK,
    LOTTE,
    SAMSUNG,
    BC,
    CREDITCARD,
    HANASK,
    NONGHYUP,
    DUMMY,
    PAYPAL,
    KAKAOPAY,
    MOBILETMONEY,
    ALIPAY,
    TENPAY,
    UNIONPAY,
    PAYSBUY,
    CVSPAYMENT,
    ABBCREDIT,
    WPCREDIT,
    AXESSCARD,
    BONUSCARD,
    WORLDCARD,
    MAXIMUMCARD,
    BKM,
    TROY,
    MOBILEPAY,
    PAYOO,
    EC,
    WECHATPAY,
    NAVERPAY,
    BA,
    VBA,
    QUNAR,
    DCKRW,
    DCOTH,
    OCKRW,
    OCOTH,
    NTTDATACREDIT,
    VISAAPPLEPAY,
    MASTERAPPLEPAY,
    AMEXAPPLEPAY,
    ICCARD,
    PAYCO,
    TOSS,
    TWAYPAY,
    NKAKAOPAY,
    LINEPAY,
    MISCELLANEOUS,
    DEBITCARD,
    KBKOOKMIN,
    KEBHANA,
    VISAINTL,
    JCBINTL,
    DINERSCLUB,
    LOTTEINTL,
    MASTERINTL,
    NH,
    CITI,
    WOORI,
    KWANGJU,
    SUHYUP,
    JEONBUK,
    JEJU,
    CHOHUNG,
    KDB,
    CARDPAY,
    PAYSAFE,
    SMILEPAY,
    PAYPAY,
    SSGPAY,
    EASYWELLPOINT,
    EASYPAY,
    UNION,
    BCCARD,
    PROMOTION;

    public String value() {
        return name();
    }

    public static CardType fromValue(String v) {
        return valueOf(v);
    }

}
