package com.study.qiaoliangmoshi;

/**
 *  公司
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午4:26:42
 * @since 1.0
 */
public abstract class Company {

	// 生产 
	protected abstract void product();
	
	// 销售
	protected abstract void sell();
	
	// 开始赚钱了
	public void makeMoney(){
		//怎么赚  先生产产品 后销售
		this.product();
		
		//销售
		this.sell();
	}
}
