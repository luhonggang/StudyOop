package com.study.myself;

public class A {
	int a = 10;
	public A(){
		System.out.println("���๹��");
		/** ������̬�ذ󶨵������ڼ�Ķ�����  ��ǰ���еĶ�����new B() **/
		show();
	}
	
	public void show(){
		System.out.println("��������Աֵ:"+a+"~~~~~~~~~~~");
	}
	
	public static void main(String[] args) {
		
		new B();
		//new A();
	}
	
}

class B extends A{
	int b = 20;
	/** ע:> ���췽�� ����:��ʼ����Ա����������ֵ **/
	public B(){
		//super();
		System.out.println("���๹��");
	    show();
	}
	
	public void show(){
		System.out.println("��������Աֵ:"+a+"~~~~~~~~~~~"+b);
	}
}
