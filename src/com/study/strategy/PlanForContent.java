package com.study.strategy;

/**
 *  ִ�мƻ�������
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����4:37:43
 * @since 1.0
 * ������൱�� ����
 * ��ʱ ��PlanForContent ����Plan��
 * 1.������ϵ: ����Aָ����B����ͷ���߱�ʾ  ������ ��PlanForContent ָ��Plan��
 * �����ڴ�����棬Ϊ��B��Ϊ��������A��ĳ��method������ʹ��
 * ���� Ϊ��Plan��Ϊ��������PlanForContent�ڹ��캯��PlanForContent()��ʹ��
 * 
 * 2.������ϵ : �����ڴ�����棬Ϊ��������B�����������ʽ�����ڹ�����A�У�Ҳ�����ǹ�����A������һ������Ϊ��������B��ȫ�ֱ�����
 *           ��UML��ͼ����У�������ϵ���ɹ�����Aָ�򱻹�����B�Ĵ���ͷʵ�߱�ʾ���ڹ��������˿��Ա�ע����˫���Ľ�ɫ�Ͷ����Ա�ǡ�
 *   �ҵ����:������ϵ ����һ��  ǿ������ϵ
 */
public class PlanForContent {

	private Plan plan;// ��������Plan ����PlanForContent�����Ե���ʽ�����ڵ�ǰ����
	
	public PlanForContent(Plan plan){	
		this.plan = plan;
	}
	
	// ��ʽ��ʹ�üƻ���,ִ�� ����ļƻ�����
	public void operate(){
		this.plan.option();
	}
}
