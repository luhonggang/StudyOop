package com.study.mobanfangfamoshi;

/**
 *  模板方法模式
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 上午10:08:20
 * @since 1.0
 */
public class Client {

	public static void main(String[] args) {
		
		HanmanModel h1 = new HanmanH1Model();
		h1.run();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		HanmanModel h2 = new HanmanH2Model();
		h2.run();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		/**
		 *  响不响喇叭 ,完全是由客户决定的
		 */
		HanmanH1Model ha1 = new HanmanH1Model();
		ha1.setAlarm(true);
		ha1.run();  // 客户开车了
	}
}
