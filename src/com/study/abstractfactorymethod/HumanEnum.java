package com.study.abstractfactorymethod;

/**
 * ö���� ��������е�������Ա������
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����8:03:28
 * @since 1.0
 * 
 */
public enum HumanEnum {

	// �������������˵����� �г���
	YellowMaleHuman("com.study.abstractfactorymethod.YellowMaleHuman"),
	YellowFeMaleHuman("com.study.abstractfactorymethod.YellowFeMaleHuman"),
	
	BlackMaleHuman("com.study.abstractfactorymethod.BlackMaleHuman"),
	BlackFeMaleHuman("com.study.abstractfactorymethod.BlackFeMaleHuman"),
	
	WhiteMaleHuman("com.study.abstractfactorymethod.WhiteMaleHuman"),
	WhiteFeMaleHuman("com.study.abstractfactorymethod.WhiteFeMaleHuman");
	
	private String name = "";
	
	HumanEnum(String name){
		this.name = name;
	}
	
	public String getValue(){
		return this.name;
	}
	
}
	
