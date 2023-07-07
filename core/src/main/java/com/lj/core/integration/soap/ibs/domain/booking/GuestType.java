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
 * <p>GuestType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="GuestType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADULT"/&gt;
 *     &lt;enumeration value="CHILD"/&gt;
 *     &lt;enumeration value="INFANT"/&gt;
 *     &lt;enumeration value="MILITARY"/&gt;
 *     &lt;enumeration value="SENIOR"/&gt;
 *     &lt;enumeration value="YOUTH"/&gt;
 *     &lt;enumeration value="CBBG"/&gt;
 *     &lt;enumeration value="SROVR65"/&gt;
 *     &lt;enumeration value="EXST"/&gt;
 *     &lt;enumeration value="CIP"/&gt;
 *     &lt;enumeration value="EMBASSY"/&gt;
 *     &lt;enumeration value="BUSTRP"/&gt;
 *     &lt;enumeration value="FAMEVNT"/&gt;
 *     &lt;enumeration value="AFFILIATES"/&gt;
 *     &lt;enumeration value="AFFCH"/&gt;
 *     &lt;enumeration value="CHJERES"/&gt;
 *     &lt;enumeration value="JEJURES"/&gt;
 *     &lt;enumeration value="MLTRYOTRS"/&gt;
 *     &lt;enumeration value="USAMIL"/&gt;
 *     &lt;enumeration value="PACCINDM"/&gt;
 *     &lt;enumeration value="INDM"/&gt;
 *     &lt;enumeration value="PNMER"/&gt;
 *     &lt;enumeration value="HNDPCH1TO4"/&gt;
 *     &lt;enumeration value="HDCPADL5TO6"/&gt;
 *     &lt;enumeration value="HDCPADL1TO4"/&gt;
 *     &lt;enumeration value="MDISC"/&gt;
 *     &lt;enumeration value="DEFOLIANTS"/&gt;
 *     &lt;enumeration value="STUDENT"/&gt;
 *     &lt;enumeration value="DDHDCRW"/&gt;
 *     &lt;enumeration value="YOUT11TO24"/&gt;
 *     &lt;enumeration value="VACATION"/&gt;
 *     &lt;enumeration value="VACATIONCH"/&gt;
 *     &lt;enumeration value="HNDCAPGUR"/&gt;
 *     &lt;enumeration value="HNDCPGUR"/&gt;
 *     &lt;enumeration value="VACATIONCH50"/&gt;
 *     &lt;enumeration value="EMABSSY"/&gt;
 *     &lt;enumeration value="VACATION50"/&gt;
 *     &lt;enumeration value="AFFILIATE"/&gt;
 *     &lt;enumeration value="AHHCH"/&gt;
 *     &lt;enumeration value="JEJURESCH"/&gt;
 *     &lt;enumeration value="HNDCPCH1TO4"/&gt;
 *     &lt;enumeration value="DVNM1TO3"/&gt;
 *     &lt;enumeration value="DVNM"/&gt;
 *     &lt;enumeration value="YOU11TO24"/&gt;
 *     &lt;enumeration value="ADT"/&gt;
 *     &lt;enumeration value="COB"/&gt;
 *     &lt;enumeration value="CD"/&gt;
 *     &lt;enumeration value="CE"/&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="CG00"/&gt;
 *     &lt;enumeration value="DG"/&gt;
 *     &lt;enumeration value="DP"/&gt;
 *     &lt;enumeration value="IB00"/&gt;
 *     &lt;enumeration value="IC00"/&gt;
 *     &lt;enumeration value="IC50"/&gt;
 *     &lt;enumeration value="ID00"/&gt;
 *     &lt;enumeration value="ID50"/&gt;
 *     &lt;enumeration value="IF00"/&gt;
 *     &lt;enumeration value="IG20"/&gt;
 *     &lt;enumeration value="II00"/&gt;
 *     &lt;enumeration value="IU20"/&gt;
 *     &lt;enumeration value="IZ00"/&gt;
 *     &lt;enumeration value="JC"/&gt;
 *     &lt;enumeration value="JU"/&gt;
 *     &lt;enumeration value="MM"/&gt;
 *     &lt;enumeration value="MU"/&gt;
 *     &lt;enumeration value="NA"/&gt;
 *     &lt;enumeration value="ND"/&gt;
 *     &lt;enumeration value="NN"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="PC"/&gt;
 *     &lt;enumeration value="PO"/&gt;
 *     &lt;enumeration value="PR"/&gt;
 *     &lt;enumeration value="RA"/&gt;
 *     &lt;enumeration value="RD"/&gt;
 *     &lt;enumeration value="RG"/&gt;
 *     &lt;enumeration value="RR"/&gt;
 *     &lt;enumeration value="SD"/&gt;
 *     &lt;enumeration value="XX"/&gt;
 *     &lt;enumeration value="ZZ"/&gt;
 *     &lt;enumeration value="CI"/&gt;
 *     &lt;enumeration value="IC90"/&gt;
 *     &lt;enumeration value="IC75"/&gt;
 *     &lt;enumeration value="HC00"/&gt;
 *     &lt;enumeration value="ID90"/&gt;
 *     &lt;enumeration value="ID75"/&gt;
 *     &lt;enumeration value="II90"/&gt;
 *     &lt;enumeration value="II75"/&gt;
 *     &lt;enumeration value="HANDICAPPED"/&gt;
 *     &lt;enumeration value="ISLANDER"/&gt;
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
 *     &lt;enumeration value="HANDICAP"/&gt;
 *     &lt;enumeration value="RB"/&gt;
 *     &lt;enumeration value="ZPL"/&gt;
 *     &lt;enumeration value="HDH"/&gt;
 *     &lt;enumeration value="HDC"/&gt;
 *     &lt;enumeration value="HDL"/&gt;
 *     &lt;enumeration value="HDA"/&gt;
 *     &lt;enumeration value="HDJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GuestType")
