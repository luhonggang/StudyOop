package com.study.minglingmoshi;

/**
 * ɾ��һ��ҳ�������
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����7:41:59
 * @since 1.0
 */
public class DeletePageCommand  extends Command{

	@Override
	public void execute() {
		// �ҵ�������
		super.pg.find();
		
		// ɾ��һ��ҳ��
		super.pg.delete();
		
		/**
		 *  ����ҳ��ҲҪɾ��
		 *  ���ʱ�� ����ֻ��Ҫ��չ��ǰ�������þͿ�����
		 */
		super.pg.delete();
		
		/**
		 *  ����ɾ��һ������,���ܹ���ҲҪ ɾ��
		 */
		super.cg.delete();
		
		//ִ�� �����ƻ�
		super.pg.paln();
	}

}
