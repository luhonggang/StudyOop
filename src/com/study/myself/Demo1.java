package com.study.myself;

/**
 *  �������;������ʵ�����
 * @author LuHongGang
 * @date 2017��5��24��
 * @time ����11:00:32
 * @since 1.0
 */
public class Demo1 {
	
	public static void main(String[] args) {
		Cheater c = new Cheater();// 
		Person p =c;// �������͵�����ָ������Ķ���   >> Person p = new Cheater(); 
		System.out.println(p.name+"  "+c.name);// �ɱ��������;��������Ǹ�����
		
		/***������̬�󶨵� ���� �ķ���**/
		p.whoau();
		c.whoau();
		
	}
	
}

class Person{
	 String name="��̫��";
	public void whoau(){
		System.out.println(this.name);
	}
}

class Cheater extends Person{//Cheator :ƭ��
	 String name = "ϲ����";
	public void whoau(){
		System.out.println(this.name);
	}
}