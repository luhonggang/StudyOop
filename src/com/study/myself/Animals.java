package com.study.myself;

/**
 *  抽象类是可以有构造函数的,但不可实例化
 * @author LuHongGang
 * @date 2017年5月24日
 * @time 下午2:16:58
 * @since 1.0
 */
public abstract class Animals {

	public String name;//名字
	public int size;//大小
	public String color;//体色
	public double number;//重量
	
	public Animals(){
		System.out.println(" 调用了我的无参构造  ");
	}
	
	public Animals(String s){}
	
	public void eat(Animals a){
		System.out.println(a+">>>>>>>>>在吃<<<<<<<<<");
	}
	
	public void run(){
		System.out.println(">>>>>>>>>>>可以行走<<<<<<<<<<<");
	}
}
