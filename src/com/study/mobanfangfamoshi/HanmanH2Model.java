package com.study.mobanfangfamoshi;

/**
 * ���� �ͺ� H2
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����10:16:48
 * @since 1.0
 */
public class HanmanH2Model extends HanmanModel{

	@Override
	public void start() {
		System.out.println("����H2����");
		
	}

	@Override
	public void stop() {
		System.out.println("����H2ֹͣ");
		
	}

	@Override
	public void alarm() {
		System.out.println("����H2����");
		
	}

	@Override
	public void enginBoom() {
		System.out.println("����H2��������������");
		
	}
	// ���ӷ��� H2�ͺŵĺ��� ����Ĭ�ϲ�����
    protected boolean isAlarm(){
		
		return false;
	}

}
