package com.study.qiaoliangmoshi;

/**
 *  ��˾
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����4:26:42
 * @since 1.0
 */
public abstract class Company {

	// ���� 
	protected abstract void product();
	
	// ����
	protected abstract void sell();
	
	// ��ʼ׬Ǯ��
	public void makeMoney(){
		//��ô׬  ��������Ʒ ������
		this.product();
		
		//����
		this.sell();
	}
}