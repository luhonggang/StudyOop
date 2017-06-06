package com.study.menmianmoshi;

/**
 * ����һ��д�ŵ����� �ӿ�
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����8:49:40
 * @since 1.0
 */
public interface LetterProcess {

	// ����Ҫд�ŵ�����
	public void writeLetterContext(String context);
	
	// ���Ҫ д�ŷ�
	public void writeLetterFaces(String address);
	
	// Ȼ��Ҫ���ŷŵ��ŷ���
	public void putLetterToFile();
	
	// ����ʵ�
	public void sendLetter();
}
