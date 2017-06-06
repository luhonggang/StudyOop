package com.study.exception;

/**
 * Throw 关键词的 使用 
 *  throw关键词 :用于主动抛出一个异常
 *   当我们的方法出现错误的时候,但是我们又不予解决,而是通知调用方法(调用方)去解决
 *   这时候,我们就需要通过 throw的方式 抛出异常给外界   
 *   这就相当于是:谁调用谁解决
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 上午10:23:51
 * @since 1.0
 */

public class ExceptionDemo02 {

	public static void main(String[] args) {
		
		try {
			test(null);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println(" 空指针异常 ");
		}
		
		
	}
	
	// 方法 test 抛出的异常 我们给予 main方法来处理
	public static void test(String str){
		try {
			int num = str.lastIndexOf(" ");
		} catch (Exception e) {
			//e.printStackTrace();
			throw e;
		}
	}
}
