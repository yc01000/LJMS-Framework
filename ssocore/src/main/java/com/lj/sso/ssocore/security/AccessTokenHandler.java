package com.lj.sso.ssocore.security;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lj.sso.ssocore.common.aws.SSOKmsMasterKeyService;
import com.lj.sso.ssocore.common.util.BinderUtils;
import com.lj.sso.ssocore.security.vo.UserTokenVO;

/**
 * 
 * <pre>
 * <B>lj.sso.support</B>
 *     |_ AccessTokenHandler.java
 * </pre>
 * 
 *  @author  : WCJUNG
 *  @date    : 2019. 3. 18. 오전 9:31:56 
 *  @version : 1.0
 *  @desc    : 시스템 간 전달할 사용자 토큰 암/복호화
 */
public class AccessTokenHandler {
	private static final Logger	LOGGER	= LoggerFactory.getLogger(AccessTokenHandler.class);

	/**
	 * 
	 * WCJUNG (2019. 3. 18. 오전 9:32:14)
	 * desc   : 로그인 사용자 객체로 유저 토큰 생성
	 * @param  
	 * @return String
	 */
	public static String encrypt(UserTokenVO obj) {
		String		json	= convertObject2JSON(obj);

		if (StringUtils.isEmpty(json)) {
			return null;
		}

		String	cipher	= SSOKmsMasterKeyService.encrypt(json);

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("LoginUserInfoVO [{}] to cipher [{}]", BinderUtils.chompString(obj), BinderUtils.chompString(cipher));
		}

		return cipher;
	}

	/**
	 * 
	 * WCJUNG (2019. 3. 18. 오전 9:32:38)
	 * desc   :  AccessToeknVo를 JSON 문자열로 변환한다.
	 * @param  
	 * @return String
	 */
	private static String convertObject2JSON(UserTokenVO obj) {
		if (null == obj) {
			return null;
		}

		ObjectMapper	mapper	= new ObjectMapper();
		String			jsonStr	= null;

		try {
			jsonStr	= mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			jsonStr	= null;
		}

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("LoginUserInfoVO [{}] to JSON [{}]", BinderUtils.chompString(obj), BinderUtils.chompString(jsonStr));
		}

		return jsonStr;
	}

	/**
	 * 
	 * WCJUNG (2019. 3. 18. 오전 9:33:23)
	 * desc   : 유저 토큰으로 사용자 객체 생성  
	 * @param  
	 * @return UserTokenVO
	 */
	public static UserTokenVO decrypt(String cipher) {
		if (StringUtils.isEmpty(cipher)) {
			return null;
		}

		String	jsonStr	= SSOKmsMasterKeyService.decrypt(cipher);

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("cipher [{}] to jsonStr [{}]", BinderUtils.chompString(cipher), BinderUtils.chompString(jsonStr));
		}

		return convertJSON2Object(jsonStr);
	}

	/**
	 * 
	 * WCJUNG (2019. 3. 18. 오전 9:33:51)
	 * desc   : JSON 문자열을 UserTokenVO로 변환한다.  
	 * @param  
	 * @return UserTokenVO
	 */
	private static UserTokenVO convertJSON2Object(String jsonStr) {
		if (StringUtils.isEmpty(jsonStr)) {
			return null;
		}

		ObjectMapper	mapper	= new ObjectMapper();
		UserTokenVO	obj		= null;

		try {
			obj = mapper.readValue(jsonStr, UserTokenVO.class);
		} catch (IOException e) {
			obj	= null;
		}

		/*
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("jsonStr [{}] to LoginUserInfoVO [{}]", BinderUtils.chompString(jsonStr), BinderUtils.chompString(obj));
		}
		*/

		return obj;
	}
}
