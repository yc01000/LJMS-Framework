package com.lj.crewpnr.common;

import java.util.Date;

public class Constants {
	public static final Date SERVER_DATETIME =  new Date();
    public static final Boolean B2C = false;
    public static final Boolean B2T = true;

	public final static String IBS_AIRLINE_CODE	= "LJ";
	public final static String IBS_BOOKING_CHANNEL_CHANNEL_TYPE	= "API";
	public final static String IBS_BOOKING_CHANNEL_CHANNEL		= "Guest EN";
	public final static String IBS_BOOKING_CHANNEL_LOCALE		= "en_US";
	
	public final static String IBS_INVENTORY_CHANNEL_FILE_ID	= "LEG";
	public final static String IBS_INVENTORY_REQUEST_CODE		= "RTAREQ";
	public final static String IBS_INVENTORY_MENUAL_UPDATE		= "M";
	public final static String IBS_INVENTORY_AUTO_UPDATE		= "A";
	public final static String IBS_INVENTORY_CHANNEL            = "PWI";
	

	public final static class REG_CHANNEL_CODE {
		public final static String PCW	= "PCW";
		public final static String SVC	= "SVC";
		public final static String B2T	= "B2T";
	}

	public final static class CHANNEL_CODE {
		public final static String B2T_PC_WEB_DOM	= "TWD";
		public final static String B2T_PC_WEB_INTL	= "TWI";
	}

	public final static class OFFICE_ID {
		public final static String B2T_PC_WEB_DOM	= "SELJD";
		public final static String B2T_PC_WEB_INTL	= "SELJI";
	}

	public final static class AUTH_TYPE {
		public final static String PENALTY_WAIVER_AUTH	= "01";
		public final static String EB_WAIVER_AUTH		= "02";
		public final static String OTHER_WAIVER_AUTH	= "03";
		public final static String TOURCODE_AUTH		= "04";
		public final static String COUPON_AUTH			= "05";
		public final static String GS_WAIVER_AUTH		= "06";
		public final static String GS_MULTI_AUTH		= "07";
		public final static String FEE_OVERRIDE			= "08";
	}

	public final static class AUTH_COUPON_TYPE {
		public final static String AUTH_COUPON_GF	= "GF";
		public final static String AUTH_COUPON_AD	= "AD";
		public final static String AUTH_COUPON_JF	= "JF";
		public final static String AUTH_COUPON_GD	= "GD";
		public final static String AUTH_COUPON_MF	= "MF";
	}

	public final static class AUTH_GEN_CODE {
		public final static String PENALTY_WAIVER_AUTH	= "RP";
		public final static String EB_WAIVER_AUTH		= "EB";
		public final static String OTHER_WAIVER_AUTH	= "OT";
		public final static String TOURCODE_AUTH		= "TC";
		public final static String GS_WAIVER_AUTH		= "SP";
		public final static String AUTH_COUPON_GF		= "GF";
		public final static String AUTH_COUPON_AD		= "AD";
		public final static String AUTH_COUPON_JF		= "JF";
		public final static String AUTH_COUPON_GD		= "GD";
		public final static String AUTH_COUPON_MF		= "MF";
		public final static String FEE_OVERRIDE			= "FO";
	}

	public final static class PENALTY_WAIVER_TYPE {
		public final static String REFUND_WAIVER			= "01";
		public final static String REISSUE_WAIVER			= "02";
		public final static String NOSHOW_WAIVER			= "03";
		/*
		 *  2019.02.21 refund + n/s fee waiver 추가
		 */
		public final static String REFUND_NOSHOW_WAIVER		= "04";
	}

	public final static class OTHER_WAIVER_TYPE {
		public final static String PACKING_VINYL	= "01";
		public final static String JINI_PLUS_SEAT	= "02";
		public final static String PAID_PRE_SEAT	= "03";
		public final static String KIDS_MEAL		= "04";
		public final static String LOUNGE			= "05";
		public final static String MIN_TCP			= "06";
		public final static String ETC				= "07";
	}

