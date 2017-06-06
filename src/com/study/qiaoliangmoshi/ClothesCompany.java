package com.study.qiaoliangmoshi;

/**
 *  我的服装厂 
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午4:33:57
 * @since 1.0
 */
public class ClothesCompany extends Company{

	// 生产
	@Override
	protected void product() {
		System.out.println(" 安安静静的生产服装  ");
		
	}

	// 销售
	@Override
	protected void sell() {
		System.out.println("高高兴兴的卖出生产的服装");
		
	}
	
	// 开始赚钱了
	public void makeMoney(){
		super.makeMoney();
		System.out.println("服装厂赚钱还是挺容易的");
	}

}
