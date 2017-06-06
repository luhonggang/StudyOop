package com.study.abstractfactorymethod;

/**
 * 抽象类 依据Enum 创建一个人类出来
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 下午8:10:56
 * @since 1.0
 */
public abstract class AbstractHumanFactory implements HumanFatory{

	protected Human CreateHuman(HumanEnum humanEnum){
		
		Human human = null;
	     if(!humanEnum.getValue().equals("")){
	    	 try {
	 			human = (Human)Class.forName(humanEnum.getValue()).newInstance();
	 		} catch (Exception e) {
	              e.printStackTrace();
	              System.out.println("人类的类型有问题");
	 		}
	 		
	     }
	     return human;
	}
	
}
