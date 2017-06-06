package com.study.menmianmoshi;

/**
 *  门面模式 
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 下午8:48:22
 * @since 1.0
 */
public class Client {

	public static void main(String[] args) {
		/**
		 *  说明:方法者调用该写信过程的方法 必须要知道 这4个流程 ,容易出现问题
		 *  这时候 需要有一个 类来将 这4个流程进行封装 
		 *  Client 调用的时候 直接调用 封装类就可以了 
		 */
		LetterProcessImpl letter = new LetterProcessImpl();
		letter.writeLetterContext("我是你老相好,你忘了?");
		letter.writeLetterFaces("小明   湖北省恩施市的");
		letter.putLetterToFile();
		letter.sendLetter();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		/**
		 * 经过 SendLetterModule类封装后 ,只需要直接调用 该类的sendLetter()方法 就可以
		 */
		//SendLetterModule sendLetter = new SendLetterModule();
		String context = "Happy Liao,welcome to shanghai";
		String address = "shangshishi pudongxinquzhangyanglu2242nong";
		SendLetterModule.sendLetterProcess(context, address);
		
		
		
	}
}
