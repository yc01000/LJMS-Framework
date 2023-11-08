package com.lj.crewpnr.common;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/** String <-> Date <-> XMLGregorianCalendar Converter */
public class DateUtils {

	public static final String STANDARD_YYYYMMDD = "yyyy-MM-dd";

	private static final String DEFAULT_YYYYMMDDHHMM = "yyyy-MM-dd HH:mm";

	private static final String ISO_STANDARD_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";

	private static final Locale DEFAULT_LOCALE = Locale.KOREAN;

	/** Date -> String (yyyy-MM-dd HH:mm) */
	public static String string(Date date) {
		return string(date, DEFAULT_YYYYMMDDHHMM);
	}

	/** XMLGregorianCalendar -> String (yyyy-MM-dd HH:mm) */
	public static String string(XMLGregorianCalendar xmlGregorianCalendar) {
		return string(xmlGregorianCalendar, DEFAULT_YYYYMMDDHHMM);
	}

	/** XMLGregorianCalendar -> String (not ignore time zone) */
	public static String string(XMLGregorianCalendar xmlGregorianCalendar, String pattern) {
		return string(date(xmlGregorianCalendar, false), pattern);
	}

	/** XMLGregorianCalendar -> String */
	public static String string(XMLGregorianCalendar xmlGregorianCalendar, String pattern, boolean ignoreTimezone) {
		if(xmlGregorianCalendar == null || xmlGregorianCalendar.toGregorianCalendar() == null) {
			return null;
		}

		return string(date(xmlGregorianCalendar, ignoreTimezone), pattern);
	}

	/** Date -> String (now, yyyy-MM-dd HH:mm) */
	public static String string(String pattern) {
		return string(new Date(), pattern);
	}

	/** Date -> String (yyyy-MM-dd HH:mm) */
	public static String string(Date date, String pattern) {
		if(date == null || StringUtils.isBlank(pattern)) {
			return null;
		}

		return new SimpleDateFormat(pattern, locale()).format(date);
	}

	/** String -> String (other pattern, cookie-saved locale) */
	public static String string(String dateString, String srcPattern, String destPattern) {
		return string(dateString, srcPattern, destPattern, locale());
	}

	/** String -> String (other pattern) */
	public static String string(String dateString, String srcPattern, String destPattern, Locale locale) {
		return string(DateUtils.date(dateString, srcPattern), destPattern, locale);
	}

	/** Date -> String */
	public static String string(Date date, String destPattern, Locale locale) {
		if(date == null || StringUtils.isBlank(destPattern) || locale == null) {
			return null;
		}

		return new SimpleDateFormat(destPattern, locale).format(date);
	}

	/** String -> Date (yyyy-MM-dd HH:mm) */
	public static Date date(String dateString) {
		return date(dateString, DEFAULT_YYYYMMDDHHMM);
	}

	/** String -> Date */
	public static Date date(String dateString, String pattern) {
		if(StringUtils.isBlank(dateString) || StringUtils.isBlank(pattern)) {
			return null;
		}

		try {
			return new SimpleDateFormat(pattern).parse(dateString);
		} catch (ParseException e) {
			try {
				return new SimpleDateFormat(pattern, Locale.US).parse(dateString);
			} catch (ParseException e1) {
				return null;
			}
		}
	}

	/** XMLGregorianCalendar -> Date (not ignore time zone) */
	public static Date date(XMLGregorianCalendar xmlGregorianCalendar) {
		return date(xmlGregorianCalendar, false);
	}

	/** XMLGregorianCalendar -> Date */
	public static Date date(XMLGregorianCalendar xmlGregorianCalendar, boolean ignoreTimezone) {
		if(xmlGregorianCalendar == null || xmlGregorianCalendar.toGregorianCalendar() == null) {
			return null;
		}
		if(!ignoreTimezone) {
			return xmlGregorianCalendar.toGregorianCalendar().getTime();
		}

		XMLGregorianCalendar clone = (XMLGregorianCalendar) xmlGregorianCalendar.clone();
		clone.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
		return clone.toGregorianCalendar().getTime();
	}

//	public static Date date(XMLGregorianCalendar xmlGregorianCalendar, String timezone) {
//		return addMinutes(date(xmlGregorianCalendar, true), timezoneToMinutes(timezone));
//	}

