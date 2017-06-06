package com.study.exception;

import com.mysql.jdbc.Driver;

/**
 * Java中异常捕获机制
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 上午10:02:28
 * @since 1.0
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
			String str = null;
			//int num = str.indexOf("s");   由NullPointerException 捕获
			
		    //int numStr = Integer.parseInt(str); // 由NumberFormatException捕获
		    Class<?> driver = Class.forName("com.mysql.driver");// 由Exception 捕获处理
		} catch (NullPointerException e) {
			/**
			 *  e.printStackTrace() 跟踪异常事件发生时执行的堆栈的情况
			 *  e.getMessage()      用来得到有关异常事件的信息
			 */
			e.printStackTrace();
			System.out.println(" output this Exception: "+e.getMessage());
		} catch (NumberFormatException e2){
			e2.printStackTrace();
			System.out.println(" output this Exception: "+e2.getMessage());
		} catch (Exception e3){
			e3.printStackTrace();
			System.out.println(" output this Exception : "+e3.getMessage());
		} finally{
			System.out.println("异常捕获机制说明: catch的捕获是由上至下的,所以不要把父类异常写在子类异常的上面,否则子类异常永远没有机会处理");
		}
	}
}
