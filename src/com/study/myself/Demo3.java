package com.study.myself;

/**
 * ������̬�İ󶨵������ڼ�Ķ���
 * @author LuHongGang
 * @date 2017��5��24��
 * @time ����11:11:58
 * @since 1.0
 */
public class Demo3 {

	public static void main(String[] args) {
		Zoo zo = new Zoo();
		//zo.a= 00;
		System.out.println("Zoo:"+zo);
	}
	
}

class Foo{
	int a=100;
	public Foo(){
		this.test();
	    System.out.println("Foo:"+this);
	}
	
	public void test(){
		System.out.println(" this is test method for Aoo "+a);
	}
}

class Zoo extends Foo{
	String b="133";
	public Zoo(){super();}
	
	public void test(){
		System.out.println(" this is test method for Zoo "+a+"  "+b);
	}
}