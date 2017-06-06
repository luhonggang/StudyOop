package com.study.minglingmoshi;

/**
 * ��ͷ�� ������տͻ������� ��ִ��
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����7:43:52
 * @since 1.0
 */
public class Invoker {

	// ʲô����
	private Command command;
	
	//�ͻ�����������
	public Invoker(Command command){
		this.command = command;
	}
	
	// ִ�пͻ�������
	public void execute(){
		this.command.execute();
	}
}