	/** String -> XMLGregorianCalendar (yyy-MM-dd HH:mm) */
	public static XMLGregorianCalendar xmlGregorianCalendar(String dateString) {
		return xmlGregorianCalendar(dateString, DEFAULT_YYYYMMDDHHMM);
	}

	/** String -> XMLGregorianCalendar */
	public static XMLGregorianCalendar xmlGregorianCalendar(String dateString, String pattern) {
		if(StringUtils.isBlank(dateString) || StringUtils.isBlank(pattern)) {
			return null;
		}

		try {
			return xmlGregorianCalendar(new SimpleDateFormat(pattern).parse(dateString));
		} catch (ParseException e) {
			return null;
		}
	}

	/** Date -> XMLGregorianCalendar */
	public static XMLGregorianCalendar xmlGregorianCalendar(Date date) {
		if(date == null) {
			return null;
		}

		try {
			SimpleDateFormat sdf = new SimpleDateFormat(ISO_STANDARD_DATE_FORMAT, DEFAULT_LOCALE);
			String dateString = sdf.format(date);
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(dateString);
		} catch (DatatypeConfigurationException e) {
			return null;
		}
	}

	public static XMLGregorianCalendar xmlGregorianCalendarUTC(Date date) {
		if(date == null) {
			return null;
		}

		try {
			SimpleDateFormat sdf = new SimpleDateFormat(ISO_STANDARD_DATE_FORMAT, DEFAULT_LOCALE);
			sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
			String dateString = sdf.format(date);
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(dateString);
		} catch (DatatypeConfigurationException e) {
			return null;
		}
	}

