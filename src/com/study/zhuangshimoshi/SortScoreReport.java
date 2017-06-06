package com.study.zhuangshimoshi;

/**
 * �ҳ�Ҫ��  ��֪��  �ҵ��������
 * @author LuHongGang
 * @date 2017��6��5��
 * @time ����9:56:45
 * @since 1.0
 */
public class SortScoreReport extends Decorator{

	public SortScoreReport(SchoolReport sr) {
		super(sr);
	}
	
	// �㱨һ�� �������
	private void reportSort(){
		System.out.println("�ҵ������� 30��");
	}
	
	// �ҳ� ����ɼ����� ������ ,��ǿ����
	public void report(){
		super.report();
		this.reportSort();
	}
	
}
