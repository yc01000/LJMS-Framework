package com.lj.core.commoncode.handler;

import com.lj.core.util.CodeConstants;
import com.lj.core.util.CodeConstants.CountryOption;
import com.lj.core.util.CodeConstants.YNCode;
import com.lj.core.commoncode.service.CmmCodeService;
import com.lj.core.commoncode.vo.CodeInfoVO;
import com.lj.core.commoncode.vo.CountryInfoVO;
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
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ CountryHandler.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @date    : 2017. 8. 8. 오후 8:53:29 
 *  @version : 1.0
 *  @desc    : 국가 코드를 메모리에서 관리하기 위한 클래스
 */
@Component("CountryHandler")
public class CountryHandler {
	private static final	Logger	LOGGER	= LoggerFactory.getLogger(CountryHandler.class);
	
	private static final String [] EXCEPT_COUNTRY = {"GUM", "SPN"};

	@Autowired
	private CmmCodeService cmmCodeService;

//	@Resource(name = "MailHandler")
//	private MailHandler mailHandler;
	
	private List<CountryInfoVO>	ctrList;

	private Map<String, CountryInfoVO>	ctrMap;

	/**
	 * jhbang (2017. 8. 9. 오전 9:06:16)<br/>
	 * desc   :  기본 생성자
	 * @param  
	 * @return void
	 */
	public CountryHandler() {
		
	}

	/**
	 * jhbang (2017. 8. 9. 오전 9:06:16)<br/>
	 * desc   :  WAS 로딩 시 Bean 초기화 작업
	 * @param  
	 * @return void
	 */
	@PostConstruct
	public void init() {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("[CountryHandler.init] Initializing Country Data");
		}

