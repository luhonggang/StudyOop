package com.study.abstractfactorymethod;

/**
 * 枚举类 定义出所有的人类的性别和类型
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 下午8:03:28
 * @since 1.0
 * 
 */
public enum HumanEnum {

	// 把世界上所有人的类型 列出来
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
	
