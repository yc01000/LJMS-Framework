package com.lj.core.util;

import com.lj.core.util.CodeConstants.BrowserType;
import com.lj.core.util.CodeConstants.OSType;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ BinderUtils.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @since   : 2017. 11. 1. 오후 4:40:44 
 *  @version : 1.0
 *  @desc    : WebData Binding 처리용 Util 클래스
 */
public class BinderUtils {
	private static final Logger	LOGGER	= LoggerFactory.getLogger(BinderUtils.class);

	private static final String	NEW_LINE	= StringUtils.CR + StringUtils.LF;

	/**
	 * jhbang (2017. 11. 1. 오후 4:41:08)<br/>
	 * desc   :  클래스 배열에서 필드 목록을 구한다.
	 * 
	 * @param classes
	 * @return
	 */
	public static String[] getFieldNames(Class<?>... classes) {
		return getFieldNames(null, classes);
	}

	/**
	 * jhbang (2017. 12. 21. 오전 11:38:49)<br/>
	 * desc   :  사용자 지정 필드 목록 + 클래스 배열에서 필드 목록을 구한다.
	 * 
	 * @param fieldList
	 * @param classes
	 * @return
	 */
	public static String[] getFieldNames(List<String> fieldList, Class<?>... classes) {
		List<String>	names	= new ArrayList<String>();

		if (CollectionUtils.isNotEmpty(fieldList)) {
			for (String field : fieldList) {
				if (StringUtils.isEmpty(field)) {
					continue;
				}

				if (!names.contains(field)) {
					names.add(field);
				}
			}
		}

		if ((null != classes) && (0 < classes.length)) {
			for (int i = 0; i < classes.length; i++) {
				Field[]		fields	= classes[i].getDeclaredFields();

				if ((null == fields) || (0 == fields.length)) {
					continue;
				}

				for (int j = 0; j < fields.length; j++) {
					if ((0 != (Modifier.FINAL & fields[j].getModifiers())) || (0 != (Modifier.STATIC & fields[j].getModifiers()))) {
						continue;
					}

					if (!names.contains(fields[j].getName())) {
						names.add(fields[j].getName());
					}
				}

				if (null != classes[i].getSuperclass()) {
					String[]	superFields	= getFieldNames(classes[i].getSuperclass());
	
					if ((null != superFields) && (0 < superFields.length)) {
						for (int k = 0; k < superFields.length; k++) {
							if (!names.contains(superFields[k])) {
								names.add(superFields[k]);
							}
						}
					}
				}
			}
		}

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("[Field List = {}]", names);
		}

		if (CollectionUtils.isEmpty(names)) {
			return null;
		}

