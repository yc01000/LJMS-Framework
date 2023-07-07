package com.lj.core.integration.rest;

import org.json.simple.JSONObject;

import com.lj.core.integration.vo.IdentificationVO;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ InterServiceInfluence.java
 * </pre>
 * 
 *  @author  : sryu
 *  @date    : 2017. 8. 3. 오전 10:25:04 
 *  @version : 1.0
 *  @desc    : ISCRM 전송간에 사용할 공통 Value Object
 */
public class InterServiceInfluence extends IdentificationVO{

//	private String InfluenceMessage = null;
	private String ResultCode = "";
	private String ResultString = "";
	private JSONObject ResultObject = null;

	private String Msg = "";
	
//	public String getInfluenceMessage() {
//		return InfluenceMessage;
//	}
//
//	public void setInfluenceMessage(String influenceMessage) {
//		InfluenceMessage = influenceMessage;
//	}

	public String getResultCode() {
		return ResultCode;
	}

	public void setResultCode(String resultCode) {
		ResultCode = resultCode;
	}

	public String getResultString() {
		return ResultString;
	}

	public void setResultString(String resultString) {
		ResultString = resultString;
	}

	public Object getResultObject() {
		return ResultObject;
	}

	public void setResultObject(JSONObject resultObject) {
		ResultObject = resultObject;
	}

	public String getMsg() {
		return Msg;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}
	
}
