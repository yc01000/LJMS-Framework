package com.lj.core.util;

import org.apache.commons.lang3.StringUtils;

import java.security.SecureRandom;

public class RandomUtils {

	private static final char[] ENTRY_ALPHANUMERIC =  {
		'1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
		'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
		'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
	};

	private static final char[] ENTRY_NUMERIC = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

	public static String generate(int len) {
		return generate("ALPHANUMERIC", len);
	}

	public static String generate(String type, int len) {
		SecureRandom secureRandom = new SecureRandom();

		char[] targetSet = ENTRY_ALPHANUMERIC;
		if(StringUtils.equals(type, "NUMERIC")) {
			targetSet = ENTRY_NUMERIC;
		}

		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < len; i++) {
			builder.append(targetSet[secureRandom.nextInt(targetSet.length)]);
		}
		return builder.toString();
	}

	@Deprecated
	public static int generate(int start, int end) {
		int range = end - start;
		SecureRandom random = new SecureRandom();
		return random.nextInt(range) + start;
	}

	@Deprecated
	public static long generate(long start, long end) {
		int range = (int) (end - start);
		SecureRandom random = new SecureRandom();
		return random.nextInt(range) + start;
	}

	public static int generateNumber(int start, int end) {
		int range = end - start;
		SecureRandom random = new SecureRandom();
		return random.nextInt(range) + start;
	}

	public static long generateNumber(long start, long end) {
		int range = (int) (end - start);
		SecureRandom random = new SecureRandom();
		return random.nextInt(range) + start;
	}
}
