package com.study.zhuangshimoshi;

/**
 * 我的成绩单   原始的成绩单 没有经过伪装 
 * @author LuHongGang
 * @date 2017年6月5日
 * @time 上午9:13:56
 * @since 1.0
 */
public class FourthScoreReport extends SchoolReport{

	@Override
	public void report() {
		System.out.println("我的成绩是:");
		System.out.println("语文:72 数学 80 英语 70 体育 50");
		System.out.println("                  家长姓名:               ");
		
	}

	public void sign(String name) {
		System.out.println(" 家长签名为:  "+name);
		
	}


}
