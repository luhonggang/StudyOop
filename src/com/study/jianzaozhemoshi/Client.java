package com.study.jianzaozhemoshi;

import java.util.ArrayList;

/**
 *  ������ ģʽ
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����10:51:56
 * @since 1.0
 */
public class Client {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
        list.add("start");
        list.add("enginBoom");
        list.add("stop");
        list.add("alarm");
		CarModel bc = new BenzModel();
		bc.setSorts(list);
		bc.run();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		/**
		 * ������˳��,�Լ�ģ��,Ȼ��Ϳ��������Ӧ�ĳ�
		 */
		// ���run��˳��
		ArrayList<String> listSort = new ArrayList<String>();
		listSort.add("start");
		listSort.add("enginBoom");
		listSort.add("stop");
		listSort.add("alarm");
		
		// ģ�� >>> Ҫһ�����۳�
		CarBuilder benz = new BenzBuilder();
		
		// Ҫ�����run��˳��������� 
		benz.setSorts(listSort);
		// ��ʼ����˳���ģ�� �����������ģ�͵ĳ�����
		BenzModel benzModel = (BenzModel) benz.getCarModel();
		// ���۳���һ�¿���
		benzModel.run();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		/**
		 *  ��ʱ�� ���ǾͿ��԰�����Ӧ������ �����첻ͬƷ�Ƶĳ���
		 */
		Director director = new Director();
		// 1w��A���͵ı���
		for(int i=0;i<10000;i++){
			director.getABenzModel().run();
		}
	}
}
