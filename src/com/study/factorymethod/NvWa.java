package com.study.factorymethod;

/**
 * Ů� ��ʼ������
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����7:28:46
 * @since 1.0
 * ��������ģʽ
 */
public class NvWa {

	public static void main(String[] args) {
	
		// ������
		Human human= HumanFactory.createMan(YellowMan.class);
		human.laugh();
		human.anger();
		human.cry();
		human.happy();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// ����
		Human human1= HumanFactory.createMan(BlackMan.class);
		human1.laugh();
		human1.anger();
		human1.cry();
		human1.happy();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// ������
		Human human2= HumanFactory.createMan(WhiteMan.class);
		human2.laugh();
		human2.anger();
		human2.cry();
		human2.happy();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}

}
