package com.study.exception;

/**
 * Throw �ؼ��ʵ� ʹ�� 
 *  throw�ؼ��� :���������׳�һ���쳣
 *   �����ǵķ������ִ����ʱ��,���������ֲ�����,����֪ͨ���÷���(���÷�)ȥ���
 *   ��ʱ��,���Ǿ���Ҫͨ�� throw�ķ�ʽ �׳��쳣�����   
 *   ����൱����:˭����˭���
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����10:23:51
 * @since 1.0
 */

public class ExceptionDemo02 {

	public static void main(String[] args) {
		
		try {
			test(null);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println(" ��ָ���쳣 ");
		}
		
		
	}
	
	// ���� test �׳����쳣 ���Ǹ��� main����������
	public static void test(String str){
		try {
			int num = str.lastIndexOf(" ");
		} catch (Exception e) {
			//e.printStackTrace();
			throw e;
		}
	}
}
