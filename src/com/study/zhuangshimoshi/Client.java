package com.study.zhuangshimoshi;

/**
 * װ��ģʽ
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����7:55:54
 * @since 1.0
 */
public class Client {

	public static void main(String[] args) {
		
		// ԭʼ�ĳɼ��� �ó��� 
		SchoolReport sr = new FourthScoreReport();
		
		// �ȿ�ѧУÿ����߳ɼ�
		HighScoreReport hsr = new HighScoreReport(sr);
		
		hsr.report();
		hsr.sign("����");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// �����ҵ�����������ҳ���
		SortScoreReport ssr = new SortScoreReport(sr);
		
		ssr.report();
		ssr.sign("����");
		
		
	}
}
