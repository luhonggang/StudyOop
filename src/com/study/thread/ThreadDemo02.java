package com.study.thread;

/**
 *  匿名内部类的方式创建线程
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 下午3:02:22
 * @since 1.0
 */
public class ThreadDemo02 {

	public static void main(String[] args) {
		
		new Thread(){
			public void run(){
				System.out.println("匿名内部类的方式创建线程");
			}
		}.start();
	}
}