	public final static class FEE_OVERRIDE_TYPE {
		public final static String UNUSED_TAX		= "01";
		public final static String NO_SHOW_FEE		= "02";
		public final static String REFUND_FEE		= "03";
	}

	public final static class AUTH_ISSU_COND_CODE {
		public final static String ISSU_BY_COND			= "01";
		public final static String ISSU_BY_PNR			= "02";
	}

	public final static class AUTH_STTS_CODE {
		public final static String AUTH_STTS_REQUEST    = "01";
		public final static String AUTH_STTS_ACCEPT  	= "02";
		public final static String AUTH_STTS_DENY		= "03";
		public final static String AUTH_STTS_ING		= "04";
		public final static String AUTH_STTS_CANCEL		= "05";
		public final static String AUTH_STTS_ISSUE		= "06";
	}

	public final static class AUTH_EXB_TYPE {
		public final static String EXB_KG	= "01";
		public final static String EXB_PC	= "02";
	}

	public final static class SSR_CODE {
		public final static String OTHS	= "OTHS";
		public final static String XBAG	= "XBAG";
	}

	public final static class PENALTY_WAIVER_SSR_CODE {
		public final static String REFUND_WAIVER			= "RF";
		public final static String REISSUE_WAIVER			= "RI";
		public final static String NOSHOW_WAIVER			= "NS";
		public final static String REFUND_NOSHOW_WAIVER		= "RFNS";
		public final static String FEE_OVERRIDE				= "FO";
	}

	public final static class OTHER_WAIVER_SSR_CODE {
		public final static String PACKING_VINYL	= "WRAP";
		public final static String JINI_PLUS_SEAT	= "UPGR";
		public final static String PAID_PRE_SEAT	= "SEAT";
		public final static String KIDS_MEAL		= "KDML";
		public final static String LOUNGE			= "LOUG";
		public final static String MIN_TCP			= "TCP";
		public final static String ETC				= "ETC";
	}

	public final static class EXB_TYPE_SSR_CODE {
		public final static String EXB_KG	= "KG";
		public final static String EXB_PC	= "PC";
	}

	public final static class DOM_INT_CTGR_CODE {
		public final static String DOMESTIC 		= "D";
		public final static String INTERNATIONAL 	= "I";
	}

	/**
	 * AUTH 발권 채널 구분
	 */
	public final static class AUTH_TKTG_CHNL_CODE {
		public final static String ALL 	= "01";
		public final static String B2T 	= "02";
		public final static String OTA 	= "03";
		public final static String BSP 	= "04";
		public final static String GSA 	= "05";
		public final static String PSA 	= "06";
	}

	/**
	 * MF 쿠폰 에러 코드
	 */
	public final static class MF_CPN_ERR_CODE {
		public final static String ERR_PARAM 		= "ERR_ACI_01";
		public final static String ERR_NOT_USE		= "ERR_ACI_02";
		public final static String ERR_INVALID_USER	= "ERR_ACI_03";
		public final static String ERR_ALREADY_REG 	= "ERR_ACI_04";
		public final static String ERR_ALREADY_USE 	= "ERR_ACI_05";
		public final static String ERR_INVALID_PRD 	= "ERR_ACI_06";
		public final static String ERR_DELETED		= "ERR_ACI_07";
		public final static String ERR_FAIL_ISSUE	= "ERR_ACI_08";
		public final static String ERR_NOT_FOUND	= "ERR_ACI_09";
	}

	/**
	 * TOURCODE CURRENCY = BASE FARE = FILING CURRENCY
	 */
	public final static class BASE_FARE_CURRENCY {
		public final static String KRW 	= "KRW";
		public final static String CNY	= "CNY";
		public final static String JPY	= "JPY";
		public final static String USD 	= "USD";
		public final static String AUD 	= "AUD";
		public final static String HKD 	= "HKD";
		public final static String MOP	= "MOP";
		public final static String TWD	= "TWD";
		public final static String MYR	= "MYR";
		public final static String THB	= "THB";
	}

