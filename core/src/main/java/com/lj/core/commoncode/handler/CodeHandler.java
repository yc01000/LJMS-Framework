package com.lj.core.commoncode.handler;

import com.lj.core.commoncode.service.CmmCodeService;
import com.lj.core.commoncode.vo.CodeInfoVO;
import com.lj.core.commoncode.vo.HolidayVO;
//import com.lj.support.common.mail.MailHandler;
import com.lj.core.util.CodeConstants;
import com.lj.core.util.CodeConstants.CodeOption;
import com.lj.core.util.CodeConstants.YNCode;
//import org.apache.commons.beanutils.BeanUtils;
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
import java.util.stream.Collectors;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ CodeHandler.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @date    : 2017. 7. 27. 오전 11:17:25 
 *  @version : 1.0
 *  @desc    : 공통 코드를 메모리에서 관리하기 위한 클래스
 */
@Component("CodeHandler")
public class CodeHandler {
	private static final	Logger	LOGGER	= LoggerFactory.getLogger(CodeHandler.class);

	@Autowired
	private CmmCodeService	cmmCodeService;

	private List<CodeInfoVO>	codeList;

	private Map<String, List<CodeInfoVO>>	codeMap;
	
	private List<HolidayVO>	holidayList;

//	@Resource(name = "MailHandler")
//	private MailHandler mailHandler;
	
	/**
	 * jhbang (2017. 7. 27. 오전 9:02:53)<br/>
	 * desc   :  기본 생성자
	 * @param  
	 * @return void
	 */
	public CodeHandler() {
		
	}

	/**
	 * jhbang (2017. 7. 27. 오전 9:02:53)<br/>
	 * desc   :  WAS 로딩 시 Bean 초기화 작업
	 * @param  
	 * @return void
	 */
//	@Scheduled(fixedDelay = 1000 * 60 * 30)
	@PostConstruct
	public void init() {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("[CodeHandler.init] Initializing Code Data");
		}

