package com.study.abstractfactorymethod;

/**
 *  女性 创建工厂  来创建性别为 女的人类
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 下午8:30:21
 * @since 1.0
 */
public class FeMaleHumanFactory extends AbstractHumanFactory{

	@Override
	public Human createYellowHuman() {
		return super.CreateHuman(HumanEnum.YellowFeMaleHuman);
	}

	@Override
	public Human createBlackHuman() {
		return super.CreateHuman(HumanEnum.BlackFeMaleHuman);
	}

	@Override
	public Human createWhiteHuman() {
		return super.CreateHuman(HumanEnum.WhiteFeMaleHuman);
	}

}
