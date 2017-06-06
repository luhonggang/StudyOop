package com.study.abstractfactorymethod;

/**
 *  Ů� ����    
 *   ������� �Ա�ͬ�� ������� 
 *   ���� �޹ش���ʲô�����͵����ֳ���  
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����8:31:17
 * @since 1.0
 * ���󹤳�����ģʽ
 */
public class NvWa {

	public static void main(String[] args) {
		
		// ����������
		HumanFatory manFactory  = new MaleHumanFactory();
		
		// Ů��������
		HumanFatory womanFactory = new FeMaleHumanFactory();
		
		// ��ʼ��������
		Human maleYellowHuman = manFactory.createYellowHuman();
		
		Human feMaleYellowHuman = womanFactory.createYellowHuman();
		
		maleYellowHuman.cry();
		maleYellowHuman.anger();
		maleYellowHuman.happy();
		maleYellowHuman.laugh();
		maleYellowHuman.sex();
		feMaleYellowHuman.sex();
		

	}

}
