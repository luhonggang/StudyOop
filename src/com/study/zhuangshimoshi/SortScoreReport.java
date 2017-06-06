package com.study.zhuangshimoshi;

/**
 * 家长要求  想知道  我的排名情况
 * @author LuHongGang
 * @date 2017年6月5日
 * @time 上午9:56:45
 * @since 1.0
 */
public class SortScoreReport extends Decorator{

	public SortScoreReport(SchoolReport sr) {
		super(sr);
	}
	
	// 汇报一下 排名情况
	private void reportSort(){
		System.out.println("我的排名是 30名");
	}
	
	// 家长 看完成绩单后 告诉他 ,加强作用
	public void report(){
		super.report();
		this.reportSort();
	}
	
}
