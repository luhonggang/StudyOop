package com.study.mobanfangfamoshi;

/**
 *  ģ�巽��ģʽ
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����10:08:20
 * @since 1.0
 */
public class Client {

	public static void main(String[] args) {
		
		HanmanModel h1 = new HanmanH1Model();
		h1.run();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		HanmanModel h2 = new HanmanH2Model();
		h2.run();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		/**
		 *  �첻������ ,��ȫ���ɿͻ�������
		 */
		HanmanH1Model ha1 = new HanmanH1Model();
		ha1.setAlarm(true);
		ha1.run();  // �ͻ�������
	}
}
