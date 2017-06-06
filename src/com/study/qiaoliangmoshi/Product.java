package com.study.qiaoliangmoshi;

/**
 *  产品类   仅仅是生产和销售
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午4:53:56
 * @since 1.0
 */
public abstract class Product {

	// 生产 不管是什么产品
	public abstract void beProducted();
	
	// 既然生产出产品,那就必须卖出去才能挣钱
	public abstract void beSelled();
}
