package com.lj.core.integration.soap.ibs;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ IbsChannel.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @since   : 2017. 10. 13. 오후 3:44:30 
 *  @version : 1.0
 *  @desc    : IBS 채널값 Finder
 */
public class IbsChannel {
	/**
	 * <pre>
	 * <B>lj.pss.support</B>
	 *     |_ IbsChannel.java
	 * </pre>
	 * 
	 *  @author  : jhbang
	 *  @since   : 2017. 10. 13. 오후 3:52:29 
	 *  @version : 1.0
	 *  @desc    : 국내선/국제선 유형
	 */
	public enum DomIntType {
		DOM,
		INT
	}

	public static String find(String accessChannelCode, DomIntType diType) {
		// TODO
		String	channelCode	= "CWD";

		return channelCode;
	}

	public static String find(String accessChannelCode) {
		return find(accessChannelCode, DomIntType.DOM);
	}
}
