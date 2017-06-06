package com.study.qiaoliangmoshi;

/**
 *  综合市场考察,我决定以市场为向导 来生产相应的产品
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午4:41:24
 * @since 1.0
 */
public class ZhongHeCompany {

	private Company company;
	
	public ZhongHeCompany(Company company){
		this.company = company;
	}
	
	// 开始生产了
	public void makeMoney(){
		this.company.makeMoney();
	}
}
