package com.study.myself;

/**
 * ��ļ̳�  
 * ��������д
 * ������д�����еķ���  >> �����෽���ķ���ǩ���ͷ���ֵ���Ͷ�����͸����еķ�����ǩ���ͷ���ֵ����һ��
 * ע��:����ֵ�����ͱ���һ��
 * @author LuHongGang
 * @date 2017��5��24��
 * @time ����10:21:26
 * @since 1.0
 */
public class Sun extends Father{

	public String name="mmm";
	public int runCar(){
		System.out.println("�����ǻῪ��");
		return 1;
	}
	public static void main(String[] args) {
		Sun s = new Sun();
		System.out.println(s.name);// �����
		
		/**
		 * �����಻���� public String name="mmm"; 
		 * ���ٴ�ʹ��s.name���õľ��Ǹ����з�private���εı���name
		 */
		
	}
}
