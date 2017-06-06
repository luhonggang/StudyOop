package com.study.abstractfactorymethod;

/**
 * ������ ����Enum ����һ���������
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����8:10:56
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
	              System.out.println("���������������");
	 		}
	 		
	     }
	     return human;
	}
	
}
