package com.study.strategy;

/**
 *  执行计划的内容
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 下午4:37:43
 * @since 1.0
 * 该类就相当于 锦囊
 * 此时 类PlanForContent 依赖Plan类
 * 1.依赖关系: 由类A指向类B带箭头虚线表示  这里是 类PlanForContent 指向Plan类
 * 表现在代码层面，为类B作为参数被类A在某个method方法中使用
 * 这里 为类Plan作为参数被类PlanForContent在构造函数PlanForContent()中使用
 * 
 * 2.关联关系 : 表现在代码层面，为被关联类B以类的属性形式出现在关联类A中，也可能是关联类A引用了一个类型为被关联类B的全局变量。
 *           在UML类图设计中，关联关系用由关联类A指向被关联类B的带箭头实线表示，在关联的两端可以标注关联双方的角色和多重性标记。
 *   我的理解:关联关系 就是一种  强依赖关系
 */
public class PlanForContent {

	private Plan plan;// 被关联类Plan 以类PlanForContent的属性的形式出现在当前类中
	
	public PlanForContent(Plan plan){	
		this.plan = plan;
	}
	
	// 正式的使用计划了,执行 具体的计划内容
	public void operate(){
		this.plan.option();
	}
}
