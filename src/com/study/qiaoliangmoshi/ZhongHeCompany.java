package com.study.qiaoliangmoshi;

/**
 *  �ۺ��г�����,�Ҿ������г�Ϊ�� ��������Ӧ�Ĳ�Ʒ
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����4:41:24
 * @since 1.0
 */
public class ZhongHeCompany {

	private Company company;
	
	public ZhongHeCompany(Company company){
		this.company = company;
	}
	
	// ��ʼ������
	public void makeMoney(){
		this.company.makeMoney();
	}
}
