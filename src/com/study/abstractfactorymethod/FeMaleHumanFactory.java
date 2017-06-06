package com.study.abstractfactorymethod;

/**
 *  Ů�� ��������  �������Ա�Ϊ Ů������
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����8:30:21
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
