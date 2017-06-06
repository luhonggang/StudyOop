package com.study.abstractfactorymethod;

/**
 *  ���Թ����� ������ �Ա�Ϊ �е�����
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����8:27:12
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
