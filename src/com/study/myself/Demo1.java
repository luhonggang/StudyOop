package com.study.myself;

/**
 *  引用类型决定访问的属性
 * @author LuHongGang
 * @date 2017年5月24日
 * @time 上午11:00:32
 * @since 1.0
 */
public class Demo1 {
	
	public static void main(String[] args) {
		Cheater c = new Cheater();// 
		Person p =c;// 父类类型的引用指向子类的对象   >> Person p = new Cheater(); 
		System.out.println(p.name+"  "+c.name);// 由变量的类型决定访问那个属性
		
		/***方法动态绑定到 对象 的方法**/
		p.whoau();
		c.whoau();
		
	}
	
}

class Person{
	 String name="灰太狼";
	public void whoau(){
		System.out.println(this.name);
	}
}

class Cheater extends Person{//Cheator :骗子
	 String name = "喜洋洋";
	public void whoau(){
		System.out.println(this.name);
	}
}