package com.lj.core.commoncode.handler;

import com.lj.core.util.CodeConstants;
import com.lj.core.util.CodeConstants.RegionOption;
import com.lj.core.util.CodeConstants.YNCode;
import com.lj.core.commoncode.service.CmmCodeService;
import com.lj.core.commoncode.vo.RegionInfoVO;
import jakarta.annotation.PostConstruct;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ RegionHandler.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @date    : 2017. 8. 10. 오후 12:48:38 
 *  @version : 1.0
 *  @desc    : 지역 정보를 메모리에서 관리하기 위한 클래스
 */
@Component("RegionHandler")
public class RegionHandler {
	private static final	Logger	LOGGER	= LoggerFactory.getLogger(RegionHandler.class);

	@Autowired
	private CmmCodeService cmmCodeService;

//	@Resource(name = "MailHandler")
//	private MailHandler mailHandler;
	
	private List<RegionInfoVO> rgnList;

	private Map<String, RegionInfoVO>	rgnMap;

	/**
	 * jhbang (2017. 8. 10. 오후 9:02:53)<br/>
	 * desc   :  기본 생성자
	 * @param  
	 * @return void
	 */
	public RegionHandler() {
		
	}

	/**
	 * jhbang (2017. 8. 10. 오후 9:02:53)<br/>
	 * desc   :  WAS 로딩 시 Bean 초기화 작업
	 * @param  
	 * @return void
	 */
//	@Scheduled(fixedDelay = 1000 * 60 * 30)
//	public void init() {
//		if (LOGGER.isInfoEnabled()) {
//			LOGGER.info("[RegionHandler.init] Initializing Region Data");
//		}
//
//		this.setRegionMap();
//	}

	@PostConstruct
	public void init() {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("[RegionHandler.init] Initializing Code Data");
		}

