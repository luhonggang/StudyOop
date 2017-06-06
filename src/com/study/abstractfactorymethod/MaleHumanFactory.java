package com.study.abstractfactorymethod;

/**
 *  男性工厂类 来创建 性别为 男的人类
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 下午8:27:12
 * @since 1.0
 */
public class MaleHumanFactory extends AbstractHumanFactory{

	@Override
	public Human createYellowHuman() {
		return super.CreateHuman(HumanEnum.YellowMaleHuman);
	}

	@Override
	public Human createBlackHuman() {
		return super.CreateHuman(HumanEnum.BlackMaleHuman);
	}

	@Override
	public Human createWhiteHuman() {
		return super.CreateHuman(HumanEnum.WhiteMaleHuman);
	}

}