	/**
	 * 영업지원 사이트 FARE OVERRIDE 시 POS
	 */
	public final static class FARE_OVERRIDE_POS {
		public final static String KR 	= "KR";
		public final static String CN	= "CN";
		public final static String JP	= "JP";
		public final static String US 	= "US";
		public final static String AU 	= "AU";
		public final static String HK 	= "HK";
		public final static String MO	= "MO";
		public final static String TW	= "TW";
		public final static String MY	= "MY";
		public final static String TH	= "TH";
	}

	/**
	 * 대리점 전체 선택 구분
	 */
	public final static class TL_AGY_SELECT_CODE {
		public final static String ALL 	= "01";
		public final static String B2T 	= "02";
		public final static String OTA 	= "03";
		public final static String BSP 	= "04";
		public final static String GSA 	= "05";
		public final static String PSA 	= "06";
	}

	/**
	 * PNR 유형
	 */
	public static final class PNR_TYPE {
		public static final String GROUP = "GROUP";
	}

	/**
	 * 업무 신청 > 요청 유형 코드 (AGT014)
	 */
	public static final class AGENCY_REQUEST_TYPE {

		public static final String MASTER_CODE = "AGT014";

		public static final String GROUP_SEATS = "01";

		public static final String ITIN_CHANGE = "02";

		public static final String PAX_INCREASE = "03";

		public static final String PNR_SPLIT = "04";

		public static final String PAX_CHANGE = "05";

		public static final String TL_CHANGE = "06";

		public static final String ADDON = "07";

		public static final String OTHER = "08";

		public static final String PNR_REPLACE = "09";

		public static final String OW_REFUND = "10";
	};

	/**
	 * 업무 신청 > 예약 상태 코드 (AGT015)
	 */
	public static final class RESERVATION_STATUS {

		public static final String REQUESTED = "01";

		public static final String CONFIRMED = "02";

		public static final String CANCELLED = "03";

		public static final String DENY = "04";

		public static final String REACOM = "05";

		public static final String WAS_CONFIRMED = "06";

		public static final String TIME_CHANGE_FROM_CONFIRMED = "07";

		public static final String INVALID_STATUS = "99";
	}

	/**
	 * 업무 신청 > 결제 상태 코드 (AGT016)
	 */
	public static final class PAYMENT_STATUS {

		public static final String TO_BE_PAID = "01";

		public static final String PAID = "02";

		public static final String REFUNDED = "03";
	}

	/**
	 * 업무 신청 > 요청 상태 코드 (AGT017)
	 */
	public static final class REQUEST_STATUS {

		public static final String REQUESTED = "01";

		public static final String APPROVED = "02";

		public static final String HELD = "03";

		public static final String DENIED = "04";

		public static final String CANCELLED = "05";
	}

	/**
	 * 메시지 리소스
	 */
	public static final class ERROR_CODE {

		public static final String SERVER_ERROR_OCCURRED = "cmm.msg.alert.error";

		public static final String NO_PARAMETERS = "agt.message.no.params";

		public static final String WRONG_ACCESS = "agt.message.wrong.access";
	}

	/** 탑승객 유형 코드 */
	public static final class PAX_TYPE {

		public static final String ADULT = "ADULT";

		public static final String CHILD = "CHILD";

		public static final String INFANT = "INFANT";
	}

	/** 탑승객 하위 유형 코드 */
	public static final class PAX_SUB_TYPE {

		public static final String DADT = "DADT";

		public static final String IADT = "IADT";

		public static final String DCHD = "DCHD";

		public static final String ICHD = "ICHD";

		public static final String INFANT = "INFANT";

		public static final String CG = "CG";
	}

	/** 성별 코드 */
	public static final class GENDER {

		public static final String MALE = "M";

		public static final String FEMALE = "F";
	}

	public static final class PNR_ACTION {

		public static final String ADD = "ADD";

		public static final String MODIFY = "MODIFY";
	}

	public static final class TIME_LIMIT {

		public static final String NTBA = "NTBA";

		public static final String ZERO_PAYMENT_GROUP = "ZERO PAYMENT-GROUP";

		public static final String PARTIAL_PAYMENT_GROUP = "PARTIAL PAYMENT-GROUP";
	}

	public static final class TIME_LIMIT_ACTION {

		public static final String CANCEL = "CANCEL";

