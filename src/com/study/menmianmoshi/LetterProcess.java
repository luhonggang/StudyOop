package com.study.menmianmoshi;

/**
 * 定义一个写信的流程 接口
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 下午8:49:40
 * @since 1.0
 */
public interface LetterProcess {

	// 首先要写信的内容
	public void writeLetterContext(String context);
	
	// 其次要 写信封
	public void writeLetterFaces(String address);
	
	// 然后要将信放到信封中
	public void putLetterToFile();
	
	// 最后邮递
	public void sendLetter();
}