		this.setCountryMap();
	}

	/**
	 * jhbang (2017. 8. 9. 오전 9:37:11)<br/>
	 * desc   :  List 형태의 국가 목록을 국가 코드 기준의 Map 형태로 전환
	 * @param  
	 * @return void
	 */
	private void setCountryMap() {
		try {
			this.ctrList	= this.getCountryListForInit();
		} catch (IllegalAccessException | InvocationTargetException e) {
			if (LOGGER.isErrorEnabled()) {
				LOGGER.error("[CountryHandler.setCountryMap] {}", e.getMessage());
				//mailHandler.sendExceptionMail("[CountryHandler.setCountryMap]", e);
			}
		}

		if (null == this.ctrList) {
			this.ctrMap	= null;
			return;
		}

		Map<String, CountryInfoVO>	ctrMap	= new HashMap<String, CountryInfoVO>();

		for (CountryInfoVO ctrInfo : this.ctrList) {
			ctrMap.put(ctrInfo.getCtrCd(), ctrInfo);
		}

		this.ctrMap	= ctrMap;
	}

	/**
	 * jhbang (2017. 8. 9. 오전 9:49:04)<br/>
	 * desc   :  전체 국가 목록을 정리하여, 국가 명을 다국어 Map으로, 사용 언어는 사용 언어 Map으로 전환한다.
	 * @param  
	 * @return List<CountryInfoVO>
	 */
	private List<CountryInfoVO> getCountryListForInit() throws IllegalAccessException, InvocationTargetException {
		// 국가 목록 기본 정보 처리
		List<CountryInfoVO>	orgCountryList	= cmmCodeService.getCountryListForCountryHandler();

		// 국가별 사용 언어 정보 처리
		List<CountryInfoVO>	orgLanguageList	= cmmCodeService.getCountryLanguageListForCountryHandler();

		// 시스템 언어 코드 정보 처리
		List<CodeInfoVO>	codeList		= cmmCodeService.getCodeListForCodeHandler(CodeConstants.CD_MST_언어구분);

		if (CollectionUtils.isEmpty(orgCountryList)) {
			return null;
		}

		List<CountryInfoVO>	resultList	= new ArrayList<CountryInfoVO>();

		String	prevCtrCd	= "";

		CountryInfoVO					tmpCountryInfo	= null;
		Map<String, String>				ctrNmMap		= null;
		Map<String, List<CodeInfoVO>>	langNmMap		= null;

		for (CountryInfoVO countryInfo : orgCountryList) {
			String	ctrCd	= countryInfo.getCtrCd();

			if (prevCtrCd.equals(ctrCd)) {
				if (StringUtils.isNotEmpty(countryInfo.getLangCd())
						&& StringUtils.isNotEmpty(countryInfo.getCtrNm())) {
					if (null == ctrNmMap) {
						ctrNmMap	= new HashMap<String, String>();
					}

					ctrNmMap.put(countryInfo.getLangCd(), countryInfo.getCtrNm());

					for (CountryInfoVO langInfo : orgLanguageList) {
						if (ctrCd.equals(langInfo.getCtrCd())) {
							if (null == langNmMap) {
								langNmMap	= new HashMap<String, List<CodeInfoVO>>();
							}

							List<CodeInfoVO>	saveCodeInfo	= new ArrayList<CodeInfoVO>();
							for (CodeInfoVO codeInfo : codeList) {
								if (langInfo.getLangCd().equals(codeInfo.getDtlCd())) {
									saveCodeInfo.add(codeInfo);
								}
							}

							langNmMap.put(langInfo.getLangCd(), saveCodeInfo);
						}
					}
				}
			} else {
				if (null != tmpCountryInfo) {
					tmpCountryInfo.setCtrNmMap(ctrNmMap);
					tmpCountryInfo.setLangNmMap(langNmMap);

					resultList.add(tmpCountryInfo); 
				}

				tmpCountryInfo	= new CountryInfoVO();
				ctrNmMap		= new HashMap<String, String>();
				langNmMap		= null;

				BeanUtils.copyProperties(countryInfo, tmpCountryInfo);

				if (StringUtils.isNotEmpty(countryInfo.getLangCd())
						&& StringUtils.isNotEmpty(countryInfo.getCtrNm())) {
					ctrNmMap.put(countryInfo.getLangCd(), countryInfo.getCtrNm());

					for (CountryInfoVO langInfo : orgLanguageList) {
						if (ctrCd.equals(langInfo.getCtrCd())) {
							if (null == langNmMap) {
								langNmMap	= new HashMap<String, List<CodeInfoVO>>();
							}

							List<CodeInfoVO>	saveCodeInfo	= new ArrayList<CodeInfoVO>();
							for (CodeInfoVO codeInfo : codeList) {
								if (langInfo.getLangCd().equals(codeInfo.getDtlCd())) {
									saveCodeInfo.add(codeInfo);
								}
							}

							langNmMap.put(langInfo.getLangCd(), saveCodeInfo);
						}
					}
				}
			}

			prevCtrCd	= countryInfo.getCtrCd();
		}

		if (null != tmpCountryInfo) {
			tmpCountryInfo.setCtrNmMap(ctrNmMap);
			tmpCountryInfo.setLangNmMap(langNmMap);

			resultList.add(tmpCountryInfo); 
		}

		return resultList;
	}

	/**
	 * jhbang (2017. 8. 9. 오전 10:07:37)<br/>
	 * desc   :  특정 국가 정보를 조회한다.
	 * @param  ctrCd
	 * @return CountryInfoVO
	 */
	public CountryInfoVO getCountryInfo(String ctrCd) {
		if (StringUtils.isEmpty(ctrCd)) {
			return null;
		}

		if (null != this.ctrMap) {
			return this.ctrMap.get(ctrCd);
		}

		return null;
	}

	/**
	 * jhbang (2017. 9. 26. 오전 9:36:35)<br/>
	 * desc   :  국가 정보 목록을 조회한다.
	 * 
	 * @return
	 */
	public List<CountryInfoVO> getCountryList() {
		return this.ctrList;
	}

	/**
	 * jhbang (2017. 8. 9. 오전 10:07:37)<br/>
	 * desc   :  지역 구분을 이용하여 국가 정보 목록을 조회한다.
	 * @param  rgnCd
	 * @return List<CountryInfoVO>
	 */
	public List<CountryInfoVO> getCountryInfoByRegion(String rgnCd) {
		if (StringUtils.isEmpty(rgnCd)) {
			return null;
		}

		List<CountryInfoVO>	resultList	= new ArrayList<CountryInfoVO>();

		if (CollectionUtils.isNotEmpty(this.ctrList)) {
			for (CountryInfoVO ctrInfo : this.ctrList) {
				if (rgnCd.equals(ctrInfo.getRgnCd())) {
					resultList.add(ctrInfo);
				}
			}
		}

		return CollectionUtils.isEmpty(resultList) ? null : resultList;
	}

	/**
	 * jhbang (2017. 8. 9. 오전 10:10:08)<br/>
	 * desc   :  특정 조건에 따른 국가 정보 목록을 조회한다. (CountryOption Class 참조)
	 * @param  key
	 * @param  condition
	 * @return List<CountryInfoVO>
	 */
	public List<CountryInfoVO> getCountryListByCondition(String key, String condition) {
		if (CollectionUtils.isEmpty(this.ctrList)) {
			return null;
		}

		List<CountryInfoVO>	resultList	= new ArrayList<CountryInfoVO>();

		for (CountryInfoVO ctrInfo : this.ctrList) {
			if (CountryOption.OPRT_YN.equals(key)) {
				if (YNCode.YES.equals(condition) && YNCode.YES.equals(ctrInfo.getOprtYn())) {
					resultList.add(ctrInfo);
				} else if (YNCode.NO.equals(condition) && YNCode.NO.equals(ctrInfo.getOprtYn())) {
					resultList.add(ctrInfo);
				}
			} else if (CountryOption.USE_YN.equals(key) && YNCode.YES.equals(ctrInfo.getUseYn())) {
				if (YNCode.YES.equals(condition)) {
					resultList.add(ctrInfo);
				} else if (YNCode.NO.equals(condition) && YNCode.NO.equals(ctrInfo.getUseYn())) {
					resultList.add(ctrInfo);
				}
			} else if (CountryOption.GATE_LANG_YN.equals(key)) {
				/**
				 * 2018.07.11 김도희
				 * 취항여부가 Y이더라도 특정 지역은 홈페이지 지역/언어 선택에 미표출하도록 key 추가함. 
				 * BO에서 언어별 등록/수정해야하는 메뉴는 이 옵션을 사용해야한다.
				 */
				if (YNCode.YES.equals(condition) && YNCode.YES.equals(ctrInfo.getOprtYn())) {
					boolean pass = false;
					for (String exptCtr : EXCEPT_COUNTRY) {
						if (StringUtils.equals(exptCtr, ctrInfo.getCtrCd())) {
							pass = true;
						}
					}
					if (!pass) {
						resultList.add(ctrInfo);
					}
				}
			}
		}

		return CollectionUtils.isEmpty(resultList) ? null : resultList;
	}

	/**
	 * jhbang (2018. 2. 13. 오후 3:10:24)<br/>
	 * desc   :  정렬 조건에 따른 국가 정보 목록을 조회한다. (CountryOption Class 참조)
	 * 
	 * @param langCd
	 * @param orderKey
	 * @param orderCond
	 * @return List<CountryInfoVO>
	 */
	public List<CountryInfoVO> getCountryListByOrderCondition(String langCd, String orderKey, String orderCond) {
		if (CollectionUtils.isEmpty(this.ctrList)) {
			return null;
		}

		List<CountryInfoVO>	resultList	= this.ctrList;

		Comparator<CountryInfoVO>	order	= new Comparator<CountryInfoVO>() {
			public final String	thisOrderKey	= orderKey;
			public final String	thisOrderCond	= orderCond;

			@Override
			public int compare(CountryInfoVO o1, CountryInfoVO o2) {
				String	o1Value	= "";
				String	o2Value	= "";

				int direction = (CountryOption.SORT_DESC.equalsIgnoreCase(thisOrderCond) ? -1 : 1);

				if(StringUtils.equals(o2.getCtrCd(), "KOR")) {
					return direction;
				} else if(StringUtils.equals(o1.getCtrCd(), "KOR")) {
					return -direction;
				}

				if(StringUtils.equals(o2.getCtrCd(), "JPN")) {
					return direction;
				} else if(StringUtils.equals(o1.getCtrCd(), "JPN")) {
					return -direction;
				}

				if (CountryOption.SORT_CODE.equalsIgnoreCase(thisOrderKey)) {
					o1Value	= o1.getCtrCd();
					o2Value	= o2.getCtrCd();
				} else if (CountryOption.SORT_NAME.equalsIgnoreCase(thisOrderKey)) {
					Map<String, String>	o1CtrNmMap	= o1.getCtrNmMap();
					Map<String, String>	o2CtrNmMap	= o2.getCtrNmMap();

					if ("KOR".equals(langCd)) {
						o1Value	= (null != o1CtrNmMap) ? o1CtrNmMap.get("KOR") : "";
						o2Value	= (null != o2CtrNmMap) ? o2CtrNmMap.get("KOR") : "";
					} else {
						o1Value	= (null != o1CtrNmMap) ? o1CtrNmMap.get("ENG") : "";
						o2Value	= (null != o2CtrNmMap) ? o2CtrNmMap.get("ENG") : "";
					}
				} else {
					o1Value	= o1.getCtrCd2Ltr();
					o2Value	= o2.getCtrCd2Ltr();
				}

				return o1Value.compareTo(o2Value) * (CountryOption.SORT_DESC.equalsIgnoreCase(thisOrderCond) ? -1 : 1);
			}
		};

		Collections.sort(resultList, order);

		return CollectionUtils.isEmpty(resultList) ? null : resultList;
	}

	public List<CountryInfoVO> getCountryListByOrderForKioskCondition(String langCd, String orderKey, String orderCond) {
		setCountryMap();
		
		if (CollectionUtils.isEmpty(this.ctrList)) {
			return null;
		}

		List<CountryInfoVO>	resultList	= this.ctrList;

		Comparator<CountryInfoVO>	order	= new Comparator<CountryInfoVO>() {
			public final String	thisOrderKey	= orderKey;
			public final String	thisOrderCond	= orderCond;

			@Override
			public int compare(CountryInfoVO o1, CountryInfoVO o2) {
				String	o1Value	= "";
				String	o2Value	= "";

				int direction = (CountryOption.SORT_DESC.equalsIgnoreCase(thisOrderCond) ? -1 : 1);

				if(StringUtils.equals(o2.getCtrCd(), "KOR")) {
					return direction;
				} else if(StringUtils.equals(o1.getCtrCd(), "KOR")) {
					return -direction;
				}

				if(StringUtils.equals(o2.getCtrCd(), "JPN")) {
					return direction;
				} else if(StringUtils.equals(o1.getCtrCd(), "JPN")) {
					return -direction;
				}

				if (CountryOption.SORT_CODE.equalsIgnoreCase(thisOrderKey)) {
					o1Value	= o1.getCtrCd();
					o2Value	= o2.getCtrCd();
				} else if (CountryOption.SORT_NAME.equalsIgnoreCase(thisOrderKey)) {
					Map<String, String>	o1CtrNmMap	= o1.getCtrNmMap();
					Map<String, String>	o2CtrNmMap	= o2.getCtrNmMap();

					if ("KOR".equals(langCd)) {
						o1Value	= (null != o1CtrNmMap) ? o1CtrNmMap.get("KOR") : "";
						o2Value	= (null != o2CtrNmMap) ? o2CtrNmMap.get("KOR") : "";
					} else {
						o1Value	= (null != o1CtrNmMap) ? o1CtrNmMap.get("ENG") : "";
						o2Value	= (null != o2CtrNmMap) ? o2CtrNmMap.get("ENG") : "";
					}
				} else {
					o1Value	= o1.getCtrCd2Ltr();
					o2Value	= o2.getCtrCd2Ltr();
				}

				return o1Value.compareTo(o2Value) * direction;
			}
		};

		Collections.sort(resultList, order);

		return CollectionUtils.isEmpty(resultList) ? null : resultList;
	}
	
	
	/**
	 * jhbang (2017. 8. 9. 오전 9:05:21)<br/>
	 * desc   :  국가 명 (기본언어 : KOR) 을 조회한다.
	 * @param ctrCd
	 * @param langCd
	 * @return String
	 */
	public String getCountryName(String ctrCd, String langCd) {
		if (StringUtils.isEmpty(ctrCd)) {
			return null;
		}

		if (StringUtils.isEmpty(langCd)) {
			langCd	= CodeConstants.DEFAULT_LANG_CD;
		}

		CountryInfoVO	ctrInfoVO	= null;

		if (null != this.ctrMap) {
			ctrInfoVO	= this.ctrMap.get(ctrCd);
		}

		return (null == ctrInfoVO) ? null : ctrInfoVO.getCtrNmMap().get(langCd);
	}

	public String convert2LetterCodeTo3LetterCode(String iso2LetterCountryCode) {
		if(StringUtils.isBlank(iso2LetterCountryCode)) {
			return null;
		}

		for(CountryInfoVO country: getCountryList()) {
			if(country == null) {
				continue;
			}
			if(!StringUtils.equals(country.getCtrCd2Ltr(), iso2LetterCountryCode)) {
				continue;
			}

			return country.getCtrCd();
		}

		return null;
	}
}
