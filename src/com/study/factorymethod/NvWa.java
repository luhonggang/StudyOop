package com.study.factorymethod;

/**
 * 女娲 开始造人了
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 下午7:28:46
 * @since 1.0
 * 工厂方法模式
 */
public class NvWa {

	public static void main(String[] args) {
	
		// 黄种人
		Human human= HumanFactory.createMan(YellowMan.class);
		human.laugh();
		human.anger();
		human.cry();
		human.happy();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// 黑人
		Human human1= HumanFactory.createMan(BlackMan.class);
		human1.laugh();
		human1.anger();
		human1.cry();
		human1.happy();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// 白种人
		Human human2= HumanFactory.createMan(WhiteMan.class);
		human2.laugh();
		human2.anger();
		human2.cry();
		human2.happy();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}

}