		this.setCodeMap();
		this.setHolidayMap();
	}

	/**
	 * jhbang (2017. 7. 27. 오전 9:03:29)<br/>
	 * desc   :  List 형태의 코드 목록을 마스터 코드 기준의 Map 형태로 전환
	 * @param  
	 * @return void
	 */
	private void setCodeMap() {
		try {
			this.codeList	= this.getCodeList();
		} catch (IllegalAccessException | InvocationTargetException e) {
			if (LOGGER.isErrorEnabled()) {
				LOGGER.error("[CodeHandler.setCodeMap] {}", e.getMessage());
			}
//			mailHandler.sendExceptionMail("[CodeHandler.setCodeMap]", e);
		}

		if (null == this.codeList) {
			this.codeMap	= null;
			return;
		}

		Map<String, List<CodeInfoVO>>	codeMap	= new HashMap<String, List<CodeInfoVO>>();

		String	prevCtgrCd	= "";
		for (CodeInfoVO codeInfo : this.codeList) {
			String	ctgrCd	= codeInfo.getCtgrCd();

			if (!prevCtgrCd.equals(ctgrCd)) {
				List<CodeInfoVO>	tmpCodeList	= new ArrayList<CodeInfoVO>();

				tmpCodeList.add(codeInfo);

				codeMap.put(ctgrCd, tmpCodeList);
			} else {
				List<CodeInfoVO>	tmpCodeList	= codeMap.get(ctgrCd);

				tmpCodeList.add(codeInfo);

				codeMap.put(ctgrCd, tmpCodeList);
			}

			prevCtgrCd	= ctgrCd;
		}

		this.codeMap	= codeMap;
	}
	
	/**
	 * @param  
	 * @return void
	 */
	private void setHolidayMap() {
		holidayList	= cmmCodeService.getHolidaytForCodeHandler();

		if (null == this.holidayList) {
			this.holidayList	= null;
			return;
		}
	}

	/**
	 * jhbang (2017. 7. 27. 오전 9:03:47)<br>
	 * desc   :  전체 코드 목록을 정리하여, 상세 코드 명을 다국어 Map으로 전환한다.
	 * @param  
	 * @return List<CodeInfoVO>
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	private List<CodeInfoVO> getCodeList() throws IllegalAccessException, InvocationTargetException {
		List<CodeInfoVO>	orgCodeList	= cmmCodeService.getCodeListForCodeHandler();

		if (CollectionUtils.isEmpty(orgCodeList)) {
			return null;
		}

		List<CodeInfoVO>	resultList	= new ArrayList<CodeInfoVO>();

		String	prevCtgrCd	= "";
		String	prevDtlCd	= "";

		CodeInfoVO			tmpCodeInfo	= null;
		Map<String, String> dtlCdNmMap	= null;

		for (CodeInfoVO codeInfo : orgCodeList) {
			String	ctgrCd	= codeInfo.getCtgrCd();
			String	dtlCd	= codeInfo.getDtlCd();

			if (prevCtgrCd.equals(ctgrCd) && prevDtlCd.equals(dtlCd)) {
				if (StringUtils.isNotEmpty(codeInfo.getLangCd())
						&& StringUtils.isNotEmpty(codeInfo.getDtlCdNm())) {
					if (null == dtlCdNmMap) {
						dtlCdNmMap	= new HashMap<String, String>();
					}

					dtlCdNmMap.put(codeInfo.getLangCd(), codeInfo.getDtlCdNm());
				}
			} else {
				if (null != tmpCodeInfo) {
					tmpCodeInfo.setDtlCdNmMap(dtlCdNmMap);
					resultList.add(tmpCodeInfo);
				}

				tmpCodeInfo	= new CodeInfoVO();
				dtlCdNmMap	= new HashMap<String, String>();

				BeanUtils.copyProperties(codeInfo, tmpCodeInfo);

				if (StringUtils.isNotEmpty(tmpCodeInfo.getLangCd())
						&& StringUtils.isNotEmpty(tmpCodeInfo.getDtlCdNm())) {
					dtlCdNmMap.put(tmpCodeInfo.getLangCd(), tmpCodeInfo.getDtlCdNm());
				}
			}

			prevCtgrCd	= ctgrCd;
			prevDtlCd	= dtlCd;
		}

		if (null != tmpCodeInfo) {
			tmpCodeInfo.setDtlCdNmMap(dtlCdNmMap);
			resultList.add(tmpCodeInfo);
		}

		return resultList;
	}

	/**
	 * jhbang (2017. 7. 28. 오전 9:04:18)<br/>
	 * desc   :  상세 코드 목록을 조회한다.
	 * @param  ctgrCd
	 * @return List<CodeInfoVO>
	 */
	public List<CodeInfoVO> getCodeDetailList(String ctgrCd) {
		if (StringUtils.isEmpty(ctgrCd)) {
			return null;
		}

		List<CodeInfoVO>	resultList	= null;

		if (null != this.codeMap) {
			resultList	= this.codeMap.get(ctgrCd);
		}

		return resultList;
	}

	public List<CodeInfoVO> getCodeDetailListByCondition(String ctgrCd, String key, String condition) {
		List<CodeInfoVO>	resultList	= new ArrayList<CodeInfoVO>();

		if (StringUtils.isEmpty(ctgrCd)) {
			return null;
		}

		if (null != this.codeMap) {
			for (CodeInfoVO codeInfo : this.codeMap.get(ctgrCd)) {
				if (CodeOption.USE_YN.equals(key)) {
					if (YNCode.YES.equals(condition) && YNCode.YES.equals(codeInfo.getDtlUseYn())) {
						resultList.add(codeInfo);
					} else if (YNCode.NO.equals(condition) && YNCode.NO.equals(codeInfo.getDtlUseYn())) {
						resultList.add(codeInfo);
					}
				}
			}
		}

		return resultList;
	}

	/**
	 * jhbang (2017. 7. 28. 오전 9:04:57)<br/>
	 * desc   :  상세 코드 명 다국어 Map을 조회한다.
	 * @param ctgrCd
	 * @param dtlCd
	 * @return Map<String,String>
	 */
	public Map<String, String> getCodeDetailNameMap(String ctgrCd, String dtlCd) {
		if (StringUtils.isEmpty(ctgrCd) || StringUtils.isEmpty(dtlCd)) {
			return null;
		}

		List<CodeInfoVO>	codeDetailList	= null;
		Map<String, String>	resultMap		= null;

		if (null != this.codeMap) {
			codeDetailList	= this.codeMap.get(ctgrCd);

			if (CollectionUtils.isNotEmpty(codeDetailList)) {
				for (CodeInfoVO codeDetail : codeDetailList) {
					if (dtlCd.equals(codeDetail.getDtlCd())) {
						resultMap	= codeDetail.getDtlCdNmMap();
					}
				}
			}
		}

		return resultMap;
	}

	public CodeInfoVO getCodeInfo(String ctgrCd, String dtlCd) {
		if (StringUtils.isEmpty(ctgrCd) || StringUtils.isEmpty(dtlCd)) {
			return null;
		}

		List<CodeInfoVO>	codeDetailList	= null;
		CodeInfoVO			codeInfoVo		= null;

		if (null != this.codeMap) {
			codeDetailList	= this.codeMap.get(ctgrCd);

			if (CollectionUtils.isNotEmpty(codeDetailList)) {
				for (CodeInfoVO codeDetail : codeDetailList) {
					if (dtlCd.equals(codeDetail.getDtlCd())) {
						codeInfoVo	= codeDetail;
						break;
					}
				}
			}
		}

		return codeInfoVo;
	}

	/**
	 * jhbang (2017. 7. 28. 오전 9:05:21)<br/>
	 * desc   :  상세 코드 명 (기본언어 : KOR) 을 조회한다.
	 * @param ctgrCd
	 * @param dtlCd
	 * @return String
	 */
	public String getCodeDetailName(String ctgrCd, String dtlCd) {
		return this.getCodeDetailName(ctgrCd, dtlCd, CodeConstants.DEFAULT_LANG_CD);
	}

	/**
	 * jhbang (2017. 8. 9. 오전 9:05:42)<br/>
	 * desc   :  상세 코드 명 (특정 언어 선택) 을 조회한다.
	 * @param ctgrCd
	 * @param dtlCd
	 * @param langCd
	 * @return String
	 */
	public String getCodeDetailName(String ctgrCd, String dtlCd, String langCd) {
		if (StringUtils.isEmpty(ctgrCd) || StringUtils.isEmpty(dtlCd)) {
			return null;
		}

		if (StringUtils.isEmpty(langCd)) {
			langCd	= CodeConstants.DEFAULT_LANG_CD;
		}

		List<CodeInfoVO>	codeDetailList	= null;
		Map<String, String>	resultMap		= null;

		if (null != this.codeMap) {
			codeDetailList	= this.codeMap.get(ctgrCd);

			if (CollectionUtils.isNotEmpty(codeDetailList)) {
				for (CodeInfoVO codeDetail : codeDetailList) {
					if (dtlCd.equals(codeDetail.getDtlCd())) {
						resultMap	= codeDetail.getDtlCdNmMap();
					}
				}
			}
		}

		return (null == resultMap) ? null : resultMap.get(langCd);
	}
	
	public String getCodeDetailNameForCodeShare(String ctgrCd, String dtlCd, String dtlUseYn) {
		return this.getCodeDetailNameForCodeShare(ctgrCd, dtlCd, CodeConstants.DEFAULT_LANG_CD, dtlUseYn);
	}
	
	public String getCodeDetailNameForCodeShare(String ctgrCd, String dtlCd, String langCd, String dtlUseYn) {
		if (StringUtils.isEmpty(ctgrCd) || StringUtils.isEmpty(dtlCd) || StringUtils.isEmpty(dtlUseYn)) {
			return null;
		}

		if (StringUtils.isEmpty(langCd)) {
			langCd	= CodeConstants.DEFAULT_LANG_CD;
		}
		
		List<CodeInfoVO>	codeDetailList	= null;
		Map<String, String>	resultMap		= null;

		if (null != this.codeMap) {
			codeDetailList	= this.codeMap.get(ctgrCd);

			if (CollectionUtils.isNotEmpty(codeDetailList)) {
				for (CodeInfoVO codeDetail : codeDetailList) {
					if(dtlCd.equals(codeDetail.getDtlCd()) && dtlUseYn.equals(codeDetail.getDtlUseYn())) {
						resultMap	= codeDetail.getDtlCdNmMap();
					}
				}
			}
		}

		return (null == resultMap) ? null : resultMap.get(langCd);
	}
	
	/**
	 * ykpark (2018. 5. 4. )<br/>
	 * desc   :  상세 코드 명 (특정 언어 선택) 을 조회한다.
	 * @param ctgrCd
	 * @param dtlCd
	 * @param langCd
	 * @return String
	 */
	public String getAddinfo3Code(String ctgrCd, String dtlCd, String langCd) {
		if (StringUtils.isEmpty(ctgrCd) || StringUtils.isEmpty(dtlCd)) {
			return null;
		}

		if (StringUtils.isEmpty(langCd)) {
			langCd	= CodeConstants.DEFAULT_LANG_CD;
		}

		List<CodeInfoVO>	codeDetailList	= null;
		String				resultMap		= null;

		if (null != this.codeMap) {
			codeDetailList	= this.codeMap.get(ctgrCd);

			if (CollectionUtils.isNotEmpty(codeDetailList)) {
				for (CodeInfoVO codeDetail : codeDetailList) {
					if (dtlCd.equals(codeDetail.getDtlCd())) {
						resultMap	= codeDetail.getAddInfo3();
					}
				}
			}
		}

		return (null == resultMap) ? null : resultMap;
	}

	public List<HolidayVO> getHolidayList(String countryNm) {
		List<HolidayVO> tmpList = holidayList.stream().filter(c -> c.getCountry().equals(countryNm)).collect(Collectors.toList());
		return tmpList;
	}
}
