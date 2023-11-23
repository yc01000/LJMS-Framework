package com.lj.sample.model;

import com.google.gson.Gson;
import com.lj.core.util.WebUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class ResultMapVO {

	private String error;

	private Object[] errorArguments;

	private Map<String, Object> resultMap = new HashMap<>();

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
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
			this.setError(other.getError());
			this.setErrorArguments(other.getErrorArguments());
		}

		resultMap.putAll(other.getAll());
	}

	public void remove(String key) {
		resultMap.remove(key);
	}

	public static ResultMapVO simpleError(ResultMapVO result) {
		if(result == null) {
			ResultMapVO newResult = new ResultMapVO();
			newResult.setError("SERVER_ERROR_OCCURRED");
			return newResult;
		}

		return simpleError(result.getError(), result.getErrorArguments());
	}

	public static ResultMapVO simpleError(String error, Object... errorArguments) {
		ResultMapVO resultMap = new ResultMapVO();
		resultMap.setError(error);
		resultMap.setErrorArguments(errorArguments);
		return resultMap;
	}

	public static ResultMapVO simpleResult(String key, Object value) {
		ResultMapVO resultMap = new ResultMapVO();
		resultMap.put(key, value);
		return resultMap;
	}

	public static boolean hasErrors(ResultMapVO result) {
		return result == null || StringUtils.isNotBlank(result.getError());
	}

	public static Map<String, Object> getResult(ResultMapVO result) {
		if(hasErrors(result)) {
			ResultMapVO newResult = simpleError(result);
			Map<String, Object> newMap = new HashMap<>();
			newMap.put("errorCode", newResult.getError());
			newMap.put("errorArguments", newResult.getErrorArguments());
			return newMap;
		}

		return result.getAll();
	}

	public static String toJson(ResultMapVO result) {
		if(StringUtils.isNotBlank(result.getError())) {
			Map<String, Object> obj = new HashMap<>();
			obj.put("error", result.getError());
			return new Gson().toJson(obj);
		}

		return WebUtils.toJson(result.getAll());
//		return new Gson().toJson(result.getAll());
	}
}
