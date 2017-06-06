package com.study.menmianmoshi;

/**
 *  写信的具体实现流程   接口实现类
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 下午8:53:37
 * @since 1.0
 */
public class LetterProcessImpl implements LetterProcess{

	@Override
	public void writeLetterContext(String context) {
		System.out.println(" 填写信的内容 ......:"+ context);
		
	}

	@Override
	public void writeLetterFaces(String address) {
		System.out.println(" 填写信封上收件人和地址......:"+address);
		
	}

	@Override
	public void putLetterToFile() {
		System.out.println(" 将信放到信封中......");
		
	}

	@Override
	public void sendLetter() {
		System.out.println(" 邮递信件......");
		
	}

}
