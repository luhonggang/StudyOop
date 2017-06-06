package com.study.minglingmoshi;

/**
 * 接头人 负责接收客户的命令 并执行
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午7:43:52
 * @since 1.0
 */
public class Invoker {

	// 什么命令
	private Command command;
	
	//客户发出的命令
	public Invoker(Command command){
		this.command = command;
	}
	
	// 执行客户的命令
	public void execute(){
		this.command.execute();
	}
}
