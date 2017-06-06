package com.study.minglingmoshi;

/**
 * 要求增加一个需求
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午7:35:19
 * @since 1.0
 */
public class AddRequirementCommand extends Command{

	@Override
	public void execute() {
		// 找到需求组
		super.rg.find();
		
		// 增加一个需求
		super.rg.add();
		
		/**
		 *  这里 增加一个需求后 ,可能页面也要增加 
		 *  这个时候 我们只需要扩展当前方法调用就可以了
		 */
		super.pg.add();
		
		/**
		 *  新增加需求后,页面也增加了,那么我们的代码编写(功能) 也可能增加了
		 */
		super.cg.add();
		
		//给出计划
		super.rg.paln();
		
	}

}