		public static final String QUEUE = "QUEUE";
	}

    public static final String AIRLINE = "LJ";

    /**
     * @author HANYSW
     *
     */
    public final static class TRIP_TYPE {
        public final static String ROUND_TRIP   = "RT";
        public final static String ONW_WAY      = "OW";
        public final static String MULTI_CITY   = "MC";
    }

    public final static class DI_TYPE {
        public final static String DOMESTIC         = "D";
        public final static String INTERNATIONAL    = "I";
    }

    public static class RESULT_STATUS {
        public static final String SUCCESS = "S";
        public static final String FAILURE = "F";
    }

    public static class IBS_CHANNEL {
        public static final String CHANNEL_TYPE = "API";
        public static final String CHANNEL      = "PWC";
        public static final String LOCALE       = "en_US";
    }

    public static final class CMM_CTGR_CD {
        /**
         * 남여 구분코드
         */
        public static final String CMM009 = "CMM009";

        /**
         * 부가서비스 구분
         */
        public static final String HOM028   = "HOM028";
        /**
         * 부가서비스
         */
        public static final String HOM029   = "HOM029";

        /**
         * PNR Type
         */
        public static final String IBE006 = "IBE006";

        /**
         * PAX
         */
        public static final String IBE008   = "IBE008";

        /**
         * 단체승객 수요성격코드 - 국제선
         */
        public static final String IBE010 = "IBE010";

        /**
         * 단체승객 수요성격코드 - 국내선
         */
        public static final String IBE011 = "IBE011";

        /**
         * 예약 상태
         */
        public static final String IBE016 = "IBE016";

        /**
         * 결제상태
         */
        public static final String IBE021 = "IBE021";

    	/**
    	 * 구간 상태 정보
    	 */
    	public static final String IBE026 	= "IBE026";

    	/**
    	 * 할인 그룹 코드
    	 */
    	public static final String IBE029 	= "IBE029";

        /**
         * 할인 코드
         */
        public static final String IBE030   = "IBE030";

        /**
         * 체크인 상태 코드
         */
        public static final String IBE031   = "IBE031";

        /**
         * 단체 승객구분 코드
         */
        public static final String IBE032 = "IBE032";
        public static final String IBE023 	= "IBE023";
    }

    public static final class GUEST_PAX_TYPE {
        /**
         * 성인
         */
        public static final String ADULT    = "ADULT";
        /**
         * 소아
         */
        public static final String CHILD    = "CHILD";
        /**
         * 유아
         */
        public static final String INFANT   = "INFANT";
    }

    public static final class SSR_FARE_CODE {
    	public static final String BUNDLE 	= "BUNDLE";
    	public static final String SEAT 	= "SEAT";
    	public static final String BAGGAGE 	= "BAGGAGE";
    	public static final String MEALS 	= "MEALS";
    	public static final String SALE 	= "MERCHANDISE";
    	public static final String ENTER 	= "ENTERTAINMENT";
    	public static final String PETC 	= "PETC";
    	public static final String WCHR 	= "WCHR";
    	public static final String PRPR		= "PURCHASE PR TAG";
    }

    public static final class SSR_ATTRIBUTE {
    	public static final String WEIGHT 				= "WEIGHT";
    	public static final String UNITS 				= "UNITS [KG/LB]";
    	public static final String ANIMAL				= "ANIMALS";
    	public static final String WHEELCHAIR			= "WHEELCHAIR";
    	public static final String PIECES               = "PIECES";
    	public static final String PCS_CHECK_CODE 		= "0CC";
    	public static final String PC 					= "PC";
    }

    public static final class SSR_ICON_NAME {
    	public static final String SEAT 	= "seat";
    	public static final String BAGGAGE 	= "baggage";
    	public static final String MEAL 	= "meal";
    	public static final String SALE 	= "sale";
    	public static final String ENTER 	= "enter";
    }

    public static final class AIRCRAFT_TYPE {
        public static final String B737     = "b737";	// B737-800
        public static final String B739     = "b739";	// B737-900
        public static final String B777     = "b777";
        public static final String B738     = "b738";	// B737-8
    }

