package com.study.minglingmoshi;

/**
 *  项目分成三个组 ,每一组都要接受增删改 命令
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午7:17:58
 * @since 1.0
 */
public  abstract class Group {

	// 甲乙双方分开办公,你要和那个组讨论,你得首先找到这个组
	public abstract void find();
	
	// 被要求增加新功能
	public abstract void add();
	
	// 被要求删除功能
	public abstract void delete();
	
	// 被要求修改功能
	public abstract void change();
	
	// 被要求给出所有的变更计划
	public abstract void paln();
	
}
