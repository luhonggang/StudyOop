package com.study.qiaoliangmoshi;

/**
 *  房地产公司  怎么赚钱的
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午4:29:52
 * @since 1.0
 */
public class HouseCompany extends Company{

	@Override
	protected void product() {
		System.out.println(" 我的房地产公司 当然是 修建各种类型的房子");
		
	}

	@Override
	protected void sell() {
		System.out.println(" 开始销售我的房子了");
		
	}
	
	// 赚钱开始
	public void makeMoney(){
		super.makeMoney();
		System.out.println("房地产公司开始赚钱了");
	}

}