    public static final class CABIN_TYPE {
    	public static final String ECONOMY			= "ECONOMY";
    	public static final String PREMIUM_ECONOMY	= "PREMIUM ECONOMY";
    }

    /**
     * <pre>
     * <B>homepage</B>
     *    결재수단 종류 |_ Constants.java
     * </pre>
     *
     *  @author  : 한송희
     *  @date    : 2017. 10. 18. 오후 8:44:44
     *  @version : 1.0
     *  @desc    :
     */
    public final static class PAYMENT_METHOD_TYPE
    {

        public static final String AG               ="AG";          //대리점포인트
        public static final String ALIPAY           ="ALIPAY";      //알리페이
        public static final String CA               ="CA";          //현금
        public static final String CB               ="CB";          //편의점결제
        public static final String CC               ="CC";          //신용카드
        public static final String CI               ="CI";          //INVOICE
        public static final String CF               ="CF";          //쿠폰
        public static final String ET               ="ET";          //실시간계좌이체
        public static final String GC               ="GC";          //상품권
        public static final String JCB              ="JCB";         //JCB
        public static final String KAKAOPAY         ="KAKAOPAY";    //카카오페이
        public static final String NAVERPAY         ="NAVERPAY";    //네이버페이
        public static final String VA               ="VA";          //가상계좌
        public static final String WECHAT           ="WECHAT";      //위쳇페이

    }

    /**
     * <pre>
     * <B>homepage</B>
     *    결재화면에서 입력되는 결재 종류  |_ Constants.java
     * </pre>
     *
     *  @author  : 한송희
     *  @date    : 2017. 10. 18. 오후 9:16:14
     *  @version : 1.0
     *  @desc    :
     */
    public final static class PAYMENT_INPUT_TYPE
    {
    	public static final String CARD 				="card"; 			// 신용카드
    	public static final String INVOICE 				="invoice"; 		// INVOICE
    	public static final String IFG 					="ifg"; 			// IFG
    	public static final String ACCOUNT_TRANSFER 	="accountTransfer"; // 계좌이체
    	public static final String KAKAO				="kakao"; 			// 카카오페이
    	public static final String NAVERPAY				="naverPay"; 		// 네이버페이
    	public static final String CONVENIENCE_STORE 	="conv"; 			// 편의점 결제
    	public static final String ALI_PAY				="P003";			// ALIPAY
    	public static final String WECHAT_PAY			="P141";			// WECHAT PAY
    	public static final String VIRTUAL				="virtual";			// 가상계좌
    	public static final String VISA					="visa"; 			// visa
    	public static final String MASTER_CARD			="masterCard"; 		// master card
    	public static final String JCB_CARD				="jcb"; 			// jcb
    	public static final String AMEX_CARD			="amex"; 			// amex
    	public static final String AGENCY_CREDIT		="agencyCredit"; 	// agencyCredit

    }

    public final static class LANGAGE_TYPE
    {
        public static final String KOR  = "KOR"; // 한글
        public static final String ENG  = "ENG"; // 영문
    }

    /**
     * <pre>
     * <B>agent</B>
     *     |_ Constants.java
     * </pre>
     *
     *  @author  : 강성문
     *  @date    : 2017. 12. 15. 오후 8:02:55
     *  @version : 1.0
     *  @desc    : 단체 탑승객 구분
     */
    public static final class GROUP_GUEST_TYPE {
        public static final String ADULT = "ADULT"; // 성인
        public static final String CHILD = "CHILD"; // 소아
        public static final String INFANT = "INFANT"; // 유아
        public static final String INS = "INS"; // 좌석점유유아
    }

    /**
     * <pre>
     * <B>agent</B>
     *     |_ Constants.java
     * </pre>
     *
     *  @author  : 강성문
     *  @date    : 2018. 1. 8. 오후 1:27:05
     *  @version : 1.0
     *  @desc    : prefix를 제외한 GuestSubType
     */
    public static final class GROUP_GUEST_SUB_TYPE {
        public static final String ADT = "ADT"; // 성인
        public static final String CHD = "CHD"; // 소아
        public static final String INF = "INF"; // 유아
        public static final String INS = "INS"; // 좌석점유유아
        public static final String CG = "CG"; // 인솔자
    }

