package com.lj.core.commoncode.handler;

import com.lj.core.common.util.CodeConstants;
import com.lj.core.common.util.CodeConstants.CityAirportOption;
import com.lj.core.common.util.CodeConstants.YNCode;
import com.lj.core.commoncode.service.CmmCodeService;
import com.lj.core.commoncode.vo.*;
import jakarta.annotation.PostConstruct;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ CityAirportHandler.java
 * </pre>
 * 
 *  @author  : jhbang
 *  @date    : 2017. 8. 10. 오후 12:48:38 
 *  @version : 1.0
 *  @desc    : 도시/공항 정보를 메모리에서 관리하기 위한 클래스
 */
@Component("CityAirportHandler")
public class CityAirportHandler {
	private static final	Logger	LOGGER	= LoggerFactory.getLogger(CityAirportHandler.class);

	@Autowired
	private CmmCodeService cmmCodeService;

	private List<RegionInfoVO>				rgnList;

	private List<CityAirportInfoVO>			apoList;

	private Map<String, CityAirportInfoVO>	apoMap;

	private List<CityAirportInfoVO>			depList;

	private List<DepartureAndArrivalAirportInfoVO>	deptAirportList;

	private List<DepartureAndArrivalAirportInfoVO>	arvlAirportList;

//	@Autowired
//	private MailHandler mailHandler;
	
	/**
	 * jhbang (2017. 8. 10. 오후 9:02:53)<br/>
	 * desc   :  기본 생성자
	 * @param  
	 * @return void
	 */
	public CityAirportHandler() {
		
	}

	@PostConstruct
	public void postConstruct() {
		// 서버 로드 시 최초 1회 수행
		init();
	}

	/**
	 * jhbang (2017. 8. 10. 오후 9:02:53)<br/>
	 * desc   :  WAS 로딩 시 Bean 초기화 작업
	 * @param  
	 * @return void
	 */
	@Scheduled(fixedDelay = 1000 * 60 * 30)
	public void init() {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("[CityAirportHandler.init] Initializing City/Airport Data");
		}

		this.setRegionMap();

		this.setCityAirportMap();

