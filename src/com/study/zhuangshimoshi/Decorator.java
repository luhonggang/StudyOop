package com.study.zhuangshimoshi;

/**
 * װ���� Ҳ����˵ ��һ�� �м���  
 * ��������ʵ��  ȥ��չ��ͬ�Ĺ��� 
 *  �������: ��������������װ����SchoolReport������ ,��дreport()����
 * @author LuHongGang
 * @date 2017��6��5��
 * @time ����9:41:45
 * @since 1.0
 */
public abstract class Decorator extends SchoolReport{

	// �ɼ��� �϶����е�
	private SchoolReport sr;
	
	// ���ݳɼ�������
	public Decorator(SchoolReport sr){
		this.sr = sr;
	}
	
	/** ���ҵĳɼ������ҳ��� 
	 *  ���� ���õ�������ľ���ʵ��   Ŀ����:  >>> ����չ   ��̬������๦�ܵ�ʵ��
	 *  �Է�ֹ ������� ����
	 *  ����:�ҳ���������Ҫ ��һ�� ѧУ�ĳɼ���߷�  Ȼ�� �ſ��ҵĳɼ�
	 *       ���� �ҳ� ����Ҫ��һ�� �ҵ��������   Ȼ�� �ſ��ҵĳɼ�  �ȵ�
	 * **/
	public void report(){
		this.sr.report();
	}
	
	public void sign(String name){
		System.out.println(" �ҳ�ǩ��: "+name);
	}
}
