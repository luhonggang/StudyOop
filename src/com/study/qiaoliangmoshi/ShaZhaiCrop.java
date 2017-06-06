package com.study.qiaoliangmoshi;

/**
 *  山寨 还是要有的
 *  毕竟中国山寨还是强
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午5:12:38
 * @since 1.0
 */
public class ShaZhaiCrop extends ProductFactory{

	// 给我什么 产品 我就立马给你造出什么产品来
	public ShaZhaiCrop(Product product) {
		super(product);
	}

	// 毕竟生产了 还是拿出去卖卖钱,万一赚了呢
	public void makeMoney(){
	    super.makeMoney();	
	    System.out.println("山寨真好啊,赚钱容易");
	}
}
