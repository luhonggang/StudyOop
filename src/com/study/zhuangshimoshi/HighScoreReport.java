package com.study.zhuangshimoshi;

/**
 * �ҳ�Ҫ�� �ȿ� ѧУÿ����ߵĳɼ�
 * @author LuHongGang
 * @date 2017��6��5��
 * @time ����9:52:51
 * @since 1.0
 */
public class HighScoreReport extends Decorator{

	public HighScoreReport(SchoolReport sr) {  // ������ϵ
		super(sr);
	}
	
	// ��������: 1 ���ȱ������ ѧУ��߳ɼ�
	public void reportHighScore(){
		System.out.println("����ѧУ�����߳ɼ���: ���� 80 ��ѧ 80 Ӣ�� 90 ���� 60");
	}
	
	// 
	public void report(){
		this.reportHighScore();// ����װ�����װ�η��� reportHighScore()
		super.report();        // ���þ�������ʵ��report() ����
	}
}
