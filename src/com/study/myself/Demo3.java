package com.study.myself;

/**
 * 方法动态的绑定到运行期间的对象
 * @author LuHongGang
 * @date 2017年5月24日
 * @time 上午11:11:58
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