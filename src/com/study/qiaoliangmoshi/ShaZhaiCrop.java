package com.study.qiaoliangmoshi;

/**
 *  ɽկ ����Ҫ�е�
 *  �Ͼ��й�ɽկ����ǿ
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����5:12:38
 * @since 1.0
 */
public class ShaZhaiCrop extends ProductFactory{

	// ����ʲô ��Ʒ �Ҿ�����������ʲô��Ʒ��
	public ShaZhaiCrop(Product product) {
		super(product);
	}

	// �Ͼ������� �����ó�ȥ����Ǯ,��һ׬����
	public void makeMoney(){
	    super.makeMoney();	
	    System.out.println("ɽկ��ð�,׬Ǯ����");
	}
}
