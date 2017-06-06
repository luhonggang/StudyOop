package com.study.qiaoliangmoshi;

/**
 *  ��������һ��������Ʒ�Ĺ���,��֪��Ҫ����ʲô���Ĳ�Ʒ
 *  ����ֻҪ׬Ǯ �Ҿ�����
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����5:01:30
 * @since 1.0
 */
public abstract class ProductFactory {

	private Product product;
	
	public ProductFactory(Product product){
		this.product = product;
	}
	
	// Ŀ�Ļ���Ϊ�� ׬Ǯ
	public void makeMoney(){
		// ÿ�� ��˾����һ��  ������ 
		this.product.beProducted();
		// Ȼ�� ����
		this.product.beSelled();
	}
}
