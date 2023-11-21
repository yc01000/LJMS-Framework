package com.lj.core.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/** 프로파일 유틸 */
@Component
public class Profiles {

	private static final String PRODUCT = "prd";

	private static final String STAGE = "stg";

	private static final String DEVELOP = "dev";

	private static final String LOCAL = "local";

	private static Environment environment;

	public static boolean isNotProduct() {
		return isNotProduct(Profiles.environment);
	}

	public static boolean isNotProduct(Environment environment) {
		return !isProduct(environment);
	}

	public static boolean isProduct() {
		return isProduct(Profiles.environment);
	}

	public static boolean isProduct(Environment environment) {
		return StringUtils.indexOfIgnoreCase(activeProfile(environment), PRODUCT) != -1;
	}

	public static boolean isStage() {
		return isStage(Profiles.environment);
	}

	public static boolean isStage(Environment environment) {
		return StringUtils.indexOfIgnoreCase(activeProfile(environment), STAGE) != -1;
	}

	public static boolean isDevelop() {
		return isDevelop(Profiles.environment);
	}

	public static boolean isDevelop(Environment environment) {
		return StringUtils.indexOfIgnoreCase(activeProfile(environment), DEVELOP) != -1;
	}

	public static boolean isLocal() {
		return isLocal(Profiles.environment);
	}

	public static boolean isLocal(Environment environment) {
		return StringUtils.indexOfIgnoreCase(activeProfile(environment), LOCAL) != -1;
	}

	public static String activeProfile() {
		return activeProfile(Profiles.environment);
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
		Profiles.environment = environment;
	}
}
