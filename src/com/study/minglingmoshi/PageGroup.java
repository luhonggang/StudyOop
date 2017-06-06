package com.study.minglingmoshi;

/**
 * 美工组 负责设计页面展现
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午7:26:23
 * @since 1.0
 */
public class PageGroup extends Group{

	@Override
	public void find() {
		System.out.println("客户找到美工组");
		
	}

	@Override
	public void add() {
		System.out.println("客户要求增加一个页面");
		
	}

	@Override
	public void delete() {
		System.out.println("客户要求删除一个页面");
		
	}

	@Override
	public void change() {
		System.out.println("客户要求修改一个页面");
		
	}

	@Override
	public void paln() {
		System.out.println("客户要求变更页面计划");
		
	}

}
