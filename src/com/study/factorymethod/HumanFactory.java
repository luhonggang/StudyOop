package com.study.factorymethod;

/**
 *  火炉 造人  工厂类
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 下午7:23:34
 * @since 1.0
 */
public class HumanFactory {

	public static Human createMan(Class c){
		Human human = null; // 定义一个父类类型的人类
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("混蛋,你指定的人类找都找不到!");
		}catch (Exception e1) {
			e1.printStackTrace();
			System.out.println("定义的人类有问题,自己找出问题!");
		}
		
		return human;
	}
}
