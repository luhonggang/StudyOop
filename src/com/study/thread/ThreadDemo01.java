package com.study.thread;

/**
 *  继承Thread类 创建线程
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 下午3:01:47
 * @since 1.0
 * 继承关系:继承用一条带空心三角箭头的实线表示，从子类指向父类，或者子接口指向父接口。 
 */
public class ThreadDemo01 extends Thread{

	public static void main(String[] args) {
		Thread t1 = new ThreadDemo01();
		t1.start();
		
	}
	
	public void run(){
		System.out.println(" 继承Thread 类 重写run方法");
	}
}
