package com.study.minglingmoshi;

/**
 * ������ �������ҳ��չ��
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����7:26:23
 * @since 1.0
 */
public class PageGroup extends Group{

	@Override
	public void find() {
		System.out.println("�ͻ��ҵ�������");
		
	}

	@Override
	public void add() {
		System.out.println("�ͻ�Ҫ������һ��ҳ��");
		
	}

	@Override
	public void delete() {
		System.out.println("�ͻ�Ҫ��ɾ��һ��ҳ��");
		
	}

	@Override
	public void change() {
		System.out.println("�ͻ�Ҫ���޸�һ��ҳ��");
		
	}

	@Override
	public void paln() {
		System.out.println("�ͻ�Ҫ����ҳ��ƻ�");
		
	}

}
