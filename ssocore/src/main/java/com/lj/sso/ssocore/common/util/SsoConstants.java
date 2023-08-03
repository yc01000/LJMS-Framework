package com.lj.sso.ssocore.common.util;

/**
 * 
 * <pre>
 * <B>ssoAuth</B>
 *     |_ CodeConstants.java
 * </pre>
 * 
 *  @author  : WCJUNG
 *  @date    : 2019. 2. 13. 오후 1:14:17 
 *  @version : 1.0
 *  @desc    : 코드 상수
 */
public class SsoConstants {
	public static final String	ACCESS_CHANNEL_SESSION	= "accessChannelSession";

	public static final String	AUTH_USER_SESSION	= "authUserSession";
	
	public static final String	AUTH_MEMBER_SESSION	= "authMemberSession";

	public static final String	AUTH_AGENT_SESSION	= "authAgentSession";

	public static final String	AUTH_NONMEBER_SESSION	= "authNonMemberSession";

	public static final String	OAUTH_USER_SESSION	= "oAuthUserSession";
	
	public static final String	OUATH_REFERER = "oAuthReferer";
	
	public static final String	OAUTH_RETURN_URL = "oAuthReturnUrl";
	
	public static final String	USER_TOKEN			= "userToken";
	
	public static final String	USER_ACCESS_TOKEN	= "userAccessToken";

	public static final String	USER_SECURITY_SESSION	= "userSecuritySession";
		
	public static final String	SPRING_SECURITY_CONTEXT	= "SPRING_SECURITY_CONTEXT";
	
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
}
