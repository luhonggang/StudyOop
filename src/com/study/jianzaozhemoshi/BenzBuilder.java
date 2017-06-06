package com.study.jianzaozhemoshi;

import java.util.ArrayList;

/**
 *  ���� ���͵� ģ�ͳ� 
 *  ��ֻҪ������һ����װ��˳��,�ҾͿ����ṩ����һ�����۳���ģ��
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����2:32:15
 * @since 1.0
 */
public class BenzBuilder extends CarBuilder{

	private BenzModel benz = new BenzModel();
	
	@Override
	public void setSorts(ArrayList<String> list) {
		this.benz.setSorts(list);
		
	}

	@Override
	public CarModel getCarModel() {
		return this.benz;
	}

}
