package com.study.menmianmoshi;

/**
 *  ����ģʽ 
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����8:48:22
 * @since 1.0
 */
public class Client {

	public static void main(String[] args) {
		/**
		 *  ˵��:�����ߵ��ø�д�Ź��̵ķ��� ����Ҫ֪�� ��4������ ,���׳�������
		 *  ��ʱ�� ��Ҫ��һ�� ������ ��4�����̽��з�װ 
		 *  Client ���õ�ʱ�� ֱ�ӵ��� ��װ��Ϳ����� 
		 */
		LetterProcessImpl letter = new LetterProcessImpl();
		letter.writeLetterContext("�����������,������?");
		letter.writeLetterFaces("С��   ����ʡ��ʩ�е�");
		letter.putLetterToFile();
		letter.sendLetter();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		/**
		 * ���� SendLetterModule���װ�� ,ֻ��Ҫֱ�ӵ��� �����sendLetter()���� �Ϳ���
		 */
		//SendLetterModule sendLetter = new SendLetterModule();
		String context = "Happy Liao,welcome to shanghai";
		String address = "shangshishi pudongxinquzhangyanglu2242nong";
		SendLetterModule.sendLetterProcess(context, address);
		
		
		
	}
}
