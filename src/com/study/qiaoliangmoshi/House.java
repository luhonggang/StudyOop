package com.study.qiaoliangmoshi;

/**
 *  房子类 产品
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午4:56:40
 * @since 1.0
 */
public class House extends Product {

	@Override
	public void beProducted() {
		System.out.println("好好的修建出高质量房屋");
		
	}

	@Override
	public void beSelled() {
		System.out.println("开始出售高质量的房屋,赚得赚得好高兴");
		
	}

}