@XmlEnum
public enum GuestType {

    ADULT("ADULT"),
    CHILD("CHILD"),
    INFANT("INFANT"),
    MILITARY("MILITARY"),
    SENIOR("SENIOR"),
    YOUTH("YOUTH"),
    CBBG("CBBG"),
    @XmlEnumValue("SROVR65")
    SROVR_65("SROVR65"),
    EXST("EXST"),
    CIP("CIP"),
    EMBASSY("EMBASSY"),
    BUSTRP("BUSTRP"),
    FAMEVNT("FAMEVNT"),
    AFFILIATES("AFFILIATES"),
    AFFCH("AFFCH"),
    CHJERES("CHJERES"),
    JEJURES("JEJURES"),
    MLTRYOTRS("MLTRYOTRS"),
    USAMIL("USAMIL"),
    PACCINDM("PACCINDM"),
    INDM("INDM"),
    PNMER("PNMER"),
    @XmlEnumValue("HNDPCH1TO4")
    HNDPCH_1_TO_4("HNDPCH1TO4"),
    @XmlEnumValue("HDCPADL5TO6")
    HDCPADL_5_TO_6("HDCPADL5TO6"),
    @XmlEnumValue("HDCPADL1TO4")
    HDCPADL_1_TO_4("HDCPADL1TO4"),
    MDISC("MDISC"),
    DEFOLIANTS("DEFOLIANTS"),
    STUDENT("STUDENT"),
    DDHDCRW("DDHDCRW"),
    @XmlEnumValue("YOUT11TO24")
    YOUT_11_TO_24("YOUT11TO24"),
    VACATION("VACATION"),
    VACATIONCH("VACATIONCH"),
    HNDCAPGUR("HNDCAPGUR"),
    HNDCPGUR("HNDCPGUR"),
    @XmlEnumValue("VACATIONCH50")
    VACATIONCH_50("VACATIONCH50"),
    EMABSSY("EMABSSY"),
    @XmlEnumValue("VACATION50")
    VACATION_50("VACATION50"),
    AFFILIATE("AFFILIATE"),
    AHHCH("AHHCH"),
    JEJURESCH("JEJURESCH"),
    @XmlEnumValue("HNDCPCH1TO4")
    HNDCPCH_1_TO_4("HNDCPCH1TO4"),
    @XmlEnumValue("DVNM1TO3")
    DVNM_1_TO_3("DVNM1TO3"),
    DVNM("DVNM"),
    @XmlEnumValue("YOU11TO24")
    YOU_11_TO_24("YOU11TO24"),
    ADT("ADT"),
    COB("COB"),
    CD("CD"),
    CE("CE"),
    CH("CH"),
    @XmlEnumValue("CG00")
    CG_00("CG00"),
    DG("DG"),
    DP("DP"),
    @XmlEnumValue("IB00")
    IB_00("IB00"),
    @XmlEnumValue("IC00")
    IC_00("IC00"),
    @XmlEnumValue("IC50")
    IC_50("IC50"),
    @XmlEnumValue("ID00")
    ID_00("ID00"),
    @XmlEnumValue("ID50")
    ID_50("ID50"),
    @XmlEnumValue("IF00")
    IF_00("IF00"),
    @XmlEnumValue("IG20")
    IG_20("IG20"),
    @XmlEnumValue("II00")
    II_00("II00"),
    @XmlEnumValue("IU20")
    IU_20("IU20"),
    @XmlEnumValue("IZ00")
    IZ_00("IZ00"),
    JC("JC"),
    JU("JU"),
    MM("MM"),
    MU("MU"),
    NA("NA"),
    ND("ND"),
    NN("NN"),
    PA("PA"),
    PC("PC"),
    PO("PO"),
    PR("PR"),
    RA("RA"),
    RD("RD"),
    RG("RG"),
    RR("RR"),
    SD("SD"),
    XX("XX"),
    ZZ("ZZ"),
    CI("CI"),
    @XmlEnumValue("IC90")
    IC_90("IC90"),
    @XmlEnumValue("IC75")
    IC_75("IC75"),
    @XmlEnumValue("HC00")
    HC_00("HC00"),
    @XmlEnumValue("ID90")
    ID_90("ID90"),
    @XmlEnumValue("ID75")
    ID_75("ID75"),
    @XmlEnumValue("II90")
    II_90("II90"),
    @XmlEnumValue("II75")
    II_75("II75"),
    HANDICAPPED("HANDICAPPED"),
    ISLANDER("ISLANDER"),
    ZED("ZED"),
    ZEA("ZEA"),
    ZEC("ZEC"),
    ZEI("ZEI"),
    ZSP("ZSP"),
    ZCS("ZCS"),
    ZSO("ZSO"),
    ZSS("ZSS"),
    ZCO("ZCO"),
    ZEP("ZEP"),
    ZPS("ZPS"),
    ZPM("ZPM"),
    ZES("ZES"),
    ZSA("ZSA"),
    ZMA("ZMA"),
    ZEF("ZEF"),
    ZPC("ZPC"),
    ZPA("ZPA"),
    ZWA("ZWA"),
    HANDICAP("HANDICAP"),
    RB("RB"),
    ZPL("ZPL"),
    HDH("HDH"),
    HDC("HDC"),
    HDL("HDL"),
    HDA("HDA"),
    HDJ("HDJ");
    private final String value;

    GuestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuestType fromValue(String v) {
        for (GuestType c: GuestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
