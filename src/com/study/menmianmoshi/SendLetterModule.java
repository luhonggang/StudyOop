package com.study.menmianmoshi;


/**
 * 门面类 封装 写信的具体实现的4个流程
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 上午8:57:56
 * @since 1.0
 */
public class SendLetterModule {

	private static LetterProcess letterProcess = new LetterProcessImpl();
	private static LetterPolice letterPolice = new LetterPolice();
	
	// 封装 写信 的流程
	public static void sendLetterProcess(String context,String address){
		// 帮你 写信
		letterProcess.writeLetterContext(context);
		// 帮你写信件的地址和联系人
		letterProcess.writeLetterFaces(address);
		// 警察检查信件的安全性
		letterPolice.checkLetter(letterProcess);
		// 帮你将信件放到信封里
		letterProcess.putLetterToFile();
		// 邮递信件
		letterProcess.sendLetter();
	}
}
