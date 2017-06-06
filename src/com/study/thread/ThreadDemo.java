package com.study.thread;

/**
 *  ʵ��Runnable �ӿ� ʵ���̵߳Ĵ���
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����2:57:19
 * @since 1.0
 */
public class ThreadDemo {

	public static void main(String[] args) {
		
		Runnable r1 = new MyFirstRunnable();
		Runnable r2 = new MySecRunnable();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t2.start();
		t1.start();
		
		
	}
	
	public static synchronized void getMessage(String name){
		System.out.println("�߳�"+name+"���� ��ʼ");
	}
	 
}

class MyFirstRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("this is my first Thread");
		ThreadDemo.getMessage("t1");
		
	}
	
}

class MySecRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("this is my secound Thread");
		ThreadDemo.getMessage("t2");
		
	}
	
}


