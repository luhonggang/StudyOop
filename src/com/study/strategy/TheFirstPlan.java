package com.study.strategy;

/**
 *  计划一 实现Plan接口  执行第一个计划
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 下午4:32:15
 * @since 1.0
 * 该类是第一个妙计类 
 * 实现关系: 实现用一条带空心三角箭头的虚线表示，从类指向实现的接口。 
 */
public class TheFirstPlan implements Plan{

	@Override
	public void option() {
		System.out.println("执行第一个计划");
		
	}

}
