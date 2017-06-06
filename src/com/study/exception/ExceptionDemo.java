package com.study.exception;

import com.mysql.jdbc.Driver;

/**
 * Java���쳣�������
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����10:02:28
 * @since 1.0
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
			String str = null;
			//int num = str.indexOf("s");   ��NullPointerException ����
			
		    //int numStr = Integer.parseInt(str); // ��NumberFormatException����
		    Class<?> driver = Class.forName("com.mysql.driver");// ��Exception ������
		} catch (NullPointerException e) {
			/**
			 *  e.printStackTrace() �����쳣�¼�����ʱִ�еĶ�ջ�����
			 *  e.getMessage()      �����õ��й��쳣�¼�����Ϣ
			 */
			e.printStackTrace();
			System.out.println(" output this Exception: "+e.getMessage());
		} catch (NumberFormatException e2){
			e2.printStackTrace();
			System.out.println(" output this Exception: "+e2.getMessage());
		} catch (Exception e3){
			e3.printStackTrace();
			System.out.println(" output this Exception : "+e3.getMessage());
		} finally{
			System.out.println("�쳣�������˵��: catch�Ĳ������������µ�,���Բ�Ҫ�Ѹ����쳣д�������쳣������,���������쳣��Զû�л��ᴦ��");
		}
	}
}
