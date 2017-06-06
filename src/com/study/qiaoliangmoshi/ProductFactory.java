package com.study.qiaoliangmoshi;

/**
 *  我现在有一个生产产品的工厂,不知道要生产什么样的产品
 *  反正只要赚钱 我就生产
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午5:01:30
 * @since 1.0
 */
public abstract class ProductFactory {

	private Product product;
	
	public ProductFactory(Product product){
		this.product = product;
	}
	
	// 目的还是为了 赚钱
	public void makeMoney(){
		// 每个 公司都是一样  先生产 
		this.product.beProducted();
		// 然后 出售
		this.product.beSelled();
	}
}
