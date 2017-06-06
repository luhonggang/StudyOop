package com.study.abstractfactorymethod;

/**
 *   工厂现在开始造人
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 下午8:02:18
 * @since 1.0
 */
public interface HumanFatory {
 
	// 制造黄种人
	public Human createYellowHuman();
	
	//制造黑种人
	public Human createBlackHuman();
	
	//制造白种人
	public Human createWhiteHuman();
}
