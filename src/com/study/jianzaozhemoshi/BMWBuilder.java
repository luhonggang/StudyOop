package com.study.jianzaozhemoshi;

import java.util.ArrayList;

/**
 *  ����һ�� ��װ��˳��,�ṩ����һ�������͵�ģ��
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����2:36:07
 * @since 1.0
 */
public class BMWBuilder extends CarBuilder{

	private BMWModel bmw = new BMWModel();
	
	@Override
	public void setSorts(ArrayList<String> list) {
		this.bmw.setSorts(list);
		
	}

	@Override
	public CarModel getCarModel() {
		return this.bmw;
	}

}
