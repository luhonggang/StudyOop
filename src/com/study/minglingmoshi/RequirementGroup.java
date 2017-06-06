package com.study.minglingmoshi;

/**
 * 需求组是和客户来讨论需求的
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午7:24:07
 * @since 1.0
 */
public class RequirementGroup  extends Group{

	@Override
	public void find() {
		System.out.println("客户找到需求组");
		
	}

	@Override
	public void add() {
		System.out.println("客户要求添加一个新的需求");
		
	}

	@Override
	public void delete() {
		System.out.println("客户要求删除一个需求");
		
	}

	@Override
	public void change() {
		System.out.println("客户要求修改一项需求");
		
	}

	@Override
	public void paln() {
		System.out.println("客户要求变更需求计划");
		
	}

	
}
