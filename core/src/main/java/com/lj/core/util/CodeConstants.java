package com.lj.core.util;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ CodeConstants.java
 * </pre>
 *
 *  @author  : jhbang
 *  @since   : 2017. 6. 7. 오전 10:12:58
 *  @version : 1.0
 *  @desc    : 코드 상수
 */
public class CodeConstants {

	public static final String	CD_MST_언어구분		= "CMM001";

	public static final String	CD_MST_채널구분		= "CMM002";

	public static final String	CD_MST_시스템구분	= "CMM003";

	public static final String	DEFAULT_LANG_CD		= "KOR";

	public static final String	BCRYPT_INDEX		= "$2a$10$";

	public static final String	SITE_KEY			= "site.key";

	public static final String	SYSTEM_INFO			= "authSystemInfo";

	public static final String	AUTH_USER_SESSION	= "authUserSession";

	public static final String	AUTH_MEMBER_SESSION	= "authMemberSession";

	public static final String	AUTH_AGENT_SESSION	= "authAgentSession";

	public static final String	MENU_GRANT_SESSION	= "menuGrantSession";

	public static final String	USER_TOKEN			= "userToken";

	public static final String	USER_SECURITY_SESSION	= "userSecuritySession";

	public static final String	FILE_ALLOWED_TYPE	= "fileAllowedTypes";

	public static final String	FILE_ALLOWED_SIZE	= "fileAllowedSize";

