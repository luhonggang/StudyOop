package com.study.singleton;

/**
 * 皇帝类  单例类
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 下午6:59:44
 * @since 1.0
 */
public class Emperor {
	private static Emperor emperor = null;
	
	private Emperor(){
		// 不能供外部类来进行实例化 ,只能自己实例化
	}
	
	public static Emperor getInstance(){
		
		if(emperor == null){// 若没有初始化 就初始化 一个
			emperor = new Emperor();
		}
		return emperor;
	}
	
	public static void emperorMsg(){
		System.out.println("仅仅是一个单例");
	}
}
