package com.lj.sso.ssocore.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.StringUtils;

public class DateUtils {

	public static final String STANDARD_YYYYMMDD = "yyyy-MM-dd";

	private static final String DEFAULT_YYYYMMDDHHMM = "yyyy-MM-dd HH:mm";

	private static final String ISO_STANDARD_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";

	/**
	 * Date -> String (yyyy-MM-dd HH:mm)
	 * Ko Youngjun (2017. 9. 18. 오후 4:18:06)
	 * desc   :
	 * @param
	 * @return String
	 */
	public static String string(Date date) {
		return string(date, DEFAULT_YYYYMMDDHHMM);
	}

	/**
	 * XMLGregorianCalendar -> String (yyyy-MM-dd HH:mm)
	 * Ko Youngjun (2017. 9. 18. 오후 4:18:18)
	 * desc   :
	 * @param
	 * @return String
	 */
	public static String string(XMLGregorianCalendar gregorianCalendar) {
		return string(gregorianCalendar, DEFAULT_YYYYMMDDHHMM);
	}

	/**
	 * XMLGregorianCalendar -> String
	 * Ko Youngjun (2017. 9. 18. 오후 4:18:30)
	 * desc   :
	 * @param
	 * @return String
	 */
	public static String string(XMLGregorianCalendar gregorianCalendar, String pattern) {
		if(gregorianCalendar == null || gregorianCalendar.toGregorianCalendar() == null) {
			return null;
		}

		Date date = gregorianCalendar.toGregorianCalendar().getTime();
		return string(date, pattern);
	}

	/**
	 * Date -> String (yyyy-MM-dd HH:mm)
	 * Ko Youngjun (2017. 9. 18. 오후 4:18:55)
	 * desc   :
	 * @param
	 * @return String
	 */
	public static String string(Date date, String pattern) {
		if(date == null || StringUtils.isBlank(pattern)) {
			return null;
		}

		return new SimpleDateFormat(pattern).format(date);
	}

	/**
	 * String -> String (other pattern)
	 * Ko Youngjun (2017. 11. 16. 오전 9:21:49)
	 * desc   :
	 * @param
	 * @return String
	 */
	public static String string(String dateString, String srcPattern, String destPattern) {
		if(StringUtils.isBlank(dateString) || StringUtils.isBlank(srcPattern) || StringUtils.isBlank(destPattern)) {
			return null;
		}

		return new SimpleDateFormat(destPattern).format(DateUtils.date(dateString, srcPattern));
	}

	/**
	 * String -> String (default pattern)
	 * Ko Youngjun (2017. 11. 16. 오전 9:21:49)
	 * desc   :
	 * @param
	 * @return String
	 */
	public static String string(String dateString, String srcPattern) {
		if(StringUtils.isBlank(dateString) || StringUtils.isBlank(srcPattern)) {
			return null;
		}

		return new SimpleDateFormat(STANDARD_YYYYMMDD).format(DateUtils.date(dateString, srcPattern));
	}

	/**
	 * String -> Date (yyyy-MM-dd HH:mm)
	 * Ko Youngjun (2017. 9. 18. 오후 4:19:21)
	 * desc   :
	 * @param
	 * @return Date
	 */
	public static Date date(String dateString) {
		return date(dateString, DEFAULT_YYYYMMDDHHMM);
	}

	/**
	 * String -> Date
	 * Ko Youngjun (2017. 9. 18. 오후 4:19:56)
	 * desc   :
	 * @param
	 * @return Date
	 */
	public static Date date(String dateString, String pattern) {
		if(StringUtils.isBlank(dateString) || StringUtils.isBlank(pattern)) {
			return null;
		}

		try {
			return new SimpleDateFormat(pattern).parse(dateString);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * XMLGregorianCalendar -> Date
	 * Ko Youngjun (2017. 9. 18. 오후 4:20:08)
	 * desc   :
	 * @param
	 * @return Date
	 */
	public static Date date(XMLGregorianCalendar gregorianCalendar) {
		if(gregorianCalendar == null || gregorianCalendar.toGregorianCalendar() == null) {
			return null;
		}

		return gregorianCalendar.toGregorianCalendar().getTime();
	}

	/**
	 * String -> XMLGregorianCalendar (yyy-MM-dd HH:mm)
	 * Ko Youngjun (2017. 9. 18. 오후 4:20:26)
	 * desc   :
	 * @param
	 * @return XMLGregorianCalendar
	 */
	public static XMLGregorianCalendar xmlGregorianCalendar(String dateString) {
		return xmlGregorianCalendar(dateString, DEFAULT_YYYYMMDDHHMM);
	}

	/**
	 * String -> XMLGregorianCalendar
	 * Ko Youngjun (2017. 9. 18. 오후 4:20:41)
	 * desc   :
	 * @param
	 * @return XMLGregorianCalendar
	 */
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

	/**
	 * Date -> XMLGregorianCalendar
	 * Ko Youngjun (2017. 9. 18. 오후 4:20:50)
	 * desc   :
	 * @param
	 * @return XMLGregorianCalendar
	 */
	public static XMLGregorianCalendar xmlGregorianCalendar(Date date) {
		if(date == null) {
			return null;
		}

		try {
			SimpleDateFormat sdf = new SimpleDateFormat(ISO_STANDARD_DATE_FORMAT);
//			sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
			String dateString = sdf.format(date);
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(dateString);

//			GregorianCalendar gregorianCalendar = (GregorianCalendar)GregorianCalendar.getInstance();
//			gregorianCalendar.setTime(date);
//			return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar).;
		} catch (DatatypeConfigurationException e) {
			return null;
		}
	}

	public static XMLGregorianCalendar xmlGregorianCalendarUTC(Date date) {
		if(date == null) {
			return null;
		}

		try {
			SimpleDateFormat sdf = new SimpleDateFormat(ISO_STANDARD_DATE_FORMAT);
			sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
			String dateString = sdf.format(date);
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(dateString);
		} catch (DatatypeConfigurationException e) {
			return null;
		}
	}

	public static Date addHour(int amount) {
		return addHour(new Date(), amount);
	}

	public static Date addHour(Date date, int amount) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.HOUR_OF_DAY, amount);
		return cal.getTime();
	}

