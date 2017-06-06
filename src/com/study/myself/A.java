package com.study.myself;

public class A {
	int a = 10;
	public A(){
		System.out.println("父类构造");
		/** 方法动态地绑定到运行期间的对象上  当前运行的对象是new B() **/
		show();
	}
	
	public void show(){
		System.out.println("输出父类成员值:"+a+"~~~~~~~~~~~");
	}
	
	public static void main(String[] args) {
		
		new B();
		//new A();
	}
	
}

class B extends A{
	int b = 20;
	/** 注:> 构造方法 作用:初始化成员变量的数据值 **/
	public B(){
		//super();
		System.out.println("子类构造");
	    show();
	}
	
	public void show(){
		System.out.println("输出子类成员值:"+a+"~~~~~~~~~~~"+b);
	}
}
