package com.study.abstractfactorymethod;

/**
 *  女娲 造人    
 *   可以造出 性别不同的 人类出来 
 *   并且 无关创造什么样类型的人种出来  
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 下午8:31:17
 * @since 1.0
 * 抽象工厂方法模式
 */
public class NvWa {

	public static void main(String[] args) {
		
		// 男性生产线
		HumanFatory manFactory  = new MaleHumanFactory();
		
		// 女性生产线
		HumanFatory womanFactory = new FeMaleHumanFactory();
		
		// 开始产生人了
		Human maleYellowHuman = manFactory.createYellowHuman();
		
		Human feMaleYellowHuman = womanFactory.createYellowHuman();
		
		maleYellowHuman.cry();
		maleYellowHuman.anger();
		maleYellowHuman.happy();
		maleYellowHuman.laugh();
		maleYellowHuman.sex();
		feMaleYellowHuman.sex();
		

	}

}
