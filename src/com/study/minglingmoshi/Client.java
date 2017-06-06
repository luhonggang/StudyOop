package com.study.minglingmoshi;

/**
 *  命令模式
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午7:17:23
 * @since 1.0
 */
public class Client {

	public static void main(String[] args) {
		
		// 接头人 这里的客户要求是: 添加一个 新的需求
		Invoker invoker = new Invoker(new AddRequirementCommand());//定义一个接头人
		
		// 接头人 接收到客户 要添加一个新需求的命令   随后就来执行命令
		invoker.execute();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// 接头人接收到客户的删除一个页面的命令
		Invoker invoker2 = new Invoker(new DeletePageCommand());
		
		invoker2.execute();
		
	}
}
