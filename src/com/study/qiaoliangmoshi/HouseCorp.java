package com.study.qiaoliangmoshi;

/**
 *  �ҵķ��ز���˾ ���ǱȽ������,ֻ���� ����
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����5:08:54
 * @since 1.0
 */
public class HouseCorp extends ProductFactory{

	// ���崫��һ��house��Ʒ����
	public HouseCorp(House house) {
		super(house);
	}

	// ��High ��ʼ׬Ǯ��
	public void makeMoney(){
		super.makeMoney();
		System.out.println("���ز���Ǯ���Ǻ�High��");
	}
}