    /**
     * <pre>
     * <B>agent</B>
     *     |_ Constants.java
     * </pre>
     *
     *  @author  : 강성문
     *  @date    : 2017. 12. 15. 오후 8:15:31
     *  @version : 1.0
     *  @desc    : 단체 탑승객 구분명
     */
    public static final class GROUP_GUEST_TYPE_KOR {
        public static final String ADULT = "성인";
        public static final String CHILD = "소아";
        public static final String INFANT = "유아";
        public static final String READER = "인솔자";
    }

    /**
     * <pre>
     * <B>agent</B>
     *     |_ Constants.java
     * </pre>
     *
     *  @author  : 강성문
     *  @date    : 2017. 12. 15. 오후 8:15:31
     *  @version : 1.0
     *  @desc    : 남, 여 코드
     */
    public static final class GROUP_GENEOR {
        public static final String M = "M";
        public static final String F = "F";
    }

    /**
     * <pre>
     * <B>agent</B>
     *     |_ Constants.java
     * </pre>
     *
     *  @author  : 강성문
     *  @date    : 2017. 12. 15. 오후 8:15:31
     *  @version : 1.0
     *  @desc    : 남, 여 코드명
     */
    public static final class GROUP_GENDER_KOR {
        public static final String M = "남";
        public static final String F = "여";
    }

    /**
     * <pre>
     * <B>agent</B>
     *     |_ Constants.java
     * </pre>
     *
     *  @author  : 강성문
     *  @date    : 2017. 12. 27. 오후 3:17:49
     *  @version : 1.0
     *  @desc    : Retrieve PNR History Action
     */
    public static final class PNR_HISTORY_ACTION {
        public static final String CREATE = "CREATE";
        public static final String ADD = "ADD";
        public static final String MODIFY = "MODIFY";
        public static final String DELETE = "DELETE";
        public static final String INFO = "INFO";
    }

    public static final class PNR_HISTORY_TYPE {
        public static final String SEGMENT = "SEGMENT";
        public static final String GUEST = "GUEST";
        public static final String SEATS = "SEATS";
        public static final String PAYMENT = "PAYMENT";
    }

    public static final class TAX_CODE {
        public static final String YR = "YR"; // 유류할증료
    }

    public static class GENDER_TYPE {
        public static final String M = "M";
        public static final String F = "F";

        public static final String MS = "MS";
        public static final String MR = "MR";
        public static final String MISS = "MISS";
        public static final String MSTR = "MSTR";
    }

    /**
     * ※ 기존 소스 지우지 마시고, 새로운 코드는 하단에 추가하세요.
     */

    /**
     * <pre>
     * <B>homepage</B>
     *     |_ Constants.java
     * </pre>
     *
     *  @author  : 한송희
     *  @since   : 2018. 1. 2. 오후 7:38:34
     *  @version : 1.0
     *  @desc    : booking, mypage에서 사용 하는 session 키를 명명합니다.
     */
    public static final class IBE_SESSION
    {
    	/**
    	 * request session 담아줄 때 사용
    	 */
    	public static final String PNR_REQUEST_KEY = "IBE_CONFIRM_PRICE";
    	/**
    	 * response  session 담아줄 때 사용
    	 */
    	public static final String PNR_RESPONSE_KEY = "IBE_CONFIRM_PRICE_RS";
    	/**
    	 * Inventory Hold결과 PnrSessionID
    	 */
    	public static final String AVAIL_INVEN_KEY = "PNRSESSIONID";

    }

    /**
     * <pre>
     * <B>homepage</B>
     *     |_ Constants.java
     * </pre>
     *
     *  @author  : wonsg
     *  @since   : 2018. 1. 3. 오후 1:37:19
     *  @version : 1.0
     *  @desc    : [IBE] error 키명
     */
    public static final class IBE_ERROR {

    	public static final String ERROR_MSG = "ERROR_DETAIL";
    	public static final String IBE_SPECIFIC_ERROR	= "IBE_SPECIFIC_ERROR";
    }

