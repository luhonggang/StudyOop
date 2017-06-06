package com.study.qiaoliangmoshi;

/**
 *  桥梁模式
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午4:26:22
 * @since 1.0
 */
public class Client {

	public static void main(String[] args) {
		
		Company c1 = new HouseCompany();
		c1.makeMoney();
		
		System.out.println("------------------------------------");
		
		Company c2 = new ClothesCompany();
		c2.makeMoney();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		/**
		 *  整合 市场需求 ,依据市场的需要让我旗下的公司来生产相应的产品出来
		 */
		// 比如 最近房地产市场好,那我就 大量新建房屋 出售
		ZhongHeCompany zhcfw = new ZhongHeCompany(new HouseCompany());
		zhcfw.makeMoney();
		
		// 可能最近 服装市场向阳,那我就生产服装销售
		ZhongHeCompany zhcfz = new ZhongHeCompany(new ClothesCompany());
		zhcfz.makeMoney();
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		HouseCorp house = new HouseCorp(new House());
		house.makeMoney();
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		ProductFactory factory = new ShaZhaiCrop(new IpdPhone());
		factory.makeMoney();
		
		
	}
}
