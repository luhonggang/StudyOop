package com.study.minglingmoshi;

/**
 * Ҫ������һ������
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����7:35:19
 * @since 1.0
 */
public class AddRequirementCommand extends Command{

	@Override
	public void execute() {
		// �ҵ�������
		super.rg.find();
		
		// ����һ������
		super.rg.add();
		
		/**
		 *  ���� ����һ������� ,����ҳ��ҲҪ���� 
		 *  ���ʱ�� ����ֻ��Ҫ��չ��ǰ�������þͿ�����
		 */
		super.pg.add();
		
		/**
		 *  �����������,ҳ��Ҳ������,��ô���ǵĴ����д(����) Ҳ����������
		 */
		super.cg.add();
		
		//�����ƻ�
		super.rg.paln();
		
	}

}
