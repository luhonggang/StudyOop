package com.study.minglingmoshi;

/**
 *  ����ģʽ
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����7:17:23
 * @since 1.0
 */
public class Client {

	public static void main(String[] args) {
		
		// ��ͷ�� ����Ŀͻ�Ҫ����: ���һ�� �µ�����
		Invoker invoker = new Invoker(new AddRequirementCommand());//����һ����ͷ��
		
		// ��ͷ�� ���յ��ͻ� Ҫ���һ�������������   ������ִ������
		invoker.execute();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// ��ͷ�˽��յ��ͻ���ɾ��һ��ҳ�������
		Invoker invoker2 = new Invoker(new DeletePageCommand());
		
		invoker2.execute();
		
	}
}
