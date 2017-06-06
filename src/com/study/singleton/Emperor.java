package com.study.singleton;

/**
 * �ʵ���  ������
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����6:59:44
 * @since 1.0
 */
public class Emperor {
	private static Emperor emperor = null;
	
	private Emperor(){
		// ���ܹ��ⲿ��������ʵ���� ,ֻ���Լ�ʵ����
	}
	
	public static Emperor getInstance(){
		
		if(emperor == null){// ��û�г�ʼ�� �ͳ�ʼ�� һ��
			emperor = new Emperor();
		}
		return emperor;
	}
	
	public static void emperorMsg(){
		System.out.println("������һ������");
	}
}
