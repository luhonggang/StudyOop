package com.study.strategy;
/**
 *  设计模式之 策略模式 
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 下午4:26:50
 * @since 1.0
 * 执行者 来执行这些计划
 * 标准词描述: 锦囊妙计
 */
public class Strategy {

	public static void main(String[] args) {
	  
	  /**
	   * PlanForContent 调度具体的类的实例 来执行其具体的计划(方法)
	   * 特点:高内聚低耦合
	   *      可扩展性好 ,策略类可以继续增加下去,只要修改PlanForContent.java类即可
	   */
      PlanForContent content;
      content = new PlanForContent(new TheFirstPlan());
      content.operate();
      
      content = new PlanForContent(new TheSecondPlan());
      content.operate();
      
      content = new PlanForContent(new TheThirdPlan());
      content.operate();
      
	}

}
