package com.study.minglingmoshi;

/**
 *  抽象类
 *  承接客户发给我们命令,定义三个工作组的成员变量,由子类使用
 *  定义一个抽象方法 execute,由子类来实现
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午7:30:11
 * @since 1.0
 */
public abstract class Command {

	protected RequirementGroup rg = new RequirementGroup();// 需求组
	
	protected CodeGroup cg = new CodeGroup();// 代码组
	
	protected PageGroup pg = new PageGroup();// 美工组
	
	
	//客户要求各个组 需要做什么事情
	public abstract void execute();
}
