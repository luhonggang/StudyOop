package com.study.qiaoliangmoshi;

/**
 *  �ҵķ�װ�� 
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����4:33:57
 * @since 1.0
 */
public class ClothesCompany extends Company{

	// ����
	@Override
	protected void product() {
		System.out.println(" ����������������װ  ");
		
	}

	// ����
	@Override
	protected void sell() {
		System.out.println("�߸����˵����������ķ�װ");
		
	}
	
	// ��ʼ׬Ǯ��
	public void makeMoney(){
		super.makeMoney();
		System.out.println("��װ��׬Ǯ����ͦ���׵�");
	}

}
