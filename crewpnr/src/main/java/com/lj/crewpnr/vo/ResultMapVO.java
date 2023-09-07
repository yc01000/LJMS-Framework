package com.lj.crewpnr.vo;

import com.lj.crewpnr.common.Constants.ERROR_CODE;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class ResultMapVO {

	private String errorCode;

	private Object[] errorArguments;

	private Map<String, Object> resultMap = new HashMap<>();

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Object[] getErrorArguments() {
		return errorArguments;
	}

	public void setErrorArguments(Object[] errorArguments) {
		this.errorArguments = errorArguments;
	}

	@SuppressWarnings("unchecked")
	public <T> T get(String key, Class<T> type) {
		if(StringUtils.isEmpty(key)) {
			return null;
		}
		if(type == null) {
			return null;
		}

		Object object = resultMap.get(key);
		if(object == null) {
			return null;
		}
		if(!type.isInstance(object)) {
			return null;
		}

		return (T) object;
	}

	public Map<String, Object> getAll() {
		return resultMap;
	}

	public void put(String key, Object value) {
		resultMap.put(key, value);
	}

	public void put(ResultMapVO other) {
		if(other == null) {
			return;
		}

		if(ResultMapVO.hasErrors(other)) {
			this.setErrorCode(other.getErrorCode());
			this.setErrorArguments(other.getErrorArguments());
		}

		resultMap.putAll(other.getAll());
	}

	public void remove(String key) {
		resultMap.remove(key);
	}

	public static ResultMapVO simpleErrorCode(ResultMapVO result) {
		if(result == null) {
			ResultMapVO newResult = new ResultMapVO();
			newResult.setErrorCode(ERROR_CODE.SERVER_ERROR_OCCURRED);
			return newResult;
		}

		return simpleErrorCode(result.getErrorCode(), result.getErrorArguments());
	}

	public static ResultMapVO simpleErrorCode(String errorCode, Object... errorArguments) {
		ResultMapVO resultMap = new ResultMapVO();
		resultMap.setErrorCode(errorCode);
		resultMap.setErrorArguments(errorArguments);
		return resultMap;
	}

	public static ResultMapVO simpleResult(String key, Object value) {
		ResultMapVO resultMap = new ResultMapVO();
		resultMap.put(key, value);
		return resultMap;
	}

	public static boolean hasErrors(ResultMapVO result) {
		return result == null || StringUtils.isNotBlank(result.getErrorCode());
	}

	public static Map<String, Object> getResult(ResultMapVO result) {
		if(hasErrors(result)) {
			ResultMapVO newResult = simpleErrorCode(result);
			Map<String, Object> newMap = new HashMap<>();
			newMap.put("errorCode", newResult.getErrorCode());
			newMap.put("errorArguments", newResult.getErrorArguments());
			return newMap;
		}

		return result.getAll();
	}
}