		return names.toArray(new String[names.size()]);
	}

	/**
	 * jhbang (2017. 11. 1. 오후 5:38:36)<br/>
	 * desc   :  문자열에서 CR(\r), LF(\n) 문자를 제거한다.
	 * 
	 * @param text
	 * @return
	 */
	public static String chompString(String text) {
		if (StringUtils.isEmpty(text)) {
			return text;
		}

		text	= text.trim();

		if (StringUtils.isEmpty(text)) {
			return text;
		}

		text	= text.replace(NEW_LINE, "");
		text	= text.replace(StringUtils.CR, "");
		text	= text.replace(StringUtils.LF, "");

		return text;
	}

	/**
	 * jhbang (2017. 11. 1. 오후 5:55:33)<br/>
	 * desc   :  객체 출력 문자열에서 CR(\r), LF(\n) 문자를 제거한다.
	 * 
	 * @param obj
	 * @return
	 */
	public static String chompString(Object obj) {
		if (null == obj) {
			return null;
		}

		return chompString(obj.toString());
	}

	/**
	 * jhbang (2017. 12. 4. 오후 2:49:07)<br/>
	 * desc   :  파일명에 대한 경로 순회 필터링 처리
	 * 
	 * @param fileName
	 * @return
	 */
	public static String fileNamePathFilter(String fileName) {
		if (StringUtils.isEmpty(fileName)) {
			return "";
		}

		fileName	= fileName.trim();

		if (StringUtils.isEmpty(fileName)) {
			return "";
		}

		fileName	= fileName.replaceAll("/", "");
		fileName	= fileName.replaceAll("\\\\", "");
		fileName	= fileName.replaceAll("\\.\\.", "");
		fileName	= fileName.replaceAll("&", "");

		return fileName;
	}

	/**
	 * jhbang (2018. 1. 10. 오전 9:41:49)<br/>
	 * desc   :  브라우저별 파일 다운로드명 인코딩
	 * 
	 * @param fileName
	 * @param browser
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String getEncodedFilename(String fileName, String browser) throws UnsupportedEncodingException {
		String	encFileName	= "";

		if (StringUtils.isEmpty(fileName)) {
			return encFileName;
		}

		if (BrowserType.MSIE.equals(browser)) {
			encFileName	= URLEncoder.encode(fileName, "UTF-8").replaceAll("\\+", "%20");
		} else if (BrowserType.CHROME.equals(browser)) {
			StringBuffer	sb	= new StringBuffer(1024);

			for (int i = 0; i < fileName.length(); i++) {
				char	c	= fileName.charAt(i);

				if ('~' < c) {
					sb.append(URLEncoder.encode("" + c, "UTF-8"));
				} else {
					sb.append(c);
				}
			}

			encFileName	= sb.toString();
		} else if (BrowserType.FIREFOX.equals(browser)) {
			encFileName	= new String(fileName.getBytes("UTF-8"), "ISO-8859-1");

			if (!OSType.WINDOWS.equals(getOSType())) {
				encFileName	= new String(fileName.getBytes(), "ISO-8859-1");
			}
		} else if (BrowserType.SAFARI.equals(browser)) {
			encFileName	= new String(fileName.getBytes("UTF-8"), "ISO-8859-1");
		} else {
			encFileName	= new String(fileName.getBytes("UTF-8"), "ISO-8859-1");
		}

		return encFileName;
	}

	/**
	 * jhbang (2018. 1. 10. 오전 10:16:01)<br/>
	 * desc   :  브라우저 유형 조회
	 * 
	 * @param request
	 * @return
	 */
	public static String getBrowserType(HttpServletRequest request) {
		String	browserType	= "";

		if (null == request) {
			return browserType;
		}

		String	userAgent	= StringUtils.defaultIfEmpty(request.getHeader("User-Agent"), "");

		if (userAgent.contains("MSIE") || userAgent.contains("Trident")) {
			browserType	= BrowserType.MSIE;
		} else if (userAgent.contains("Chrome")) {
			browserType	= BrowserType.CHROME;
		} else if (userAgent.contains("Firefox")) {
			browserType	= BrowserType.FIREFOX;
		} else if (userAgent.contains("Opera")) {
			browserType	= BrowserType.OPERA;
		} else {
			browserType	= BrowserType.SAFARI;
		}

		return browserType;
	}

	/**
	 * jhbang (2018. 2. 5. 오후 7:22:17)<br/>
	 * desc   :  OS 유형 조회
	 * 
	 * @return
	 */
	public static String getOSType() {
		String	osType	= "";
		String	os		= StringUtils.defaultIfEmpty(System.getProperty("os.name"), "").toLowerCase(Locale.ENGLISH);

		if (-1 < os.indexOf("win")) {
			osType	= OSType.WINDOWS;
		} else if (-1 < os.indexOf("mac")) {
			osType	= OSType.MAC;
		} else if ((-1 < os.indexOf("nix")) || (-1 < os.indexOf("nux")) || (-1 < os.indexOf("aix"))) {
			osType	= OSType.UNIX;
		} else if (-1 < os.indexOf("sunos")) {
			osType	= OSType.SOLARIS;
		} else {
			osType	= OSType.UNKNOWN;
		}

		return osType;
	}

	/**
	 * jhbang (2018. 2. 12. 오전 10:57:58)<br/>
	 * desc   : URL 쿼리 스트링을 파라미터 맵으로 변환
	 * 
	 * @param queryString
	 * @return
	 */
	public static Map<String, String> parseQueryStringSingle(String queryString) {
		if (StringUtils.isEmpty(queryString)) {
			return null;
		}

		Map<String, String>	paramMap	= new HashMap<String, String>();

		String[]	params	= queryString.split("&");

		if ((null != params) && (0 < params.length)) {
			for (String param : params) {
				String[]	keyValue	= StringUtils.splitPreserveAllTokens(param, "=");

				if (null != keyValue) {
					if (StringUtils.isNotEmpty(keyValue[0])) {
						if (1 < keyValue.length) {
							paramMap.put(keyValue[0], keyValue[1]);
						} else {
							paramMap.put(keyValue[0], null);
						}
					}
				}
			}
		}

		return paramMap;
	}
}