		this.setRegionMap();
	}

	/**
	 * jhbang (2017. 8. 10. 오후 9:37:11)<br/>
	 * desc   :  List 형태의 지역 목록을 지역 코드 기준의 Map 형태로 전환
	 * @param  
	 * @return void
	 */
	private void setRegionMap() {
		try {
			this.rgnList	= this.getRegionListForInit();
		} catch (IllegalAccessException | InvocationTargetException e) {
			if (LOGGER.isErrorEnabled()) {
				LOGGER.error("[RegionHandler.setRegionMap] {}", e.getMessage());
			}
			//mailHandler.sendExceptionMail("[MessageHandler.setMessageMap]", e);
		}

		if (null == this.rgnList) {
			this.rgnMap	= null;
			return;
		}

		Map<String, RegionInfoVO>	rgnMap	= new HashMap<String, RegionInfoVO>();

		for (RegionInfoVO rgnInfo : this.rgnList) {
			rgnMap.put(rgnInfo.getRgnCd(), rgnInfo);
		}

		this.rgnMap	= rgnMap;
	}

	/**
	 * jhbang (2017. 8. 10. 오후 10:49:04)<br/>
	 * desc   :  전체 지역 목록을 정리하여, 지역 명을 다국어 Map으로 전환한다.
	 * @param  
	 * @return List<RegionInfoVO>
	 */
	private List<RegionInfoVO> getRegionListForInit() throws IllegalAccessException, InvocationTargetException {
		List<RegionInfoVO>	orgRegionList	= cmmCodeService.getRegionListForRegionHandler();

		if (CollectionUtils.isEmpty(orgRegionList)) {
			return null;
		}

		List<RegionInfoVO>	resultList	= new ArrayList<RegionInfoVO>();

		String	prevRgnCd	= "";

		RegionInfoVO		tmpRegionInfo	= null;
		Map<String, String>	rgnNmMap		= null;

		for (RegionInfoVO rgnInfo : orgRegionList) {
			String	rgnCd	= rgnInfo.getRgnCd();

			if (prevRgnCd.equals(rgnCd)) {
				if (StringUtils.isNotEmpty(rgnInfo.getLangCd())
						&& StringUtils.isNotEmpty(rgnInfo.getRgnNm())) {
					if (null == rgnNmMap) {
						rgnNmMap	= new HashMap<String, String>();
					}

					rgnNmMap.put(rgnInfo.getLangCd(), rgnInfo.getRgnNm());
				}
			} else {
				if (null != tmpRegionInfo) {
					tmpRegionInfo.setRgnNmMap(rgnNmMap);

					resultList.add(tmpRegionInfo); 
				}

				tmpRegionInfo	= new RegionInfoVO();
				rgnNmMap		= new HashMap<String, String>();

				BeanUtils.copyProperties(rgnInfo, tmpRegionInfo);

				if (StringUtils.isNotEmpty(rgnInfo.getLangCd())
						&& StringUtils.isNotEmpty(rgnInfo.getRgnNm())) {
					rgnNmMap.put(rgnInfo.getLangCd(), rgnInfo.getRgnNm());
				}
			}

			prevRgnCd	= rgnInfo.getRgnCd();
		}

		if (null != tmpRegionInfo) {
			tmpRegionInfo.setRgnNmMap(rgnNmMap);

			resultList.add(tmpRegionInfo); 
		}

		return resultList;
	}

	/**
	 * jhbang (2017. 8. 10. 오후 10:07:37)<br/>
	 * desc   :  특정 지역 정보를 조회한다.
	 * @param  rgnCd
	 * @return RegionInfoVO
	 */
	public RegionInfoVO getRegionInfo(String rgnCd) {
		if (StringUtils.isEmpty(rgnCd)) {
			return null;
		}

		if (null != this.rgnMap) {
			return this.rgnMap.get(rgnCd);
		}

		return null;
	}

	/**
	 * jhbang (2017. 9. 26. 오전 9:35:43)<br/>
	 * desc   :  지역 정보 목록을 조회한다.
	 * 
	 * @return
	 */
	public List<RegionInfoVO> getRegionList() {
		return this.rgnList;
	}

	/**
	 * jhbang (2017. 8. 10. 오후 10:10:08)<br/>
	 * desc   :  특정 조건에 따른 지역 정보 목록을 조회한다. (RegionOption Class 참조)
	 * @param  key
	 * @param  condition
	 * @return List<RegionInfoVO>
	 */
	public List<RegionInfoVO> getRegionListByCondition(String key, String condition) {
		List<RegionInfoVO>	resultList	= new ArrayList<RegionInfoVO>();

		if (CollectionUtils.isEmpty(this.rgnList)) {
			return null;
		}

		for (RegionInfoVO rgnInfo : this.rgnList) {
			if (RegionOption.OPRT_YN.equals(key)) {
				if (YNCode.YES.equals(condition) && YNCode.YES.equals(rgnInfo.getOprtYn())) {
					resultList.add(rgnInfo);
				} else if (YNCode.NO.equals(condition) && YNCode.NO.equals(rgnInfo.getOprtYn())) {
					resultList.add(rgnInfo);
				}
			} else if (RegionOption.MLT_CTY_YN.equals(key) && YNCode.YES.equals(rgnInfo.getUseYn())) {
				if (YNCode.YES.equals(condition)) {
					resultList.add(rgnInfo);
				} else if (YNCode.NO.equals(condition) && YNCode.NO.equals(rgnInfo.getUseYn())) {
					resultList.add(rgnInfo);
				}
			} else if (RegionOption.USE_YN.equals(key) && YNCode.YES.equals(rgnInfo.getUseYn())) {
				if (YNCode.YES.equals(condition)) {
					resultList.add(rgnInfo);
				} else if (YNCode.NO.equals(condition) && YNCode.NO.equals(rgnInfo.getUseYn())) {
					resultList.add(rgnInfo);
				}
			}
		}

		return CollectionUtils.isEmpty(resultList) ? null : resultList;
	}

	/**
	 * jhbang (2017. 8. 10. 오후 9:05:21)<br/>
	 * desc   :  지역 명 (기본언어 : KOR) 을 조회한다.
	 * @param rgnCd
	 * @param langCd
	 * @return String
	 */
	public String getRegionName(String rgnCd, String langCd) {
		if (StringUtils.isEmpty(rgnCd)) {
			return null;
		}

		if (StringUtils.isEmpty(langCd)) {
			langCd	= CodeConstants.DEFAULT_LANG_CD;
		}

		RegionInfoVO	rgnInfoVO	= null;

		if (null != this.rgnMap) {
			rgnInfoVO	= this.rgnMap.get(rgnCd);
		}

		return (null == rgnInfoVO) ? null : rgnInfoVO.getRgnNmMap().get(langCd);
	}
}
