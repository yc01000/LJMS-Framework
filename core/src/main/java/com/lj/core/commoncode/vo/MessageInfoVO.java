package com.lj.core.commoncode.vo;

import com.lj.core.common.util.CodeConstants.YNCode;

import java.io.Serializable;
import java.util.Map;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ MessageInfoVO.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @since   : 2017. 9. 26. 오후 7:50:35 
 *  @version : 1.0
 *  @desc    : 공통 메시지 정보를 저장하는 vo 클래스
 */
public class MessageInfoVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1049848173906125576L;

	/**
	 * 메시지 코드
	 */
	private String	msgCd;

	/**
	 * 언어 코드
	 */
	private String	langCd;

	/**
	 * 사용 여부 (Y/N)
	 */
	private String	useYn		= YNCode.YES;

	/**
	 * 메시지 명
	 */
	private String	msgNm;

	/**
	 * 메시지 내용
	 */
	private String	msgCtn;

	/**
	 * 메시지 내용 Map<langCd, msgCtn>
	 */
	private Map<String, String>	msgCtnMap;

	public String getMsgCd() {
		return msgCd;
	}

	public void setMsgCd(String msgCd) {
		this.msgCd = msgCd;
	}

	public String getLangCd() {
		return langCd;
	}

	public void setLangCd(String langCd) {
		this.langCd = langCd;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public String getMsgNm() {
		return msgNm;
	}

	public void setMsgNm(String msgNm) {
		this.msgNm = msgNm;
	}

	public String getMsgCtn() {
		return msgCtn;
	}

	public void setMsgCtn(String msgCtn) {
		this.msgCtn = msgCtn;
	}

	public Map<String, String> getMsgCtnMap() {
		return msgCtnMap;
	}

	public void setMsgCtnMap(Map<String, String> msgCtnMap) {
		this.msgCtnMap = msgCtnMap;
	}
}
