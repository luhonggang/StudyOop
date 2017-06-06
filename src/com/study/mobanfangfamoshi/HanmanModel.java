package com.study.mobanfangfamoshi;

/**
 *  ������ 
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����10:09:30
 * @since 1.0
 */
public abstract class HanmanModel {

	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	protected abstract void enginBoom();

	public final void run(){// ���಻���޸ĸ÷���,��������Ϊfinal����
		// �ȷ�������
		this.start();
		
		// ���濪ʼ����
		this.enginBoom();
		
		// Ȼ��Ϳ�ʼ����,�ܵĹ����� ���ʵػ�����
		if(this.isAlarm()){
			this.alarm();
		}
		
		// ������ ,��ЪϢһ��
		this.stop();
	}
	
	/**
	 * �ͻ�������������,˵����һ�������Ⱦͻ���,Ӧ������������������
	 * ������ �����һ�� ���ӷ���  Ĭ���ǻ����
	 */
	protected boolean isAlarm(){
		
		return true;
	}
}
