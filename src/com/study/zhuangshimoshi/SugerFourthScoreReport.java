package com.study.zhuangshimoshi;

/**
 *  ������ 
 *  Suger ��Ϊ �ǵ���˼ 
 * @author LuHongGang
 * @date 2017��6��5��
 * @time ����9:18:34
 * @since 1.0
 */
public class SugerFourthScoreReport extends FourthScoreReport{

	// ��������: 1 ���ȱ������ ѧУ��߳ɼ�
	private void reportHighScore(){
		System.out.println("����ѧУ�����߳ɼ���: ���� 80 ��ѧ 80 Ӣ�� 90 ���� 60");
	}
	
	// �㱨һ�� �������
	private void reportSort(){
		System.out.println("�ҵ������� 30��");
	}
	
	// ��ʱ�� �㱨�������Ѿ������˱�� 
	public void report(){
		this.reportHighScore();// �Ȼ㱨ѧУ����߳ɼ�
		super.report();        // Ȼ����ҳ����ҵĳɼ���
		this.reportSort();     // ���������ҵĳɼ�����
	}
}
