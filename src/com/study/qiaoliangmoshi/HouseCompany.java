package com.study.qiaoliangmoshi;

/**
 *  ���ز���˾  ��ô׬Ǯ��
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����4:29:52
 * @since 1.0
 */
public class HouseCompany extends Company{

	@Override
	protected void product() {
		System.out.println(" �ҵķ��ز���˾ ��Ȼ�� �޽��������͵ķ���");
		
	}

	@Override
	protected void sell() {
		System.out.println(" ��ʼ�����ҵķ�����");
		
	}
	
	// ׬Ǯ��ʼ
	public void makeMoney(){
		super.makeMoney();
		System.out.println("���ز���˾��ʼ׬Ǯ��");
	}

}
