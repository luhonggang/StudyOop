package com.study.zhuangshimoshi;

/**
 * 装饰类 也可以说 是一个 中间类  
 * 由子类来实现  去扩展不同的功能 
 *  具体表现: 就是让子类来封装父类SchoolReport的子类 ,重写report()方法
 * @author LuHongGang
 * @date 2017年6月5日
 * @time 上午9:41:45
 * @since 1.0
 */
public abstract class Decorator extends SchoolReport{

	// 成绩单 肯定是有的
	private SchoolReport sr;
	
	// 传递成绩单过来
	public Decorator(SchoolReport sr){
		this.sr = sr;
	}
	
	/** 把我的成绩单给家长看 
	 *  这里 调用的是子类的具体实现   目的是:  >>> 可扩展   动态构造出多功能的实现
	 *  以防止 多种情况 发生
	 *  比如:家长可能首先要 看一下 学校的成绩最高分  然后 才看我的成绩
	 *       或者 家长 首先要看一下 我的排名情况   然后 才看我的成绩  等等
	 * **/
	public void report(){
		this.sr.report();
	}
	
	public void sign(String name){
		System.out.println(" 家长签名: "+name);
	}
}
