package com.lj.core.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/** 프로파일 유틸 */
@Component
public class ProfileUtils {

	private static final String PRODUCT = "prd";

	private static final String STAGE = "stg";

	private static final String DEVELOP = "dev";

	private static final String LOCAL = "local";

	private static Environment environment;

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
		return activeProfile(ProfileUtils.environment);
	}

	public static String activeProfile(Environment environment) {
		String[] profiles = environment.getActiveProfiles();
		if(profiles.length == 0) {
			return null;
		}

		return StringUtils.lowerCase(profiles[0]);
	}

	@Autowired
	public void setEnvironment(Environment environment) {
		ProfileUtils.environment = environment;
	}
}
