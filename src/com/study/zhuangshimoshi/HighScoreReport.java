package com.study.zhuangshimoshi;

/**
 * 家长要求 先看 学校每科最高的成绩
 * @author LuHongGang
 * @date 2017年6月5日
 * @time 上午9:52:51
 * @since 1.0
 */
public class HighScoreReport extends Decorator{

	public HighScoreReport(SchoolReport sr) {  // 依赖关系
		super(sr);
	}
	
	// 美化步骤: 1 首先报告这次 学校最高成绩
	public void reportHighScore(){
		System.out.println("我们学校这次最高成绩是: 语文 80 数学 80 英语 90 体育 60");
	}
	
	// 
	public void report(){
		this.reportHighScore();// 调用装饰类的装饰方法 reportHighScore()
		super.report();        // 调用具体子类实现report() 方法
	}
}