	/**
	 * add Calendar.DATE to new Date()
	 * Ko Youngjun (2017. 9. 18. 오후 4:20:59)
	 * desc   :
	 * @param
	 * @return Date
	 */
	public static Date addDate(int amount) {
		return addDate(new Date(), amount);
	}

	/**
	 * add Calendar.DATE
	 * Ko Youngjun (2017. 9. 18. 오후 4:21:24)
	 * desc   :
	 * @param
	 * @return Date
	 */
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

	/**
	 * add Calendar.Month to new Date()
	 * Ko Youngjun (2017. 9. 18. 오후 4:20:59)
	 * desc   :
	 * @param
	 * @return Date
	 */
	public static Date addMonth(int amount) {
		return addMonth(new Date(), amount);
	}

	/**
	 * add Calendar.Month
	 * Ko Youngjun (2017. 9. 18. 오후 4:21:24)
	 * desc   :
	 * @param
	 * @return Date
	 */
	public static Date addMonth(Date date, int amount) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, amount);
		return cal.getTime();
	}

	/**
	 * add Calendar.YEAR to new Date()
	 * Ko Youngjun (2017. 9. 19. 오전 9:03:39)
	 * desc   :
	 * @param
	 * @return Date
	 */
	public static Date addYear(int amount) {
		return addYear(new Date(), amount);
	}

	/**
	 * add Calendar.YEAR
	 * Ko Youngjun (2017. 9. 19. 오전 9:03:52)
	 * desc   :
	 * @param
	 * @return Date
	 */
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

	/**
	 * formatted date 날짜 간격 계산
	 * Ko Youngjun (2017. 11. 16. 오전 9:27:49)
	 * desc   :
	 * @param
	 * @return int
	 */
	public static int diff(String startDateString, String endDateString) {
		return diff(startDateString, endDateString, STANDARD_YYYYMMDD);
	}

	/**
	 * formatted date 날짜 간격 계산 (not default patterned)
	 * Ko Youngjun (2017. 11. 16. 오전 9:28:12)
	 * desc   :
	 * @param
	 * @return int
	 */
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

	/**
	 * date 날짜 간격 계산
	 * Ko Youngjun (2017. 11. 16. 오전 9:28:31)
	 * desc   :
	 * @param
	 * @return int
	 */
	public static int diff(Date startDate, Date endDate) {
		if(startDate == null || endDate == null) {
			return 0;
		}

		long diffMillis = endDate.getTime() - startDate.getTime();
		int diffDays = (int)(diffMillis / (24 * 60 * 60 * 1000));

		return diffDays;
	}

	/**
	 * date 날짜 간격 계산
	 * Ko Youngjun (2017. 11. 16. 오전 9:28:31)
	 * desc   :
	 * @param
	 * @return int
	 */
	public static int diff(XMLGregorianCalendar startDate, XMLGregorianCalendar endDate) {
		if(startDate == null || endDate == null) {
			return 0;
		}

		return diff(date(startDate), date(endDate));
	}
	
	
	public static Date getDateGMT(String year, String month, String date, String hour, String minute, String second, String gmt) {
		return getDateGMT(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(date),
				Integer.parseInt(hour), Integer.parseInt(minute), Integer.parseInt(second), Integer.parseInt(gmt));
	}
	
	public static Date getDate(String year, String month, String date, String hour, String minute, String second) {
		return getDateGMT(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(date),
				Integer.parseInt(hour), Integer.parseInt(minute), Integer.parseInt(second), 9);
	}
	
	/**
	 * 한국 시간을 기준으로 날짜를 설정합니다.
	 * wcjung
	 * @param year
	 * @param month
	 * @param date
	 * @param hour
	 * @param minute
	 * @param second
	 * @return
	 */
	public static Date getDate(int year, int month, int date, int hour, int minute, int second) {
		return getDateGMT(year, month, date, hour, minute, second, 9);
	}

	/**
	 * GMT를 기준으로 날짜를 설정합니다.
	 * 서버 시간계산이기 때문에, 한국 시간을 기준으로 설정합니다. (+9)
	 * wcjung
	 * @param year 2018
	 * @param month 08
	 * @param date 21
	 * @param hour 10
	 * @param minute 15
	 * @param second 00
	 * @param gmt +9 
	 * @return
	 */
	public static Date getDateGMT(int year, int month, int date, int hour, int minute, int second, int gmt) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, date, hour, minute, second);
		cal.add(Calendar.HOUR_OF_DAY, gmt - 9); // adds gmt 한국 시간 기준
		
		return cal.getTime();
	}
}