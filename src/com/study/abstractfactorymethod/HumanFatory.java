package com.study.abstractfactorymethod;

/**
 *   �������ڿ�ʼ����
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����8:02:18
 * @since 1.0
 */
public interface HumanFatory {
 
	// ���������
	public Human createYellowHuman();
	
	//���������
	public Human createBlackHuman();
	
	//���������
	public Human createWhiteHuman();
}
