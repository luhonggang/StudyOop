package com.study.myself;

/**
 *  类与类的关系 之  继承
 * @author LuHongGang
 * @date 2017年5月24日
 * @time 上午9:25:52
 * @since 1.0
 */
public class Tiger extends Animals {

	// 重写  方法的签名相同.方法体(方法的实现不同)
	public void run(){
		System.out.println("Tiger like person,There are running and walking");
	}
	
	public Tiger(){
		super();// 所有子类中至少有一个构造器会访问父类的构造器,且子类中每一个构造函数的第一行都隐式的调用了父类的构造器
	}
	public Tiger(String s){
		//super();  这里其实是有一个super() 来默认隐式的调用父类的无参构造
		
		//super. 调用父类的变量和方法
		System.out.println(super.color="black");
		super.run();
		
		System.out.println("子类的有参构造函数也调用了父类的无参构造");
	}
	public static void main(String[] args) {
		/**
		 * 1. 子类继承父类 后,类的变量调用的方法始终是子类重写后的版本
		 *  否则,就是他们相应的自己所拥有的方法
		 */
		Tiger t = new Tiger();
		Animals a1 = t;//父类类型a1引用子类型的实例
		
		t.run();
		t.color="blue";
		Animals a = new Tiger();
		
		a.run();
		
		/**
		 * 2. 
		 */
		Tiger t2 = new Tiger("老虎");
		
		
		

	}

}
