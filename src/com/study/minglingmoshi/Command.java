package com.study.minglingmoshi;

/**
 *  ������
 *  �нӿͻ�������������,��������������ĳ�Ա����,������ʹ��
 *  ����һ�����󷽷� execute,��������ʵ��
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����7:30:11
 * @since 1.0
 */
public abstract class Command {

	protected RequirementGroup rg = new RequirementGroup();// ������
	
	protected CodeGroup cg = new CodeGroup();// ������
	
	protected PageGroup pg = new PageGroup();// ������
	
	
	//�ͻ�Ҫ������� ��Ҫ��ʲô����
	public abstract void execute();
}
