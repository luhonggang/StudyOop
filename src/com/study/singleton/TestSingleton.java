package com.study.singleton;

/**
 *  ����ģʽ ������
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����7:14:02
 * @since 1.0
 */
public class TestSingleton {

	public static void main(String[] args) {
		
		Emperor e1 = Emperor.getInstance();
		e1.emperorMsg();
		
		Emperor e2 = Emperor.getInstance();
		
		System.out.println(e1.equals(e2));
		System.out.println(e1==e2);
	}
	
}
