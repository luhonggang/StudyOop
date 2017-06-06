package com.study.oop.day01;

/** Direct field access is determined at compile time.
 * Java����������ķ��ʲ������ɱ�������������˲��Ƕ�̬�ġ�����������ͬ�����Զ�����䲻ͬ�Ĵ洢�ռ�
 * �������ֶεķ�����Java�Ķ����������������  
 * ����.����
 * @author LuHongGang
 * @date 2017��6��5��
 * @time ����4:48:49
 * @since 1.0
 */
public class FieldAccess {

	 public static void main(String[] args) {

	     Super sup = new Sub();

	     System.out.println("sup.filed = " + sup.field + 

	             ", sup.getField() = " + sup.getField());

	     Sub sub = new Sub();

	     System.out.println("sub.filed = " + sub.field + 

	             ", sub.getField() = " + sub.getField() + 

	             ", sub.getSuperField() = " + sub.getSuperField());

	 }


	}

class Super {

 public int field = 0;

 public int getField() {

     return field;

 }

}

class Sub extends Super {

 public int field = 1;

 public int getField() {

     return field;

 }

 public int getSuperField() {

     return super.field; // ������ø���ķ��������Ե� ��ʽ  super.����ķ���/����

 }

}