	public static final String[]	SHORT_MONTH		= {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

	public static final String	ACCESS_CHANNEL_SESSION	= "accessChannelSession";

	public static final int		CHECKIN_SEQ			= -1;

	/** 비즈니스 로직에서 캡차 검증용 세션 */
	public static final String	ACCESS_CAPTCHA_YN	= "ACCESS_CAPTCHA_YN";

	/** 리캡차용 세션 (비즈니스 로직에서 캡차 검증 X) */
	public static final String	ACCESS_RECAPTCHA_YN	= "ACCESS_RECAPTCHA_YN";

	/** 봇디텍트용 세션 (비즈니스 로직에서 캡차 검증 X) */
	public static final String	ACCESS_BOTDETECT_YN	= "ACCESS_BOTDETECT_YN";

	public static final String	SPRING_SECURITY_CONTEXT	= "SPRING_SECURITY_CONTEXT";

	public static final String	USER_ACCESS_TOKEN	= "userAccessToken";

	public static final String	OAUTH_USER_SESSION	= "oAuthUserSession";

	public static final String	ACCESS_CHANNELTYPE_SESSION	= "accessChanneltypeSession";

	public static final String	INDIVIDUAL_LOGIN_GUESTID = "individualLoginGuestId";

	public static final String	INDIVIDUAL_LOGIN_INFO = "individualLoginInfo";

	public static final String	REWARD_BANK_NO = "rewardBankNo";

	/**
	 * <pre>
	 * <B>lj.pss.support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @date    : 2017. 8. 29. 오후 2:44:07
	 *  @version : 1.0
	 *  @desc    : 사이트 키 상수
	 */
	public static final class SiteKey {

		public static final String	FRONT_OFFICE	= "F";

		public static final String	BACK_OFFICE		= "B";

		public static final String	MOBILE_OFFICE	= "M";

		public static final String	ALL_OFFICE		= "A";
	}

	/**
	 * <pre>
	 * <B>lj.pss.support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @since   : 2017. 6. 12. 오전 10:16:09
	 *  @version : 1.0
	 *  @desc    : YES/NO 코드
	 */
	public static final class YNCode {

		public static final String	YES	= "Y";

		public static final String	NO	= "N";
	}

	/**
	 * <pre>
	 * <B>lj.pss.support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @since   : 2017. 8. 9. 오전 10:16:28
	 *  @version : 1.0
	 *  @desc    : 처리 결과 코드
	 */
	public static final class ResultCode {

		public static final String	SUCCESS	= "S";

		public static final String	FAIL	= "F";

		public static final String	ERROR	= "E";

		public static final String	EXIST	= "X";

		public static final String	INVALID	= "I";

		public static final String	VALID	= "V";
	}

	/**
	 * <pre>
	 * <B>lj.pss.support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @date    : 2017. 8. 30. 오전 10:22:04 
	 *  @version : 1.0
	 *  @desc    : 접속 채널 코드
	 */
	public static final class AccessChannelCode {

		public static final String	PC_WEB		= "PCW";

		public static final String	MOBILE_WEB	= "MOW";

		public static final String	MOBILE_APP	= "MOA";

		public static final String	SERVICE		= "SVC";

		public static final String	API			= "API";

		public static final String	B2T			= "B2T";

		public static final String	BACKOFFICE	= "BCK";

		public static final String	PC_WEB_CHECKIN		= "PCWC";

		public static final String	MOBILE_WEB_CHECKIN	= "MOWC";

		public static final String	MOBILE_APP_CHECKIN	= "MOAC";

		public static final String CALL_CENTER = "CCS";
	}

	/**
	 * <pre>
	 * <B>lj.pss.support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @since   : 2017. 8. 22. 오전 10:16:38 
	 *  @version : 1.0
	 *  @desc    : 지역 조회 조건
	 */
	public static final class CodeOption {

		public static final String	USE_YN		= "useYn";
	}

	/**
	 * <pre>
	 * <B>lj.pss.support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @since   : 2017. 8. 10. 오전 10:16:38 
	 *  @version : 1.0
	 *  @desc    : 지역 조회 조건
	 */
	public static final class RegionOption {

		public static final String	OPRT_YN		= "oprtYn";

		public static final String	MLT_CTY_YN	= "mltCtyYn";

		public static final String	USE_YN		= "useYn";
	}

	/**
	 * <pre>
	 * <B>lj.pss.support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @since   : 2017. 8. 9. 오전 10:16:38 
	 *  @version : 1.0
	 *  @desc    : 국가 조회 조건
	 */
	public static final class CountryOption {

		public static final String	OPRT_YN		= "oprtYn";

		public static final String	USE_YN		= "useYn";

		public static final String	GATE_LANG_YN = "gateLangYn";

		public static final String	SORT_NAME	= "ctrNm";

		public static final String	SORT_CODE	= "ctrCd";

		public static final String	SORT_ASC	= "asc";

		public static final String	SORT_DESC	= "desc";
	}

	/**
	 * <pre>
	 * <B>lj.pss.support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @since   : 2017. 8. 10. 오전 10:16:38 
	 *  @version : 1.0
	 *  @desc    : 도시/공항 조회 조건
	 */
	public static final class CityAirportOption {

		public static final String	DRCT_FLT_YN	= "drctFltyn";

		public static final String	MLT_CTY_YN	= "mltCtyYn";

		public static final String	USE_YN		= "useYn";
	}

	/**
	 * <pre>
	 * <B>lj.pss.support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @since   : 2017. 9. 26. 오후 8:27:53 
	 *  @version : 1.0
	 *  @desc    : 공통 메시지 조회 조건
	 */
	public static final class MessageOption {

		public static final String	USE_YN	= "useYn";
	}

	/**
	 * <pre>
	 * <B>lj.pss.support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @date    : 2017. 8. 10. 오후 2:12:16 
	 *  @version : 1.0
	 *  @desc    : 쿠키 변수 명
	 */
	public static final class CookieName {

		public static final String	BO_LANG_CD			= "boLangCd";

		public static final String	BO_LANG				= "boLang";

		public static final String	BO_LANG_COUNTRY		= "boLangCountry";

		public static final String	FO_LANG_CD			= "foLangCd";

		public static final String	FO_LANG				= "foLang";

		public static final String	FO_LANG_COUNTRY		= "foLangCountry";

		public static final String	FO_COUNTRY			= "foCountry";

		public static final String	FO_POP				= "foPop";

		public static final String	AGT_LANG_CD			= "agtLangCd";

		public static final String	AGT_LANG			= "agtLang";

		public static final String	AGT_LANG_COUNTRY	= "agtLangCountry";

		public static final String	AGT_CURRENCY		= "agtCurrency";
	}

	/**
	 * <pre>
	 * <B>lj.pss.support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @date    : 2017. 8. 21. 오후 8:40:25 
	 *  @version : 1.0
	 *  @desc    : 사이트 구분
	 */
	public static final class SiteClass {

		public static final String	FO	= "FO";

		public static final String	BO	= "BO";

		public static final String	AGT	= "AGT";
	}

	/**
	 * <pre>
	 * <B>lj.pss.support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @date    : 2017. 8. 22. 오전 11:48:24 
	 *  @version : 1.0
	 *  @desc    : 개인 정보 유형
	 */
	public static final class PersonalInfoType {

		public static final int	DATE_OF_BIRTH	= 1;

		public static final int	PHONE			= 2;

		public static final int	EMAIL			= 3;
	}

	/**
	 * <pre>
	 * <B>lj.pss.support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @since   : 2017. 9. 15. 오후 3:32:01 
	 *  @version : 1.0
	 *  @desc    : 파일 허용 유형 조회 키
	 */
	public static final class FileAllowedType {

		public static final String	KEY_ALL		= "file.upload.ext.all";

		public static final String	KEY_DOC		= "file.upload.ext.doc";

		public static final String	KEY_IMAGE	= "file.upload.ext.image";

		public static final String	KEY_VIDEO	= "file.upload.ext.video";

		public static final String	KEY_AUDIO	= "file.upload.ext.audio";

		public static final String	KEY_ZIP		= "file.upload.ext.zip";
	}

	/**
	 * <pre>
	 * <B>support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @since   : 2018. 2. 1. 오후 1:37:57 
	 *  @version : 1.0
	 *  @desc    : 파일 저장 유형
	 */
	public static final class FileStorageType {

		public static final String	LOCAL	= "local";

		public static final String	CLOUD	= "cloud";
	}

	public static final class IbeConstants {

		public static final String		IBE_UID					= "IBE_UID";
		public static final String 		ROUNDING_CURRENCY_YN 	= "roundingCurrencyYN";
		public static final String[] 	ROUNDING_CURRENCY 		= new String[] { "AUD", "MYR", "USD" };
	}

	/**
	 * <pre>
	 * <B>support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @since   : 2018. 1. 10. 오전 9:39:51 
	 *  @version : 1.0
	 *  @desc    : 브라우저 유형
	 */
	public static final class BrowserType {

		public static final String	MSIE	= "MSIE";

		public static final String	CHROME	= "Chrome";

		public static final String	FIREFOX	= "Firefox";

		public static final String	OPERA	= "Opera";

		public static final String	SAFARI	= "Safari";
	}

	/**
	 * <pre>
	 * <B>support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @since   : 2018. 2. 5. 오후 7:18:52 
	 *  @version : 1.0
	 *  @desc    : OS 유형
	 */
	public static final class OSType {

		public static final String	WINDOWS	= "Windows";

		public static final String	MAC		= "Mac";

		public static final String	UNIX	= "Unix";

		public static final String	SOLARIS	= "Solaris";

		public static final String	UNKNOWN	= "Unknown";
	}

	/**
	 * <pre>
	 * <B>support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @since   : 2018. 2. 1. 오후 1:38:41 
	 *  @version : 1.0
	 *  @desc    : 로그인 유형
	 */
	public static final class LoginType {

		public static final String	MEMBER	= "member";

		public static final String	BOOKING	= "booking";

		public static final String	CHECKIN	= "checkin";
	}

	/**
	 * <pre>
	 * <B>support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @since   : 2018. 2. 5. 오전 8:17:38 
	 *  @version : 1.0
	 *  @desc    : 나비포인트 처리 유형
	 */
	public static final class NabiPointUseType {

		public static final String	PRODUCTION	= "PRD";

		public static final String	USE			= "USE";

		public static final String	EXTINCTION	= "EXT";

		public static final String	REFUND		= "RFD";
	}

	/**
	 * <pre>
	 * <B>support</B>
	 *     |_ CodeConstants.java
	 * </pre>
	 *
	 *  @author  : jhbang
	 *  @since   : 2018. 3. 17. 오후 5:14:14 
	 *  @version : 1.0
	 *  @desc    : 배치 시작 방법 유형
	 */
	public static final class StartMethodType {

		public static final String	AUTO_BATCH		= "A";

		public static final String	MANUAL_BATCH	= "M";
	}

	/**
	 * 사용중인 서버의 spring active profile을 확인합니다.
	 * @author wcjung
	 *
	 */
	public static final class ActiveProfileType {
		public static final String NONE		= "NONE";

		public static final String LOCAL 	= "LOCAL";
		public static final String DEV		= "DEV";
		public static final String STG		= "STG";
		public static final String PRD		= "PRD";
		public static final String WEB		= "WEB";
	}

	public static final class LOGIN_TYP_CD {
		public static final String MASTER_CODE = "HOM059";

		public static final String MEMBER = "01";

		public static final String HOME_NON_MEMBER = "02";

		public static final String CS_CENTER = "03";

		public static final String AGENCY = "04";

		public static final String EASY_MYPAGE = "05";

		public static final String EASY_CHECKIN = "06";

		public static final String SNS_MEMBER = "07";

		public static final String AUTO_LOGIN = "08";

		public static final String EXTERNAL_MEMBER = "09";

		public static final String EXTERNAL_SNS_MEMBER = "10";

		public static final String KE_LOGIN = "11";
	}
}
