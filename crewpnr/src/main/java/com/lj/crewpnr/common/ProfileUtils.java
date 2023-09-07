package com.lj.crewpnr.common;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;

/** 프로파일 유틸 */
@Component
public class ProfileUtils {

	private static final String AGENT = "agt";

	private static final String SALES = "sales";

	private static final String PRODUCT = "prd";

	private static final String STAGE = "stg";

	private static final String DEVELOP = "dev";

	private static final String LOCAL = "local";

	private static Environment environment;

	public static boolean isAgent() {
		return StringUtils.indexOf(activeProfileLower(), AGENT) != -1;
	}

	public static boolean isSales() {
		return StringUtils.indexOf(activeProfileLower(), SALES) != -1;
	}

	public static boolean isNotProduct() {
		return !isProduct();
	}

	public static boolean isProduct() {
		return StringUtils.indexOf(activeProfileLower(), PRODUCT) != -1;
	}

	public static boolean isStage() {
		return StringUtils.indexOf(activeProfileLower(), STAGE) != -1;
	}

	public static boolean isDevelop() {
		return StringUtils.indexOf(activeProfileLower(), DEVELOP) != -1;
	}

	public static boolean isLocal() {
		return StringUtils.indexOf(activeProfileLower(), LOCAL) != -1;
	}

	public static String activeProfileLower() {
		return StringUtils.lowerCase(activeProfile());
	}

	public static String activeProfile() {
		String[] profiles = environment.getActiveProfiles();
		if(profiles == null || profiles.length == 0) {
			return null;
		}

		return StringUtils.lowerCase(profiles[0]);
	}

	@Resource
	public void setEnvironment(Environment environment) {
		ProfileUtils.environment = environment;
	}
}