    public final static class PAYMENT_DUMMY_DATA
    {
    	/**
    	 * 국내 카드, 해외카드 이외의 결제 수단에서 사용하는 카드 번호
    	 */
    	public static final String CARD_NUMBER_BASIC 	= "4444333322221111";

    	/**
    	 * 국내 카드 - BC 일 경우 사용하는 카드번호
    	 */
    	public static final String CARD_NUMBER_BC 		= "5610000000000000";
    	/**
    	 * 국내 카드 - BC 이외의 카드 일 경우 사용하는 카드 번호
    	 */
    	public static final String CARD_NUMBER_OTHER 	= "4111111111111111";

    	/**
    	 * 카드 만료 월 두자리
    	 */
    	public static final String CARD_EXPIRE_MONTH = "09";
    	/**
    	 * 카드 만료 연도 두자리
    	 */
    	public static final String CARD_EXPIRE_YEAR  = "99";
    	/**
    	 * 카드 만료 월 두자리 MPI 용
    	 */
    	public static final String CARD_EXPIRE_MONTH_MPI = "12";
    	/**
    	 * 카드 만료 연도 두자리 MPI 용
    	 */
    	public static final String CARD_EXPIRE_YEAR_MPI  = "79";
    	/**
    	 * 카드 만료 월 두자리 앱카드 용
    	 */
    	public static final String CARD_EXPIRE_MONTH_APP = "11";
    	/**
    	 * 카드 만료 연도 두자리 앱카드 용
    	 */
    	public static final String CARD_EXPIRE_YEAR_APP  = "89";

    	/**
    	 * 카드 CVV 번호
    	 */
    	public static final String CARD_CVV  = "123";

    	/**
    	 * 편의점 결제 사용 시 GuestPaymentInfo#PaymentStatus 매핑
    	 */
    	public static final String PAYMENT_STATUS = "PROCESSING";

    	/**
    	 * 편의점 결제 사용 시
    	 * GuestPaymentInfo#ConvenienceStoreCode
    	 */
    	public static final String CONVENIENCE_STORE_CODE = "D00000";

    	/**
    	 * 편의점 결제 사용 시
    	 * GuestPaymentInfo#ConvenienceStoreName
    	 */
    	public static final String CONVENIENCE_STORE_NAME = "DUMMY";
    	/**
    	 * 편의점 결제 사용 시
    	 * GuestPaymentInfo#ConvenienceStoreType
    	 */
    	public static final String CONVENIENCE_STORE_TYPE = "11";

    }
    /**
     * <pre>
     * <B>homepage</B>
     *     |_ Constants.java
     * </pre>
     *
     *  @author  : 박성한
     *  @since   : 2018. 1. 8. 오후 3:38:45
     *  @version : 1.0
     *  @desc    : 상세 페이지 버튼 특이 케이스
     */
    public static final class RETRIEVE_BUTTON_UNIQUE_CASE
    {
    	/**
    	 * 국제선의 경우 NO-SHOW + CONFIRMED 인 경우 NO-SHOW SEG만 재발행 가능(OPEN SEG는 비활성). 단, 일반 재발행과 마찬가지로 두번째 SEG 출발일보다 이후 날짜로의 선택은 제한
    	 */
    	public static final String CASE1 = "CASE1";

    	/**
    	 * 환불 시 전체 환불만 가능
    	 */
    	public static final String CASE2 = "CASE2";

    	/**
    	 * 기존 출발일 기준 조건 통합 NO SHOW + 60일 지나면 변경/환불 제한
    	 * (날짜 비교임으로 60일이 지났는지 여부는 스크립트단에서 실시간 체크로 진행)
    	 */
    	public static final String CASE3 = "CASE3";

    	/**
    	 * 일부 승객 변경/취소 시 FAM/FAMC 가 포함된 경우
    	 */
    	public static final String CASE4 = "CASE4";

    	/**
    	 * NO SHOW + FLOWN (역순 사용) 및  Amount Pending 값이 '0'이 아님 ToBePaid Amount 기준(잔금이 남은경우)
    	 * (팝업 메시지가 동일하여 같은 케이스로 묶음)
    	 */
    	public static final String CASE5 = "CASE5";

