package com.study.menmianmoshi;

/**
 *  д�ŵľ���ʵ������   �ӿ�ʵ����
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����8:53:37
 * @since 1.0
 */
public class LetterProcessImpl implements LetterProcess{

	@Override
	public void writeLetterContext(String context) {
		System.out.println(" ��д�ŵ����� ......:"+ context);
		
	}

	@Override
	public void writeLetterFaces(String address) {
		System.out.println(" ��д�ŷ����ռ��˺͵�ַ......:"+address);
		
	}

	@Override
	public void putLetterToFile() {
		System.out.println(" ���ŷŵ��ŷ���......");
		
	}

	@Override
	public void sendLetter() {
		System.out.println(" �ʵ��ż�......");
		
	}

}
