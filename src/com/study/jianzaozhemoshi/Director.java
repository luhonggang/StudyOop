package com.study.jianzaozhemoshi;

import java.util.ArrayList;

/**
 *  ������
 *  ��(start,stop,enginBoom,alarm)���ĸ����̽��з�װ
 *  ��Ϊ��4�����̰���������Ͽ�����ϳ������
 *  ���Ե�ǰ�� ʵ���Ͼ����� �����⼸����������ϵ� 
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����3:35:54
 * @since 1.0
 */
public class Director {
	private ArrayList<String> sort = new ArrayList<String>();
	
	private BenzBuilder benz = new BenzBuilder();
	
	private BMWBuilder bmw = new BMWBuilder();
	
	// A���ͺ� �ı��۳������� ��4��run()��˳��
	public BenzModel getABenzModel(){
		this.sort.clear();  // ���  һ��Ҫ clear ��ֹ���ݻ���
		this.sort.add("start");
		this.sort.add("stop");
		this.sort.add("enginBoom");
		this.sort.add("alarm");
		this.benz.setSorts(this.sort);
		return (BenzModel) this.benz.getCarModel();
	}
	
	// B���ͺŵ� ���۳������µ� 2��run()��˳��
	public BenzModel getBBenzModel(){
		this.sort.clear();
		this.sort.add("start");
		this.sort.add("alarm");
		this.benz.setSorts(this.sort);
		return (BenzModel) this.benz.getCarModel();
		
	}
	
	// A���ͺ� �ı��������� ��4��run()��˳��
	public BMWModel getABMWModel(){
		this.sort.clear();  // ���
		this.sort.add("start");
		this.sort.add("stop");
		this.sort.add("enginBoom");
		this.sort.add("alarm");
		this.bmw.setSorts(this.sort);
		return (BMWModel) this.bmw.getCarModel();
	}
	
	// B���ͺŵ� ���������µ� 2��run()��˳��
	public BMWModel getBBMWModel(){
		this.sort.clear();
		this.sort.add("start");
		this.sort.add("alarm");
		this.bmw.setSorts(this.sort);
		return (BMWModel) this.bmw.getCarModel();
			
		}

}
