package com.study.myself;

/**
 *  
 * @author LuHongGang
 * @date 2017年5月24日
 * @time 上午10:55:37
 * @since 1.0
 * 
 * 方法动态的绑定到运行期间的对象的方法
 * 方法发生重写 : 
 *  不管是父类类型的引用还是子类类型的引用 调用的方法都是子类重写后的版本
 */
public class Demo2 {
	
	public static void main(String[] args) {
		 Aoo ao = new Boo();// 父类类型的变量ao  > 父类类型的变量引用了子类的对象
		 ao.test();
		 Boo bo = new Boo();// 子类类型的变量bo
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
