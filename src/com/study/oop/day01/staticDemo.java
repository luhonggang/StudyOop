package com.study.oop.day01;
/**
 * ���ĳ�������Ǿ�̬ ��,������Ϊ�Ͳ����ж�̬��
 * @author LuHongGang
 * @date 2017��6��5��
 * @time ����4:19:21
 * @since 1.0
 * ���캯���������ж�̬�ԣ�����ʵ������static������
 * ֻ������static��������ʽ�ġ���ˣ����캯�����ܹ���override��
 */
public class staticDemo {

	public static void main(String[] args) {
 
		StaticSuper ss = new StaticSub();
		ss.StaticMethod();                              // ������õ��Ǹ����еľ�̬����  ���಻�ܶ���д�����еĸþ�̬����
		ss.NotStaticMethod();
		//ss.ThisMethodIsNotExistsInSuper();            // ������벻ͨ��,��������   ��ʼ����Ķ���ֻ�ܵ��� �������͵ķ���������
		/**
		 * Java ����������: �������͵����� ָ������Ķ���
		 * StaticSuper ss = new StaticSub();
		 */
		
		StaticSuper ss2 =  new StaticSuper();           // ��������
		StaticSub  ss3 = (StaticSub) ss;              
		//ss2.ThisMethodIsNotExistsInSuper();
		//StaticSub ss4 = (StaticSub) new StaticSuper();//����ͨ�� ,�����쳣
		//ss3.ThisMethodIsNotExistsInSuper(); ����ʱ�쳣
		System.out.println(ss3.name);
		
		// �����������͵�ʱ�� ��Ҫʹ��instanceof 
		if(ss2 instanceof StaticSub){                   // �������� ��ʱ��ǿ����Ҫ���� �ж�  false
			StaticSub ss5 = (StaticSub) ss2;
            System.out.println(ss5.name);
			
		}else{
			System.out.println(" ��߶������ұ����ʵ�� ");
		}
		
		if(ss instanceof StaticSub){                    // true
			StaticSub ss6 = (StaticSub) ss;
			System.out.println(" ��߶������ұ����ʵ�� ");
			ss6.ThisMethodIsNotExistsInSuper();         //
		}
	}

}

class StaticSuper{
	public static void StaticMethod(){
		System.out.println("����   ����   �ľ�̬����");
	}
	
	public void NotStaticMethod(){
		System.out.println("����   ����   �ķǾ�̬����");
	}
}

class StaticSub extends StaticSuper{
	String name = "10010";
	public static void StaticMethod(){
		System.out.println("����  ����  �ľ�̬����");
	}
	
	public void NotStaticMethod(){
		System.out.println("����  ����  �ķǾ�̬����");
	}
	/**
	 *  �÷��� �ڸ����в�������,�����������ж���  
	 *  
	 */
	public void ThisMethodIsNotExistsInSuper(){
		System.out.println("������������еķ���,���� �����һ����չ");
	}
}