		this.setDepartureAirportList();
		this.setArrivalAirportList();
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
			//mailHandler.sendExceptionMail("[CityAirportHandler.setRegionMap]", e);
		}
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
	 * jhbang (2017. 8. 10. 오후 9:37:11)<br/>
	 * desc   :  List 형태의 도시/공항 목록을 도시/공항 코드 기준의 Map 형태로 전환
	 * @param  
	 * @return void
	 */
	private void setCityAirportMap() {
		try {
			this.apoList	= this.getCityAirportListForInit();
			this.depList	= this.getCityAirportListByDeparture();
		} catch (IllegalAccessException | InvocationTargetException e) {
			if (LOGGER.isErrorEnabled()) {
				LOGGER.error("[CityAirportHandler.setCityAirportMap] {}", e.getMessage());
			}
			
			//mailHandler.sendExceptionMail("[CityAirportHandler.setCityAirportMap]", e);
		}

		if (null == this.apoList) {
			this.apoMap	= null;
			return;
		}

		Map<String, CityAirportInfoVO>	apoMap	= new HashMap<String, CityAirportInfoVO>();

		for (CityAirportInfoVO apoInfo : this.apoList) {
			apoMap.put(apoInfo.getApoCd(), apoInfo);
		}

		this.apoMap	= apoMap;	
	}

	/**
	 * jhbang (2017. 8. 10. 오후 10:49:04)<br/>
	 * desc   :  전체 도시/공항 목록을 정리하여, 도시/공항 명을 다국어 Map으로 전환한다.
	 * @param  
	 * @return List<CityAirportInfoVO>
	 */
	private List<CityAirportInfoVO> getCityAirportListForInit() throws IllegalAccessException, InvocationTargetException {
		List<CityAirportInfoVO>	orgCityAirportList	= cmmCodeService.getCityAirportListForCityAirportHandler();

		if (CollectionUtils.isEmpty(orgCityAirportList)) {
			return null;
		}

		List<CityAirportInfoVO>	resultList	= new ArrayList<CityAirportInfoVO>();

		String	prevApoCd	= "";

		CityAirportInfoVO	tmpCityAirportInfo	= null;
		Map<String, String>	apoNmMap			= null;

		for (CityAirportInfoVO apoInfo : orgCityAirportList) {
			String	apoCd	= apoInfo.getApoCd();

			if (prevApoCd.equals(apoCd)) {
				if (StringUtils.isNotEmpty(apoInfo.getLangCd())
						&& StringUtils.isNotEmpty(apoInfo.getApoNm())) {
					if (null == apoNmMap) {
						apoNmMap	= new HashMap<String, String>();
					}

					apoNmMap.put(apoInfo.getLangCd(), apoInfo.getApoNm());
				}
			} else {
				if (null != tmpCityAirportInfo) {
					tmpCityAirportInfo.setApoNmMap(apoNmMap);

					resultList.add(tmpCityAirportInfo); 
				}

				tmpCityAirportInfo	= new CityAirportInfoVO();
				apoNmMap		= new HashMap<String, String>();

				BeanUtils.copyProperties(apoInfo, tmpCityAirportInfo);

				if (StringUtils.isNotEmpty(apoInfo.getLangCd())
						&& StringUtils.isNotEmpty(apoInfo.getApoNm())) {
					apoNmMap.put(apoInfo.getLangCd(), apoInfo.getApoNm());
				}
			}

			prevApoCd	= apoInfo.getApoCd();
		}

		if (null != tmpCityAirportInfo) {
			tmpCityAirportInfo.setApoNmMap(apoNmMap);

			resultList.add(tmpCityAirportInfo); 
		}

		return resultList;
	}

	/**
	 * jhbang (2017. 12. 11. 오후 5:40:59)<br/>
	 * desc   :  출발지 기준 전체 도시/공항 목록을 정리하여, 도시/공항 명을 다국어 Map으로 전환한다.
	 * 
	 * @return List<CityAirportInfoVO>
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	private List<CityAirportInfoVO> getCityAirportListByDeparture() throws IllegalAccessException, InvocationTargetException {
		List<CityAirportInfoVO>	orgCityAirportList	= cmmCodeService.getCityAirportListByDeparture();

		if (CollectionUtils.isEmpty(orgCityAirportList)) {
			return null;
		}

		List<CityAirportInfoVO>	resultList	= new ArrayList<CityAirportInfoVO>();

		String	prevApoCd	= "";

		CityAirportInfoVO	tmpCityAirportInfo	= null;
		Map<String, String>	apoNmMap			= null;

		for (CityAirportInfoVO apoInfo : orgCityAirportList) {
			String	apoCd	= apoInfo.getApoCd();

			if (prevApoCd.equals(apoCd)) {
				if (StringUtils.isNotEmpty(apoInfo.getLangCd())
						&& StringUtils.isNotEmpty(apoInfo.getApoNm())) {
					if (null == apoNmMap) {
						apoNmMap	= new HashMap<String, String>();
					}

					apoNmMap.put(apoInfo.getLangCd(), apoInfo.getApoNm());
				}
			} else {
				if (null != tmpCityAirportInfo) {
					tmpCityAirportInfo.setApoNmMap(apoNmMap);

					resultList.add(tmpCityAirportInfo); 
				}

				tmpCityAirportInfo	= new CityAirportInfoVO();
				apoNmMap		= new HashMap<String, String>();

				BeanUtils.copyProperties(apoInfo, tmpCityAirportInfo);

				if (StringUtils.isNotEmpty(apoInfo.getLangCd())
						&& StringUtils.isNotEmpty(apoInfo.getApoNm())) {
					apoNmMap.put(apoInfo.getLangCd(), apoInfo.getApoNm());
				}
			}

			prevApoCd	= apoInfo.getApoCd();
		}

		if (null != tmpCityAirportInfo) {
			tmpCityAirportInfo.setApoNmMap(apoNmMap);

			resultList.add(tmpCityAirportInfo); 
		}

		return resultList;
	}

	/**
	 * jhbang (2018. 3. 12. 오후 2:39:20)<br/>
	 * desc   :  출발지 도시/공항 목록 정리
	 * 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * 
	 */
	private void setDepartureAirportList() {
		List<DepartureAndArrivalAirportInfoVO>	deptApoList	= cmmCodeService.getDepartureAirportList();

		if (CollectionUtils.isEmpty(deptApoList)) {
			return;
		}

		this.deptAirportList	= new ArrayList<DepartureAndArrivalAirportInfoVO>();

		String	prevApoCd	= "";

		DepartureAndArrivalAirportInfoVO	tmpAirportInfo	= null;
		Map<String, String>					apoNmMap		= null;

		for (DepartureAndArrivalAirportInfoVO deptApo : deptApoList) {
			String	apoCd	= deptApo.getApoCd();

			if (prevApoCd.equals(apoCd)) {
				if (StringUtils.isNotEmpty(deptApo.getLangCd())
						&& StringUtils.isNotEmpty(deptApo.getApoNm())) {
					if (null == apoNmMap) {
						apoNmMap	= new HashMap<String, String>();
					}

					apoNmMap.put(deptApo.getLangCd(), deptApo.getApoNm());
				}
			} else {
				if (null != tmpAirportInfo) {
					tmpAirportInfo.setApoNmMap(apoNmMap);

					this.deptAirportList.add(tmpAirportInfo);
				}

				tmpAirportInfo	= new DepartureAndArrivalAirportInfoVO();
				apoNmMap		= new HashMap<String, String>();

				try {
					BeanUtils.copyProperties(deptApo, tmpAirportInfo);
				} catch (Exception e) {
					if (LOGGER.isErrorEnabled()) {
						LOGGER.error("[CityAirportHandler.setDepartureAirportList] {}", e.getMessage());
					}
					//mailHandler.sendExceptionMail("[CityAirportHandler.setDepartureAirportList]", e);
				}

				if (StringUtils.isNotEmpty(deptApo.getLangCd())
						&& StringUtils.isNotEmpty(deptApo.getApoNm())) {
					apoNmMap.put(deptApo.getLangCd(), deptApo.getApoNm());
				}
			}

			prevApoCd	= deptApo.getApoCd();
		}

		if (null != tmpAirportInfo) {
			tmpAirportInfo.setApoNmMap(apoNmMap);

			this.deptAirportList.add(tmpAirportInfo); 
		}
	}

	/**
	 * jhbang (2018. 3. 12. 오후 2:39:45)<br/>
	 * desc   :  도착지 도시/공항 목록 정리
	 * 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * 
	 */
	private void setArrivalAirportList() {
		List<DepartureAndArrivalAirportInfoVO>	arvlApoList	= cmmCodeService.getArrivalAirportList();

		if (CollectionUtils.isEmpty(arvlApoList)) {
			return;
		}

		this.arvlAirportList	= new ArrayList<DepartureAndArrivalAirportInfoVO>();

		int		prevDepApoSeq	= -1;
		String	prevApoCd		= "";

		DepartureAndArrivalAirportInfoVO	tmpAirportInfo	= null;
		Map<String, String>					apoNmMap		= null;

		for (DepartureAndArrivalAirportInfoVO arvlApo : arvlApoList) {
			int		depApoSeq	= arvlApo.getDepApoSeq();
			String	apoCd		= arvlApo.getApoCd();

			if ((prevDepApoSeq == depApoSeq) && prevApoCd.equals(apoCd)) {
				if (StringUtils.isNotEmpty(arvlApo.getLangCd())
						&& StringUtils.isNotEmpty(arvlApo.getApoNm())) {
					if (null == apoNmMap) {
						apoNmMap	= new HashMap<String, String>();
					}

					apoNmMap.put(arvlApo.getLangCd(), arvlApo.getApoNm());
				}
			} else {
				if (null != tmpAirportInfo) {
					tmpAirportInfo.setApoNmMap(apoNmMap);

					this.arvlAirportList.add(tmpAirportInfo);
				}

				tmpAirportInfo	= new DepartureAndArrivalAirportInfoVO();
				apoNmMap		= new HashMap<String, String>();

				try {
					BeanUtils.copyProperties(arvlApo, tmpAirportInfo);
				} catch (Exception  e) {
					if (LOGGER.isErrorEnabled()) {
						LOGGER.error("[CityAirportHandler.setArrivalAirportList] {}", e.getMessage());
					}
					//mailHandler.sendExceptionMail("[CityAirportHandler.setArrivalAirportList]", e);
				}

				if (StringUtils.isNotEmpty(arvlApo.getLangCd())
						&& StringUtils.isNotEmpty(arvlApo.getApoNm())) {
					apoNmMap.put(arvlApo.getLangCd(), arvlApo.getApoNm());
				}
			}

			prevDepApoSeq	= arvlApo.getDepApoSeq();
			prevApoCd		= arvlApo.getApoCd();
		}

		if (null != tmpAirportInfo) {
			tmpAirportInfo.setApoNmMap(apoNmMap);

			this.arvlAirportList.add(tmpAirportInfo); 
		}
	}

	/**
	 * jhbang (2017. 8. 10. 오후 10:07:37)<br/>
	 * desc   :  특정 도시/공항 정보를 조회한다.
	 * @param  apoCd
	 * @return CityAirportInfoVO
	 */
	public CityAirportInfoVO getCityAirportInfo(String apoCd) {
		if (StringUtils.isEmpty(apoCd)) {
			return null;
		}

		if (null != this.apoMap) {
			return this.apoMap.get(apoCd);
		}

		return null;
	}

	/**
	 * jhbang (2017. 9. 26. 오전 9:37:37)<br/>
	 * desc   :  도시/공항 정보 목록을 조회한다.
	 * 
	 * @return
	 */
	public List<CityAirportInfoVO> getCityAirportList() {
		return this.apoList;
	}

	/**
	 * jhbang (2017. 8. 9. 오전 10:07:37)<br/>
	 * desc   :  지역 구분을 이용하여 도시/공항 정보 목록을 조회한다.
	 * @param  rgnCd
	 * @return List<CityAirportInfoVO>
	 */
	public List<CityAirportInfoVO> getCityAirportInfoByRegion(String rgnCd) {
		if (StringUtils.isEmpty(rgnCd)) {
			return null;
		}

		List<CityAirportInfoVO>	resultList	= new ArrayList<CityAirportInfoVO>();

		if (CollectionUtils.isNotEmpty(this.apoList)) {
			for (CityAirportInfoVO apoInfo : this.apoList) {
				if (rgnCd.equals(apoInfo.getRgnCd())) {
					resultList.add(apoInfo);
				}
			}
		}

		return CollectionUtils.isEmpty(resultList) ? null : resultList;
	}

	/**
	 * jhbang (2017. 8. 9. 오전 10:07:37)<br/>
	 * desc   :  국가 구분을 이용하여 도시/공항 정보 목록을 조회한다.
	 * @param  ctrCd
	 * @return List<CityAirportInfoVO>
	 */
	public List<CityAirportInfoVO> getCityAirportInfoByCountry(String ctrCd) {
		if (StringUtils.isEmpty(ctrCd)) {
			return null;
		}

		List<CityAirportInfoVO>	resultList	= new ArrayList<CityAirportInfoVO>();

		if (CollectionUtils.isNotEmpty(this.apoList)) {
			for (CityAirportInfoVO apoInfo : this.apoList) {
				if (ctrCd.equals(apoInfo.getCtrCd())) {
					resultList.add(apoInfo);
				}
			}
		}

		return CollectionUtils.isEmpty(resultList) ? null : resultList;
	}

	/**
	 * jhbang (2017. 8. 10. 오후 10:10:08)<br/>
	 * desc   :  특정 조건에 따른 도시/공항 정보 목록을 조회한다. (CityAirportOption Class 참조)
	 * @param  key
	 * @param  condition
	 * @return List<CityAirportInfoVO>
	 */
	public List<CityAirportInfoVO> getCityAirportListByCondition(String key, String condition) {
		List<CityAirportInfoVO>	resultList	= new ArrayList<CityAirportInfoVO>();

		if (CollectionUtils.isEmpty(this.apoList)) {
			return null;
		}

		for (CityAirportInfoVO apoInfo : this.apoList) {
			if (CityAirportOption.DRCT_FLT_YN.equals(key)) {
				if (YNCode.YES.equals(condition) && YNCode.YES.equals(apoInfo.getDrctFltYn())) {
					resultList.add(apoInfo);
				} else if (YNCode.NO.equals(condition) && YNCode.NO.equals(apoInfo.getDrctFltYn())) {
					resultList.add(apoInfo);
				}
			} else if (CityAirportOption.MLT_CTY_YN.equals(key) && YNCode.YES.equals(apoInfo.getUseYn())) {
				if (YNCode.YES.equals(condition)) {
					resultList.add(apoInfo);
				} else if (YNCode.NO.equals(condition) && YNCode.NO.equals(apoInfo.getUseYn())) {
					resultList.add(apoInfo);
				}
			} else if (CityAirportOption.USE_YN.equals(key) && YNCode.YES.equals(apoInfo.getUseYn())) {
				if (YNCode.YES.equals(condition)) {
					resultList.add(apoInfo);
				} else if (YNCode.NO.equals(condition) && YNCode.NO.equals(apoInfo.getUseYn())) {
					resultList.add(apoInfo);
				}
			}
		}

		return CollectionUtils.isEmpty(resultList) ? null : resultList;
	}

	/**
	 * jhbang (2017. 8. 10. 오후 9:05:21)<br/>
	 * desc   :  도시/공항 명 (기본언어 : KOR) 을 조회한다.
	 * @param apoCd
	 * @param langCd
	 * @return String
	 */
	public String getCityAirportName(String apoCd, String langCd) {
		if (StringUtils.isEmpty(apoCd)) {
			return null;
		}

		if (StringUtils.isEmpty(langCd)) {
			langCd	= CodeConstants.DEFAULT_LANG_CD;
		}

		CityAirportInfoVO	apoInfoVO	= null;

		if (null != this.apoMap) {
			apoInfoVO	= this.apoMap.get(apoCd);
		}

		return (null == apoInfoVO) ? apoCd : apoInfoVO.getApoNmMap().get(langCd);
	}
	
	/**
	 * jhbang (2017. 8. 10. 오후 9:05:21)<br/>
	 * desc   :  도시명 (기본언어 : KOR) 을 조회한다.
	 * @param apoCd
	 * @param langCd
	 * @return String
	 */
	public String getAirportRegionName(String apoCd, String langCd) {
		if (StringUtils.isEmpty(apoCd)) {
			return null;
		}

		if (StringUtils.isEmpty(langCd)) {
			langCd	= CodeConstants.DEFAULT_LANG_CD;
		}

		CityAirportInfoVO	apoInfoVO	= null;

		if (null != this.apoMap) {
			apoInfoVO	= this.apoMap.get(apoCd);
		}
		
		if(apoInfoVO != null) {
			String apoName = apoInfoVO.getApoNmMap().get(langCd);
			String[] region = apoName.split("\\(");
			return region[0];
		} else {
			return null;
		}

	}

	/**
	 * jhbang (2017. 12. 11. 오후 5:43:06)<br/>
	 * desc   :  국가 구분을 이용하여 출발지 기준 도시/공항 정보 목록을 조회한다.
	 * 
	 * @param ctrCd
	 * @return List<CityAirportInfoVO>
	 */
	public List<CityAirportInfoVO> getCityAirportInfoByDeparture(String ctrCd) {
		if (StringUtils.isEmpty(ctrCd)) {
			return null;
		}

		List<CityAirportInfoVO>	resultList	= new ArrayList<CityAirportInfoVO>();

		if (CollectionUtils.isNotEmpty(this.depList)) {
			for (CityAirportInfoVO apoInfo : this.depList) {
				if (ctrCd.equals(apoInfo.getCtrCd())) {
					resultList.add(apoInfo);
				}
			}
		}

		return CollectionUtils.isEmpty(resultList) ? null : resultList;
	}

	/**
	 * jhbang (2018. 3. 12. 오후 3:55:43)<br/>
	 * desc   :  출발공항 목록 조회
	 * 
	 * @param langCd
	 * @return
	 */
	public List<RegionGrouplAirportVO> getDepartureAirportList(String langCd) {
		if (StringUtils.isEmpty(langCd)
				|| CollectionUtils.isEmpty(this.rgnList)
				|| CollectionUtils.isEmpty(this.deptAirportList)) {
			return null;
		}

		List<RegionGrouplAirportVO>	rgaList	= new ArrayList<RegionGrouplAirportVO>();

		for (RegionInfoVO rgnInfo : this.rgnList) {
			if (!YNCode.YES.equals(rgnInfo.getUseYn())) {
				continue;
			}

			RegionGrouplAirportVO	result	= new RegionGrouplAirportVO();

			result.setRegionCode(rgnInfo.getRgnCd());
			result.setRegionName((String)rgnInfo.getRgnNmMap().get(langCd));

			List<RegionAirportInfoVO>	raiList	= new ArrayList<RegionAirportInfoVO>();

			for (DepartureAndArrivalAirportInfoVO deptApo : this.deptAirportList) {
				if (!YNCode.YES.equals(deptApo.getUseYn())) {
					continue;
				}

				if (rgnInfo.getRgnCd().equals(deptApo.getRgnCd())) {
					RegionAirportInfoVO	deptApoInfo	= new RegionAirportInfoVO();

					deptApoInfo.setCountryCode(deptApo.getCtrCd());
					deptApoInfo.setIataCityAirportCode(deptApo.getApoCd());
					deptApoInfo.setDepartureSeq(Integer.toString(deptApo.getDepApoSeq()));

					if (null != deptApo.getApoNmMap()) {
						deptApoInfo.setCityAirportName(deptApo.getApoNmMap().get(langCd));
					}

					raiList.add(deptApoInfo);
				}
			}

			if (CollectionUtils.isNotEmpty(raiList)) {
				result.setAirportList(raiList);
				rgaList.add(result);
			}
		}

		return rgaList;
	}

	/**
	 * jhbang (2018. 3. 12. 오후 3:59:00)<br/>
	 * desc   :  도착공항 목록 조회
	 * 
	 * @param paramMap
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<RegionGrouplAirportVO> getArrivalAirportList(Map<String, Object> paramMap) {
		if (MapUtils.isEmpty(paramMap)
				|| CollectionUtils.isEmpty(this.rgnList)
				|| CollectionUtils.isEmpty(this.arvlAirportList)) {
			return null;
		}

		String			langCd		= (String)paramMap.get("langCd");
		List<String>	depSeqList	= (ArrayList<String>)paramMap.get("depSeqList");

		if (StringUtils.isEmpty(langCd) || CollectionUtils.isEmpty(depSeqList)) {
			return null;
		}

		List<RegionGrouplAirportVO>	rgaList	= new ArrayList<RegionGrouplAirportVO>();

		for (RegionInfoVO rgnInfo : this.rgnList) {
			if (!YNCode.YES.equals(rgnInfo.getUseYn())) {
				continue;
			}

			RegionGrouplAirportVO	result	= new RegionGrouplAirportVO();

			result.setRegionCode(rgnInfo.getRgnCd());
			result.setRegionName((String)rgnInfo.getRgnNmMap().get(langCd));

			List<RegionAirportInfoVO>	raiList	= new ArrayList<RegionAirportInfoVO>();

			for (DepartureAndArrivalAirportInfoVO arvlApo : this.arvlAirportList) {
				if (rgnInfo.getRgnCd().equals(arvlApo.getRgnCd())
						&& depSeqList.contains(Integer.toString(arvlApo.getDepApoSeq()))) {
					RegionAirportInfoVO	arvlApoInfo	= new RegionAirportInfoVO();

					arvlApoInfo.setCountryCode(arvlApo.getCtrCd());
					arvlApoInfo.setIataCityAirportCode(arvlApo.getApoCd());
					arvlApoInfo.getParentDepSeqList().add(Integer.toString(arvlApo.getDepApoSeq()));
					arvlApoInfo.setOrderSeq(arvlApo.getStSeq());

					if (null != arvlApo.getApoNmMap()) {
						arvlApoInfo.setCityAirportName(arvlApo.getApoNmMap().get(langCd));
					}

					boolean	isExist	= false;

					if (CollectionUtils.isNotEmpty(raiList)) {
						for (int i = 0; i < raiList.size(); i++) {
							RegionAirportInfoVO	raiInfo	= (RegionAirportInfoVO)raiList.get(i);

							if (raiInfo.getIataCityAirportCode().equals(arvlApo.getApoCd())) {
								raiInfo.getParentDepSeqList().add(Integer.toString(arvlApo.getDepApoSeq()));
								raiList.set(i, raiInfo);
								isExist	= true;
								break;
							}
						}
					}

					if (!isExist) {
						raiList.add(arvlApoInfo);
					}
				}
			}

			if (CollectionUtils.isNotEmpty(raiList)) {
				result.setAirportList(raiList);
				rgaList.add(result);
			}
		}

		if (CollectionUtils.isNotEmpty(rgaList)) {
			Comparator<RegionAirportInfoVO>	order	= new Comparator<RegionAirportInfoVO>() {
				@Override
				public int compare(RegionAirportInfoVO o1, RegionAirportInfoVO o2) {
					int	rtnValue	= 0;

					if (o1.getOrderSeq() < o2.getOrderSeq()) {
						rtnValue	= -1;
					} else if (o1.getOrderSeq() > o2.getOrderSeq()) {
						rtnValue	= 1;
					}

					return rtnValue;
				}
			};

			for (RegionGrouplAirportVO rgaInfo : rgaList) {
				Collections.sort(rgaInfo.getAirportList(), order);
			}
		}

		return rgaList;
	}
}
