package com.study.zhuangshimoshi;

/**
 *  美化类 
 *  Suger 意为 糖的意思 
 * @author LuHongGang
 * @date 2017年6月5日
 * @time 上午9:18:34
 * @since 1.0
 */
public class SugerFourthScoreReport extends FourthScoreReport{

	// 美化步骤: 1 首先报告这次 学校最高成绩
	private void reportHighScore(){
		System.out.println("我们学校这次最高成绩是: 语文 80 数学 80 英语 90 体育 60");
	}
	
	// 汇报一下 排名情况
	private void reportSort(){
		System.out.println("我的排名是 30名");
	}
	
	// 这时候 汇报的内容已经发生了变更 
	public void report(){
		this.reportHighScore();// 先汇报学校里最高成绩
		super.report();        // 然后给家长看我的成绩单
		this.reportSort();     // 最后给他看我的成绩排名
	}
}
