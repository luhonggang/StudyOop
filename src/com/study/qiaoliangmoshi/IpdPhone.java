package com.study.qiaoliangmoshi;

/**
 *  手机类 产品 IPD
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午4:59:02
 * @since 1.0
 */
public class IpdPhone extends Product{

	@Override
	public void beProducted() {
		System.out.println("生产出比苹果公司还要好的手机出来");
		
	}

	@Override
	public void beSelled() {
		System.out.println("利滚利,小小ipd出售赚钱就是如此之快");
		
	}

}
