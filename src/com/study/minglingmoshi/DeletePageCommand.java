package com.study.minglingmoshi;

/**
 * 删除一个页面的命令
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午7:41:59
 * @since 1.0
 */
public class DeletePageCommand  extends Command{

	@Override
	public void execute() {
		// 找到美工组
		super.pg.find();
		
		// 删除一个页面
		super.pg.delete();
		
		/**
		 *  可能页面也要删除
		 *  这个时候 我们只需要扩展当前方法调用就可以了
		 */
		super.pg.delete();
		
		/**
		 *  这里删除一个命令,可能功能也要 删除
		 */
		super.cg.delete();
		
		//执行 给出计划
		super.pg.paln();
	}

}
