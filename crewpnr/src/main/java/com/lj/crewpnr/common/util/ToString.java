package com.lj.crewpnr.common.util;

//import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * vo 로그용 ToString 클래스<br/>
 * 소속 attributes 를 라인별로 표시한다.
 * 
 * @since 2017.06.02
 * @author jhbang
 */
public class ToString {
	private static final int	SIZE_PER_ENCODE	= 3;

	public static String toString(Object obj) {
		if (null == obj) {
			return "null";
		} else {
			return ToStringBuilder.reflectionToString(obj, ToStringStyle.MULTI_LINE_STYLE);
		}
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
	public String toString(ToStringStyle stringStyle) {
		return ToStringBuilder.reflectionToString(this, stringStyle);
	}

	/**
	 * jhbang (2017. 11. 9. 오후 8:37:08)<br/>
	 * desc   :  오른쪽 채움 문자 데이터 생성
	 * 
	 * @param value
	 * @param length
	 * @param padStr
	 * @return
	 */
//	public static String getRightPadString(String value, int length, char padChar) {
//		if (0 >= length) {
//			length	= 1;
//		}
//
//		value	= getBytesSubstring(StringUtils.defaultIfEmpty(value, ""), length);
//
//		if (0 == padChar) {
//			padChar	= ' ';
//		}
//
//		int repeat	= length - getBytesLength(value);
//
//		return value.concat(padding(repeat, padChar));
//	}

	/**
	 * jhbang (2017. 11. 9. 오후 8:37:08)<br/>
	 * desc   :  왼쪽 채움 문자 데이터 생성
	 * 
	 * @param value
	 * @param length
	 * @param padStr
	 * @return
	 */
//	public static String getLeftPadString(String value, int length, char padChar) {
//		if (0 >= length) {
//			length	= 1;
//		}
//
//		value	= getBytesSubstring(StringUtils.defaultIfEmpty(value, ""), length);
//
//		if (0 == padChar) {
//			padChar	= ' ';
//		}
//
//		int repeat	= length - getBytesLength(value);
//
//		return padding(repeat, padChar).concat(value);
//	}

	/**
	 * jhbang (2017. 11. 15. 오전 9:10:05)<br/>
	 * desc   :  padding 문자열 생성
	 * 
	 * @param repeat
	 * @param padChar
	 * @return
	 */
	private static String padding(int repeat, char padChar) {
		if (repeat < 0) {
			return "";
		}

		final char[]	buf	= new char[repeat];

		for (int i = 0; i < buf.length; i++) {
			buf[i] = padChar;
		}

		return new String(buf);
	}

	/**
	 * jhbang (2017. 11. 15. 오전 8:42:17)<br/>
	 * desc   :  바이트 기준 문자열 Substring 처리
	 * 
	 * @param value
	 * @param length
	 * @return
	 */
//	private static String getBytesSubstring(String value, int length) {
//		if (StringUtils.isEmpty(value)) {
//			return value;
//		}
//
//		int	bytesLength	= 0;
//		int	retLength	= 0;
//
//		for (int i = 0; i < value.length(); i++) {
//			char	c	= value.charAt(i);
//
//			if (127 < c) {
//				if (length >= bytesLength + SIZE_PER_ENCODE) {
//					bytesLength	+= SIZE_PER_ENCODE;
//					retLength++;
//				}
//			} else {
//				bytesLength++;
//				retLength++;
//			}
//		}
//
//		return value.substring(0, retLength);
//	}

	/**
	 * jhbang (2017. 11. 15. 오전 9:13:48)<br/>
	 * desc   :  한글 2바이트로 산정한 바이트 크기
	 * 
	 * @param value
	 * @return
	 */
//	private static int getBytesLength(String value) {
//		if (StringUtils.isEmpty(value)) {
//			return 0;
//		}
//
//		int	retLength	= 0;
//
//		for (int i = 0; i < value.length(); i++) {
//			char	c	= value.charAt(i);
//
//			if (127 < c) {
//				retLength += 2;
//			} else {
//				retLength++;
//			}
//		}
//
//		return retLength;
//	}
}
