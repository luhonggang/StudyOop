package com.study.myself;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringTool {
	private static Logger log = LoggerFactory.getLogger(StringTool.class);

	private final static Random random = new Random();

	private final static String base = "abcdefghijklmnopqrstuvwxyz0123456789";

	private final static String numBase = "0123456789";

	/**
	 * ��������ַ���
	 * 
	 * @param numberFlag
	 * @param length
	 * @return
	 */
	public static String buildRandomString(boolean numberFlag, int length) {
		StringBuffer sb = new StringBuffer();
		String strBase = numberFlag ? numBase : base;
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(strBase.length());
			sb.append(strBase.charAt(number));
		}
		return sb.toString();
	}

	public static boolean isInArray(String str, String[] strArray) {
		boolean result = false;
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equals("")) {
				result = false;
			} else if (str.indexOf(strArray[i].trim()) != -1) {
				result = true;
				break;
			}
		}
		return result;
	}

	public static boolean isNull(String str) {
		String string = str;
		if (str == null)
			string = "";
		if (string.equals("")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isEmpty(StringBuffer sb) {
		if (sb == null) {
			return true;
		} else if ("".equals(sb.toString())) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isNotNull(String str) {
		String string = str;
		boolean result = true;
		if (str == null)
			string = "";
		if (!string.equals("")) {
			result = true;
		} else {
			result = false;
		}
		// System.out.println(str+":"+result);
		return result;
	}

	// ��д����ĸ
	public static String up1stLetter(String word) {
		char[] chars = word.toCharArray();
		if (chars[0] >= 'a' && chars[0] < 'z') {
			chars[0] = (char) (chars[0] - 32);
		}
		String up1srWord = new String(chars);
		return up1srWord;
	}

	// Сд����ĸ
	public static String lower1stLetter(String word) {
		char[] chars = word.toCharArray();
		if (chars[0] >= 'A' && chars[0] < 'Z') {
			chars[0] = (char) (chars[0] + 32);
		}
		String up1srWord = new String(chars);
		return up1srWord;
	}

	public static String toString(Object inObj, String dataFormat) {
		String obj = null;
		if (inObj != null) {
			if (inObj.getClass().equals(Date.class) || inObj.getClass().equals(Timestamp.class)) {
				obj = DateTool.formatDate((Date) inObj, dataFormat);
			} else if (inObj.getClass().equals(Timestamp.class)) {

				obj = DateTool.formatDate((Timestamp) inObj, dataFormat);
			} else {
				obj = inObj.toString();
			}
		} else {
			obj = "";
		}
		return obj;
	}

	/**
	 * ��������ִ���0��ָ��λ��
	 * 
	 * @param String
	 *            str Դ�ִ�
	 * @param int
	 *            totalSize ������λ��
	 * @return boolean
	 */
	public static String addZero(String str, int totalSize) {
		if (str == null)
			str = "";
		int length = str.length();
		if (totalSize == length) {
			return str;
		}
		if (totalSize < length) {
			return str.substring(length - totalSize, length - 1);
		}
		for (int i = 0; i < totalSize - length; i++) {
			str = "0" + str;
		}
		return str;
	}

	/**
	 * �����ַ����ĸ���������ǰ��'0'��
	 * 
	 * @param String
	 *            str Դ�ִ�
	 * @return str
	 */
	public static String trimLeadingZero(String str) {
		if (str == null || str.length() == 0)
			return str;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(0) == '0') {
				str = str.substring(1);
			} else {
				break;
			}
		}
		return str;
	}

	public static String nullToEmpty(Object sourceString) {
		if (sourceString == null) {
			return "";
		}
		return sourceString.toString();
	}

	public static Object StringToObj(String s, Class clazz) {
		Object obj = null;
		if (s.equals("NULL")) {
			obj = null;
		} else if (clazz.equals(Integer.class)) {
			obj = Integer.parseInt(s);
		} else if (clazz.equals(int.class)) {
			obj = Integer.parseInt(s);
		} else if (clazz.equals(Long.class)) {
			obj = Long.parseLong(s);
		} else if (clazz.equals(long.class)) {
			obj = Long.parseLong(s);
		} else if (clazz.equals(Double.class)) {
			obj = Double.parseDouble(s);
		} else if (clazz.equals(double.class)) {
			obj = Double.parseDouble(s);
		} else if (clazz.equals(Date.class)) {
			try {
				obj = DateTool.parseoDate(s, "yyyy-MM-dd HH:mm:ss:SSS");
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} else if (clazz.equals(String.class)) {
			obj = s;
		} else {
			// ��֧������
			log.info("��֧������:" + clazz.getName());
		}
		return obj;
	}

	public static String ObjToString(Object obj) {
		String str = null;
		if (obj == null) {
			str = "";
		} else {
			Class clazz = obj.getClass();
			if (clazz.equals(Integer.class)) {
				str = obj.toString();
			} else if (clazz.equals(int.class)) {
				str = obj + "";
			} else if (clazz.equals(Long.class)) {
				str = obj.toString();
			} else if (clazz.equals(long.class)) {
				str = obj + "";
			} else if (clazz.equals(Double.class)) {
				str = obj.toString();
			} else if (clazz.equals(double.class)) {
				str = obj + "";
			} else if (clazz.equals(Date.class)) {
				str = DateTool.formatDate((Date) obj, "yyyy-MM-dd HH:mm:ss:SSS");

			} else if (clazz.equals(String.class)) {
				str = obj + "";

			} else if (clazz.getSimpleName().endsWith("Exception")) {

				str = ((Exception) obj).getMessage();

			} else {
				// ��֧������
				log.info("��֧������:" + clazz.getName());
				str = "";
			}
		}
		return str;
	}

	/**
	 * ����д��ĸ�ָ��ַ���
	 * 
	 * @return
	 */
	public static List<String> splitByUpLetter(String str) {
		List<String> list = new ArrayList();
		char[] c = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < c.length; i++) {
			if (Character.isUpperCase(c[i])) {
				list.add(sb.toString());
				sb = new StringBuffer();
			}
			sb.append(c[i]);
			if (i == c.length - 1) {
				list.add(sb.toString());
			}
		}
		return list;
	}

	public static void main(String[] args) {
		String str = "insureApplyDao";
		List l = StringTool.splitByUpLetter(str);
		System.out.println(l);
		
		String s = buildRandomString(true,10);
		System.out.println(s);
	}
}
