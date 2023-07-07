package com.lj.core.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WebUtils {

	// an object -> query string (key0=value0&key1=value1...)
	public static String toQueryString(Object object, String... excepts) {
		Map<String, Object> map = extract(object, excepts);
		if(map == null) {
			return "";
		}

		StringBuilder builder = new StringBuilder(512);
		for(Entry<String, Object> e: map.entrySet()) {
			Object value = e.getValue();
			if(value == null) {
				continue;
			} else if(value instanceof String) {
				if(StringUtils.isBlank((String) value)) {
					continue;
				}

				try {
					value = clearXSS((URLEncoder.encode((String) value, "utf-8")));
				} catch (UnsupportedEncodingException e1) {
					continue;
				}
			}

			if(builder.length() > 0) {
				builder.append('&');
			}

			builder.append(clearXSS(e.getKey())).append('=').append(value);
		}

		if(builder.length() == 0) {
			return "";
		}

		return builder.toString();
	}

	// an object -> json string
	public static String toJson(Object object, String... excepts) {
		Map<String, Object> map = extract(object, excepts);
		if(map == null) {
			return null;
		}

		return new Gson().toJson(map, Map.class);
	}

	public static String toJson(Object object, boolean pretty, String... excepts) {
		Map<String, Object> map = extract(object, excepts);
		if(map == null) {
			return null;
		}

		Gson gson = null;
		if(pretty) {
			gson = new GsonBuilder().setPrettyPrinting().create();
		} else {
			gson = new Gson();
		}

		return gson.toJson(map, Map.class);
	}

	public static String toEncodedJson(Object object, String... excepts) {
		String encoded = null;
		try {
			String json = toJson(object, excepts);
			if(StringUtils.isBlank(json)) {
				return "{}";
			}

			encoded = URLEncoder.encode(json, "utf-8");

			/** Java-JavaScript 간 Uri encode 차이 극복 */
			if(StringUtils.isNotBlank(encoded)) {
				encoded = StringUtils.replace(encoded, "+", "%20");
			}
		} catch (UnsupportedEncodingException e) {
			encoded = "{}";
		}
		return encoded;
	}

	/**
	 * an object -> hashed map (ignore null)
	 * Ko Youngjun (2017. 11. 8. 오전 10:49:31)
	 * desc   :
	 * @param
	 * @return Map<String,Object>
	 */
	@SuppressWarnings("unchecked")
	private static Map<String, Object> extract(Object object, String... excepts) {
		if(object == null) {
			return null;
		}

		List<String> expendExcepts = new ArrayList<>();
		if(excepts != null) {
			Collections.addAll(expendExcepts, excepts);
		}
		if(object instanceof List) {
			Map<String, Object> wrapper = new HashMap<>();
			wrapper.put("list", object);
			object = wrapper;
		}

		expendExcepts.add("siteClass");

		Map<String, Object> map = new ObjectMapper().convertValue(object, Map.class);
		for(String except: expendExcepts) {
			map.remove(except);
		}

		if(MapUtils.isEmpty(map)) {
			return null;
		}

		Map<String, Object> xssClearedMap = new HashMap<>();
		for(String key: map.keySet()) {
			Object value = map.get(key);
			if(value instanceof String) {
				value = clearXSS((String) value);
			} else if(value instanceof List) {
				for(Object o: (List<Object>) value) {
					if(o instanceof String) {
						o = clearXSS((String) o);
					}
				}
			}
			xssClearedMap.put(WebUtils.clearXSS(key), value);
		}

		return xssClearedMap;
	}

	public static String clearXSS(String value) {
		if(StringUtils.isBlank(value)) {
			return "";
		}

		return value
				.replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;")
				.replaceAll("\"", "&#34;")
				.replaceAll("\'", "&#39;")
				.replaceAll("&", "&amp;");
	}

	/**
	 * Object Xss 보안
	 * jcwon (2020. 11. 2. 오전 10:49:31)
	 * desc   :
	 * @param
	 * @return Object
	 */
	@SuppressWarnings("unchecked")
	public static Object clearXssVO(Object clas) {

		List<Object> newList = new ArrayList<Object>();
		Map<String,Object> newMap = new HashMap<String,Object>();
		Map<String,Object> newMap2 = new HashMap<String,Object>();
		Object newObj = null;
		Object listObj = null;

		try {

			for(Field field : clas.getClass().getDeclaredFields()){
				//2021.5.3 보안 취약점 점검 Access Specifier Manipulation 수정  
				//field.setAccessible(true);
				
				AccessibleObject.setAccessible(new AccessibleObject[] {field}, true);

				Type type = null;
				type = field.getType();

				if(List.class == type){
					List<Object> voList = (List<Object>) field.get(clas);

					if(CollectionUtils.isNotEmpty(voList)){
						for(Object obj : voList){

							for(Field field2 : obj.getClass().getDeclaredFields()) {

								//field2.setAccessible(true);
								AccessibleObject.setAccessible(new AccessibleObject[] {field2}, true);

								String name = field2.getName();
								Object value = field2.get(obj);

								Type type2 = null;
								type2 = field2.getType();
								if(String.class == type2){
									if(ObjectUtils.isEmpty(value)) newMap2.put(clearXSS(name), null);
									else newMap2.put(clearXSS(name), clearXSS((String)value));

								}else{

									if(ObjectUtils.isEmpty(value)) newMap2.put(clearXSS(name), null);
									else newMap2.put(clearXSS(name), value);

								}
							}

							listObj = convertMapToObject(newMap2, obj);
							newList.add(listObj);
						}
					}
					if(newList.size() > 0){
						newMap.put(clearXSS(field.getName()), newList);
					}else{
						newMap.put(clearXSS(field.getName()), null);
					}

				}else{
					String name = field.getName();
					Object value = field.get(clas);

					if(String.class == type){
						if(ObjectUtils.isEmpty(value)) newMap.put(clearXSS(name), null);
						else newMap.put(clearXSS(name), clearXSS((String)value));
					}else{
						if(ObjectUtils.isEmpty(value)) newMap.put(clearXSS(name), null);
						else newMap.put(clearXSS(name), value);
					}
				}
			}

			newObj = convertMapToObject(newMap, clas);
		} catch(IllegalAccessException e) {
//			LoggerUtils.errorIfEnabled(WebUtils.class, "IllegalAccessException WebUtils.clearXssVO=", e);
		} catch(IllegalArgumentException e) {
//			LoggerUtils.errorIfEnabled(WebUtils.class, "IllegalArgumentException WebUtils.clearXssVO=", e);
		}

		return newObj;
	}

	/**
	* Map을 Vo로 변환
	* @param map
	* @param obj
	* @return
	*/
	public static Object convertMapToObject(Map<String,Object> map,Object obj){
//		String keyAttribute = null;
		final String SETTER_PREFIX = "set";
//		String methodString = null;
		Iterator<String> itr = map.keySet().iterator();

		while(itr.hasNext()) {
			String keyAttribute = (String) itr.next();
			String methodString = SETTER_PREFIX + keyAttribute.substring(0,1).toUpperCase() + keyAttribute.substring(1);

			try {
				Method[] methods = obj.getClass().getDeclaredMethods();

				for(int i=0;i<methods.length;i++){
					if(methodString.equals(methods[i].getName())){
						methods[i].invoke(obj, map.get(keyAttribute));
					}
				}
			} catch (SecurityException e) {
//				LoggerUtils.errorIfEnabled(WebUtils.class, "SecurityException WebUtils.convertMapToObject=", e);
			} catch(IllegalAccessException e) {
//				LoggerUtils.errorIfEnabled(WebUtils.class, "IllegalAccessException WebUtils.convertMapToObject=", e);
			} catch(IllegalArgumentException e) {
//				LoggerUtils.errorIfEnabled(WebUtils.class, "IllegalArgumentException WebUtils.convertMapToObject=", e);
			} catch(InvocationTargetException e) {
//				LoggerUtils.errorIfEnabled(WebUtils.class, "InvocationTargetException WebUtils.convertMapToObject=", e);
			}
		}
		return obj;
	}

	public static String post(String uri, String body, String authorization) {
		/** 1. 로거 초기화 */
		Logger logger = LoggerFactory.getLogger(WebUtils.class);

		HttpURLConnection conn = null;
		DataOutputStream wr = null;
		BufferedReader br = null;
		InputStream es = null;
		InputStream is = null;
		try {
			if(StringUtils.isEmpty(uri) || StringUtils.isEmpty("POST")) {
				throw new RuntimeException("necessary parameters is null");
			}

			URL url = new URL(uri);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("User-Agent", "application/x-www-form-urlencoded");
			conn.setUseCaches(false);
			conn.setDoInput(true);

			if (StringUtils.isNotEmpty(body)) {
				conn.setDoOutput(true);
				conn.setRequestProperty("Content-Length", Integer.toString(body.getBytes().length));
				wr = new DataOutputStream (conn.getOutputStream());
				wr.writeBytes(body);
				wr.close();
			}

			StringBuilder sb = new StringBuilder(1024);
			es = conn.getErrorStream();
			String resultString = "";
			if (es != null) {
				br = new BufferedReader(new InputStreamReader(es));
				int i;
				char c;
				while (true) {
					i = br.read();
					if (-1 == i) {
						break;
					}
					c = (char)i;
					if(c != '\r' && c != '\n'){
						sb.append(c);
					}
				}
				resultString = sb.toString();
//				if (logger.isDebugEnabled()) {
//					logger.debug(BinderUtils.chompString(resultString));
//				}
				br.close();
				es.close();
			} else {
				is = conn.getInputStream();
				br = new BufferedReader(new InputStreamReader(is));
				int i;
				char c;
				while (true) {
					i = br.read();
					if (-1 == i) {
						break;
					}
					c = (char)i;
					if(c != '\r' && c != '\n'){
						sb.append(c);
					}
				}
				resultString = sb.toString();
//				if (logger.isDebugEnabled()) {
//					logger.debug(BinderUtils.chompString(resultString));
//				}
				br.close();
				is.close();
			}

			return resultString;
		} catch (UnsupportedEncodingException e) {
//			if (logger.isErrorEnabled()) {
//				logger.error(BinderUtils.chompString(e.getMessage()));
//			}

//			throw new RuntimeException("UnsupportedEncodingException exception : " + BinderUtils.chompString(e.getMessage()));
		} catch (IOException e) {
//			if (logger.isErrorEnabled()) {
//				logger.error(BinderUtils.chompString(e.getMessage()));
//			}

//			throw new RuntimeException("IOException exception : " + BinderUtils.chompString(e.getMessage()));
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
			IOUtils.closeQuietly(es);
			IOUtils.closeQuietly(is);
			IOUtils.closeQuietly(wr);
			IOUtils.closeQuietly(br);
		}
		return uri;
	}

	public static String post(String uri, String body, Map<String, String> headers) {
		/** 1. 로거 초기화 */
		Logger logger = LoggerFactory.getLogger(WebUtils.class);

		if(headers == null) {
			headers = new HashMap<>();
		}

		HttpURLConnection conn = null;
		DataOutputStream outputstream = null;
		BufferedReader reader = null;
		InputStream errorstream = null;
		InputStream inputstream = null;
		try {
			if(StringUtils.isEmpty(uri) || StringUtils.isEmpty("POST")) {
				throw new RuntimeException("necessary parameters is null");
			}

			URL url = new URL(uri);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setUseCaches(false);
			conn.setDoInput(true);

			if(headers != null) {
				for(String headerName: headers.keySet()) {
					if(StringUtils.equalsIgnoreCase(headerName, "authorization")) {
						conn.setDoOutput(true);
					}
					String headerValue = headers.get(headerName);
//					conn.setRequestProperty(BinderUtils.chompString(headerName), BinderUtils.chompString(headerValue));
				}
			}

			int contentLength = StringUtils.defaultIfEmpty(body, "").getBytes("utf-8").length;
			conn.setRequestProperty("Content-Length", Integer.toString(contentLength));

			if(StringUtils.isNotBlank(body)) {
				conn.setDoOutput(true);
				outputstream = new DataOutputStream (conn.getOutputStream());
				outputstream.writeBytes(body);
				outputstream.close();
			}

			inputstream = conn.getInputStream();
			if(inputstream == null) {
				return null;
			}

			StringBuilder builder = new StringBuilder(1024);
			reader = new BufferedReader(new InputStreamReader(inputstream));
			int i;
			while(true) {
				i = reader.read();
				if(-1 == i) {
					break;
				}

				char c = (char) i;
				if(c != '\r' && c != '\n') {
					builder.append(c);
				}
			}
			reader.close();
			inputstream.close();

			return builder.toString();
		} catch(IOException e) {
//			if(logger.isErrorEnabled()) {
//				logger.error(BinderUtils.chompString(e.getMessage()));
//			}

			errorstream = conn.getErrorStream();
			if(errorstream == null) {
				return null;
			}

			try {
				StringBuilder builder = new StringBuilder(1024);
				reader = new BufferedReader(new InputStreamReader(errorstream));
				int i;
				while(true) {
					i = reader.read();
					if (-1 == i) {
						break;
					}

					char c = (char) i;
					if(c != '\r' && c != '\n'){
						builder.append(c);
					}
				}
				reader.close();
				errorstream.close();

				return builder.toString();
			} catch(IOException e1) {
//				if(logger.isErrorEnabled()) {
//					logger.error(BinderUtils.chompString(e.getMessage()));
//				}
			}

			return null;
		} finally {
			if(conn != null) {
				conn.disconnect();
			}
			IOUtils.closeQuietly(errorstream);
			IOUtils.closeQuietly(inputstream);
			IOUtils.closeQuietly(outputstream);
			IOUtils.closeQuietly(reader);
		}
	}

	public static String get(String uri) {
		return get(uri, null);
	}

	public static String get(String uri, Map<String, String> headers) {
		return httpRequest("GET", uri, headers, null);
	}

	private static String httpRequest(String method, String uri, Map<String, String> headers, String body) {
		if(StringUtils.isBlank(method)) {
			return null;
		}
		if(StringUtils.isBlank(uri)) {
			return null;
		}

		/** 1. 로거 초기화 */
		Logger logger = LoggerFactory.getLogger(WebUtils.class);

		if(headers == null) {
			headers = new HashMap<>();
		}
		headers.put("User-Agent", "application/x-www-form-urlencoded");

		HttpURLConnection conn = null;
		DataOutputStream out = null;
		BufferedReader reader = null;
		try {
			URL url = new URL(uri);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod(method);
			conn.setUseCaches(false);
			conn.setDoInput(true);

			if(headers != null) {
				for(String headerName: headers.keySet()) {
					String headerValue = headers.get(headerName);
//					conn.setRequestProperty(BinderUtils.chompString(headerName), BinderUtils.chompString(headerValue));
				}
			}

			if(StringUtils.isNotBlank(body)) {
				conn.setRequestProperty("Content-Length", Integer.toString(body.getBytes().length));
				conn.setDoOutput(true);

				out = new DataOutputStream(conn.getOutputStream());
				out.writeBytes(body);
				out.close();
			}

			InputStream in = conn.getErrorStream();
			if(in == null) {
				in = conn.getInputStream();
			}

			StringBuilder builder = new StringBuilder(1024);
			reader = new BufferedReader(new InputStreamReader(in));
			int i;
			while(true) {
				i = reader.read();
				if(i == -1) {
					break;
				}

				char c = (char) i;
				if(c == '\r' || c == '\n') {
					continue;
				}

				builder.append(c);
			}

			return builder.toString();
		} catch(UnsupportedEncodingException e) {
//			if(logger.isErrorEnabled()) {
//				logger.error(BinderUtils.chompString(e.getMessage()));
//			}
//
//			throw new RuntimeException("UnsupportedEncodingException exception : " + BinderUtils.chompString(e.getMessage()));
		} catch(IOException e) {
//			if(logger.isErrorEnabled()) {
//				logger.error(BinderUtils.chompString(e.getMessage()));
//			}
//
//			throw new RuntimeException("IOException exception : " + BinderUtils.chompString(e.getMessage()));
		} finally {
			if(conn != null) {
				conn.disconnect();
			}

			IOUtils.closeQuietly(out);
			IOUtils.closeQuietly(reader);
		}
		return null;
	}
}
