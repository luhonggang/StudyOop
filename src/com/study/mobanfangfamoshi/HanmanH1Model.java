package com.study.mobanfangfamoshi;

/**
 * ���� �ͺ�H1
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����10:14:12
 * @since 1.0
 */
public class HanmanH1Model extends HanmanModel{

	/**
	 *  ���ӵ��������벻�� ,Ӧ����ȫ���ɿͻ������յ�,�������Ǹ��������
	 */
	private boolean alarmFlag = true;  //�Ƿ�Ҫ������
	
	@Override
	public void start() {
		System.out.println("����H1����");
		
	}

	@Override
	public void stop() {
		System.out.println("����H1ֹͣ");
		
	}

	@Override
	public void alarm() {
		System.out.println("����H1����");
		
	}

	@Override
	public void enginBoom() {
		System.out.println("����H1��������������");
		
	}
	
	// override �����з���
	protected boolean isAlarm(){
		return this.alarmFlag;
	}
	
	// Ҫ��Ҫ������,�ɿͻ�������
	public void setAlarm(boolean isAlarm){
		this.alarmFlag = isAlarm;
	}

}
