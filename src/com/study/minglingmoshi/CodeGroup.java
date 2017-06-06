package com.study.minglingmoshi;

/**
 * 代码组 负责编码
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午7:21:39
 * @since 1.0
 */
public class CodeGroup extends Group{

	@Override
	public void find() {
		System.out.println("找到代码组");
		
	}

	@Override
	public void add() {
		System.out.println("客户要求增加一个新功能");
		
	}

	@Override
	public void delete() {
		System.out.println("客户要求删除一个功能");
		
	}

	@Override
	public void change() {
		System.out.println("客户要求修改一个功能");
		
	}

	@Override
	public void paln() {
		System.out.println("客户要求给出代码完成计划");
		
	}

}
