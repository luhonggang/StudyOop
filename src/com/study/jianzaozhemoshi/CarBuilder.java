package com.study.jianzaozhemoshi;

import java.util.ArrayList;

/**
 *  ���� һ����װ��˳��  Ȼ���ṩ���� ��Ӧ��ģ�ͳ���
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����2:27:46
 * @since 1.0
 */
public abstract class CarBuilder {

	// ����һ��ģ��,����һ����װ��˳��
	public abstract void setSorts(ArrayList<String> list);
	
	// ������˳���,�����ṩ���ģ��
	public abstract CarModel getCarModel();
	
	
}
