package com.study.thread;

/**
 *  �̳�Thread�� �����߳�
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����3:01:47
 * @since 1.0
 * �̳й�ϵ:�̳���һ�����������Ǽ�ͷ��ʵ�߱�ʾ��������ָ���࣬�����ӽӿ�ָ�򸸽ӿڡ� 
 */
public class ThreadDemo01 extends Thread{

	public static void main(String[] args) {
		Thread t1 = new ThreadDemo01();
		t1.start();
		
	}
	
	public void run(){
		System.out.println(" �̳�Thread �� ��дrun����");
	}
}
