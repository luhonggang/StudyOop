package com.study.myself;

/**
 *  
 * @author LuHongGang
 * @date 2017��5��24��
 * @time ����10:55:37
 * @since 1.0
 * 
 * ������̬�İ󶨵������ڼ�Ķ���ķ���
 * ����������д : 
 *  �����Ǹ������͵����û����������͵����� ���õķ�������������д��İ汾
 */
public class Demo2 {
	
	public static void main(String[] args) {
		 Aoo ao = new Boo();// �������͵ı���ao  > �������͵ı�������������Ķ���
		 ao.test();
		 Boo bo = new Boo();// �������͵ı���bo
		 bo.test();
	}

}

class Aoo{
	public void test(){
		System.out.println("Moo test()");
	}
}

class Boo extends Aoo{
	public void test(){
		System.out.println("Boo test()");
	}
}
