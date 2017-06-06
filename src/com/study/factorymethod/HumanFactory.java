package com.study.factorymethod;

/**
 *  ��¯ ����  ������
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����7:23:34
 * @since 1.0
 */
public class HumanFactory {

	public static Human createMan(Class c){
		Human human = null; // ����һ���������͵�����
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("�쵰,��ָ���������Ҷ��Ҳ���!");
		}catch (Exception e1) {
			e1.printStackTrace();
			System.out.println("���������������,�Լ��ҳ�����!");
		}
		
		return human;
	}
}
