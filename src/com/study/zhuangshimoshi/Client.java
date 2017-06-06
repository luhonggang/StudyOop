package com.study.zhuangshimoshi;

/**
 * 装饰模式
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午7:55:54
 * @since 1.0
 */
public class Client {

	public static void main(String[] args) {
		
		// 原始的成绩单 拿出来 
		SchoolReport sr = new FourthScoreReport();
		
		// 先看学校每科最高成绩
		HighScoreReport hsr = new HighScoreReport(sr);
		
		hsr.report();
		hsr.sign("老三");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// 加上我的排名情况给家长看
		SortScoreReport ssr = new SortScoreReport(sr);
		
		ssr.report();
		ssr.sign("老三");
		
		
	}
}
