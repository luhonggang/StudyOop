package com.study.jianzaozhemoshi;

import java.util.ArrayList;
import java.util.List;

/**
 *  ����ģ�� ������
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����10:52:47
 * @since 1.0
 */
public abstract class CarModel {

	// ����������Ҫ��������˳��
	private List<String> sorts = new ArrayList<String>();
	
    protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	protected abstract void enginBoom();

	public final void run(){// ���಻���޸ĸ÷���,��������Ϊfinal����
		for(int i=0;i<sorts.size();i++){
			String sortsForOption = sorts.get(i);
			if("start".equalsIgnoreCase(sortsForOption)){
				// �ȷ�������
				this.start();
			}else if("enginBoom".equalsIgnoreCase(sortsForOption)){
				// ���濪ʼ����
				this.enginBoom();
			}else if("alarm".equalsIgnoreCase(sortsForOption)){
				// Ȼ��Ϳ�ʼ����,�ܵĹ����� ���ʵػ�����
			    this.alarm();
			}else if("stop".equalsIgnoreCase(sortsForOption)){
				// ������ ,��ЪϢһ��
				this.stop();
			}
		}
		
	}
	
	// ��Ҫ�����ݹ����Ĳ��� ���õ�����sorts������
	public final void setSorts(ArrayList<String> list){
		this.sorts = list;
	}
}