    	/**
    	 * TIME CHANGE FROM CONFIRMED (TK)  /  WAS CONFIRMED (WK)
    	 * TIME CHANGE (TC)  /  SCHEDULE CHANGE (SC)
    	 */
    	public static final String CASE6 = "CASE6";

    	/**
    	 * Amount Pending 값이 '0'이 아님 + FOP가 CO인 경우
    	 */
    	public static final String CASE7 = "CASE7";
    }

    /**
     * <pre>
     * <B>agent</B>
     *     |_ Constants.java
     * </pre>
     *
     *  @author  : 강성문
     *  @date    : 2018. 1. 19. 오전 9:04:48
     *  @version : 1.0
     *  @desc    : Time Limit Type
     */
    public static final class TIME_LIMIT_TYPE {
        public static final String ZERO_PAYMENT_GROUP = "ZERO PAYMENT-GROUP";
        public static final String ZERO_PAYMENT_NORMAL = "ZERO PAYMENT-NORMAL";
        public static final String PARTIAL_PAYMENT_NORMAL = "PARTIAL PAYMENT-NORMAL";
        public static final String PARTIAL_PAYMENT_GROUP = "PARTIAL PAYMENT-GROUP";
        public static final String NTBA = "NTBA";
    }

    /**
     * 정렬 순서 (어센딩, 디센딩)
     * <pre>
     * <B>agent</B>
     *     |_ Constants.java
     * </pre>
     *
     *  @author  : Ko Youngjun
     *  @date    : 2018. 1. 26. 오전 9:19:45
     *  @version : 1.0
     *  @desc    :
     */
    public static final class ORDER_TYPE {

    	public static final String ASCENDING = "A";

    	public static final String DESCENDING = "D";
    }

    public static final class AGENT_TYPE {

    	public static final String MASTER = "01";

    	public static final String ADMIN = "02";

    	public static final String NORMAL = "03";
    }

    public static final class SEASON_TYPE {

    	public static final String HIGH_SEASON = "01";

    	public static final String LOW_SEASON = "02";
    }

    public static final class IATA_SESSION{

    	public static final String PNR_NUM = "IFG_PNR_NUM";
    	public static final String AUTH_RQ = "IFG_AUTH_RQ";
    	public static final String AUTH_RS = "IFG_AUTH_RS";
    	public static final String ORDER_RQ = "IFG_ORDER_RQ";
    	public static final String ORDER_RS = "IFG_ORDER_RS";
    	public static final String ORDER_EXC_RQ = "IFG_ORDER_EXC_RQ";
    	public static final String ORDER_EXC_RS = "IFG_ORDER_EXC_RS";

    }

	public static final class IATA_REFUND_FLAG{
		public static final String PNR_CANCEL = "PNR_CANCEL";
		public static final String PNR_PARTIAL = "PNR_PARTIAL";
		public static final String PNR_INFD = "PNR_INFD";
		public static final String SSR = "SSR";
	}

	/**
	 * agent 가입 에러 코드
	 */
	public final static class AGT_ERR_CODE {
		public final static String ERR_CRET_AGT	= "ERR_AGT_01";
		public final static String ERR_RETR_AGT	= "ERR_AGT_02";
		public final static String ERR_MOD_AGT 	= "ERR_AGT_03";
	}

	public static final String	IS_FROM_B2C = "IS_FROM_B2C";

	public final static class AUTH_UPD_ITM {
		public final static String UPD_ITM_06	= "06"; //발급 AGT023 AUTH 상태코드
		public final static String UPD_ITM_07	= "07"; //삭제 AGT023 AUTH 상태코드
	}

	public static final class WAIVER_SESSION {
    	/**
    	 * IROP SSR FEE WAIVER ModifyBookingRQ
    	 */
    	public static final String MODIFY_REQUEST_KEY = "IBE_MODIFY_RQ";
    	/**
    	 * IROP SSR FEE WAIVER ModifyBookingRS
    	 */
    	public static final String MODIFY_RESPONSE_KEY = "IBE_MODIFY_RS";
    }
}