package com.study.myself;

/**
 *  ������Ĺ�ϵ ֮  �̳�
 * @author LuHongGang
 * @date 2017��5��24��
 * @time ����9:25:52
 * @since 1.0
 */
public class Tiger extends Animals {

	// ��д  ������ǩ����ͬ.������(������ʵ�ֲ�ͬ)
	public void run(){
		System.out.println("Tiger like person,There are running and walking");
	}
	
	public Tiger(){
		super();// ����������������һ������������ʸ���Ĺ�����,��������ÿһ�����캯���ĵ�һ�ж���ʽ�ĵ����˸���Ĺ�����
	}
	public Tiger(String s){
		//super();  ������ʵ����һ��super() ��Ĭ����ʽ�ĵ��ø�����޲ι���
		
		//super. ���ø���ı����ͷ���
		System.out.println(super.color="black");
		super.run();
		
		System.out.println("������вι��캯��Ҳ�����˸�����޲ι���");
	}
	public static void main(String[] args) {
		/**
		 * 1. ����̳и��� ��,��ı������õķ���ʼ����������д��İ汾
		 *  ����,����������Ӧ���Լ���ӵ�еķ���
		 */
		Tiger t = new Tiger();
		Animals a1 = t;//��������a1���������͵�ʵ��
		
		t.run();
		t.color="blue";
		Animals a = new Tiger();
		
		a.run();
		
		/**
		 * 2. 
		 */
		Tiger t2 = new Tiger("�ϻ�");
		
		
		

	}

}
