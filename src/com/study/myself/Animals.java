package com.study.myself;

/**
 *  �������ǿ����й��캯����,������ʵ����
 * @author LuHongGang
 * @date 2017��5��24��
 * @time ����2:16:58
 * @since 1.0
 */
public abstract class Animals {

	public String name;//����
	public int size;//��С
	public String color;//��ɫ
	public double number;//����
	
	public Animals(){
		System.out.println(" �������ҵ��޲ι���  ");
	}
	
	public Animals(String s){}
	
	public void eat(Animals a){
		System.out.println(a+">>>>>>>>>�ڳ�<<<<<<<<<");
	}
	
	public void run(){
		System.out.println(">>>>>>>>>>>��������<<<<<<<<<<<");
	}
}
