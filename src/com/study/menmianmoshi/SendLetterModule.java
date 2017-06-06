package com.study.menmianmoshi;


/**
 * ������ ��װ д�ŵľ���ʵ�ֵ�4������
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����8:57:56
 * @since 1.0
 */
public class SendLetterModule {

	private static LetterProcess letterProcess = new LetterProcessImpl();
	private static LetterPolice letterPolice = new LetterPolice();
	
	// ��װ д�� ������
	public static void sendLetterProcess(String context,String address){
		// ���� д��
		letterProcess.writeLetterContext(context);
		// ����д�ż��ĵ�ַ����ϵ��
		letterProcess.writeLetterFaces(address);
		// �������ż��İ�ȫ��
		letterPolice.checkLetter(letterProcess);
		// ���㽫�ż��ŵ��ŷ���
		letterProcess.putLetterToFile();
		// �ʵ��ż�
		letterProcess.sendLetter();
	}
}
