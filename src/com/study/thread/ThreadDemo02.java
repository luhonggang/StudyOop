package com.study.thread;

/**
 *  �����ڲ���ķ�ʽ�����߳�
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����3:02:22
 * @since 1.0
 */
public class ThreadDemo02 {

	public static void main(String[] args) {
		
		new Thread(){
			public void run(){
				System.out.println("�����ڲ���ķ�ʽ�����߳�");
			}
		}.start();
	}
}
