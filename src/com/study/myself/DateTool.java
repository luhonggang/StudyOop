package com.study.myself;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTool {

	public static final Date parseoDate(String strDate, String format) throws ParseException {
		SimpleDateFormat df = null;
		Date date = null;
		df = new SimpleDateFormat(format);

		try {
			date = df.parse(strDate);
		} catch (ParseException pe) {
			throw new ParseException(pe.getMessage(), pe.getErrorOffset());
		}

		return (date);
	}

	public static final String formatDate(Date aDate, String aMask) {
		SimpleDateFormat df = null;
		String returnValue = "";

		if (aDate == null) {
			System.out.println("ʱ�����Ϊ��");
		} else {
			df = new SimpleDateFormat(aMask);
			returnValue = df.format(aDate);
		}

		return (returnValue);
	}

	public static final String formatDate(Timestamp aDate, String aMask) {
		SimpleDateFormat df = null;
		String returnValue = "";

		if (aDate == null) {
			System.out.println("ʱ�����Ϊ��");
		} else {
			df = new SimpleDateFormat(aMask);
			returnValue = df.format(aDate);
		}

		return (returnValue);
	}

	public static final String reFormatDate(String dateStr, String srcFormat, String targetFormat)
			throws ParseException {

		Date aDate = DateTool.parseoDate(dateStr, srcFormat);
		SimpleDateFormat df = null;
		String returnValue = "";

		if (aDate == null) {
			System.out.println("ʱ�����Ϊ��");
		} else {
			df = new SimpleDateFormat(targetFormat);
			returnValue = df.format(aDate);
		}

		return (returnValue);
	}

	public static String getNowTimestamp() {
		return String.valueOf(new Date().getTime());
	}

	/**
	 * ��ȡ����
	 * 
	 * @param birthDay
	 * @return
	 * @throws Exception
	 */
	public static int getAge(Date birthDay) throws Exception {
		Calendar cal = Calendar.getInstance();
		if (cal.before(birthDay)) {
			throw new IllegalArgumentException("The birthDay is before Now.It's unbelievable!");
		}
		int yearNow = cal.get(Calendar.YEAR);
		int monthNow = cal.get(Calendar.MONTH);
		int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
		cal.setTime(birthDay);

		int yearBirth = cal.get(Calendar.YEAR);
		int monthBirth = cal.get(Calendar.MONTH);
		int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

		int age = yearNow - yearBirth;

		if (monthNow <= monthBirth) {
			if (monthNow == monthBirth) {
				if (dayOfMonthNow < dayOfMonthBirth)
					age--;
			} else {
				age--;
			}
		}
		return age;
	}

	/**
	 * �������ջ�ʣ������
	 * 
	 * @param birthday
	 * @return
	 * @throws ParseException
	 */
	public static int getLeftDays(Date birthday) throws ParseException {
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyyMMdd");
		String clidate = formatDate(birthday, "yyyyMMdd");
		Calendar cToday = Calendar.getInstance(); // �����
		Calendar cBirth = Calendar.getInstance(); // ������
		cBirth.setTime(myFormatter.parse(clidate)); // ��������
		cBirth.set(Calendar.YEAR, cToday.get(Calendar.YEAR)); // �޸�Ϊ����
		int days;
		if (cBirth.get(Calendar.DAY_OF_YEAR) < cToday.get(Calendar.DAY_OF_YEAR)) {
			// �����Ѿ����ˣ�Ҫ���������
			days = cToday.getActualMaximum(Calendar.DAY_OF_YEAR) - cToday.get(Calendar.DAY_OF_YEAR);
			days += cBirth.get(Calendar.DAY_OF_YEAR);
		} else {
			// ���ջ�û��
			days = cBirth.get(Calendar.DAY_OF_YEAR) - cToday.get(Calendar.DAY_OF_YEAR);
		}
		return days;
	}
}


