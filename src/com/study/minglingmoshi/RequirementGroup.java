package com.study.minglingmoshi;

/**
 * �������ǺͿͻ������������
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����7:24:07
 * @since 1.0
 */
public class RequirementGroup  extends Group{

	@Override
	public void find() {
		System.out.println("�ͻ��ҵ�������");
		
	}

	@Override
	public void add() {
		System.out.println("�ͻ�Ҫ�����һ���µ�����");
		
	}

	@Override
	public void delete() {
		System.out.println("�ͻ�Ҫ��ɾ��һ������");
		
	}

	@Override
	public void change() {
		System.out.println("�ͻ�Ҫ���޸�һ������");
		
	}

	@Override
	public void paln() {
		System.out.println("�ͻ�Ҫ��������ƻ�");
		
	}

	
}
