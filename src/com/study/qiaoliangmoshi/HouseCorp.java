package com.study.qiaoliangmoshi;

/**
 *  我的房地产公司 还是比较正规的,只建造 房屋
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午5:08:54
 * @since 1.0
 */
public class HouseCorp extends ProductFactory{

	// 定义传递一个house产品进来
	public HouseCorp(House house) {
		super(house);
	}

	// 很High 开始赚钱了
	public void makeMoney(){
		super.makeMoney();
		System.out.println("房地产挣钱还是很High的");
	}
}