	/** add Calendar.MINUTE */
	public static Date addMinutes(Date date, int amount) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MINUTE, amount);
		return cal.getTime();
	}

	/** add Calendar.HOUR_OF_DAY to new Date() */
	public static Date addHour(int amount) {
		return addHour(new Date(), amount);
	}

	/** add Calendar.HOUR_OF_DAY */
	public static Date addHour(Date date, int amount) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.HOUR_OF_DAY, amount);
		return cal.getTime();
	}

	/** add Calendar.DATE to new Date() */
	public static Date addDate(int amount) {
		return addDate(new Date(), amount);
	}

	/** add Calendar.DATE */
	public static Date addDate(Date date, int amount) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, amount);
		return cal.getTime();
	}

	public static Date addDate(String date, int amount, String srcPattern) {
		return addDate(date(date, srcPattern), amount);
	}

	public static String addDate(String date, int amount, String srcPattern, String destPattern) {
		return string(addDate(date, amount, srcPattern), destPattern);
	}

	/** add Calendar.MONTH to new Date() */
	public static Date addMonth(int amount) {
		return addMonth(new Date(), amount);
	}

	/** add Calendar.MONTH */
	public static Date addMonth(Date date, int amount) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, amount);
		return cal.getTime();
	}

	/** add Calendar.YEAR to new Date() */
	public static Date addYear(int amount) {
		return addYear(new Date(), amount);
	}

	/** add Calendar.YEAR */
	public static Date addYear(Date date, int amount) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.YEAR, amount);
		return cal.getTime();
	}

	/**
	 * 지정한 달의  1일 리턴
	 * ihkim (2017. 9. 26. 오전 9:03:52)
	 * desc   :
	 * @param
	 * @return Date
	 */
	public static Date getFirstDay(Date date){

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, -(cal.get(Calendar.DATE)-1));
		return cal.getTime();
	}

	/**
	 * 지정 한 달 마지막일 리턴
	 * ihkim (2017. 9. 26. 오전 9:03:52)
	 * desc   :
	 * @param
	 * @return Date
	 */
	public static Date getLastDay(Date date){

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, (cal.getActualMaximum(Calendar.DATE) - cal.get(Calendar.DATE)));
		return cal.getTime();
	}

	public static String stringFirstDayOfWeek(String dateString) {
		return stringFirstDayOfWeek(dateString, STANDARD_YYYYMMDD);
	}

	public static String stringFirstDayOfWeek(String dateString, String pattern) {
		return string(dateFirstDayOfWeek(date(dateString, pattern)), pattern);
	}

	public static Date dateFirstDayOfWeek(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			cal.add(Calendar.DATE, -7);
		}
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		return cal.getTime();
	}

	public static String stringLastDayOfWeek(String dateString) {
		return stringLastDayOfWeek(dateString, STANDARD_YYYYMMDD);
	}

	public static String stringLastDayOfWeek(String dateString, String pattern) {
		return string(dateLastDayOfWeek(date(dateString, pattern)), pattern);
	}

	public static Date dateLastDayOfWeek(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			return cal.getTime();
		}

		Date dateAdded7Days = addDate(date, 7);
		cal.setTime(dateAdded7Days);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		return cal.getTime();
	}

	public static int dayOfWeek(String dateString) {
		return dayOfWeek(dateString, ISO_STANDARD_DATE_FORMAT);
	}

	public static int dayOfWeek(String dateString, String pattern) {
		if(StringUtils.isBlank(dateString)) {
			return 0;
		} else if(StringUtils.isBlank(pattern)) {
			return 0;
		}

		try {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern, DEFAULT_LOCALE);
			Date date = sdf.parse(dateString);
			return dayOfWeek(date);
		} catch (ParseException e) {
			return 0;
		}
	}

	public static int dayOfWeek(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.DAY_OF_WEEK);
	}

	/** 차이 일수 계산 (String, yyyy-MM-dd) */
	public static int diff(String startDateString, String endDateString) {
		return diff(startDateString, endDateString, STANDARD_YYYYMMDD);
	}

	/** 차이 일수 계산 (String) */
	public static int diff(String startDateString, String endDateString, String pattern) {
		if(StringUtils.isBlank(startDateString) || StringUtils.isBlank(endDateString)) {
			return 0;
		}

		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			Date startDate = sdf.parse(startDateString);
			Date endDate = sdf.parse(endDateString);
			return diff(startDate, endDate);
		} catch (ParseException e) {
			return 0;
		}
	}

	/** 차이 일수 계산 (XMLGregorianCalendar) */
	public static int diff(XMLGregorianCalendar startDate, XMLGregorianCalendar endDate) {
		if(startDate == null || endDate == null) {
			return 0;
		}

		return diff(date(startDate), date(endDate));
	}

	/** 차이 일수 계산 */
	public static int diff(Date startDate, Date endDate) {
		if(startDate == null || endDate == null) {
			return 0;
		}

		long diffMillis = diffMillis(startDate, endDate);
		int diffDays = (int)(diffMillis / (24 * 60 * 60 * 1000));

		return diffDays;
	}

	public static long diffMillis(XMLGregorianCalendar startDate, XMLGregorianCalendar endDate) {
		if(startDate == null || endDate == null) {
			return 0;
		}

		return diffMillis(date(startDate), date(endDate));
	}


	public static long diffMillis(Date startDate, Date endDate) {
		if(startDate == null || endDate == null) {
			return 0;
		}

		return endDate.getTime() - startDate.getTime();
	}

	public static Date min(Date o1, Date o2) {
		if(o1 == null || o2 == null) {
			return null;
		}

		if(o1.getTime() <= o2.getTime()) {
			return o1;
		}

		return o2;
	}

	public static String min(String o1, String o2, String pattern) {
		return DateUtils.string(DateUtils.min(DateUtils.date(o1, pattern), DateUtils.date(o2, pattern)), pattern);
	}

	public static Date max(Date o1, Date o2) {
		if(o1 == null || o2 == null) {
			return null;
		}

		if(o1.getTime() > o2.getTime()) {
			return o1;
		}

		return o2;
	}

	public static String max(String o1, String o2, String pattern) {
		return DateUtils.string(DateUtils.max(DateUtils.date(o1, pattern), DateUtils.date(o2, pattern)), pattern);
	}

	/** between (equal returns true) */
	public static boolean between(Date target, Date start, Date end) {
		return between(target, start, end, true);
	}

	/**
	 * !equalReturnsTrue then start < target < end를 만족하면 true
	 * equalReturnsTrue then start <= target <= end를 만족하면 true
	 */
	public static boolean between(Date target, Date start, Date end, boolean equalReturnsTrue) {
		if(target == null || start == null || end == null) {
			return false;
		}

		long targetMillis = target.getTime();
		long startMillis = start.getTime();
		if(targetMillis < startMillis) {
			return false;
		} else if(!equalReturnsTrue &&  startMillis == targetMillis) {
			return false;
		}

		long endMillis = end.getTime();
		if(endMillis < targetMillis) {
			return false;
		} else if(!equalReturnsTrue && endMillis == targetMillis) {
			return false;
		}

		return true;
	}

	private static Locale locale() {
		return DEFAULT_LOCALE;
//		HttpServletRequest request = request();
//		if(request == null) {
//			return DEFAULT_LOCALE;
//		}
//
//		String langCountry = CookieUtils.getCookie(request, CookieName.AGT_LANG_COUNTRY);
//		if(StringUtils.isBlank(langCountry)) {
//			return DEFAULT_LOCALE;
//		}
//
//		String[] parsed = StringUtils.split(langCountry, "_");
//		if(parsed == null || parsed.length != 2) {
//			return DEFAULT_LOCALE;
//		}
//
//		String lang = parsed[0];
//		String country = parsed[1];
//		return new Locale(lang, country);
	}

	private static HttpServletRequest request() {
		ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		if(servletRequestAttributes == null) {
			return null;
		}

		return servletRequestAttributes.getRequest();
	}

	public static ZonedDateTime getDateTime(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond, ZoneId zone) {
		return ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond, zone);
	}

	public static ZonedDateTime getDateTime(int year, int month, int dayOfMonth, int hour, int minute) {
		ZoneId seoul = ZoneId.of("Asia/Seoul");
		return ZonedDateTime.of(year, month, dayOfMonth, hour, minute, 0, 0, seoul);
	}

	/**
	 *
	 * @param String openDate("YYYY-MM-DD-HH-SS")
	 * @param String offDate("YYYY-MM-DD-HH-SS")
	 * @return Boolean
	 */
	public static Boolean isControlledtime(String openDate, String offDate) {
		ZoneId seoul = ZoneId.of("Asia/Seoul");
		ZonedDateTime systemDateTime = ZonedDateTime.now(seoul);
		String [] strOpenDate = openDate.split("-");
		String [] strOffDate = offDate.split("-");
		ZonedDateTime openTime = ZonedDateTime.of(Integer.parseInt(strOpenDate[0]), Integer.parseInt(strOpenDate[1]), Integer.parseInt(strOpenDate[2]), Integer.parseInt(strOpenDate[3]), Integer.parseInt(strOpenDate[4]), 0, 0, seoul);
		ZonedDateTime offTime  = ZonedDateTime.of(Integer.parseInt(strOffDate[0]), Integer.parseInt(strOffDate[1]), Integer.parseInt(strOffDate[2]), Integer.parseInt(strOffDate[3]), Integer.parseInt(strOffDate[4]), 0, 0, seoul);
		return systemDateTime.isAfter(openTime) && systemDateTime.isBefore(offTime);
	}

	public static boolean isMaintenanceTime(){
		ZonedDateTime systemDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		return systemDateTime.getHour() == 0 && (systemDateTime.getMinute()>=0 && systemDateTime.getMinute() <= 15);
	}
}