package com.study.zhuangshimoshi;

/**
 *  父类 抽象 成绩
 * @author LuHongGang
 * @date 2017年6月5日
 * @time 上午9:11:58
 * @since 1.0
 */
public abstract class SchoolReport {

	public abstract void report();// 学生报告成绩给家长
	
	public abstract void sign(String name);// 家长签名
}
